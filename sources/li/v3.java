package li;

import a8.ye;
import a8.zd;
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
import bi.u7;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xm0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v3 extends s71 {
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
    public f2 R3;
    public int S3;
    public g1 T3;
    public final i U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public a a4;
    public boolean b4;
    public final n3 c4;
    public final q2 d4;
    public final o3 e4;
    public final p3 f4;
    public final q3 g4;
    public final IdentityHashMap h4;
    public final IdentityHashMap i4;
    public a j4;
    public a k4;
    public final r3 l4;
    public final z2 m4;
    public final int n3;
    public final a3 n4;
    public final u6 o3;
    public final b3 o4;
    public final t3 p3;
    public final c3 p4;
    public MessageObject q3;
    public p5 q4;
    public boolean r3;
    public l80 r4;
    public TL_iv.RichMessage s3;
    public int s4;
    public final ArrayList t3;
    public int t4;
    public final HashMap u3;
    public final r2 u4;
    public final j3 v3;
    public final d3 v4;
    public final ea w3;
    public final e3 w4;
    public int x3;
    public final ArrayList x4;
    public int y3;
    public xm0 y4;
    public int z3;
    public int z4;

    public v3(Context context, int i10, u6 u6Var, t3 t3Var) {
        super(context, i10, 0, false, new hi.e2(r1, 18), new jg.e1(r1, 9), null, u6Var);
        this.r3 = true;
        this.t3 = new ArrayList();
        this.u3 = new HashMap();
        this.x3 = -1;
        this.y3 = -1;
        this.z3 = 0;
        this.U3 = new i(this, 2);
        this.Z3 = true;
        this.c4 = new n3(this);
        this.d4 = new q2(this);
        this.e4 = new o3(this);
        this.f4 = new p3(this);
        this.g4 = new q3(this);
        this.h4 = new IdentityHashMap();
        this.i4 = new IdentityHashMap();
        this.l4 = new r3(this);
        this.m4 = new z2(this);
        this.n4 = new a3(this);
        this.o4 = new b3(this);
        this.p4 = new c3(this);
        this.s4 = -1;
        this.t4 = -1;
        this.u4 = new r2(this);
        this.v4 = new d3(this);
        e3 e3Var = new e3(this, 0);
        this.w4 = e3Var;
        this.x4 = new ArrayList();
        this.z4 = -1;
        v3[] v3VarArr = {this};
        this.n3 = i10;
        this.o3 = u6Var;
        this.p3 = t3Var;
        this.g3.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        H1(new hi.e2(this, 19), false);
        setReorderLongPressEnabled(false);
        C1(true);
        j3 j3Var = new j3(this, t3Var);
        this.v3 = j3Var;
        j3Var.S(this);
        j3Var.z0 = this.f3;
        ea n10 = j3Var.n(context);
        this.w3 = n10;
        AndroidUtilities.removeFromParent(n10);
        j3Var.D = new l3(this, t3Var);
        j(new ai.u0(1, this, t3Var));
        this.R3 = new f2(e3Var);
    }

    public static boolean B3(int i10) {
        return i10 == 21 || i10 == 22 || i10 == 19 || i10 == 20;
    }

    public static int C2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        if (i10 == 32768) {
            return LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD;
        }
        return 4;
    }

    public static boolean D3(a aVar) {
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || K3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !d6.y(pageBlock).isEmpty()) ? false : true;
    }

    public static boolean G3(TL_iv.PageBlock pageBlock) {
        return (K3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean H3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean I3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean J3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || H3(pageBlock);
    }

    public static boolean K3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean L3(a aVar) {
        return aVar != null && !aVar.i && !D3(aVar) && (aVar.b instanceof TL_iv.pageBlockParagraph) && aVar.c == 0 && aVar.d == 0 && !aVar.e && aVar.k.isEmpty();
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
    public static void O1(v3[] v3VarArr, ArrayList arrayList, k71 k71Var) {
        int i10;
        boolean z10;
        ArrayList arrayList2;
        int i11;
        boolean z11;
        int i12;
        v3 v3Var = v3VarArr[0];
        if (v3Var != null) {
            ArrayList arrayList3 = v3Var.t3;
            v3Var.g2();
            ArrayList arrayList4 = v3Var.x4;
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
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i15), 1, new v2());
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
                        a1.g.A(i10, arrayList6);
                    }
                    if (i19 == i16 || arrayList6.size() >= i19) {
                        if (i20 == 0) {
                            if (i18 != 0) {
                                k71Var.L();
                                i18 = 0;
                            }
                            int i21 = t0.a;
                            u61 K = u61.K(t0.class);
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
                    if (D3(aVar3)) {
                        if (i22 == 0) {
                            boolean z15 = ((TL_iv.pageBlockDetails) aVar3.b).open;
                            if (!arrayList6.isEmpty() || z15) {
                                if (i18 != 0) {
                                    k71Var.L();
                                    i18 = 0;
                                }
                            } else if (i18 == 0) {
                                k71Var.M();
                                i18 = i10;
                            }
                            c3 c3Var = v3Var.p4;
                            int i23 = r0.a;
                            u61 K2 = u61.K(r0.class);
                            K2.G = aVar3;
                            K2.H = c3Var;
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
                                    if (num.intValue() >= 2 || i25 > 0 || v3Var.u3.containsKey(l4)) {
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
                            v3Var.y3(aVar2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (i18 == 0) {
                                k71Var.M();
                                i18 = 1;
                            }
                        } else if (i18 != 0) {
                            k71Var.L();
                            i18 = 0;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            q2 q2Var = v3Var.d4;
                            int i26 = v0.a;
                            u61 K3 = u61.K(v0.class);
                            K3.G = aVar3;
                            K3.H = q2Var;
                            arrayList.add(K3);
                        } else if (J3(pageBlock)) {
                            o3 o3Var = v3Var.e4;
                            int i27 = t4.a;
                            u61 K4 = u61.K(t4.class);
                            K4.d = (int) aVar3.a;
                            K4.G = aVar3;
                            K4.H = o3Var;
                            arrayList.add(K4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                p3 p3Var = v3Var.f4;
                                int i28 = x.a;
                                u61 K5 = u61.K(x.class);
                                K5.G = aVar3;
                                K5.H = p3Var;
                                arrayList.add(K5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                q3 q3Var = v3Var.g4;
                                int i29 = x0.a;
                                u61 K6 = u61.K(x0.class);
                                K6.G = aVar3;
                                K6.H = q3Var;
                                arrayList.add(K6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                r3 r3Var = v3Var.l4;
                                int i30 = n4.a;
                                u61 K7 = u61.K(n4.class);
                                K7.G = aVar3;
                                K7.H = r3Var;
                                arrayList.add(K7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                z2 z2Var = v3Var.m4;
                                int i31 = p4.a;
                                u61 K8 = u61.K(p4.class);
                                K8.G = aVar3;
                                K8.H = z2Var;
                                arrayList.add(K8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                b3 b3Var = v3Var.o4;
                                int i32 = n5.a;
                                u61 K9 = u61.K(n5.class);
                                K9.G = aVar3;
                                K9.H = b3Var;
                                arrayList.add(K9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                n3 n3Var = v3Var.c4;
                                int i33 = e0.a;
                                u61 K10 = u61.K(e0.class);
                                K10.G = aVar3;
                                K10.H = n3Var;
                                arrayList.add(K10);
                            } else {
                                aVar3.p = i17 == 0;
                                aVar3.q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2) {
                                    i11 = 1;
                                    if (i17 == 1 && (aVar3.b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                        z11 = true;
                                        d3 d3Var = v3Var.v4;
                                        int i34 = b6.a;
                                        u61 K11 = u61.K(b6.class);
                                        K11.G = aVar3;
                                        K11.H = d3Var;
                                        K11.r = z11;
                                        arrayList.add(K11);
                                        arrayList4.add(aVar3);
                                        aVar2 = aVar3;
                                    }
                                } else {
                                    i11 = 1;
                                }
                                z11 = false;
                                d3 d3Var2 = v3Var.v4;
                                int i342 = b6.a;
                                u61 K112 = u61.K(b6.class);
                                K112.G = aVar3;
                                K112.H = d3Var2;
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
                k71Var.L();
            }
            if (aVar2 != null) {
                v3Var.y3(aVar2, A4, hashMap, arrayList);
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
                    aVar4.l = size2 - r4(aVar4, aVar5);
                    int r42 = size2 - r4(aVar4, aVar6);
                    aVar4.m = r42;
                    aVar4.n = aVar4.l > 0 ? i35 : 0;
                    aVar4.o = r42 > 0 ? i35 : 0;
                }
                i36++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P2(ArrayList arrayList, a aVar) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            t tVar = aVar.g;
            if (tVar == null || !tVar.b()) {
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
            t tVar2 = aVar.g;
            if (tVar2 == null || !tVar2.b()) {
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
        if (H3(pageBlock)) {
            ArrayList m32 = m3(aVar.b);
            List W3 = W3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i10 = 0; m32 != null && i10 < m32.size() && i10 < W3.size(); i10++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) m32.get(i10);
                if (((t) W3.get(i10)).b()) {
                    if ((pageBlock4 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock4).photo_id : pageBlock4 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock4).video_id : 0L) != 0) {
                        j0.d(pageBlock4);
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
            j0.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        TL_iv.PageBlock pageBlock5 = aVar.b;
        if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
            t tVar3 = aVar.g;
            if (tVar3 == null || !tVar3.b()) {
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
            t tVar4 = aVar.g;
            if (tVar4 != null && (document = tVar4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.id;
            }
            if (tVar4 == null || !tVar4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = aVar.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                j0.d(pageBlock7);
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
            int i11 = o4.M;
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
                            h6.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                    }
                }
            }
        }
        if (U4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void Q1(v3 v3Var, int i10, int i11, int i12) {
        if (i10 < 0) {
            return;
        }
        KeyEvent.Callback m10 = v3Var.f3.m(i10);
        if (m10 instanceof d6) {
            d6 d6Var = (d6) m10;
            g1 authorEditText = (i11 == 1 && d6Var.m()) ? d6Var.getAuthorEditText() : d6Var.getEditText();
            authorEditText.s();
            authorEditText.setSelection(Math.max(0, Math.min(i12, authorEditText.length())));
            return;
        }
        if (!(m10 instanceof p5)) {
            if (m10 instanceof k0) {
                g1 captionEditText = ((k0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
                return;
            }
            return;
        }
        p5 p5Var = (p5) m10;
        g1 k10 = p5Var.k(i11);
        if (k10 == null) {
            k10 = p5Var.k(0);
        }
        if (k10 == null) {
            return;
        }
        k10.s();
        k10.setSelection(Math.max(0, Math.min(i12, k10.length())));
    }

    public static boolean Q2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.PageBlock R1(v3 v3Var, a aVar, int i10, int i11) {
        TL_iv.PageBlock TLdeserialize;
        v3Var.getClass();
        if (!G3(aVar.b)) {
            return null;
        }
        Editable S4 = v3Var.S4(aVar);
        int length = S4.length();
        int max = Math.max(0, Math.min(i10, length));
        if (i11 >= 0) {
            length = Math.max(0, Math.min(i11, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(S4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock != null) {
            try {
                R2(pageBlock);
                SerializedData serializedData = new SerializedData(pageBlock.getObjectSize());
                pageBlock.serializeToStream(serializedData);
                SerializedData serializedData2 = new SerializedData(serializedData.toByteArray());
                TLdeserialize = TL_iv.PageBlock.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                serializedData.cleanup();
                serializedData2.cleanup();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        TLdeserialize = new TL_iv.pageBlockParagraph();
        TLdeserialize.text = new TL_iv.textEmpty();
        d6.d(TLdeserialize, spannableStringBuilder);
        return TLdeserialize;
    }

    public static void R2(TL_iv.PageBlock pageBlock) {
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

    public static void S1(v3 v3Var, g1 g1Var) {
        if (g1Var == null) {
            v3Var.getClass();
            return;
        }
        g1Var.adaptiveCreateLinkDialog = v3Var.r3;
        g1Var.setInlineButtonContext(v3Var.n3);
        g1Var.setInlineButtonClickListener(new r2(v3Var));
    }

    public static void T1(a aVar, t tVar, v3 v3Var) {
        t3 t3Var = v3Var.p3;
        IdentityHashMap identityHashMap = v3Var.i4;
        IdentityHashMap identityHashMap2 = v3Var.h4;
        if (tVar != null) {
            a5 a5Var = (a5) identityHashMap2.remove(tVar);
            if (a5Var != null) {
                a5Var.b();
            }
            w4 w4Var = (w4) identityHashMap.remove(tVar);
            if (w4Var != null) {
                w4Var.a();
            }
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            v3Var.w4(aVar, tVar);
            f2 f2Var2 = v3Var.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            t3Var.onContentChanged();
            return;
        }
        ArrayList arrayList = v3Var.t3;
        for (t tVar2 : W3(aVar)) {
            a5 a5Var2 = (a5) identityHashMap2.remove(tVar2);
            if (a5Var2 != null) {
                a5Var2.b();
            }
            w4 w4Var2 = (w4) identityHashMap.remove(tVar2);
            if (w4Var2 != null) {
                w4Var2.a();
            }
        }
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            f2 f2Var3 = v3Var.R3;
            if (f2Var3 != null) {
                f2Var3.d();
            }
            arrayList.remove(indexOf);
            v3Var.g3.O(true);
            f2 f2Var4 = v3Var.R3;
            if (f2Var4 != null) {
                f2Var4.h();
            }
        }
        t3Var.onContentChanged();
    }

    public static void T2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        Y1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    U2(arrayList, pageBlock, i10 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        Y1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
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
        Y1(arrayList, null, i10, i11, z11, z12);
    }

    public static TL_iv.PageBlock T3(a aVar, t tVar) {
        if (!H3(aVar.b)) {
            return aVar.b;
        }
        ArrayList m32 = m3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(tVar) : -1;
        if (indexOf < 0 || m32 == null || indexOf >= m32.size()) {
            return null;
        }
        return (TL_iv.PageBlock) m32.get(indexOf);
    }

    public static void U1(v3 v3Var) {
        if (v3Var.Q3) {
            return;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.h();
        }
        v3Var.p3.n();
        v3Var.u4();
    }

    public static void U2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i11 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    Y1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    T2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
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
                Y1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i13 = i12;
                T2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i12 = i13;
            }
            i12++;
        }
    }

    public static boolean U4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(f6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!h6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void V1(v3 v3Var, a aVar) {
        ArrayList arrayList = v3Var.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.k.addAll(aVar.k);
        arrayList.add(indexOf + 1, aVar2);
        v3Var.y4();
        v3Var.g3.O(false);
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        v3Var.post(new m2(v3Var, aVar2, 23));
    }

    public static FrameLayout V4(p5 p5Var, boolean z10) {
        s5 m10;
        h6 model = p5Var.getModel();
        if (model != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = z10 ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : p5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z10 ? (h6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i11 || (o10 == i11 && a2 < i10) : o10 > i11 || (o10 == i11 && a2 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a2;
                    i11 = o10;
                }
            }
            if (pagetablecell != null && (m10 = p5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return p5Var;
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
    public static boolean W1(v3 v3Var, a aVar, boolean z10) {
        int i10;
        g1 editText;
        Editable text;
        f2 f2Var;
        f2 f2Var2;
        int i11;
        ArrayList arrayList = v3Var.x4;
        k71 k71Var = v3Var.g3;
        ArrayList arrayList2 = v3Var.t3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList3 = aVar.k;
            if (I3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                v3Var.a5(aVar, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            if (aVar.c > 0) {
                f2 f2Var3 = v3Var.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                View F1 = v3Var.F1(aVar);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    if (d6Var.getEditText().isFocused()) {
                        i11 = d6Var.getEditText().getSelectionEnd();
                        v3Var.z2(indexOf);
                        v3Var.y4();
                        if (v3Var.findFocus() instanceof g1) {
                            k71Var.O(false);
                            f2 f2Var4 = v3Var.R3;
                            if (f2Var4 != null) {
                                f2Var4.h();
                            }
                            v3Var.post(new y2(v3Var, aVar, 1));
                            return true;
                        }
                        v3Var.d2();
                        f2 f2Var5 = v3Var.R3;
                        if (f2Var5 != null) {
                            f2Var5.h();
                        }
                        if (i11 >= 0) {
                            v3Var.post(new o2(v3Var, aVar, i11, 2));
                            return true;
                        }
                    }
                }
                i11 = -1;
                v3Var.z2(indexOf);
                v3Var.y4();
                if (v3Var.findFocus() instanceof g1) {
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
                        f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        arrayList3.remove(arrayList3.size() - 1);
                        v3Var.D2();
                        v3Var.y4();
                        k71Var.O(false);
                        f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        v3Var.post(new y2(v3Var, aVar, 2));
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
                    f2Var = v3Var.R3;
                    if (f2Var != null) {
                    }
                    arrayList3.remove(arrayList3.size() - 1);
                    v3Var.D2();
                    v3Var.y4();
                    k71Var.O(false);
                    f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                    }
                    v3Var.post(new y2(v3Var, aVar, 2));
                    return true;
                }
                if (indexOf > 0) {
                    int i13 = indexOf - 1;
                    a aVar4 = (a) arrayList2.get(i13);
                    if (D3(aVar4) || aVar4.i) {
                        if (z10 && (!D3(aVar4) || ((i10 = indexOf + 1) < arrayList2.size() && !((a) arrayList2.get(i10)).i))) {
                            f2 f2Var6 = v3Var.R3;
                            if (f2Var6 != null) {
                                f2Var6.d();
                            }
                            arrayList2.remove(indexOf);
                            v3Var.y4();
                            k71Var.O(false);
                            f2 f2Var7 = v3Var.R3;
                            if (f2Var7 != null) {
                                f2Var7.h();
                            }
                            v3Var.post(new y2(v3Var, aVar4, 3));
                        }
                    } else {
                        if (K3(aVar4.b)) {
                            f2 f2Var8 = v3Var.R3;
                            if (f2Var8 != null) {
                                f2Var8.d();
                            }
                            arrayList2.remove(i13);
                            v3Var.y4();
                            k71Var.O(false);
                            f2 f2Var9 = v3Var.R3;
                            if (f2Var9 != null) {
                                f2Var9.h();
                            }
                            v3Var.post(new y2(v3Var, aVar, 4));
                            return true;
                        }
                        f2 f2Var10 = v3Var.R3;
                        if (f2Var10 != null) {
                            f2Var10.d();
                        }
                        View F12 = v3Var.F1(aVar4);
                        int indexOf2 = arrayList.indexOf(aVar);
                        if (!(F12 instanceof d6) || indexOf2 < 0) {
                            SpannableStringBuilder z11 = d6.z(aVar4.b);
                            int length = z11.length();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z11);
                            spannableStringBuilder.append((CharSequence) d6.z(aVar.b));
                            d6.d(aVar4.b, spannableStringBuilder);
                            arrayList2.remove(indexOf);
                            v3Var.D2();
                            v3Var.y4();
                            k71Var.O(false);
                            f2 f2Var11 = v3Var.R3;
                            if (f2Var11 != null) {
                                f2Var11.h();
                            }
                            v3Var.post(new o2(v3Var, aVar4, length, 5));
                            return true;
                        }
                        d6 d6Var2 = (d6) F12;
                        g1 editText2 = d6Var2.getEditText();
                        int length2 = editText2.length();
                        SpannableStringBuilder z12 = d6.z(aVar.b);
                        Editable text2 = editText2.getText();
                        if (text2 != null && z12 != null && z12.length() != 0) {
                            editText2.h = true;
                            text2.append((CharSequence) z12);
                            editText2.h = false;
                        }
                        d6.d(aVar4.b, editText2.getText());
                        View F13 = v3Var.F1(aVar);
                        if ((F13 instanceof d6) && (text = (editText = ((d6) F13).getEditText()).getText()) != null && text.length() > 0) {
                            editText.h = true;
                            text.delete(0, text.length());
                            editText.h = false;
                        }
                        d6Var2.A();
                        editText2.setSelection(Math.max(0, Math.min(length2, editText2.length())));
                        arrayList2.remove(indexOf);
                        boolean D2 = v3Var.D2();
                        v3Var.y4();
                        if (D2) {
                            k71Var.O(false);
                            f2 f2Var12 = v3Var.R3;
                            if (f2Var12 != null) {
                                f2Var12.h();
                            }
                            v3Var.post(new o2(v3Var, aVar4, Math.max(0, length2), 4));
                            return true;
                        }
                        k71Var.T();
                        v3Var.v4(indexOf);
                        s4.m0 itemAnimator = v3Var.getItemAnimator();
                        v3Var.setItemAnimator(null);
                        k71Var.u(indexOf2);
                        if ((aVar4.d > 0 || aVar.d > 0) && indexOf2 < arrayList.size()) {
                            k71Var.q(indexOf2, arrayList.size() - indexOf2);
                        }
                        v3Var.post(new x2(v3Var, itemAnimator, 1));
                        f2 f2Var13 = v3Var.R3;
                        if (f2Var13 != null) {
                            f2Var13.h();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List W3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (H3(aVar.b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        t tVar = aVar.g;
        return tVar != null ? Collections.singletonList(tVar) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g1 X3(View view) {
        if (view instanceof d6) {
            return ((d6) view).getEditText();
        }
        if (view instanceof k0) {
            return ((k0) view).getCaptionEditText();
        }
        if (view instanceof s0) {
            return ((s0) view).getEditText();
        }
        return null;
    }

    public static void Y1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
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

    public static TL_iv.PageBlock Y3(TL_iv.PageBlock pageBlock) {
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

    public static t Z3(MediaController.PhotoEntry photoEntry, String str) {
        t tVar = new t();
        tVar.b = photoEntry.isVideo;
        tVar.e = str;
        tVar.j = photoEntry.width;
        tVar.k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        boolean z10 = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        tVar.l = z10 ? 0 : photoEntry.orientation;
        tVar.m = z10 ? 0 : photoEntry.invert;
        tVar.a = 1;
        tVar.f = 0.0f;
        return tVar;
    }

    public static p5 a3(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof p5) {
                return (p5) parent;
            }
        }
        return null;
    }

    public static void c3(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
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
                U2(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new a(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                c3(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar.i = true;
                arrayList.add(aVar);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long a2 = o0.a();
                c3(arrayList, pageblockblockquoteblocks.blocks, map);
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

    public static ArrayList d3(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        c3(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void f2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] g5(p5 p5Var) {
        h6 h6Var = p5Var.F;
        for (int size = h6Var != null ? h6Var.g.size() : 0; size >= 0; size--) {
            g1 k10 = p5Var.k(size);
            int length = k10 != null ? k10.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static ArrayList m3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean n4(g1 g1Var, float f7, float f10) {
        if (g1Var != null && g1Var.getVisibility() == 0) {
            g1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - r1[0];
            float f12 = f10 - r1[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= g1Var.getWidth() && f12 <= g1Var.getHeight()) {
                int offsetForPosition = g1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                g1Var.s();
                g1Var.setSelection(Math.max(0, Math.min(offsetForPosition, g1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int q4(int i10, a aVar, boolean z10) {
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        return wh.b(16.0f, Math.max(0, i10 - (aVar.k.size() - (z10 ? aVar.l : aVar.m))), AndroidUtilities.dp(2.0f));
    }

    public static boolean r3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || J3(pageBlock);
    }

    public static int r4(a aVar, a aVar2) {
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
            if (childAt instanceof d6) {
                ((d6) childAt).setLocked(z10);
            } else if (childAt instanceof p5) {
                ((p5) childAt).setLocked(z10);
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof s0) {
                ((s0) childAt).setLocked(z10);
            } else if (childAt instanceof w0) {
                childAt.invalidate();
            }
        }
    }

    public final d6 A2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.f3.m(i10);
        if (m10 instanceof d6) {
            return (d6) m10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A3(a aVar) {
        boolean z10;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = aVar.k;
        a W2 = W2();
        if (W2 == null) {
            W2 = this.k4;
        }
        ArrayList arrayList2 = this.t3;
        int indexOf3 = W2 != null ? arrayList2.indexOf(W2) : -1;
        if (indexOf3 < 0 || !(W2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long a2 = o0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) W2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a2), richText);
            }
            W2.k.add(Long.valueOf(a2));
            W2.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        }
        boolean z11 = indexOf3 >= 0 && !W2.k.isEmpty();
        if (z11) {
            arrayList.clear();
            arrayList.addAll(W2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = W2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && W2.g == null && d6.y(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, aVar);
                this.k4 = aVar;
                indexOf = arrayList2.indexOf(aVar);
                if (indexOf < arrayList2.size() - 1 || K3(((a) arrayList2.get(indexOf + 1)).b)) {
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z11) {
                        aVar2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, aVar2);
                }
                this.g3.O(!z10);
                indexOf2 = arrayList2.indexOf(aVar) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || K3(((a) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new m2(this, (a) arrayList2.get(indexOf2), 17));
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

    public final t A4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document Y2 = Y2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (Y2 == null) {
                return null;
            }
            t tVar = new t();
            tVar.c = true;
            tVar.a = 2;
            tVar.h = Y2;
            tVar.i = Y2;
            return tVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document Y22 = Y2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (Y22 == null) {
                return null;
            }
            t tVar2 = new t();
            tVar2.d = true;
            tVar2.a = 2;
            tVar2.h = Y22;
            return tVar2;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document Y23 = Y2(pageblockvideo.video_id);
            if (Y23 == null) {
                return null;
            }
            t tVar3 = new t();
            tVar3.b = true;
            tVar3.a = 2;
            tVar3.h = Y23;
            tVar3.n = pageblockvideo.spoiler;
            while (i10 < Y23.attributes.size()) {
                if (Y23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) Y23.attributes.get(i10);
                    tVar3.j = tL_documentAttributeVideo.w;
                    tVar3.k = tL_documentAttributeVideo.h;
                    return tVar3;
                }
                i10++;
            }
            return tVar3;
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
                if (i11 < this.t3.size()) {
                    for (t tVar4 : W3((a) this.t3.get(i11))) {
                        if (tVar4 != null && (photo = tVar4.g) != null && photo.id == j10) {
                            break loop1;
                        }
                    }
                    i11++;
                } else {
                    TL_iv.RichMessage richMessage = this.s3;
                    if (richMessage != null && (arrayList = richMessage.photos) != null) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            TLRPC.Photo photo2 = arrayList.get(i10);
                            i10++;
                            photo = photo2;
                            if (photo != null && photo.id == j10) {
                                break;
                            }
                        }
                    }
                    HashMap hashMap = v4.a;
                    synchronized (v4.class) {
                        photo = j10 == 0 ? null : (TLRPC.Photo) v4.a.get(Long.valueOf(j10));
                    }
                }
            }
        }
        if (photo == null) {
            return null;
        }
        t tVar5 = new t();
        tVar5.a = 2;
        tVar5.g = photo;
        tVar5.n = pageblockphoto.spoiler;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            tVar5.j = closestPhotoSizeWithSize.w;
            tVar5.k = closestPhotoSizeWithSize.h;
        }
        return tVar5;
    }

    public final void B2() {
        M2();
        this.s3 = null;
        this.j4 = null;
        this.k4 = null;
        this.R3 = new f2(this.w4);
        F4();
        this.R3.j();
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.Q();
        }
    }

    public final void B4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.s3 == null || aVar == null || (pageBlock = aVar.b) == null) {
            return;
        }
        if (!H3(pageBlock)) {
            t A42 = A4(aVar.b);
            if (A42 != null) {
                aVar.g = A42;
                return;
            }
            return;
        }
        ArrayList m32 = m3(aVar.b);
        aVar.h = new ArrayList();
        if (m32 != null) {
            for (int i10 = 0; i10 < m32.size(); i10++) {
                t A43 = A4((TL_iv.PageBlock) m32.get(i10));
                ArrayList arrayList = aVar.h;
                if (A43 == null) {
                    A43 = new t();
                }
                arrayList.add(A43);
            }
        }
    }

    public final boolean C3() {
        int i10;
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x() || (i10 = j3Var.p0) != j3Var.s0 || i10 < 0 || i10 >= this.x4.size()) {
            return false;
        }
        return G4(i10) instanceof k0;
    }

    public final ArrayList C4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (H3(aVar.b)) {
                ArrayList m32 = m3(aVar.b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (m32 != null) {
                    int size2 = m32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = m32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        t A42 = A4(pageBlock);
                        if (A42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(A42);
                        }
                    }
                    m32.clear();
                    m32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.b;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    t A43 = A4(pageBlock2);
                    if (A43 != null) {
                        aVar.g = A43;
                        arrayList2.add(aVar);
                    }
                } else {
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }

    public final boolean D2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.i;
            ArrayList arrayList2 = aVar.k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new v2());
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
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.u3.remove(l4);
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

    public final void D4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof l4) {
                z zVar = (z) ((l4) childAt);
                zVar.b.a(zVar.a, new jg.e1(zVar, 6));
            }
        }
        invalidate();
    }

    public final ArrayList E2() {
        TLRPC.Document document;
        t tVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i10);
            if ((aVar.b instanceof TL_iv.pageBlockDocument) && (tVar = aVar.g) != null && tVar.b() && (document2 = aVar.g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.b).document_id = document2.id;
            }
            for (t tVar2 : W3(aVar)) {
                if (tVar2.b() && (document = tVar2.h) != null) {
                    long j10 = document.id;
                    if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                        arrayList.add(tVar2.h);
                    }
                }
            }
            i10++;
        }
    }

    public final boolean E3() {
        int i10;
        j3 j3Var = this.v3;
        return j3Var != null && j3Var.x() && (i10 = j3Var.p0) == j3Var.s0 && D3(E4(i10));
    }

    public final a E4(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.x4;
        if (i10 < arrayList.size()) {
            return (a) arrayList.get(i10);
        }
        return null;
    }

    public final ArrayList F2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.t3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (document = tVar.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(tVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void F4() {
        ArrayList arrayList = this.t3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.g3.O(false);
    }

    @Override // org.telegram.ui.Components.s71
    public final boolean G1() {
        return this.b4;
    }

    public final ArrayList G2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.t3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (photo = tVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(tVar.g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View G4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.f3.m(i10);
    }

    public final ArrayList H2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.t3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (photo = tVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(tVar.g);
                }
            }
            i10++;
        }
    }

    public final int[] H4() {
        ArrayList arrayList = this.t3;
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x()) {
            a W2 = W2();
            int indexOf = W2 != null ? arrayList.indexOf(W2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(E4(j3Var.p0));
        int indexOf3 = arrayList.indexOf(E4(j3Var.s0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    @Override // org.telegram.ui.Components.s71
    public final void I1() {
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void I2() {
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.h();
        }
        ArrayList arrayList = this.t3;
        SpannableStringBuilder k10 = c5.k(arrayList);
        M2();
        arrayList.clear();
        HashMap hashMap = this.u3;
        hashMap.clear();
        this.s3 = null;
        c3(arrayList, c5.b(k10), hashMap);
        this.g3.O(false);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.onContentChanged();
            t3Var.Q();
        }
    }

    public final boolean I4() {
        j3 j3Var = this.v3;
        if (j3Var != null && j3Var.x()) {
            if (R3()) {
                int i10 = j3Var.p0;
                int i11 = j3Var.q0;
                int i12 = j3Var.t0;
                int i13 = j3Var.r0;
                int i14 = j3Var.u0;
                int i15 = i11;
                while (i15 <= i12) {
                    g1 T4 = T4(i10, i15);
                    if (T4 != null) {
                        int length = T4.length();
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
            } else if (E3()) {
                g1 O2 = O2(j3Var.p0);
                if (O2 != null && Math.max(0, Math.min(Math.min(j3Var.r0, j3Var.u0), O2.length())) < Math.max(0, Math.min(Math.max(j3Var.r0, j3Var.u0), O2.length()))) {
                    return true;
                }
            } else if (C3()) {
                g1 y22 = y2(j3Var.p0);
                if (y22 != null) {
                    int i18 = j3Var.r0;
                    int i19 = j3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i18, i19), y22.length())) < Math.max(0, Math.min(Math.max(i18, i19), y22.length()))) {
                        return true;
                    }
                }
            } else if (M3()) {
                g1 p42 = p4(j3Var.p0);
                if (p42 != null) {
                    int i20 = j3Var.r0;
                    int i21 = j3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), p42.length())) < Math.max(0, Math.min(Math.max(i20, i21), p42.length()))) {
                        return true;
                    }
                }
            } else {
                int i22 = j3Var.p0;
                int i23 = j3Var.s0;
                int i24 = j3Var.r0;
                int i25 = j3Var.u0;
                if (i22 >= 0 && i23 >= 0 && i23 >= i22 && i23 < this.x4.size()) {
                    int i26 = i22;
                    while (i26 <= i23) {
                        a E4 = E4(i26);
                        if (E4 != null) {
                            if (E4.t == 0) {
                                TL_iv.PageBlock pageBlock = E4.b;
                                if (!G3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int o22 = o2(i26);
                            if (Math.max(0, Math.min(i26 == i22 ? i24 : 0, o22)) < Math.max(0, Math.min(i26 == i23 ? i25 : o22, o22))) {
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

    @Override // org.telegram.ui.Components.s71
    public final void J1() {
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.H();
        }
        D4();
    }

    public final a J2() {
        int i10;
        a E4;
        a W2 = W2();
        if (W2 != null) {
            return W2;
        }
        j3 j3Var = this.v3;
        if (j3Var == null || (i10 = j3Var.p0) < 0 || (E4 = E4(i10)) == null) {
            return null;
        }
        return E4;
    }

    public final int[] J4() {
        j3 j3Var = this.v3;
        if (j3Var == null) {
            return null;
        }
        int i10 = j3Var.p0;
        int i11 = j3Var.s0;
        if (i10 < 0 || i11 < 0) {
            return null;
        }
        a E4 = E4(i10);
        a E42 = E4(i11);
        if (E4 == null || E42 == null) {
            return null;
        }
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(E4);
        int indexOf2 = arrayList.indexOf(E42);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // org.telegram.ui.Components.s71
    public final void K1(s4.e1 e1Var) {
        t3 t3Var = this.p3;
        if (t3Var == null || e1Var == null) {
            return;
        }
        View view = e1Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.b4 = t3Var.c(view.getHeight() + r1[1]);
    }

    public final void K2() {
        ArrayList arrayList;
        j3 j3Var = this.v3;
        int i10 = j3Var.p0;
        int i11 = j3Var.r0;
        int i12 = j3Var.s0;
        if (c2(i10, i11, i12, j3Var.u0, new String[]{""})) {
            return;
        }
        if (i10 > i12) {
            i12 = i10;
            i10 = i12;
        }
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(0, i10);
        while (true) {
            arrayList = this.t3;
            if (max > i12) {
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
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.u3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                hashSet.addAll(((a) arrayList.get(i13)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        D2();
        b4();
        y4();
        j3Var.f(false);
        this.g3.O(false);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        post(new m2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
    }

    public final void K4(g1 g1Var) {
        g1Var.adaptiveCreateLinkDialog = this.r3;
        g1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override // org.telegram.ui.Components.s71
    public final void L1(s4.e1 e1Var) {
        a aVar = this.a4;
        this.a4 = null;
        this.b4 = false;
        if (aVar == null) {
            if (e1Var != null) {
                View view = e1Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        x4(aVar);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.onContentChanged();
        }
    }

    public final boolean L2() {
        j3 j3Var = this.v3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
            return true;
        }
        if (this.q4 == null) {
            return false;
        }
        S2();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04cb A[LOOP:13: B:176:0x04c9->B:177:0x04cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04dc A[LOOP:14: B:180:0x04da->B:181:0x04dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a7 A[EDGE_INSN: B:241:0x04a7->B:155:0x04a7 BREAK  A[LOOP:10: B:144:0x0483->B:231:0x0483], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x047e A[EDGE_INSN: B:253:0x047e->B:143:0x047e BREAK  A[LOOP:9: B:132:0x045a->B:243:0x045a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[LOOP:3: B:45:0x00c5->B:47:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e A[LOOP:4: B:53:0x0128->B:55:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216 A[LOOP:8: B:96:0x0210->B:98:0x0216, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L4(p5 p5Var) {
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
        l80 l80Var;
        LinkedHashSet linkedHashSet;
        int dp;
        int i17;
        int[] iArr;
        FrameLayout V4;
        boolean z14;
        int i18;
        int i19;
        int i20;
        boolean z15;
        Iterator it3;
        Iterator it4;
        int i21;
        int i22;
        int i23;
        final int i24;
        final int i25;
        boolean z16;
        String string;
        final ?? r6;
        int i26;
        int i27;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean z17;
        boolean equals;
        final p5 p5Var2 = p5Var;
        final h6 model = p5Var2.getModel();
        LinkedHashSet linkedHashSet2 = p5Var2.H;
        if (model == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = model.a;
        Set<TL_iv.pageTableCell> selectedCells = p5Var2.getSelectedCells();
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
                int a2 = model.a(pagetablecell);
                int o10 = h6.o(pagetablecell);
                int i33 = pagetablecell.colspan;
                if (i33 == 0) {
                    i33 = 1;
                }
                i29 = Math.min(i29, b10);
                i30 = Math.min(i30, a2);
                i31 = Math.max(i31, (b10 + o10) - 1);
                i32 = Math.max(i32, (a2 + i33) - 1);
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
                i10 = 1;
                if (size == 1) {
                    TL_iv.pageTableCell next = selectedCells.iterator().next();
                    if (h6.n(next) <= 1) {
                        int i35 = next.rowspan;
                        if (i35 == 0) {
                            i35 = 1;
                        }
                        if (i35 <= 1) {
                            z17 = false;
                            if (z17) {
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
                                            i12 = 1;
                                        } else {
                                            HashSet hashSet6 = new HashSet();
                                            Iterator<TL_iv.pageTableCell> it8 = selectedCells.iterator();
                                            while (it8.hasNext()) {
                                                hashSet6.add(Integer.valueOf(model.b(it8.next())));
                                                i28 = i28;
                                            }
                                            i12 = i28;
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
                                                        i15 = (z13 || !z11 || model.c >= MessagesController.getInstance(this.n3).config.richMessageMaxTableCols.get()) ? 0 : i12;
                                                        i16 = (z13 || !z10) ? 0 : i12;
                                                        l80Var = this.r4;
                                                        if (l80Var != null) {
                                                            linkedHashSet = linkedHashSet2;
                                                            this.r4 = null;
                                                            l80Var.u();
                                                        } else {
                                                            linkedHashSet = linkedHashSet2;
                                                        }
                                                        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                        FrameLayout V42 = V4(p5Var2, false);
                                                        i17 = i14;
                                                        iArr = new int[2];
                                                        V42.getLocationOnScreen(iArr);
                                                        if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                                            V4 = V42;
                                                            z14 = i12;
                                                        } else {
                                                            boolean z18 = i12;
                                                            V4 = V4(p5Var2, z18);
                                                            z14 = z18;
                                                        }
                                                        final l80 P = this.p3.P(V4);
                                                        P.s = 0;
                                                        P.t = false;
                                                        P.Z = z14;
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                        linearLayout.setOrientation(1);
                                                        TextView textView = new TextView(getContext());
                                                        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                        i18 = i10;
                                                        textView.setTextSize(1, 12.0f);
                                                        textView.setGravity(17);
                                                        int i40 = y6.y6;
                                                        u6 u6Var = this.o3;
                                                        f7.V(textView, i40, u6Var);
                                                        linearLayout.addView(textView, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                        i19 = i11;
                                                        i20 = i13;
                                                        boolean z19 = z10;
                                                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                        linearLayout2.setOrientation(0);
                                                        linearLayout.addView(linearLayout2, kb1.u(-2, -2, 17));
                                                        x1 x1Var = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var);
                                                        x1Var.e = 4;
                                                        x1Var.updateColors();
                                                        x1Var.b();
                                                        int i41 = y6.G8;
                                                        x1Var.c(i41);
                                                        linearLayout2.addView(x1Var, kb1.r(32, 32));
                                                        x1 x1Var2 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var);
                                                        x1Var2.e = 4;
                                                        x1Var2.updateColors();
                                                        x1Var2.b();
                                                        x1Var2.c(i41);
                                                        linearLayout2.addView(x1Var2, kb1.r(32, 32));
                                                        x1 x1Var3 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var);
                                                        x1Var3.e = 4;
                                                        x1Var3.updateColors();
                                                        x1Var3.b();
                                                        x1Var3.c(i41);
                                                        final x1[] x1VarArr = {x1Var, x1Var2, x1Var3};
                                                        boolean z20 = z11;
                                                        linearLayout2.addView(x1Var3, kb1.r(32, 32));
                                                        z15 = z12;
                                                        linearLayout2.addView(new Space(getContext()), kb1.r(8, 0));
                                                        x1 x1Var4 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var);
                                                        x1Var4.e = 4;
                                                        x1Var4.updateColors();
                                                        x1Var4.b();
                                                        x1Var4.c(i41);
                                                        linearLayout2.addView(x1Var4, kb1.r(32, 32));
                                                        x1 x1Var5 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var);
                                                        x1Var5.e = 4;
                                                        x1Var5.updateColors();
                                                        x1Var5.b();
                                                        x1Var5.c(i41);
                                                        linearLayout2.addView(x1Var5, kb1.r(32, 32));
                                                        x1 x1Var6 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var);
                                                        x1Var6.e = 4;
                                                        x1Var6.updateColors();
                                                        x1Var6.b();
                                                        x1Var6.c(i41);
                                                        final x1[] x1VarArr2 = {x1Var4, x1Var5, x1Var6};
                                                        linearLayout2.addView(x1Var6, kb1.r(32, 32));
                                                        P.q(linearLayout);
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
                                                        i21 = 0;
                                                        while (i21 < 3) {
                                                            x1VarArr[i21].setSelected(i21 == i42);
                                                            i21++;
                                                        }
                                                        i23 = 0;
                                                        while (i23 < 3) {
                                                            x1VarArr2[i23].setSelected(i23 == i43);
                                                            i23++;
                                                        }
                                                        for (i24 = 0; i24 < 3; i24++) {
                                                            final int i44 = 0;
                                                            x1VarArr[i24].setOnClickListener(new View.OnClickListener() { // from class: li.j2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i44) {
                                                                        case 0:
                                                                            p5 p5Var3 = p5Var2;
                                                                            r5 r5Var = p5Var3.v;
                                                                            Iterator it9 = p5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i45 = i24;
                                                                                if (!hasNext) {
                                                                                    r5Var.invalidate();
                                                                                    b3 b3Var = p5Var3.E;
                                                                                    if (b3Var != null && p5Var3.a != null) {
                                                                                        b3Var.a();
                                                                                    }
                                                                                    int i46 = 0;
                                                                                    while (i46 < 3) {
                                                                                        x1VarArr[i46].setSelected(i46 == i45);
                                                                                        i46++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    h6.k(pagetablecell4, i45);
                                                                                    s5 m10 = r5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            p5 p5Var4 = p5Var2;
                                                                            r5 r5Var2 = p5Var4.v;
                                                                            Iterator it10 = p5Var4.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i47 = i24;
                                                                                if (!hasNext2) {
                                                                                    r5Var2.invalidate();
                                                                                    b3 b3Var2 = p5Var4.E;
                                                                                    if (b3Var2 != null && p5Var4.a != null) {
                                                                                        b3Var2.a();
                                                                                    }
                                                                                    int i48 = 0;
                                                                                    while (i48 < 3) {
                                                                                        x1VarArr[i48].setSelected(i48 == i47);
                                                                                        i48++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    h6.m(pagetablecell5, i47);
                                                                                    s5 m11 = r5Var2.m(pagetablecell5);
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
                                                            final int i45 = 1;
                                                            x1VarArr2[i25].setOnClickListener(new View.OnClickListener() { // from class: li.j2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i45) {
                                                                        case 0:
                                                                            p5 p5Var3 = p5Var2;
                                                                            r5 r5Var = p5Var3.v;
                                                                            Iterator it9 = p5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i452 = i25;
                                                                                if (!hasNext) {
                                                                                    r5Var.invalidate();
                                                                                    b3 b3Var = p5Var3.E;
                                                                                    if (b3Var != null && p5Var3.a != null) {
                                                                                        b3Var.a();
                                                                                    }
                                                                                    int i46 = 0;
                                                                                    while (i46 < 3) {
                                                                                        x1VarArr2[i46].setSelected(i46 == i452);
                                                                                        i46++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    h6.k(pagetablecell4, i452);
                                                                                    s5 m10 = r5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            p5 p5Var4 = p5Var2;
                                                                            r5 r5Var2 = p5Var4.v;
                                                                            Iterator it10 = p5Var4.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i47 = i25;
                                                                                if (!hasNext2) {
                                                                                    r5Var2.invalidate();
                                                                                    b3 b3Var2 = p5Var4.E;
                                                                                    if (b3Var2 != null && p5Var4.a != null) {
                                                                                        b3Var2.a();
                                                                                    }
                                                                                    int i48 = 0;
                                                                                    while (i48 < 3) {
                                                                                        x1VarArr2[i48].setSelected(i48 == i47);
                                                                                        i48++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    h6.m(pagetablecell5, i47);
                                                                                    s5 m11 = r5Var2.m(pagetablecell5);
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
                                                        P.o();
                                                        P.S = 208;
                                                        if (!linkedHashSet.isEmpty()) {
                                                            Iterator it9 = linkedHashSet.iterator();
                                                            while (it9.hasNext()) {
                                                                if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                                }
                                                            }
                                                            z16 = true;
                                                            if (!z16) {
                                                                string = LocaleController.getString(R.string.ArticleRemoveHighlight);
                                                            } else if (z15 || !(size <= 1 || z20 || z19)) {
                                                                string = LocaleController.getString(R.string.ArticleHighlightCells);
                                                            } else {
                                                                string = LocaleController.getString(z20 ? R.string.ArticleHighlightColumn : z19 ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell);
                                                            }
                                                            P.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                                                            if (i18 != 0) {
                                                                final int i46 = 2;
                                                                P.c(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i46) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i47 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i47 = Math.min(i47, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i48 = 0;
                                                                                                for (int i49 = 0; i49 < h6Var.b; i49++) {
                                                                                                    iArr2[i49] = i48;
                                                                                                    if (!zArr[i49]) {
                                                                                                        i48++;
                                                                                                    }
                                                                                                }
                                                                                                if (i48 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a10, i53, i51});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i48);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i47, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i19 != 0) {
                                                                final int i47 = 3;
                                                                P.c(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i47) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i48 = 0;
                                                                                                for (int i49 = 0; i49 < h6Var.b; i49++) {
                                                                                                    iArr2[i49] = i48;
                                                                                                    if (!zArr[i49]) {
                                                                                                        i48++;
                                                                                                    }
                                                                                                }
                                                                                                if (i48 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a10, i53, i51});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i48);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i15 != 0) {
                                                                final int i48 = 4;
                                                                P.c(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i48) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i49 = 0; i49 < h6Var.b; i49++) {
                                                                                                    iArr2[i49] = i482;
                                                                                                    if (!zArr[i49]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a10, i53, i51});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i49 = 5;
                                                                P.c(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i49) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < h6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i50 = 0;
                                                                                                    while (i50 < size2) {
                                                                                                        Object obj = arrayList2.get(i50);
                                                                                                        i50++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a10, i53, i51});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i16 != 0) {
                                                                final int i50 = 6;
                                                                P.c(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i50) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < h6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i51 = pagetablecell4.colspan;
                                                                                                        if (i51 == 0) {
                                                                                                            i51 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a10, i53, i51});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i51 = 7;
                                                                P.c(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i51) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < h6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i52 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i52 < 0) {
                                                                                                                    i52 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i52 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i52], a10, i53, i512});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i17 == 0) {
                                                                final int i52 = 8;
                                                                r6 = 1;
                                                                P.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteColumn), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i52) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < h6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i522 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i53 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i522 < 0) {
                                                                                                                    i522 = i54;
                                                                                                                }
                                                                                                                i53++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i522 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i522], a10, i53, i512});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, true);
                                                            } else {
                                                                r6 = 1;
                                                            }
                                                            if (i20 != 0) {
                                                                final int i53 = 0;
                                                                P.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (i53) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < h6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i522 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i532 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i522 < 0) {
                                                                                                                    i522 = i54;
                                                                                                                }
                                                                                                                i532++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i522 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i522], a10, i532, i512});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r6);
                                                            }
                                                            if (z15) {
                                                                P.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) { // from class: li.k2
                                                                    public final /* synthetic */ v3 b;

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
                                                                        v3 v3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        v3 v3Var2;
                                                                        boolean z22;
                                                                        switch (r6) {
                                                                            case 0:
                                                                                v3 v3Var3 = this.b;
                                                                                v3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    v3Var = v3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i472 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i472 = Math.min(i472, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    h6 h6Var = p5Var3.F;
                                                                                    h6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        v3Var = v3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[h6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < h6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[h6Var.b];
                                                                                                int i482 = 0;
                                                                                                for (int i492 = 0; i492 < h6Var.b; i492++) {
                                                                                                    iArr2[i492] = i482;
                                                                                                    if (!zArr[i492]) {
                                                                                                        i482++;
                                                                                                    }
                                                                                                }
                                                                                                if (i482 == 0) {
                                                                                                    h6Var.a.rows.clear();
                                                                                                    h6Var.i();
                                                                                                    v3Var = v3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = h6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i502 = 0;
                                                                                                    while (i502 < size2) {
                                                                                                        Object obj = arrayList2.get(i502);
                                                                                                        i502++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = h6Var.b(pagetablecell4);
                                                                                                        int a10 = h6Var.a(pagetablecell4);
                                                                                                        int o11 = h6.o(pagetablecell4);
                                                                                                        int i512 = pagetablecell4.colspan;
                                                                                                        if (i512 == 0) {
                                                                                                            i512 = 1;
                                                                                                        }
                                                                                                        int i522 = -1;
                                                                                                        v3 v3Var4 = v3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i532 = 0;
                                                                                                        for (int i54 = b13; i54 < b13 + o11 && i54 < h6Var.b; i54++) {
                                                                                                            if (!zArr[i54]) {
                                                                                                                if (i522 < 0) {
                                                                                                                    i522 = i54;
                                                                                                                }
                                                                                                                i532++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i522 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i522], a10, i532, i512});
                                                                                                        }
                                                                                                        v3Var3 = v3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    v3Var = v3Var3;
                                                                                                    h6Var.j(identityHashMap, i482);
                                                                                                    h6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.u();
                                                                                    if (z21) {
                                                                                        p5Var3.p(i472, 0);
                                                                                    }
                                                                                }
                                                                                v3Var.S2();
                                                                                break;
                                                                            case 1:
                                                                                v3 v3Var5 = this.b;
                                                                                v3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                v3Var5.S2();
                                                                                if (row != null) {
                                                                                    f2 f2Var = v3Var5.R3;
                                                                                    if (f2Var != null) {
                                                                                        f2Var.d();
                                                                                    }
                                                                                    v3Var5.x4(row);
                                                                                    f2 f2Var2 = v3Var5.R3;
                                                                                    if (f2Var2 != null) {
                                                                                        f2Var2.h();
                                                                                    }
                                                                                    t3 t3Var = v3Var5.p3;
                                                                                    if (t3Var != null) {
                                                                                        t3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i56 = Integer.MAX_VALUE;
                                                                                        int i57 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i56 = Math.min(i56, p5Var4.F.b(pagetablecell5));
                                                                                            i57 = Math.min(i57, p5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        h6 h6Var2 = p5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = h6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i58 = -1;
                                                                                            int i59 = -1;
                                                                                            int i60 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = h6Var2.b(pagetablecell6);
                                                                                                int a11 = h6Var2.a(pagetablecell6);
                                                                                                int o12 = h6.o(pagetablecell6);
                                                                                                int i61 = pagetablecell6.colspan;
                                                                                                if (i61 == 0) {
                                                                                                    i61 = 1;
                                                                                                }
                                                                                                i55 = Math.min(i55, b14);
                                                                                                i60 = Math.min(i60, a11);
                                                                                                i58 = Math.max(i58, (b14 + o12) - 1);
                                                                                                i59 = Math.max(i59, (a11 + i61) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i62 = i55;
                                                                                            while (true) {
                                                                                                if (i62 <= i58) {
                                                                                                    for (int i63 = i60; i63 <= i59; i63++) {
                                                                                                        if (i62 >= 0 && i63 >= 0 && i62 < h6Var2.b && i63 < h6Var2.c) {
                                                                                                            hashSet9.add(h6Var2.d[i62][i63]);
                                                                                                        }
                                                                                                    }
                                                                                                    i62++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new bi.p5(h6Var2, 3));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i64 = 0;
                                                                                                    while (i64 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i64);
                                                                                                        i64++;
                                                                                                        String g7 = h6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = h6Var2.d[i55][i60];
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
                                                                                                    h6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = h6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    h6Var2.i();
                                                                                                    p5Var4.u();
                                                                                                    p5Var4.v.invalidate();
                                                                                                    p5Var4.p(i56, i57);
                                                                                                    p5Var4.s();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (h6.n(pagetablecell9) <= 1) {
                                                                                        int i70 = pagetablecell9.rowspan;
                                                                                        if (i70 == 0) {
                                                                                            i70 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.u();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.p(b15, a12);
                                                                                        p5Var5.s();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.S2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.h(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.h(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.i(true);
                                                                                this.b.S2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.i(false);
                                                                                this.b.S2();
                                                                                break;
                                                                            default:
                                                                                v3 v3Var6 = this.b;
                                                                                v3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    v3Var2 = v3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i71 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i71 = Math.min(i71, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    h6 h6Var3 = p5Var6.F;
                                                                                    h6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        v3Var2 = v3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[h6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < h6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[h6Var3.c];
                                                                                                int i72 = 0;
                                                                                                for (int i73 = 0; i73 < h6Var3.c; i73++) {
                                                                                                    iArr4[i73] = i72;
                                                                                                    if (!zArr2[i73]) {
                                                                                                        i72++;
                                                                                                    }
                                                                                                }
                                                                                                if (i72 == 0) {
                                                                                                    h6Var3.a.rows.clear();
                                                                                                    h6Var3.i();
                                                                                                    v3Var2 = v3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = h6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i74 = 0;
                                                                                                    while (i74 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i74);
                                                                                                        i74++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = h6Var3.b(pagetablecell10);
                                                                                                        int a14 = h6Var3.a(pagetablecell10);
                                                                                                        int o13 = h6.o(pagetablecell10);
                                                                                                        int i75 = pagetablecell10.colspan;
                                                                                                        if (i75 == 0) {
                                                                                                            i75 = 1;
                                                                                                        }
                                                                                                        int i76 = -1;
                                                                                                        v3 v3Var7 = v3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i77 = 0;
                                                                                                        for (int i78 = a14; i78 < a14 + i75 && i78 < h6Var3.c; i78++) {
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
                                                                                                        v3Var6 = v3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    v3Var2 = v3Var6;
                                                                                                    h6Var3.j(identityHashMap2, h6Var3.b);
                                                                                                    h6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.u();
                                                                                    if (z22) {
                                                                                        p5Var6.p(0, i71);
                                                                                    }
                                                                                }
                                                                                v3Var2.S2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r6);
                                                                P.o();
                                                                final int i54 = 0;
                                                                P.i(new Runnable() { // from class: li.l2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i54) {
                                                                            case 0:
                                                                                P.n0 = true;
                                                                                boolean z21 = !model.a.bordered;
                                                                                p5 p5Var3 = p5Var2;
                                                                                h6 h6Var = p5Var3.F;
                                                                                if (h6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = h6Var.a;
                                                                                    if (pageblocktable2.bordered != z21) {
                                                                                        pageblocktable2.bordered = z21;
                                                                                        p5Var3.v.invalidate();
                                                                                        b3 b3Var = p5Var3.E;
                                                                                        if (b3Var != null && p5Var3.a != null) {
                                                                                            b3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z21);
                                                                                break;
                                                                            default:
                                                                                P.n0 = true;
                                                                                boolean z22 = !model.a.compact;
                                                                                p5 p5Var4 = p5Var2;
                                                                                h6 h6Var2 = p5Var4.F;
                                                                                if (h6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = h6Var2.a;
                                                                                    if (pageblocktable3.compact != z22) {
                                                                                        pageblocktable3.compact = z22;
                                                                                        r5 r5Var = p5Var4.v;
                                                                                        if (r5Var.a != null) {
                                                                                            for (int i55 = 0; i55 < r5Var.getChildCount(); i55++) {
                                                                                                View childAt = r5Var.getChildAt(i55);
                                                                                                if (childAt instanceof s5) {
                                                                                                    ((s5) childAt).setCompact(r5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            r5Var.requestLayout();
                                                                                            r5Var.invalidate();
                                                                                        }
                                                                                        p5Var4.w.requestLayout();
                                                                                        p5Var4.requestLayout();
                                                                                        b3 b3Var2 = p5Var4.E;
                                                                                        if (b3Var2 != null && p5Var4.a != null) {
                                                                                            b3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z22);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
                                                                final int i55 = 1;
                                                                p5Var2 = p5Var;
                                                                P.i(new Runnable() { // from class: li.l2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i55) {
                                                                            case 0:
                                                                                P.n0 = true;
                                                                                boolean z21 = !model.a.bordered;
                                                                                p5 p5Var3 = p5Var2;
                                                                                h6 h6Var = p5Var3.F;
                                                                                if (h6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = h6Var.a;
                                                                                    if (pageblocktable2.bordered != z21) {
                                                                                        pageblocktable2.bordered = z21;
                                                                                        p5Var3.v.invalidate();
                                                                                        b3 b3Var = p5Var3.E;
                                                                                        if (b3Var != null && p5Var3.a != null) {
                                                                                            b3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z21);
                                                                                break;
                                                                            default:
                                                                                P.n0 = true;
                                                                                boolean z22 = !model.a.compact;
                                                                                p5 p5Var4 = p5Var2;
                                                                                h6 h6Var2 = p5Var4.F;
                                                                                if (h6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = h6Var2.a;
                                                                                    if (pageblocktable3.compact != z22) {
                                                                                        pageblocktable3.compact = z22;
                                                                                        r5 r5Var = p5Var4.v;
                                                                                        if (r5Var.a != null) {
                                                                                            for (int i552 = 0; i552 < r5Var.getChildCount(); i552++) {
                                                                                                View childAt = r5Var.getChildAt(i552);
                                                                                                if (childAt instanceof s5) {
                                                                                                    ((s5) childAt).setCompact(r5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            r5Var.requestLayout();
                                                                                            r5Var.invalidate();
                                                                                        }
                                                                                        p5Var4.w.requestLayout();
                                                                                        p5Var4.requestLayout();
                                                                                        b3 b3Var2 = p5Var4.E;
                                                                                        if (b3Var2 != null && p5Var4.a != null) {
                                                                                            b3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z22);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
                                                                final org.telegram.ui.ActionBar.g1[] g1VarArr = {P.y(), P.y()};
                                                            }
                                                            P.p = new jg.f1(this, P, p5Var2, 4);
                                                            this.r4 = P;
                                                            P.Z();
                                                        }
                                                        z16 = false;
                                                        if (!z16) {
                                                        }
                                                        P.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                                                        if (i18 != 0) {
                                                        }
                                                        if (i19 != 0) {
                                                        }
                                                        if (i15 != 0) {
                                                        }
                                                        if (i16 != 0) {
                                                        }
                                                        if (i17 == 0) {
                                                        }
                                                        if (i20 != 0) {
                                                        }
                                                        if (z15) {
                                                        }
                                                        P.p = new jg.f1(this, P, p5Var2, 4);
                                                        this.r4 = P;
                                                        P.Z();
                                                    }
                                                }
                                                i14 = 0;
                                                if (z13) {
                                                }
                                                if (z13) {
                                                }
                                                l80Var = this.r4;
                                                if (l80Var != null) {
                                                }
                                                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                FrameLayout V422 = V4(p5Var2, false);
                                                i17 = i14;
                                                iArr = new int[2];
                                                V422.getLocationOnScreen(iArr);
                                                if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                                }
                                                final l80 P2 = this.p3.P(V4);
                                                P2.s = 0;
                                                P2.t = false;
                                                P2.Z = z14;
                                                LinearLayout linearLayout3 = new LinearLayout(getContext());
                                                linearLayout3.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                linearLayout3.setOrientation(1);
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                i18 = i10;
                                                textView2.setTextSize(1, 12.0f);
                                                textView2.setGravity(17);
                                                int i402 = y6.y6;
                                                u6 u6Var2 = this.o3;
                                                f7.V(textView2, i402, u6Var2);
                                                linearLayout3.addView(textView2, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout22 = new LinearLayout(getContext());
                                                i19 = i11;
                                                i20 = i13;
                                                boolean z192 = z10;
                                                linearLayout22.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                linearLayout22.setOrientation(0);
                                                linearLayout3.addView(linearLayout22, kb1.u(-2, -2, 17));
                                                x1 x1Var7 = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var2);
                                                x1Var7.e = 4;
                                                x1Var7.updateColors();
                                                x1Var7.b();
                                                int i412 = y6.G8;
                                                x1Var7.c(i412);
                                                linearLayout22.addView(x1Var7, kb1.r(32, 32));
                                                x1 x1Var22 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var2);
                                                x1Var22.e = 4;
                                                x1Var22.updateColors();
                                                x1Var22.b();
                                                x1Var22.c(i412);
                                                linearLayout22.addView(x1Var22, kb1.r(32, 32));
                                                x1 x1Var32 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var2);
                                                x1Var32.e = 4;
                                                x1Var32.updateColors();
                                                x1Var32.b();
                                                x1Var32.c(i412);
                                                final x1[] x1VarArr3 = {x1Var7, x1Var22, x1Var32};
                                                boolean z202 = z11;
                                                linearLayout22.addView(x1Var32, kb1.r(32, 32));
                                                z15 = z12;
                                                linearLayout22.addView(new Space(getContext()), kb1.r(8, 0));
                                                x1 x1Var42 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var2);
                                                x1Var42.e = 4;
                                                x1Var42.updateColors();
                                                x1Var42.b();
                                                x1Var42.c(i412);
                                                linearLayout22.addView(x1Var42, kb1.r(32, 32));
                                                x1 x1Var52 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var2);
                                                x1Var52.e = 4;
                                                x1Var52.updateColors();
                                                x1Var52.b();
                                                x1Var52.c(i412);
                                                linearLayout22.addView(x1Var52, kb1.r(32, 32));
                                                x1 x1Var62 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var2);
                                                x1Var62.e = 4;
                                                x1Var62.updateColors();
                                                x1Var62.b();
                                                x1Var62.c(i412);
                                                final x1[] x1VarArr22 = {x1Var42, x1Var52, x1Var62};
                                                linearLayout22.addView(x1Var62, kb1.r(32, 32));
                                                P2.q(linearLayout3);
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
                                                P2.o();
                                                P2.S = 208;
                                                if (!linkedHashSet.isEmpty()) {
                                                }
                                                z16 = false;
                                                if (!z16) {
                                                }
                                                P2.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                                                if (i18 != 0) {
                                                }
                                                if (i19 != 0) {
                                                }
                                                if (i15 != 0) {
                                                }
                                                if (i16 != 0) {
                                                }
                                                if (i17 == 0) {
                                                }
                                                if (i20 != 0) {
                                                }
                                                if (z15) {
                                                }
                                                P2.p = new jg.f1(this, P2, p5Var2, 4);
                                                this.r4 = P2;
                                                P2.Z();
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
                                        l80Var = this.r4;
                                        if (l80Var != null) {
                                        }
                                        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                        FrameLayout V4222 = V4(p5Var2, false);
                                        i17 = i14;
                                        iArr = new int[2];
                                        V4222.getLocationOnScreen(iArr);
                                        if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                        }
                                        final l80 P22 = this.p3.P(V4);
                                        P22.s = 0;
                                        P22.t = false;
                                        P22.Z = z14;
                                        LinearLayout linearLayout32 = new LinearLayout(getContext());
                                        linearLayout32.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                        linearLayout32.setOrientation(1);
                                        TextView textView22 = new TextView(getContext());
                                        textView22.setText(LocaleController.getString(R.string.ArticleAlignment));
                                        i18 = i10;
                                        textView22.setTextSize(1, 12.0f);
                                        textView22.setGravity(17);
                                        int i4022 = y6.y6;
                                        u6 u6Var22 = this.o3;
                                        f7.V(textView22, i4022, u6Var22);
                                        linearLayout32.addView(textView22, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout222 = new LinearLayout(getContext());
                                        i19 = i11;
                                        i20 = i13;
                                        boolean z1922 = z10;
                                        linearLayout222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                        linearLayout222.setOrientation(0);
                                        linearLayout32.addView(linearLayout222, kb1.u(-2, -2, 17));
                                        x1 x1Var72 = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var22);
                                        x1Var72.e = 4;
                                        x1Var72.updateColors();
                                        x1Var72.b();
                                        int i4122 = y6.G8;
                                        x1Var72.c(i4122);
                                        linearLayout222.addView(x1Var72, kb1.r(32, 32));
                                        x1 x1Var222 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var22);
                                        x1Var222.e = 4;
                                        x1Var222.updateColors();
                                        x1Var222.b();
                                        x1Var222.c(i4122);
                                        linearLayout222.addView(x1Var222, kb1.r(32, 32));
                                        x1 x1Var322 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var22);
                                        x1Var322.e = 4;
                                        x1Var322.updateColors();
                                        x1Var322.b();
                                        x1Var322.c(i4122);
                                        final x1[] x1VarArr32 = {x1Var72, x1Var222, x1Var322};
                                        boolean z2022 = z11;
                                        linearLayout222.addView(x1Var322, kb1.r(32, 32));
                                        z15 = z12;
                                        linearLayout222.addView(new Space(getContext()), kb1.r(8, 0));
                                        x1 x1Var422 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var22);
                                        x1Var422.e = 4;
                                        x1Var422.updateColors();
                                        x1Var422.b();
                                        x1Var422.c(i4122);
                                        linearLayout222.addView(x1Var422, kb1.r(32, 32));
                                        x1 x1Var522 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var22);
                                        x1Var522.e = 4;
                                        x1Var522.updateColors();
                                        x1Var522.b();
                                        x1Var522.c(i4122);
                                        linearLayout222.addView(x1Var522, kb1.r(32, 32));
                                        x1 x1Var622 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var22);
                                        x1Var622.e = 4;
                                        x1Var622.updateColors();
                                        x1Var622.b();
                                        x1Var622.c(i4122);
                                        final x1[] x1VarArr222 = {x1Var422, x1Var522, x1Var622};
                                        linearLayout222.addView(x1Var622, kb1.r(32, 32));
                                        P22.q(linearLayout32);
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
                                        P22.o();
                                        P22.S = 208;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z16 = false;
                                        if (!z16) {
                                        }
                                        P22.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                                        if (i18 != 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (i15 != 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i20 != 0) {
                                        }
                                        if (z15) {
                                        }
                                        P22.p = new jg.f1(this, P22, p5Var2, 4);
                                        this.r4 = P22;
                                        P22.Z();
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
                                    l80Var = this.r4;
                                    if (l80Var != null) {
                                    }
                                    dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                    FrameLayout V42222 = V4(p5Var2, false);
                                    i17 = i14;
                                    iArr = new int[2];
                                    V42222.getLocationOnScreen(iArr);
                                    if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                    }
                                    final l80 P222 = this.p3.P(V4);
                                    P222.s = 0;
                                    P222.t = false;
                                    P222.Z = z14;
                                    LinearLayout linearLayout322 = new LinearLayout(getContext());
                                    linearLayout322.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                    linearLayout322.setOrientation(1);
                                    TextView textView222 = new TextView(getContext());
                                    textView222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                    i18 = i10;
                                    textView222.setTextSize(1, 12.0f);
                                    textView222.setGravity(17);
                                    int i40222 = y6.y6;
                                    u6 u6Var222 = this.o3;
                                    f7.V(textView222, i40222, u6Var222);
                                    linearLayout322.addView(textView222, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                    LinearLayout linearLayout2222 = new LinearLayout(getContext());
                                    i19 = i11;
                                    i20 = i13;
                                    boolean z19222 = z10;
                                    linearLayout2222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    linearLayout2222.setOrientation(0);
                                    linearLayout322.addView(linearLayout2222, kb1.u(-2, -2, 17));
                                    x1 x1Var722 = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var222);
                                    x1Var722.e = 4;
                                    x1Var722.updateColors();
                                    x1Var722.b();
                                    int i41222 = y6.G8;
                                    x1Var722.c(i41222);
                                    linearLayout2222.addView(x1Var722, kb1.r(32, 32));
                                    x1 x1Var2222 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var222);
                                    x1Var2222.e = 4;
                                    x1Var2222.updateColors();
                                    x1Var2222.b();
                                    x1Var2222.c(i41222);
                                    linearLayout2222.addView(x1Var2222, kb1.r(32, 32));
                                    x1 x1Var3222 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var222);
                                    x1Var3222.e = 4;
                                    x1Var3222.updateColors();
                                    x1Var3222.b();
                                    x1Var3222.c(i41222);
                                    final x1[] x1VarArr322 = {x1Var722, x1Var2222, x1Var3222};
                                    boolean z20222 = z11;
                                    linearLayout2222.addView(x1Var3222, kb1.r(32, 32));
                                    z15 = z12;
                                    linearLayout2222.addView(new Space(getContext()), kb1.r(8, 0));
                                    x1 x1Var4222 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var222);
                                    x1Var4222.e = 4;
                                    x1Var4222.updateColors();
                                    x1Var4222.b();
                                    x1Var4222.c(i41222);
                                    linearLayout2222.addView(x1Var4222, kb1.r(32, 32));
                                    x1 x1Var5222 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var222);
                                    x1Var5222.e = 4;
                                    x1Var5222.updateColors();
                                    x1Var5222.b();
                                    x1Var5222.c(i41222);
                                    linearLayout2222.addView(x1Var5222, kb1.r(32, 32));
                                    x1 x1Var6222 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var222);
                                    x1Var6222.e = 4;
                                    x1Var6222.updateColors();
                                    x1Var6222.b();
                                    x1Var6222.c(i41222);
                                    final x1[] x1VarArr2222 = {x1Var4222, x1Var5222, x1Var6222};
                                    linearLayout2222.addView(x1Var6222, kb1.r(32, 32));
                                    P222.q(linearLayout322);
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
                                    P222.o();
                                    P222.S = 208;
                                    if (!linkedHashSet.isEmpty()) {
                                    }
                                    z16 = false;
                                    if (!z16) {
                                    }
                                    P222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                                    if (i18 != 0) {
                                    }
                                    if (i19 != 0) {
                                    }
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (z15) {
                                    }
                                    P222.p = new jg.f1(this, P222, p5Var2, 4);
                                    this.r4 = P222;
                                    P222.Z();
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
                                l80Var = this.r4;
                                if (l80Var != null) {
                                }
                                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                FrameLayout V422222 = V4(p5Var2, false);
                                i17 = i14;
                                iArr = new int[2];
                                V422222.getLocationOnScreen(iArr);
                                if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                }
                                final l80 P2222 = this.p3.P(V4);
                                P2222.s = 0;
                                P2222.t = false;
                                P2222.Z = z14;
                                LinearLayout linearLayout3222 = new LinearLayout(getContext());
                                linearLayout3222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                linearLayout3222.setOrientation(1);
                                TextView textView2222 = new TextView(getContext());
                                textView2222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                i18 = i10;
                                textView2222.setTextSize(1, 12.0f);
                                textView2222.setGravity(17);
                                int i402222 = y6.y6;
                                u6 u6Var2222 = this.o3;
                                f7.V(textView2222, i402222, u6Var2222);
                                linearLayout3222.addView(textView2222, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout22222 = new LinearLayout(getContext());
                                i19 = i11;
                                i20 = i13;
                                boolean z192222 = z10;
                                linearLayout22222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                linearLayout22222.setOrientation(0);
                                linearLayout3222.addView(linearLayout22222, kb1.u(-2, -2, 17));
                                x1 x1Var7222 = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var2222);
                                x1Var7222.e = 4;
                                x1Var7222.updateColors();
                                x1Var7222.b();
                                int i412222 = y6.G8;
                                x1Var7222.c(i412222);
                                linearLayout22222.addView(x1Var7222, kb1.r(32, 32));
                                x1 x1Var22222 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var2222);
                                x1Var22222.e = 4;
                                x1Var22222.updateColors();
                                x1Var22222.b();
                                x1Var22222.c(i412222);
                                linearLayout22222.addView(x1Var22222, kb1.r(32, 32));
                                x1 x1Var32222 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var2222);
                                x1Var32222.e = 4;
                                x1Var32222.updateColors();
                                x1Var32222.b();
                                x1Var32222.c(i412222);
                                final x1[] x1VarArr3222 = {x1Var7222, x1Var22222, x1Var32222};
                                boolean z202222 = z11;
                                linearLayout22222.addView(x1Var32222, kb1.r(32, 32));
                                z15 = z12;
                                linearLayout22222.addView(new Space(getContext()), kb1.r(8, 0));
                                x1 x1Var42222 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var2222);
                                x1Var42222.e = 4;
                                x1Var42222.updateColors();
                                x1Var42222.b();
                                x1Var42222.c(i412222);
                                linearLayout22222.addView(x1Var42222, kb1.r(32, 32));
                                x1 x1Var52222 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var2222);
                                x1Var52222.e = 4;
                                x1Var52222.updateColors();
                                x1Var52222.b();
                                x1Var52222.c(i412222);
                                linearLayout22222.addView(x1Var52222, kb1.r(32, 32));
                                x1 x1Var62222 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var2222);
                                x1Var62222.e = 4;
                                x1Var62222.updateColors();
                                x1Var62222.b();
                                x1Var62222.c(i412222);
                                final x1[] x1VarArr22222 = {x1Var42222, x1Var52222, x1Var62222};
                                linearLayout22222.addView(x1Var62222, kb1.r(32, 32));
                                P2222.q(linearLayout3222);
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
                                P2222.o();
                                P2222.S = 208;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z16 = false;
                                if (!z16) {
                                }
                                P2222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                                if (i18 != 0) {
                                }
                                if (i19 != 0) {
                                }
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i20 != 0) {
                                }
                                if (z15) {
                                }
                                P2222.p = new jg.f1(this, P2222, p5Var2, 4);
                                this.r4 = P2222;
                                P2222.Z();
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
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
                l80Var = this.r4;
                if (l80Var != null) {
                }
                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                FrameLayout V4222222 = V4(p5Var2, false);
                i17 = i14;
                iArr = new int[2];
                V4222222.getLocationOnScreen(iArr);
                if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                }
                final l80 P22222 = this.p3.P(V4);
                P22222.s = 0;
                P22222.t = false;
                P22222.Z = z14;
                LinearLayout linearLayout32222 = new LinearLayout(getContext());
                linearLayout32222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                linearLayout32222.setOrientation(1);
                TextView textView22222 = new TextView(getContext());
                textView22222.setText(LocaleController.getString(R.string.ArticleAlignment));
                i18 = i10;
                textView22222.setTextSize(1, 12.0f);
                textView22222.setGravity(17);
                int i4022222 = y6.y6;
                u6 u6Var22222 = this.o3;
                f7.V(textView22222, i4022222, u6Var22222);
                linearLayout32222.addView(textView22222, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                LinearLayout linearLayout222222 = new LinearLayout(getContext());
                i19 = i11;
                i20 = i13;
                boolean z1922222 = z10;
                linearLayout222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                linearLayout222222.setOrientation(0);
                linearLayout32222.addView(linearLayout222222, kb1.u(-2, -2, 17));
                x1 x1Var72222 = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var22222);
                x1Var72222.e = 4;
                x1Var72222.updateColors();
                x1Var72222.b();
                int i4122222 = y6.G8;
                x1Var72222.c(i4122222);
                linearLayout222222.addView(x1Var72222, kb1.r(32, 32));
                x1 x1Var222222 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var22222);
                x1Var222222.e = 4;
                x1Var222222.updateColors();
                x1Var222222.b();
                x1Var222222.c(i4122222);
                linearLayout222222.addView(x1Var222222, kb1.r(32, 32));
                x1 x1Var322222 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var22222);
                x1Var322222.e = 4;
                x1Var322222.updateColors();
                x1Var322222.b();
                x1Var322222.c(i4122222);
                final x1[] x1VarArr32222 = {x1Var72222, x1Var222222, x1Var322222};
                boolean z2022222 = z11;
                linearLayout222222.addView(x1Var322222, kb1.r(32, 32));
                z15 = z12;
                linearLayout222222.addView(new Space(getContext()), kb1.r(8, 0));
                x1 x1Var422222 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var22222);
                x1Var422222.e = 4;
                x1Var422222.updateColors();
                x1Var422222.b();
                x1Var422222.c(i4122222);
                linearLayout222222.addView(x1Var422222, kb1.r(32, 32));
                x1 x1Var522222 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var22222);
                x1Var522222.e = 4;
                x1Var522222.updateColors();
                x1Var522222.b();
                x1Var522222.c(i4122222);
                linearLayout222222.addView(x1Var522222, kb1.r(32, 32));
                x1 x1Var622222 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var22222);
                x1Var622222.e = 4;
                x1Var622222.updateColors();
                x1Var622222.b();
                x1Var622222.c(i4122222);
                final x1[] x1VarArr222222 = {x1Var422222, x1Var522222, x1Var622222};
                linearLayout222222.addView(x1Var622222, kb1.r(32, 32));
                P22222.q(linearLayout32222);
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
                P22222.o();
                P22222.S = 208;
                if (!linkedHashSet.isEmpty()) {
                }
                z16 = false;
                if (!z16) {
                }
                P22222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                if (i20 != 0) {
                }
                if (z15) {
                }
                P22222.p = new jg.f1(this, P22222, p5Var2, 4);
                this.r4 = P22222;
                P22222.Z();
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
        l80Var = this.r4;
        if (l80Var != null) {
        }
        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
        FrameLayout V42222222 = V4(p5Var2, false);
        i17 = i14;
        iArr = new int[2];
        V42222222.getLocationOnScreen(iArr);
        if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
        }
        final l80 P222222 = this.p3.P(V4);
        P222222.s = 0;
        P222222.t = false;
        P222222.Z = z14;
        LinearLayout linearLayout322222 = new LinearLayout(getContext());
        linearLayout322222.setMinimumWidth(AndroidUtilities.dp(208.0f));
        linearLayout322222.setOrientation(1);
        TextView textView222222 = new TextView(getContext());
        textView222222.setText(LocaleController.getString(R.string.ArticleAlignment));
        i18 = i10;
        textView222222.setTextSize(1, 12.0f);
        textView222222.setGravity(17);
        int i40222222 = y6.y6;
        u6 u6Var222222 = this.o3;
        f7.V(textView222222, i40222222, u6Var222222);
        linearLayout322222.addView(textView222222, kb1.o(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2222222 = new LinearLayout(getContext());
        i19 = i11;
        i20 = i13;
        boolean z19222222 = z10;
        linearLayout2222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2222222.setOrientation(0);
        linearLayout322222.addView(linearLayout2222222, kb1.u(-2, -2, 17));
        x1 x1Var722222 = new x1(getContext(), R.drawable.iv_align_horiz_left, u6Var222222);
        x1Var722222.e = 4;
        x1Var722222.updateColors();
        x1Var722222.b();
        int i41222222 = y6.G8;
        x1Var722222.c(i41222222);
        linearLayout2222222.addView(x1Var722222, kb1.r(32, 32));
        x1 x1Var2222222 = new x1(getContext(), R.drawable.iv_align_horiz_middle, u6Var222222);
        x1Var2222222.e = 4;
        x1Var2222222.updateColors();
        x1Var2222222.b();
        x1Var2222222.c(i41222222);
        linearLayout2222222.addView(x1Var2222222, kb1.r(32, 32));
        x1 x1Var3222222 = new x1(getContext(), R.drawable.iv_align_horiz_right, u6Var222222);
        x1Var3222222.e = 4;
        x1Var3222222.updateColors();
        x1Var3222222.b();
        x1Var3222222.c(i41222222);
        final x1[] x1VarArr322222 = {x1Var722222, x1Var2222222, x1Var3222222};
        boolean z20222222 = z11;
        linearLayout2222222.addView(x1Var3222222, kb1.r(32, 32));
        z15 = z12;
        linearLayout2222222.addView(new Space(getContext()), kb1.r(8, 0));
        x1 x1Var4222222 = new x1(getContext(), R.drawable.iv_align_vert_top, u6Var222222);
        x1Var4222222.e = 4;
        x1Var4222222.updateColors();
        x1Var4222222.b();
        x1Var4222222.c(i41222222);
        linearLayout2222222.addView(x1Var4222222, kb1.r(32, 32));
        x1 x1Var5222222 = new x1(getContext(), R.drawable.iv_align_vert_middle, u6Var222222);
        x1Var5222222.e = 4;
        x1Var5222222.updateColors();
        x1Var5222222.b();
        x1Var5222222.c(i41222222);
        linearLayout2222222.addView(x1Var5222222, kb1.r(32, 32));
        x1 x1Var6222222 = new x1(getContext(), R.drawable.iv_align_vert_bottom, u6Var222222);
        x1Var6222222.e = 4;
        x1Var6222222.updateColors();
        x1Var6222222.b();
        x1Var6222222.c(i41222222);
        final x1[] x1VarArr2222222 = {x1Var4222222, x1Var5222222, x1Var6222222};
        linearLayout2222222.addView(x1Var6222222, kb1.r(32, 32));
        P222222.q(linearLayout322222);
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
        P222222.o();
        P222222.S = 208;
        if (!linkedHashSet.isEmpty()) {
        }
        z16 = false;
        if (!z16) {
        }
        P222222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new u7(this, p5Var2, z16, 8), false);
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        if (i20 != 0) {
        }
        if (z15) {
        }
        P222222.p = new jg.f1(this, P222222, p5Var2, 4);
        this.r4 = P222222;
        P222222.Z();
    }

    @Override // org.telegram.ui.Components.s71
    public final void M1(s4.e1 e1Var) {
        int b10;
        u61 G;
        a aVar = null;
        if (e1Var != null && (b10 = e1Var.b()) >= 0 && (G = this.g3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.a4 = aVar;
        this.b4 = false;
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.q();
        }
    }

    public final void M2() {
        j3 j3Var = this.v3;
        if (j3Var != null) {
            j3Var.f(true);
        }
        S2();
        t3();
        IdentityHashMap identityHashMap = this.h4;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((a5) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.i4;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((w4) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean M3() {
        int i10;
        a E4;
        j3 j3Var = this.v3;
        return j3Var != null && j3Var.x() && (i10 = j3Var.p0) == j3Var.s0 && i10 >= 0 && i10 < this.x4.size() && j3Var.q0 == 1 && j3Var.t0 == 1 && (E4 = E4(i10)) != null && d6.o(E4.b);
    }

    public final d6 M4() {
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x()) {
            return null;
        }
        int i10 = j3Var.p0;
        int i11 = j3Var.s0;
        a E4 = E4(i10);
        if (i10 == i11 && E4 != null && G3(E4.b)) {
            return A2(i10);
        }
        return null;
    }

    public final int N2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.t3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (D3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean N3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.t3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.i && !D3(aVar)) {
                        if (!aVar.k.isEmpty() || d6.o(aVar.b)) {
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

    public final Editable N4(int i10, int i11, int i12, int i13) {
        if (i10 != i12) {
            return null;
        }
        if (D3(E4(i10))) {
            g1 O2 = O2(i10);
            if (O2 != null) {
                return O2.getText();
            }
            return null;
        }
        if (M3()) {
            g1 p42 = p4(i10);
            if (p42 != null) {
                return p42.getText();
            }
            return null;
        }
        a E4 = E4(i10);
        if (E4 == null || !G3(E4.b)) {
            return null;
        }
        int o22 = o2(i10);
        if (ic.a.x(i11, i13, o22, 0) >= ic.a.e(i11, i13, o22, 0)) {
            return null;
        }
        d6 A2 = A2(i10);
        return A2 != null ? A2.getEditText().getText() : d6.z(E4.b);
    }

    public final g1 O2(int i10) {
        if (!D3(E4(i10))) {
            return null;
        }
        View G4 = G4(i10);
        if (G4 instanceof s0) {
            return ((s0) G4).getEditText();
        }
        return null;
    }

    public final boolean O3() {
        j3 j3Var = this.v3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.p0;
            int i11 = j3Var.s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a E4 = E4(i10);
                    if (E4 != null) {
                        if (I3(E4.b)) {
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
    public final boolean O4(int i10, int i11, int i12, int i13, ArrayList arrayList) {
        int i14;
        a aVar;
        CharSequence z10;
        CharSequence z11;
        CharSequence subSequence;
        CharSequence subSequence2;
        f2 f2Var;
        ArrayList arrayList2;
        SpannableStringBuilder z12;
        int length;
        int i15;
        f2 f2Var2;
        if (i10 >= 0 && i11 >= 0) {
            ArrayList arrayList3 = this.t3;
            if (i10 < arrayList3.size() && i11 < arrayList3.size()) {
                if (i10 <= i11) {
                    if (i10 == i11) {
                    }
                    for (i14 = i10; i14 <= i11; i14++) {
                        a aVar2 = (a) arrayList3.get(i14);
                        if (!aVar2.i && !D3(aVar2) && !K3(aVar2.b) && !r3(aVar2.b) && !(aVar2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i10);
                    a aVar3 = (a) arrayList3.get(i11);
                    z10 = d6.z(aVar.b);
                    z11 = i10 != i11 ? z10 : d6.z(aVar3.b);
                    if (z10 == null) {
                        z10 = "";
                    }
                    if (z11 == null) {
                        z11 = "";
                    }
                    int max = Math.max(0, Math.min(i12, z10.length()));
                    int max2 = Math.max(0, Math.min(i13, z11.length()));
                    subSequence = z10.subSequence(0, max);
                    subSequence2 = z11.subSequence(max2, z11.length());
                    f2Var = this.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    if (arrayList.size() == 1 || !L3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock Y3 = Y3(aVar.b);
                            d6.d(Y3, subSequence);
                            arrayList2.add(0, new a(Y3, aVar.c, aVar.d));
                        }
                        aVar = (a) ic.a.g(1, arrayList);
                        if (aVar != null) {
                            if (D3(aVar)) {
                                length = f6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true).length();
                            } else {
                                TL_iv.PageBlock pageBlock = aVar.b;
                                if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || I3(pageBlock)) && (z12 = d6.z(aVar.b)) != null) {
                                    length = z12.length();
                                }
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock Y32 = Y3(aVar3.b);
                                d6.d(Y32, subSequence2);
                                arrayList2.add(new a(Y32, aVar3.c, aVar3.d));
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
                        CharSequence z13 = d6.z(((a) arrayList.get(0)).b);
                        CharSequence charSequence = z13 != null ? z13 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        d6.d(aVar.b, spannableStringBuilder);
                        while (i11 > i10) {
                            arrayList3.remove(i11);
                            i11--;
                        }
                    }
                    y4();
                    this.v3.f(false);
                    this.g3.O(false);
                    f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    post(new o2(this, aVar, length, 1));
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
                z10 = d6.z(aVar.b);
                if (i10 != i11) {
                }
                if (z10 == null) {
                }
                if (z11 == null) {
                }
                int max3 = Math.max(0, Math.min(i12, z10.length()));
                int max22 = Math.max(0, Math.min(i13, z11.length()));
                subSequence = z10.subSequence(0, max3);
                subSequence2 = z11.subSequence(max22, z11.length());
                f2Var = this.R3;
                if (f2Var != null) {
                }
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                aVar = (a) ic.a.g(1, arrayList);
                if (aVar != null) {
                }
                length = 0;
                if (subSequence2.length() > 0) {
                }
                while (i11 >= i10) {
                }
                while (i15 < arrayList2.size()) {
                }
                y4();
                this.v3.f(false);
                this.g3.O(false);
                f2Var2 = this.R3;
                if (f2Var2 != null) {
                }
                post(new o2(this, aVar, length, 1));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean P3(int i10, int i11, int i12, int i13, int i14) {
        int length;
        int x9;
        int e;
        int max;
        int max2;
        if (E3()) {
            g1 O2 = O2(i11);
            return (O2 == null || (max = Math.max(0, Math.min(Math.min(i12, i14), O2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i12, i14), O2.length()))) || (i10 & O2.getCurrentStyle(max, max2)) == 0) ? false : true;
        }
        if (!M3()) {
            int i15 = i11;
            boolean z10 = false;
            while (i15 <= i13) {
                a E4 = E4(i15);
                if (E4 != null) {
                    TL_iv.PageBlock pageBlock = E4.b;
                    if (G3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int o22 = o2(i15);
                        int i16 = i15 == i11 ? i12 : 0;
                        int i17 = i15 == i13 ? i14 : o22;
                        int max3 = Math.max(0, Math.min(i16, o22));
                        int max4 = Math.max(0, Math.min(i17, o22));
                        if (max3 < max4) {
                            d6 A2 = A2(i15);
                            if (A2 != null ? (A2.getStyleDelegate().getCurrentStyle(max3, max4) & i10) != 0 : f6.i(max3, max4, i10, d6.z(E4(i15).b))) {
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
        g1 p42 = p4(i11);
        if (p42 != null && (x9 = ic.a.x(i12, i14, (length = p42.length()), 0)) < (e = ic.a.e(i12, i14, length, 0)) && (i10 & p42.getCurrentStyle(x9, e)) != 0) {
        }
    }

    public final void P4(View view) {
        s4.e1 T;
        int b10;
        if (view == null || this.h3 == null || !this.k3 || (T = T(view)) == null || (b10 = T.b()) < 0 || this.g3.H(b10) < 0) {
            return;
        }
        this.I3 = true;
        j3 j3Var = this.v3;
        if (j3Var.x()) {
            j3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.h3.t(T);
    }

    public final boolean Q3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i12;
        boolean z10 = false;
        while (i16 <= i14) {
            g1 T4 = T4(i11, i16);
            if (T4 != null) {
                int length = T4.length();
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
                    if ((T4.getCurrentStyle(max, max2) & i10) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i16++;
        }
        return z10;
    }

    public final void Q4(a aVar, t tVar, MediaController.PhotoEntry photoEntry) {
        long j10;
        a5 a5Var = (a5) this.h4.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        IdentityHashMap identityHashMap = this.i4;
        w4 w4Var = (w4) identityHashMap.remove(tVar);
        if (w4Var != null) {
            w4Var.a();
        }
        tVar.a = 1;
        tVar.f = 0.0f;
        w4 w4Var2 = new w4(this.n3, photoEntry, new h3(aVar, tVar, this));
        identityHashMap.put(tVar, w4Var2);
        if (w4Var2.f || w4Var2.h || w4Var2.n) {
            return;
        }
        w4Var2.f = true;
        int i10 = photoEntry.width;
        int i11 = photoEntry.height;
        if (i10 <= 0 || i11 <= 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(photoEntry.path, options);
                i10 = options.outWidth;
                i11 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        VideoEditedInfo videoEditedInfo = null;
        r7 = null;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        videoEditedInfo = null;
        if (i10 > 0 && i11 > 0) {
            int i12 = photoEntry.orientation;
            if (i12 == 90 || i12 == 270) {
                int i13 = i11;
                i11 = i10;
                i10 = i13;
            }
            VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
            videoEditedInfo2.startTime = 0L;
            videoEditedInfo2.start = 0L;
            videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
            while (true) {
                j10 = videoEditedInfo2.endTime;
                if (j10 <= 0 || j10 >= 1000) {
                    break;
                } else {
                    videoEditedInfo2.endTime = j10 * 2;
                }
            }
            if (j10 <= 0) {
                videoEditedInfo2.endTime = 3000L;
            }
            long j11 = videoEditedInfo2.endTime;
            videoEditedInfo2.end = j11;
            videoEditedInfo2.compressQuality = 1;
            videoEditedInfo2.rotationValue = 0;
            videoEditedInfo2.originalPath = photoEntry.path;
            videoEditedInfo2.estimatedSize = (int) ((r13 / 1000.0f) * 115200.0f);
            videoEditedInfo2.estimatedDuration = j11;
            videoEditedInfo2.framerate = 30;
            videoEditedInfo2.originalDuration = j11;
            videoEditedInfo2.filterState = photoEntry.savedFilterState;
            String str = photoEntry.croppedPaintPath;
            if (str != null) {
                videoEditedInfo2.paintPath = str;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = photoEntry.croppedMediaEntities;
                }
                videoEditedInfo2.mediaEntities = arrayList;
            } else {
                videoEditedInfo2.paintPath = photoEntry.paintPath;
                videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
            }
            videoEditedInfo2.isPhoto = true;
            MediaController.CropState cropState = photoEntry.cropState;
            if (cropState != null) {
                int i14 = cropState.transformRotation;
                if (i14 == 90 || i14 == 270) {
                    int i15 = i11;
                    i11 = i10;
                    i10 = i15;
                }
                i10 = (int) (i10 * cropState.cropPw);
                i11 = (int) (i11 * cropState.cropPh);
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
            videoEditedInfo2.resultWidth = i16;
            videoEditedInfo2.originalWidth = i16;
            videoEditedInfo2.resultHeight = i17;
            videoEditedInfo2.originalHeight = i17;
            videoEditedInfo2.bitrate = -1;
            videoEditedInfo2.muted = true;
            videoEditedInfo2.avatarStartTime = 0L;
            videoEditedInfo = videoEditedInfo2;
        }
        w4Var2.d = videoEditedInfo;
        if (videoEditedInfo == null || !videoEditedInfo.needConvert()) {
            w4Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        w4Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(w4Var2.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        w4Var2.c = messageObject;
        messageObject.videoEditedInfo = w4Var2.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(w4Var2.a);
        notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(w4Var2, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(w4Var2.c, false, false, false);
    }

    public final boolean R3() {
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x()) {
            return false;
        }
        int i10 = j3Var.p0;
        int i11 = j3Var.s0;
        a E4 = E4(i10);
        return i10 == i11 && E4 != null && (E4.b instanceof TL_iv.pageBlockTable);
    }

    public final void R4(a aVar, t tVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.h4;
        a5 a5Var = (a5) identityHashMap.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        a5 a5Var2 = new a5(this.n3, str, z10, i10, i11, i12, new i3(aVar, tVar, this));
        identityHashMap.put(tVar, a5Var2);
        a5Var2.d();
    }

    public final void S2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        l80 l80Var = this.r4;
        if (l80Var != null) {
            this.r4 = null;
            l80Var.u();
        }
        p5 p5Var = this.q4;
        if (p5Var != null) {
            LinkedHashSet linkedHashSet = p5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var.v.invalidate();
                p5Var.s();
            }
            this.q4 = null;
        }
        this.t4 = -1;
        this.s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean S3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.n3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += W3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList f32 = f3();
        g2 g2Var = new g2();
        g2Var.d = i11;
        g2Var.b = f32.size() + g2Var.b;
        for (int i12 = 0; i12 < f32.size(); i12++) {
            g2.b((TL_iv.PageBlock) f32.get(i12), 1, g2Var);
        }
        return g2Var.a <= appGlobalConfig.richMessageLengthLimit.get() && g2Var.b <= appGlobalConfig.richMessageMaxBlocks.get() && g2Var.c <= appGlobalConfig.richMessageMaxDepth.get() && g2Var.d <= appGlobalConfig.richMessageMaxMedia.get() && g2Var.e <= appGlobalConfig.richMessageMaxTableCols.get();
    }

    public final Editable S4(a aVar) {
        View F1 = F1(aVar);
        return F1 instanceof d6 ? ((d6) F1).getEditText().getText() : d6.z(aVar.b);
    }

    public final g1 T4(int i10, int i11) {
        View G4 = G4(i10);
        if (G4 instanceof p5) {
            return ((p5) G4).k(i11);
        }
        return null;
    }

    public final int[] U3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.V3.size(); i12++) {
            int length = d6.y(((a) this.V3.get(i12)).b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.V3.size() - 1;
        return new int[]{size, d6.y(((a) this.V3.get(size)).b).length()};
    }

    public final g1 V2() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return (g1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                return ((d6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int V3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i12 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i12);
            if (D3(aVar)) {
                i11++;
            } else if (aVar.i && i11 - 1 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public final a W2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                d6 d6Var = (d6) childAt;
                if (d6Var.getEditText().isFocused() || (d6Var.m() && d6Var.h.isFocused())) {
                    return d6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void W4() {
        int[] H4 = H4();
        if (H4 == null) {
            return;
        }
        int i10 = H4[0];
        int i11 = H4[1];
        if (i10 >= 0) {
            ArrayList arrayList = this.t3;
            if (i11 >= arrayList.size() || i10 > i11) {
                return;
            }
            f2 f2Var = this.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            if (N3(i10, i11)) {
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    boolean z10 = aVar.i;
                    ArrayList arrayList2 = aVar.k;
                    if (!z10 && !D3(aVar)) {
                        if (d6.o(aVar.b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.b.text;
                            aVar.b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            a1.g.A(1, arrayList2);
                        }
                    }
                }
            } else {
                long a2 = o0.a();
                for (int i13 = i10; i13 <= i11; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    boolean z11 = aVar2.i;
                    ArrayList arrayList3 = aVar2.k;
                    if (!z11 && !D3(aVar2)) {
                        if (d6.o(aVar2.b)) {
                            long a10 = o0.a();
                            TL_iv.RichText j10 = d6.j(aVar2.b);
                            if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                this.u3.put(Long.valueOf(a10), j10);
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
            D2();
            b4();
            y4();
            j3 j3Var = this.v3;
            boolean z12 = j3Var != null && j3Var.x();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
            this.g3.O(false);
            f2 f2Var2 = this.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            if (z12) {
                post(new jg.f1(this, aVar3, aVar4, 5));
            } else {
                post(new m2(this, aVar3, 9));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X1(TL_iv.PageBlock pageBlock) {
        f2 f2Var;
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.d();
        }
        a W2 = W2();
        if (W2 == null) {
            W2 = this.k4;
        }
        ArrayList arrayList = this.t3;
        int indexOf = W2 != null ? arrayList.indexOf(W2) : -1;
        if (indexOf >= 0 && (W2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a2 = o0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) W2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.u3.put(Long.valueOf(a2), richText);
            }
            W2.k.add(Long.valueOf(a2));
            W2.b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = indexOf >= 0 && !W2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = W2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && W2.g == null && d6.y(pageBlock2).isEmpty()) {
                W2.b = pageBlock;
                this.k4 = W2;
                if (r3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(W2) + 1;
                    if (indexOf2 >= arrayList.size() || K3(((a) arrayList.get(indexOf2)).b)) {
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z10) {
                            aVar.k.addAll(W2.k);
                        }
                        arrayList.add(indexOf2, aVar);
                        W2 = aVar;
                    } else {
                        W2 = (a) arrayList.get(indexOf2);
                    }
                }
                this.g3.O(false);
                f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.h();
                }
                post(new m2(this, W2, 1));
            }
        }
        a aVar2 = new a(pageBlock, 0, 0);
        if (z10) {
            aVar2.k.addAll(W2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, aVar2);
        } else {
            arrayList.add(aVar2);
        }
        W2 = aVar2;
        this.k4 = W2;
        if (r3(pageBlock)) {
        }
        this.g3.O(false);
        f2Var = this.R3;
        if (f2Var != null) {
        }
        post(new m2(this, W2, 1));
    }

    public final p5 X2() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return a3((g1) findFocus);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        a aVar2;
        f2 f2Var;
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.d();
        }
        aVar.b = pageBlock;
        aVar.c = i10;
        aVar.d = i11;
        aVar.e = z10;
        aVar.f = z11;
        y4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z12) {
            int i12 = indexOf + 1;
            if (i12 >= arrayList.size() || K3(((a) arrayList.get(i12)).b)) {
                arrayList.add(i12, new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        } else if (K3(pageBlock)) {
            if (J3(pageBlock) && aVar.g == null) {
                aVar.g = new t();
            }
            int i13 = indexOf + 1;
            if (i13 >= arrayList.size() || K3(((a) arrayList.get(i13)).b)) {
                aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(i13, aVar2);
            } else {
                aVar2 = (a) arrayList.get(i13);
            }
            if (aVar2 == aVar || z12 || K3(pageBlock) || !(findFocus() instanceof g1)) {
                this.g3.O(false);
                f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.h();
                }
                post(new m2(this, aVar2, 18));
            }
            d2();
            f2 f2Var3 = this.R3;
            if (f2Var3 != null) {
                f2Var3.h();
            }
            View F1 = F1(aVar);
            if (F1 instanceof d6) {
                d6 d6Var = (d6) F1;
                d6Var.A();
                d6Var.getEditText().setSelection(d6Var.getEditText().length());
                return;
            }
            return;
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.g3.O(false);
        f2Var = this.R3;
        if (f2Var != null) {
        }
        post(new m2(this, aVar2, 18));
    }

    public final TLRPC.Document Y2(long j10) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j10 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.t3.size(); i11++) {
            for (t tVar : W3((a) this.t3.get(i11))) {
                if (tVar != null && (document2 = tVar.h) != null && document2.id == j10) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.s3;
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
        HashMap hashMap = v4.a;
        synchronized (v4.class) {
            document = j10 != 0 ? (TLRPC.Document) v4.b.get(Long.valueOf(j10)) : null;
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
    
        r7 = (li.a) r7.get(r2);
        r12 = r7.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019f, code lost:
    
        if (r12 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a1, code lost:
    
        r0.X(r2, li.f6.l((org.telegram.tgnet.tl.TL_iv.RichText) r14.u3.get(java.lang.Long.valueOf(r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r0.X(r2, li.d6.y(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c4, code lost:
    
        if (li.d6.o(r7.b) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        r7 = li.f6.l(li.d6.j(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d4, code lost:
    
        if (r7.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d6, code lost:
    
        r0.w0.put(65536 + r2, org.telegram.ui.Cells.s9.Y(r7));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f0, code lost:
    
        r2 = r7.size() - 1;
        r7 = (li.a) r7.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        if (r7.t != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0207, code lost:
    
        if (li.d6.o(r7.b) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r7 = li.f6.l(li.d6.j(r7.b));
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
    
        if ((r10 instanceof org.telegram.ui.Cells.r9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r10 = (org.telegram.ui.Cells.r9) r10;
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
        org.telegram.messenger.AndroidUtilities.cancelRunOnUIThread(r4);
        org.telegram.messenger.AndroidUtilities.runOnUIThread(r4);
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
    public final boolean Y4() {
        p5 p5Var;
        int[] g52;
        int[] g53;
        boolean z10;
        boolean z11;
        int length;
        k0 k0Var;
        d6 d6Var;
        int j10;
        if (this.t3.isEmpty()) {
            return false;
        }
        j3 j3Var = this.v3;
        boolean x9 = j3Var.x();
        SparseIntArray sparseIntArray = j3Var.y0;
        org.telegram.ui.Cells.g gVar = j3Var.m0;
        r9 r9Var = null;
        if (x9) {
            int i10 = j3Var.p0;
            if (i10 == j3Var.s0) {
                View G4 = G4(i10);
                if ((G4 instanceof p5) && (((g52 = g5((p5Var = (p5) G4))) == null || j3Var.q0 != 0 || j3Var.r0 != 0 || j3Var.t0 != g52[0] || j3Var.u0 != g52[1]) && (g53 = g5(p5Var)) != null)) {
                    int i11 = g53[0];
                    int i12 = g53[1];
                    ArrayList arrayList = j3Var.A0;
                    int d02 = j3Var.d0(p5Var);
                    if (d02 >= 0 && (i11 != 0 || i12 != 0)) {
                        j3Var.W = p5Var;
                        j3Var.s0 = d02;
                        j3Var.p0 = d02;
                        j3Var.q0 = 0;
                        j3Var.t0 = i11;
                        j3Var.r0 = 0;
                        j3Var.u0 = i12;
                        j3Var.u = 0;
                        j3Var.v = i12;
                        j3Var.B0 = d02;
                        j3Var.D0 = 0;
                        j3Var.C0 = 0;
                        j3Var.h0(p5Var, d02);
                        arrayList.clear();
                        p5Var.fillTextLayoutBlocks(arrayList);
                        if (!arrayList.isEmpty() && arrayList.size() > 0) {
                            j3Var.a = ((da) arrayList.get(0)).getX();
                            j3Var.b = ((da) arrayList.get(0)).getY();
                        } else if (!arrayList.isEmpty()) {
                            j3Var.a = ((da) arrayList.get(0)).getX();
                            j3Var.b = ((da) arrayList.get(0)).getY();
                        }
                        ea eaVar = j3Var.C;
                        if (eaVar != null) {
                            eaVar.setVisibility(0);
                        }
                        j3Var.U();
                        j3Var.w();
                        j3Var.u();
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        ye yeVar = j3Var.D;
                        if (yeVar != null) {
                            yeVar.a(true);
                        }
                        p5Var.invalidate();
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            g1 V2 = V2();
            if (V2 != 0 && V2.getText() != null && (length = V2.getText().length()) > 0) {
                p5 a32 = a3(V2);
                if (a32 != null) {
                    if (V2 == a32.getTitleEditText()) {
                        j10 = 0;
                    } else {
                        s5 n10 = a32.n(V2);
                        j10 = n10 != null ? a32.j(n10.b) : -1;
                    }
                    if (j10 >= 0) {
                        V2.setSelection(V2.getSelectionEnd());
                        z11 = j3Var.j0(a32, j10, 0, length);
                    }
                } else {
                    if (!(V2 instanceof k0)) {
                        ViewParent parent = V2.getParent();
                        while (true) {
                            if (parent == null) {
                                k0Var = null;
                                break;
                            }
                            if (parent instanceof k0) {
                                k0Var = (k0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        k0Var = (k0) V2;
                    }
                    if (k0Var instanceof r9) {
                        V2.setSelection(V2.getSelectionEnd());
                        z11 = j3Var.j0((r9) k0Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = V2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                d6Var = null;
                                break;
                            }
                            if (parent2 instanceof d6) {
                                d6Var = (d6) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (d6Var != null) {
                            int i13 = V2 == d6Var.getAuthorEditText() ? 1 : 0;
                            V2.setSelection(V2.getSelectionEnd());
                            z11 = j3Var.j0(d6Var, i13, 0, length);
                        }
                    }
                }
            }
            z11 = false;
        }
    }

    public final void Z1(a aVar, MediaController.PhotoEntry photoEntry) {
        v3 v3Var;
        if (aVar != null && J3(aVar.b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                t Z3 = Z3(photoEntry, str2);
                boolean c10 = w4.c(photoEntry);
                TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (H3(aVar.b)) {
                    m3(aVar.b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(Z3);
                } else {
                    t tVar = aVar.g;
                    if (tVar == null || tVar.a == 0) {
                        aVar.b = pageblockvideo;
                        aVar.g = Z3;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.b.caption;
                        j0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.g);
                        aVar.h.add(Z3);
                        aVar.g = null;
                        aVar.b = pageblockcollage;
                    }
                }
                this.g3.O(false);
                t4(aVar);
                if (c10) {
                    Q4(aVar, Z3, photoEntry);
                    v3Var = this;
                } else {
                    v3Var = this;
                    v3Var.R4(aVar, Z3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                f2 f2Var2 = v3Var.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                v3Var.p3.onContentChanged();
            }
        }
    }

    public final int Z2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (D3(aVar2)) {
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
                    if (!K3(pageBlock) || r3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
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
    public final boolean Z4(View view, float f7, float f10) {
        int lineForVertical;
        int lineForVertical2;
        s5 m10;
        int lineForVertical3;
        if (view != 0) {
            j3 j3Var = this.v3;
            if (!j3Var.x()) {
                int left = (int) ((f7 - view.getLeft()) - getLeft());
                int top = (int) ((f10 - view.getTop()) - getTop());
                if (view instanceof d6) {
                    d6 d6Var = (d6) view;
                    g1 g1Var = d6Var.h;
                    g1 g1Var2 = d6Var.f;
                    LinearLayout linearLayout = d6Var.b;
                    if (d6.x(g1Var2, g1Var2.getLeft() + linearLayout.getLeft(), g1Var2.getTop() + linearLayout.getTop(), left, top) || (g1Var.getVisibility() == 0 && d6.x(g1Var, g1Var.getLeft(), g1Var.getTop(), left, top))) {
                        j3Var.k0(d6Var, left, top);
                        j3Var.l0();
                        return true;
                    }
                } else if (view instanceof p5) {
                    p5 p5Var = (p5) view;
                    o5 o5Var = p5Var.w;
                    z3 z3Var = p5Var.s;
                    r5 r5Var = p5Var.v;
                    TL_iv.pageTableCell l4 = p5Var.l(left, top);
                    if (l4 != null && (m10 = r5Var.m(l4)) != null) {
                        g1 g1Var3 = m10.a;
                        int scrollX = z3Var.getScrollX() + (((left - z3Var.getLeft()) - o5Var.getLeft()) - r5Var.getLeft());
                        int top2 = ((top - z3Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
                        int left2 = (scrollX - m10.getLeft()) - g1Var3.getLeft();
                        int top3 = (top2 - m10.getTop()) - g1Var3.getTop();
                        Layout layout = g1Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - g1Var3.getPaddingTop();
                            int paddingLeft = left2 - g1Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f11 = paddingLeft;
                                if (f11 >= lineLeft) {
                                }
                            }
                        }
                    }
                    g1 g1Var4 = p5Var.r;
                    Layout layout2 = g1Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (g1Var4.getPaddingLeft() + g1Var4.getLeft());
                        int paddingTop2 = top - (g1Var4.getPaddingTop() + g1Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f12 = paddingLeft2;
                            if (f12 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof k0) {
                    if (((k0) view).a(left, top)) {
                        j3Var.k0(view, left, top);
                        j3Var.l0();
                        return true;
                    }
                } else if (view instanceof s0) {
                    s0 s0Var = (s0) view;
                    g1 g1Var5 = s0Var.d;
                    Layout layout3 = g1Var5.getLayout();
                    if (layout3 != null && g1Var5.length() != 0) {
                        int paddingLeft3 = left - (g1Var5.getPaddingLeft() + g1Var5.getLeft());
                        int paddingTop3 = top - (g1Var5.getPaddingTop() + g1Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int dp = AndroidUtilities.dp(24.0f);
                            int max = Math.max(0, (g1Var5.getWidth() - g1Var5.getPaddingLeft()) - g1Var5.getPaddingRight());
                            float f13 = dp;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f13);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f13);
                            float f14 = paddingLeft3;
                            if (f14 >= max2 && f14 <= min) {
                                j3Var.k0(s0Var, left, top);
                                j3Var.l0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof q4) {
                    q4 q4Var = (q4) view;
                    if (q4Var.w != null) {
                        int[] iArr = new int[4];
                        q4Var.h(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            j3Var.k0(view, left, top);
                            j3Var.l0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a2(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
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
        c3(arrayList4, richMessage.blocks, this.u3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            B4((a) arrayList4.get(i10));
        }
        ArrayList arrayList5 = this.t3;
        int size = arrayList5.size();
        a W2 = W2();
        if (W2 != null && (indexOf = arrayList5.indexOf(W2)) >= 0) {
            TL_iv.PageBlock pageBlock = W2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && d6.y(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        b4();
        y4();
        this.g3.O(false);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3 t3Var = this.p3;
        if (t3Var != null) {
            t3Var.onContentChanged();
        }
    }

    public final a a4(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.x4;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                if (aVar.t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (K3(pageBlock) && !r3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i10 += i11;
        }
        return null;
    }

    public final void a5(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.t3;
        if (arrayList.indexOf(aVar2) < 0 || D3(aVar2) || aVar2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (pageBlock != pageBlock2 && G3(pageBlock2) && G3(pageBlock)) {
            d6 A2 = A2(arrayList.indexOf(aVar2));
            d6.d(pageBlock, A2 != null ? A2.getEditText().getText() : d6.z(aVar2.b));
            TL_iv.RichText j10 = d6.j(aVar2.b);
            if (j10 != null && d6.j(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = j10;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = j10;
                }
            }
        }
        X4(aVar2, pageBlock, i10, i11, z10, z11);
    }

    public final a b2(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.x4;
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

    public final void b3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                d6 d6Var = (d6) childAt;
                d6Var.f.n();
                d6Var.h.n();
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().n();
            }
        }
    }

    public final void b4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.k.isEmpty() && d6.o(aVar.b)) {
                long a2 = o0.a();
                TL_iv.RichText j10 = d6.j(aVar.b);
                if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                    this.u3.put(Long.valueOf(a2), j10);
                }
                aVar.k.add(Long.valueOf(a2));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.b.text;
                aVar.b = pageblockparagraph;
            }
            i10++;
        }
    }

    public final void b5(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        a5(aVar2, pageBlock, aVar2.c, aVar2.d, aVar2.e, aVar2.f);
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
    
        if (N2(r8) <= 0) goto L272;
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
    
        if (N2(r12) <= 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r13 = (li.a) r5.get(r4);
        r7 = (li.a) r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r8 != r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (D3(r13) != false) goto L61;
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
    
        if (D3(r7) != false) goto L69;
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
    
        r4 = li.d6.y(r13.b);
        r1 = r4.substring(0, java.lang.Math.max(0, java.lang.Math.min(r1, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0176, code lost:
    
        if (r18 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        r4 = li.d6.y(r7.b);
        r15 = r4.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        li.d6.e(r13.b, r1 + r3 + r15);
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
    
        r13 = new li.a(new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph(), r6, r6);
        r5.add(r13);
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022c, code lost:
    
        y4();
        r11.f(r6);
        r14.O(r6);
        r2 = r20.R3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0237, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
    
        post(new li.o2(r20, r13, r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0245, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ba, code lost:
    
        if (r18 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        r1 = li.d6.y(r7.b);
        r1 = r1.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r1.length())));
        li.d6.e(r7.b, r3 + r1);
        r5.subList(r8, r9).clear();
        r1 = r3.length();
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
    
        r5.subList(r8, r12).clear();
        r1 = new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph();
        f2(r1, r3);
        r6 = 0;
        r13 = new li.a(r1, 0, 0);
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
    public final boolean c2(int i10, int i11, int i12, int i13, String[] strArr) {
        String str;
        p5 p5Var;
        h6 model;
        int max;
        int length;
        int length2;
        int i14 = i11;
        int i15 = i13;
        a E4 = E4(i10);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(E4);
        int indexOf2 = arrayList.indexOf(E4(i12));
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
            return false;
        }
        a aVar = (a) arrayList.get(indexOf);
        a aVar2 = (a) arrayList.get(indexOf2);
        j3 j3Var = this.v3;
        int i16 = 1;
        if (indexOf == indexOf2 && D3(aVar)) {
            View F1 = F1(aVar);
            if (!(F1 instanceof s0) || !(aVar.b instanceof TL_iv.pageBlockDetails)) {
                return true;
            }
            g1 editText = ((s0) F1).getEditText();
            f2 f2Var = this.R3;
            if (f2Var != null) {
                f2Var.d();
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
            int x9 = ic.a.x(i14, i15, length3, 0);
            spannableStringBuilder.replace(x9, ic.a.e(i14, i15, length3, 0), (CharSequence) sb3);
            editText.setTextSilently(spannableStringBuilder);
            editText.invalidateEffects();
            ((TL_iv.pageBlockDetails) aVar.b).title = f6.f(spannableStringBuilder);
            int length4 = sb3.length() + x9;
            j3Var.f(false);
            f2 f2Var2 = this.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            post(new u2(editText, length4, 0));
            return true;
        }
        int i18 = indexOf;
        while (true) {
            k71 k71Var = this.g3;
            str = "";
            if (i18 > indexOf2) {
                int i19 = i16;
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                TL_iv.PageBlock pageBlock = aVar.b;
                boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                boolean z11 = aVar2.b instanceof TL_iv.pageBlockTable;
                t3 t3Var = this.p3;
                if (z10 || z11) {
                    if (z10 && z11 && indexOf == indexOf2) {
                        int i20 = j3Var.q0;
                        int i21 = j3Var.t0;
                        View F12 = F1(aVar);
                        if ((F12 instanceof p5) && (model = (p5Var = (p5) F12).getModel()) != null) {
                            ArrayList arrayList2 = model.g;
                            if (i20 == 0 && i21 == 0) {
                                TL_iv.PageBlock pageBlock2 = aVar.b;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    f2 f2Var4 = this.R3;
                                    if (f2Var4 != null) {
                                        f2Var4.d();
                                    }
                                    String l4 = f6.l(pageblocktable.title);
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
                                    g1 titleEditText = p5Var.getTitleEditText();
                                    titleEditText.setTextSilently(str2);
                                    titleEditText.invalidateEffects();
                                    int length5 = sb5.length() + max2;
                                    j3Var.f(false);
                                    f2 f2Var5 = this.R3;
                                    if (f2Var5 != null) {
                                        f2Var5.h();
                                    }
                                    t3Var.onContentChanged();
                                    post(new u2(titleEditText, length5, 4));
                                    return true;
                                }
                            } else {
                                int i23 = i20 - 1;
                                int i24 = i21 - 1;
                                int size = arrayList2.size();
                                if (i23 >= 0 && i23 < size && i24 >= 0 && i24 < size) {
                                    f2 f2Var6 = this.R3;
                                    if (f2Var6 != null) {
                                        f2Var6.d();
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
                                        String g7 = h6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i14, g7.length()));
                                        String str3 = g7.substring(0, max) + sb7 + g7.substring(Math.max(0, Math.min(i15, g7.length())));
                                        h6.c(pagetablecell, str3);
                                        s5 m10 = p5Var.getGrid().m(pagetablecell);
                                        if (m10 != null) {
                                            m10.a.setTextSilently(str3);
                                        }
                                        length = sb7.length();
                                    } else {
                                        String g10 = h6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i14, g10.length()));
                                        String str4 = g10.substring(0, max) + sb7;
                                        h6.c(pagetablecell, str4);
                                        s5 m11 = p5Var.getGrid().m(pagetablecell);
                                        if (m11 != null) {
                                            m11.a.setTextSilently(str4);
                                        }
                                        for (int i26 = i23 + 1; i26 < i24; i26++) {
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i26);
                                            h6.c(pagetablecell3, "");
                                            s5 m12 = p5Var.getGrid().m(pagetablecell3);
                                            if (m12 != null) {
                                                m12.a.setTextSilently("");
                                            }
                                        }
                                        String g11 = h6.g(pagetablecell2);
                                        String substring = g11.substring(Math.max(0, Math.min(i15, g11.length())));
                                        h6.c(pagetablecell2, substring);
                                        s5 m13 = p5Var.getGrid().m(pagetablecell2);
                                        if (m13 != null) {
                                            m13.a.setTextSilently(substring);
                                        }
                                        length = sb7.length();
                                    }
                                    int i27 = length + max;
                                    j3Var.f(false);
                                    f2 f2Var7 = this.R3;
                                    if (f2Var7 != null) {
                                        f2Var7.h();
                                    }
                                    post(new ai.h0(p5Var, pagetablecell, i27, 20));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                boolean r32 = r3(pageBlock);
                boolean r33 = r3(aVar2.b);
                if (r32 || r33) {
                    if (r32 && r33 && indexOf == indexOf2) {
                        View F13 = F1(aVar);
                        if (F13 instanceof k0) {
                            k0 k0Var = (k0) F13;
                            g1 captionEditText = k0Var.getCaptionEditText();
                            f2 f2Var8 = this.R3;
                            if (f2Var8 != null) {
                                f2Var8.d();
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
                            int x10 = ic.a.x(i14, i15, length6, 0);
                            spannableStringBuilder2.replace(x10, ic.a.e(i14, i15, length6, 0), (CharSequence) sb9);
                            captionEditText.setTextSilently(spannableStringBuilder2);
                            captionEditText.invalidateEffects();
                            k0Var.b();
                            int length7 = sb9.length() + x10;
                            j3Var.f(false);
                            f2 f2Var9 = this.R3;
                            if (f2Var9 != null) {
                                f2Var9.h();
                            }
                            post(new u2(captionEditText, length7, 2));
                            return true;
                        }
                    }
                    return false;
                }
                if (indexOf != indexOf2 || !d6.o(aVar.b) || j3Var.q0 != i19 || j3Var.t0 != i19) {
                    String y3 = d6.y(aVar.b);
                    String y10 = indexOf == indexOf2 ? y3 : d6.y(aVar2.b);
                    int max4 = Math.max(0, Math.min(i14, y3.length()));
                    int max5 = Math.max(0, Math.min(i15, y10.length()));
                    String substring2 = y3.substring(0, max4);
                    String substring3 = y10.substring(max5);
                    if (strArr.length <= 1) {
                        str = strArr.length != 0 ? strArr[0] : "";
                        d6.e(aVar.b, substring2 + str + substring3);
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        length2 = str.length() + substring2.length();
                    } else {
                        TL_iv.PageBlock pageBlock3 = aVar.b;
                        StringBuilder u10 = a1.g.u(substring2);
                        u10.append(strArr[0]);
                        d6.e(pageBlock3, u10.toString());
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        for (int i29 = 1; i29 < strArr.length - 1; i29++) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            f2(pageblockparagraph, strArr[i29]);
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
                        f2(pageblockparagraph2, str5 + substring3);
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
                    y4();
                    a aVar3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (a) arrayList.get(indexOf);
                    j3Var.f(false);
                    k71Var.O(false);
                    f2 f2Var10 = this.R3;
                    if (f2Var10 != null) {
                        f2Var10.h();
                    }
                    post(new o2(this, aVar3, length2, 0));
                    return true;
                }
                View F14 = F1(aVar);
                if (F14 instanceof d6) {
                    d6 d6Var = (d6) F14;
                    g1 authorEditText = d6Var.getAuthorEditText();
                    f2 f2Var11 = this.R3;
                    if (f2Var11 != null) {
                        f2Var11.d();
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
                    int x11 = ic.a.x(i14, i15, length9, 0);
                    spannableStringBuilder3.replace(x11, ic.a.e(i14, i15, length9, 0), (CharSequence) sb11);
                    authorEditText.setTextSilently(spannableStringBuilder3);
                    authorEditText.invalidateEffects();
                    d6Var.v();
                    int length10 = sb11.length() + x11;
                    j3Var.f(false);
                    f2 f2Var12 = this.R3;
                    if (f2Var12 != null) {
                        f2Var12.h();
                    }
                    t3Var.onContentChanged();
                    post(new u2(authorEditText, length10, 1));
                    return true;
                }
                return true;
            }
            boolean z12 = i16;
            if (((a) arrayList.get(i18)).i || D3((a) arrayList.get(i18))) {
                break;
            }
            i18++;
            i16 = z12 ? 1 : 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c4(a aVar, boolean z10) {
        int i10;
        f2 f2Var;
        int indexOf = this.t3.indexOf(aVar);
        if (indexOf >= 0) {
            View F1 = F1(aVar);
            if (F1 instanceof d6) {
                d6 d6Var = (d6) F1;
                if (d6Var.getEditText().isFocused()) {
                    i10 = d6Var.getEditText().getSelectionEnd();
                    f2Var = this.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    if (w3(indexOf, z10, false)) {
                        y4();
                        if (findFocus() instanceof g1) {
                            d2();
                        } else {
                            this.g3.O(false);
                        }
                        f2 f2Var2 = this.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        if (i10 < 0) {
                            return true;
                        }
                        post(new o2(this, aVar, i10, 2));
                        return true;
                    }
                }
            }
            i10 = -1;
            f2Var = this.R3;
            if (f2Var != null) {
            }
            if (w3(indexOf, z10, false)) {
            }
        }
        return false;
    }

    public final void c5(a aVar, int i10) {
        boolean z10;
        v3 v3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            a5(aVar2, aVar2.b, 0, 0, false, false);
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
            v3Var = this;
        } else {
            z10 = false;
            v3Var = this;
            pageBlock = pageBlock2;
        }
        v3Var.a5(aVar2, pageBlock, max, max2, z11, z10);
    }

    public final void d2() {
        d6 d6Var;
        a aVar;
        a6 a6Var;
        this.g3.T();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof d6) && (aVar = (d6Var = (d6) childAt).x) != null && (a6Var = d6Var.y) != null) {
                d6Var.f(aVar, a6Var, d6Var.E);
            }
        }
    }

    public final void d4() {
        int length;
        int x9;
        int e;
        int length2;
        int x10;
        int e10;
        int length3;
        int x11;
        int e11;
        int length4;
        int x12;
        int e12;
        g1 T4;
        int length5;
        int x13;
        int e13;
        boolean R3 = R3();
        j3 j3Var = this.v3;
        if (R3) {
            int i10 = j3Var.p0;
            int i11 = j3Var.q0;
            if (i11 == j3Var.t0 && (T4 = T4(i10, i11)) != null && (x13 = ic.a.x(j3Var.r0, j3Var.u0, (length5 = T4.length()), 0)) < (e13 = ic.a.e(j3Var.r0, j3Var.u0, length5, 0))) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                if (f6.h(T4.getText(), x13, e13)) {
                    f6.n(T4.getText(), x13, e13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    u4();
                }
                T4.setSelectionOverride(x13, e13);
                T4.makeSelectedDate();
                return;
            }
            return;
        }
        if (E3()) {
            int i12 = j3Var.p0;
            g1 O2 = O2(i12);
            if (O2 != null && (x12 = ic.a.x(j3Var.r0, j3Var.u0, (length4 = O2.length()), 0)) < (e12 = ic.a.e(j3Var.r0, j3Var.u0, length4, 0))) {
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                if (f6.h(O2.getText(), x12, e12)) {
                    f6.n(O2.getText(), x12, e12);
                    O2.invalidateEffects();
                    k4(i12);
                    f2 f2Var4 = this.R3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    u4();
                }
                O2.setSelectionOverride(x12, e12);
                O2.makeSelectedDate();
                return;
            }
            return;
        }
        if (C3()) {
            int i13 = j3Var.p0;
            g1 y22 = y2(i13);
            if (y22 != null && (x11 = ic.a.x(j3Var.r0, j3Var.u0, (length3 = y22.length()), 0)) < (e11 = ic.a.e(j3Var.r0, j3Var.u0, length3, 0))) {
                f2 f2Var5 = this.R3;
                if (f2Var5 != null) {
                    f2Var5.d();
                }
                if (f6.h(y22.getText(), x11, e11)) {
                    f6.n(y22.getText(), x11, e11);
                    y22.invalidateEffects();
                    j4(i13);
                    f2 f2Var6 = this.R3;
                    if (f2Var6 != null) {
                        f2Var6.h();
                    }
                    u4();
                }
                y22.setSelectionOverride(x11, e11);
                y22.makeSelectedDate();
                return;
            }
            return;
        }
        if (!M3()) {
            d6 M4 = M4();
            if (M4 != null && (x9 = ic.a.x(j3Var.r0, j3Var.u0, (length = M4.getEditText().length()), 0)) < (e = ic.a.e(j3Var.r0, j3Var.u0, length, 0))) {
                f2 f2Var7 = this.R3;
                if (f2Var7 != null) {
                    f2Var7.d();
                }
                if (f6.h(M4.getEditText().getText(), x9, e)) {
                    f6.n(M4.getEditText().getText(), x9, e);
                    M4.getEditText().invalidateEffects();
                    M4.w();
                    f2 f2Var8 = this.R3;
                    if (f2Var8 != null) {
                        f2Var8.h();
                    }
                    u4();
                }
                M4.getEditText().setSelectionOverride(x9, e);
                M4.getEditText().makeSelectedDate();
                return;
            }
            return;
        }
        int i14 = j3Var.p0;
        g1 p42 = p4(i14);
        if (p42 != null && (x10 = ic.a.x(j3Var.r0, j3Var.u0, (length2 = p42.length()), 0)) < (e10 = ic.a.e(j3Var.r0, j3Var.u0, length2, 0))) {
            f2 f2Var9 = this.R3;
            if (f2Var9 != null) {
                f2Var9.d();
            }
            if (f6.h(p42.getText(), x10, e10)) {
                f6.n(p42.getText(), x10, e10);
                p42.invalidateEffects();
                l4(i14);
                f2 f2Var10 = this.R3;
                if (f2Var10 != null) {
                    f2Var10.h();
                }
                u4();
            }
            p42.setSelectionOverride(x10, e10);
            p42.makeSelectedDate();
        }
    }

    public final a d5() {
        j3 j3Var;
        int i10;
        a W2 = W2();
        return (W2 == null && (j3Var = this.v3) != null && j3Var.x() && (i10 = j3Var.p0) == j3Var.s0) ? E4(i10) : W2;
    }

    @Override // org.telegram.ui.Components.s71, org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
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
                arrayList = this.x4;
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
                if (this.y4 == null) {
                    xm0 xm0Var = new xm0(this);
                    this.y4 = xm0Var;
                    xm0Var.a(null, null, null, this.o3, 1);
                    zd.a(this.y4, this.o3);
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
                            int q42 = q4(i15, aVar6, true);
                            l10 = l4;
                            int q43 = q4(i15, aVar7, false);
                            if (f12 - f10 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int C = org.telegram.messenger.t.C(16.0f, getWidth(), dp);
                                if (C - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, q42 + f10, C, f12 - q43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.y4.c(floor, floor, floor, f11, canvas, rectF);
                                    f7 = f11;
                                    this.y4.f(canvas, rectF, f7);
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
                            if (aVar == null || aVar != this.a4) {
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

    public final boolean e2(int i10, int i11) {
        j3 j3Var;
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] U3 = U3(max);
            int[] U32 = U3(max2);
            a aVar = (a) this.V3.get(U3[0]);
            if (U3[0] == U32[0] || max == max2) {
                View F1 = F1(aVar);
                if (F1 instanceof d6) {
                    d6 d6Var = (d6) F1;
                    d6Var.A();
                    g1 editText = d6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(U3[1], length), Math.min(U32[1], length));
                }
            } else {
                View F12 = F1(aVar);
                View F13 = F1(this.V3.get(U32[0]));
                if ((F12 instanceof d6) && (F13 instanceof d6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.t3;
                        int size = arrayList2.size();
                        j3Var = this.v3;
                        if (i12 >= size) {
                            break;
                        }
                        j3Var.X(i12, d6.y(((a) arrayList2.get(i12)).b));
                        i12++;
                    }
                    d6 d6Var2 = (d6) F12;
                    int length2 = d6Var2.getEditText().length();
                    if (U3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!j3Var.j0(d6Var2, 0, U3[1], length2)) {
                        d6Var2.A();
                        return true;
                    }
                    j3Var.b0(0, U32[1], (d6) F13);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList e3(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        boolean z11;
        v3 v3Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.t3;
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
                ArrayList<TL_iv.PageBlock> e32 = e3(i15, i16, i12 + 1, true);
                if (e32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.u3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (e32.size() == 1 && (e32.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = e32.get(0).text != null ? e32.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = e32;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (D3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int V3 = V3(i15);
                pageblockdetails.blocks = e3(i15 + 1, Math.min(V3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = V3 + 1;
            } else {
                int i17 = aVar.c;
                if (i17 <= 0) {
                    P2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                        i13 = i11;
                        i14 = i12;
                        v3Var = this;
                    } else {
                        z11 = false;
                        v3Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock q22 = v3Var.q2(i15, i17, i13, i14, z11, iArr);
                    if (q22 != null) {
                        arrayList.add(q22);
                    }
                    int i18 = iArr[0];
                    i15 = i18 <= 0 ? i13 : i18;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && F3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && F3((TL_iv.PageBlock) ic.a.g(1, arrayList))) {
                a1.g.A(1, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e4(int i10) {
        f2 f2Var;
        int i11;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        int length;
        int x9;
        int e;
        int length2;
        int x10;
        int e10;
        int length3;
        int x11;
        int e11;
        f2 f2Var2;
        int i13;
        j3 j3Var = this.v3;
        if (j3Var != null && j3Var.x()) {
            boolean R3 = R3();
            t3 t3Var = this.p3;
            int i14 = 0;
            if (R3) {
                int i15 = j3Var.p0;
                int i16 = j3Var.q0;
                int i17 = j3Var.t0;
                int i18 = j3Var.r0;
                int i19 = j3Var.u0;
                boolean Q3 = Q3(i10, i15, i16, i18, i17, i19);
                int C2 = !Q3 ? C2(i10) : 0;
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                this.Q3 = true;
                int i20 = i16;
                boolean z11 = false;
                while (i20 <= i17) {
                    g1 T4 = T4(i15, i20);
                    if (T4 == null) {
                        i13 = i16;
                    } else {
                        int length4 = T4.length();
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
                            if (Q3) {
                                T4.removeStyle(i10, max, max2);
                            } else {
                                if (C2 != 0) {
                                    T4.removeStyle(C2, max, max2);
                                }
                                T4.addStyle(i10, max, max2);
                            }
                            T4.invalidateEffects();
                            T4.requestLayout();
                            m4(i15, i20);
                            z11 = true;
                        }
                    }
                    i20++;
                    i16 = i13;
                }
                this.Q3 = false;
                if (z11 && (f2Var2 = this.R3) != null) {
                    f2Var2.h();
                }
                t3Var.n();
                if (z11) {
                    u4();
                }
            } else if (E3()) {
                int i24 = j3Var.p0;
                g1 O2 = O2(i24);
                if (O2 != null && (x11 = ic.a.x(j3Var.r0, j3Var.u0, (length3 = O2.length()), 0)) < (e11 = ic.a.e(j3Var.r0, j3Var.u0, length3, 0))) {
                    boolean z12 = (O2.getCurrentStyle(x11, e11) & i10) == 0;
                    f2 f2Var4 = this.R3;
                    if (f2Var4 != null) {
                        f2Var4.d();
                    }
                    this.Q3 = true;
                    if (z12) {
                        int C22 = C2(i10);
                        if (C22 != 0) {
                            O2.removeStyle(C22, x11, e11);
                        }
                        O2.addStyle(i10, x11, e11);
                    } else {
                        O2.removeStyle(i10, x11, e11);
                    }
                    this.Q3 = false;
                    k4(i24);
                    O2.invalidateEffects();
                    O2.requestLayout();
                    f2 f2Var5 = this.R3;
                    if (f2Var5 != null) {
                        f2Var5.h();
                    }
                    t3Var.n();
                    u4();
                }
            } else if (C3()) {
                int i25 = j3Var.p0;
                g1 y22 = y2(i25);
                if (y22 != null && (x10 = ic.a.x(j3Var.r0, j3Var.u0, (length2 = y22.length()), 0)) < (e10 = ic.a.e(j3Var.r0, j3Var.u0, length2, 0))) {
                    boolean z13 = (y22.getCurrentStyle(x10, e10) & i10) == 0;
                    int C23 = z13 ? C2(i10) : 0;
                    f2 f2Var6 = this.R3;
                    if (f2Var6 != null) {
                        f2Var6.d();
                    }
                    this.Q3 = true;
                    if (z13) {
                        if (C23 != 0) {
                            y22.removeStyle(C23, x10, e10);
                        }
                        y22.addStyle(i10, x10, e10);
                    } else {
                        y22.removeStyle(i10, x10, e10);
                    }
                    y22.invalidateEffects();
                    y22.requestLayout();
                    j4(i25);
                    this.Q3 = false;
                    f2 f2Var7 = this.R3;
                    if (f2Var7 != null) {
                        f2Var7.h();
                    }
                    t3Var.n();
                    u4();
                }
            } else if (M3()) {
                int i26 = j3Var.p0;
                g1 p42 = p4(i26);
                if (p42 != null && (x9 = ic.a.x(j3Var.r0, j3Var.u0, (length = p42.length()), 0)) < (e = ic.a.e(j3Var.r0, j3Var.u0, length, 0))) {
                    boolean z14 = (p42.getCurrentStyle(x9, e) & i10) == 0;
                    int C24 = z14 ? C2(i10) : 0;
                    f2 f2Var8 = this.R3;
                    if (f2Var8 != null) {
                        f2Var8.d();
                    }
                    this.Q3 = true;
                    if (z14) {
                        if (C24 != 0) {
                            p42.removeStyle(C24, x9, e);
                        }
                        p42.addStyle(i10, x9, e);
                    } else {
                        p42.removeStyle(i10, x9, e);
                    }
                    p42.invalidateEffects();
                    p42.requestLayout();
                    l4(i26);
                    this.Q3 = false;
                    f2 f2Var9 = this.R3;
                    if (f2Var9 != null) {
                        f2Var9.h();
                    }
                    t3Var.n();
                    u4();
                }
            } else {
                int i27 = j3Var.p0;
                int i28 = j3Var.s0;
                int i29 = j3Var.r0;
                int i30 = j3Var.u0;
                if (i27 >= 0 && i28 >= 0 && i28 >= i27 && i28 < this.x4.size()) {
                    int i31 = i10;
                    boolean P3 = P3(i31, i27, i29, i28, i30);
                    boolean z15 = !P3;
                    int C25 = !P3 ? C2(i31) : 0;
                    f2 f2Var10 = this.R3;
                    if (f2Var10 != null) {
                        f2Var10.d();
                    }
                    this.Q3 = true;
                    int i32 = i27;
                    boolean z16 = false;
                    while (i32 <= i28) {
                        a E4 = E4(i32);
                        if (E4 != null) {
                            TL_iv.PageBlock pageBlock = E4.b;
                            if (G3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int o22 = o2(i32);
                                int i33 = i32 == i27 ? i29 : i14;
                                z10 = z16;
                                int i34 = i32 == i28 ? i30 : o22;
                                int max3 = Math.max(i14, Math.min(i33, o22));
                                int max4 = Math.max(i14, Math.min(i34, o22));
                                if (max3 >= max4) {
                                    i11 = C25;
                                    z16 = z10;
                                    i32++;
                                    i31 = i10;
                                    C25 = i11;
                                    i14 = 0;
                                } else {
                                    d6 A2 = A2(i32);
                                    if (A2 != null) {
                                        org.telegram.ui.ActionBar.b5 styleDelegate = A2.getStyleDelegate();
                                        if (P3) {
                                            styleDelegate.removeStyle(i31, max3, max4);
                                        } else {
                                            if (C25 != 0) {
                                                styleDelegate.removeStyle(C25, max3, max4);
                                            }
                                            styleDelegate.addStyle(i31, max3, max4);
                                        }
                                        A2.getEditText().invalidateEffects();
                                        A2.getEditText().requestLayout();
                                        A2.w();
                                        i11 = C25;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(d6.z(E4.b));
                                        if (P3 || C25 == 0) {
                                            i11 = C25;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i12 = max3;
                                        } else {
                                            i11 = C25;
                                            i12 = max3;
                                            f6.o(spannableStringBuilder2, i12, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        f6.o(spannableStringBuilder, i12, max4, i31, z15, null);
                                        d6.d(E4.b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i32++;
                                    i31 = i10;
                                    C25 = i11;
                                    i14 = 0;
                                }
                            }
                        }
                        i11 = C25;
                        z10 = z16;
                        z16 = z10;
                        i32++;
                        i31 = i10;
                        C25 = i11;
                        i14 = 0;
                    }
                    boolean z17 = z16;
                    this.Q3 = i14;
                    if (z17 && (f2Var = this.R3) != null) {
                        f2Var.h();
                    }
                    t3Var.n();
                    if (z17) {
                        u4();
                    }
                }
            }
        }
    }

    public final void e5(float f7, float f10) {
        TL_iv.pageTableCell l4;
        p5 p5Var = this.q4;
        if (!this.J3 || p5Var == null || this.F3 != p5Var || (l4 = p5Var.l((int) ((f7 - p5Var.getLeft()) - getLeft()), (int) ((f10 - p5Var.getTop()) - getTop()))) == null || l4 == this.M3) {
            return;
        }
        this.M3 = l4;
        p5Var.v(this.L3, l4);
    }

    public final ArrayList f3() {
        return e3(0, this.t3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f4(View view) {
        g1 editText;
        g1 g1Var;
        v3 v3Var;
        u3 u3Var = null;
        if (r2()) {
            boolean R3 = R3();
            j3 j3Var = this.v3;
            if (R3) {
                int i10 = j3Var.p0;
                int i11 = j3Var.q0;
                if (i11 == j3Var.t0) {
                    editText = T4(i10, i11);
                    g1Var = editText;
                    if (g1Var != null) {
                        int length = g1Var.length();
                        v3Var = this;
                        u3Var = new u3(v3Var, g1Var, ic.a.x(j3Var.r0, j3Var.u0, length, 0), ic.a.e(j3Var.r0, j3Var.u0, length, 0), null);
                    }
                }
            } else {
                if (E3()) {
                    editText = O2(j3Var.p0);
                } else if (C3()) {
                    editText = y2(j3Var.p0);
                } else if (M3()) {
                    editText = p4(j3Var.p0);
                } else {
                    d6 M4 = M4();
                    if (M4 != null) {
                        editText = M4.getEditText();
                    }
                }
                g1Var = editText;
                if (g1Var != null) {
                }
            }
            if (u3Var == null) {
                u3(false);
                v3Var.p3.i(u3Var, view);
                return;
            }
            return;
        }
        v3Var = this;
        if (u3Var == null) {
        }
    }

    public final void f5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                pageblockpreformatted.language = str;
                d6 A2 = A2(this.t3.indexOf(aVar));
                if (A2 != null && (aVar2 = A2.x) != null) {
                    A2.I(aVar2.b, true);
                    A2.H = null;
                    A2.B();
                }
                f2 f2Var2 = this.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g2() {
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
            ArrayList arrayList6 = this.t3;
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
                    a1.g.A(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i13 = i14;
            } else {
                for (int i17 = i14; i17 < arrayList8.size(); i17++) {
                    ((Long) arrayList8.get(i17)).getClass();
                    arrayList7.add(new o0());
                }
                for (int i18 = i14; i18 < arrayList.size(); i18++) {
                    arrayList7.add((o0) arrayList.get(i18));
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
                            arrayList2.add(Long.valueOf(o0.a()));
                            arrayList3.add(Boolean.valueOf(i10 != 0 ? i19 : i11));
                            arrayList4.add(Integer.valueOf(i11));
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i21)).getClass();
                        if (i10 != 0) {
                            if (((((Long) arrayList5.get(i21)).longValue() == 0 || !K3(aVar.b)) ? i12 : i11) != 0) {
                                arrayList4.set(i21, Integer.valueOf(((Integer) arrayList4.get(i21)).intValue() + 1));
                                arrayList5.set(i21, Long.valueOf(aVar.a));
                            } else {
                                ((Integer) arrayList4.get(i21)).getClass();
                                ((Long) arrayList5.get(i21)).getClass();
                            }
                            arrayList7.add(new o0());
                        } else {
                            ((Boolean) arrayList3.get(i21)).getClass();
                            arrayList7.add(new o0());
                        }
                        i20++;
                        i14 = i11;
                        i16 = i12;
                    }
                }
                i13 = i14;
                if (D3(aVar)) {
                    boolean z10 = ((TL_iv.pageBlockDetails) aVar.b).open;
                    o0.a();
                    arrayList.add(new o0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (d6.o(aVar.b)) {
                    o0.a();
                    arrayList7.add(new o0());
                }
            }
            i15++;
            i14 = i13;
        }
    }

    public final boolean g3() {
        ArrayList arrayList = this.t3;
        a aVar = arrayList.isEmpty() ? null : (a) ic.a.g(1, arrayList);
        if (aVar != null && !K3(aVar.b) && !aVar.i && !D3(aVar) && !Q2(aVar.b)) {
            if (!(F1(aVar) instanceof d6)) {
                return false;
            }
            k3(aVar);
            return true;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.g3.O(false);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        post(new m2(this, aVar2, 21));
        return true;
    }

    public final void g4() {
        int length;
        int x9;
        int e;
        int length2;
        int x10;
        int e10;
        int length3;
        int x11;
        int e11;
        int length4;
        int x12;
        int e12;
        g1 T4;
        int length5;
        int x13;
        int e13;
        boolean R3 = R3();
        t3 t3Var = this.p3;
        j3 j3Var = this.v3;
        if (R3) {
            int i10 = j3Var.p0;
            int i11 = j3Var.q0;
            if (i11 == j3Var.t0 && (T4 = T4(i10, i11)) != null && (x13 = ic.a.x(j3Var.r0, j3Var.u0, (length5 = T4.length()), 0)) < (e13 = ic.a.e(j3Var.r0, j3Var.u0, length5, 0))) {
                if (f6.h(T4.getText(), x13, e13)) {
                    f2 f2Var = this.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    f6.n(T4.getText(), x13, e13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                if (f6.g(T4.getText(), x13, e13)) {
                    f6.m(T4.getText(), x13, e13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    f2 f2Var4 = this.R3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    u4();
                }
                T4.setSelectionOverride(x13, e13);
                u3(false);
                K4(T4);
                return;
            }
            return;
        }
        if (E3()) {
            int i12 = j3Var.p0;
            g1 O2 = O2(i12);
            if (O2 != null && (x12 = ic.a.x(j3Var.r0, j3Var.u0, (length4 = O2.length()), 0)) < (e12 = ic.a.e(j3Var.r0, j3Var.u0, length4, 0))) {
                if (f6.h(O2.getText(), x12, e12)) {
                    f2 f2Var5 = this.R3;
                    if (f2Var5 != null) {
                        f2Var5.d();
                    }
                    f6.n(O2.getText(), x12, e12);
                    O2.invalidateEffects();
                    k4(i12);
                    f2 f2Var6 = this.R3;
                    if (f2Var6 != null) {
                        f2Var6.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var7 = this.R3;
                if (f2Var7 != null) {
                    f2Var7.d();
                }
                if (f6.g(O2.getText(), x12, e12)) {
                    f6.m(O2.getText(), x12, e12);
                    O2.invalidateEffects();
                    k4(i12);
                    f2 f2Var8 = this.R3;
                    if (f2Var8 != null) {
                        f2Var8.h();
                    }
                    u4();
                }
                O2.setSelectionOverride(x12, e12);
                u3(false);
                K4(O2);
                return;
            }
            return;
        }
        if (C3()) {
            int i13 = j3Var.p0;
            g1 y22 = y2(i13);
            if (y22 != null && (x11 = ic.a.x(j3Var.r0, j3Var.u0, (length3 = y22.length()), 0)) < (e11 = ic.a.e(j3Var.r0, j3Var.u0, length3, 0))) {
                if (f6.h(y22.getText(), x11, e11)) {
                    f2 f2Var9 = this.R3;
                    if (f2Var9 != null) {
                        f2Var9.d();
                    }
                    f6.n(y22.getText(), x11, e11);
                    y22.invalidateEffects();
                    j4(i13);
                    f2 f2Var10 = this.R3;
                    if (f2Var10 != null) {
                        f2Var10.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var11 = this.R3;
                if (f2Var11 != null) {
                    f2Var11.d();
                }
                if (f6.g(y22.getText(), x11, e11)) {
                    f6.m(y22.getText(), x11, e11);
                    y22.invalidateEffects();
                    j4(i13);
                    f2 f2Var12 = this.R3;
                    if (f2Var12 != null) {
                        f2Var12.h();
                    }
                    u4();
                }
                y22.setSelectionOverride(x11, e11);
                u3(false);
                K4(y22);
                return;
            }
            return;
        }
        if (!M3()) {
            d6 M4 = M4();
            if (M4 != null && (x9 = ic.a.x(j3Var.r0, j3Var.u0, (length = M4.getEditText().length()), 0)) < (e = ic.a.e(j3Var.r0, j3Var.u0, length, 0))) {
                if (f6.h(M4.getEditText().getText(), x9, e)) {
                    f2 f2Var13 = this.R3;
                    if (f2Var13 != null) {
                        f2Var13.d();
                    }
                    f6.n(M4.getEditText().getText(), x9, e);
                    M4.getEditText().invalidateEffects();
                    M4.w();
                    f2 f2Var14 = this.R3;
                    if (f2Var14 != null) {
                        f2Var14.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var15 = this.R3;
                if (f2Var15 != null) {
                    f2Var15.d();
                }
                if (f6.g(M4.getEditText().getText(), x9, e)) {
                    f6.m(M4.getEditText().getText(), x9, e);
                    M4.getEditText().invalidateEffects();
                    M4.w();
                    f2 f2Var16 = this.R3;
                    if (f2Var16 != null) {
                        f2Var16.h();
                    }
                    u4();
                }
                M4.getEditText().setSelectionOverride(x9, e);
                u3(false);
                K4(M4.getEditText());
                return;
            }
            return;
        }
        int i14 = j3Var.p0;
        g1 p42 = p4(i14);
        if (p42 != null && (x10 = ic.a.x(j3Var.r0, j3Var.u0, (length2 = p42.length()), 0)) < (e10 = ic.a.e(j3Var.r0, j3Var.u0, length2, 0))) {
            if (f6.h(p42.getText(), x10, e10)) {
                f2 f2Var17 = this.R3;
                if (f2Var17 != null) {
                    f2Var17.d();
                }
                f6.n(p42.getText(), x10, e10);
                p42.invalidateEffects();
                l4(i14);
                f2 f2Var18 = this.R3;
                if (f2Var18 != null) {
                    f2Var18.h();
                }
                t3Var.n();
                u4();
                return;
            }
            f2 f2Var19 = this.R3;
            if (f2Var19 != null) {
                f2Var19.d();
            }
            if (f6.g(p42.getText(), x10, e10)) {
                f6.m(p42.getText(), x10, e10);
                p42.invalidateEffects();
                l4(i14);
                f2 f2Var20 = this.R3;
                if (f2Var20 != null) {
                    f2Var20.h();
                }
                u4();
            }
            p42.setSelectionOverride(x10, e10);
            u3(false);
            K4(p42);
        }
    }

    public g1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return (g1) findFocus;
        }
        return null;
    }

    public m4 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.w3;
    }

    public s9 getTextSelectionHelper() {
        return this.v3;
    }

    public final void h2(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        a aVar = new a(pageblockaudio, 0, 0);
        t tVar = new t();
        aVar.g = tVar;
        tVar.c = true;
        long j10 = document.id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z10) {
            TLRPC.Message message = messageObject.messageOwner;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            t tVar2 = aVar.g;
            tVar2.i = document;
            tVar2.e = str;
            tVar2.a = 1;
            tVar2.f = 0.0f;
        } else {
            tVar.h = document;
            tVar.i = document;
            tVar.a = 2;
            pageblockaudio.audio_id = j10;
        }
        A3(aVar);
        if (z10) {
            t tVar3 = aVar.g;
            String str2 = tVar3.e;
            IdentityHashMap identityHashMap = this.h4;
            a5 a5Var = (a5) identityHashMap.remove(tVar3);
            if (a5Var != null) {
                a5Var.b();
            }
            a5 a5Var2 = new a5(this.n3, str2, document, new g3(aVar, tVar3, this));
            identityHashMap.put(tVar3, a5Var2);
            a5Var2.d();
        }
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        this.p3.onContentChanged();
    }

    public final void h3(a aVar, boolean z10) {
        View F1 = F1(aVar);
        if (!(F1 instanceof g5)) {
            i3(aVar, z10);
            return;
        }
        g1 g1Var = ((g5) F1).r;
        g1Var.r();
        g1Var.setSelection(z10 ? g1Var.length() : 0);
    }

    public final void h4() {
        g1 editText;
        Runnable i2Var;
        int length;
        final int x9;
        final int e;
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x()) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (R3()) {
            int i12 = j3Var.p0;
            int i13 = j3Var.q0;
            if (i13 != j3Var.t0) {
                return;
            }
            editText = T4(i12, i13);
            i2Var = new n2(this, i12, i13, 1);
        } else if (E3()) {
            int i14 = j3Var.p0;
            editText = O2(i14);
            i2Var = new h2(this, i14, 3);
        } else if (C3()) {
            int i15 = j3Var.p0;
            editText = y2(i15);
            i2Var = new h2(this, i15, i11);
        } else if (M3()) {
            int i16 = j3Var.p0;
            editText = p4(i16);
            i2Var = new h2(this, i16, i10);
        } else {
            d6 M4 = M4();
            if (M4 == null) {
                return;
            }
            editText = M4.getEditText();
            i2Var = new i2(M4, i11);
        }
        final g1 g1Var = editText;
        final Runnable runnable = i2Var;
        if (g1Var != null && (x9 = ic.a.x(j3Var.r0, j3Var.u0, (length = g1Var.length()), 0)) <= (e = ic.a.e(j3Var.r0, j3Var.u0, length, 0))) {
            Editable text = g1Var.getText();
            int i17 = s.h;
            String str = null;
            if (text != null) {
                s[] sVarArr = (s[]) text.getSpans(x9, e, s.class);
                if (sVarArr.length > 0) {
                    str = sVarArr[0].a;
                }
            }
            if (str == null) {
                str = g1Var.getText().subSequence(x9, e).toString();
            }
            final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
            int i18 = y6.G6;
            u6 u6Var = this.o3;
            final int w02 = y6.w0(i18, u6Var);
            q.X(getContext(), str, new Utilities.Callback() { // from class: li.w2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    s a2;
                    String str2 = (String) obj;
                    v3 v3Var = v3.this;
                    v3Var.getClass();
                    if (TextUtils.isEmpty(str2) || (a2 = s.a(str2, w02, dp)) == null) {
                        return;
                    }
                    f2 f2Var = v3Var.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    j3 j3Var2 = v3Var.v3;
                    if (j3Var2 != null) {
                        j3Var2.f(false);
                    }
                    g1 g1Var2 = g1Var;
                    g1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(a2, 0, 1, 33);
                    Editable text2 = g1Var2.getText();
                    int max = Math.max(0, Math.min(x9, text2.length()));
                    text2.replace(max, Math.max(max, Math.min(e, text2.length())), spannableString);
                    runnable.run();
                    f2 f2Var2 = v3Var.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    v3Var.p3.onContentChanged();
                    int min = Math.min(max + 1, g1Var2.length());
                    g1Var2.r();
                    v3Var.post(new u2(g1Var2, min, 3));
                }
            }, u6Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:9)(1:(4:37|11|12|(4:14|16|17|(1:27)(4:19|(1:21)(1:26)|22|24)))(1:36))|10|11|12|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #0 {Exception -> 0x0079, blocks: (B:12:0x0046, B:14:0x006d), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h5(CharSequence charSequence) {
        String str;
        ClipboardManager clipboardManager;
        int i10;
        int i11;
        int i12;
        int i13;
        j3 j3Var = this.v3;
        a E4 = E4(j3Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(E4);
        int indexOf2 = arrayList.indexOf(E4(j3Var.s0));
        int i14 = j3Var.r0;
        int i15 = j3Var.u0;
        try {
            if (indexOf >= 0 && indexOf2 >= 0 && indexOf < arrayList.size() && indexOf2 < arrayList.size()) {
                if (indexOf > indexOf2) {
                    i13 = i15;
                    i12 = indexOf;
                    i11 = indexOf2;
                } else if (indexOf != indexOf2 || i14 <= i15) {
                    i10 = i15;
                    i11 = indexOf;
                    i12 = indexOf2;
                    i13 = i14;
                    HashMap hashMap = this.u3;
                    StringBuilder sb2 = new StringBuilder();
                    b4 b4Var = new b4(0);
                    d4.F(sb2, arrayList, new int[]{i11}, i12, i11, i12, i13, i10, b4Var, false, 0, hashMap);
                    b4Var.h(sb2);
                    str = sb2.toString();
                    if (!TextUtils.isEmpty(str)) {
                        v4.a(G2(i11, i12), F2(i11, i12));
                        clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                        if (clipboardManager != null) {
                            return;
                        }
                        clipboardManager.setPrimaryClip(str != null ? ClipData.newHtmlText("label", charSequence, str) : ClipData.newPlainText("label", charSequence));
                        return;
                    }
                } else {
                    i13 = i15;
                    i11 = indexOf;
                    i12 = indexOf2;
                }
                i10 = i14;
                HashMap hashMap2 = this.u3;
                StringBuilder sb22 = new StringBuilder();
                b4 b4Var2 = new b4(0);
                d4.F(sb22, arrayList, new int[]{i11}, i12, i11, i12, i13, i10, b4Var2, false, 0, hashMap2);
                b4Var2.h(sb22);
                str = sb22.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
            return;
        }
        str = null;
    }

    public final void i2(String str) {
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
            j2(tL_document, str);
        }
    }

    public final void i3(a aVar, boolean z10) {
        View F1 = F1(aVar);
        if (!(F1 instanceof p5)) {
            if (z10 && (F1 instanceof d6)) {
                d6 d6Var = (d6) F1;
                if (d6Var.m()) {
                    d6Var.h();
                    return;
                }
            }
            g1 X3 = X3(F1);
            if (X3 == null) {
                j3(aVar);
                return;
            }
            X3.r();
            if (z10) {
                X3.setSelection(X3.length());
                return;
            }
            return;
        }
        p5 p5Var = (p5) F1;
        g1 g1Var = p5Var.r;
        h6 h6Var = p5Var.F;
        if (h6Var == null) {
            return;
        }
        if (!z10) {
            g1Var.r();
            g1Var.setSelection(0);
        } else {
            if (h6Var.g.isEmpty()) {
                return;
            }
            s5 m10 = p5Var.v.m((TL_iv.pageTableCell) ic.a.g(1, p5Var.F.g));
            if (m10 == null) {
                return;
            }
            g1 g1Var2 = m10.a;
            g1Var2.r();
            g1Var2.setSelection(g1Var2.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        v3 v3Var;
        HashMap hashMap;
        ArrayList C4;
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
            j3 j3Var = this.v3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    C4 = C4(d4.z(str, hashMap));
                } catch (Exception e) {
                    e = e;
                    v3Var = this;
                }
                if (!C4.isEmpty()) {
                    ArrayList arrayList = this.t3;
                    v3Var = this;
                    try {
                        if (v3Var.O4(arrayList.indexOf(E4(j3Var.p0)), arrayList.indexOf(E4(j3Var.s0)), j3Var.r0, j3Var.u0, C4)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            v3Var.u3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                        coerceToText = itemAt.coerceToText(getContext());
                        if (coerceToText == null) {
                        }
                        v3Var.c2(j3Var.p0, j3Var.r0, j3Var.s0, j3Var.u0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    v3Var.c2(j3Var.p0, j3Var.r0, j3Var.s0, j3Var.u0, coerceToText.toString().split("\n", -1));
                }
            }
            v3Var = this;
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
            }
            v3Var.c2(j3Var.p0, j3Var.r0, j3Var.s0, j3Var.u0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        j3 j3Var2 = this.v3;
        if (!isEmpty) {
        }
        v3Var = this;
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        v3Var.c2(j3Var2.p0, j3Var2.r0, j3Var2.s0, j3Var2.u0, coerceToText.toString().split("\n", -1));
    }

    public final void j2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        a aVar = new a(pageblockdocument, 0, 0);
        t tVar = new t();
        aVar.g = tVar;
        tVar.d = true;
        long j10 = document.id;
        boolean z10 = j10 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (!z10) {
            tVar.h = document;
            tVar.a = 2;
            pageblockdocument.document_id = j10;
        } else {
            if (TextUtils.isEmpty(str) || !b10.t(str)) {
                return;
            }
            t tVar2 = aVar.g;
            tVar2.h = document;
            tVar2.e = str;
            tVar2.a = 1;
            tVar2.f = 0.0f;
        }
        A3(aVar);
        if (z10) {
            t tVar3 = aVar.g;
            IdentityHashMap identityHashMap = this.h4;
            a5 a5Var = (a5) identityHashMap.remove(tVar3);
            if (a5Var != null) {
                a5Var.b();
            }
            a5 a5Var2 = new a5(this.n3, str, document, new f3(this, tVar3, aVar, str));
            identityHashMap.put(tVar3, a5Var2);
            a5Var2.d();
        }
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        this.p3.onContentChanged();
    }

    public final void j3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            ((d6) F1).A();
        } else if (F1 instanceof s0) {
            ((s0) F1).d.r();
        }
    }

    public final void j4(int i10) {
        KeyEvent.Callback G4 = G4(i10);
        if (G4 instanceof k0) {
            ((k0) G4).b();
        }
    }

    public final void k2(Uri uri) {
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
        } catch (Exception e) {
            FileLog.e(e);
        }
        String str2 = str;
        boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        int i10 = this.z4;
        this.z4 = i10 - 1;
        Utilities.globalQueue.postRunnable(new p2(this, uri, startsWith, str2, i10, aVar));
    }

    public final void k3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            d6 d6Var = (d6) F1;
            d6Var.A();
            g1 editText = d6Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (F1 instanceof s0) {
            s0 s0Var = (s0) F1;
            s0Var.d.r();
            g1 editText2 = s0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void k4(int i10) {
        a E4 = E4(i10);
        g1 O2 = O2(i10);
        if (!D3(E4) || O2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) E4.b).title = f6.f(O2.getText());
    }

    public final void l2(MediaController.PhotoEntry photoEntry) {
        v3 v3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        boolean c10 = w4.c(photoEntry);
        a aVar = new a((photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.g = Z3(photoEntry, str2);
        A3(aVar);
        if (c10) {
            Q4(aVar, aVar.g, photoEntry);
            v3Var = this;
        } else {
            v3Var = this;
            v3Var.R4(aVar, aVar.g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        v3Var.p3.onContentChanged();
    }

    public final void l3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            d6 d6Var = (d6) F1;
            d6Var.A();
            d6Var.getEditText().setSelection(0);
        } else if (F1 instanceof s0) {
            s0 s0Var = (s0) F1;
            s0Var.d.r();
            s0Var.getEditText().setSelection(0);
        }
    }

    public final void l4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof d6) {
            ((d6) G4).v();
        }
    }

    public final void m2(p5 p5Var) {
        p5 p5Var2 = this.q4;
        if (p5Var2 != null && p5Var2 != p5Var) {
            LinkedHashSet linkedHashSet = p5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var2.v.invalidate();
                p5Var2.s();
            }
        }
        this.q4 = p5Var;
        this.K3 = false;
        this.t4 = -1;
        this.s4 = -1;
        p5Var.setCellSelectionListener(this.u4);
        j3 j3Var = this.v3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void m4(int i10, int i11) {
        s5 m10;
        View G4 = G4(i10);
        if (G4 instanceof p5) {
            p5 p5Var = (p5) G4;
            if (i11 == 0) {
                p5Var.t();
                return;
            }
            TL_iv.pageTableCell g7 = p5Var.g(i11);
            if (g7 == null || (m10 = p5Var.getGrid().m(g7)) == null) {
                return;
            }
            h6.d(g7, m10.a.getText());
        }
    }

    public final m3 n2() {
        int i10;
        int i11;
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x() || M3()) {
            return null;
        }
        a E4 = E4(j3Var.p0);
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(E4);
        int indexOf2 = arrayList.indexOf(E4(j3Var.s0));
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
            if (aVar.i || D3(aVar)) {
                return null;
            }
        }
        return new m3(this, i10, i11, j3Var.r0, j3Var.u0);
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
    public final boolean n3(KeyEvent keyEvent) {
        int i10;
        boolean z10;
        boolean z11;
        View findFocus;
        p5 a32;
        int i11;
        p5 p5Var;
        g5 g5Var;
        a aVar;
        int indexOf;
        boolean z12;
        g1 X3;
        Layout layout;
        boolean z13;
        Layout layout2;
        int i12;
        final float primaryHorizontal;
        a a42;
        int i13;
        int i14;
        int i15;
        int o42;
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
        a W2;
        int indexOf2;
        boolean z14;
        int i26;
        int i27;
        int unicodeChar;
        boolean z15;
        f2 f2Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        j3 j3Var = this.v3;
        boolean x9 = j3Var.x();
        if (isCtrlPressed && !isAltPressed && (f2Var = this.R3) != null) {
            if (keyCode == 54 && !isShiftPressed) {
                f2Var.k();
                return true;
            }
            if ((keyCode == 54 && isShiftPressed) || keyCode == 53) {
                f2Var.i();
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
                g4();
                return true;
            }
            if (i28 != 0) {
                e4(i28);
                return true;
            }
        }
        if (keyCode == 111 && x9) {
            j3Var.f(false);
            return true;
        }
        if (x9) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence r6 = j3Var.r();
                if (r6 == null || r6.length() == 0) {
                    return true;
                }
                h5(r6);
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence r10 = j3Var.r();
                if (r10 != null && r10.length() > 0) {
                    h5(r10);
                }
                K2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                i4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                K2();
                return true;
            }
            if (keyCode == 66) {
                z4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                z4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList = this.t3;
        if (!x9 && isShiftPressed && B3(keyCode) && (W2 = W2()) != null && (indexOf2 = arrayList.indexOf(W2)) >= 0) {
            View F1 = F1(W2);
            if (F1 instanceof d6) {
                d6 d6Var = (d6) F1;
                g1 editText = d6Var.getEditText();
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
                                        j3Var.X(i27, d6.y(((a) arrayList.get(i27)).b));
                                    }
                                    if (length2 != 0) {
                                        int max2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z14) {
                                            if (max2 >= length2) {
                                                length2--;
                                            }
                                            if (j3Var.j0(d6Var, 0, max2, length2)) {
                                                KeyEvent.Callback F12 = F1(aVar2);
                                                if (F12 instanceof r9) {
                                                    j3Var.b0(0, 0, (r9) F12);
                                                    break;
                                                } else {
                                                    v0(i26);
                                                    post(new m2(this, aVar2, 14));
                                                    break;
                                                }
                                            }
                                        } else if (j3Var.j0(d6Var, 0, max2, max2 > 0 ? 0 : 1)) {
                                            KeyEvent.Callback F13 = F1(aVar2);
                                            if (F13 instanceof r9) {
                                                j3Var.b0(0, F13 instanceof d6 ? ((d6) F13).getEditText().length() : 0, (r9) F13);
                                                break;
                                            } else {
                                                v0(i26);
                                                post(new m2(this, aVar2, 15));
                                                break;
                                            }
                                        }
                                    }
                                    if (!x9 && isShiftPressed && B3(keyCode)) {
                                        int i29 = (isCtrlPressed || isAltPressed) ? i10 : 0;
                                        int i30 = j3Var.B0;
                                        int i31 = j3Var.D0;
                                        int i32 = j3Var.C0;
                                        int i33 = j3Var.p0;
                                        int i34 = j3Var.q0;
                                        int i35 = j3Var.r0;
                                        int i36 = j3Var.s0;
                                        int i37 = i29;
                                        int i38 = j3Var.t0;
                                        int i39 = j3Var.u0;
                                        if (i30 == i33 && i31 == i34 && i32 == i35) {
                                            i33 = i36;
                                            i34 = i38;
                                        } else {
                                            i39 = i35;
                                        }
                                        View G4 = G4(i33);
                                        if (G4 != null) {
                                            if (G4 instanceof p5) {
                                                p5 p5Var2 = (p5) G4;
                                                h6 model = p5Var2.getModel();
                                                if (model != null) {
                                                    ArrayList arrayList2 = model.g;
                                                    if (!arrayList2.isEmpty()) {
                                                        int size = arrayList2.size() + 1;
                                                        int i40 = (i34 < 0 || i34 >= size) ? 0 : i34;
                                                        g1 k10 = p5Var2.k(i40);
                                                        if (k10 != null) {
                                                            Layout layout4 = k10.getLayout();
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
                                                                            length = o4(i22);
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
                                                                                    g1 k11 = p5Var2.k(i21);
                                                                                    Layout layout5 = k11 != null ? k11.getLayout() : null;
                                                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                                                } else {
                                                                                    length = p5Var2.getTitleEditText().length();
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
                                                                                int max3 = Math.max(1, h6.o(pagetablecell2)) + b11;
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
                                                                            g1 k12 = p5Var2.k(i46);
                                                                            Layout layout6 = k12 != null ? k12.getLayout() : null;
                                                                            length = layout6 != null ? layout6.getText().length() : 0;
                                                                            i34 = i46;
                                                                            i22 = i33;
                                                                            break;
                                                                        } else {
                                                                            int i47 = i33 - 1;
                                                                            if (i47 >= 0) {
                                                                                i22 = i47;
                                                                                length = o4(i47);
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
                                                if (G4 instanceof d6) {
                                                    Layout layout7 = ((d6) G4).getEditText().getLayout();
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
                                                                        o42 = o4(i15);
                                                                        int i49 = o42;
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
                                                                    i14 = o4(i16);
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
                                                    if ((G4 instanceof w0) || (G4 instanceof u4) || (G4 instanceof y) || (G4 instanceof o4) || (G4 instanceof q4)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i15 = i33 - 1;
                                                                if (i15 >= 0) {
                                                                    o42 = o4(i15);
                                                                    int i492 = o42;
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
                                                KeyEvent.Callback G42 = G4(i18);
                                                if (G42 instanceof r9) {
                                                    b02 = j3Var.b0(i19, i17, (r9) G42);
                                                    break;
                                                } else {
                                                    post(new fi.b0(this, i18, i19, i17, 1));
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
                                    if (!x9 && !isShiftPressed && !z10 && !z11 && B3(keyCode)) {
                                        boolean z16 = keyCode == 22 || keyCode == 20;
                                        this.x3 = z16 ? j3Var.s0 : j3Var.p0;
                                        this.y3 = z16 ? j3Var.u0 : j3Var.r0;
                                        this.z3 = z16 ? j3Var.t0 : j3Var.q0;
                                        j3Var.f(false);
                                        break;
                                    } else if (z10 || keyCode != 29 || (!j3Var.a0() && !Y4())) {
                                        if (!x9 && !isShiftPressed && !z10 && !z11 && (keyCode == 20 || keyCode == 19)) {
                                            boolean z17 = keyCode != 20;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 >= getChildCount()) {
                                                    View childAt = getChildAt(i11);
                                                    if (childAt instanceof p5) {
                                                        p5Var = (p5) childAt;
                                                        if (p5Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i11++;
                                                } else {
                                                    p5Var = null;
                                                }
                                            }
                                            k71 k71Var = this.g3;
                                            if (p5Var == null) {
                                                int indexOf3 = arrayList.indexOf(p5Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (!z17) {
                                                        int Z2 = Z2(indexOf3 - 1, -1);
                                                        if (Z2 >= 0) {
                                                            post(new m2(this, (a) arrayList.get(Z2), 5));
                                                        }
                                                    } else if (!p5Var.q()) {
                                                        int Z22 = Z2(indexOf3 + 1, 1);
                                                        if (Z22 < 0) {
                                                            a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                            arrayList.add(aVar3);
                                                            k71Var.O(false);
                                                            post(new m2(this, aVar3, 2));
                                                        } else {
                                                            post(new m2(this, (a) arrayList.get(Z22), 4));
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
                                                        if (childAt2 instanceof g5) {
                                                            g5Var = (g5) childAt2;
                                                            if (g5Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i52++;
                                                    } else {
                                                        g5Var = null;
                                                    }
                                                }
                                                if (g5Var != null) {
                                                    g1 g1Var = g5Var.r;
                                                    int indexOf4 = this.x4.indexOf(g5Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = g1Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(g1Var.getSelectionEnd()) : 0;
                                                        if (z17) {
                                                            if (layout8 != null) {
                                                                i13 = 1;
                                                                break;
                                                            } else {
                                                                i13 = 1;
                                                            }
                                                            a a43 = a4(indexOf4 + i13, i13);
                                                            if (a43 == null) {
                                                                a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(aVar4);
                                                                k71Var.O(false);
                                                                post(new m2(this, aVar4, 6));
                                                            } else {
                                                                post(new m2(this, a43, 7));
                                                            }
                                                            z13 = true;
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (a42 = a4(indexOf4 - 1, -1)) != null) {
                                                            post(new m2(this, a42, 8));
                                                            z13 = true;
                                                        }
                                                    }
                                                    z13 = false;
                                                } else {
                                                    int i53 = 0;
                                                    while (true) {
                                                        if (i53 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i53);
                                                            if (childAt3 instanceof d6) {
                                                                d6 d6Var2 = (d6) childAt3;
                                                                if (d6Var2.getEditText().isFocused() || (d6Var2.m() && d6Var2.h.isFocused())) {
                                                                }
                                                                i53++;
                                                            } else if (childAt3 instanceof k0) {
                                                                k0 k0Var = (k0) childAt3;
                                                                if (k0Var.getCaptionEditText().isFocused()) {
                                                                    aVar = k0Var.getRow();
                                                                } else {
                                                                    i53++;
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
                                                                i53++;
                                                            }
                                                        } else {
                                                            aVar = null;
                                                        }
                                                    }
                                                    if (aVar != null && (indexOf = arrayList.indexOf(aVar)) >= 0) {
                                                        View F14 = F1(aVar);
                                                        boolean z18 = F14 instanceof d6;
                                                        if (z18) {
                                                            final d6 d6Var3 = (d6) F14;
                                                            g1 g1Var2 = d6Var3.f;
                                                            g1 g1Var3 = d6Var3.h;
                                                            if (d6Var3.m()) {
                                                                if (!z17 || g1Var3.isFocused()) {
                                                                    z12 = z17;
                                                                    if (!z12 && g1Var3.isFocused() && ((layout2 = d6Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(d6Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout9 = g1Var3.getLayout();
                                                                        final float primaryHorizontal2 = layout9 == null ? 0.0f : layout9.getPrimaryHorizontal(Math.max(0, Math.min(g1Var3.getSelectionEnd(), g1Var3.length())));
                                                                        g1Var2.r();
                                                                        final int i54 = 0;
                                                                        g1Var2.post(new Runnable() { // from class: li.t5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                switch (i54) {
                                                                                    case 0:
                                                                                        g1 g1Var4 = d6Var3.f;
                                                                                        Layout layout10 = g1Var4.getLayout();
                                                                                        int length5 = g1Var4.length();
                                                                                        if (layout10 != null) {
                                                                                            length5 = layout10.getOffsetForHorizontal(Math.max(0, layout10.getLineCount() - 1), primaryHorizontal2);
                                                                                        }
                                                                                        g1Var4.setSelection(Math.max(0, Math.min(length5, g1Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        g1 g1Var5 = d6Var3.h;
                                                                                        Layout layout11 = g1Var5.getLayout();
                                                                                        int length6 = g1Var5.length();
                                                                                        if (layout11 != null) {
                                                                                            length6 = layout11.getOffsetForHorizontal(0, primaryHorizontal2);
                                                                                        }
                                                                                        g1Var5.setSelection(Math.max(0, Math.min(length6, g1Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        z13 = true;
                                                                    }
                                                                    if (z18) {
                                                                        X3 = X3(F14);
                                                                    } else {
                                                                        d6 d6Var4 = (d6) F14;
                                                                        X3 = (d6Var4.m() && d6Var4.h.isFocused()) ? d6Var4.getAuthorEditText() : d6Var4.getEditText();
                                                                    }
                                                                    if (X3 != null && (layout = X3.getLayout()) != null) {
                                                                        int lineForOffset6 = layout.getLineForOffset(X3.getSelectionEnd());
                                                                        if (z12) {
                                                                            if (lineForOffset6 <= 0) {
                                                                                a b22 = b2(aVar, -1);
                                                                                if (b22 != null) {
                                                                                    post(new m2(this, b22, 13));
                                                                                } else {
                                                                                    int Z23 = Z2(indexOf - 1, -1);
                                                                                    if (Z23 >= 0) {
                                                                                        post(new m2(this, (a) arrayList.get(Z23), 3));
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                            a b23 = b2(aVar, 1);
                                                                            if (b23 != null) {
                                                                                post(new m2(this, b23, 10));
                                                                                z13 = true;
                                                                                break;
                                                                            } else {
                                                                                int Z24 = Z2(indexOf + 1, 1);
                                                                                if (Z24 < 0) {
                                                                                    a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                    arrayList.add(aVar5);
                                                                                    k71Var.O(false);
                                                                                    post(new m2(this, aVar5, 11));
                                                                                } else {
                                                                                    post(new m2(this, (a) arrayList.get(Z24), 12));
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    Layout layout10 = d6Var3.getEditText().getLayout();
                                                                    if (layout10 != null) {
                                                                        z12 = z17;
                                                                        break;
                                                                    }
                                                                    Layout layout11 = g1Var2.getLayout();
                                                                    if (layout11 == null) {
                                                                        i12 = 0;
                                                                        primaryHorizontal = 0.0f;
                                                                    } else {
                                                                        i12 = 0;
                                                                        primaryHorizontal = layout11.getPrimaryHorizontal(Math.max(0, Math.min(g1Var2.getSelectionEnd(), g1Var2.length())));
                                                                    }
                                                                    if (g1Var3.getVisibility() != 0) {
                                                                        g1Var3.setVisibility(i12);
                                                                        d6Var3.requestLayout();
                                                                    }
                                                                    g1Var3.r();
                                                                    final int i55 = 1;
                                                                    g1Var3.post(new Runnable() { // from class: li.t5
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i55) {
                                                                                case 0:
                                                                                    g1 g1Var4 = d6Var3.f;
                                                                                    Layout layout102 = g1Var4.getLayout();
                                                                                    int length5 = g1Var4.length();
                                                                                    if (layout102 != null) {
                                                                                        length5 = layout102.getOffsetForHorizontal(Math.max(0, layout102.getLineCount() - 1), primaryHorizontal);
                                                                                    }
                                                                                    g1Var4.setSelection(Math.max(0, Math.min(length5, g1Var4.length())));
                                                                                    break;
                                                                                default:
                                                                                    g1 g1Var5 = d6Var3.h;
                                                                                    Layout layout112 = g1Var5.getLayout();
                                                                                    int length6 = g1Var5.length();
                                                                                    if (layout112 != null) {
                                                                                        length6 = layout112.getOffsetForHorizontal(0, primaryHorizontal);
                                                                                    }
                                                                                    g1Var5.setSelection(Math.max(0, Math.min(length6, g1Var5.length())));
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
                                                        if (X3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(X3.getSelectionEnd());
                                                            if (z12) {
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                }
                                            }
                                        }
                                        if (!x9 && !z10 && !z11 && keyCode == 61) {
                                            findFocus = findFocus();
                                            if (findFocus instanceof g1) {
                                                if ((a32 = a3((r3 = (g1) findFocus))) != null) {
                                                    if (findFocus != a32.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode != 61 && x9) {
                                            int i56 = j3Var.p0;
                                            int i57 = j3Var.s0;
                                            if (i56 >= 0 && i57 >= i56) {
                                                if (i56 == i57) {
                                                    a E4 = E4(i56);
                                                    if (E4 != null) {
                                                        c4(E4, isShiftPressed);
                                                        break;
                                                    }
                                                } else {
                                                    int indexOf5 = arrayList.indexOf(E4(i56));
                                                    int indexOf6 = arrayList.indexOf(E4(i57));
                                                    if (indexOf5 >= 0 && indexOf6 >= indexOf5) {
                                                        s4(indexOf5, indexOf6, isShiftPressed);
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
                                    if (!x9) {
                                    }
                                    z10 = isCtrlPressed;
                                    z11 = isAltPressed;
                                    if (!x9) {
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    if (!x9) {
                                        if (keyCode != 20) {
                                        }
                                        i11 = 0;
                                        while (true) {
                                            if (i11 >= getChildCount()) {
                                            }
                                            i11++;
                                        }
                                        k71 k71Var2 = this.g3;
                                        if (p5Var == null) {
                                        }
                                    }
                                    if (!x9) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof g1) && (a32 = a3((r3 = (g1) findFocus))) != null) {
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
        if (!x9) {
        }
        z10 = isCtrlPressed;
        z11 = isAltPressed;
        if (!x9) {
        }
        if (z10) {
        }
        if (!x9) {
        }
        if (!x9) {
        }
        if (keyCode != 61) {
        }
        return false;
    }

    public final int o2(int i10) {
        g1 O2 = O2(i10);
        if (O2 != null) {
            return O2.length();
        }
        d6 A2 = A2(i10);
        if (A2 != null) {
            return A2.getEditText().length();
        }
        a E4 = E4(i10);
        if (E4 == null) {
            return 0;
        }
        return d6.y(E4.b).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o3(MotionEvent motionEvent) {
        boolean z10;
        a row;
        int i10;
        p5 p5Var;
        int action = motionEvent.getAction();
        j3 j3Var = this.v3;
        View view = null;
        if (action == 0) {
            this.D3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.E3 = y3;
            this.H3 = false;
            this.I3 = false;
            int i11 = (int) this.D3;
            int top = ((int) y3) - getTop();
            p5 p5Var2 = this.q4;
            if (p5Var2 == null) {
                p5Var2 = X2();
            }
            if (p5Var2 != null && p5Var2.getParent() == this) {
                int left = i11 - p5Var2.getLeft();
                int top2 = top - p5Var2.getTop();
                if (p5Var2.o(left, top2) >= 0 || p5Var2.m(left, top2) >= 0) {
                    view = p5Var2;
                    this.F3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z10 = j3Var.x() && eventTime - this.N3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.D3 - this.O3) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.E3 - this.P3) <= ((float) AndroidUtilities.dp(24.0f));
                    this.N3 = eventTime;
                    float f7 = this.D3;
                    this.O3 = f7;
                    float f10 = this.E3;
                    this.P3 = f10;
                    if (!z10 && Z4(this.F3, f7, f10)) {
                        this.I3 = true;
                        this.N3 = 0L;
                        org.telegram.ui.Cells.g gVar = j3Var.m0;
                        if (!j3Var.x()) {
                            return true;
                        }
                        j3Var.i = false;
                        j3Var.R = false;
                        j3Var.k = false;
                        ea eaVar = j3Var.C;
                        if (eaVar != null) {
                            eaVar.invalidate();
                        }
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
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
            this.F3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (j3Var.x()) {
            }
            this.N3 = eventTime2;
            float f72 = this.D3;
            this.O3 = f72;
            float f102 = this.E3;
            this.P3 = f102;
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
                    e5(motionEvent.getX(), motionEvent.getY());
                    p5 p5Var3 = this.q4;
                    if (this.J3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.J3 = false;
                    this.L3 = null;
                    this.M3 = null;
                    this.K3 = p5Var3 != null && p5Var3.getSelectedCells().size() > 1;
                    if (p5Var3 != null && !p5Var3.H.isEmpty()) {
                        L4(p5Var3);
                    }
                    this.F3 = null;
                    this.I3 = false;
                    return true;
                }
                if (!this.H3 && !this.I3) {
                    View view2 = this.F3;
                    if (view2 instanceof p5) {
                        if (p3((p5) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.F3 = null;
                            this.I3 = false;
                            return false;
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (p5Var = this.q4) != null) {
                    View view3 = this.F3;
                    if (view3 == p5Var) {
                        p5 p5Var4 = (p5) view3;
                        TL_iv.pageTableCell l4 = p5Var4.l((int) ((motionEvent.getX() - p5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - p5Var4.getTop()) - getTop()));
                        if (l4 != null) {
                            if (this.s4 >= 0 || this.t4 >= 0) {
                                S2();
                            } else {
                                LinkedHashSet linkedHashSet = p5Var4.H;
                                if (!linkedHashSet.remove(l4)) {
                                    linkedHashSet.add(l4);
                                }
                                p5Var4.v.invalidate();
                                p5Var4.s();
                            }
                        }
                    } else if (view3 != null) {
                        S2();
                    }
                }
                boolean z11 = this.H3;
                k71 k71Var = this.g3;
                ArrayList arrayList = this.t3;
                if (!z11 && !this.I3 && this.F3 == null && !j3Var.x() && this.q4 == null) {
                    float x9 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x9 >= getLeft() && x9 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i13).getBottom() + getTop());
                        }
                        int C = org.telegram.messenger.t.C(60.0f, view4.getHeight(), Math.max(Math.max(this.Y3, this.W3), this.X3));
                        if (y10 >= paddingTop && y10 <= C) {
                            a aVar = arrayList.isEmpty() ? null : (a) ic.a.g(1, arrayList);
                            if (aVar == null || !aVar.k.isEmpty() || K3(aVar.b) || aVar.i || D3(aVar) || Q2(aVar.b)) {
                                f2 f2Var = this.R3;
                                if (f2Var != null) {
                                    f2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                k71Var.O(false);
                                f2 f2Var2 = this.R3;
                                if (f2Var2 != null) {
                                    f2Var2.h();
                                }
                                post(new m2(this, aVar2, 19));
                            } else {
                                k3(aVar);
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && this.F3 == null && !j3Var.x() && this.q4 == null) {
                    float x10 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.Z3 && x10 >= getLeft() && x10 <= getRight()) {
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
                            if (y11 >= AndroidUtilities.dp(60.0f) + getTop() && y11 <= i10) {
                                a aVar3 = arrayList.isEmpty() ? null : (a) arrayList.get(0);
                                if (aVar3 == null || K3(aVar3.b) || aVar3.i || D3(aVar3) || Q2(aVar3.b)) {
                                    f2 f2Var3 = this.R3;
                                    if (f2Var3 != null) {
                                        f2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    k71Var.O(false);
                                    f2 f2Var4 = this.R3;
                                    if (f2Var4 != null) {
                                        f2Var4.h();
                                    }
                                    post(new m2(this, aVar4, 16));
                                } else {
                                    l3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.H3 && !this.I3 && (this.F3 instanceof q4) && !j3Var.x() && this.q4 == null && (row = ((q4) this.F3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        q.X(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new s2(0, this, pageblockmath), this.o3);
                    }
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
            if (action == 2) {
                if (this.J3 && this.F3 == this.q4) {
                    e5(motionEvent.getX(), motionEvent.getY());
                    this.H3 = true;
                    return true;
                }
                float x11 = motionEvent.getX() - this.D3;
                float y12 = motionEvent.getY() - this.E3;
                if ((y12 * y12) + (x11 * x11) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
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
                    S2();
                }
                this.F3 = null;
                this.I3 = false;
                return false;
            }
        }
        return false;
    }

    public final int o4(int i10) {
        Layout layout;
        View G4 = G4(i10);
        if (!(G4 instanceof d6) || (layout = ((d6) G4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.U3);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.U3);
        this.i3 = false;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = this.S3;
        boolean z11 = i15 > 0 && i14 < i15;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View findFocus = findFocus();
            View F = findFocus == null ? null : F(findFocus);
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new h2(this, dp, 2));
                }
            }
        }
        this.S3 = i14;
    }

    public final TL_iv.RichMessage p2() {
        if (!q3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> f32 = f3();
        if (f32.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = f32;
        richMessage.photos = H2();
        richMessage.documents = E2();
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
    public final boolean p3(p5 p5Var, int i10, int i11) {
        h6 h6Var;
        h6 h6Var2;
        int o10 = p5Var.o(i10, i11);
        LinkedHashSet linkedHashSet = p5Var.H;
        r5 r5Var = p5Var.v;
        if (o10 >= 0) {
            int r6 = (r5Var.v() && o10 == r5Var.k()) ? r5Var.r() : o10;
            if (p5Var == this.q4 && (h6Var2 = p5Var.F) != null && o10 >= 0 && r6 >= o10 && r6 < h6Var2.b && !linkedHashSet.isEmpty()) {
                int i12 = o10;
                loop0: while (i12 <= r6) {
                    int i13 = 0;
                    while (true) {
                        h6 h6Var3 = p5Var.F;
                        if (i13 < h6Var3.c) {
                            if (!linkedHashSet.contains(h6Var3.d[i12][i13])) {
                                break loop0;
                            }
                            i13++;
                        }
                    }
                }
                L4(p5Var);
                return true;
            }
            m2(p5Var);
            h6 h6Var4 = p5Var.F;
            if (h6Var4 != null && o10 >= 0 && r6 >= o10 && r6 < h6Var4.b) {
                linkedHashSet.clear();
                for (int i14 = o10; i14 <= r6; i14++) {
                    int i15 = 0;
                    while (true) {
                        h6 h6Var5 = p5Var.F;
                        if (i15 < h6Var5.c) {
                            TL_iv.pageTableCell pagetablecell = h6Var5.d[i14][i15];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i15++;
                        }
                    }
                }
                r5Var.invalidate();
                p5Var.s();
            }
            this.s4 = o10;
            return true;
        }
        int m10 = p5Var.m(i10, i11);
        if (m10 < 0) {
            return false;
        }
        int q5 = (r5Var.u() && m10 == r5Var.j()) ? r5Var.q() : m10;
        if (p5Var == this.q4 && (h6Var = p5Var.F) != null && m10 >= 0 && q5 >= m10 && q5 < h6Var.c && !linkedHashSet.isEmpty()) {
            int i16 = m10;
            loop4: while (i16 <= q5) {
                int i17 = 0;
                while (true) {
                    h6 h6Var6 = p5Var.F;
                    if (i17 < h6Var6.b) {
                        if (!linkedHashSet.contains(h6Var6.d[i17][i16])) {
                            break loop4;
                        }
                        i17++;
                    }
                }
            }
            L4(p5Var);
            return true;
        }
        m2(p5Var);
        h6 h6Var7 = p5Var.F;
        if (h6Var7 != null && m10 >= 0 && q5 >= m10 && q5 < h6Var7.c) {
            linkedHashSet.clear();
            for (int i18 = m10; i18 <= q5; i18++) {
                int i19 = 0;
                while (true) {
                    h6 h6Var8 = p5Var.F;
                    if (i19 < h6Var8.b) {
                        TL_iv.pageTableCell pagetablecell2 = h6Var8.d[i19][i18];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i19++;
                    }
                }
            }
            r5Var.invalidate();
            p5Var.s();
        }
        this.t4 = m10;
        return true;
    }

    public final g1 p4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof d6) {
            return ((d6) G4).getAuthorEditText();
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
    public final TL_iv.PageBlock q2(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
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
            v3 v3Var = this;
            ArrayList arrayList2 = v3Var.t3;
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
            boolean K3 = K3(aVar2.b);
            if (K3) {
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
            if (K3) {
                P2(arrayList3, aVar2);
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
                        v3 v3Var2 = v3Var;
                        i15 = i20;
                        arrayList = arrayList4;
                        TL_iv.PageBlock q22 = v3Var2.q2(i15, i21, i16, i17, z11, iArr2);
                        if (q22 != null) {
                            arrayList.add(q22);
                        }
                        i20 = iArr2[0];
                        if (i20 <= i15) {
                            break;
                        }
                        v3Var = this;
                        i16 = i12;
                        i17 = i13;
                        richText = richText2;
                        aVar2 = aVar;
                        arrayList3 = arrayList;
                    } else {
                        if (!K3(aVar3.b)) {
                            break;
                        }
                        P2(arrayList3, aVar3);
                        i20++;
                        aVar2 = aVar;
                    }
                } else {
                    i15 = i20;
                    aVar = aVar2;
                    break;
                }
            }
            if (K3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!K3) {
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
                    tL_pageListOrderedItemBlocks.num = a1.g.m(i19, ".");
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
                tL_pageListOrderedItemText.num = a1.g.m(i19, ".");
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
    public final boolean q3() {
        int i10 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i10);
            if (!d6.y(aVar.b).isEmpty()) {
                break;
            }
            if (!J3(aVar.b)) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (t tVar : W3(aVar)) {
                if (tVar.b() || tVar.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i11 = o4.M;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && U4((TL_iv.pageBlockTable) pageBlock3)) {
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

    public final boolean r2() {
        g1 editText;
        int length;
        int x9;
        int e;
        j3 j3Var = this.v3;
        if (j3Var == null || !j3Var.x() || j3Var.p0 != j3Var.s0) {
            return false;
        }
        if (R3()) {
            int i10 = j3Var.p0;
            int i11 = j3Var.q0;
            if (i11 != j3Var.t0) {
                return false;
            }
            editText = T4(i10, i11);
        } else if (E3()) {
            editText = O2(j3Var.p0);
        } else if (C3()) {
            editText = y2(j3Var.p0);
        } else if (M3()) {
            editText = p4(j3Var.p0);
        } else {
            d6 M4 = M4();
            if (M4 == null) {
                return false;
            }
            editText = M4.getEditText();
        }
        if (editText == null || (x9 = ic.a.x(j3Var.r0, j3Var.u0, (length = editText.length()), 0)) >= (e = ic.a.e(j3Var.r0, j3Var.u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && x9 < e) {
            for (k4 k4Var : (k4[]) text.getSpans(x9, e, k4.class)) {
                if (text.getSpanStart(k4Var) < e && text.getSpanEnd(k4Var) > x9) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean s2() {
        int[] J4 = J4();
        if (J4 == null) {
            return t2(J2());
        }
        for (int i10 = J4[0]; i10 <= J4[1]; i10++) {
            if (t2((a) this.t3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            Iterator it = W3((a) arrayList.get(i10)).iterator();
            while (it.hasNext()) {
                if (((t) it.next()).a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean s4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.t3;
            if (i11 < arrayList.size()) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (w3(i11, true, true)) {
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
                        if (w3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    y4();
                    if (findFocus() instanceof g1) {
                        d2();
                    } else {
                        this.g3.O(false);
                    }
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.r3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.Z3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.q3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.t3;
        c3(arrayList, c5.b(charSequence), this.u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((a) arrayList.get(size));
        }
        this.g3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.t3).indexOf(aVar)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        a aVar2 = (a) arrayList.get(indexOf);
        if (aVar2.c == 0) {
            TL_iv.PageBlock pageBlock = aVar2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !I3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !u2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).c < aVar2.c) {
            return false;
        }
        return v3(indexOf);
    }

    public final void t3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                d6 d6Var = (d6) childAt;
                d6Var.f.hideActionMode();
                d6Var.h.hideActionMode();
            } else if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                r5 r5Var = p5Var.v;
                p5Var.r.hideActionMode();
                for (int i11 = 0; i11 < r5Var.getChildCount(); i11++) {
                    View childAt2 = r5Var.getChildAt(i11);
                    if (childAt2 instanceof s5) {
                        ((s5) childAt2).a.hideActionMode();
                    }
                }
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void t4(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof u4) {
            u4 u4Var = (u4) F1;
            ArrayList arrayList = u4Var.y;
            if (u4Var.a == null) {
                return;
            }
            u4Var.m();
            if (u4Var.W >= arrayList.size()) {
                u4Var.W = Math.max(0, arrayList.size() - 1);
            }
            u4Var.n(false);
            u4Var.requestLayout();
            u4Var.invalidate();
        }
    }

    public final boolean u2(int i10) {
        if (i10 <= 0) {
            return false;
        }
        ArrayList arrayList = this.t3;
        return i10 < arrayList.size() && K3(((a) arrayList.get(i10)).b) && ((a) arrayList.get(i10 - 1)).c >= 1;
    }

    public final void u3(boolean z10) {
        j3 j3Var = this.v3;
        if (j3Var != null) {
            if (z10) {
                j3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(j3Var.m0);
                j3Var.u();
            }
        }
        if (z10) {
            b3();
        } else {
            t3();
        }
    }

    public final void u4() {
        post(new b(this, 3));
    }

    public final boolean v2() {
        int[] J4 = J4();
        if (J4 == null) {
            return w2(J2());
        }
        for (int i10 = J4[0]; i10 <= J4[1]; i10++) {
            if (w2((a) this.t3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean v3(int i10) {
        return ((a) this.t3.get(i10)).c + 1 <= MessagesController.getInstance(this.n3).config.richMessageMaxDepth.get() + (-6);
    }

    public final void v4(int i10) {
        ArrayList arrayList = this.t3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.c > 0) {
                View F1 = F1(aVar);
                if (F1 instanceof d6) {
                    ((d6) F1).E();
                }
            }
        }
    }

    public final boolean w2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        return aVar != null && (indexOf = (arrayList = this.t3).indexOf(aVar)) >= 0 && aVar.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((a) arrayList.get(indexOf)).c > 0;
    }

    public final boolean w3(int i10, boolean z10, boolean z11) {
        int i11 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.t3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar.c > 0) {
                        z2(i10);
                        return true;
                    }
                } else if (aVar.c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || I3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || u2(i10)) && v3(i10)) {
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
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).c >= aVar.c)) && v3(i10)) {
                    aVar.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void w4(a aVar, t tVar) {
        if (aVar == null) {
            return;
        }
        if (!H3(aVar.b)) {
            x4(aVar);
            return;
        }
        ArrayList m32 = m3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(tVar) : -1;
        if (indexOf >= 0) {
            aVar.h.remove(indexOf);
            if (m32 != null && indexOf < m32.size()) {
                m32.remove(indexOf);
            }
        }
        if (aVar.h.isEmpty()) {
            x4(aVar);
            return;
        }
        int size = aVar.h.size();
        k71 k71Var = this.g3;
        if (size != 1) {
            k71Var.O(true);
            t4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) m32.get(0);
        aVar.b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.g = (t) aVar.h.get(0);
        aVar.h = null;
        k71Var.O(true);
        t4(aVar);
    }

    public final boolean x2() {
        f2 f2Var = this.R3;
        if (f2Var != null) {
            return f2Var.e || !f2Var.b.isEmpty();
        }
        return false;
    }

    public final void x3(boolean z10) {
        int i10;
        int i11;
        int[] J4 = J4();
        if (J4 != null && (i10 = J4[0]) != (i11 = J4[1])) {
            s4(i10, i11, z10);
            return;
        }
        a J2 = J4 == null ? J2() : (a) this.t3.get(J4[0]);
        if (J2 != null) {
            c4(J2, z10);
        }
    }

    public final void x4(a aVar) {
        ArrayList arrayList = this.t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.g3.O(true);
        }
    }

    public final g1 y2(int i10) {
        KeyEvent.Callback G4 = G4(i10);
        if (G4 instanceof k0) {
            return ((k0) G4).getCaptionEditText();
        }
        return null;
    }

    public final void y3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
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
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.u3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.k.add((Long) arrayList3.get(i12));
                }
                int i13 = f5.a;
                u61 K = u61.K(f5.class);
                K.G = aVar2;
                K.H = this.n4;
                arrayList2.add(K);
                this.x4.add(aVar2);
            }
        }
    }

    public final void y4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.t3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.c > 0 && aVar.d > 0 && !K3(aVar.b)) {
                int i11 = aVar.c;
                int i12 = 1;
                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                    a aVar2 = (a) arrayList.get(i13);
                    int i14 = aVar2.c;
                    if (i14 < i11) {
                        break;
                    }
                    if (i14 == i11 && !K3(aVar2.b)) {
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

    public final void z2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.t3;
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
    public final void z3() {
        f2 f2Var;
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        a aVar = new a(pageblockdetails, 0, 0);
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar3.i = true;
        a W2 = W2();
        ArrayList arrayList = this.t3;
        int indexOf = W2 != null ? arrayList.indexOf(W2) : -1;
        if (W2 != null) {
            TL_iv.PageBlock pageBlock = W2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && W2.g == null && !W2.i && d6.y(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, aVar3);
                arrayList.add(indexOf, aVar2);
                arrayList.add(indexOf, aVar);
                this.g3.O(false);
                f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.h();
                }
                post(new m2(this, aVar, 20));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, aVar3);
        arrayList.add(indexOf, aVar2);
        arrayList.add(indexOf, aVar);
        this.g3.O(false);
        f2Var = this.R3;
        if (f2Var != null) {
        }
        post(new m2(this, aVar, 20));
    }

    public final void z4(String str) {
        j3 j3Var = this.v3;
        c2(j3Var.p0, j3Var.r0, j3Var.s0, j3Var.u0, str.split("\n", -1));
    }
}
