package mi;

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
import b8.hf;
import b8.mf;
import b8.ne;
import ci.v6;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class t3 extends l41 {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public b G3;
    public boolean H3;
    public boolean I3;
    public boolean J3;
    public boolean K3;
    public TL_iv.pageTableCell L3;
    public TL_iv.pageTableCell M3;
    public long N3;
    public float O3;
    public float P3;
    public boolean Q3;
    public g2 R3;
    public int S3;
    public h1 T3;
    public final i U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public a a4;
    public boolean b4;
    public final l3 c4;
    public final r2 d4;
    public final m3 e4;
    public final n3 f4;
    public final o3 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public a j4;
    public a k4;
    public final p3 l4;
    public final z2 m4;
    public final int n3;
    public final a3 n4;
    public final org.telegram.ui.ActionBar.e6 o3;
    public final b3 o4;
    public final r3 p3;
    public final c3 p4;
    public zi q3;
    public n5 q4;
    public boolean r3;
    public f60 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final s2 u4;
    public final h3 v3;
    public final d3 v4;
    public final t9 w3;
    public final gi.w5 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public dk0 y4;
    public int z3;
    public int z4;

    public t3(Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, r3 r3Var) {
        super(context, i3, 0, false, new gi.q4(r1, 28), new l5.b(r1, 9), null, e6Var);
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        this.U3 = new i(this, 2);
        this.Z3 = true;
        this.c4 = new l3(this);
        this.d4 = new r2(this);
        this.e4 = new m3(this);
        this.f4 = new n3(this);
        this.g4 = new o3(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new p3(this);
        this.m4 = new z2(this);
        this.n4 = new a3(this);
        this.o4 = new b3(this);
        this.p4 = new c3(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new s2(this);
        this.v4 = new d3(this);
        gi.w5 w5Var = new gi.w5(this, 16);
        this.w4 = w5Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        t3[] t3VarArr = {this};
        this.n3 = i3;
        this.o3 = e6Var;
        this.p3 = r3Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        E1(new gi.q4(this, 29), false);
        setReorderLongPressEnabled(false);
        z1(true);
        h3 h3Var = new h3(this, r3Var);
        this.v3 = h3Var;
        h3Var.S(this);
        h3Var.z0 = this.f3;
        t9 n4 = h3Var.n(context);
        this.w3 = n4;
        org.telegram.messenger.g0.E2(n4);
        h3Var.D = new j3(this, r3Var);
        j(new ai.i4(2, this, r3Var));
        this.R3 = new g2(w5Var);
    }

    public static boolean A3(a aVar) {
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || H3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !b6.z(pageBlock).isEmpty()) ? false : true;
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
    public static void L1(t3[] t3VarArr, ArrayList arrayList, f41 f41Var) {
        int i3;
        boolean z10;
        ArrayList arrayList2;
        int i10;
        boolean z11;
        int i11;
        t3 t3Var = t3VarArr[0];
        if (t3Var != null) {
            ArrayList arrayList3 = t3Var.t3;
            t3Var.d2();
            ArrayList arrayList4 = t3Var.x4;
            arrayList4.clear();
            HashMap hashMap = new HashMap();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i3 = 1;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(i12);
                boolean z12 = aVar.i;
                ArrayList arrayList5 = aVar.k;
                if (!z12) {
                    for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i14), 1, new v2());
                    }
                    if (aVar.b instanceof TL_iv.pageBlockParagraph) {
                        i13++;
                    }
                }
                i12++;
            }
            boolean z13 = i13 == 1;
            ArrayList arrayList6 = new ArrayList();
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            int i18 = -1;
            a aVar2 = null;
            while (i16 < arrayList3.size()) {
                a aVar3 = (a) arrayList3.get(i16);
                boolean z14 = aVar3.i;
                ArrayList arrayList7 = aVar3.k;
                if (z14) {
                    int i19 = i18 != i15 ? i3 : 0;
                    if (!arrayList6.isEmpty()) {
                        a1.g.y(i3, arrayList6);
                    }
                    if (i18 == i15 || arrayList6.size() >= i18) {
                        if (i19 == 0) {
                            if (i17 != 0) {
                                f41Var.L();
                                i17 = 0;
                            }
                            int i20 = t0.b;
                            r31 K = r31.K(t0.class);
                            K.G = aVar3;
                            arrayList.add(K);
                            arrayList4.add(aVar3);
                        }
                        z10 = z13;
                        arrayList2 = arrayList6;
                        i10 = i3;
                    } else {
                        z10 = z13;
                        arrayList2 = arrayList6;
                        i10 = i3;
                        i18 = i15;
                    }
                } else {
                    int i21 = i18 != i15 ? i3 : 0;
                    if (A3(aVar3)) {
                        if (i21 == 0) {
                            boolean z15 = ((TL_iv.pageBlockDetails) aVar3.b).open;
                            if (!arrayList6.isEmpty() || z15) {
                                if (i17 != 0) {
                                    f41Var.L();
                                    i17 = 0;
                                }
                            } else if (i17 == 0) {
                                f41Var.M();
                                i17 = i3;
                            }
                            c3 c3Var = t3Var.p4;
                            int i22 = r0.b;
                            r31 K2 = r31.K(r0.class);
                            K2.G = aVar3;
                            K2.H = c3Var;
                            arrayList.add(K2);
                            arrayList4.add(aVar3);
                            if (!z15) {
                                i18 = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(aVar3);
                    } else if (i21 == 0) {
                        if (aVar2 != null) {
                            ArrayList arrayList8 = aVar2.k;
                            int size = arrayList8.size();
                            int i23 = 0;
                            while (true) {
                                z10 = z13;
                                if (i23 >= size || i23 >= arrayList7.size()) {
                                    break;
                                }
                                arrayList2 = arrayList6;
                                if (!((Long) arrayList8.get(i23)).equals(arrayList7.get(i23))) {
                                    break;
                                }
                                i23++;
                                z13 = z10;
                                arrayList6 = arrayList2;
                            }
                            int i24 = size - 1;
                            while (i24 >= i23) {
                                Long l10 = (Long) arrayList8.get(i24);
                                l10.getClass();
                                Integer num = (Integer) hashMap.get(l10);
                                if (num != null) {
                                    i11 = i23;
                                    if (num.intValue() >= 2 || i24 > 0 || t3Var.u3.containsKey(l10)) {
                                    }
                                } else {
                                    i11 = i23;
                                }
                                i24--;
                                i23 = i11;
                            }
                        } else {
                            z10 = z13;
                            arrayList2 = arrayList6;
                        }
                        if (aVar2 != null) {
                            t3Var.v3(aVar2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (i17 == 0) {
                                f41Var.M();
                                i17 = 1;
                            }
                        } else if (i17 != 0) {
                            f41Var.L();
                            i17 = 0;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            r2 r2Var = t3Var.d4;
                            int i25 = v0.b;
                            r31 K3 = r31.K(v0.class);
                            K3.G = aVar3;
                            K3.H = r2Var;
                            arrayList.add(K3);
                        } else if (G3(pageBlock)) {
                            m3 m3Var = t3Var.e4;
                            int i26 = s4.b;
                            r31 K4 = r31.K(s4.class);
                            K4.d = (int) aVar3.a;
                            K4.G = aVar3;
                            K4.H = m3Var;
                            arrayList.add(K4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                n3 n3Var = t3Var.f4;
                                int i27 = w.b;
                                r31 K5 = r31.K(w.class);
                                K5.G = aVar3;
                                K5.H = n3Var;
                                arrayList.add(K5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                o3 o3Var = t3Var.g4;
                                int i28 = x0.b;
                                r31 K6 = r31.K(x0.class);
                                K6.G = aVar3;
                                K6.H = o3Var;
                                arrayList.add(K6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                p3 p3Var = t3Var.l4;
                                int i29 = m4.b;
                                r31 K7 = r31.K(m4.class);
                                K7.G = aVar3;
                                K7.H = p3Var;
                                arrayList.add(K7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                z2 z2Var = t3Var.m4;
                                int i30 = o4.b;
                                r31 K8 = r31.K(o4.class);
                                K8.G = aVar3;
                                K8.H = z2Var;
                                arrayList.add(K8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                b3 b3Var = t3Var.o4;
                                int i31 = l5.b;
                                r31 K9 = r31.K(l5.class);
                                K9.G = aVar3;
                                K9.H = b3Var;
                                arrayList.add(K9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                l3 l3Var = t3Var.c4;
                                int i32 = e0.b;
                                r31 K10 = r31.K(e0.class);
                                K10.G = aVar3;
                                K10.H = l3Var;
                                arrayList.add(K10);
                            } else {
                                aVar3.p = i16 == 0;
                                aVar3.q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2) {
                                    i10 = 1;
                                    if (i16 == 1 && (aVar3.b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                        z11 = true;
                                        d3 d3Var = t3Var.v4;
                                        int i33 = z5.b;
                                        r31 K11 = r31.K(z5.class);
                                        K11.G = aVar3;
                                        K11.H = d3Var;
                                        K11.r = z11;
                                        arrayList.add(K11);
                                        arrayList4.add(aVar3);
                                        aVar2 = aVar3;
                                    }
                                } else {
                                    i10 = 1;
                                }
                                z11 = false;
                                d3 d3Var2 = t3Var.v4;
                                int i332 = z5.b;
                                r31 K112 = r31.K(z5.class);
                                K112.G = aVar3;
                                K112.H = d3Var2;
                                K112.r = z11;
                                arrayList.add(K112);
                                arrayList4.add(aVar3);
                                aVar2 = aVar3;
                            }
                        }
                        i10 = 1;
                        arrayList4.add(aVar3);
                        aVar2 = aVar3;
                    }
                    z10 = z13;
                    arrayList2 = arrayList6;
                    i10 = i3;
                }
                i16++;
                i3 = i10;
                z13 = z10;
                arrayList6 = arrayList2;
                i15 = -1;
            }
            int i34 = i3;
            if (i17 != 0) {
                f41Var.L();
            }
            if (aVar2 != null) {
                t3Var.v3(aVar2, A4, hashMap, arrayList);
            }
            int i35 = 0;
            while (i35 < arrayList4.size()) {
                a aVar4 = (a) arrayList4.get(i35);
                aVar4.n = false;
                aVar4.o = false;
                aVar4.l = 0;
                aVar4.m = 0;
                int size2 = aVar4.k.size();
                if (size2 != 0) {
                    a aVar5 = i35 > 0 ? (a) arrayList4.get(i35 - 1) : null;
                    int i36 = i35 + 1;
                    a aVar6 = i36 < arrayList4.size() ? (a) arrayList4.get(i36) : null;
                    aVar4.l = size2 - o4(aVar4, aVar5);
                    int o42 = size2 - o4(aVar4, aVar6);
                    aVar4.m = o42;
                    aVar4.n = aVar4.l > 0 ? i34 : 0;
                    aVar4.o = o42 > 0 ? i34 : 0;
                }
                i35++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M2(ArrayList arrayList, a aVar) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            s sVar = aVar.g;
            if (sVar == null || !sVar.b()) {
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
            s sVar2 = aVar.g;
            if (sVar2 == null || !sVar2.b()) {
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
            for (int i3 = 0; j32 != null && i3 < j32.size() && i3 < T3.size(); i3++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) j32.get(i3);
                if (((s) T3.get(i3)).b()) {
                    if ((pageBlock4 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock4).photo_id : pageBlock4 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock4).video_id : 0L) != 0) {
                        k0.d(pageBlock4);
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
            k0.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        TL_iv.PageBlock pageBlock5 = aVar.b;
        if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
            s sVar3 = aVar.g;
            if (sVar3 == null || !sVar3.b()) {
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
            s sVar4 = aVar.g;
            if (sVar4 != null && (document = sVar4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.id;
            }
            if (sVar4 == null || !sVar4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = aVar.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                k0.d(pageBlock7);
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
            int i10 = n4.N;
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
            for (int i11 = 0; i11 < pageblocktable.rows.size(); i11++) {
                TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i11);
                if (pagetablerow.cells != null) {
                    for (int i12 = 0; i12 < pagetablerow.cells.size(); i12++) {
                        TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i12);
                        if (pagetablecell.text == null) {
                            f6.c(pagetablecell, "");
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

    public static boolean N2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static void O1(t3 t3Var, int i3, int i10, int i11) {
        if (i3 < 0) {
            return;
        }
        KeyEvent.Callback m10 = t3Var.f3.m(i3);
        if (m10 instanceof b6) {
            b6 b6Var = (b6) m10;
            h1 authorEditText = (i10 == 1 && b6Var.n()) ? b6Var.getAuthorEditText() : b6Var.getEditText();
            authorEditText.O();
            authorEditText.setSelection(Math.max(0, Math.min(i11, authorEditText.length())));
            return;
        }
        if (!(m10 instanceof n5)) {
            if (m10 instanceof l0) {
                h1 captionEditText = ((l0) m10).getCaptionEditText();
                captionEditText.O();
                captionEditText.setSelection(Math.max(0, Math.min(i11, captionEditText.length())));
                return;
            }
            return;
        }
        n5 n5Var = (n5) m10;
        h1 m11 = n5Var.m(i10);
        if (m11 == null) {
            m11 = n5Var.m(0);
        }
        if (m11 == null) {
            return;
        }
        m11.O();
        m11.setSelection(Math.max(0, Math.min(i11, m11.length())));
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r0 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.PageBlock P1(t3 t3Var, a aVar, int i3, int i10) {
        TL_iv.PageBlock pageblockparagraph;
        t3Var.getClass();
        if (!D3(aVar.b)) {
            return null;
        }
        Editable P4 = t3Var.P4(aVar);
        int length = P4.length();
        int max = Math.max(0, Math.min(i3, length));
        if (i10 >= 0) {
            length = Math.max(0, Math.min(i10, length));
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
                a8.g(th2, true);
            }
        }
        pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = new TL_iv.textEmpty();
        b6.d(pageblockparagraph, spannableStringBuilder);
        return pageblockparagraph;
    }

    public static void Q1(t3 t3Var, h1 h1Var) {
        if (h1Var == null) {
            t3Var.getClass();
            return;
        }
        h1Var.X1 = t3Var.r3;
        h1Var.setInlineButtonContext(t3Var.n3);
        h1Var.setInlineButtonClickListener(new s2(t3Var));
    }

    public static void Q2(ArrayList arrayList, ArrayList arrayList2, int i3, boolean z10, int i10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i11);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        W1(arrayList, null, i3, i10, z11, z12);
                        z13 = true;
                    }
                    R2(arrayList, pageBlock, i3 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i3, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        W1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i3, i10, z11, z12);
                    } else {
                        a aVar = new a(pageBlock, i3, i10);
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
        W1(arrayList, null, i3, i10, z11, z12);
    }

    public static TL_iv.PageBlock Q3(a aVar, s sVar) {
        if (!E3(aVar.b)) {
            return aVar.b;
        }
        ArrayList j32 = j3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(sVar) : -1;
        if (indexOf < 0 || j32 == null || indexOf >= j32.size()) {
            return null;
        }
        return (TL_iv.PageBlock) j32.get(indexOf);
    }

    public static void R1(a aVar, s sVar, t3 t3Var) {
        r3 r3Var = t3Var.p3;
        IdentityHashMap identityHashMap = t3Var.i4;
        IdentityHashMap identityHashMap2 = t3Var.h4;
        if (sVar != null) {
            z4 z4Var = (z4) identityHashMap2.remove(sVar);
            if (z4Var != null) {
                z4Var.b();
            }
            v4 v4Var = (v4) identityHashMap.remove(sVar);
            if (v4Var != null) {
                v4Var.a();
            }
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            t3Var.t4(aVar, sVar);
            g2 g2Var2 = t3Var.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            r3Var.onContentChanged();
            return;
        }
        ArrayList arrayList = t3Var.t3;
        for (s sVar2 : T3(aVar)) {
            z4 z4Var2 = (z4) identityHashMap2.remove(sVar2);
            if (z4Var2 != null) {
                z4Var2.b();
            }
            v4 v4Var2 = (v4) identityHashMap.remove(sVar2);
            if (v4Var2 != null) {
                v4Var2.a();
            }
        }
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            g2 g2Var3 = t3Var.R3;
            if (g2Var3 != null) {
                g2Var3.d();
            }
            arrayList.remove(indexOf);
            t3Var.g3.O(true);
            g2 g2Var4 = t3Var.R3;
            if (g2Var4 != null) {
                g2Var4.h();
            }
        }
        r3Var.onContentChanged();
    }

    public static void R2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i3) {
        int i10 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i10 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i10);
                i10++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    W1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i3, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    Q2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i3, false, 0, pageListItem2.checkbox, pageListItem2.checked);
                }
            }
            return;
        }
        ArrayList<TL_iv.PageListOrderedItem> arrayList3 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
        int size2 = arrayList3.size();
        int i11 = 1;
        while (i10 < size2) {
            TL_iv.PageListOrderedItem pageListOrderedItem = arrayList3.get(i10);
            i10++;
            TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
            if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                W1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i3, i11, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i12 = i11;
                Q2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i3, true, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i11 = i12;
            }
            i11++;
        }
    }

    public static boolean R4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(d6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i3 = 0; i3 < pageblocktable.rows.size(); i3++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i3);
            for (int i10 = 0; i10 < pagetablerow.cells.size(); i10++) {
                if (!f6.g(pagetablerow.cells.get(i10)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void S1(t3 t3Var) {
        if (t3Var.Q3) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.h();
        }
        t3Var.p3.a0();
        t3Var.r4();
    }

    public static FrameLayout S4(n5 n5Var, boolean z10) {
        q5 m10;
        f6 model = n5Var.getModel();
        if (model != null) {
            int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i10 = z10 ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : n5Var.getSelectedCells()) {
                int a10 = model.a(pagetablecell2);
                int o10 = z10 ? (f6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i10 || (o10 == i10 && a10 < i3) : o10 > i10 || (o10 == i10 && a10 < i3)) {
                    pagetablecell = pagetablecell2;
                    i3 = a10;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m10 = n5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return n5Var;
    }

    public static void T1(t3 t3Var, a aVar) {
        ArrayList arrayList = t3Var.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        g2 g2Var = t3Var.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.k.addAll(aVar.k);
        arrayList.add(indexOf + 1, aVar2);
        t3Var.v4();
        t3Var.g3.O(false);
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.post(new n2(t3Var, aVar2, 23));
    }

    public static List T3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (E3(aVar.b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        s sVar = aVar.g;
        return sVar != null ? Collections.singletonList(sVar) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (((java.lang.Long) r7.k.get(r11)).longValue() == r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
    
        if (((java.lang.Long) r7.k.get(r11)).longValue() == r12) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean U1(t3 t3Var, a aVar, boolean z10) {
        int i3;
        boolean z11;
        h1 editText;
        Editable text;
        int i10;
        g2 g2Var;
        ArrayList arrayList = t3Var.x4;
        f41 f41Var = t3Var.g3;
        ArrayList arrayList2 = t3Var.t3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList3 = aVar.k;
            if (F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                t3Var.X4(aVar, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            int i11 = -1;
            if (aVar.c > 0) {
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.d();
                }
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    if (b6Var.getEditText().isFocused()) {
                        i11 = b6Var.getEditText().getSelectionEnd();
                    }
                }
                t3Var.w2(indexOf);
                t3Var.v4();
                if (!(t3Var.findFocus() instanceof h1)) {
                    f41Var.O(false);
                    g2 g2Var3 = t3Var.R3;
                    if (g2Var3 != null) {
                        g2Var3.h();
                    }
                    t3Var.post(new y2(t3Var, aVar, 1));
                    return true;
                }
                t3Var.b2();
                g2 g2Var4 = t3Var.R3;
                if (g2Var4 != null) {
                    g2Var4.h();
                }
                if (i11 >= 0) {
                    t3Var.post(new p2(t3Var, aVar, i11, 2));
                    return true;
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
                        g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        arrayList3.remove(arrayList3.size() - 1);
                        t3Var.A2();
                        t3Var.v4();
                        if (t3Var.findFocus() instanceof h1) {
                            f41Var.O(false);
                            g2 g2Var5 = t3Var.R3;
                            if (g2Var5 != null) {
                                g2Var5.h();
                            }
                            t3Var.post(new y2(t3Var, aVar, 2));
                            return true;
                        }
                        t3Var.c5();
                        g2 g2Var6 = t3Var.R3;
                        if (g2Var6 != null) {
                            g2Var6.h();
                            return true;
                        }
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
                    g2Var = t3Var.R3;
                    if (g2Var != null) {
                    }
                    arrayList3.remove(arrayList3.size() - 1);
                    t3Var.A2();
                    t3Var.v4();
                    if (t3Var.findFocus() instanceof h1) {
                    }
                }
                if (indexOf > 0) {
                    int i13 = indexOf - 1;
                    a aVar4 = (a) arrayList2.get(i13);
                    if (aVar4.i && D3(aVar.b)) {
                        View C12 = t3Var.C1(aVar);
                        if ((C12 instanceof b6) && ((b6) C12).getEditText().isFocused()) {
                            int i14 = 0;
                            int i15 = i13;
                            while (true) {
                                if (i15 < 0) {
                                    break;
                                }
                                a aVar5 = (a) arrayList2.get(i15);
                                if (!aVar5.i) {
                                    if (A3(aVar5) && i14 - 1 == 0) {
                                        i11 = i15;
                                        break;
                                    }
                                } else {
                                    i14++;
                                }
                                i15--;
                            }
                            if (i11 >= 0) {
                                g2 g2Var7 = t3Var.R3;
                                if (g2Var7 != null) {
                                    g2Var7.d();
                                }
                                ((TL_iv.pageBlockDetails) ((a) arrayList2.get(i11)).b).open = true;
                                arrayList2.remove(indexOf);
                                arrayList2.add(i13, aVar);
                                a aVar6 = (a) arrayList2.get(indexOf - 2);
                                if (A3(aVar6) || aVar6.i || !t3Var.M1(aVar6, aVar, i13)) {
                                    t3Var.v4();
                                    t3Var.c5();
                                }
                                g2 g2Var8 = t3Var.R3;
                                if (g2Var8 != null) {
                                    g2Var8.h();
                                    return true;
                                }
                            }
                        }
                    }
                    if (A3(aVar4) && (i10 = indexOf + 1) < arrayList2.size() && ((a) arrayList2.get(i10)).i && D3(aVar.b)) {
                        View C13 = t3Var.C1(aVar);
                        if ((C13 instanceof b6) && ((b6) C13).getEditText().isFocused()) {
                            g2 g2Var9 = t3Var.R3;
                            if (g2Var9 != null) {
                                g2Var9.d();
                            }
                            h1 editText2 = ((b6) t3Var.C1(aVar)).getEditText();
                            CharSequence m10 = i6.m(d6.r(((TL_iv.pageBlockDetails) aVar4.b).title, null, true), editText2.getPaint().getFontMetricsInt(), false, null, 0);
                            int length = m10.length();
                            Editable text2 = editText2.getText();
                            if (text2 != null && m10.length() != 0) {
                                editText2.d2 = true;
                                text2.insert(0, m10);
                                editText2.d2 = false;
                            }
                            b6.d(aVar.b, editText2.getText());
                            arrayList2.remove(i10);
                            arrayList2.remove(i13);
                            t3Var.v4();
                            t3Var.c5();
                            editText2.setSelection(Math.min(length, editText2.length()));
                            g2 g2Var10 = t3Var.R3;
                            if (g2Var10 != null) {
                                g2Var10.h();
                                return true;
                            }
                        }
                    }
                    if (A3(aVar4) || aVar4.i) {
                        if (!z10) {
                            return true;
                        }
                        if (A3(aVar4) && ((i3 = indexOf + 1) >= arrayList2.size() || ((a) arrayList2.get(i3)).i)) {
                            return true;
                        }
                        g2 g2Var11 = t3Var.R3;
                        if (g2Var11 != null) {
                            g2Var11.d();
                        }
                        arrayList2.remove(indexOf);
                        t3Var.v4();
                        f41Var.O(false);
                        g2 g2Var12 = t3Var.R3;
                        if (g2Var12 != null) {
                            g2Var12.h();
                        }
                        t3Var.post(new y2(t3Var, aVar4, 3));
                        return true;
                    }
                    if (H3(aVar4.b)) {
                        g2 g2Var13 = t3Var.R3;
                        if (g2Var13 != null) {
                            g2Var13.d();
                        }
                        arrayList2.remove(i13);
                        t3Var.v4();
                        if (!(t3Var.findFocus() instanceof h1)) {
                            f41Var.O(false);
                            g2 g2Var14 = t3Var.R3;
                            if (g2Var14 != null) {
                                g2Var14.h();
                            }
                            t3Var.post(new y2(t3Var, aVar, 4));
                            return true;
                        }
                        t3Var.c5();
                        g2 g2Var15 = t3Var.R3;
                        if (g2Var15 != null) {
                            g2Var15.h();
                            return true;
                        }
                    } else {
                        g2 g2Var16 = t3Var.R3;
                        if (g2Var16 != null) {
                            g2Var16.d();
                        }
                        if (!t3Var.M1(aVar4, aVar, indexOf)) {
                            View C14 = t3Var.C1(aVar4);
                            int indexOf2 = arrayList.indexOf(aVar);
                            if (!(C14 instanceof b6) || indexOf2 < 0) {
                                SpannableStringBuilder A = b6.A(aVar4.b);
                                int length2 = A.length();
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A);
                                spannableStringBuilder.append((CharSequence) b6.A(aVar.b));
                                b6.d(aVar4.b, spannableStringBuilder);
                                arrayList2.remove(indexOf);
                                t3Var.A2();
                                t3Var.v4();
                                f41Var.O(false);
                                g2 g2Var17 = t3Var.R3;
                                if (g2Var17 != null) {
                                    g2Var17.h();
                                }
                                t3Var.post(new p2(t3Var, aVar4, length2, 5));
                                return true;
                            }
                            b6 b6Var2 = (b6) C14;
                            h1 editText3 = b6Var2.getEditText();
                            int length3 = editText3.length();
                            SpannableStringBuilder A2 = b6.A(aVar.b);
                            Editable text3 = editText3.getText();
                            if (text3 != null && A2 != null && A2.length() != 0) {
                                editText3.d2 = true;
                                text3.append((CharSequence) A2);
                                editText3.d2 = false;
                            }
                            b6.d(aVar4.b, editText3.getText());
                            View C15 = t3Var.C1(aVar);
                            if (!(C15 instanceof b6) || (text = (editText = ((b6) C15).getEditText()).getText()) == null || text.length() <= 0) {
                                z11 = true;
                            } else {
                                editText.d2 = true;
                                z11 = true;
                                text.delete(0, text.length());
                                editText.d2 = false;
                            }
                            b6Var2.B();
                            editText3.setSelection(Math.max(0, Math.min(length3, editText3.length())));
                            arrayList2.remove(indexOf);
                            boolean A22 = t3Var.A2();
                            t3Var.v4();
                            if (A22) {
                                f41Var.O(false);
                                g2 g2Var18 = t3Var.R3;
                                if (g2Var18 != null) {
                                    g2Var18.h();
                                }
                                t3Var.post(new p2(t3Var, aVar4, Math.max(0, length3), 4));
                                return z11;
                            }
                            f41Var.T();
                            t3Var.s4(indexOf);
                            u4.m0 itemAnimator = t3Var.getItemAnimator();
                            t3Var.setItemAnimator(null);
                            f41Var.s(indexOf2);
                            if ((aVar4.d > 0 || aVar.d > 0) && indexOf2 < arrayList.size()) {
                                f41Var.k(indexOf2, arrayList.size() - indexOf2);
                            }
                            t3Var.post(new x2(t3Var, itemAnimator, 1));
                            g2 g2Var19 = t3Var.R3;
                            if (g2Var19 == null) {
                                return z11;
                            }
                            g2Var19.h();
                            return z11;
                        }
                        g2 g2Var20 = t3Var.R3;
                        if (g2Var20 != null) {
                            g2Var20.h();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h1 U3(View view) {
        if (view instanceof b6) {
            return ((b6) view).getEditText();
        }
        if (view instanceof l0) {
            return ((l0) view).getCaptionEditText();
        }
        if (view instanceof s0) {
            return ((s0) view).getEditText();
        }
        return null;
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

    public static void W1(ArrayList arrayList, TL_iv.RichText richText, int i3, int i10, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i3, i10);
        aVar.e = z10;
        aVar.f = z11;
        arrayList.add(aVar);
    }

    public static s W3(ye yeVar, String str) {
        s sVar = new s();
        sVar.b = yeVar.b;
        sVar.e = str;
        sVar.j = yeVar.F;
        sVar.k = yeVar.G;
        String str2 = yeVar.h;
        boolean z10 = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        sVar.l = z10 ? 0 : yeVar.J;
        sVar.m = z10 ? 0 : yeVar.K;
        sVar.a = 1;
        sVar.f = 0.0f;
        return sVar;
    }

    public static n5 X2(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof n5) {
                return (n5) parent;
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
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
                long a10 = o0.a();
                Z2(arrayList, pageblockblockquoteblocks.blocks, map);
                for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                    ((a) arrayList.get(size3)).k.add(0, Long.valueOf(a10));
                }
                if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                    map.put(Long.valueOf(a10), pageblockblockquoteblocks.caption);
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

    public static int[] e5(n5 n5Var) {
        f6 f6Var = n5Var.G;
        for (int size = f6Var != null ? f6Var.g.size() : 0; size >= 0; size--) {
            h1 m10 = n5Var.m(size);
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

    public static boolean k4(h1 h1Var, float f10, float f11) {
        if (h1Var != null && h1Var.getVisibility() == 0) {
            h1Var.getLocationOnScreen(new int[2]);
            float f12 = f10 - r1[0];
            float f13 = f11 - r1[1];
            if (f12 >= 0.0f && f13 >= 0.0f && f12 <= h1Var.getWidth() && f13 <= h1Var.getHeight()) {
                int offsetForPosition = h1Var.getOffsetForPosition(f12, f13);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                h1Var.O();
                h1Var.setSelection(Math.max(0, Math.min(offsetForPosition, h1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int n4(int i3, a aVar, boolean z10) {
        if (aVar == null) {
            return org.telegram.messenger.g0.L(2.0f);
        }
        return org.telegram.messenger.k5.D(16.0f, Math.max(0, i3 - (aVar.k.size() - (z10 ? aVar.l : aVar.m))), org.telegram.messenger.g0.L(2.0f));
    }

    public static boolean o3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || G3(pageBlock);
    }

    public static int o4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.k;
        int i3 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i3 < min && ((Long) arrayList.get(i3)).equals(arrayList2.get(i3))) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setEditTextsLocked(boolean z10) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                ((b6) childAt).setLocked(z10);
            } else if (childAt instanceof n5) {
                ((n5) childAt).setLocked(z10);
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof s0) {
                ((s0) childAt).setLocked(z10);
            } else if (childAt instanceof w0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean y3(int i3) {
        return i3 == 21 || i3 == 22 || i3 == 19 || i3 == 20;
    }

    public static int z2(int i3) {
        if (i3 == 4) {
            return 114971;
        }
        if (i3 == 16384) {
            return 32772;
        }
        return i3 == 32768 ? 16388 : 4;
    }

    public final boolean A2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i3 = 0;
        while (true) {
            arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i3);
            boolean z10 = aVar.i;
            ArrayList arrayList2 = aVar.k;
            if (!z10) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i10), 1, new v2());
                }
            }
            i3++;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            a aVar2 = (a) arrayList.get(i11);
            ArrayList arrayList3 = aVar2.k;
            if (arrayList3.size() == 1 && (aVar2.b instanceof TL_iv.pageBlockParagraph)) {
                Long l10 = (Long) arrayList3.get(0);
                l10.getClass();
                Integer num = (Integer) hashMap.get(l10);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l10);
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
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            KeyEvent.Callback childAt = getChildAt(i3);
            if (childAt instanceof k4) {
                y yVar = (y) ((k4) childAt);
                yVar.b.a(yVar.a, new l5.b(yVar, 6));
            }
        }
        invalidate();
    }

    public final ArrayList B2() {
        TLRPC.Document document;
        s sVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i3 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i3);
            if ((aVar.b instanceof TL_iv.pageBlockDocument) && (sVar = aVar.g) != null && sVar.b() && (document2 = aVar.g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.b).document_id = document2.id;
            }
            for (s sVar2 : T3(aVar)) {
                if (sVar2.b() && (document = sVar2.h) != null) {
                    long j10 = document.id;
                    if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                        arrayList.add(sVar2.h);
                    }
                }
            }
            i3++;
        }
    }

    public final boolean B3() {
        int i3;
        h3 h3Var = this.v3;
        return h3Var != null && h3Var.x() && (i3 = h3Var.p0) == h3Var.s0 && A3(B4(i3));
    }

    public final a B4(int i3) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = this.x4;
        if (i3 < arrayList.size()) {
            return (a) arrayList.get(i3);
        }
        return null;
    }

    public final ArrayList C2(int i3, int i10) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i3 <= i10) {
            ArrayList arrayList2 = this.t3;
            if (i3 >= arrayList2.size()) {
                break;
            }
            for (s sVar : T3((a) arrayList2.get(i3))) {
                if (sVar.b() && (document = sVar.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(sVar.h);
                }
            }
            i3++;
        }
        return arrayList;
    }

    public final void C4() {
        ArrayList arrayList = this.t3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    @Override // org.telegram.ui.Components.l41
    public final boolean D1() {
        return this.b4;
    }

    public final ArrayList D2(int i3, int i10) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i3 <= i10) {
            ArrayList arrayList2 = this.t3;
            if (i3 >= arrayList2.size()) {
                break;
            }
            for (s sVar : T3((a) arrayList2.get(i3))) {
                if (sVar.b() && (photo = sVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(sVar.g);
                }
            }
            i3++;
        }
        return arrayList;
    }

    public final View D4(int i3) {
        if (i3 < 0) {
            return null;
        }
        return this.f3.m(i3);
    }

    public final ArrayList E2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i3 >= arrayList2.size()) {
                return arrayList;
            }
            for (s sVar : T3((a) arrayList2.get(i3))) {
                if (sVar.b() && (photo = sVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(sVar.g);
                }
            }
            i3++;
        }
    }

    public final int[] E4() {
        ArrayList arrayList = this.t3;
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x()) {
            a T2 = T2();
            int indexOf = T2 != null ? arrayList.indexOf(T2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(B4(h3Var.p0));
        int indexOf3 = arrayList.indexOf(B4(h3Var.s0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    @Override // org.telegram.ui.Components.l41
    public final void F1() {
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.R0();
        }
    }

    public final void F2() {
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder g7 = b5.g(arrayList);
        J2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        Z2(arrayList, b5.b(g7), hashMap);
        this.g3.O(false);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.onContentChanged();
            r3Var.O1();
        }
    }

    public final boolean F4() {
        h3 h3Var = this.v3;
        if (h3Var != null && h3Var.x()) {
            if (O3()) {
                int i3 = h3Var.p0;
                int i10 = h3Var.q0;
                int i11 = h3Var.t0;
                int i12 = h3Var.r0;
                int i13 = h3Var.u0;
                int i14 = i10;
                while (i14 <= i11) {
                    h1 Q4 = Q4(i3, i14);
                    if (Q4 != null) {
                        int length = Q4.length();
                        int i15 = i14 == i10 ? i12 : 0;
                        int i16 = i14 == i11 ? i13 : length;
                        if (i10 == i11) {
                            i15 = Math.min(i12, i13);
                            i16 = Math.max(i12, i13);
                        }
                        if (Math.max(0, Math.min(i15, length)) < Math.max(0, Math.min(i16, length))) {
                            return true;
                        }
                    }
                    i14++;
                }
            } else if (B3()) {
                h1 L2 = L2(h3Var.p0);
                if (L2 != null && Math.max(0, Math.min(Math.min(h3Var.r0, h3Var.u0), L2.length())) < Math.max(0, Math.min(Math.max(h3Var.r0, h3Var.u0), L2.length()))) {
                    return true;
                }
            } else if (z3()) {
                h1 v22 = v2(h3Var.p0);
                if (v22 != null) {
                    int i17 = h3Var.r0;
                    int i18 = h3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i17, i18), v22.length())) < Math.max(0, Math.min(Math.max(i17, i18), v22.length()))) {
                        return true;
                    }
                }
            } else if (J3()) {
                h1 m42 = m4(h3Var.p0);
                if (m42 != null) {
                    int i19 = h3Var.r0;
                    int i20 = h3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i19, i20), m42.length())) < Math.max(0, Math.min(Math.max(i19, i20), m42.length()))) {
                        return true;
                    }
                }
            } else {
                int i21 = h3Var.p0;
                int i22 = h3Var.s0;
                int i23 = h3Var.r0;
                int i24 = h3Var.u0;
                if (i21 >= 0 && i22 >= 0 && i22 >= i21 && i22 < this.x4.size()) {
                    int i25 = i21;
                    while (i25 <= i22) {
                        a B4 = B4(i25);
                        if (B4 != null) {
                            if (B4.t == 0) {
                                TL_iv.PageBlock pageBlock = B4.b;
                                if (!D3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int l22 = l2(i25);
                            if (Math.max(0, Math.min(i25 == i21 ? i23 : 0, l22)) < Math.max(0, Math.min(i25 == i22 ? i24 : l22, l22))) {
                                return true;
                            }
                        }
                        i25++;
                    }
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.l41
    public final void G1() {
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.v1();
        }
        A4();
    }

    public final a G2() {
        int i3;
        a B4;
        a T2 = T2();
        if (T2 != null) {
            return T2;
        }
        h3 h3Var = this.v3;
        if (h3Var == null || (i3 = h3Var.p0) < 0 || (B4 = B4(i3)) == null) {
            return null;
        }
        return B4;
    }

    public final int[] G4() {
        h3 h3Var = this.v3;
        if (h3Var == null) {
            return null;
        }
        int i3 = h3Var.p0;
        int i10 = h3Var.s0;
        if (i3 < 0 || i10 < 0) {
            return null;
        }
        a B4 = B4(i3);
        a B42 = B4(i10);
        if (B4 == null || B42 == null) {
            return null;
        }
        ArrayList arrayList = this.t3;
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

    @Override // org.telegram.ui.Components.l41
    public final void H1(u4.d1 d1Var) {
        r3 r3Var = this.p3;
        if (r3Var == null || d1Var == null) {
            return;
        }
        View view = d1Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.b4 = r3Var.e(view.getHeight() + r1[1]);
    }

    public final void H2() {
        ArrayList arrayList;
        h3 h3Var = this.v3;
        int i3 = h3Var.p0;
        int i10 = h3Var.r0;
        int i11 = h3Var.s0;
        if (a2(i3, i10, i11, h3Var.u0, new String[]{""})) {
            return;
        }
        if (i3 > i11) {
            i11 = i3;
            i3 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(0, i3);
        while (true) {
            arrayList = this.t3;
            if (max > i11) {
                break;
            }
            ArrayList arrayList3 = this.x4;
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
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.u3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                hashSet.addAll(((a) arrayList.get(i12)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        A2();
        Y3();
        v4();
        h3Var.f(false);
        this.g3.O(false);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        post(new n2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
    }

    public final void H4(h1 h1Var) {
        h1Var.X1 = this.r3;
        h1Var.C(new b(this, 4));
    }

    @Override // org.telegram.ui.Components.l41
    public final void I1(u4.d1 d1Var) {
        a aVar = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (aVar == null) {
            if (d1Var != null) {
                View view = d1Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        u4(aVar);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.onContentChanged();
        }
    }

    public final boolean I2() {
        h3 h3Var = this.v3;
        if (h3Var != null && h3Var.x()) {
            h3Var.f(false);
            return true;
        }
        if (this.q4 == null) {
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
    /* JADX WARN: Removed duplicated region for block: B:192:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04ae A[EDGE_INSN: B:246:0x04ae->B:155:0x04ae BREAK  A[LOOP:10: B:144:0x048a->B:236:0x048a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0480 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0485 A[EDGE_INSN: B:258:0x0485->B:143:0x0485 BREAK  A[LOOP:9: B:132:0x0461->B:248:0x0461], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00e5  */
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
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I4(n5 n5Var) {
        int i3;
        int i10;
        HashSet hashSet;
        Iterator<TL_iv.pageTableCell> it;
        boolean z10;
        HashSet hashSet2;
        Iterator<TL_iv.pageTableCell> it2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        f60 f60Var;
        int i16;
        int L;
        int i17;
        int[] iArr;
        FrameLayout S4;
        ?? r12;
        int i18;
        int i19;
        boolean z14;
        Iterator it3;
        Iterator it4;
        int i20;
        int i21;
        int i22;
        final int i23;
        final int i24;
        boolean z15;
        String M0;
        String str;
        int i25;
        String str2;
        final ?? r9;
        int i26;
        int i27;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean z16;
        boolean equals;
        final n5 n5Var2 = n5Var;
        final f6 model = n5Var2.getModel();
        LinkedHashSet linkedHashSet = n5Var2.I;
        if (model == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = model.a;
        Set<TL_iv.pageTableCell> selectedCells = n5Var2.getSelectedCells();
        if (selectedCells.isEmpty()) {
            return;
        }
        int size = selectedCells.size();
        int i28 = 1;
        if (size >= 2) {
            int i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i30 = Integer.MAX_VALUE;
            int i31 = -1;
            int i32 = -1;
            for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                int b10 = model.b(pagetablecell);
                int a10 = model.a(pagetablecell);
                int o10 = f6.o(pagetablecell);
                int i33 = pagetablecell.colspan;
                if (i33 == 0) {
                    i33 = 1;
                }
                i29 = Math.min(i29, b10);
                i30 = Math.min(i30, a10);
                i31 = Math.max(i31, (b10 + o10) - 1);
                i32 = Math.max(i32, (a10 + i33) - 1);
            }
            HashSet hashSet4 = new HashSet();
            loop1: while (i29 <= i31) {
                for (int i34 = i30; i34 <= i32; i34++) {
                    if (i29 < 0 || i34 < 0 || i29 >= model.b || i34 >= model.c) {
                        equals = false;
                        break loop1;
                    }
                    hashSet4.add(model.d[i29][i34]);
                }
                i29++;
            }
            equals = hashSet4.equals(new HashSet(selectedCells));
            if (equals) {
                i3 = 1;
                if (size == 1) {
                    TL_iv.pageTableCell next = selectedCells.iterator().next();
                    if (f6.n(next) <= 1) {
                        int i35 = next.rowspan;
                        if (i35 == 0) {
                            i35 = 1;
                        }
                        if (i35 <= 1) {
                            z16 = false;
                            if (z16) {
                                i10 = 1;
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
                                            for (int i36 = 0; i36 < model.c; i36++) {
                                                if (model.e[intValue][i36] == intValue && selectedCells.contains(model.d[intValue][i36])) {
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
                                                for (int i37 = 0; i37 < model.b; i37++) {
                                                    if (model.f[i37][intValue2] == intValue2 && selectedCells.contains(model.d[i37][intValue2])) {
                                                    }
                                                }
                                            }
                                        }
                                        z11 = true;
                                        if (!selectedCells.isEmpty() || model.b <= 0 || model.c <= 0) {
                                            z12 = false;
                                        } else {
                                            HashSet hashSet5 = new HashSet();
                                            for (int i38 = 0; i38 < model.b; i38++) {
                                                for (int i39 = 0; i39 < model.c; i39++) {
                                                    hashSet5.add(model.d[i38][i39]);
                                                }
                                            }
                                            z12 = hashSet5.equals(new HashSet(selectedCells));
                                        }
                                        z13 = z12 || (model.b == 1 && model.c == 1);
                                        if (z10 || z12) {
                                            i11 = 1;
                                        } else {
                                            HashSet hashSet6 = new HashSet();
                                            Iterator<TL_iv.pageTableCell> it8 = selectedCells.iterator();
                                            while (it8.hasNext()) {
                                                hashSet6.add(Integer.valueOf(model.b(it8.next())));
                                                i28 = i28;
                                            }
                                            i11 = i28;
                                            if (hashSet6.size() < model.b) {
                                                i12 = i11;
                                                if (z11 && !z12) {
                                                    hashSet3 = new HashSet();
                                                    it5 = selectedCells.iterator();
                                                    while (it5.hasNext()) {
                                                        hashSet3.add(Integer.valueOf(model.a(it5.next())));
                                                    }
                                                    if (hashSet3.size() < model.c) {
                                                        i13 = i11;
                                                        i14 = (z13 || !z11 || model.c >= ((org.telegram.messenger.j0) hp.s1(this.n3).x7.Z.b).c) ? 0 : i11;
                                                        i15 = (z13 || !z10) ? 0 : i11;
                                                        f60Var = this.r4;
                                                        i16 = i3;
                                                        if (f60Var != null) {
                                                            this.r4 = null;
                                                            f60Var.u();
                                                        }
                                                        L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                        FrameLayout S42 = S4(n5Var2, false);
                                                        i17 = i13;
                                                        iArr = new int[2];
                                                        S42.getLocationOnScreen(iArr);
                                                        if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
                                                            S4 = S42;
                                                            r12 = i11;
                                                        } else {
                                                            boolean z17 = i11;
                                                            S4 = S4(n5Var2, z17);
                                                            r12 = z17;
                                                        }
                                                        final f60 D1 = this.p3.D1(S4);
                                                        D1.s = 0;
                                                        D1.t = false;
                                                        D1.Z = r12;
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
                                                        linearLayout.setOrientation(r12);
                                                        TextView textView = new TextView(getContext());
                                                        textView.setText(bd.M0(2131754057, null));
                                                        textView.setTextSize(1, 12.0f);
                                                        textView.setGravity(17);
                                                        int i40 = k6.y6;
                                                        org.telegram.ui.ActionBar.e6 e6Var = this.o3;
                                                        r6.V(textView, i40, e6Var);
                                                        linearLayout.addView(textView, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                        i18 = i10;
                                                        i19 = i12;
                                                        boolean z18 = z10;
                                                        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                                        linearLayout2.setOrientation(0);
                                                        linearLayout.addView(linearLayout2, mf.r(-2, -2, 17));
                                                        y1 y1Var = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var);
                                                        y1Var.e = 4;
                                                        y1Var.updateColors();
                                                        y1Var.b();
                                                        int i41 = k6.G8;
                                                        y1Var.c(i41);
                                                        linearLayout2.addView(y1Var, mf.o(32, 32));
                                                        y1 y1Var2 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var);
                                                        y1Var2.e = 4;
                                                        y1Var2.updateColors();
                                                        y1Var2.b();
                                                        y1Var2.c(i41);
                                                        linearLayout2.addView(y1Var2, mf.o(32, 32));
                                                        y1 y1Var3 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var);
                                                        y1Var3.e = 4;
                                                        y1Var3.updateColors();
                                                        y1Var3.b();
                                                        y1Var3.c(i41);
                                                        final y1[] y1VarArr = {y1Var, y1Var2, y1Var3};
                                                        boolean z19 = z11;
                                                        linearLayout2.addView(y1Var3, mf.o(32, 32));
                                                        z14 = z12;
                                                        linearLayout2.addView(new Space(getContext()), mf.o(8, 0));
                                                        y1 y1Var4 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var);
                                                        y1Var4.e = 4;
                                                        y1Var4.updateColors();
                                                        y1Var4.b();
                                                        y1Var4.c(i41);
                                                        linearLayout2.addView(y1Var4, mf.o(32, 32));
                                                        y1 y1Var5 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var);
                                                        y1Var5.e = 4;
                                                        y1Var5.updateColors();
                                                        y1Var5.b();
                                                        y1Var5.c(i41);
                                                        linearLayout2.addView(y1Var5, mf.o(32, 32));
                                                        y1 y1Var6 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var);
                                                        y1Var6.e = 4;
                                                        y1Var6.updateColors();
                                                        y1Var6.b();
                                                        y1Var6.c(i41);
                                                        final y1[] y1VarArr2 = {y1Var4, y1Var5, y1Var6};
                                                        linearLayout2.addView(y1Var6, mf.o(32, 32));
                                                        D1.q(linearLayout);
                                                        it3 = linkedHashSet.iterator();
                                                        int i42 = -1;
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) it3.next();
                                                            if (pagetablecell2 != null) {
                                                                if (pagetablecell2.align_right) {
                                                                    i27 = 2;
                                                                } else if (pagetablecell2.align_center) {
                                                                    i27 = 1;
                                                                }
                                                                if (i42 == -1) {
                                                                    if (i42 != i27) {
                                                                        i42 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i42 = i27;
                                                                }
                                                            }
                                                            i27 = 0;
                                                            if (i42 == -1) {
                                                            }
                                                        }
                                                        it4 = linkedHashSet.iterator();
                                                        int i43 = -1;
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) it4.next();
                                                            if (pagetablecell3 != null) {
                                                                if (pagetablecell3.valign_bottom) {
                                                                    i26 = 2;
                                                                } else if (pagetablecell3.valign_middle) {
                                                                    i26 = 1;
                                                                }
                                                                if (i43 == -1) {
                                                                    if (i43 != i26) {
                                                                        i43 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i43 = i26;
                                                                }
                                                            }
                                                            i26 = 0;
                                                            if (i43 == -1) {
                                                            }
                                                        }
                                                        i20 = 0;
                                                        while (i20 < 3) {
                                                            y1VarArr[i20].setSelected(i20 == i42);
                                                            i20++;
                                                        }
                                                        i22 = 0;
                                                        while (i22 < 3) {
                                                            y1VarArr2[i22].setSelected(i22 == i43);
                                                            i22++;
                                                        }
                                                        for (i23 = 0; i23 < 3; i23++) {
                                                            final int i44 = 0;
                                                            y1VarArr[i23].setOnClickListener(new View.OnClickListener() { // from class: mi.k2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i44) {
                                                                        case 0:
                                                                            n5 n5Var3 = n5Var2;
                                                                            p5 p5Var = n5Var3.w;
                                                                            Iterator it9 = n5Var3.I.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i45 = i23;
                                                                                if (!hasNext) {
                                                                                    p5Var.invalidate();
                                                                                    b3 b3Var = n5Var3.F;
                                                                                    if (b3Var != null && n5Var3.a != null) {
                                                                                        b3Var.a();
                                                                                    }
                                                                                    int i46 = 0;
                                                                                    while (i46 < 3) {
                                                                                        y1VarArr[i46].setSelected(i46 == i45);
                                                                                        i46++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    f6.k(pagetablecell4, i45);
                                                                                    q5 m10 = p5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n5 n5Var4 = n5Var2;
                                                                            p5 p5Var2 = n5Var4.w;
                                                                            Iterator it10 = n5Var4.I.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i47 = i23;
                                                                                if (!hasNext2) {
                                                                                    p5Var2.invalidate();
                                                                                    b3 b3Var2 = n5Var4.F;
                                                                                    if (b3Var2 != null && n5Var4.a != null) {
                                                                                        b3Var2.a();
                                                                                    }
                                                                                    int i48 = 0;
                                                                                    while (i48 < 3) {
                                                                                        y1VarArr[i48].setSelected(i48 == i47);
                                                                                        i48++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    f6.m(pagetablecell5, i47);
                                                                                    q5 m11 = p5Var2.m(pagetablecell5);
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
                                                        i24 = 0;
                                                        for (i21 = 3; i24 < i21; i21 = 3) {
                                                            final int i45 = 1;
                                                            y1VarArr2[i24].setOnClickListener(new View.OnClickListener() { // from class: mi.k2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i45) {
                                                                        case 0:
                                                                            n5 n5Var3 = n5Var2;
                                                                            p5 p5Var = n5Var3.w;
                                                                            Iterator it9 = n5Var3.I.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i452 = i24;
                                                                                if (!hasNext) {
                                                                                    p5Var.invalidate();
                                                                                    b3 b3Var = n5Var3.F;
                                                                                    if (b3Var != null && n5Var3.a != null) {
                                                                                        b3Var.a();
                                                                                    }
                                                                                    int i46 = 0;
                                                                                    while (i46 < 3) {
                                                                                        y1VarArr2[i46].setSelected(i46 == i452);
                                                                                        i46++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    f6.k(pagetablecell4, i452);
                                                                                    q5 m10 = p5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            n5 n5Var4 = n5Var2;
                                                                            p5 p5Var2 = n5Var4.w;
                                                                            Iterator it10 = n5Var4.I.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i47 = i24;
                                                                                if (!hasNext2) {
                                                                                    p5Var2.invalidate();
                                                                                    b3 b3Var2 = n5Var4.F;
                                                                                    if (b3Var2 != null && n5Var4.a != null) {
                                                                                        b3Var2.a();
                                                                                    }
                                                                                    int i48 = 0;
                                                                                    while (i48 < 3) {
                                                                                        y1VarArr2[i48].setSelected(i48 == i47);
                                                                                        i48++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    f6.m(pagetablecell5, i47);
                                                                                    q5 m11 = p5Var2.m(pagetablecell5);
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
                                                            i24++;
                                                        }
                                                        D1.o();
                                                        D1.S = 208;
                                                        if (!linkedHashSet.isEmpty()) {
                                                            Iterator it9 = linkedHashSet.iterator();
                                                            while (it9.hasNext()) {
                                                                if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                                }
                                                            }
                                                            z15 = true;
                                                            if (!z15) {
                                                                M0 = bd.M0(2131753995, null);
                                                            } else if (z14 || !(size <= 1 || z19 || z18)) {
                                                                M0 = bd.M0(2131754023, null);
                                                            } else {
                                                                if (z19) {
                                                                    i25 = 2131754022;
                                                                    str = null;
                                                                } else {
                                                                    str = null;
                                                                    i25 = z18 ? 2131754021 : 2131754024;
                                                                }
                                                                M0 = bd.M0(i25, str);
                                                            }
                                                            D1.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                                                            if (i16 == 0) {
                                                                str2 = null;
                                                                final int i46 = 2;
                                                                D1.c(R.drawable.iv_table_merge, bd.M0(2131754000, null), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i46) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i47 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i47 = Math.min(i47, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i48 = 0;
                                                                                                for (int i49 = 0; i49 < f6Var.b; i49++) {
                                                                                                    iArr2[i49] = i48;
                                                                                                    if (!zArr[i49]) {
                                                                                                        i48++;
                                                                                                    }
                                                                                                }
                                                                                                if (i48 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a11, i53, i51});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i48);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i47, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            } else {
                                                                str2 = null;
                                                            }
                                                            if (i18 != 0) {
                                                                final int i47 = 3;
                                                                D1.c(R.drawable.iv_table_unmerge, bd.M0(2131753992, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i47) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i48 = 0;
                                                                                                for (int i49 = 0; i49 < f6Var.b; i49++) {
                                                                                                    iArr2[i49] = i48;
                                                                                                    if (!zArr[i49]) {
                                                                                                        i48++;
                                                                                                    }
                                                                                                }
                                                                                                if (i48 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a11, i53, i51});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i48);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i14 != 0) {
                                                                final int i48 = 4;
                                                                D1.c(R.drawable.iv_table_insert_left, bd.M0(2131754010, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i48) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i49 = 0; i49 < f6Var.b; i49++) {
                                                                                                    iArr2[i49] = i482;
                                                                                                    if (!zArr[i49]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a11, i53, i51});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i49 = 5;
                                                                D1.c(R.drawable.iv_table_insert_right, bd.M0(2131754009, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i49) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < f6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a11, i53, i51});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            final int i50 = 7;
                                                            if (i15 != 0) {
                                                                final int i51 = 6;
                                                                D1.c(R.drawable.iv_table_insert_top, bd.M0(2131754012, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i51) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < f6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a11, i53, i512});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                D1.c(R.drawable.iv_table_insert_bottom, bd.M0(2131754011, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i50) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < f6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a11, i53, i512});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i17 == 0) {
                                                                String M02 = bd.M0(2131754039, str2);
                                                                final int i52 = 8;
                                                                Runnable runnable = new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i52) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < f6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i522 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i522 < 0) {
                                                                                                                    i522 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i522 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i522], a11, i53, i512});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                };
                                                                r9 = 1;
                                                                D1.c(R.drawable.iv_table_remove, M02, runnable, true);
                                                            } else {
                                                                r9 = 1;
                                                            }
                                                            if (i19 != 0) {
                                                                final int i53 = 0;
                                                                D1.c(R.drawable.iv_table_remove, bd.M0(2131754035, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (i53) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < f6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i522 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i532 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i522 < 0) {
                                                                                                                    i522 = i54;
                                                                                                                }
                                                                                                                i532++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i522 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i522], a11, i532, i512});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r9);
                                                            }
                                                            if (z14) {
                                                                D1.c(R.drawable.iv_table_remove, bd.M0(2131754034, str2), new Runnable(this) { // from class: mi.l2
                                                                    public final /* synthetic */ t3 b;

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
                                                                        t3 t3Var;
                                                                        boolean z20;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        t3 t3Var2;
                                                                        boolean z21;
                                                                        switch (r9) {
                                                                            case 0:
                                                                                t3 t3Var3 = this.b;
                                                                                t3Var3.getClass();
                                                                                n5 n5Var3 = n5Var2;
                                                                                LinkedHashSet linkedHashSet2 = n5Var3.I;
                                                                                if (n5Var3.G == null || linkedHashSet2.isEmpty()) {
                                                                                    t3Var = t3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet2.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = n5Var3.G.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet2.clear();
                                                                                    f6 f6Var = n5Var3.G;
                                                                                    f6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        t3Var = t3Var3;
                                                                                        z20 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[f6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z20 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < f6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[f6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < f6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    f6Var.a.rows.clear();
                                                                                                    f6Var.i();
                                                                                                    t3Var = t3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = f6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = f6Var.b(pagetablecell4);
                                                                                                        int a11 = f6Var.a(pagetablecell4);
                                                                                                        int o11 = f6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i522 = -1;
                                                                                                        t3 t3Var4 = t3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i532 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < f6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i522 < 0) {
                                                                                                                    i522 = i54;
                                                                                                                }
                                                                                                                i532++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i522 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i522], a11, i532, i512});
                                                                                                        }
                                                                                                        t3Var3 = t3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    t3Var = t3Var3;
                                                                                                    f6Var.j(identityHashMap, i482);
                                                                                                    f6Var.i();
                                                                                                    z20 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var3.x();
                                                                                    if (z20) {
                                                                                        n5Var3.s(i472, 0);
                                                                                    }
                                                                                }
                                                                                t3Var.P2();
                                                                                break;
                                                                            case 1:
                                                                                t3 t3Var5 = this.b;
                                                                                t3Var5.getClass();
                                                                                a row = n5Var2.getRow();
                                                                                t3Var5.P2();
                                                                                if (row != null) {
                                                                                    g2 g2Var = t3Var5.R3;
                                                                                    if (g2Var != null) {
                                                                                        g2Var.d();
                                                                                    }
                                                                                    t3Var5.u4(row);
                                                                                    g2 g2Var2 = t3Var5.R3;
                                                                                    if (g2Var2 != null) {
                                                                                        g2Var2.h();
                                                                                    }
                                                                                    r3 r3Var = t3Var5.p3;
                                                                                    if (r3Var != null) {
                                                                                        r3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                n5 n5Var4 = n5Var2;
                                                                                LinkedHashSet linkedHashSet3 = n5Var4.I;
                                                                                if (n5Var4.G != null) {
                                                                                    char c2 = 2;
                                                                                    if (linkedHashSet3.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet3);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, n5Var4.G.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, n5Var4.G.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet3.clear();
                                                                                        f6 f6Var2 = n5Var4.G;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = f6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c10 = c2;
                                                                                                int b14 = f6Var2.b(pagetablecell6);
                                                                                                int a12 = f6Var2.a(pagetablecell6);
                                                                                                int o12 = f6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a12);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a12 + i61) - 1);
                                                                                                c2 = c10;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < f6Var2.b && i63 < f6Var2.c) {
                                                                                                            hashSet9.add(f6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new ci.y4(f6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = f6.g((TL_iv.pageTableCell) obj2);
                                                                                                        if (g7.isEmpty()) {
                                                                                                            arrayList = arrayList3;
                                                                                                        } else {
                                                                                                            if (sb2.length() > 0) {
                                                                                                                arrayList = arrayList3;
                                                                                                                sb2.append("\n");
                                                                                                            } else {
                                                                                                                arrayList = arrayList3;
                                                                                                            }
                                                                                                            sb2.append(g7);
                                                                                                        }
                                                                                                        arrayList3 = arrayList;
                                                                                                    }
                                                                                                    TL_iv.pageTableCell pagetablecell7 = f6Var2.d[i55][i60];
                                                                                                    int i65 = (i59 - i60) + 1;
                                                                                                    int i66 = (i58 - i55) + 1;
                                                                                                    if (i65 <= 1) {
                                                                                                        i65 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i65;
                                                                                                    int i67 = i66 > 1 ? i66 : 0;
                                                                                                    pagetablecell7.rowspan = i67;
                                                                                                    int i68 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i65 > 0 ? i68 | 2 : i68 & (-3);
                                                                                                    int i69 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i69 | 4 : i69 & (-5);
                                                                                                    f6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = f6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    f6Var2.i();
                                                                                                    n5Var4.x();
                                                                                                    n5Var4.w.invalidate();
                                                                                                    n5Var4.s(i56, i57);
                                                                                                    n5Var4.v();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet3.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 3:
                                                                                n5 n5Var5 = n5Var2;
                                                                                LinkedHashSet linkedHashSet4 = n5Var5.I;
                                                                                if (n5Var5.G != null && linkedHashSet4.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet4.iterator().next();
                                                                                    if (f6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = n5Var5.G.b(pagetablecell9);
                                                                                    int a13 = n5Var5.G.a(pagetablecell9);
                                                                                    linkedHashSet4.clear();
                                                                                    if (n5Var5.G.p(pagetablecell9)) {
                                                                                        n5Var5.x();
                                                                                        n5Var5.w.invalidate();
                                                                                        n5Var5.s(b15, a13);
                                                                                        n5Var5.v();
                                                                                    } else {
                                                                                        linkedHashSet4.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.P2();
                                                                                break;
                                                                            case 4:
                                                                                n5Var2.h(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 5:
                                                                                n5Var2.h(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 6:
                                                                                n5Var2.j(true);
                                                                                this.b.P2();
                                                                                break;
                                                                            case 7:
                                                                                n5Var2.j(false);
                                                                                this.b.P2();
                                                                                break;
                                                                            default:
                                                                                t3 t3Var6 = this.b;
                                                                                t3Var6.getClass();
                                                                                n5 n5Var6 = n5Var2;
                                                                                LinkedHashSet linkedHashSet5 = n5Var6.I;
                                                                                if (n5Var6.G == null || linkedHashSet5.isEmpty()) {
                                                                                    t3Var2 = t3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet5.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a14 = n5Var6.G.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a14));
                                                                                        i71 = Math.min(i71, a14);
                                                                                    }
                                                                                    linkedHashSet5.clear();
                                                                                    f6 f6Var3 = n5Var6.G;
                                                                                    f6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        t3Var2 = t3Var6;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[f6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < f6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[f6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < f6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    f6Var3.a.rows.clear();
                                                                                                    f6Var3.i();
                                                                                                    t3Var2 = t3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = f6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = f6Var3.b(pagetablecell10);
                                                                                                        int a15 = f6Var3.a(pagetablecell10);
                                                                                                        int o13 = f6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        t3 t3Var7 = t3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a15; i78 < a15 + i75 && i78 < f6Var3.c; i78++) {
                                                                                                            if (!zArr3[i78]) {
                                                                                                                if (i76 < 0) {
                                                                                                                    i76 = i78;
                                                                                                                }
                                                                                                                i77++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i76 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i76], o13, i77});
                                                                                                        }
                                                                                                        t3Var6 = t3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    t3Var2 = t3Var6;
                                                                                                    f6Var3.j(identityHashMap2, f6Var3.b);
                                                                                                    f6Var3.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n5Var6.x();
                                                                                    if (z21) {
                                                                                        n5Var6.s(0, i71);
                                                                                    }
                                                                                }
                                                                                t3Var2.P2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r9);
                                                                D1.o();
                                                                final int i54 = 0;
                                                                D1.i(new Runnable() { // from class: mi.m2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i54) {
                                                                            case 0:
                                                                                D1.n0 = true;
                                                                                boolean z20 = !model.a.bordered;
                                                                                n5 n5Var3 = n5Var2;
                                                                                f6 f6Var = n5Var3.G;
                                                                                if (f6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = f6Var.a;
                                                                                    if (pageblocktable2.bordered != z20) {
                                                                                        pageblocktable2.bordered = z20;
                                                                                        n5Var3.w.invalidate();
                                                                                        b3 b3Var = n5Var3.F;
                                                                                        if (b3Var != null && n5Var3.a != null) {
                                                                                            b3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z20);
                                                                                break;
                                                                            default:
                                                                                D1.n0 = true;
                                                                                boolean z21 = !model.a.compact;
                                                                                n5 n5Var4 = n5Var2;
                                                                                f6 f6Var2 = n5Var4.G;
                                                                                if (f6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = f6Var2.a;
                                                                                    if (pageblocktable3.compact != z21) {
                                                                                        pageblocktable3.compact = z21;
                                                                                        p5 p5Var = n5Var4.w;
                                                                                        if (p5Var.a != null) {
                                                                                            for (int i55 = 0; i55 < p5Var.getChildCount(); i55++) {
                                                                                                View childAt = p5Var.getChildAt(i55);
                                                                                                if (childAt instanceof q5) {
                                                                                                    ((q5) childAt).setCompact(p5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            p5Var.requestLayout();
                                                                                            p5Var.invalidate();
                                                                                        }
                                                                                        n5Var4.x.requestLayout();
                                                                                        n5Var4.requestLayout();
                                                                                        b3 b3Var2 = n5Var4.F;
                                                                                        if (b3Var2 != null && n5Var4.a != null) {
                                                                                            b3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z21);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, bd.M0(2131753991, str2), pageblocktable.bordered);
                                                                final int i55 = 1;
                                                                n5Var2 = n5Var;
                                                                D1.i(new Runnable() { // from class: mi.m2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i55) {
                                                                            case 0:
                                                                                D1.n0 = true;
                                                                                boolean z20 = !model.a.bordered;
                                                                                n5 n5Var3 = n5Var2;
                                                                                f6 f6Var = n5Var3.G;
                                                                                if (f6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = f6Var.a;
                                                                                    if (pageblocktable2.bordered != z20) {
                                                                                        pageblocktable2.bordered = z20;
                                                                                        n5Var3.w.invalidate();
                                                                                        b3 b3Var = n5Var3.F;
                                                                                        if (b3Var != null && n5Var3.a != null) {
                                                                                            b3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z20);
                                                                                break;
                                                                            default:
                                                                                D1.n0 = true;
                                                                                boolean z21 = !model.a.compact;
                                                                                n5 n5Var4 = n5Var2;
                                                                                f6 f6Var2 = n5Var4.G;
                                                                                if (f6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = f6Var2.a;
                                                                                    if (pageblocktable3.compact != z21) {
                                                                                        pageblocktable3.compact = z21;
                                                                                        p5 p5Var = n5Var4.w;
                                                                                        if (p5Var.a != null) {
                                                                                            for (int i552 = 0; i552 < p5Var.getChildCount(); i552++) {
                                                                                                View childAt = p5Var.getChildAt(i552);
                                                                                                if (childAt instanceof q5) {
                                                                                                    ((q5) childAt).setCompact(p5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            p5Var.requestLayout();
                                                                                            p5Var.invalidate();
                                                                                        }
                                                                                        n5Var4.x.requestLayout();
                                                                                        n5Var4.requestLayout();
                                                                                        b3 b3Var2 = n5Var4.F;
                                                                                        if (b3Var2 != null && n5Var4.a != null) {
                                                                                            b3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z21);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, bd.M0(2131753990, str2), pageblocktable.compact);
                                                                final org.telegram.ui.ActionBar.y0[] y0VarArr = {D1.y(), D1.y()};
                                                            }
                                                            D1.p = new lg.y(this, D1, n5Var2, i50);
                                                            this.r4 = D1;
                                                            D1.Z();
                                                        }
                                                        z15 = false;
                                                        if (!z15) {
                                                        }
                                                        D1.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                                                        if (i16 == 0) {
                                                        }
                                                        if (i18 != 0) {
                                                        }
                                                        if (i14 != 0) {
                                                        }
                                                        final int i502 = 7;
                                                        if (i15 != 0) {
                                                        }
                                                        if (i17 == 0) {
                                                        }
                                                        if (i19 != 0) {
                                                        }
                                                        if (z14) {
                                                        }
                                                        D1.p = new lg.y(this, D1, n5Var2, i502);
                                                        this.r4 = D1;
                                                        D1.Z();
                                                    }
                                                }
                                                i13 = 0;
                                                if (z13) {
                                                }
                                                if (z13) {
                                                }
                                                f60Var = this.r4;
                                                i16 = i3;
                                                if (f60Var != null) {
                                                }
                                                L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                FrameLayout S422 = S4(n5Var2, false);
                                                i17 = i13;
                                                iArr = new int[2];
                                                S422.getLocationOnScreen(iArr);
                                                if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
                                                }
                                                final f60 D12 = this.p3.D1(S4);
                                                D12.s = 0;
                                                D12.t = false;
                                                D12.Z = r12;
                                                LinearLayout linearLayout3 = new LinearLayout(getContext());
                                                linearLayout3.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
                                                linearLayout3.setOrientation(r12);
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setText(bd.M0(2131754057, null));
                                                textView2.setTextSize(1, 12.0f);
                                                textView2.setGravity(17);
                                                int i402 = k6.y6;
                                                org.telegram.ui.ActionBar.e6 e6Var2 = this.o3;
                                                r6.V(textView2, i402, e6Var2);
                                                linearLayout3.addView(textView2, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout22 = new LinearLayout(getContext());
                                                i18 = i10;
                                                i19 = i12;
                                                boolean z182 = z10;
                                                linearLayout22.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                                linearLayout22.setOrientation(0);
                                                linearLayout3.addView(linearLayout22, mf.r(-2, -2, 17));
                                                y1 y1Var7 = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var2);
                                                y1Var7.e = 4;
                                                y1Var7.updateColors();
                                                y1Var7.b();
                                                int i412 = k6.G8;
                                                y1Var7.c(i412);
                                                linearLayout22.addView(y1Var7, mf.o(32, 32));
                                                y1 y1Var22 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var2);
                                                y1Var22.e = 4;
                                                y1Var22.updateColors();
                                                y1Var22.b();
                                                y1Var22.c(i412);
                                                linearLayout22.addView(y1Var22, mf.o(32, 32));
                                                y1 y1Var32 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var2);
                                                y1Var32.e = 4;
                                                y1Var32.updateColors();
                                                y1Var32.b();
                                                y1Var32.c(i412);
                                                final y1[] y1VarArr3 = {y1Var7, y1Var22, y1Var32};
                                                boolean z192 = z11;
                                                linearLayout22.addView(y1Var32, mf.o(32, 32));
                                                z14 = z12;
                                                linearLayout22.addView(new Space(getContext()), mf.o(8, 0));
                                                y1 y1Var42 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var2);
                                                y1Var42.e = 4;
                                                y1Var42.updateColors();
                                                y1Var42.b();
                                                y1Var42.c(i412);
                                                linearLayout22.addView(y1Var42, mf.o(32, 32));
                                                y1 y1Var52 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var2);
                                                y1Var52.e = 4;
                                                y1Var52.updateColors();
                                                y1Var52.b();
                                                y1Var52.c(i412);
                                                linearLayout22.addView(y1Var52, mf.o(32, 32));
                                                y1 y1Var62 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var2);
                                                y1Var62.e = 4;
                                                y1Var62.updateColors();
                                                y1Var62.b();
                                                y1Var62.c(i412);
                                                final y1[] y1VarArr22 = {y1Var42, y1Var52, y1Var62};
                                                linearLayout22.addView(y1Var62, mf.o(32, 32));
                                                D12.q(linearLayout3);
                                                it3 = linkedHashSet.iterator();
                                                int i422 = -1;
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                    }
                                                }
                                                it4 = linkedHashSet.iterator();
                                                int i432 = -1;
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                    }
                                                }
                                                i20 = 0;
                                                while (i20 < 3) {
                                                }
                                                i22 = 0;
                                                while (i22 < 3) {
                                                }
                                                while (i23 < 3) {
                                                }
                                                i24 = 0;
                                                while (i24 < i21) {
                                                }
                                                D12.o();
                                                D12.S = 208;
                                                if (!linkedHashSet.isEmpty()) {
                                                }
                                                z15 = false;
                                                if (!z15) {
                                                }
                                                D12.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                                                if (i16 == 0) {
                                                }
                                                if (i18 != 0) {
                                                }
                                                if (i14 != 0) {
                                                }
                                                final int i5022 = 7;
                                                if (i15 != 0) {
                                                }
                                                if (i17 == 0) {
                                                }
                                                if (i19 != 0) {
                                                }
                                                if (z14) {
                                                }
                                                D12.p = new lg.y(this, D12, n5Var2, i5022);
                                                this.r4 = D12;
                                                D12.Z();
                                            }
                                        }
                                        i12 = 0;
                                        if (z11) {
                                            hashSet3 = new HashSet();
                                            it5 = selectedCells.iterator();
                                            while (it5.hasNext()) {
                                            }
                                            if (hashSet3.size() < model.c) {
                                            }
                                        }
                                        i13 = 0;
                                        if (z13) {
                                        }
                                        if (z13) {
                                        }
                                        f60Var = this.r4;
                                        i16 = i3;
                                        if (f60Var != null) {
                                        }
                                        L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                        FrameLayout S4222 = S4(n5Var2, false);
                                        i17 = i13;
                                        iArr = new int[2];
                                        S4222.getLocationOnScreen(iArr);
                                        if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
                                        }
                                        final f60 D122 = this.p3.D1(S4);
                                        D122.s = 0;
                                        D122.t = false;
                                        D122.Z = r12;
                                        LinearLayout linearLayout32 = new LinearLayout(getContext());
                                        linearLayout32.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
                                        linearLayout32.setOrientation(r12);
                                        TextView textView22 = new TextView(getContext());
                                        textView22.setText(bd.M0(2131754057, null));
                                        textView22.setTextSize(1, 12.0f);
                                        textView22.setGravity(17);
                                        int i4022 = k6.y6;
                                        org.telegram.ui.ActionBar.e6 e6Var22 = this.o3;
                                        r6.V(textView22, i4022, e6Var22);
                                        linearLayout32.addView(textView22, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout222 = new LinearLayout(getContext());
                                        i18 = i10;
                                        i19 = i12;
                                        boolean z1822 = z10;
                                        linearLayout222.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                        linearLayout222.setOrientation(0);
                                        linearLayout32.addView(linearLayout222, mf.r(-2, -2, 17));
                                        y1 y1Var72 = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var22);
                                        y1Var72.e = 4;
                                        y1Var72.updateColors();
                                        y1Var72.b();
                                        int i4122 = k6.G8;
                                        y1Var72.c(i4122);
                                        linearLayout222.addView(y1Var72, mf.o(32, 32));
                                        y1 y1Var222 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var22);
                                        y1Var222.e = 4;
                                        y1Var222.updateColors();
                                        y1Var222.b();
                                        y1Var222.c(i4122);
                                        linearLayout222.addView(y1Var222, mf.o(32, 32));
                                        y1 y1Var322 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var22);
                                        y1Var322.e = 4;
                                        y1Var322.updateColors();
                                        y1Var322.b();
                                        y1Var322.c(i4122);
                                        final y1[] y1VarArr32 = {y1Var72, y1Var222, y1Var322};
                                        boolean z1922 = z11;
                                        linearLayout222.addView(y1Var322, mf.o(32, 32));
                                        z14 = z12;
                                        linearLayout222.addView(new Space(getContext()), mf.o(8, 0));
                                        y1 y1Var422 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var22);
                                        y1Var422.e = 4;
                                        y1Var422.updateColors();
                                        y1Var422.b();
                                        y1Var422.c(i4122);
                                        linearLayout222.addView(y1Var422, mf.o(32, 32));
                                        y1 y1Var522 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var22);
                                        y1Var522.e = 4;
                                        y1Var522.updateColors();
                                        y1Var522.b();
                                        y1Var522.c(i4122);
                                        linearLayout222.addView(y1Var522, mf.o(32, 32));
                                        y1 y1Var622 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var22);
                                        y1Var622.e = 4;
                                        y1Var622.updateColors();
                                        y1Var622.b();
                                        y1Var622.c(i4122);
                                        final y1[] y1VarArr222 = {y1Var422, y1Var522, y1Var622};
                                        linearLayout222.addView(y1Var622, mf.o(32, 32));
                                        D122.q(linearLayout32);
                                        it3 = linkedHashSet.iterator();
                                        int i4222 = -1;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                            }
                                        }
                                        it4 = linkedHashSet.iterator();
                                        int i4322 = -1;
                                        while (true) {
                                            if (!it4.hasNext()) {
                                            }
                                        }
                                        i20 = 0;
                                        while (i20 < 3) {
                                        }
                                        i22 = 0;
                                        while (i22 < 3) {
                                        }
                                        while (i23 < 3) {
                                        }
                                        i24 = 0;
                                        while (i24 < i21) {
                                        }
                                        D122.o();
                                        D122.S = 208;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z15 = false;
                                        if (!z15) {
                                        }
                                        D122.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                                        if (i16 == 0) {
                                        }
                                        if (i18 != 0) {
                                        }
                                        if (i14 != 0) {
                                        }
                                        final int i50222 = 7;
                                        if (i15 != 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (z14) {
                                        }
                                        D122.p = new lg.y(this, D122, n5Var2, i50222);
                                        this.r4 = D122;
                                        D122.Z();
                                    }
                                    z11 = false;
                                    if (selectedCells.isEmpty()) {
                                    }
                                    z12 = false;
                                    if (z12) {
                                    }
                                    if (z10) {
                                    }
                                    i11 = 1;
                                    i12 = 0;
                                    if (z11) {
                                    }
                                    i13 = 0;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    f60Var = this.r4;
                                    i16 = i3;
                                    if (f60Var != null) {
                                    }
                                    L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                    FrameLayout S42222 = S4(n5Var2, false);
                                    i17 = i13;
                                    iArr = new int[2];
                                    S42222.getLocationOnScreen(iArr);
                                    if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
                                    }
                                    final f60 D1222 = this.p3.D1(S4);
                                    D1222.s = 0;
                                    D1222.t = false;
                                    D1222.Z = r12;
                                    LinearLayout linearLayout322 = new LinearLayout(getContext());
                                    linearLayout322.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
                                    linearLayout322.setOrientation(r12);
                                    TextView textView222 = new TextView(getContext());
                                    textView222.setText(bd.M0(2131754057, null));
                                    textView222.setTextSize(1, 12.0f);
                                    textView222.setGravity(17);
                                    int i40222 = k6.y6;
                                    org.telegram.ui.ActionBar.e6 e6Var222 = this.o3;
                                    r6.V(textView222, i40222, e6Var222);
                                    linearLayout322.addView(textView222, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                    LinearLayout linearLayout2222 = new LinearLayout(getContext());
                                    i18 = i10;
                                    i19 = i12;
                                    boolean z18222 = z10;
                                    linearLayout2222.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                    linearLayout2222.setOrientation(0);
                                    linearLayout322.addView(linearLayout2222, mf.r(-2, -2, 17));
                                    y1 y1Var722 = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var222);
                                    y1Var722.e = 4;
                                    y1Var722.updateColors();
                                    y1Var722.b();
                                    int i41222 = k6.G8;
                                    y1Var722.c(i41222);
                                    linearLayout2222.addView(y1Var722, mf.o(32, 32));
                                    y1 y1Var2222 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var222);
                                    y1Var2222.e = 4;
                                    y1Var2222.updateColors();
                                    y1Var2222.b();
                                    y1Var2222.c(i41222);
                                    linearLayout2222.addView(y1Var2222, mf.o(32, 32));
                                    y1 y1Var3222 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var222);
                                    y1Var3222.e = 4;
                                    y1Var3222.updateColors();
                                    y1Var3222.b();
                                    y1Var3222.c(i41222);
                                    final y1[] y1VarArr322 = {y1Var722, y1Var2222, y1Var3222};
                                    boolean z19222 = z11;
                                    linearLayout2222.addView(y1Var3222, mf.o(32, 32));
                                    z14 = z12;
                                    linearLayout2222.addView(new Space(getContext()), mf.o(8, 0));
                                    y1 y1Var4222 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var222);
                                    y1Var4222.e = 4;
                                    y1Var4222.updateColors();
                                    y1Var4222.b();
                                    y1Var4222.c(i41222);
                                    linearLayout2222.addView(y1Var4222, mf.o(32, 32));
                                    y1 y1Var5222 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var222);
                                    y1Var5222.e = 4;
                                    y1Var5222.updateColors();
                                    y1Var5222.b();
                                    y1Var5222.c(i41222);
                                    linearLayout2222.addView(y1Var5222, mf.o(32, 32));
                                    y1 y1Var6222 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var222);
                                    y1Var6222.e = 4;
                                    y1Var6222.updateColors();
                                    y1Var6222.b();
                                    y1Var6222.c(i41222);
                                    final y1[] y1VarArr2222 = {y1Var4222, y1Var5222, y1Var6222};
                                    linearLayout2222.addView(y1Var6222, mf.o(32, 32));
                                    D1222.q(linearLayout322);
                                    it3 = linkedHashSet.iterator();
                                    int i42222 = -1;
                                    while (true) {
                                        if (!it3.hasNext()) {
                                        }
                                    }
                                    it4 = linkedHashSet.iterator();
                                    int i43222 = -1;
                                    while (true) {
                                        if (!it4.hasNext()) {
                                        }
                                    }
                                    i20 = 0;
                                    while (i20 < 3) {
                                    }
                                    i22 = 0;
                                    while (i22 < 3) {
                                    }
                                    while (i23 < 3) {
                                    }
                                    i24 = 0;
                                    while (i24 < i21) {
                                    }
                                    D1222.o();
                                    D1222.S = 208;
                                    if (!linkedHashSet.isEmpty()) {
                                    }
                                    z15 = false;
                                    if (!z15) {
                                    }
                                    D1222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                                    if (i16 == 0) {
                                    }
                                    if (i18 != 0) {
                                    }
                                    if (i14 != 0) {
                                    }
                                    final int i502222 = 7;
                                    if (i15 != 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    if (z14) {
                                    }
                                    D1222.p = new lg.y(this, D1222, n5Var2, i502222);
                                    this.r4 = D1222;
                                    D1222.Z();
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
                                i11 = 1;
                                i12 = 0;
                                if (z11) {
                                }
                                i13 = 0;
                                if (z13) {
                                }
                                if (z13) {
                                }
                                f60Var = this.r4;
                                i16 = i3;
                                if (f60Var != null) {
                                }
                                L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                FrameLayout S422222 = S4(n5Var2, false);
                                i17 = i13;
                                iArr = new int[2];
                                S422222.getLocationOnScreen(iArr);
                                if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
                                }
                                final f60 D12222 = this.p3.D1(S4);
                                D12222.s = 0;
                                D12222.t = false;
                                D12222.Z = r12;
                                LinearLayout linearLayout3222 = new LinearLayout(getContext());
                                linearLayout3222.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
                                linearLayout3222.setOrientation(r12);
                                TextView textView2222 = new TextView(getContext());
                                textView2222.setText(bd.M0(2131754057, null));
                                textView2222.setTextSize(1, 12.0f);
                                textView2222.setGravity(17);
                                int i402222 = k6.y6;
                                org.telegram.ui.ActionBar.e6 e6Var2222 = this.o3;
                                r6.V(textView2222, i402222, e6Var2222);
                                linearLayout3222.addView(textView2222, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout22222 = new LinearLayout(getContext());
                                i18 = i10;
                                i19 = i12;
                                boolean z182222 = z10;
                                linearLayout22222.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                                linearLayout22222.setOrientation(0);
                                linearLayout3222.addView(linearLayout22222, mf.r(-2, -2, 17));
                                y1 y1Var7222 = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var2222);
                                y1Var7222.e = 4;
                                y1Var7222.updateColors();
                                y1Var7222.b();
                                int i412222 = k6.G8;
                                y1Var7222.c(i412222);
                                linearLayout22222.addView(y1Var7222, mf.o(32, 32));
                                y1 y1Var22222 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var2222);
                                y1Var22222.e = 4;
                                y1Var22222.updateColors();
                                y1Var22222.b();
                                y1Var22222.c(i412222);
                                linearLayout22222.addView(y1Var22222, mf.o(32, 32));
                                y1 y1Var32222 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var2222);
                                y1Var32222.e = 4;
                                y1Var32222.updateColors();
                                y1Var32222.b();
                                y1Var32222.c(i412222);
                                final y1[] y1VarArr3222 = {y1Var7222, y1Var22222, y1Var32222};
                                boolean z192222 = z11;
                                linearLayout22222.addView(y1Var32222, mf.o(32, 32));
                                z14 = z12;
                                linearLayout22222.addView(new Space(getContext()), mf.o(8, 0));
                                y1 y1Var42222 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var2222);
                                y1Var42222.e = 4;
                                y1Var42222.updateColors();
                                y1Var42222.b();
                                y1Var42222.c(i412222);
                                linearLayout22222.addView(y1Var42222, mf.o(32, 32));
                                y1 y1Var52222 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var2222);
                                y1Var52222.e = 4;
                                y1Var52222.updateColors();
                                y1Var52222.b();
                                y1Var52222.c(i412222);
                                linearLayout22222.addView(y1Var52222, mf.o(32, 32));
                                y1 y1Var62222 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var2222);
                                y1Var62222.e = 4;
                                y1Var62222.updateColors();
                                y1Var62222.b();
                                y1Var62222.c(i412222);
                                final y1[] y1VarArr22222 = {y1Var42222, y1Var52222, y1Var62222};
                                linearLayout22222.addView(y1Var62222, mf.o(32, 32));
                                D12222.q(linearLayout3222);
                                it3 = linkedHashSet.iterator();
                                int i422222 = -1;
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                it4 = linkedHashSet.iterator();
                                int i432222 = -1;
                                while (true) {
                                    if (!it4.hasNext()) {
                                    }
                                }
                                i20 = 0;
                                while (i20 < 3) {
                                }
                                i22 = 0;
                                while (i22 < 3) {
                                }
                                while (i23 < 3) {
                                }
                                i24 = 0;
                                while (i24 < i21) {
                                }
                                D12222.o();
                                D12222.S = 208;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z15 = false;
                                if (!z15) {
                                }
                                D12222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                                if (i16 == 0) {
                                }
                                if (i18 != 0) {
                                }
                                if (i14 != 0) {
                                }
                                final int i5022222 = 7;
                                if (i15 != 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (z14) {
                                }
                                D12222.p = new lg.y(this, D12222, n5Var2, i5022222);
                                this.r4 = D12222;
                                D12222.Z();
                            }
                        }
                    }
                    z16 = true;
                    if (z16) {
                    }
                }
                i10 = 0;
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
                i11 = 1;
                i12 = 0;
                if (z11) {
                }
                i13 = 0;
                if (z13) {
                }
                if (z13) {
                }
                f60Var = this.r4;
                i16 = i3;
                if (f60Var != null) {
                }
                L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                FrameLayout S4222222 = S4(n5Var2, false);
                i17 = i13;
                iArr = new int[2];
                S4222222.getLocationOnScreen(iArr);
                if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
                }
                final f60 D122222 = this.p3.D1(S4);
                D122222.s = 0;
                D122222.t = false;
                D122222.Z = r12;
                LinearLayout linearLayout32222 = new LinearLayout(getContext());
                linearLayout32222.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
                linearLayout32222.setOrientation(r12);
                TextView textView22222 = new TextView(getContext());
                textView22222.setText(bd.M0(2131754057, null));
                textView22222.setTextSize(1, 12.0f);
                textView22222.setGravity(17);
                int i4022222 = k6.y6;
                org.telegram.ui.ActionBar.e6 e6Var22222 = this.o3;
                r6.V(textView22222, i4022222, e6Var22222);
                linearLayout32222.addView(textView22222, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                LinearLayout linearLayout222222 = new LinearLayout(getContext());
                i18 = i10;
                i19 = i12;
                boolean z1822222 = z10;
                linearLayout222222.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                linearLayout222222.setOrientation(0);
                linearLayout32222.addView(linearLayout222222, mf.r(-2, -2, 17));
                y1 y1Var72222 = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var22222);
                y1Var72222.e = 4;
                y1Var72222.updateColors();
                y1Var72222.b();
                int i4122222 = k6.G8;
                y1Var72222.c(i4122222);
                linearLayout222222.addView(y1Var72222, mf.o(32, 32));
                y1 y1Var222222 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var22222);
                y1Var222222.e = 4;
                y1Var222222.updateColors();
                y1Var222222.b();
                y1Var222222.c(i4122222);
                linearLayout222222.addView(y1Var222222, mf.o(32, 32));
                y1 y1Var322222 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var22222);
                y1Var322222.e = 4;
                y1Var322222.updateColors();
                y1Var322222.b();
                y1Var322222.c(i4122222);
                final y1[] y1VarArr32222 = {y1Var72222, y1Var222222, y1Var322222};
                boolean z1922222 = z11;
                linearLayout222222.addView(y1Var322222, mf.o(32, 32));
                z14 = z12;
                linearLayout222222.addView(new Space(getContext()), mf.o(8, 0));
                y1 y1Var422222 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var22222);
                y1Var422222.e = 4;
                y1Var422222.updateColors();
                y1Var422222.b();
                y1Var422222.c(i4122222);
                linearLayout222222.addView(y1Var422222, mf.o(32, 32));
                y1 y1Var522222 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var22222);
                y1Var522222.e = 4;
                y1Var522222.updateColors();
                y1Var522222.b();
                y1Var522222.c(i4122222);
                linearLayout222222.addView(y1Var522222, mf.o(32, 32));
                y1 y1Var622222 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var22222);
                y1Var622222.e = 4;
                y1Var622222.updateColors();
                y1Var622222.b();
                y1Var622222.c(i4122222);
                final y1[] y1VarArr222222 = {y1Var422222, y1Var522222, y1Var622222};
                linearLayout222222.addView(y1Var622222, mf.o(32, 32));
                D122222.q(linearLayout32222);
                it3 = linkedHashSet.iterator();
                int i4222222 = -1;
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                it4 = linkedHashSet.iterator();
                int i4322222 = -1;
                while (true) {
                    if (!it4.hasNext()) {
                    }
                }
                i20 = 0;
                while (i20 < 3) {
                }
                i22 = 0;
                while (i22 < 3) {
                }
                while (i23 < 3) {
                }
                i24 = 0;
                while (i24 < i21) {
                }
                D122222.o();
                D122222.S = 208;
                if (!linkedHashSet.isEmpty()) {
                }
                z15 = false;
                if (!z15) {
                }
                D122222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
                if (i16 == 0) {
                }
                if (i18 != 0) {
                }
                if (i14 != 0) {
                }
                final int i50222222 = 7;
                if (i15 != 0) {
                }
                if (i17 == 0) {
                }
                if (i19 != 0) {
                }
                if (z14) {
                }
                D122222.p = new lg.y(this, D122222, n5Var2, i50222222);
                this.r4 = D122222;
                D122222.Z();
            }
        }
        i3 = 0;
        if (size == 1) {
        }
        i10 = 0;
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
        i11 = 1;
        i12 = 0;
        if (z11) {
        }
        i13 = 0;
        if (z13) {
        }
        if (z13) {
        }
        f60Var = this.r4;
        i16 = i3;
        if (f60Var != null) {
        }
        L = org.telegram.messenger.g0.L(((i16 + 1 + i10 + (i14 != 0 ? 2 : 0) + (i15 != 0 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
        FrameLayout S42222222 = S4(n5Var2, false);
        i17 = i13;
        iArr = new int[2];
        S42222222.getLocationOnScreen(iArr);
        if (((iArr[i11] - L) - org.telegram.messenger.g0.L(8.0f) >= org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.m ? i11 : 0) != 0) {
        }
        final f60 D1222222 = this.p3.D1(S4);
        D1222222.s = 0;
        D1222222.t = false;
        D1222222.Z = r12;
        LinearLayout linearLayout322222 = new LinearLayout(getContext());
        linearLayout322222.setMinimumWidth(org.telegram.messenger.g0.L(208.0f));
        linearLayout322222.setOrientation(r12);
        TextView textView222222 = new TextView(getContext());
        textView222222.setText(bd.M0(2131754057, null));
        textView222222.setTextSize(1, 12.0f);
        textView222222.setGravity(17);
        int i40222222 = k6.y6;
        org.telegram.ui.ActionBar.e6 e6Var222222 = this.o3;
        r6.V(textView222222, i40222222, e6Var222222);
        linearLayout322222.addView(textView222222, mf.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2222222 = new LinearLayout(getContext());
        i18 = i10;
        i19 = i12;
        boolean z18222222 = z10;
        linearLayout2222222.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout2222222.setOrientation(0);
        linearLayout322222.addView(linearLayout2222222, mf.r(-2, -2, 17));
        y1 y1Var722222 = new y1(R.drawable.iv_align_horiz_left, getContext(), e6Var222222);
        y1Var722222.e = 4;
        y1Var722222.updateColors();
        y1Var722222.b();
        int i41222222 = k6.G8;
        y1Var722222.c(i41222222);
        linearLayout2222222.addView(y1Var722222, mf.o(32, 32));
        y1 y1Var2222222 = new y1(R.drawable.iv_align_horiz_middle, getContext(), e6Var222222);
        y1Var2222222.e = 4;
        y1Var2222222.updateColors();
        y1Var2222222.b();
        y1Var2222222.c(i41222222);
        linearLayout2222222.addView(y1Var2222222, mf.o(32, 32));
        y1 y1Var3222222 = new y1(R.drawable.iv_align_horiz_right, getContext(), e6Var222222);
        y1Var3222222.e = 4;
        y1Var3222222.updateColors();
        y1Var3222222.b();
        y1Var3222222.c(i41222222);
        final y1[] y1VarArr322222 = {y1Var722222, y1Var2222222, y1Var3222222};
        boolean z19222222 = z11;
        linearLayout2222222.addView(y1Var3222222, mf.o(32, 32));
        z14 = z12;
        linearLayout2222222.addView(new Space(getContext()), mf.o(8, 0));
        y1 y1Var4222222 = new y1(R.drawable.iv_align_vert_top, getContext(), e6Var222222);
        y1Var4222222.e = 4;
        y1Var4222222.updateColors();
        y1Var4222222.b();
        y1Var4222222.c(i41222222);
        linearLayout2222222.addView(y1Var4222222, mf.o(32, 32));
        y1 y1Var5222222 = new y1(R.drawable.iv_align_vert_middle, getContext(), e6Var222222);
        y1Var5222222.e = 4;
        y1Var5222222.updateColors();
        y1Var5222222.b();
        y1Var5222222.c(i41222222);
        linearLayout2222222.addView(y1Var5222222, mf.o(32, 32));
        y1 y1Var6222222 = new y1(R.drawable.iv_align_vert_bottom, getContext(), e6Var222222);
        y1Var6222222.e = 4;
        y1Var6222222.updateColors();
        y1Var6222222.b();
        y1Var6222222.c(i41222222);
        final y1[] y1VarArr2222222 = {y1Var4222222, y1Var5222222, y1Var6222222};
        linearLayout2222222.addView(y1Var6222222, mf.o(32, 32));
        D1222222.q(linearLayout322222);
        it3 = linkedHashSet.iterator();
        int i42222222 = -1;
        while (true) {
            if (!it3.hasNext()) {
            }
        }
        it4 = linkedHashSet.iterator();
        int i43222222 = -1;
        while (true) {
            if (!it4.hasNext()) {
            }
        }
        i20 = 0;
        while (i20 < 3) {
        }
        i22 = 0;
        while (i22 < 3) {
        }
        while (i23 < 3) {
        }
        i24 = 0;
        while (i24 < i21) {
        }
        D1222222.o();
        D1222222.S = 208;
        if (!linkedHashSet.isEmpty()) {
        }
        z15 = false;
        if (!z15) {
        }
        D1222222.c(!z15 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, M0, new v6(this, n5Var2, z15, 8), false);
        if (i16 == 0) {
        }
        if (i18 != 0) {
        }
        if (i14 != 0) {
        }
        final int i502222222 = 7;
        if (i15 != 0) {
        }
        if (i17 == 0) {
        }
        if (i19 != 0) {
        }
        if (z14) {
        }
        D1222222.p = new lg.y(this, D1222222, n5Var2, i502222222);
        this.r4 = D1222222;
        D1222222.Z();
    }

    @Override // org.telegram.ui.Components.l41
    public final void J1(u4.d1 d1Var) {
        int b10;
        r31 G;
        a aVar = null;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && (G = this.g3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.a4 = aVar;
        this.b4 = false;
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.u0();
        }
    }

    public final void J2() {
        h3 h3Var = this.v3;
        if (h3Var != null) {
            h3Var.f(true);
        }
        P2();
        q3();
        IdentityHashMap identityHashMap = this.h4;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((z4) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((v4) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean J3() {
        int i3;
        a B4;
        h3 h3Var = this.v3;
        return h3Var != null && h3Var.x() && (i3 = h3Var.p0) == h3Var.s0 && i3 >= 0 && i3 < this.x4.size() && h3Var.q0 == 1 && h3Var.t0 == 1 && (B4 = B4(i3)) != null && b6.p(B4.b);
    }

    public final b6 J4() {
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x()) {
            return null;
        }
        int i3 = h3Var.p0;
        int i10 = h3Var.s0;
        a B4 = B4(i3);
        if (i3 == i10 && B4 != null && D3(B4.b)) {
            return x2(i3);
        }
        return null;
    }

    public final int K2(int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            ArrayList arrayList = this.t3;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (A3((a) arrayList.get(i11))) {
                i10++;
            } else if (((a) arrayList.get(i11)).i) {
                i10--;
            }
        }
        return i10;
    }

    public final boolean K3(int i3, int i10) {
        if (i3 >= 0) {
            ArrayList arrayList = this.t3;
            if (i10 < arrayList.size() && i3 <= i10) {
                boolean z10 = false;
                while (i3 <= i10) {
                    a aVar = (a) arrayList.get(i3);
                    if (!aVar.i && !A3(aVar)) {
                        if (!aVar.k.isEmpty() || b6.p(aVar.b)) {
                            z10 = true;
                        }
                    }
                    i3++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable K4(int i3, int i10, int i11, int i12) {
        if (i3 != i11) {
            return null;
        }
        if (A3(B4(i3))) {
            h1 L2 = L2(i3);
            if (L2 != null) {
                return L2.getText();
            }
            return null;
        }
        if (J3()) {
            h1 m42 = m4(i3);
            if (m42 != null) {
                return m42.getText();
            }
            return null;
        }
        a B4 = B4(i3);
        if (B4 == null || !D3(B4.b)) {
            return null;
        }
        int l22 = l2(i3);
        if (k2.p1.C(i10, i12, l22, 0) >= k2.p1.A(i10, i12, l22, 0)) {
            return null;
        }
        b6 x22 = x2(i3);
        return x22 != null ? x22.getEditText().getText() : b6.A(B4.b);
    }

    public final h1 L2(int i3) {
        if (!A3(B4(i3))) {
            return null;
        }
        View D4 = D4(i3);
        if (D4 instanceof s0) {
            return ((s0) D4).getEditText();
        }
        return null;
    }

    public final boolean L3() {
        h3 h3Var = this.v3;
        if (h3Var != null && h3Var.x()) {
            int i3 = h3Var.p0;
            int i10 = h3Var.s0;
            if (i3 >= 0 && i10 >= 0 && i10 >= i3) {
                boolean z10 = false;
                while (i3 <= i10) {
                    a B4 = B4(i3);
                    if (B4 != null) {
                        if (F3(B4.b)) {
                            z10 = true;
                        }
                    }
                    i3++;
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
    public final boolean L4(int i3, int i10, int i11, int i12, ArrayList arrayList) {
        int i13;
        a aVar;
        CharSequence A;
        CharSequence A2;
        CharSequence subSequence;
        CharSequence subSequence2;
        g2 g2Var;
        ArrayList arrayList2;
        SpannableStringBuilder A3;
        int length;
        int i14;
        g2 g2Var2;
        if (i3 >= 0 && i10 >= 0) {
            ArrayList arrayList3 = this.t3;
            if (i3 < arrayList3.size() && i10 < arrayList3.size()) {
                if (i3 <= i10) {
                    if (i3 == i10) {
                    }
                    for (i13 = i3; i13 <= i10; i13++) {
                        a aVar2 = (a) arrayList3.get(i13);
                        if (!aVar2.i && !A3(aVar2) && !H3(aVar2.b) && !o3(aVar2.b) && !(aVar2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i3);
                    a aVar3 = (a) arrayList3.get(i10);
                    A = b6.A(aVar.b);
                    A2 = i3 != i10 ? A : b6.A(aVar3.b);
                    if (A == null) {
                        A = "";
                    }
                    if (A2 == null) {
                        A2 = "";
                    }
                    int max = Math.max(0, Math.min(i11, A.length()));
                    int max2 = Math.max(0, Math.min(i12, A2.length()));
                    subSequence = A.subSequence(0, max);
                    subSequence2 = A2.subSequence(max2, A2.length());
                    g2Var = this.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (arrayList.size() == 1 || !I3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock V3 = V3(aVar.b);
                            b6.d(V3, subSequence);
                            arrayList2.add(0, new a(V3, aVar.c, aVar.d));
                        }
                        aVar = (a) k2.p1.h(1, arrayList);
                        if (aVar != null) {
                            if (A3(aVar)) {
                                length = d6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true).length();
                            } else {
                                TL_iv.PageBlock pageBlock = aVar.b;
                                if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || F3(pageBlock)) && (A3 = b6.A(aVar.b)) != null) {
                                    length = A3.length();
                                }
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock V32 = V3(aVar3.b);
                                b6.d(V32, subSequence2);
                                arrayList2.add(new a(V32, aVar3.c, aVar3.d));
                            }
                            while (i10 >= i3) {
                                arrayList3.remove(i10);
                                i10--;
                            }
                            for (i14 = 0; i14 < arrayList2.size(); i14++) {
                                arrayList3.add(i3 + i14, (a) arrayList2.get(i14));
                            }
                        }
                        length = 0;
                        if (subSequence2.length() > 0) {
                        }
                        while (i10 >= i3) {
                        }
                        while (i14 < arrayList2.size()) {
                        }
                    } else {
                        CharSequence A5 = b6.A(((a) arrayList.get(0)).b);
                        CharSequence charSequence = A5 != null ? A5 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        b6.d(aVar.b, spannableStringBuilder);
                        while (i10 > i3) {
                            arrayList3.remove(i10);
                            i10--;
                        }
                    }
                    v4();
                    this.v3.f(false);
                    this.g3.O(false);
                    g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    post(new p2(this, aVar, length, 1));
                    return true;
                }
                i10 = i3;
                i3 = i10;
                i12 = i11;
                i11 = i12;
                while (i13 <= i10) {
                }
                aVar = (a) arrayList3.get(i3);
                a aVar32 = (a) arrayList3.get(i10);
                A = b6.A(aVar.b);
                if (i3 != i10) {
                }
                if (A == null) {
                }
                if (A2 == null) {
                }
                int max3 = Math.max(0, Math.min(i11, A.length()));
                int max22 = Math.max(0, Math.min(i12, A2.length()));
                subSequence = A.subSequence(0, max3);
                subSequence2 = A2.subSequence(max22, A2.length());
                g2Var = this.R3;
                if (g2Var != null) {
                }
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                aVar = (a) k2.p1.h(1, arrayList);
                if (aVar != null) {
                }
                length = 0;
                if (subSequence2.length() > 0) {
                }
                while (i10 >= i3) {
                }
                while (i14 < arrayList2.size()) {
                }
                v4();
                this.v3.f(false);
                this.g3.O(false);
                g2Var2 = this.R3;
                if (g2Var2 != null) {
                }
                post(new p2(this, aVar, length, 1));
                return true;
            }
        }
        return false;
    }

    public final boolean M1(a aVar, a aVar2, int i3) {
        if (D3(aVar.b)) {
            TL_iv.PageBlock pageBlock = aVar2.b;
            ArrayList arrayList = aVar2.k;
            if (D3(pageBlock)) {
                View C1 = C1(aVar2);
                if (C1 instanceof b6) {
                    h1 editText = ((b6) C1).getEditText();
                    if (editText.isFocused()) {
                        CharSequence n4 = i6.n(b6.A(aVar.b), editText.getPaint().getFontMetricsInt(), false, null, 0, F3(aVar.b) ? 0.85f : 1.0f, 0);
                        int length = n4.length();
                        Editable text = editText.getText();
                        if (text != null && n4.length() != 0) {
                            editText.d2 = true;
                            text.insert(0, n4);
                            editText.d2 = false;
                        }
                        b6.d(aVar.b, editText.getText());
                        aVar2.b = aVar.b;
                        aVar2.c = aVar.c;
                        aVar2.d = aVar.d;
                        aVar2.e = aVar.e;
                        aVar2.f = aVar.f;
                        arrayList.clear();
                        arrayList.addAll(aVar.k);
                        this.t3.remove(i3 - 1);
                        A2();
                        v4();
                        c5();
                        editText.setSelection(Math.min(length, editText.length()));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M3(int i3, int i10, int i11, int i12, int i13) {
        int length;
        int C;
        int A;
        int max;
        int max2;
        if (B3()) {
            h1 L2 = L2(i10);
            return (L2 == null || (max = Math.max(0, Math.min(Math.min(i11, i13), L2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i11, i13), L2.length()))) || (i3 & L2.c(max, max2)) == 0) ? false : true;
        }
        if (!J3()) {
            int i14 = i10;
            boolean z10 = false;
            while (i14 <= i12) {
                a B4 = B4(i14);
                if (B4 != null) {
                    TL_iv.PageBlock pageBlock = B4.b;
                    if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int l22 = l2(i14);
                        int i15 = i14 == i10 ? i11 : 0;
                        int i16 = i14 == i12 ? i13 : l22;
                        int max3 = Math.max(0, Math.min(i15, l22));
                        int max4 = Math.max(0, Math.min(i16, l22));
                        if (max3 < max4) {
                            b6 x22 = x2(i14);
                            if (x22 != null ? (x22.getStyleDelegate().c(max3, max4) & i3) != 0 : d6.i(max3, max4, i3, b6.A(B4(i14).b))) {
                                z10 = true;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i14++;
            }
            return z10;
        }
        h1 m42 = m4(i10);
        if (m42 != null && (C = k2.p1.C(i11, i13, (length = m42.length()), 0)) < (A = k2.p1.A(i11, i13, length, 0)) && (i3 & m42.c(C, A)) != 0) {
        }
    }

    public final void M4(View view) {
        u4.d1 T;
        int b10;
        if (view == null || this.h3 == null || !this.k3 || (T = T(view)) == null || (b10 = T.b()) < 0 || this.g3.H(b10) < 0) {
            return;
        }
        this.I3 = true;
        h3 h3Var = this.v3;
        if (h3Var.x()) {
            h3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.h3.t(T);
    }

    public final boolean N3(int i3, int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11;
        boolean z10 = false;
        while (i15 <= i13) {
            h1 Q4 = Q4(i10, i15);
            if (Q4 != null) {
                int length = Q4.length();
                int i16 = i15 == i11 ? i12 : 0;
                int i17 = i15 == i13 ? i14 : length;
                if (i11 == i13) {
                    i16 = Math.min(i12, i14);
                    i17 = Math.max(i12, i14);
                }
                int max = Math.max(0, Math.min(i16, length));
                int max2 = Math.max(0, Math.min(i17, length));
                if (max >= max2) {
                    continue;
                } else {
                    if ((Q4.c(max, max2) & i3) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i15++;
        }
        return z10;
    }

    public final void N4(a aVar, s sVar, ye yeVar) {
        long j10;
        z4 z4Var = (z4) this.h4.remove(sVar);
        if (z4Var != null) {
            z4Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        v4 v4Var = (v4) identityHashMap.remove(sVar);
        if (v4Var != null) {
            v4Var.a();
        }
        sVar.a = 1;
        sVar.f = 0.0f;
        v4 v4Var2 = new v4(this.n3, yeVar, new k4.j(false, this, sVar, aVar));
        identityHashMap.put(sVar, v4Var2);
        if (v4Var2.f || v4Var2.h || v4Var2.n) {
            return;
        }
        v4Var2.f = true;
        int i3 = yeVar.F;
        String str = yeVar.I;
        int i10 = yeVar.G;
        if (i3 <= 0 || i10 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                i3 = options.outWidth;
                i10 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        b20 b20Var = null;
        r8 = null;
        ArrayList arrayList = null;
        b20Var = null;
        if (i3 > 0 && i10 > 0) {
            int i11 = yeVar.J;
            if (i11 == 90 || i11 == 270) {
                int i12 = i10;
                i10 = i3;
                i3 = i12;
            }
            b20 b20Var2 = new b20();
            b20Var2.a = 0L;
            b20Var2.d = 0L;
            b20Var2.b = Math.min(3000L, yeVar.t);
            while (true) {
                j10 = b20Var2.b;
                if (j10 <= 0 || j10 >= 1000) {
                    break;
                } else {
                    b20Var2.b = j10 * 2;
                }
            }
            if (j10 <= 0) {
                b20Var2.b = 3000L;
            }
            long j11 = b20Var2.b;
            b20Var2.e = j11;
            b20Var2.f = 1;
            b20Var2.g = 0;
            b20Var2.o = str;
            b20Var2.q = (int) ((r14 / 1000.0f) * 115200.0f);
            b20Var2.r = j11;
            b20Var2.n = 30;
            b20Var2.v = j11;
            b20Var2.A = yeVar.o;
            String str2 = yeVar.k;
            if (str2 != null) {
                b20Var2.B = str2;
                ArrayList arrayList2 = yeVar.q;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = yeVar.q;
                }
                b20Var2.G = arrayList;
            } else {
                b20Var2.B = yeVar.j;
                b20Var2.G = yeVar.p;
            }
            b20Var2.I = true;
            re reVar = yeVar.A;
            if (reVar != null) {
                int i13 = reVar.k;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i10;
                    i10 = i3;
                    i3 = i14;
                }
                i3 = (int) (i3 * reVar.e);
                i10 = (int) (i10 * reVar.f);
            }
            float f10 = i3;
            float f11 = i10;
            float max = Math.max(f10 / 854.0f, f11 / 854.0f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i15 = (int) (f10 / max);
            int i16 = (int) (f11 / max);
            if (i15 % 16 != 0) {
                i15 = Math.max(1, Math.round(i15 / 16.0f)) * 16;
            }
            if (i16 % 16 != 0) {
                i16 = Math.max(1, Math.round(i16 / 16.0f)) * 16;
            }
            b20Var2.k = i15;
            b20Var2.h = i15;
            b20Var2.l = i16;
            b20Var2.i = i16;
            b20Var2.m = -1;
            b20Var2.t = true;
            b20Var2.c = 0L;
            b20Var = b20Var2;
        }
        v4Var2.d = b20Var;
        if (b20Var == null || !b20Var.c()) {
            v4Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(w7.z(4), "rich_anim_" + az.p() + ".mp4").getAbsolutePath();
        v4Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        zi ziVar = new zi(v4Var2.a, tL_message, null, false, false);
        v4Var2.c = ziVar;
        ziVar.p0 = v4Var2.d;
        hs f12 = hs.f(v4Var2.a);
        f12.b(v4Var2, hs.a2);
        f12.b(v4Var2, hs.b2);
        f12.b(v4Var2, hs.c2);
        MediaController.B().h0(v4Var2.c, false, false, false);
    }

    public final boolean O3() {
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x()) {
            return false;
        }
        int i3 = h3Var.p0;
        int i10 = h3Var.s0;
        a B4 = B4(i3);
        return i3 == i10 && B4 != null && (B4.b instanceof TL_iv.pageBlockTable);
    }

    public final void O4(a aVar, s sVar, String str, boolean z10, int i3, int i10, int i11) {
        IdentityHashMap identityHashMap = this.h4;
        z4 z4Var = (z4) identityHashMap.remove(sVar);
        if (z4Var != null) {
            z4Var.b();
        }
        z4 z4Var2 = new z4(this.n3, str, z10, i3, i10, i11, new g3(aVar, sVar, this));
        identityHashMap.put(sVar, z4Var2);
        z4Var2.d();
    }

    public final void P2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        f60 f60Var = this.r4;
        if (f60Var != null) {
            this.r4 = null;
            f60Var.u();
        }
        n5 n5Var = this.q4;
        if (n5Var != null) {
            LinkedHashSet linkedHashSet = n5Var.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                n5Var.w.invalidate();
                n5Var.v();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean P3() {
        org.telegram.messenger.p0 p0Var = hp.s1(this.n3).x7;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            i10 += T3((a) arrayList.get(i3)).size();
            i3++;
        }
        ArrayList c32 = c3();
        h2 h2Var = new h2();
        h2Var.d = i10;
        h2Var.b = c32.size() + h2Var.b;
        for (int i11 = 0; i11 < c32.size(); i11++) {
            h2.b((TL_iv.PageBlock) c32.get(i11), 1, h2Var);
        }
        return h2Var.a <= ((org.telegram.messenger.j0) p0Var.V.b).c && h2Var.b <= ((org.telegram.messenger.j0) p0Var.W.b).c && h2Var.c <= ((org.telegram.messenger.j0) p0Var.X.b).c && h2Var.d <= ((org.telegram.messenger.j0) p0Var.Y.b).c && h2Var.e <= ((org.telegram.messenger.j0) p0Var.Z.b).c;
    }

    public final Editable P4(a aVar) {
        View C1 = C1(aVar);
        return C1 instanceof b6 ? ((b6) C1).getEditText().getText() : b6.A(aVar.b);
    }

    public final h1 Q4(int i3, int i10) {
        View D4 = D4(i3);
        if (D4 instanceof n5) {
            return ((n5) D4).m(i10);
        }
        return null;
    }

    public final int[] R3(int i3) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.V3.size(); i11++) {
            int length = b6.z(((a) this.V3.get(i11)).b).length();
            if (i3 <= i10 + length) {
                return new int[]{i11, i3 - i10};
            }
            i10 += length + 1;
        }
        int size = this.V3.size() - 1;
        return new int[]{size, b6.z(((a) this.V3.get(size)).b).length()};
    }

    public final h1 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                return ((b6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int S3(int i3) {
        int i10 = 1;
        int i11 = i3 + 1;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i11 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i11);
            if (A3(aVar)) {
                i10++;
            } else if (aVar.i && i10 - 1 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public final a T2() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                b6 b6Var = (b6) childAt;
                if (b6Var.getEditText().isFocused() || (b6Var.n() && b6Var.h.isFocused())) {
                    return b6Var.getRow();
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
        int i3 = E4[0];
        int i10 = E4[1];
        if (i3 >= 0) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size() || i3 > i10) {
                return;
            }
            g2 g2Var = this.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            if (K3(i3, i10)) {
                for (int i11 = i3; i11 <= i10; i11++) {
                    a aVar = (a) arrayList.get(i11);
                    boolean z10 = aVar.i;
                    ArrayList arrayList2 = aVar.k;
                    if (!z10 && !A3(aVar)) {
                        if (b6.p(aVar.b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.b.text;
                            aVar.b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            a1.g.y(1, arrayList2);
                        }
                    }
                }
            } else {
                long a10 = o0.a();
                for (int i12 = i3; i12 <= i10; i12++) {
                    a aVar2 = (a) arrayList.get(i12);
                    boolean z11 = aVar2.i;
                    ArrayList arrayList3 = aVar2.k;
                    if (!z11 && !A3(aVar2)) {
                        if (b6.p(aVar2.b)) {
                            long a11 = o0.a();
                            TL_iv.RichText j10 = b6.j(aVar2.b);
                            if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                this.u3.put(Long.valueOf(a11), j10);
                            }
                            arrayList3.add(Long.valueOf(a11));
                            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                            pageblockparagraph2.text = aVar2.b.text;
                            aVar2.b = pageblockparagraph2;
                        }
                        arrayList3.add(0, Long.valueOf(a10));
                    }
                }
            }
            A2();
            Y3();
            v4();
            h3 h3Var = this.v3;
            boolean z12 = h3Var != null && h3Var.x();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i3, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            this.g3.O(false);
            g2 g2Var2 = this.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            if (z12) {
                post(new lg.y(this, aVar3, aVar4, 8));
            } else {
                post(new n2(this, aVar3, 9));
            }
        }
    }

    public final n5 U2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return X2((h1) findFocus);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i3, int i10, boolean z10, boolean z11) {
        a aVar2;
        g2 g2Var;
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.d();
        }
        aVar.b = pageBlock;
        aVar.c = i3;
        aVar.d = i10;
        aVar.e = z10;
        aVar.f = z11;
        v4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z12) {
            int i11 = indexOf + 1;
            if (i11 >= arrayList.size() || H3(((a) arrayList.get(i11)).b)) {
                arrayList.add(i11, new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        } else if (H3(pageBlock)) {
            if (G3(pageBlock) && aVar.g == null) {
                aVar.g = new s();
            }
            int i12 = indexOf + 1;
            if (i12 >= arrayList.size() || H3(((a) arrayList.get(i12)).b)) {
                aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(i12, aVar2);
            } else {
                aVar2 = (a) arrayList.get(i12);
            }
            if (aVar2 == aVar || z12 || H3(pageBlock) || !(findFocus() instanceof h1)) {
                this.g3.O(false);
                g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.h();
                }
                post(new n2(this, aVar2, 18));
            }
            b2();
            g2 g2Var3 = this.R3;
            if (g2Var3 != null) {
                g2Var3.h();
            }
            View C1 = C1(aVar);
            if (C1 instanceof b6) {
                b6 b6Var = (b6) C1;
                b6Var.B();
                b6Var.getEditText().setSelection(b6Var.getEditText().length());
                return;
            }
            return;
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.g3.O(false);
        g2Var = this.R3;
        if (g2Var != null) {
        }
        post(new n2(this, aVar2, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1(TL_iv.PageBlock pageBlock) {
        g2 g2Var;
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.d();
        }
        a T2 = T2();
        if (T2 == null) {
            T2 = this.k4;
        }
        ArrayList arrayList = this.t3;
        int indexOf = T2 != null ? arrayList.indexOf(T2) : -1;
        if (indexOf >= 0 && (T2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a10 = o0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) T2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a10), richText);
            }
            T2.k.add(Long.valueOf(a10));
            T2.b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = indexOf >= 0 && !T2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = T2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && T2.g == null && b6.z(pageBlock2).isEmpty()) {
                T2.b = pageBlock;
                this.k4 = T2;
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
                this.g3.O(false);
                g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.h();
                }
                post(new n2(this, T2, 1));
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
        this.k4 = T2;
        if (o3(pageBlock)) {
        }
        this.g3.O(false);
        g2Var = this.R3;
        if (g2Var != null) {
        }
        post(new n2(this, T2, 1));
    }

    public final TLRPC.Document V2(long j10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j10 == 0) {
            return null;
        }
        int i3 = 0;
        for (int i10 = 0; i10 < this.t3.size(); i10++) {
            for (s sVar : T3((a) this.t3.get(i10))) {
                if (sVar != null && (document2 = sVar.h) != null && document2.id == j10) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.s3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i3 < size) {
                TLRPC.Document document3 = arrayList.get(i3);
                i3++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = u4.a;
        synchronized (u4.class) {
            document = j10 != 0 ? (TLRPC.Document) u4.b.get(Long.valueOf(j10)) : null;
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
    
        r7 = r14.x4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0193, code lost:
    
        if (r2 >= r7.size()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0195, code lost:
    
        r7 = (mi.a) r7.get(r2);
        r12 = r7.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019f, code lost:
    
        if (r12 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a1, code lost:
    
        r0.X(r2, mi.d6.l((org.telegram.tgnet.tl.TL_iv.RichText) r14.u3.get(java.lang.Long.valueOf(r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r0.X(r2, mi.b6.z(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c4, code lost:
    
        if (mi.b6.p(r7.b) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        r7 = mi.d6.l(mi.b6.j(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d4, code lost:
    
        if (r7.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d6, code lost:
    
        r0.w0.put(65536 + r2, org.telegram.ui.Cells.h9.Y(r7));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f0, code lost:
    
        r2 = r7.size() - 1;
        r7 = (mi.a) r7.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        if (r7.t != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0207, code lost:
    
        if (mi.b6.p(r7.b) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r7 = mi.d6.l(mi.b6.j(r7.b));
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
    
        if ((r10 instanceof org.telegram.ui.Cells.g9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r10 = (org.telegram.ui.Cells.g9) r10;
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
        org.telegram.messenger.g0.r(r4);
        org.telegram.messenger.g0.h3(r4);
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
        n5 n5Var;
        int[] e52;
        int[] e53;
        boolean z10;
        boolean z11;
        int length;
        l0 l0Var;
        b6 b6Var;
        int l10;
        if (this.t3.isEmpty()) {
            return false;
        }
        h3 h3Var = this.v3;
        boolean x10 = h3Var.x();
        SparseIntArray sparseIntArray = h3Var.y0;
        org.telegram.ui.Cells.f fVar = h3Var.m0;
        g9 g9Var = null;
        if (x10) {
            int i3 = h3Var.p0;
            if (i3 == h3Var.s0) {
                View D4 = D4(i3);
                if ((D4 instanceof n5) && (((e52 = e5((n5Var = (n5) D4))) == null || h3Var.q0 != 0 || h3Var.r0 != 0 || h3Var.t0 != e52[0] || h3Var.u0 != e52[1]) && (e53 = e5(n5Var)) != null)) {
                    int i10 = e53[0];
                    int i11 = e53[1];
                    ArrayList arrayList = h3Var.A0;
                    int d02 = h3Var.d0(n5Var);
                    if (d02 >= 0 && (i10 != 0 || i11 != 0)) {
                        h3Var.W = n5Var;
                        h3Var.s0 = d02;
                        h3Var.p0 = d02;
                        h3Var.q0 = 0;
                        h3Var.t0 = i10;
                        h3Var.r0 = 0;
                        h3Var.u0 = i11;
                        h3Var.u = 0;
                        h3Var.v = i11;
                        h3Var.B0 = d02;
                        h3Var.D0 = 0;
                        h3Var.C0 = 0;
                        h3Var.h0(n5Var, d02);
                        arrayList.clear();
                        n5Var.k(arrayList);
                        if (!arrayList.isEmpty() && arrayList.size() > 0) {
                            h3Var.a = ((s9) arrayList.get(0)).getX();
                            h3Var.b = ((s9) arrayList.get(0)).getY();
                        } else if (!arrayList.isEmpty()) {
                            h3Var.a = ((s9) arrayList.get(0)).getX();
                            h3Var.b = ((s9) arrayList.get(0)).getY();
                        }
                        t9 t9Var = h3Var.C;
                        if (t9Var != null) {
                            t9Var.setVisibility(0);
                        }
                        h3Var.U();
                        h3Var.w();
                        h3Var.u();
                        org.telegram.messenger.g0.r(fVar);
                        org.telegram.messenger.g0.h3(fVar);
                        hf hfVar = h3Var.D;
                        if (hfVar != null) {
                            hfVar.a(true);
                        }
                        n5Var.invalidate();
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            h1 S2 = S2();
            if (S2 != 0 && S2.getText() != null && (length = S2.getText().length()) > 0) {
                n5 X2 = X2(S2);
                if (X2 != null) {
                    if (S2 == X2.getTitleEditText()) {
                        l10 = 0;
                    } else {
                        q5 q10 = X2.q(S2);
                        l10 = q10 != null ? X2.l(q10.b) : -1;
                    }
                    if (l10 >= 0) {
                        S2.setSelection(S2.getSelectionEnd());
                        z11 = h3Var.j0(X2, l10, 0, length);
                    }
                } else {
                    if (!(S2 instanceof l0)) {
                        ViewParent parent = S2.getParent();
                        while (true) {
                            if (parent == null) {
                                l0Var = null;
                                break;
                            }
                            if (parent instanceof l0) {
                                l0Var = (l0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        l0Var = (l0) S2;
                    }
                    if (l0Var instanceof g9) {
                        S2.setSelection(S2.getSelectionEnd());
                        z11 = h3Var.j0((g9) l0Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = S2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                b6Var = null;
                                break;
                            }
                            if (parent2 instanceof b6) {
                                b6Var = (b6) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (b6Var != null) {
                            int i12 = S2 == b6Var.getAuthorEditText() ? 1 : 0;
                            S2.setSelection(S2.getSelectionEnd());
                            z11 = h3Var.j0(b6Var, i12, 0, length);
                        }
                    }
                }
            }
            z11 = false;
        }
    }

    public final int W2(int i3, int i10) {
        while (i3 >= 0) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i3);
            if (!aVar.i) {
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    if (A3(aVar2)) {
                        i12++;
                        if (i11 == -1 && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                            i11 = i12;
                        }
                    } else if (aVar2.i) {
                        if (i11 != -1 && i12 == i11) {
                            i11 = -1;
                        }
                        i12--;
                    }
                }
                if (i11 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (!H3(pageBlock) || o3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i3;
                    }
                }
            }
            i3 += i10;
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
    public final boolean W4(View view, float f10, float f11) {
        int lineForVertical;
        int lineForVertical2;
        q5 m10;
        int lineForVertical3;
        if (view != 0) {
            h3 h3Var = this.v3;
            if (!h3Var.x()) {
                int left = (int) ((f10 - view.getLeft()) - getLeft());
                int top = (int) ((f11 - view.getTop()) - getTop());
                if (view instanceof b6) {
                    b6 b6Var = (b6) view;
                    h1 h1Var = b6Var.h;
                    h1 h1Var2 = b6Var.f;
                    LinearLayout linearLayout = b6Var.b;
                    if (b6.y(h1Var2, h1Var2.getLeft() + linearLayout.getLeft(), h1Var2.getTop() + linearLayout.getTop(), left, top) || (h1Var.getVisibility() == 0 && b6.y(h1Var, h1Var.getLeft(), h1Var.getTop(), left, top))) {
                        h3Var.k0(b6Var, left, top);
                        h3Var.l0();
                        return true;
                    }
                } else if (view instanceof n5) {
                    n5 n5Var = (n5) view;
                    m5 m5Var = n5Var.x;
                    x3 x3Var = n5Var.s;
                    p5 p5Var = n5Var.w;
                    TL_iv.pageTableCell n4 = n5Var.n(left, top);
                    if (n4 != null && (m10 = p5Var.m(n4)) != null) {
                        h1 h1Var3 = m10.a;
                        int scrollX = x3Var.getScrollX() + (((left - x3Var.getLeft()) - m5Var.getLeft()) - p5Var.getLeft());
                        int top2 = ((top - x3Var.getTop()) - m5Var.getTop()) - p5Var.getTop();
                        int left2 = (scrollX - m10.getLeft()) - h1Var3.getLeft();
                        int top3 = (top2 - m10.getTop()) - h1Var3.getTop();
                        Layout layout = h1Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - h1Var3.getPaddingTop();
                            int paddingLeft = left2 - h1Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f12 = paddingLeft;
                                if (f12 >= lineLeft) {
                                }
                            }
                        }
                    }
                    h1 h1Var4 = n5Var.r;
                    Layout layout2 = h1Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (h1Var4.getPaddingLeft() + h1Var4.getLeft());
                        int paddingTop2 = top - (h1Var4.getPaddingTop() + h1Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f13 = paddingLeft2;
                            if (f13 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof l0) {
                    if (((l0) view).a(left, top)) {
                        h3Var.k0(view, left, top);
                        h3Var.l0();
                        return true;
                    }
                } else if (view instanceof s0) {
                    s0 s0Var = (s0) view;
                    h1 h1Var5 = s0Var.d;
                    Layout layout3 = h1Var5.getLayout();
                    if (layout3 != null && h1Var5.length() != 0) {
                        int paddingLeft3 = left - (h1Var5.getPaddingLeft() + h1Var5.getLeft());
                        int paddingTop3 = top - (h1Var5.getPaddingTop() + h1Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int L = org.telegram.messenger.g0.L(24.0f);
                            int max = Math.max(0, (h1Var5.getWidth() - h1Var5.getPaddingLeft()) - h1Var5.getPaddingRight());
                            float f14 = L;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f14);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f14);
                            float f15 = paddingLeft3;
                            if (f15 >= max2 && f15 <= min) {
                                h3Var.k0(s0Var, left, top);
                                h3Var.l0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof p4) {
                    p4 p4Var = (p4) view;
                    if (p4Var.x != null) {
                        int[] iArr = new int[4];
                        p4Var.h(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            h3Var.k0(view, left, top);
                            h3Var.l0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void X1(a aVar, ye yeVar) {
        t3 t3Var;
        if (aVar != null && G3(aVar.b)) {
            String str = yeVar.h;
            if (str == null) {
                str = yeVar.I;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                s W3 = W3(yeVar, str2);
                boolean c2 = v4.c(yeVar);
                TL_iv.PageBlock pageblockvideo = (yeVar.b || c2) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (E3(aVar.b)) {
                    j3(aVar.b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(W3);
                } else {
                    s sVar = aVar.g;
                    if (sVar == null || sVar.a == 0) {
                        aVar.b = pageblockvideo;
                        aVar.g = W3;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.b.caption;
                        k0.d(pageblockcollage);
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
                this.g3.O(false);
                q4(aVar);
                if (c2) {
                    N4(aVar, W3, yeVar);
                    t3Var = this;
                } else {
                    t3Var = this;
                    t3Var.O4(aVar, W3, str2, yeVar.b, yeVar.F, yeVar.G, yeVar.E);
                }
                g2 g2Var2 = t3Var.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
                t3Var.p3.onContentChanged();
            }
        }
    }

    public final a X3(int i3, int i10) {
        while (i3 >= 0) {
            ArrayList arrayList = this.x4;
            if (i3 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i3);
            if (!aVar.i) {
                if (aVar.t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (H3(pageBlock) && !o3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i3 += i10;
        }
        return null;
    }

    public final void X4(a aVar, TL_iv.PageBlock pageBlock, int i3, int i10, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.t3;
        if (arrayList.indexOf(aVar2) < 0 || A3(aVar2) || aVar2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (pageBlock != pageBlock2 && D3(pageBlock2) && D3(pageBlock)) {
            b6 x22 = x2(arrayList.indexOf(aVar2));
            b6.d(pageBlock, x22 != null ? x22.getEditText().getText() : b6.A(aVar2.b));
            TL_iv.RichText j10 = b6.j(aVar2.b);
            if (j10 != null && b6.j(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = j10;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = j10;
                }
            }
        }
        U4(aVar2, pageBlock, i3, i10, z10, z11);
    }

    public final void Y1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.s3;
        if (richMessage2 == null) {
            this.s3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.s3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Z2(arrayList4, richMessage.blocks, this.u3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < arrayList4.size(); i3++) {
            y4((a) arrayList4.get(i3));
        }
        ArrayList arrayList5 = this.t3;
        int size = arrayList5.size();
        a T2 = T2();
        if (T2 != null && (indexOf = arrayList5.indexOf(T2)) >= 0) {
            TL_iv.PageBlock pageBlock = T2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && b6.z(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        Y3();
        v4();
        this.g3.O(false);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.onContentChanged();
        }
    }

    public final void Y2() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            KeyEvent.Callback childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                b6 b6Var = (b6) childAt;
                b6Var.f.J();
                b6Var.h.J();
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().J();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().J();
            }
        }
    }

    public final void Y3() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i3);
            if (!aVar.k.isEmpty() && b6.p(aVar.b)) {
                long a10 = o0.a();
                TL_iv.RichText j10 = b6.j(aVar.b);
                if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                    this.u3.put(Long.valueOf(a10), j10);
                }
                aVar.k.add(Long.valueOf(a10));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.b.text;
                aVar.b = pageblockparagraph;
            }
            i3++;
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

    public final a Z1(a aVar, int i3) {
        int i10;
        ArrayList arrayList = this.x4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || (i10 = indexOf + i3) < 0 || i10 >= arrayList.size()) {
            return null;
        }
        a aVar2 = (a) arrayList.get(i10);
        if (aVar2.t != 0) {
            return aVar2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Z3(a aVar, boolean z10) {
        int i3;
        g2 g2Var;
        int indexOf = this.t3.indexOf(aVar);
        if (indexOf >= 0) {
            View C1 = C1(aVar);
            if (C1 instanceof b6) {
                b6 b6Var = (b6) C1;
                if (b6Var.getEditText().isFocused()) {
                    i3 = b6Var.getEditText().getSelectionEnd();
                    g2Var = this.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    if (t3(indexOf, z10, false)) {
                        v4();
                        if (findFocus() instanceof h1) {
                            b2();
                        } else {
                            this.g3.O(false);
                        }
                        g2 g2Var2 = this.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        if (i3 < 0) {
                            return true;
                        }
                        post(new p2(this, aVar, i3, 2));
                        return true;
                    }
                }
            }
            i3 = -1;
            g2Var = this.R3;
            if (g2Var != null) {
            }
            if (t3(indexOf, z10, false)) {
            }
        }
        return false;
    }

    public final void Z4(a aVar, int i3) {
        boolean z10;
        t3 t3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = a5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i3 == 0) {
            X4(aVar2, aVar2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.c);
        int max2 = i3 == 2 ? Math.max(1, aVar2.d) : 0;
        boolean z11 = i3 == 3;
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z11 && aVar2.f) {
            z10 = true;
            pageBlock = pageBlock2;
            t3Var = this;
        } else {
            z10 = false;
            t3Var = this;
            pageBlock = pageBlock2;
        }
        t3Var.X4(aVar2, pageBlock, max, max2, z11, z10);
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
    
        if (r8 <= 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        if (K2(r8) <= 0) goto L276;
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
    
        if (r12 >= r5.size()) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (K2(r12) <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r13 = (mi.a) r5.get(r4);
        r7 = (mi.a) r5.get(r6);
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
    
        if (r4 >= r25.length) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0143, code lost:
    
        if (r4 <= 0) goto L282;
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
        r4 = r20.R3;
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
    
        r4 = mi.b6.z(r13.b);
        r1 = r4.substring(0, java.lang.Math.max(0, java.lang.Math.min(r1, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0176, code lost:
    
        if (r18 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        r4 = mi.b6.z(r7.b);
        r15 = r4.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        mi.b6.e(r13.b, r1 + r3 + r15);
        r5.subList(r8 + 1, r12).clear();
        r1 = r3.length() + r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0222, code lost:
    
        if (r5.isEmpty() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0224, code lost:
    
        r13 = new mi.a(new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph(), r6, r6);
        r5.add(r13);
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0232, code lost:
    
        v4();
        r11.f(r6);
        r14.O(r6);
        r2 = r20.R3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x023d, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x023f, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0242, code lost:
    
        post(new mi.p2(r20, r13, r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024b, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ba, code lost:
    
        if (r18 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        r1 = mi.b6.z(r7.b);
        r1 = r1.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r1.length())));
        mi.b6.e(r7.b, r3 + r1);
        r5.subList(r8, r9).clear();
        r1 = r3.length();
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
    
        r5.subList(r8, r12).clear();
        r1 = new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph();
        r2 = new org.telegram.tgnet.tl.TL_iv.textPlain();
        r2.text = r3;
        r1.text = r2;
        r6 = 0;
        r13 = new mi.a(r1, 0, 0);
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
    public final boolean a2(int i3, int i10, int i11, int i12, String[] strArr) {
        String str;
        n5 n5Var;
        f6 model;
        int max;
        int length;
        int length2;
        int i13 = i10;
        int i14 = i12;
        a B4 = B4(i3);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(i11));
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
            return false;
        }
        a aVar = (a) arrayList.get(indexOf);
        a aVar2 = (a) arrayList.get(indexOf2);
        h3 h3Var = this.v3;
        int i15 = 1;
        if (indexOf == indexOf2 && A3(aVar)) {
            View C1 = C1(aVar);
            if (!(C1 instanceof s0) || !(aVar.b instanceof TL_iv.pageBlockDetails)) {
                return true;
            }
            h1 editText = ((s0) C1).getEditText();
            g2 g2Var = this.R3;
            if (g2Var != null) {
                g2Var.d();
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i16 = 0; i16 < strArr.length; i16++) {
                if (i16 > 0) {
                    sb2.append(' ');
                }
                sb2.append(strArr[i16]);
            }
            String sb3 = sb2.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editText.getText());
            int length3 = spannableStringBuilder.length();
            int C = k2.p1.C(i13, i14, length3, 0);
            spannableStringBuilder.replace(C, k2.p1.A(i13, i14, length3, 0), (CharSequence) sb3);
            editText.setTextSilently(spannableStringBuilder);
            editText.f();
            ((TL_iv.pageBlockDetails) aVar.b).title = d6.f(spannableStringBuilder);
            int length4 = sb3.length() + C;
            h3Var.f(false);
            g2 g2Var2 = this.R3;
            if (g2Var2 != null) {
                g2Var2.h();
            }
            post(new u2(editText, length4, 0));
            return true;
        }
        int i17 = indexOf;
        while (true) {
            f41 f41Var = this.g3;
            str = "";
            if (i17 > indexOf2) {
                int i18 = i15;
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                TL_iv.PageBlock pageBlock = aVar.b;
                boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                boolean z11 = aVar2.b instanceof TL_iv.pageBlockTable;
                r3 r3Var = this.p3;
                if (z10 || z11) {
                    if (z10 && z11 && indexOf == indexOf2) {
                        int i19 = h3Var.q0;
                        int i20 = h3Var.t0;
                        View C12 = C1(aVar);
                        if ((C12 instanceof n5) && (model = (n5Var = (n5) C12).getModel()) != null) {
                            ArrayList arrayList2 = model.g;
                            if (i19 == 0 && i20 == 0) {
                                TL_iv.PageBlock pageBlock2 = aVar.b;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    g2 g2Var4 = this.R3;
                                    if (g2Var4 != null) {
                                        g2Var4.d();
                                    }
                                    String l10 = d6.l(pageblocktable.title);
                                    int max2 = Math.max(0, Math.min(Math.min(i13, i14), l10.length()));
                                    int max3 = Math.max(0, Math.min(Math.max(i13, i14), l10.length()));
                                    StringBuilder sb4 = new StringBuilder();
                                    for (int i21 = 0; i21 < strArr.length; i21++) {
                                        if (i21 > 0) {
                                            sb4.append(' ');
                                        }
                                        sb4.append(strArr[i21]);
                                    }
                                    String sb5 = sb4.toString();
                                    String str2 = l10.substring(0, max2) + sb5 + l10.substring(max3);
                                    TL_iv.textPlain textplain = new TL_iv.textPlain();
                                    textplain.text = str2;
                                    pageblocktable.title = textplain;
                                    h1 titleEditText = n5Var.getTitleEditText();
                                    titleEditText.setTextSilently(str2);
                                    titleEditText.f();
                                    int length5 = sb5.length() + max2;
                                    h3Var.f(false);
                                    g2 g2Var5 = this.R3;
                                    if (g2Var5 != null) {
                                        g2Var5.h();
                                    }
                                    r3Var.onContentChanged();
                                    post(new u2(titleEditText, length5, 4));
                                    return true;
                                }
                            } else {
                                int i22 = i19 - 1;
                                int i23 = i20 - 1;
                                int size = arrayList2.size();
                                if (i22 >= 0 && i22 < size && i23 >= 0 && i23 < size) {
                                    g2 g2Var6 = this.R3;
                                    if (g2Var6 != null) {
                                        g2Var6.d();
                                    }
                                    if (i22 > i23 || (i22 == i23 && i13 > i14)) {
                                        i14 = i13;
                                        i13 = i14;
                                        i23 = i22;
                                        i22 = i23;
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    for (int i24 = 0; i24 < strArr.length; i24++) {
                                        if (i24 > 0) {
                                            sb6.append('\n');
                                        }
                                        sb6.append(strArr[i24]);
                                    }
                                    String sb7 = sb6.toString();
                                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i22);
                                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i23);
                                    if (i22 == i23) {
                                        String g7 = f6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i13, g7.length()));
                                        String str3 = g7.substring(0, max) + sb7 + g7.substring(Math.max(0, Math.min(i14, g7.length())));
                                        f6.c(pagetablecell, str3);
                                        q5 m10 = n5Var.getGrid().m(pagetablecell);
                                        if (m10 != null) {
                                            m10.a.setTextSilently(str3);
                                        }
                                        length = sb7.length();
                                    } else {
                                        String g10 = f6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i13, g10.length()));
                                        String str4 = g10.substring(0, max) + sb7;
                                        f6.c(pagetablecell, str4);
                                        q5 m11 = n5Var.getGrid().m(pagetablecell);
                                        if (m11 != null) {
                                            m11.a.setTextSilently(str4);
                                        }
                                        for (int i25 = i22 + 1; i25 < i23; i25++) {
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i25);
                                            f6.c(pagetablecell3, "");
                                            q5 m12 = n5Var.getGrid().m(pagetablecell3);
                                            if (m12 != null) {
                                                m12.a.setTextSilently("");
                                            }
                                        }
                                        String g11 = f6.g(pagetablecell2);
                                        String substring = g11.substring(Math.max(0, Math.min(i14, g11.length())));
                                        f6.c(pagetablecell2, substring);
                                        q5 m13 = n5Var.getGrid().m(pagetablecell2);
                                        if (m13 != null) {
                                            m13.a.setTextSilently(substring);
                                        }
                                        length = sb7.length();
                                    }
                                    int i26 = length + max;
                                    h3Var.f(false);
                                    g2 g2Var7 = this.R3;
                                    if (g2Var7 != null) {
                                        g2Var7.h();
                                    }
                                    post(new ai.e3(n5Var, pagetablecell, i26, 21));
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
                        if (C13 instanceof l0) {
                            l0 l0Var = (l0) C13;
                            h1 captionEditText = l0Var.getCaptionEditText();
                            g2 g2Var8 = this.R3;
                            if (g2Var8 != null) {
                                g2Var8.d();
                            }
                            StringBuilder sb8 = new StringBuilder();
                            for (int i27 = 0; i27 < strArr.length; i27++) {
                                if (i27 > 0) {
                                    sb8.append(' ');
                                }
                                sb8.append(strArr[i27]);
                            }
                            String sb9 = sb8.toString();
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(captionEditText.getText());
                            int length6 = spannableStringBuilder2.length();
                            int C2 = k2.p1.C(i13, i14, length6, 0);
                            spannableStringBuilder2.replace(C2, k2.p1.A(i13, i14, length6, 0), (CharSequence) sb9);
                            captionEditText.setTextSilently(spannableStringBuilder2);
                            captionEditText.f();
                            l0Var.b();
                            int length7 = sb9.length() + C2;
                            h3Var.f(false);
                            g2 g2Var9 = this.R3;
                            if (g2Var9 != null) {
                                g2Var9.h();
                            }
                            post(new u2(captionEditText, length7, 2));
                            return true;
                        }
                    }
                    return false;
                }
                if (indexOf != indexOf2 || !b6.p(aVar.b) || h3Var.q0 != i18 || h3Var.t0 != i18) {
                    CharSequence A = b6.A(aVar.b);
                    CharSequence A2 = indexOf == indexOf2 ? A : b6.A(aVar2.b);
                    if (A == null) {
                        A = "";
                    }
                    if (A2 == null) {
                        A2 = "";
                    }
                    int max4 = Math.max(0, Math.min(i13, A.length()));
                    int max5 = Math.max(0, Math.min(i14, A2.length()));
                    CharSequence subSequence = A.subSequence(0, max4);
                    CharSequence subSequence2 = A2.subSequence(max5, A2.length());
                    if (strArr.length <= 1) {
                        str = strArr.length != 0 ? strArr[0] : "";
                        b6.d(aVar.b, new SpannableStringBuilder(subSequence).append((CharSequence) str).append(subSequence2));
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        length2 = str.length() + subSequence.length();
                    } else {
                        b6.d(aVar.b, new SpannableStringBuilder(subSequence).append((CharSequence) strArr[0]));
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        for (int i28 = 1; i28 < strArr.length - 1; i28++) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            String str5 = strArr[i28];
                            TL_iv.textPlain textplain2 = new TL_iv.textPlain();
                            textplain2.text = str5;
                            pageblockparagraph.text = textplain2;
                            int i29 = indexOf + i28;
                            int i30 = aVar.c;
                            int i31 = aVar.d;
                            if (i31 > 0) {
                                i31 += i28;
                            }
                            arrayList.add(i29, new a(pageblockparagraph, i30, i31));
                        }
                        String str6 = strArr[strArr.length - 1];
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        b6.d(pageblockparagraph2, new SpannableStringBuilder(str6).append(subSequence2));
                        int length8 = (strArr.length + indexOf) - 1;
                        int i32 = aVar.c;
                        int i33 = aVar.d;
                        if (i33 > 0) {
                            i33 = (i33 + strArr.length) - 1;
                        }
                        arrayList.add(length8, new a(pageblockparagraph2, i32, i33));
                        indexOf = (indexOf + strArr.length) - 1;
                        length2 = str6.length();
                    }
                    v4();
                    a aVar3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (a) arrayList.get(indexOf);
                    h3Var.f(false);
                    f41Var.O(false);
                    g2 g2Var10 = this.R3;
                    if (g2Var10 != null) {
                        g2Var10.h();
                    }
                    post(new p2(this, aVar3, length2, 0));
                    return true;
                }
                View C14 = C1(aVar);
                if (C14 instanceof b6) {
                    b6 b6Var = (b6) C14;
                    h1 authorEditText = b6Var.getAuthorEditText();
                    g2 g2Var11 = this.R3;
                    if (g2Var11 != null) {
                        g2Var11.d();
                    }
                    StringBuilder sb10 = new StringBuilder();
                    for (int i34 = 0; i34 < strArr.length; i34++) {
                        if (i34 > 0) {
                            sb10.append(' ');
                        }
                        sb10.append(strArr[i34]);
                    }
                    String sb11 = sb10.toString();
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(authorEditText.getText());
                    int length9 = spannableStringBuilder3.length();
                    int C3 = k2.p1.C(i13, i14, length9, 0);
                    spannableStringBuilder3.replace(C3, k2.p1.A(i13, i14, length9, 0), (CharSequence) sb11);
                    authorEditText.setTextSilently(spannableStringBuilder3);
                    authorEditText.f();
                    b6Var.w();
                    int length10 = sb11.length() + C3;
                    h3Var.f(false);
                    g2 g2Var12 = this.R3;
                    if (g2Var12 != null) {
                        g2Var12.h();
                    }
                    r3Var.onContentChanged();
                    post(new u2(authorEditText, length10, 1));
                    return true;
                }
                return true;
            }
            boolean z12 = i15;
            if (((a) arrayList.get(i17)).i || A3((a) arrayList.get(i17))) {
                break;
            }
            i17++;
            i15 = z12 ? 1 : 0;
        }
    }

    public final void a4() {
        int length;
        int C;
        int A;
        int length2;
        int C2;
        int A2;
        int length3;
        int C3;
        int A3;
        int length4;
        int C4;
        int A5;
        h1 Q4;
        int length5;
        int C5;
        int A6;
        boolean O3 = O3();
        h3 h3Var = this.v3;
        if (O3) {
            int i3 = h3Var.p0;
            int i10 = h3Var.q0;
            if (i10 == h3Var.t0 && (Q4 = Q4(i3, i10)) != null && (C5 = k2.p1.C(h3Var.r0, h3Var.u0, (length5 = Q4.length()), 0)) < (A6 = k2.p1.A(h3Var.r0, h3Var.u0, length5, 0))) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (d6.h(Q4.getText(), C5, A6)) {
                    d6.n(Q4.getText(), C5, A6);
                    Q4.f();
                    j4(i3, i10);
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    r4();
                }
                Q4.P1 = C5;
                Q4.Q1 = A6;
                Q4.B();
                return;
            }
            return;
        }
        if (B3()) {
            int i11 = h3Var.p0;
            h1 L2 = L2(i11);
            if (L2 != null && (C4 = k2.p1.C(h3Var.r0, h3Var.u0, (length4 = L2.length()), 0)) < (A5 = k2.p1.A(h3Var.r0, h3Var.u0, length4, 0))) {
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                if (d6.h(L2.getText(), C4, A5)) {
                    d6.n(L2.getText(), C4, A5);
                    L2.f();
                    h4(i11);
                    g2 g2Var4 = this.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    r4();
                }
                L2.P1 = C4;
                L2.Q1 = A5;
                L2.B();
                return;
            }
            return;
        }
        if (z3()) {
            int i12 = h3Var.p0;
            h1 v22 = v2(i12);
            if (v22 != null && (C3 = k2.p1.C(h3Var.r0, h3Var.u0, (length3 = v22.length()), 0)) < (A3 = k2.p1.A(h3Var.r0, h3Var.u0, length3, 0))) {
                g2 g2Var5 = this.R3;
                if (g2Var5 != null) {
                    g2Var5.d();
                }
                if (d6.h(v22.getText(), C3, A3)) {
                    d6.n(v22.getText(), C3, A3);
                    v22.f();
                    g4(i12);
                    g2 g2Var6 = this.R3;
                    if (g2Var6 != null) {
                        g2Var6.h();
                    }
                    r4();
                }
                v22.P1 = C3;
                v22.Q1 = A3;
                v22.B();
                return;
            }
            return;
        }
        if (J3()) {
            int i13 = h3Var.p0;
            h1 m42 = m4(i13);
            if (m42 != null && (C2 = k2.p1.C(h3Var.r0, h3Var.u0, (length2 = m42.length()), 0)) < (A2 = k2.p1.A(h3Var.r0, h3Var.u0, length2, 0))) {
                g2 g2Var7 = this.R3;
                if (g2Var7 != null) {
                    g2Var7.d();
                }
                if (d6.h(m42.getText(), C2, A2)) {
                    d6.n(m42.getText(), C2, A2);
                    m42.f();
                    i4(i13);
                    g2 g2Var8 = this.R3;
                    if (g2Var8 != null) {
                        g2Var8.h();
                    }
                    r4();
                }
                m42.P1 = C2;
                m42.Q1 = A2;
                m42.B();
                return;
            }
            return;
        }
        b6 J4 = J4();
        if (J4 != null && (C = k2.p1.C(h3Var.r0, h3Var.u0, (length = J4.getEditText().length()), 0)) < (A = k2.p1.A(h3Var.r0, h3Var.u0, length, 0))) {
            g2 g2Var9 = this.R3;
            if (g2Var9 != null) {
                g2Var9.d();
            }
            if (d6.h(J4.getEditText().getText(), C, A)) {
                d6.n(J4.getEditText().getText(), C, A);
                J4.getEditText().f();
                J4.x();
                g2 g2Var10 = this.R3;
                if (g2Var10 != null) {
                    g2Var10.h();
                }
                r4();
            }
            h1 editText = J4.getEditText();
            editText.P1 = C;
            editText.Q1 = A;
            J4.getEditText().B();
        }
    }

    public final a a5() {
        h3 h3Var;
        int i3;
        a T2 = T2();
        return (T2 == null && (h3Var = this.v3) != null && h3Var.x() && (i3 = h3Var.p0) == h3Var.s0) ? B4(i3) : T2;
    }

    public final void b2() {
        b6 b6Var;
        a aVar;
        y5 y5Var;
        this.g3.T();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof b6) && (aVar = (b6Var = (b6) childAt).y) != null && (y5Var = b6Var.E) != null) {
                b6Var.f(aVar, y5Var, b6Var.F);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList b3(int i3, int i10, int i11, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        boolean z11;
        t3 t3Var;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = i3;
        while (i14 < i10) {
            ArrayList arrayList2 = this.t3;
            a aVar = (a) arrayList2.get(i14);
            boolean z12 = aVar.i;
            ArrayList arrayList3 = aVar.k;
            if (z12) {
                i14++;
            } else if (arrayList3.size() > i11) {
                Long l10 = (Long) arrayList3.get(i11);
                long longValue = l10.longValue();
                int i15 = i14 + 1;
                while (i15 < i10) {
                    a aVar2 = (a) arrayList2.get(i15);
                    if (aVar2.k.size() <= i11 || ((Long) aVar2.k.get(i11)).longValue() != longValue) {
                        break;
                    }
                    i15++;
                }
                ArrayList<TL_iv.PageBlock> b32 = b3(i14, i15, i11 + 1, true);
                if (b32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.u3.get(l10);
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
                i14 = i15;
            } else if (A3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int S3 = S3(i14);
                pageblockdetails.blocks = b3(i14 + 1, Math.min(S3, i10), i11, true);
                arrayList.add(pageblockdetails);
                i14 = S3 + 1;
            } else {
                int i16 = aVar.c;
                if (i16 <= 0) {
                    M2(arrayList, aVar);
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    int[] iArr = {i14};
                    if (aVar.d > 0) {
                        z11 = true;
                        i12 = i10;
                        i13 = i11;
                        t3Var = this;
                    } else {
                        z11 = false;
                        t3Var = this;
                        i12 = i10;
                        i13 = i11;
                    }
                    TL_iv.PageBlock n22 = t3Var.n2(i14, i16, i12, i13, z11, iArr);
                    if (n22 != null) {
                        arrayList.add(n22);
                    }
                    int i17 = iArr[0];
                    i14 = i17 <= 0 ? i12 : i17;
                }
                i10 = i12;
                i11 = i13;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && C3((TL_iv.PageBlock) k2.p1.h(1, arrayList))) {
                a1.g.y(1, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b4(int i3) {
        g2 g2Var;
        int i10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        int length;
        int C;
        int A;
        int length2;
        int C2;
        int A2;
        int length3;
        int C3;
        int A3;
        g2 g2Var2;
        int i12;
        h3 h3Var = this.v3;
        if (h3Var != null && h3Var.x()) {
            boolean O3 = O3();
            r3 r3Var = this.p3;
            int i13 = 0;
            if (O3) {
                int i14 = h3Var.p0;
                int i15 = h3Var.q0;
                int i16 = h3Var.t0;
                int i17 = h3Var.r0;
                int i18 = h3Var.u0;
                boolean N3 = N3(i3, i14, i15, i17, i16, i18);
                int z22 = !N3 ? z2(i3) : 0;
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                this.Q3 = true;
                int i19 = i15;
                boolean z11 = false;
                while (i19 <= i16) {
                    h1 Q4 = Q4(i14, i19);
                    if (Q4 == null) {
                        i12 = i15;
                    } else {
                        int length4 = Q4.length();
                        int i20 = i19 == i15 ? i17 : 0;
                        int i21 = i19 == i16 ? i18 : length4;
                        if (i15 == i16) {
                            i20 = Math.min(i17, i18);
                            i21 = Math.max(i17, i18);
                        }
                        int i22 = i20;
                        i12 = i15;
                        int max = Math.max(0, Math.min(i22, length4));
                        int max2 = Math.max(0, Math.min(i21, length4));
                        if (max < max2) {
                            if (N3) {
                                Q4.b(i3, max, max2);
                            } else {
                                if (z22 != 0) {
                                    Q4.b(z22, max, max2);
                                }
                                Q4.a(i3, max, max2);
                            }
                            Q4.f();
                            Q4.requestLayout();
                            j4(i14, i19);
                            z11 = true;
                        }
                    }
                    i19++;
                    i15 = i12;
                }
                this.Q3 = false;
                if (z11 && (g2Var2 = this.R3) != null) {
                    g2Var2.h();
                }
                r3Var.a0();
                if (z11) {
                    r4();
                }
            } else if (B3()) {
                int i23 = h3Var.p0;
                h1 L2 = L2(i23);
                if (L2 != null && (C3 = k2.p1.C(h3Var.r0, h3Var.u0, (length3 = L2.length()), 0)) < (A3 = k2.p1.A(h3Var.r0, h3Var.u0, length3, 0))) {
                    boolean z12 = (L2.c(C3, A3) & i3) == 0;
                    g2 g2Var4 = this.R3;
                    if (g2Var4 != null) {
                        g2Var4.d();
                    }
                    this.Q3 = true;
                    if (z12) {
                        int z23 = z2(i3);
                        if (z23 != 0) {
                            L2.b(z23, C3, A3);
                        }
                        L2.a(i3, C3, A3);
                    } else {
                        L2.b(i3, C3, A3);
                    }
                    this.Q3 = false;
                    h4(i23);
                    L2.f();
                    L2.requestLayout();
                    g2 g2Var5 = this.R3;
                    if (g2Var5 != null) {
                        g2Var5.h();
                    }
                    r3Var.a0();
                    r4();
                }
            } else if (z3()) {
                int i24 = h3Var.p0;
                h1 v22 = v2(i24);
                if (v22 != null && (C2 = k2.p1.C(h3Var.r0, h3Var.u0, (length2 = v22.length()), 0)) < (A2 = k2.p1.A(h3Var.r0, h3Var.u0, length2, 0))) {
                    boolean z13 = (v22.c(C2, A2) & i3) == 0;
                    int z24 = z13 ? z2(i3) : 0;
                    g2 g2Var6 = this.R3;
                    if (g2Var6 != null) {
                        g2Var6.d();
                    }
                    this.Q3 = true;
                    if (z13) {
                        if (z24 != 0) {
                            v22.b(z24, C2, A2);
                        }
                        v22.a(i3, C2, A2);
                    } else {
                        v22.b(i3, C2, A2);
                    }
                    v22.f();
                    v22.requestLayout();
                    g4(i24);
                    this.Q3 = false;
                    g2 g2Var7 = this.R3;
                    if (g2Var7 != null) {
                        g2Var7.h();
                    }
                    r3Var.a0();
                    r4();
                }
            } else if (J3()) {
                int i25 = h3Var.p0;
                h1 m42 = m4(i25);
                if (m42 != null && (C = k2.p1.C(h3Var.r0, h3Var.u0, (length = m42.length()), 0)) < (A = k2.p1.A(h3Var.r0, h3Var.u0, length, 0))) {
                    boolean z14 = (m42.c(C, A) & i3) == 0;
                    int z25 = z14 ? z2(i3) : 0;
                    g2 g2Var8 = this.R3;
                    if (g2Var8 != null) {
                        g2Var8.d();
                    }
                    this.Q3 = true;
                    if (z14) {
                        if (z25 != 0) {
                            m42.b(z25, C, A);
                        }
                        m42.a(i3, C, A);
                    } else {
                        m42.b(i3, C, A);
                    }
                    m42.f();
                    m42.requestLayout();
                    i4(i25);
                    this.Q3 = false;
                    g2 g2Var9 = this.R3;
                    if (g2Var9 != null) {
                        g2Var9.h();
                    }
                    r3Var.a0();
                    r4();
                }
            } else {
                int i26 = h3Var.p0;
                int i27 = h3Var.s0;
                int i28 = h3Var.r0;
                int i29 = h3Var.u0;
                if (i26 >= 0 && i27 >= 0 && i27 >= i26 && i27 < this.x4.size()) {
                    int i30 = i3;
                    boolean M3 = M3(i30, i26, i28, i27, i29);
                    boolean z15 = !M3;
                    int z26 = !M3 ? z2(i30) : 0;
                    g2 g2Var10 = this.R3;
                    if (g2Var10 != null) {
                        g2Var10.d();
                    }
                    this.Q3 = true;
                    int i31 = i26;
                    boolean z16 = false;
                    while (i31 <= i27) {
                        a B4 = B4(i31);
                        if (B4 != null) {
                            TL_iv.PageBlock pageBlock = B4.b;
                            if (D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int l22 = l2(i31);
                                int i32 = i31 == i26 ? i28 : i13;
                                z10 = z16;
                                int i33 = i31 == i27 ? i29 : l22;
                                int max3 = Math.max(i13, Math.min(i32, l22));
                                int max4 = Math.max(i13, Math.min(i33, l22));
                                if (max3 >= max4) {
                                    i10 = z26;
                                    z16 = z10;
                                    i31++;
                                    i30 = i3;
                                    z26 = i10;
                                    i13 = 0;
                                } else {
                                    b6 x22 = x2(i31);
                                    if (x22 != null) {
                                        org.telegram.ui.ActionBar.j4 styleDelegate = x22.getStyleDelegate();
                                        if (M3) {
                                            styleDelegate.b(i30, max3, max4);
                                        } else {
                                            if (z26 != 0) {
                                                styleDelegate.b(z26, max3, max4);
                                            }
                                            styleDelegate.a(i30, max3, max4);
                                        }
                                        x22.getEditText().f();
                                        x22.getEditText().requestLayout();
                                        x22.x();
                                        i10 = z26;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(b6.A(B4.b));
                                        if (M3 || z26 == 0) {
                                            i10 = z26;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i11 = max3;
                                        } else {
                                            i10 = z26;
                                            i11 = max3;
                                            d6.o(spannableStringBuilder2, i11, max4, i10, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        d6.o(spannableStringBuilder, i11, max4, i30, z15, null);
                                        b6.d(B4.b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i31++;
                                    i30 = i3;
                                    z26 = i10;
                                    i13 = 0;
                                }
                            }
                        }
                        i10 = z26;
                        z10 = z16;
                        z16 = z10;
                        i31++;
                        i30 = i3;
                        z26 = i10;
                        i13 = 0;
                    }
                    boolean z17 = z16;
                    this.Q3 = i13;
                    if (z17 && (g2Var = this.R3) != null) {
                        g2Var.h();
                    }
                    r3Var.a0();
                    if (z17) {
                        r4();
                    }
                }
            }
        }
    }

    public final void b5(float f10, float f11) {
        TL_iv.pageTableCell n4;
        n5 n5Var = this.q4;
        if (!this.J3 || n5Var == null || this.F3 != n5Var || (n4 = n5Var.n((int) ((f10 - n5Var.getLeft()) - getLeft()), (int) ((f11 - n5Var.getTop()) - getTop()))) == null || n4 == this.M3) {
            return;
        }
        this.M3 = n4;
        n5Var.y(this.L3, n4);
    }

    public final boolean c2(int i3, int i10) {
        h3 h3Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i3, i10));
            int max2 = Math.max(0, Math.max(i3, i10));
            int[] R3 = R3(max);
            int[] R32 = R3(max2);
            a aVar = (a) this.V3.get(R3[0]);
            if (R3[0] == R32[0] || max == max2) {
                View C1 = C1(aVar);
                if (C1 instanceof b6) {
                    b6 b6Var = (b6) C1;
                    b6Var.B();
                    h1 editText = b6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(R3[1], length), Math.min(R32[1], length));
                }
            } else {
                View C12 = C1(aVar);
                View C13 = C1(this.V3.get(R32[0]));
                if ((C12 instanceof b6) && (C13 instanceof b6)) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        h3Var = this.v3;
                        if (i11 >= size) {
                            break;
                        }
                        h3Var.X(i11, b6.z(((a) arrayList2.get(i11)).b));
                        i11++;
                    }
                    b6 b6Var2 = (b6) C12;
                    int length2 = b6Var2.getEditText().length();
                    if (R3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!h3Var.j0(b6Var2, 0, R3[1], length2)) {
                        b6Var2.B();
                        return true;
                    }
                    h3Var.b0(0, R32[1], (b6) C13);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList c3() {
        return b3(0, this.t3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c4(View view) {
        h1 editText;
        h1 h1Var;
        t3 t3Var;
        s3 s3Var = null;
        if (o2()) {
            boolean O3 = O3();
            h3 h3Var = this.v3;
            if (O3) {
                int i3 = h3Var.p0;
                int i10 = h3Var.q0;
                if (i10 == h3Var.t0) {
                    editText = Q4(i3, i10);
                    h1Var = editText;
                    if (h1Var != null) {
                        int length = h1Var.length();
                        t3Var = this;
                        s3Var = new s3(t3Var, h1Var, k2.p1.C(h3Var.r0, h3Var.u0, length, 0), k2.p1.A(h3Var.r0, h3Var.u0, length, 0), null);
                    }
                }
            } else {
                if (B3()) {
                    editText = L2(h3Var.p0);
                } else if (z3()) {
                    editText = v2(h3Var.p0);
                } else if (J3()) {
                    editText = m4(h3Var.p0);
                } else {
                    b6 J4 = J4();
                    if (J4 != null) {
                        editText = J4.getEditText();
                    }
                }
                h1Var = editText;
                if (h1Var != null) {
                }
            }
            if (s3Var == null) {
                r3(false);
                t3Var.p3.W(s3Var, view);
                return;
            }
            return;
        }
        t3Var = this;
        if (s3Var == null) {
        }
    }

    public final void c5() {
        b6 b6Var;
        a aVar;
        y5 y5Var;
        u4.m0 itemAnimator = getItemAnimator();
        setItemAnimator(null);
        this.g3.O(true);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt instanceof b6) && (aVar = (b6Var = (b6) childAt).y) != null && (y5Var = b6Var.E) != null) {
                b6Var.f(aVar, y5Var, b6Var.F);
            }
        }
        post(new x2(this, itemAnimator, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d2() {
        int i3;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList6 = this.t3;
            if (i14 >= arrayList6.size()) {
                return;
            }
            a aVar = (a) arrayList6.get(i14);
            ArrayList arrayList7 = aVar.j;
            ArrayList arrayList8 = aVar.k;
            arrayList7.clear();
            int i15 = 1;
            if (aVar.i) {
                if (!arrayList.isEmpty()) {
                    a1.g.y(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i12 = i13;
            } else {
                for (int i16 = i13; i16 < arrayList8.size(); i16++) {
                    ((Long) arrayList8.get(i16)).getClass();
                    arrayList7.add(new o0());
                }
                for (int i17 = i13; i17 < arrayList.size(); i17++) {
                    arrayList7.add((o0) arrayList.get(i17));
                }
                int max = Math.max(i13, aVar.c);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    int i18 = aVar.d > 0 ? 1 : i13;
                    while (arrayList2.size() > max) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i19 = 1;
                    while (i19 <= max) {
                        int i20 = i19 - 1;
                        if (i19 == max) {
                            i10 = i13;
                            i3 = i15;
                        } else {
                            i3 = i13;
                            i10 = i3;
                        }
                        int i21 = i20 < arrayList2.size() ? i15 : i10;
                        if (i21 == 0 || i3 == 0) {
                            i11 = i15;
                        } else {
                            i11 = i15;
                            if (((Boolean) arrayList3.get(i20)).booleanValue() != i18) {
                                i21 = i10;
                            }
                        }
                        if (i21 == 0) {
                            while (arrayList2.size() > i20) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(o0.a()));
                            arrayList3.add(Boolean.valueOf(i3 != 0 ? i18 : i10));
                            arrayList4.add(Integer.valueOf(i10));
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i20)).getClass();
                        if (i3 != 0) {
                            if (((((Long) arrayList5.get(i20)).longValue() == 0 || !H3(aVar.b)) ? i11 : i10) != 0) {
                                arrayList4.set(i20, Integer.valueOf(((Integer) arrayList4.get(i20)).intValue() + 1));
                                arrayList5.set(i20, Long.valueOf(aVar.a));
                            } else {
                                ((Integer) arrayList4.get(i20)).getClass();
                                ((Long) arrayList5.get(i20)).getClass();
                            }
                            arrayList7.add(new o0());
                        } else {
                            ((Boolean) arrayList3.get(i20)).getClass();
                            arrayList7.add(new o0());
                        }
                        i19++;
                        i13 = i10;
                        i15 = i11;
                    }
                }
                i12 = i13;
                if (A3(aVar)) {
                    boolean z10 = ((TL_iv.pageBlockDetails) aVar.b).open;
                    o0.a();
                    arrayList.add(new o0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (b6.p(aVar.b)) {
                    o0.a();
                    arrayList7.add(new o0());
                }
            }
            i14++;
            i13 = i12;
        }
    }

    public final boolean d3() {
        ArrayList arrayList = this.t3;
        a aVar = arrayList.isEmpty() ? null : (a) k2.p1.h(1, arrayList);
        if (aVar != null && !H3(aVar.b) && !aVar.i && !A3(aVar) && !N2(aVar.b)) {
            if (!(C1(aVar) instanceof b6)) {
                return false;
            }
            h3(aVar);
            return true;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.g3.O(false);
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        post(new n2(this, aVar2, 21));
        return true;
    }

    public final void d4() {
        int length;
        int C;
        int A;
        int length2;
        int C2;
        int A2;
        int length3;
        int C3;
        int A3;
        int length4;
        int C4;
        int A5;
        h1 Q4;
        int length5;
        int C5;
        int A6;
        boolean O3 = O3();
        r3 r3Var = this.p3;
        h3 h3Var = this.v3;
        if (O3) {
            int i3 = h3Var.p0;
            int i10 = h3Var.q0;
            if (i10 == h3Var.t0 && (Q4 = Q4(i3, i10)) != null && (C5 = k2.p1.C(h3Var.r0, h3Var.u0, (length5 = Q4.length()), 0)) < (A6 = k2.p1.A(h3Var.r0, h3Var.u0, length5, 0))) {
                if (d6.h(Q4.getText(), C5, A6)) {
                    g2 g2Var = this.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    d6.n(Q4.getText(), C5, A6);
                    Q4.f();
                    j4(i3, i10);
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var3 = this.R3;
                if (g2Var3 != null) {
                    g2Var3.d();
                }
                if (d6.g(Q4.getText(), C5, A6)) {
                    d6.m(Q4.getText(), C5, A6);
                    Q4.f();
                    j4(i3, i10);
                    g2 g2Var4 = this.R3;
                    if (g2Var4 != null) {
                        g2Var4.h();
                    }
                    r4();
                }
                Q4.P1 = C5;
                Q4.Q1 = A6;
                r3(false);
                H4(Q4);
                return;
            }
            return;
        }
        if (B3()) {
            int i11 = h3Var.p0;
            h1 L2 = L2(i11);
            if (L2 != null && (C4 = k2.p1.C(h3Var.r0, h3Var.u0, (length4 = L2.length()), 0)) < (A5 = k2.p1.A(h3Var.r0, h3Var.u0, length4, 0))) {
                if (d6.h(L2.getText(), C4, A5)) {
                    g2 g2Var5 = this.R3;
                    if (g2Var5 != null) {
                        g2Var5.d();
                    }
                    d6.n(L2.getText(), C4, A5);
                    L2.f();
                    h4(i11);
                    g2 g2Var6 = this.R3;
                    if (g2Var6 != null) {
                        g2Var6.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var7 = this.R3;
                if (g2Var7 != null) {
                    g2Var7.d();
                }
                if (d6.g(L2.getText(), C4, A5)) {
                    d6.m(L2.getText(), C4, A5);
                    L2.f();
                    h4(i11);
                    g2 g2Var8 = this.R3;
                    if (g2Var8 != null) {
                        g2Var8.h();
                    }
                    r4();
                }
                L2.P1 = C4;
                L2.Q1 = A5;
                r3(false);
                H4(L2);
                return;
            }
            return;
        }
        if (z3()) {
            int i12 = h3Var.p0;
            h1 v22 = v2(i12);
            if (v22 != null && (C3 = k2.p1.C(h3Var.r0, h3Var.u0, (length3 = v22.length()), 0)) < (A3 = k2.p1.A(h3Var.r0, h3Var.u0, length3, 0))) {
                if (d6.h(v22.getText(), C3, A3)) {
                    g2 g2Var9 = this.R3;
                    if (g2Var9 != null) {
                        g2Var9.d();
                    }
                    d6.n(v22.getText(), C3, A3);
                    v22.f();
                    g4(i12);
                    g2 g2Var10 = this.R3;
                    if (g2Var10 != null) {
                        g2Var10.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var11 = this.R3;
                if (g2Var11 != null) {
                    g2Var11.d();
                }
                if (d6.g(v22.getText(), C3, A3)) {
                    d6.m(v22.getText(), C3, A3);
                    v22.f();
                    g4(i12);
                    g2 g2Var12 = this.R3;
                    if (g2Var12 != null) {
                        g2Var12.h();
                    }
                    r4();
                }
                v22.P1 = C3;
                v22.Q1 = A3;
                r3(false);
                H4(v22);
                return;
            }
            return;
        }
        if (J3()) {
            int i13 = h3Var.p0;
            h1 m42 = m4(i13);
            if (m42 != null && (C2 = k2.p1.C(h3Var.r0, h3Var.u0, (length2 = m42.length()), 0)) < (A2 = k2.p1.A(h3Var.r0, h3Var.u0, length2, 0))) {
                if (d6.h(m42.getText(), C2, A2)) {
                    g2 g2Var13 = this.R3;
                    if (g2Var13 != null) {
                        g2Var13.d();
                    }
                    d6.n(m42.getText(), C2, A2);
                    m42.f();
                    i4(i13);
                    g2 g2Var14 = this.R3;
                    if (g2Var14 != null) {
                        g2Var14.h();
                    }
                    r3Var.a0();
                    r4();
                    return;
                }
                g2 g2Var15 = this.R3;
                if (g2Var15 != null) {
                    g2Var15.d();
                }
                if (d6.g(m42.getText(), C2, A2)) {
                    d6.m(m42.getText(), C2, A2);
                    m42.f();
                    i4(i13);
                    g2 g2Var16 = this.R3;
                    if (g2Var16 != null) {
                        g2Var16.h();
                    }
                    r4();
                }
                m42.P1 = C2;
                m42.Q1 = A2;
                r3(false);
                H4(m42);
                return;
            }
            return;
        }
        b6 J4 = J4();
        if (J4 != null && (C = k2.p1.C(h3Var.r0, h3Var.u0, (length = J4.getEditText().length()), 0)) < (A = k2.p1.A(h3Var.r0, h3Var.u0, length, 0))) {
            if (d6.h(J4.getEditText().getText(), C, A)) {
                g2 g2Var17 = this.R3;
                if (g2Var17 != null) {
                    g2Var17.d();
                }
                d6.n(J4.getEditText().getText(), C, A);
                J4.getEditText().f();
                J4.x();
                g2 g2Var18 = this.R3;
                if (g2Var18 != null) {
                    g2Var18.h();
                }
                r3Var.a0();
                r4();
                return;
            }
            g2 g2Var19 = this.R3;
            if (g2Var19 != null) {
                g2Var19.d();
            }
            if (d6.g(J4.getEditText().getText(), C, A)) {
                d6.m(J4.getEditText().getText(), C, A);
                J4.getEditText().f();
                J4.x();
                g2 g2Var20 = this.R3;
                if (g2Var20 != null) {
                    g2Var20.h();
                }
                r4();
            }
            h1 editText = J4.getEditText();
            editText.P1 = C;
            editText.Q1 = A;
            r3(false);
            H4(J4.getEditText());
        }
    }

    public final void d5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                pageblockpreformatted.language = str;
                b6 x22 = x2(this.t3.indexOf(aVar));
                if (x22 != null && (aVar2 = x22.y) != null) {
                    x22.J(aVar2.b, true);
                    x22.I = null;
                    x22.C();
                }
                g2 g2Var2 = this.R3;
                if (g2Var2 != null) {
                    g2Var2.h();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.l41, org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i3;
        Long l10;
        a aVar;
        View view;
        Long l11;
        int i10;
        int i11;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f10;
        a aVar4;
        boolean z10;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                arrayList = this.x4;
                if (i12 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i12));
                a aVar5 = (R < 0 || R >= arrayList.size()) ? null : (a) arrayList.get(R);
                if (aVar5 != null) {
                    ArrayList arrayList3 = aVar5.k;
                    if (arrayList3.size() > i13) {
                        i13 = arrayList3.size();
                    }
                }
                i12++;
            }
            if (i13 != 0) {
                if (this.y4 == null) {
                    dk0 dk0Var = new dk0(this);
                    this.y4 = dk0Var;
                    dk0Var.a(null, null, null, this.o3, 1);
                    ne.a(this.y4, this.o3);
                }
                int i14 = 0;
                while (i14 < i13) {
                    float f11 = 0.0f;
                    long j10 = 0;
                    int i15 = 0;
                    boolean z11 = false;
                    a aVar6 = null;
                    a aVar7 = null;
                    float f12 = 1.0f;
                    float f13 = 0.0f;
                    while (i15 <= childCount) {
                        if (i15 < childCount) {
                            View childAt = getChildAt(i15);
                            int R2 = RecyclerView.R(childAt);
                            aVar = (R2 < 0 || R2 >= arrayList.size()) ? null : (a) arrayList.get(R2);
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.k;
                                if (i14 < arrayList4.size()) {
                                    l10 = (Long) arrayList4.get(i14);
                                    i3 = childCount;
                                    view = childAt;
                                }
                            }
                            i3 = childCount;
                            view = childAt;
                            l10 = null;
                        } else {
                            i3 = childCount;
                            l10 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l10 != null && l10.longValue() == j10)) {
                            l11 = l10;
                            i10 = i14;
                            i11 = i13;
                            arrayList2 = arrayList;
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f10 = f12;
                        } else {
                            int n4 = n4(i14, aVar6, true);
                            l11 = l10;
                            int n42 = n4(i14, aVar7, false);
                            if (f13 - f11 <= org.telegram.messenger.g0.L(4.0f)) {
                                i10 = i14;
                                i11 = i13;
                                arrayList2 = arrayList;
                            } else {
                                int L = org.telegram.messenger.g0.L(16.0f) * i14;
                                i10 = i14;
                                int L2 = org.telegram.messenger.g0.L(16.0f) + L;
                                i11 = i13;
                                arrayList2 = arrayList;
                                int z12 = org.telegram.messenger.k5.z(16.0f, getWidth(), L);
                                if (z12 - L2 > org.telegram.messenger.g0.L(8.0f)) {
                                    float floor = (float) Math.floor(az.Y0 / 3.0f);
                                    RectF rectF = org.telegram.messenger.g0.P;
                                    rectF.set(L2, n4 + f11, z12, f13 - n42);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.y4.c(floor, floor, floor, f12, canvas, rectF);
                                    f10 = f12;
                                    this.y4.f(canvas, rectF, f10);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f10 = f12;
                            z11 = false;
                        }
                        if (view == null || l11 == null) {
                            aVar7 = aVar3;
                            f12 = f10;
                            aVar4 = aVar2;
                        } else {
                            if (z11) {
                                aVar4 = aVar2;
                                z10 = z11;
                            } else {
                                j10 = l11.longValue();
                                f11 = Float.MAX_VALUE;
                                f13 = -3.4028235E38f;
                                aVar4 = aVar;
                                z10 = true;
                                f10 = 1.0f;
                            }
                            if (aVar == null || aVar != this.a4) {
                                float y9 = view.getY();
                                float height = view.getHeight() + y9;
                                if (y9 < f11) {
                                    f11 = y9;
                                }
                                if (height > f13) {
                                    f13 = height;
                                }
                                f12 = Math.min(f10, view.getAlpha());
                                z11 = z10;
                            } else {
                                z11 = z10;
                                f12 = f10;
                            }
                            aVar7 = aVar;
                        }
                        i15++;
                        aVar6 = aVar4;
                        childCount = i3;
                        i14 = i10;
                        i13 = i11;
                        arrayList = arrayList2;
                    }
                    i14++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e2(zi ziVar) {
        TLRPC.Document F0;
        if (ziVar == null || (F0 = ziVar.F0()) == null) {
            return;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        a aVar = new a(pageblockaudio, 0, 0);
        s sVar = new s();
        aVar.g = sVar;
        sVar.c = true;
        long j10 = F0.id;
        boolean z10 = j10 == 0 || F0.dc_id == 0 || F0.access_hash == 0;
        if (z10) {
            TLRPC.Message message = ziVar.k;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            s sVar2 = aVar.g;
            sVar2.i = F0;
            sVar2.e = str;
            sVar2.a = 1;
            sVar2.f = 0.0f;
        } else {
            sVar.h = F0;
            sVar.i = F0;
            sVar.a = 2;
            pageblockaudio.audio_id = j10;
        }
        x3(aVar);
        if (z10) {
            s sVar3 = aVar.g;
            String str2 = sVar3.e;
            IdentityHashMap identityHashMap = this.h4;
            z4 z4Var = (z4) identityHashMap.remove(sVar3);
            if (z4Var != null) {
                z4Var.b();
            }
            z4 z4Var2 = new z4(this.n3, str2, F0, new f3(aVar, sVar3, this));
            identityHashMap.put(sVar3, z4Var2);
            z4Var2.d();
        }
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        this.p3.onContentChanged();
    }

    public final void e3(a aVar, boolean z10) {
        View C1 = C1(aVar);
        if (!(C1 instanceof f5)) {
            f3(aVar, z10);
            return;
        }
        h1 h1Var = ((f5) C1).r;
        h1Var.N();
        h1Var.setSelection(z10 ? h1Var.length() : 0);
    }

    public final void e4() {
        h1 editText;
        Runnable j2Var;
        int length;
        final int C;
        final int A;
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x()) {
            return;
        }
        int i3 = 1;
        int i10 = 0;
        if (O3()) {
            int i11 = h3Var.p0;
            int i12 = h3Var.q0;
            if (i12 != h3Var.t0) {
                return;
            }
            editText = Q4(i11, i12);
            j2Var = new o2(this, i11, i12, 1);
        } else if (B3()) {
            int i13 = h3Var.p0;
            editText = L2(i13);
            j2Var = new i2(this, i13, 3);
        } else if (z3()) {
            int i14 = h3Var.p0;
            editText = v2(i14);
            j2Var = new i2(this, i14, i10);
        } else if (J3()) {
            int i15 = h3Var.p0;
            editText = m4(i15);
            j2Var = new i2(this, i15, i3);
        } else {
            b6 J4 = J4();
            if (J4 == null) {
                return;
            }
            editText = J4.getEditText();
            j2Var = new j2(J4, i10);
        }
        final h1 h1Var = editText;
        final Runnable runnable = j2Var;
        if (h1Var != null && (C = k2.p1.C(h3Var.r0, h3Var.u0, (length = h1Var.length()), 0)) <= (A = k2.p1.A(h3Var.r0, h3Var.u0, length, 0))) {
            Editable text = h1Var.getText();
            int i16 = r.h;
            String str = null;
            if (text != null) {
                r[] rVarArr = (r[]) text.getSpans(C, A, r.class);
                if (rVarArr.length > 0) {
                    str = rVarArr[0].a;
                }
            }
            if (str == null) {
                str = h1Var.getText().subSequence(C, A).toString();
            }
            final float L = org.telegram.messenger.g0.L(az.W0 + 4);
            int i17 = k6.G6;
            org.telegram.ui.ActionBar.e6 e6Var = this.o3;
            final int w02 = k6.w0(i17, e6Var);
            p.Z(getContext(), str, new u10() { // from class: mi.w2
                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    r a10;
                    String str2 = (String) obj;
                    t3 t3Var = t3.this;
                    t3Var.getClass();
                    if (TextUtils.isEmpty(str2) || (a10 = r.a(str2, w02, L)) == null) {
                        return;
                    }
                    g2 g2Var = t3Var.R3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    h3 h3Var2 = t3Var.v3;
                    if (h3Var2 != null) {
                        h3Var2.f(false);
                    }
                    h1 h1Var2 = h1Var;
                    h1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(a10, 0, 1, 33);
                    Editable text2 = h1Var2.getText();
                    int max = Math.max(0, Math.min(C, text2.length()));
                    text2.replace(max, Math.max(max, Math.min(A, text2.length())), spannableString);
                    runnable.run();
                    g2 g2Var2 = t3Var.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    t3Var.p3.onContentChanged();
                    int min = Math.min(max + 1, h1Var2.length());
                    h1Var2.N();
                    t3Var.post(new u2(h1Var2, min, 3));
                }
            }, e6Var);
        }
    }

    public final void f2(String str) {
        int i3;
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
            String mimeTypeFromExtension = (lastIndexOf < 0 || (i3 = lastIndexOf + 1) >= name.length()) ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i3).toLowerCase());
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
        if (!(C1 instanceof n5)) {
            if (z10 && (C1 instanceof b6)) {
                b6 b6Var = (b6) C1;
                if (b6Var.n()) {
                    b6Var.h();
                    return;
                }
            }
            h1 U3 = U3(C1);
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
        n5 n5Var = (n5) C1;
        h1 h1Var = n5Var.r;
        f6 f6Var = n5Var.G;
        if (f6Var == null) {
            return;
        }
        if (!z10) {
            h1Var.N();
            h1Var.setSelection(0);
        } else {
            if (f6Var.g.isEmpty()) {
                return;
            }
            q5 m10 = n5Var.w.m((TL_iv.pageTableCell) k2.p1.h(1, n5Var.G.g));
            if (m10 == null) {
                return;
            }
            h1 h1Var2 = m10.a;
            h1Var2.N();
            h1Var2.setSelection(h1Var2.length());
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
        t3 t3Var;
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
            h3 h3Var = this.v3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    z42 = z4(b4.z(str, hashMap));
                } catch (Exception e10) {
                    e = e10;
                    t3Var = this;
                }
                if (!z42.isEmpty()) {
                    ArrayList arrayList = this.t3;
                    t3Var = this;
                    try {
                        if (t3Var.L4(arrayList.indexOf(B4(h3Var.p0)), arrayList.indexOf(B4(h3Var.s0)), h3Var.r0, h3Var.u0, z42)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            t3Var.u3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        a8.g(e, true);
                        coerceToText = itemAt.coerceToText(getContext());
                        if (coerceToText == null) {
                        }
                        t3Var.a2(h3Var.p0, h3Var.r0, h3Var.s0, h3Var.u0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    t3Var.a2(h3Var.p0, h3Var.r0, h3Var.s0, h3Var.u0, coerceToText.toString().split("\n", -1));
                }
            }
            t3Var = this;
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
            }
            t3Var.a2(h3Var.p0, h3Var.r0, h3Var.s0, h3Var.u0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        h3 h3Var2 = this.v3;
        if (!isEmpty) {
        }
        t3Var = this;
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        t3Var.a2(h3Var2.p0, h3Var2.r0, h3Var2.s0, h3Var2.u0, coerceToText.toString().split("\n", -1));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:9)(1:(7:44|11|12|13|14|15|(4:34|18|19|(1:29)(4:21|(1:23)(1:28)|24|26)))(1:43))|10|11|12|13|14|15|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        org.telegram.messenger.a8.g(r0, r3);
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
    public final void f5(CharSequence charSequence) {
        boolean z10;
        String str;
        ClipboardManager clipboardManager;
        int i3;
        int i10;
        int i11;
        h3 h3Var = this.v3;
        a B4 = B4(h3Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(h3Var.s0));
        int i12 = h3Var.r0;
        int i13 = h3Var.u0;
        try {
            if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
                z10 = true;
            } else {
                if (indexOf > indexOf2) {
                    i11 = i13;
                    i10 = indexOf2;
                } else if (indexOf != indexOf2 || i12 <= i13) {
                    i3 = i13;
                    i10 = indexOf;
                    indexOf = indexOf2;
                    i11 = i12;
                    HashMap hashMap = this.u3;
                    StringBuilder sb2 = new StringBuilder();
                    z3 z3Var = new z3();
                    int i14 = indexOf;
                    int i15 = indexOf;
                    z10 = true;
                    b4.F(sb2, arrayList, new int[]{i10}, i15, i10, i14, i11, i3, z3Var, false, 0, hashMap);
                    z3Var.b(sb2);
                    str = sb2.toString();
                    if (!TextUtils.isEmpty(str)) {
                        u4.a(D2(i10, i15), C2(i10, i15));
                        clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        if (clipboardManager == null) {
                            return;
                        }
                        clipboardManager.setPrimaryClip(str != null ? ClipData.newHtmlText("label", charSequence, str) : ClipData.newPlainText("label", charSequence));
                        return;
                    }
                } else {
                    i11 = i13;
                    i10 = indexOf;
                    indexOf = indexOf2;
                }
                i3 = i12;
                HashMap hashMap2 = this.u3;
                StringBuilder sb22 = new StringBuilder();
                z3 z3Var2 = new z3();
                int i142 = indexOf;
                int i152 = indexOf;
                z10 = true;
                b4.F(sb22, arrayList, new int[]{i10}, i152, i10, i142, i11, i3, z3Var2, false, 0, hashMap2);
                z3Var2.b(sb22);
                str = sb22.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
            }
        } catch (Exception e10) {
            a8.g(e10, z10);
            return;
        }
        str = null;
    }

    public final void g2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        a aVar = new a(pageblockdocument, 0, 0);
        s sVar = new s();
        aVar.g = sVar;
        sVar.d = true;
        long j10 = document.id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (!z10) {
            sVar.h = document;
            sVar.a = 2;
            pageblockdocument.document_id = j10;
        } else {
            if (TextUtils.isEmpty(str) || !t4.c.p(str)) {
                return;
            }
            s sVar2 = aVar.g;
            sVar2.h = document;
            sVar2.e = str;
            sVar2.a = 1;
            sVar2.f = 0.0f;
        }
        x3(aVar);
        if (z10) {
            s sVar3 = aVar.g;
            IdentityHashMap identityHashMap = this.h4;
            z4 z4Var = (z4) identityHashMap.remove(sVar3);
            if (z4Var != null) {
                z4Var.b();
            }
            z4 z4Var2 = new z4(this.n3, str, document, new e3(this, sVar3, aVar, str));
            identityHashMap.put(sVar3, z4Var2);
            z4Var2.d();
        }
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        this.p3.onContentChanged();
    }

    public final void g3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            ((b6) C1).B();
        } else if (C1 instanceof s0) {
            ((s0) C1).d.N();
        }
    }

    public final void g4(int i3) {
        KeyEvent.Callback D4 = D4(i3);
        if (D4 instanceof l0) {
            ((l0) D4).b();
        }
    }

    public h1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        return null;
    }

    public l4 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public h9 getTextSelectionHelper() {
        return this.v3;
    }

    public final void h2(Uri uri) {
        if (uri == null) {
            return;
        }
        a aVar = this.j4;
        String str = null;
        this.j4 = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            str = context.getContentResolver().getType(uri);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        String str2 = str;
        boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        int i3 = this.z4;
        this.z4 = i3 - 1;
        Utilities.e.c(new q2(this, uri, startsWith, str2, i3, aVar));
    }

    public final void h3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            b6 b6Var = (b6) C1;
            b6Var.B();
            h1 editText = b6Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (C1 instanceof s0) {
            s0 s0Var = (s0) C1;
            s0Var.d.N();
            h1 editText2 = s0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void h4(int i3) {
        a B4 = B4(i3);
        h1 L2 = L2(i3);
        if (!A3(B4) || L2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) B4.b).title = d6.f(L2.getText());
    }

    public final void i2(ye yeVar) {
        t3 t3Var;
        String str = yeVar.h;
        if (str == null) {
            str = yeVar.I;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        g2 g2Var = this.R3;
        if (g2Var != null) {
            g2Var.d();
        }
        boolean c2 = v4.c(yeVar);
        a aVar = new a((yeVar.b || c2) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.g = W3(yeVar, str2);
        x3(aVar);
        if (c2) {
            N4(aVar, aVar.g, yeVar);
            t3Var = this;
        } else {
            t3Var = this;
            t3Var.O4(aVar, aVar.g, str2, yeVar.b, yeVar.F, yeVar.G, yeVar.E);
        }
        g2 g2Var2 = t3Var.R3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        t3Var.p3.onContentChanged();
    }

    public final void i3(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof b6) {
            b6 b6Var = (b6) C1;
            b6Var.B();
            b6Var.getEditText().setSelection(0);
        } else if (C1 instanceof s0) {
            s0 s0Var = (s0) C1;
            s0Var.d.N();
            s0Var.getEditText().setSelection(0);
        }
    }

    public final void i4(int i3) {
        View D4 = D4(i3);
        if (D4 instanceof b6) {
            ((b6) D4).w();
        }
    }

    public final void j2(n5 n5Var) {
        n5 n5Var2 = this.q4;
        if (n5Var2 != null && n5Var2 != n5Var) {
            LinkedHashSet linkedHashSet = n5Var2.I;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                n5Var2.w.invalidate();
                n5Var2.v();
            }
        }
        this.q4 = n5Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        n5Var.setCellSelectionListener(this.u4);
        h3 h3Var = this.v3;
        if (h3Var != null && h3Var.x()) {
            h3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void j4(int i3, int i10) {
        q5 m10;
        View D4 = D4(i3);
        if (D4 instanceof n5) {
            n5 n5Var = (n5) D4;
            if (i10 == 0) {
                n5Var.w();
                return;
            }
            TL_iv.pageTableCell g7 = n5Var.g(i10);
            if (g7 == null || (m10 = n5Var.getGrid().m(g7)) == null) {
                return;
            }
            f6.d(g7, m10.a.getText());
        }
    }

    public final k3 k2() {
        int i3;
        int i10;
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x() || J3()) {
            return null;
        }
        a B4 = B4(h3Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(B4);
        int indexOf2 = arrayList.indexOf(B4(h3Var.s0));
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            i10 = indexOf;
            i3 = indexOf2;
        } else {
            i3 = indexOf;
            i10 = indexOf2;
        }
        for (int i11 = i3; i11 <= i10; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.i || A3(aVar)) {
                return null;
            }
        }
        return new k3(this, i3, i10, h3Var.r0, h3Var.u0);
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
        int i3;
        boolean z10;
        boolean z11;
        View findFocus;
        n5 X2;
        int i10;
        n5 n5Var;
        f5 f5Var;
        a aVar;
        int indexOf;
        boolean z12;
        h1 U3;
        Layout layout;
        boolean z13;
        Layout layout2;
        int i11;
        final float primaryHorizontal;
        a X3;
        int i12;
        int i13;
        int i14;
        int l42;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean b02;
        Layout layout3;
        int i19;
        int length;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int max;
        a T2;
        int indexOf2;
        boolean z14;
        int i25;
        int i26;
        int unicodeChar;
        boolean z15;
        g2 g2Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        h3 h3Var = this.v3;
        boolean x10 = h3Var.x();
        if (isCtrlPressed && !isAltPressed && (g2Var = this.R3) != null) {
            if (keyCode == 54 && !isShiftPressed) {
                g2Var.k();
                return true;
            }
            if ((keyCode == 54 && isShiftPressed) || keyCode == 53) {
                g2Var.i();
                return true;
            }
        }
        if (isCtrlPressed && !isAltPressed) {
            int i27 = 4;
            if (isShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i27 = 8;
                        }
                        i27 = 0;
                        z15 = false;
                    } else {
                        i27 = 256;
                    }
                }
                z15 = false;
            } else if (keyCode != 30) {
                if (keyCode != 33) {
                    if (keyCode == 37) {
                        i27 = 2;
                    } else if (keyCode != 39) {
                        if (keyCode == 49) {
                            i27 = 16;
                        }
                        i27 = 0;
                        z15 = false;
                    } else {
                        i27 = 0;
                        z15 = true;
                    }
                }
                z15 = false;
            } else {
                z15 = false;
                i27 = 1;
            }
            if (z15) {
                d4();
                return true;
            }
            if (i27 != 0) {
                b4(i27);
                return true;
            }
        }
        if (keyCode == 111 && x10) {
            h3Var.f(false);
            return true;
        }
        if (x10) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence r5 = h3Var.r();
                if (r5 == null || r5.length() == 0) {
                    return true;
                }
                f5(r5);
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence r9 = h3Var.r();
                if (r9 != null && r9.length() > 0) {
                    f5(r9);
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
        ArrayList arrayList = this.t3;
        if (!x10 && isShiftPressed && y3(keyCode) && (T2 = T2()) != null && (indexOf2 = arrayList.indexOf(T2)) >= 0) {
            View C1 = C1(T2);
            if (C1 instanceof b6) {
                b6 b6Var = (b6) C1;
                h1 editText = b6Var.getEditText();
                if (editText.getLayout() != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    int length2 = editText.length();
                    switch (keyCode) {
                        case 19:
                        case 21:
                            if (selectionEnd <= 0) {
                                z14 = false;
                                i25 = !z14 ? indexOf2 + 1 : indexOf2 - 1;
                                if (i25 >= 0 && i25 < arrayList.size()) {
                                    a aVar2 = (a) arrayList.get(i25);
                                    i3 = 1;
                                    for (i26 = 0; i26 < arrayList.size(); i26++) {
                                        h3Var.X(i26, b6.z(((a) arrayList.get(i26)).b));
                                    }
                                    if (length2 != 0) {
                                        int max2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z14) {
                                            if (max2 >= length2) {
                                                length2--;
                                            }
                                            if (h3Var.j0(b6Var, 0, max2, length2)) {
                                                KeyEvent.Callback C12 = C1(aVar2);
                                                if (C12 instanceof g9) {
                                                    h3Var.b0(0, 0, (g9) C12);
                                                    break;
                                                } else {
                                                    v0(i25);
                                                    post(new n2(this, aVar2, 14));
                                                    break;
                                                }
                                            }
                                        } else if (h3Var.j0(b6Var, 0, max2, max2 > 0 ? 0 : 1)) {
                                            KeyEvent.Callback C13 = C1(aVar2);
                                            if (C13 instanceof g9) {
                                                h3Var.b0(0, C13 instanceof b6 ? ((b6) C13).getEditText().length() : 0, (g9) C13);
                                                break;
                                            } else {
                                                v0(i25);
                                                post(new n2(this, aVar2, 15));
                                                break;
                                            }
                                        }
                                    }
                                    if (!x10 && isShiftPressed && y3(keyCode)) {
                                        int i28 = (isCtrlPressed || isAltPressed) ? i3 : 0;
                                        int i29 = h3Var.B0;
                                        int i30 = h3Var.D0;
                                        int i31 = h3Var.C0;
                                        int i32 = h3Var.p0;
                                        int i33 = h3Var.q0;
                                        int i34 = h3Var.r0;
                                        int i35 = h3Var.s0;
                                        int i36 = i28;
                                        int i37 = h3Var.t0;
                                        int i38 = h3Var.u0;
                                        if (i29 == i32 && i30 == i33 && i31 == i34) {
                                            i32 = i35;
                                            i33 = i37;
                                        } else {
                                            i38 = i34;
                                        }
                                        View D4 = D4(i32);
                                        if (D4 != null) {
                                            if (D4 instanceof n5) {
                                                n5 n5Var2 = (n5) D4;
                                                f6 model = n5Var2.getModel();
                                                if (model != null) {
                                                    ArrayList arrayList2 = model.g;
                                                    if (!arrayList2.isEmpty()) {
                                                        int size = arrayList2.size() + 1;
                                                        int i39 = (i33 < 0 || i33 >= size) ? 0 : i33;
                                                        h1 m10 = n5Var2.m(i39);
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
                                                                    int lineForOffset = layout3.getLineForOffset(i38) - i3;
                                                                    if (lineForOffset >= 0) {
                                                                        length = layout3.getOffsetForHorizontal(lineForOffset, layout3.getPrimaryHorizontal(i38));
                                                                    } else if (i39 == 0) {
                                                                        i21 = i32 - 1;
                                                                        if (i21 >= 0) {
                                                                            length = l4(i21);
                                                                            i33 = 0;
                                                                            break;
                                                                        }
                                                                        i21 = i32;
                                                                        length = 0;
                                                                        break;
                                                                    } else {
                                                                        int i40 = i39 - 1;
                                                                        if (i40 >= 0 && i40 < arrayList2.size()) {
                                                                            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i40);
                                                                            int b10 = model.b(pagetablecell);
                                                                            int a10 = model.a(pagetablecell);
                                                                            int i41 = b10 - 1;
                                                                            if (i41 >= 0) {
                                                                                i19 = arrayList2.indexOf(model.d[i41][Math.min(a10, model.c - 1)]);
                                                                                if (i19 < 0) {
                                                                                    i20 = i19 + 1;
                                                                                    h1 m11 = n5Var2.m(i20);
                                                                                    Layout layout5 = m11 != null ? m11.getLayout() : null;
                                                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                                                } else {
                                                                                    length = n5Var2.getTitleEditText().length();
                                                                                    i20 = 0;
                                                                                }
                                                                                i33 = i20;
                                                                            }
                                                                        }
                                                                        i19 = -1;
                                                                        if (i19 < 0) {
                                                                        }
                                                                        i33 = i20;
                                                                    }
                                                                    i21 = i32;
                                                                    break;
                                                                case 20:
                                                                    int lineForOffset2 = layout3.getLineForOffset(i38) + 1;
                                                                    int i42 = length3;
                                                                    if (lineForOffset2 < layout3.getLineCount()) {
                                                                        length = layout3.getOffsetForHorizontal(lineForOffset2, layout3.getPrimaryHorizontal(i38));
                                                                        i21 = i32;
                                                                        break;
                                                                    } else {
                                                                        if (i39 == 0) {
                                                                            if (size > i3) {
                                                                                i21 = i32;
                                                                                length = 0;
                                                                                i33 = 1;
                                                                                break;
                                                                            } else {
                                                                                i21 = i32 + 1;
                                                                                if (i21 >= arrayList.size()) {
                                                                                    i21 = i32;
                                                                                }
                                                                                length = 0;
                                                                                i33 = 0;
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            int i43 = i39 - 1;
                                                                            if (i43 < 0 || i43 >= arrayList2.size()) {
                                                                                i22 = 1;
                                                                            } else {
                                                                                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i43);
                                                                                int b11 = model.b(pagetablecell2);
                                                                                int a11 = model.a(pagetablecell2);
                                                                                i22 = 1;
                                                                                int max3 = Math.max(1, f6.o(pagetablecell2)) + b11;
                                                                                if (max3 < model.b) {
                                                                                    i23 = arrayList2.indexOf(model.d[max3][Math.min(a11, model.c - 1)]);
                                                                                    if (i23 < 0) {
                                                                                        i24 = i23 + i22;
                                                                                        i21 = i32;
                                                                                    } else {
                                                                                        int i44 = i32 + 1;
                                                                                        if (i44 < arrayList.size()) {
                                                                                            i21 = i44;
                                                                                            i24 = 0;
                                                                                        } else {
                                                                                            i21 = i32;
                                                                                            i24 = i33;
                                                                                            i33 = i24;
                                                                                        }
                                                                                    }
                                                                                    i42 = 0;
                                                                                    i33 = i24;
                                                                                }
                                                                            }
                                                                            i23 = -1;
                                                                            if (i23 < 0) {
                                                                            }
                                                                            i42 = 0;
                                                                            i33 = i24;
                                                                        }
                                                                        length = i42;
                                                                        break;
                                                                    }
                                                                case 21:
                                                                    if (i36 != 0) {
                                                                        BreakIterator wordInstance = BreakIterator.getWordInstance();
                                                                        wordInstance.setText(text.toString());
                                                                        int preceding = wordInstance.preceding(Math.max(0, Math.min(i38, text.length())));
                                                                        max = preceding == -1 ? 0 : preceding;
                                                                    } else {
                                                                        max = Math.max(0, i38 - 1);
                                                                    }
                                                                    if (max == i38 && i38 <= 0) {
                                                                        int i45 = i39 - 1;
                                                                        if (i45 >= 0) {
                                                                            h1 m12 = n5Var2.m(i45);
                                                                            Layout layout6 = m12 != null ? m12.getLayout() : null;
                                                                            length = layout6 != null ? layout6.getText().length() : 0;
                                                                            i33 = i45;
                                                                            i21 = i32;
                                                                            break;
                                                                        } else {
                                                                            int i46 = i32 - 1;
                                                                            if (i46 >= 0) {
                                                                                i21 = i46;
                                                                                length = l4(i46);
                                                                                i33 = 0;
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    length = max;
                                                                    i21 = i32;
                                                                case 22:
                                                                    if (i36 != 0) {
                                                                        BreakIterator wordInstance2 = BreakIterator.getWordInstance();
                                                                        wordInstance2.setText(text.toString());
                                                                        length = wordInstance2.following(Math.min(i38, text.length()));
                                                                        if (length == -1) {
                                                                            length = text.length();
                                                                        }
                                                                    } else {
                                                                        length = Math.min(length3, i38 + 1);
                                                                    }
                                                                    if (length == i38 && i38 >= length3) {
                                                                        int i47 = i39 + 1;
                                                                        if (i47 < size) {
                                                                            i33 = i47;
                                                                            i21 = i32;
                                                                            length = 0;
                                                                            break;
                                                                        } else {
                                                                            i21 = i32 + 1;
                                                                            break;
                                                                        }
                                                                    }
                                                                    i21 = i32;
                                                                    break;
                                                                default:
                                                                    length = i38;
                                                                    i21 = i32;
                                                                    break;
                                                            }
                                                            i16 = length;
                                                            i17 = i21;
                                                            i18 = i33;
                                                            i33 = i39;
                                                        }
                                                    }
                                                }
                                                z10 = isCtrlPressed;
                                            } else {
                                                z10 = isCtrlPressed;
                                                z11 = isAltPressed;
                                                if (D4 instanceof b6) {
                                                    Layout layout7 = ((b6) D4).getEditText().getLayout();
                                                    if (layout7 != null) {
                                                        CharSequence text2 = layout7.getText();
                                                        int length4 = text2.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset3 = layout7.getLineForOffset(i38) - 1;
                                                                if (lineForOffset3 >= 0) {
                                                                    i13 = layout7.getOffsetForHorizontal(lineForOffset3, layout7.getPrimaryHorizontal(i38));
                                                                    i15 = i32;
                                                                    break;
                                                                } else {
                                                                    i14 = i32 - 1;
                                                                    if (i14 >= 0) {
                                                                        l42 = l4(i14);
                                                                        int i48 = l42;
                                                                        i15 = i14;
                                                                        i13 = i48;
                                                                        break;
                                                                    } else {
                                                                        i15 = i32;
                                                                        i13 = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            case 20:
                                                                int lineForOffset4 = layout7.getLineForOffset(i38) + 1;
                                                                if (lineForOffset4 < layout7.getLineCount()) {
                                                                    i13 = layout7.getOffsetForHorizontal(lineForOffset4, layout7.getPrimaryHorizontal(i38));
                                                                } else {
                                                                    int i49 = i32 + 1;
                                                                    if (i49 < arrayList.size()) {
                                                                        i15 = i49;
                                                                        i13 = 0;
                                                                        break;
                                                                    } else {
                                                                        i13 = length4;
                                                                    }
                                                                }
                                                                i15 = i32;
                                                                break;
                                                            case 21:
                                                                if (i36 != 0) {
                                                                    BreakIterator wordInstance3 = BreakIterator.getWordInstance();
                                                                    wordInstance3.setText(text2.toString());
                                                                    int preceding2 = wordInstance3.preceding(Math.max(0, Math.min(i38, text2.length())));
                                                                    i13 = preceding2 == -1 ? 0 : preceding2;
                                                                } else {
                                                                    i13 = Math.max(0, i38 - 1);
                                                                }
                                                                if (i13 == i38 && i38 <= 0 && i32 - 1 >= 0) {
                                                                    i13 = l4(i15);
                                                                    break;
                                                                }
                                                                i15 = i32;
                                                                break;
                                                            case 22:
                                                                if (i36 != 0) {
                                                                    BreakIterator wordInstance4 = BreakIterator.getWordInstance();
                                                                    wordInstance4.setText(text2.toString());
                                                                    i13 = wordInstance4.following(Math.min(i38, text2.length()));
                                                                    if (i13 == -1) {
                                                                        i13 = text2.length();
                                                                    }
                                                                } else {
                                                                    i13 = Math.min(length4, i38 + 1);
                                                                }
                                                                if (i13 == i38) {
                                                                    if (i38 >= length4) {
                                                                        i15 = i32 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i15 = i32;
                                                                break;
                                                            default:
                                                                i13 = i38;
                                                                i15 = i32;
                                                                break;
                                                        }
                                                        i16 = i13;
                                                        i17 = i15;
                                                        i18 = i33;
                                                    }
                                                    b02 = false;
                                                    break;
                                                } else {
                                                    if ((D4 instanceof w0) || (D4 instanceof t4) || (D4 instanceof x) || (D4 instanceof n4) || (D4 instanceof p4)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i14 = i32 - 1;
                                                                if (i14 >= 0) {
                                                                    l42 = l4(i14);
                                                                    int i482 = l42;
                                                                    i15 = i14;
                                                                    i13 = i482;
                                                                    break;
                                                                }
                                                                i13 = i38;
                                                                i15 = i32;
                                                                break;
                                                            case 20:
                                                            case 22:
                                                                int i50 = i32 + 1;
                                                                if (i50 < arrayList.size()) {
                                                                    i15 = i50;
                                                                    i13 = 0;
                                                                    break;
                                                                }
                                                                i13 = i38;
                                                                i15 = i32;
                                                                break;
                                                            default:
                                                                i13 = i38;
                                                                i15 = i32;
                                                                break;
                                                        }
                                                        i16 = i13;
                                                        i17 = i15;
                                                        i18 = i33;
                                                    }
                                                    b02 = false;
                                                }
                                            }
                                            if (i17 != i32 || i18 != i33 || i16 != i38) {
                                                if (i17 != i32) {
                                                    v0(i17);
                                                }
                                                KeyEvent.Callback D42 = D4(i17);
                                                if (D42 instanceof g9) {
                                                    b02 = h3Var.b0(i18, i16, (g9) D42);
                                                    break;
                                                } else {
                                                    post(new gi.b0(this, i17, i18, i16, 1));
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
                                        this.x3 = z16 ? h3Var.s0 : h3Var.p0;
                                        this.y3 = z16 ? h3Var.u0 : h3Var.r0;
                                        this.z3 = z16 ? h3Var.t0 : h3Var.q0;
                                        h3Var.f(false);
                                        break;
                                    } else if (z10 || keyCode != 29 || (!h3Var.a0() && !V4())) {
                                        if (!x10 && !isShiftPressed && !z10 && !z11 && (keyCode == 20 || keyCode == 19)) {
                                            boolean z17 = keyCode != 20;
                                            i10 = 0;
                                            while (true) {
                                                if (i10 >= getChildCount()) {
                                                    View childAt = getChildAt(i10);
                                                    if (childAt instanceof n5) {
                                                        n5Var = (n5) childAt;
                                                        if (n5Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i10++;
                                                } else {
                                                    n5Var = null;
                                                }
                                            }
                                            f41 f41Var = this.g3;
                                            if (n5Var == null) {
                                                int indexOf3 = arrayList.indexOf(n5Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (!z17) {
                                                        int W2 = W2(indexOf3 - 1, -1);
                                                        if (W2 >= 0) {
                                                            post(new n2(this, (a) arrayList.get(W2), 5));
                                                        }
                                                    } else if (!n5Var.t()) {
                                                        int W22 = W2(indexOf3 + 1, 1);
                                                        if (W22 < 0) {
                                                            a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                            arrayList.add(aVar3);
                                                            f41Var.O(false);
                                                            post(new n2(this, aVar3, 2));
                                                        } else {
                                                            post(new n2(this, (a) arrayList.get(W22), 4));
                                                        }
                                                    }
                                                    z13 = true;
                                                    break;
                                                }
                                                z13 = false;
                                                break;
                                            } else {
                                                int i51 = 0;
                                                while (true) {
                                                    if (i51 < getChildCount()) {
                                                        View childAt2 = getChildAt(i51);
                                                        if (childAt2 instanceof f5) {
                                                            f5Var = (f5) childAt2;
                                                            if (f5Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i51++;
                                                    } else {
                                                        f5Var = null;
                                                    }
                                                }
                                                if (f5Var != null) {
                                                    h1 h1Var = f5Var.r;
                                                    int indexOf4 = this.x4.indexOf(f5Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = h1Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(h1Var.getSelectionEnd()) : 0;
                                                        if (z17) {
                                                            if (layout8 != null) {
                                                                i12 = 1;
                                                                break;
                                                            } else {
                                                                i12 = 1;
                                                            }
                                                            a X32 = X3(indexOf4 + i12, i12);
                                                            if (X32 == null) {
                                                                a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(aVar4);
                                                                f41Var.O(false);
                                                                post(new n2(this, aVar4, 6));
                                                            } else {
                                                                post(new n2(this, X32, 7));
                                                            }
                                                            z13 = true;
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (X3 = X3(indexOf4 - 1, -1)) != null) {
                                                            post(new n2(this, X3, 8));
                                                            z13 = true;
                                                        }
                                                    }
                                                    z13 = false;
                                                } else {
                                                    int i52 = 0;
                                                    while (true) {
                                                        if (i52 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i52);
                                                            if (childAt3 instanceof b6) {
                                                                b6 b6Var2 = (b6) childAt3;
                                                                if (b6Var2.getEditText().isFocused() || (b6Var2.n() && b6Var2.h.isFocused())) {
                                                                }
                                                                i52++;
                                                            } else if (childAt3 instanceof l0) {
                                                                l0 l0Var = (l0) childAt3;
                                                                if (l0Var.getCaptionEditText().isFocused()) {
                                                                    aVar = l0Var.getRow();
                                                                } else {
                                                                    i52++;
                                                                }
                                                            } else {
                                                                if (childAt3 instanceof s0) {
                                                                    s0 s0Var = (s0) childAt3;
                                                                    if (s0Var.getEditText().isFocused()) {
                                                                        aVar = s0Var.getRow();
                                                                    }
                                                                } else {
                                                                    continue;
                                                                }
                                                                i52++;
                                                            }
                                                        } else {
                                                            aVar = null;
                                                        }
                                                    }
                                                    if (aVar != null && (indexOf = arrayList.indexOf(aVar)) >= 0) {
                                                        View C14 = C1(aVar);
                                                        boolean z18 = C14 instanceof b6;
                                                        if (z18) {
                                                            final b6 b6Var3 = (b6) C14;
                                                            h1 h1Var2 = b6Var3.f;
                                                            h1 h1Var3 = b6Var3.h;
                                                            if (b6Var3.n()) {
                                                                if (!z17 || h1Var3.isFocused()) {
                                                                    z12 = z17;
                                                                    if (!z12 && h1Var3.isFocused() && ((layout2 = b6Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(b6Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout9 = h1Var3.getLayout();
                                                                        final float primaryHorizontal2 = layout9 == null ? 0.0f : layout9.getPrimaryHorizontal(Math.max(0, Math.min(h1Var3.getSelectionEnd(), h1Var3.length())));
                                                                        h1Var2.N();
                                                                        final int i53 = 0;
                                                                        h1Var2.post(new Runnable() { // from class: mi.r5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                switch (i53) {
                                                                                    case 0:
                                                                                        h1 h1Var4 = b6Var3.f;
                                                                                        Layout layout10 = h1Var4.getLayout();
                                                                                        int length5 = h1Var4.length();
                                                                                        if (layout10 != null) {
                                                                                            length5 = layout10.getOffsetForHorizontal(Math.max(0, layout10.getLineCount() - 1), primaryHorizontal2);
                                                                                        }
                                                                                        h1Var4.setSelection(Math.max(0, Math.min(length5, h1Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        h1 h1Var5 = b6Var3.h;
                                                                                        Layout layout11 = h1Var5.getLayout();
                                                                                        int length6 = h1Var5.length();
                                                                                        if (layout11 != null) {
                                                                                            length6 = layout11.getOffsetForHorizontal(0, primaryHorizontal2);
                                                                                        }
                                                                                        h1Var5.setSelection(Math.max(0, Math.min(length6, h1Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        z13 = true;
                                                                    }
                                                                    if (z18) {
                                                                        U3 = U3(C14);
                                                                    } else {
                                                                        b6 b6Var4 = (b6) C14;
                                                                        U3 = (b6Var4.n() && b6Var4.h.isFocused()) ? b6Var4.getAuthorEditText() : b6Var4.getEditText();
                                                                    }
                                                                    if (U3 != null && (layout = U3.getLayout()) != null) {
                                                                        int lineForOffset6 = layout.getLineForOffset(U3.getSelectionEnd());
                                                                        if (z12) {
                                                                            if (lineForOffset6 <= 0) {
                                                                                a Z1 = Z1(aVar, -1);
                                                                                if (Z1 != null) {
                                                                                    post(new n2(this, Z1, 13));
                                                                                } else {
                                                                                    int W23 = W2(indexOf - 1, -1);
                                                                                    if (W23 >= 0) {
                                                                                        post(new n2(this, (a) arrayList.get(W23), 3));
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                            a Z12 = Z1(aVar, 1);
                                                                            if (Z12 != null) {
                                                                                post(new n2(this, Z12, 10));
                                                                                z13 = true;
                                                                                break;
                                                                            } else {
                                                                                int W24 = W2(indexOf + 1, 1);
                                                                                if (W24 < 0) {
                                                                                    a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                    arrayList.add(aVar5);
                                                                                    f41Var.O(false);
                                                                                    post(new n2(this, aVar5, 11));
                                                                                } else {
                                                                                    post(new n2(this, (a) arrayList.get(W24), 12));
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    Layout layout10 = b6Var3.getEditText().getLayout();
                                                                    if (layout10 != null) {
                                                                        z12 = z17;
                                                                        break;
                                                                    }
                                                                    Layout layout11 = h1Var2.getLayout();
                                                                    if (layout11 == null) {
                                                                        i11 = 0;
                                                                        primaryHorizontal = 0.0f;
                                                                    } else {
                                                                        i11 = 0;
                                                                        primaryHorizontal = layout11.getPrimaryHorizontal(Math.max(0, Math.min(h1Var2.getSelectionEnd(), h1Var2.length())));
                                                                    }
                                                                    if (h1Var3.getVisibility() != 0) {
                                                                        h1Var3.setVisibility(i11);
                                                                        b6Var3.requestLayout();
                                                                    }
                                                                    h1Var3.N();
                                                                    final int i54 = 1;
                                                                    h1Var3.post(new Runnable() { // from class: mi.r5
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i54) {
                                                                                case 0:
                                                                                    h1 h1Var4 = b6Var3.f;
                                                                                    Layout layout102 = h1Var4.getLayout();
                                                                                    int length5 = h1Var4.length();
                                                                                    if (layout102 != null) {
                                                                                        length5 = layout102.getOffsetForHorizontal(Math.max(0, layout102.getLineCount() - 1), primaryHorizontal);
                                                                                    }
                                                                                    h1Var4.setSelection(Math.max(0, Math.min(length5, h1Var4.length())));
                                                                                    break;
                                                                                default:
                                                                                    h1 h1Var5 = b6Var3.h;
                                                                                    Layout layout112 = h1Var5.getLayout();
                                                                                    int length6 = h1Var5.length();
                                                                                    if (layout112 != null) {
                                                                                        length6 = layout112.getOffsetForHorizontal(0, primaryHorizontal);
                                                                                    }
                                                                                    h1Var5.setSelection(Math.max(0, Math.min(length6, h1Var5.length())));
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
                                            if (findFocus instanceof h1) {
                                                if ((X2 = X2((r3 = (h1) findFocus))) != null) {
                                                    if (findFocus != X2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode != 61 && x10) {
                                            int i55 = h3Var.p0;
                                            int i56 = h3Var.s0;
                                            if (i55 >= 0 && i56 >= i55) {
                                                if (i55 == i56) {
                                                    a B4 = B4(i55);
                                                    if (B4 != null) {
                                                        Z3(B4, isShiftPressed);
                                                        break;
                                                    }
                                                } else {
                                                    int indexOf5 = arrayList.indexOf(B4(i55));
                                                    int indexOf6 = arrayList.indexOf(B4(i56));
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
                                if (i25 >= 0) {
                                    a aVar22 = (a) arrayList.get(i25);
                                    i3 = 1;
                                    while (i26 < arrayList.size()) {
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
                                        i10 = 0;
                                        while (true) {
                                            if (i10 >= getChildCount()) {
                                            }
                                            i10++;
                                        }
                                        f41 f41Var2 = this.g3;
                                        if (n5Var == null) {
                                        }
                                    }
                                    if (!x10) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof h1) && (X2 = X2((r3 = (h1) findFocus))) != null) {
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
        i3 = 1;
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

    public final int l2(int i3) {
        h1 L2 = L2(i3);
        if (L2 != null) {
            return L2.length();
        }
        b6 x22 = x2(i3);
        if (x22 != null) {
            return x22.getEditText().length();
        }
        a B4 = B4(i3);
        if (B4 == null) {
            return 0;
        }
        return b6.z(B4.b).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l3(MotionEvent motionEvent) {
        boolean z10;
        a row;
        int i3;
        n5 n5Var;
        int action = motionEvent.getAction();
        h3 h3Var = this.v3;
        View view = null;
        if (action == 0) {
            this.D3 = motionEvent.getX();
            float y9 = motionEvent.getY();
            this.E3 = y9;
            this.H3 = false;
            this.I3 = false;
            int i10 = (int) this.D3;
            int top = ((int) y9) - getTop();
            n5 n5Var2 = this.q4;
            if (n5Var2 == null) {
                n5Var2 = U2();
            }
            if (n5Var2 != null && n5Var2.getParent() == this) {
                int left = i10 - n5Var2.getLeft();
                int top2 = top - n5Var2.getTop();
                if (n5Var2.r(left, top2) >= 0 || n5Var2.p(left, top2) >= 0) {
                    view = n5Var2;
                    this.F3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z10 = h3Var.x() && eventTime - this.N3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.D3 - this.O3) <= ((float) org.telegram.messenger.g0.L(24.0f)) && Math.abs(this.E3 - this.P3) <= ((float) org.telegram.messenger.g0.L(24.0f));
                    this.N3 = eventTime;
                    float f10 = this.D3;
                    this.O3 = f10;
                    float f11 = this.E3;
                    this.P3 = f11;
                    if (!z10 && W4(this.F3, f10, f11)) {
                        this.I3 = true;
                        this.N3 = 0L;
                        org.telegram.ui.Cells.f fVar = h3Var.m0;
                        if (!h3Var.x()) {
                            return true;
                        }
                        h3Var.i = false;
                        h3Var.R = false;
                        h3Var.k = false;
                        t9 t9Var = h3Var.C;
                        if (t9Var != null) {
                            t9Var.invalidate();
                        }
                        org.telegram.messenger.g0.r(fVar);
                        org.telegram.messenger.g0.h3(fVar);
                        return true;
                    }
                    if (this.F3 != null) {
                        Runnable runnable = this.G3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        b bVar = new b(this, 2);
                        this.G3 = bVar;
                        postDelayed(bVar, ViewConfiguration.getLongPressTimeout());
                    }
                }
            }
            int i11 = 0;
            while (true) {
                if (i11 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (top >= childAt.getTop() && top < childAt.getBottom() && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                    view = childAt;
                    break;
                }
                i11++;
            }
            this.F3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (h3Var.x()) {
            }
            this.N3 = eventTime2;
            float f102 = this.D3;
            this.O3 = f102;
            float f112 = this.E3;
            this.P3 = f112;
            if (!z10) {
            }
            if (this.F3 != null) {
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.G3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.G3 = null;
                }
                if (this.J3) {
                    b5(motionEvent.getX(), motionEvent.getY());
                    n5 n5Var3 = this.q4;
                    if (this.J3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.J3 = false;
                    this.L3 = null;
                    this.M3 = null;
                    this.K3 = n5Var3 != null && n5Var3.getSelectedCells().size() > 1;
                    if (n5Var3 != null && !n5Var3.I.isEmpty()) {
                        I4(n5Var3);
                    }
                    this.F3 = null;
                    this.I3 = false;
                    return true;
                }
                if (!this.H3 && !this.I3) {
                    View view2 = this.F3;
                    if (view2 instanceof n5) {
                        if (m3((n5) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.F3 = null;
                            this.I3 = false;
                            return false;
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (n5Var = this.q4) != null) {
                    View view3 = this.F3;
                    if (view3 == n5Var) {
                        n5 n5Var4 = (n5) view3;
                        TL_iv.pageTableCell n4 = n5Var4.n((int) ((motionEvent.getX() - n5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - n5Var4.getTop()) - getTop()));
                        if (n4 != null) {
                            if (this.s4 >= 0 || this.t4 >= 0) {
                                P2();
                            } else {
                                LinkedHashSet linkedHashSet = n5Var4.I;
                                if (!linkedHashSet.remove(n4)) {
                                    linkedHashSet.add(n4);
                                }
                                n5Var4.w.invalidate();
                                n5Var4.v();
                            }
                        }
                    } else if (view3 != null) {
                        P2();
                    }
                }
                boolean z11 = this.H3;
                f41 f41Var = this.g3;
                ArrayList arrayList = this.t3;
                if (!z11 && !this.I3 && this.F3 == null && !h3Var.x() && this.q4 == null) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x10 >= getLeft() && x10 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i12 = 0; i12 < getChildCount(); i12++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i12).getBottom() + getTop());
                        }
                        int z12 = org.telegram.messenger.k5.z(60.0f, view4.getHeight(), Math.max(Math.max(this.Y3, this.W3), this.X3));
                        if (y10 >= paddingTop && y10 <= z12) {
                            a aVar = arrayList.isEmpty() ? null : (a) k2.p1.h(1, arrayList);
                            if (aVar == null || !aVar.k.isEmpty() || H3(aVar.b) || aVar.i || A3(aVar) || N2(aVar.b)) {
                                g2 g2Var = this.R3;
                                if (g2Var != null) {
                                    g2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                f41Var.O(false);
                                g2 g2Var2 = this.R3;
                                if (g2Var2 != null) {
                                    g2Var2.h();
                                }
                                post(new n2(this, aVar2, 19));
                            } else {
                                h3(aVar);
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && this.F3 == null && !h3Var.x() && this.q4 == null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.Z3 && x11 >= getLeft() && x11 <= getRight()) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= getChildCount()) {
                                i3 = Integer.MAX_VALUE;
                                break;
                            }
                            View childAt2 = getChildAt(i13);
                            if (RecyclerView.R(childAt2) == 0) {
                                i3 = childAt2.getTop() + getTop();
                                break;
                            }
                            i13++;
                        }
                        if (i3 != Integer.MAX_VALUE) {
                            if (y11 >= org.telegram.messenger.g0.L(60.0f) + getTop() && y11 <= i3) {
                                a aVar3 = arrayList.isEmpty() ? null : (a) arrayList.get(0);
                                if (aVar3 == null || H3(aVar3.b) || aVar3.i || A3(aVar3) || N2(aVar3.b)) {
                                    g2 g2Var3 = this.R3;
                                    if (g2Var3 != null) {
                                        g2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    f41Var.O(false);
                                    g2 g2Var4 = this.R3;
                                    if (g2Var4 != null) {
                                        g2Var4.h();
                                    }
                                    post(new n2(this, aVar4, 16));
                                } else {
                                    i3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (this.F3 instanceof p4) && !h3Var.x() && this.q4 == null && (row = ((p4) this.F3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        p.Z(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new f(3, this, pageblockmath), this.o3);
                    }
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
            if (action == 2) {
                if (this.J3 && this.F3 == this.q4) {
                    b5(motionEvent.getX(), motionEvent.getY());
                    this.H3 = true;
                    return true;
                }
                float x12 = motionEvent.getX() - this.D3;
                float y12 = motionEvent.getY() - this.E3;
                if ((y12 * y12) + (x12 * x12) > org.telegram.messenger.g0.L(8.0f) * org.telegram.messenger.g0.L(8.0f)) {
                    this.H3 = true;
                    Runnable runnable3 = this.G3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.G3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.G3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.G3 = null;
                }
                if (this.J3) {
                    P2();
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
        }
        return false;
    }

    public final int l4(int i3) {
        Layout layout;
        View D4 = D4(i3);
        if (!(D4 instanceof b6) || (layout = ((b6) D4).getEditText().getLayout()) == null) {
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
    public final boolean m3(n5 n5Var, int i3, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int r5 = n5Var.r(i3, i10);
        LinkedHashSet linkedHashSet = n5Var.I;
        p5 p5Var = n5Var.w;
        if (r5 >= 0) {
            int r9 = (p5Var.v() && r5 == p5Var.k()) ? p5Var.r() : r5;
            if (n5Var == this.q4 && (f6Var2 = n5Var.G) != null && r5 >= 0 && r9 >= r5 && r9 < f6Var2.b && !linkedHashSet.isEmpty()) {
                int i11 = r5;
                loop0: while (i11 <= r9) {
                    int i12 = 0;
                    while (true) {
                        f6 f6Var3 = n5Var.G;
                        if (i12 < f6Var3.c) {
                            if (!linkedHashSet.contains(f6Var3.d[i11][i12])) {
                                break loop0;
                            }
                            i12++;
                        }
                    }
                }
                I4(n5Var);
                return true;
            }
            j2(n5Var);
            f6 f6Var4 = n5Var.G;
            if (f6Var4 != null && r5 >= 0 && r9 >= r5 && r9 < f6Var4.b) {
                linkedHashSet.clear();
                for (int i13 = r5; i13 <= r9; i13++) {
                    int i14 = 0;
                    while (true) {
                        f6 f6Var5 = n5Var.G;
                        if (i14 < f6Var5.c) {
                            TL_iv.pageTableCell pagetablecell = f6Var5.d[i13][i14];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i14++;
                        }
                    }
                }
                p5Var.invalidate();
                n5Var.v();
            }
            this.s4 = r5;
            return true;
        }
        int p10 = n5Var.p(i3, i10);
        if (p10 < 0) {
            return false;
        }
        int q10 = (p5Var.u() && p10 == p5Var.j()) ? p5Var.q() : p10;
        if (n5Var == this.q4 && (f6Var = n5Var.G) != null && p10 >= 0 && q10 >= p10 && q10 < f6Var.c && !linkedHashSet.isEmpty()) {
            int i15 = p10;
            loop4: while (i15 <= q10) {
                int i16 = 0;
                while (true) {
                    f6 f6Var6 = n5Var.G;
                    if (i16 < f6Var6.b) {
                        if (!linkedHashSet.contains(f6Var6.d[i16][i15])) {
                            break loop4;
                        }
                        i16++;
                    }
                }
            }
            I4(n5Var);
            return true;
        }
        j2(n5Var);
        f6 f6Var7 = n5Var.G;
        if (f6Var7 != null && p10 >= 0 && q10 >= p10 && q10 < f6Var7.c) {
            linkedHashSet.clear();
            for (int i17 = p10; i17 <= q10; i17++) {
                int i18 = 0;
                while (true) {
                    f6 f6Var8 = n5Var.G;
                    if (i18 < f6Var8.b) {
                        TL_iv.pageTableCell pagetablecell2 = f6Var8.d[i18][i17];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i18++;
                    }
                }
            }
            p5Var.invalidate();
            n5Var.v();
        }
        this.t4 = p10;
        return true;
    }

    public final h1 m4(int i3) {
        View D4 = D4(i3);
        if (D4 instanceof b6) {
            return ((b6) D4).getAuthorEditText();
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
    public final TL_iv.PageBlock n2(int i3, int i10, int i11, int i12, boolean z10, int[] iArr) {
        int i13;
        TL_iv.RichText richText;
        int i14;
        a aVar;
        TL_iv.RichText richText2;
        ArrayList arrayList;
        boolean z11;
        int i15 = i11;
        int i16 = i12;
        TL_iv.pageBlockOrderedList pageblockorderedlist = z10 ? new TL_iv.pageBlockOrderedList() : null;
        TL_iv.pageBlockList pageblocklist = z10 ? null : new TL_iv.pageBlockList();
        int i17 = i3;
        int i18 = 1;
        while (i17 < i15) {
            t3 t3Var = this;
            ArrayList arrayList2 = t3Var.t3;
            a aVar2 = (a) arrayList2.get(i17);
            if (aVar2.k.size() > i16 || (i13 = aVar2.c) < i10) {
                break;
            }
            if (i13 == i10) {
                if ((aVar2.d > 0) != z10) {
                    break;
                }
            }
            if (i13 > i10) {
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
            int i19 = i17 + 1;
            ArrayList arrayList3 = new ArrayList();
            if (H3) {
                M2(arrayList3, aVar2);
            }
            while (true) {
                if (i19 >= i15) {
                    i14 = i19;
                    aVar = aVar2;
                    richText2 = richText;
                    arrayList = arrayList3;
                    break;
                }
                a aVar3 = (a) arrayList2.get(i19);
                if (aVar3.k.size() <= i16) {
                    aVar = aVar2;
                    int i20 = aVar3.c;
                    if (i20 < i10) {
                        break;
                    }
                    if (i20 != i10) {
                        if (aVar3.d > 0) {
                            richText2 = richText;
                            z11 = true;
                        } else {
                            richText2 = richText;
                            z11 = false;
                        }
                        ArrayList arrayList4 = arrayList3;
                        int[] iArr2 = {i19};
                        t3 t3Var2 = t3Var;
                        i14 = i19;
                        arrayList = arrayList4;
                        TL_iv.PageBlock n22 = t3Var2.n2(i14, i20, i15, i16, z11, iArr2);
                        if (n22 != null) {
                            arrayList.add(n22);
                        }
                        i19 = iArr2[0];
                        if (i19 <= i14) {
                            break;
                        }
                        t3Var = this;
                        i15 = i11;
                        i16 = i12;
                        richText = richText2;
                        aVar2 = aVar;
                        arrayList3 = arrayList;
                    } else {
                        if (!H3(aVar3.b)) {
                            break;
                        }
                        M2(arrayList3, aVar3);
                        i19++;
                        aVar2 = aVar;
                    }
                } else {
                    i14 = i19;
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
                    i15 = i11;
                    i16 = i12;
                    i17 = i14;
                } else if (z10) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                    tL_pageListOrderedItemBlocks.num = com.google.android.recaptcha.internal.a.h(i18, ".");
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
                tL_pageListOrderedItemText.num = com.google.android.recaptcha.internal.a.h(i18, ".");
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
            i18++;
            i15 = i11;
            i16 = i12;
            i17 = i14;
        }
        iArr[0] = i17;
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
        int i3 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i3);
            if (!b6.z(aVar.b).isEmpty()) {
                break;
            }
            if (!G3(aVar.b)) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (s sVar : T3(aVar)) {
                if (sVar.b() || sVar.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i10 = n4.N;
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
            i3++;
        }
        return true;
    }

    public final boolean o2() {
        h1 editText;
        int length;
        int C;
        int A;
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x() || h3Var.p0 != h3Var.s0) {
            return false;
        }
        if (O3()) {
            int i3 = h3Var.p0;
            int i10 = h3Var.q0;
            if (i10 != h3Var.t0) {
                return false;
            }
            editText = Q4(i3, i10);
        } else if (B3()) {
            editText = L2(h3Var.p0);
        } else if (z3()) {
            editText = v2(h3Var.p0);
        } else if (J3()) {
            editText = m4(h3Var.p0);
        } else {
            b6 J4 = J4();
            if (J4 == null) {
                return false;
            }
            editText = J4.getEditText();
        }
        if (editText == null || (C = k2.p1.C(h3Var.r0, h3Var.u0, (length = editText.length()), 0)) >= (A = k2.p1.A(h3Var.r0, h3Var.u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && C < A) {
            for (j4 j4Var : (j4[]) text.getSpans(C, A, j4.class)) {
                if (text.getSpanStart(j4Var) < A && text.getSpanEnd(j4Var) > C) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.U3);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.U3);
        this.i3 = false;
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        int i14 = this.S3;
        boolean z11 = i14 > 0 && i13 < i14;
        super.onLayout(z10, i3, i10, i11, i12);
        if (z11) {
            View findFocus = findFocus();
            View F = findFocus == null ? null : F(findFocus);
            if (F != null) {
                int L = (org.telegram.messenger.g0.L(8.0f) + F.getBottom()) - (i13 - getPaddingBottom());
                if (L > 0) {
                    post(new i2(this, L, 2));
                }
            }
        }
        this.S3 = i13;
    }

    public final boolean p2() {
        int[] G4 = G4();
        if (G4 == null) {
            return q2(G2());
        }
        for (int i3 = G4[0]; i3 <= G4[1]; i3++) {
            if (q2((a) this.t3.get(i3))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                return false;
            }
            Iterator it = T3((a) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                if (((s) it.next()).a()) {
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean p4(int i3, int i10, boolean z10) {
        boolean z11;
        if (i3 >= 0 && i10 >= i3) {
            ArrayList arrayList = this.t3;
            if (i10 < arrayList.size()) {
                g2 g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i10 >= i3) {
                        if (t3(i10, true, true)) {
                            z11 = true;
                        }
                        i10--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i3);
                    if (aVar.c >= 1 && (i3 == 0 || ((a) arrayList.get(i3 - 1)).c < aVar.c)) {
                        return false;
                    }
                    z11 = false;
                    while (i3 <= i10) {
                        if (t3(i3, false, true)) {
                            z11 = true;
                        }
                        i3++;
                    }
                }
                if (z11) {
                    v4();
                    if (findFocus() instanceof h1) {
                        b2();
                    } else {
                        this.g3.O(false);
                    }
                    g2 g2Var2 = this.R3;
                    if (g2Var2 != null) {
                        g2Var2.h();
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
        if (aVar == null || (indexOf = (arrayList = this.t3).indexOf(aVar)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
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
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            KeyEvent.Callback childAt = getChildAt(i3);
            if (childAt instanceof b6) {
                b6 b6Var = (b6) childAt;
                b6Var.f.m();
                b6Var.h.m();
            } else if (childAt instanceof n5) {
                n5 n5Var = (n5) childAt;
                p5 p5Var = n5Var.w;
                n5Var.r.m();
                for (int i10 = 0; i10 < p5Var.getChildCount(); i10++) {
                    View childAt2 = p5Var.getChildAt(i10);
                    if (childAt2 instanceof q5) {
                        ((q5) childAt2).a.m();
                    }
                }
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().m();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().m();
            }
        }
    }

    public final void q4(a aVar) {
        View C1 = C1(aVar);
        if (C1 instanceof t4) {
            t4 t4Var = (t4) C1;
            ArrayList arrayList = t4Var.E;
            if (t4Var.a == null) {
                return;
            }
            t4Var.p();
            if (t4Var.a0 >= arrayList.size()) {
                t4Var.a0 = Math.max(0, arrayList.size() - 1);
            }
            t4Var.q(false);
            t4Var.requestLayout();
            t4Var.invalidate();
        }
    }

    public final boolean r2(int i3) {
        if (i3 <= 0) {
            return false;
        }
        ArrayList arrayList = this.t3;
        return i3 < arrayList.size() && H3(((a) arrayList.get(i3)).b) && ((a) arrayList.get(i3 - 1)).c >= 1;
    }

    public final void r3(boolean z10) {
        h3 h3Var = this.v3;
        if (h3Var != null) {
            if (z10) {
                h3Var.f(false);
            } else {
                org.telegram.messenger.g0.r(h3Var.m0);
                h3Var.u();
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
        for (int i3 = G4[0]; i3 <= G4[1]; i3++) {
            if (t2((a) this.t3.get(i3))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3(int i3) {
        return ((a) this.t3.get(i3)).c + 1 <= ((org.telegram.messenger.j0) hp.s1(this.n3).x7.X.b).c + (-6);
    }

    public final void s4(int i3) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i3 + 1);
        for (int max = Math.max(0, i3 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.c > 0) {
                View C1 = C1(aVar);
                if (C1 instanceof b6) {
                    ((b6) C1).F();
                }
            }
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.r3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.Z3 = z10;
    }

    public void setFileRefParentObject(zi ziVar) {
        this.q3 = ziVar;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        Z2(arrayList, b5.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((a) arrayList.get(size));
        }
        this.g3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        return aVar != null && (indexOf = (arrayList = this.t3).indexOf(aVar)) >= 0 && aVar.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((a) arrayList.get(indexOf)).c > 0;
    }

    public final boolean t3(int i3, boolean z10, boolean z11) {
        int i10 = 0;
        if (i3 >= 0) {
            ArrayList arrayList = this.t3;
            if (i3 < arrayList.size()) {
                a aVar = (a) arrayList.get(i3);
                if (z10) {
                    if (aVar.c > 0) {
                        w2(i3);
                        return true;
                    }
                } else if (aVar.c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || r2(i3)) && s3(i3)) {
                        a aVar2 = i3 > 0 ? (a) arrayList.get(i3 - 1) : null;
                        if (!z12) {
                            aVar.c = aVar2.c;
                            aVar.d = aVar2.d > 0 ? 1 : 0;
                            aVar.e = false;
                            aVar.f = false;
                            return true;
                        }
                        aVar.c = 1;
                        if (aVar2 != null && aVar2.d > 0) {
                            i10 = 1;
                        }
                        aVar.d = i10;
                        return true;
                    }
                } else if ((z11 || (i3 != 0 && ((a) arrayList.get(i3 - 1)).c >= aVar.c)) && s3(i3)) {
                    aVar.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void t4(a aVar, s sVar) {
        if (aVar == null) {
            return;
        }
        if (!E3(aVar.b)) {
            u4(aVar);
            return;
        }
        ArrayList j32 = j3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(sVar) : -1;
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
        f41 f41Var = this.g3;
        if (size != 1) {
            f41Var.O(true);
            q4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) j32.get(0);
        aVar.b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.g = (s) aVar.h.get(0);
        aVar.h = null;
        f41Var.O(true);
        q4(aVar);
    }

    public final boolean u2() {
        g2 g2Var = this.R3;
        if (g2Var != null) {
            return g2Var.e || !g2Var.b.isEmpty();
        }
        return false;
    }

    public final void u3(boolean z10) {
        int i3;
        int i10;
        int[] G4 = G4();
        if (G4 != null && (i3 = G4[0]) != (i10 = G4[1])) {
            p4(i3, i10, z10);
            return;
        }
        a G2 = G4 == null ? G2() : (a) this.t3.get(G4[0]);
        if (G2 != null) {
            Z3(G2, z10);
        }
    }

    public final void u4(a aVar) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.g3.O(true);
        }
    }

    public final h1 v2(int i3) {
        KeyEvent.Callback D4 = D4(i3);
        if (D4 instanceof l0) {
            return ((l0) D4).getCaptionEditText();
        }
        return null;
    }

    public final void v3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.k;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size && i3 < arrayList.size() && ((Long) arrayList3.get(i3)).equals(arrayList.get(i3))) {
            i3++;
        }
        for (int i10 = size - 1; i10 >= i3; i10--) {
            Long l10 = (Long) arrayList3.get(i10);
            long longValue = l10.longValue();
            Integer num = (Integer) hashMap.get(l10);
            if (num != null && (num.intValue() >= 2 || i10 != 0 || this.u3.containsKey(l10))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.t = longValue;
                for (int i11 = 0; i11 <= i10; i11++) {
                    aVar2.k.add((Long) arrayList3.get(i11));
                }
                int i12 = e5.b;
                r31 K = r31.K(e5.class);
                K.G = aVar2;
                K.H = this.n4;
                arrayList2.add(K);
                this.x4.add(aVar2);
            }
        }
    }

    public final void v4() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i3 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i3);
            if (aVar.c > 0 && aVar.d > 0 && !H3(aVar.b)) {
                int i10 = aVar.c;
                int i11 = 1;
                for (int i12 = i3 - 1; i12 >= 0; i12--) {
                    a aVar2 = (a) arrayList.get(i12);
                    int i13 = aVar2.c;
                    if (i13 < i10) {
                        break;
                    }
                    if (i13 == i10 && !H3(aVar2.b)) {
                        if (aVar2.d <= 0) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                aVar.d = i11;
            }
            i3++;
        }
    }

    public final void w2(int i3) {
        a aVar;
        int i10;
        ArrayList arrayList = this.t3;
        a aVar2 = (a) arrayList.get(i3);
        int i11 = aVar2.c;
        if (i11 <= 0) {
            return;
        }
        int i12 = i11 - 1;
        aVar2.c = i12;
        if (i12 == 0) {
            aVar2.d = 0;
            aVar2.e = false;
            aVar2.f = false;
        }
        while (true) {
            i3++;
            if (i3 >= arrayList.size() || (i10 = (aVar = (a) arrayList.get(i3)).c) <= i11) {
                return;
            } else {
                aVar.c = i10 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w3() {
        g2 g2Var;
        g2 g2Var2 = this.R3;
        if (g2Var2 != null) {
            g2Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        a aVar = new a(pageblockdetails, 0, 0);
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar3.i = true;
        a T2 = T2();
        ArrayList arrayList = this.t3;
        int indexOf = T2 != null ? arrayList.indexOf(T2) : -1;
        if (T2 != null) {
            TL_iv.PageBlock pageBlock = T2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && T2.g == null && !T2.i && b6.z(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, aVar3);
                arrayList.add(indexOf, aVar2);
                arrayList.add(indexOf, aVar);
                this.g3.O(false);
                g2Var = this.R3;
                if (g2Var != null) {
                    g2Var.h();
                }
                post(new n2(this, aVar, 20));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, aVar3);
        arrayList.add(indexOf, aVar2);
        arrayList.add(indexOf, aVar);
        this.g3.O(false);
        g2Var = this.R3;
        if (g2Var != null) {
        }
        post(new n2(this, aVar, 20));
    }

    public final void w4(String str) {
        h3 h3Var = this.v3;
        a2(h3Var.p0, h3Var.r0, h3Var.s0, h3Var.u0, str.split("\n", -1));
    }

    public final b6 x2(int i3) {
        if (i3 < 0) {
            return null;
        }
        View m10 = this.f3.m(i3);
        if (m10 instanceof b6) {
            return (b6) m10;
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
            T2 = this.k4;
        }
        ArrayList arrayList2 = this.t3;
        int indexOf3 = T2 != null ? arrayList2.indexOf(T2) : -1;
        if (indexOf3 < 0 || !(T2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long a10 = o0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) T2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a10), richText);
            }
            T2.k.add(Long.valueOf(a10));
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
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && T2.g == null && b6.z(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, aVar);
                this.k4 = aVar;
                indexOf = arrayList2.indexOf(aVar);
                if (indexOf < arrayList2.size() - 1 || H3(((a) arrayList2.get(indexOf + 1)).b)) {
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z11) {
                        aVar2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, aVar2);
                }
                this.g3.O(!z10);
                indexOf2 = arrayList2.indexOf(aVar) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || H3(((a) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new n2(this, (a) arrayList2.get(indexOf2), 17));
                return;
            }
        }
        if (indexOf3 >= 0) {
            arrayList2.add(indexOf3 + 1, aVar);
        } else {
            arrayList2.add(aVar);
        }
        this.k4 = aVar;
        indexOf = arrayList2.indexOf(aVar);
        if (indexOf < arrayList2.size() - 1) {
        }
        a aVar22 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z11) {
        }
        arrayList2.add(indexOf + 1, aVar22);
        this.g3.O(!z10);
        indexOf2 = arrayList2.indexOf(aVar) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final s x4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document V2 = V2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (V2 == null) {
                return null;
            }
            s sVar = new s();
            sVar.c = true;
            sVar.a = 2;
            sVar.h = V2;
            sVar.i = V2;
            return sVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document V22 = V2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (V22 == null) {
                return null;
            }
            s sVar2 = new s();
            sVar2.d = true;
            sVar2.a = 2;
            sVar2.h = V22;
            return sVar2;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document V23 = V2(pageblockvideo.video_id);
            if (V23 == null) {
                return null;
            }
            s sVar3 = new s();
            sVar3.b = true;
            sVar3.a = 2;
            sVar3.h = V23;
            sVar3.n = pageblockvideo.spoiler;
            for (int i3 = 0; i3 < V23.attributes.size(); i3++) {
                if (V23.attributes.get(i3) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) V23.attributes.get(i3);
                    sVar3.j = tL_documentAttributeVideo.w;
                    sVar3.k = tL_documentAttributeVideo.h;
                    return sVar3;
                }
            }
            return sVar3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        long j10 = pageblockphoto.photo_id;
        if (j10 == 0) {
            photo = null;
        } else {
            int i10 = 0;
            loop1: while (true) {
                if (i10 < this.t3.size()) {
                    for (s sVar4 : T3((a) this.t3.get(i10))) {
                        if (sVar4 != null && (photo = sVar4.g) != null && photo.id == j10) {
                            break loop1;
                        }
                    }
                    i10++;
                } else {
                    TL_iv.RichMessage richMessage = this.s3;
                    if (richMessage != null && (arrayList = richMessage.photos) != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            TLRPC.Photo photo2 = arrayList.get(i11);
                            i11++;
                            TLRPC.Photo photo3 = photo2;
                            if (photo3 != null && photo3.id == j10) {
                                photo = photo3;
                                break;
                            }
                        }
                    }
                    HashMap hashMap = u4.a;
                    synchronized (u4.class) {
                        photo = j10 == 0 ? null : (TLRPC.Photo) u4.a.get(Long.valueOf(j10));
                    }
                }
            }
        }
        if (photo == null) {
            return null;
        }
        s sVar5 = new s();
        sVar5.a = 2;
        sVar5.g = photo;
        sVar5.n = pageblockphoto.spoiler;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null) {
            sVar5.j = w10.w;
            sVar5.k = w10.h;
        }
        return sVar5;
    }

    public final void y2() {
        J2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new g2(this.w4);
        C4();
        this.R3.j();
        r3 r3Var = this.p3;
        if (r3Var != null) {
            r3Var.O1();
        }
    }

    public final void y4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 == null || aVar == null || (pageBlock = aVar.b) == null) {
            return;
        }
        if (!E3(pageBlock)) {
            s x42 = x4(aVar.b);
            if (x42 != null) {
                aVar.g = x42;
                return;
            }
            return;
        }
        ArrayList j32 = j3(aVar.b);
        aVar.h = new ArrayList();
        if (j32 != null) {
            for (int i3 = 0; i3 < j32.size(); i3++) {
                s x43 = x4((TL_iv.PageBlock) j32.get(i3));
                ArrayList arrayList = aVar.h;
                if (x43 == null) {
                    x43 = new s();
                }
                arrayList.add(x43);
            }
        }
    }

    public final boolean z3() {
        int i3;
        h3 h3Var = this.v3;
        if (h3Var == null || !h3Var.x() || (i3 = h3Var.p0) != h3Var.s0 || i3 < 0 || i3 >= this.x4.size()) {
            return false;
        }
        return D4(i3) instanceof l0;
    }

    public final ArrayList z4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            a aVar = (a) obj;
            if (E3(aVar.b)) {
                ArrayList j32 = j3(aVar.b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (j32 != null) {
                    int size2 = j32.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = j32.get(i10);
                        i10++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        s x42 = x4(pageBlock);
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
                    s x43 = x4(pageBlock2);
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
