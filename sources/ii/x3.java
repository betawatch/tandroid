package ii;

import ai.f8;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xm0;
import org.webrtc.MediaStreamTrack;
import v7.n8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x3 extends k71 {
    public static final ArrayList q4 = new ArrayList();
    public boolean A3;
    public TL_iv.pageTableCell B3;
    public TL_iv.pageTableCell C3;
    public long D3;
    public float E3;
    public float F3;
    public boolean G3;
    public i2 H3;
    public int I3;
    public i1 J3;
    public final i K3;
    public ArrayList L3;
    public int M3;
    public int N3;
    public int O3;
    public boolean P3;
    public a Q3;
    public boolean R3;
    public final p3 S3;
    public final t2 T3;
    public final q3 U3;
    public final r3 V3;
    public final s3 W3;
    public final IdentityHashMap X3;
    public final IdentityHashMap Y3;
    public a Z3;
    public a a4;
    public final t3 b4;
    public final b3 c4;
    public final int d3;
    public final c3 d4;
    public final org.telegram.ui.ActionBar.e6 e3;
    public final d3 e4;
    public final v3 f3;
    public final e3 f4;
    public MessageObject g3;
    public q5 g4;
    public boolean h3;
    public p80 h4;
    public TL_iv.RichMessage i3;
    public int i4;
    public final ArrayList j3;
    public int j4;
    public final HashMap k3;
    public final u2 k4;
    public final k3 l3;
    public final f3 l4;
    public final aa m3;
    public final a4.l m4;
    public int n3;
    public final ArrayList n4;
    public int o3;
    public xm0 o4;
    public int p3;
    public int p4;
    public boolean q3;
    public float r3;
    public float s3;
    public float t3;
    public float u3;
    public View v3;
    public b w3;
    public boolean x3;
    public boolean y3;
    public boolean z3;

    public x3(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, v3 v3Var) {
        super(context, i10, 0, false, new hi.a(r1, 4), new ei.c5(r1, 16), null, e6Var);
        this.h3 = true;
        this.j3 = new ArrayList();
        this.k3 = new HashMap();
        this.n3 = -1;
        this.o3 = -1;
        this.p3 = 0;
        this.K3 = new i(this, 2);
        this.P3 = true;
        this.S3 = new p3(this);
        this.T3 = new t2(this);
        this.U3 = new q3(this);
        this.V3 = new r3(this);
        this.W3 = new s3(this);
        this.X3 = new IdentityHashMap();
        this.Y3 = new IdentityHashMap();
        this.b4 = new t3(this);
        this.c4 = new b3(this);
        this.d4 = new c3(this);
        this.e4 = new d3(this);
        this.f4 = new e3(this);
        this.i4 = -1;
        this.j4 = -1;
        this.k4 = new u2(this);
        this.l4 = new f3(this);
        a4.l lVar = new a4.l(this, 23);
        this.m4 = lVar;
        this.n4 = new ArrayList();
        this.p4 = -1;
        x3[] x3VarArr = {this};
        this.d3 = i10;
        this.e3 = e6Var;
        this.f3 = v3Var;
        this.W2.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        C1(new hi.a(this, 5), false);
        setReorderLongPressEnabled(false);
        x1(true);
        k3 k3Var = new k3(this, v3Var);
        this.l3 = k3Var;
        k3Var.S(this);
        k3Var.z0 = this.V2;
        aa n10 = k3Var.n(context);
        this.m3 = n10;
        AndroidUtilities.removeFromParent(n10);
        k3Var.D = new m3(this, v3Var);
        j(new n3(0, this, v3Var));
        this.H3 = new i2(lVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !f6.z(pageBlock).isEmpty()) ? false : true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        return (F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || C3(pageBlock);
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean G3(a aVar) {
        return aVar != null && !aVar.i && !y3(aVar) && (aVar.b instanceof TL_iv.pageBlockParagraph) && aVar.c == 0 && aVar.d == 0 && !aVar.e && aVar.k.isEmpty();
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
    public static void J1(x3[] x3VarArr, ArrayList arrayList, c71 c71Var) {
        int i10;
        boolean z10;
        ArrayList arrayList2;
        int i11;
        boolean z11;
        int i12;
        x3 x3Var = x3VarArr[0];
        if (x3Var != null) {
            ArrayList arrayList3 = x3Var.j3;
            x3Var.b2();
            ArrayList arrayList4 = x3Var.n4;
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
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i15), 1, new x2());
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
                        a1.g.y(i10, arrayList6);
                    }
                    if (i19 == i16 || arrayList6.size() >= i19) {
                        if (i20 == 0) {
                            if (i18 != 0) {
                                c71Var.L();
                                i18 = 0;
                            }
                            int i21 = v0.a;
                            p61 J = p61.J(v0.class);
                            J.G = aVar3;
                            arrayList.add(J);
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
                    if (y3(aVar3)) {
                        if (i22 == 0) {
                            boolean z15 = ((TL_iv.pageBlockDetails) aVar3.b).open;
                            if (!arrayList6.isEmpty() || z15) {
                                if (i18 != 0) {
                                    c71Var.L();
                                    i18 = 0;
                                }
                            } else if (i18 == 0) {
                                c71Var.M();
                                i18 = i10;
                            }
                            e3 e3Var = x3Var.f4;
                            int i23 = t0.a;
                            p61 J2 = p61.J(t0.class);
                            J2.G = aVar3;
                            J2.H = e3Var;
                            arrayList.add(J2);
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
                                    if (num.intValue() >= 2 || i25 > 0 || x3Var.k3.containsKey(l4)) {
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
                            x3Var.t3(aVar2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (i18 == 0) {
                                c71Var.M();
                                i18 = 1;
                            }
                        } else if (i18 != 0) {
                            c71Var.L();
                            i18 = 0;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            t2 t2Var = x3Var.T3;
                            int i26 = x0.a;
                            p61 J3 = p61.J(x0.class);
                            J3.G = aVar3;
                            J3.H = t2Var;
                            arrayList.add(J3);
                        } else if (E3(pageBlock)) {
                            q3 q3Var = x3Var.U3;
                            int i27 = v4.a;
                            p61 J4 = p61.J(v4.class);
                            J4.d = (int) aVar3.a;
                            J4.G = aVar3;
                            J4.H = q3Var;
                            arrayList.add(J4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                r3 r3Var = x3Var.V3;
                                int i28 = y.a;
                                p61 J5 = p61.J(y.class);
                                J5.G = aVar3;
                                J5.H = r3Var;
                                arrayList.add(J5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                s3 s3Var = x3Var.W3;
                                int i29 = z0.a;
                                p61 J6 = p61.J(z0.class);
                                J6.G = aVar3;
                                J6.H = s3Var;
                                arrayList.add(J6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                t3 t3Var = x3Var.b4;
                                int i30 = p4.a;
                                p61 J7 = p61.J(p4.class);
                                J7.G = aVar3;
                                J7.H = t3Var;
                                arrayList.add(J7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                b3 b3Var = x3Var.c4;
                                int i31 = r4.a;
                                p61 J8 = p61.J(r4.class);
                                J8.G = aVar3;
                                J8.H = b3Var;
                                arrayList.add(J8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                d3 d3Var = x3Var.e4;
                                int i32 = o5.a;
                                p61 J9 = p61.J(o5.class);
                                J9.G = aVar3;
                                J9.H = d3Var;
                                arrayList.add(J9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                p3 p3Var = x3Var.S3;
                                int i33 = g0.a;
                                p61 J10 = p61.J(g0.class);
                                J10.G = aVar3;
                                J10.H = p3Var;
                                arrayList.add(J10);
                            } else {
                                aVar3.p = i17 == 0;
                                aVar3.q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2) {
                                    i11 = 1;
                                    if (i17 == 1 && (aVar3.b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                        z11 = true;
                                        f3 f3Var = x3Var.l4;
                                        int i34 = d6.a;
                                        p61 J11 = p61.J(d6.class);
                                        J11.G = aVar3;
                                        J11.H = f3Var;
                                        J11.r = z11;
                                        arrayList.add(J11);
                                        arrayList4.add(aVar3);
                                        aVar2 = aVar3;
                                    }
                                } else {
                                    i11 = 1;
                                }
                                z11 = false;
                                f3 f3Var2 = x3Var.l4;
                                int i342 = d6.a;
                                p61 J112 = p61.J(d6.class);
                                J112.G = aVar3;
                                J112.H = f3Var2;
                                J112.r = z11;
                                arrayList.add(J112);
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
                c71Var.L();
            }
            if (aVar2 != null) {
                x3Var.t3(aVar2, q4, hashMap, arrayList);
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
                    aVar4.l = size2 - m4(aVar4, aVar5);
                    int m42 = size2 - m4(aVar4, aVar6);
                    aVar4.m = m42;
                    aVar4.n = aVar4.l > 0 ? i35 : 0;
                    aVar4.o = m42 > 0 ? i35 : 0;
                }
                i36++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K2(a aVar, ArrayList arrayList) {
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            u uVar = aVar.g;
            if (uVar == null || !uVar.b()) {
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
            u uVar2 = aVar.g;
            if (uVar2 == null || !uVar2.b()) {
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
        if (C3(pageBlock)) {
            ArrayList h32 = h3(aVar.b);
            List R3 = R3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i10 = 0; h32 != null && i10 < h32.size() && i10 < R3.size(); i10++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) h32.get(i10);
                if (((u) R3.get(i10)).b()) {
                    if ((pageBlock4 instanceof TL_iv.pageBlockPhoto ? ((TL_iv.pageBlockPhoto) pageBlock4).photo_id : pageBlock4 instanceof TL_iv.pageBlockVideo ? ((TL_iv.pageBlockVideo) pageBlock4).video_id : 0L) != 0) {
                        l0.d(pageBlock4);
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
            l0.d(pageblockcollage);
            arrayList.add(pageblockcollage);
            return;
        }
        TL_iv.PageBlock pageBlock5 = aVar.b;
        if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
            u uVar3 = aVar.g;
            if (uVar3 == null || !uVar3.b()) {
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
            u uVar4 = aVar.g;
            if (uVar4 != null && (document = uVar4.h) != null) {
                ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.id;
            }
            if (uVar4 == null || !uVar4.b()) {
                return;
            }
            TL_iv.PageBlock pageBlock7 = aVar.b;
            if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                l0.d(pageBlock7);
                arrayList.add(aVar.b);
                return;
            }
            return;
        }
        if (pageBlock5 instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
            int i11 = q4.M;
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
                            j6.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                    }
                }
            }
        }
        if (P4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void L1(x3 x3Var, int i10, int i11, int i12) {
        if (i10 < 0) {
            return;
        }
        KeyEvent.Callback m10 = x3Var.V2.m(i10);
        if (m10 instanceof f6) {
            f6 f6Var = (f6) m10;
            i1 authorEditText = (i11 == 1 && f6Var.n()) ? f6Var.getAuthorEditText() : f6Var.getEditText();
            authorEditText.s();
            authorEditText.setSelection(Math.max(0, Math.min(i12, authorEditText.length())));
            return;
        }
        if (!(m10 instanceof q5)) {
            if (m10 instanceof m0) {
                i1 captionEditText = ((m0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
                return;
            }
            return;
        }
        q5 q5Var = (q5) m10;
        i1 l4 = q5Var.l(i11);
        if (l4 == null) {
            l4 = q5Var.l(0);
        }
        if (l4 == null) {
            return;
        }
        l4.s();
        l4.setSelection(Math.max(0, Math.min(i12, l4.length())));
    }

    public static boolean L2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.PageBlock M1(x3 x3Var, a aVar, int i10, int i11) {
        TL_iv.PageBlock TLdeserialize;
        x3Var.getClass();
        if (!B3(aVar.b)) {
            return null;
        }
        Editable N4 = x3Var.N4(aVar);
        int length = N4.length();
        int max = Math.max(0, Math.min(i10, length));
        if (i11 >= 0) {
            length = Math.max(0, Math.min(i11, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock != null) {
            try {
                M2(pageBlock);
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
        f6.d(TLdeserialize, spannableStringBuilder);
        return TLdeserialize;
    }

    public static void M2(TL_iv.PageBlock pageBlock) {
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

    public static void N1(x3 x3Var, i1 i1Var) {
        if (i1Var == null) {
            x3Var.getClass();
            return;
        }
        i1Var.adaptiveCreateLinkDialog = x3Var.h3;
        i1Var.setInlineButtonContext(x3Var.d3);
        i1Var.setInlineButtonClickListener(new u2(x3Var));
    }

    public static void O1(a aVar, u uVar, x3 x3Var) {
        v3 v3Var = x3Var.f3;
        IdentityHashMap identityHashMap = x3Var.Y3;
        IdentityHashMap identityHashMap2 = x3Var.X3;
        if (uVar != null) {
            c5 c5Var = (c5) identityHashMap2.remove(uVar);
            if (c5Var != null) {
                c5Var.b();
            }
            y4 y4Var = (y4) identityHashMap.remove(uVar);
            if (y4Var != null) {
                y4Var.a();
            }
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            x3Var.r4(aVar, uVar);
            i2 i2Var2 = x3Var.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            v3Var.onContentChanged();
            return;
        }
        ArrayList arrayList = x3Var.j3;
        for (u uVar2 : R3(aVar)) {
            c5 c5Var2 = (c5) identityHashMap2.remove(uVar2);
            if (c5Var2 != null) {
                c5Var2.b();
            }
            y4 y4Var2 = (y4) identityHashMap.remove(uVar2);
            if (y4Var2 != null) {
                y4Var2.a();
            }
        }
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            i2 i2Var3 = x3Var.H3;
            if (i2Var3 != null) {
                i2Var3.d();
            }
            arrayList.remove(indexOf);
            x3Var.W2.N(true);
            i2 i2Var4 = x3Var.H3;
            if (i2Var4 != null) {
                i2Var4.h();
            }
        }
        v3Var.onContentChanged();
    }

    public static void O2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        T1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    P2(arrayList, pageBlock, i10 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        T1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
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
        T1(arrayList, null, i10, i11, z11, z12);
    }

    public static TL_iv.PageBlock O3(a aVar, u uVar) {
        if (!C3(aVar.b)) {
            return aVar.b;
        }
        ArrayList h32 = h3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(uVar) : -1;
        if (indexOf < 0 || h32 == null || indexOf >= h32.size()) {
            return null;
        }
        return (TL_iv.PageBlock) h32.get(indexOf);
    }

    public static void P1(x3 x3Var) {
        if (x3Var.G3) {
            return;
        }
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.h();
        }
        x3Var.f3.l();
        x3Var.p4();
    }

    public static void P2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i11 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    T1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    O2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
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
                T1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i13 = i12;
                O2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i12 = i13;
            }
            i12++;
        }
    }

    public static boolean P4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(h6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!j6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Q1(x3 x3Var, a aVar) {
        ArrayList arrayList = x3Var.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.k.addAll(aVar.k);
        arrayList.add(indexOf + 1, aVar2);
        x3Var.t4();
        x3Var.W2.N(false);
        i2 i2Var2 = x3Var.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 23));
    }

    public static FrameLayout Q4(q5 q5Var, boolean z10) {
        t5 m10;
        j6 model = q5Var.getModel();
        if (model != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = z10 ? -1 : Integer.MAX_VALUE;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : q5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o9 = z10 ? (j6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o9 < i11 || (o9 == i11 && a2 < i10) : o9 > i11 || (o9 == i11 && a2 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a2;
                    i11 = o9;
                }
            }
            if (pagetablecell != null && (m10 = q5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return q5Var;
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
    public static boolean R1(x3 x3Var, a aVar, boolean z10) {
        int i10;
        i1 editText;
        Editable text;
        i2 i2Var;
        i2 i2Var2;
        int i11;
        ArrayList arrayList = x3Var.n4;
        c71 c71Var = x3Var.W2;
        ArrayList arrayList2 = x3Var.j3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList3 = aVar.k;
            if (D3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                x3Var.V4(aVar, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            if (aVar.c > 0) {
                i2 i2Var3 = x3Var.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                View A1 = x3Var.A1(aVar);
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    if (f6Var.getEditText().isFocused()) {
                        i11 = f6Var.getEditText().getSelectionEnd();
                        x3Var.u2(indexOf);
                        x3Var.t4();
                        if (x3Var.findFocus() instanceof i1) {
                            c71Var.N(false);
                            i2 i2Var4 = x3Var.H3;
                            if (i2Var4 != null) {
                                i2Var4.h();
                            }
                            x3Var.post(new a3(x3Var, aVar, 1));
                            return true;
                        }
                        x3Var.Y1();
                        i2 i2Var5 = x3Var.H3;
                        if (i2Var5 != null) {
                            i2Var5.h();
                        }
                        if (i11 >= 0) {
                            x3Var.post(new r2(x3Var, aVar, i11, 2));
                            return true;
                        }
                    }
                }
                i11 = -1;
                x3Var.u2(indexOf);
                x3Var.t4();
                if (x3Var.findFocus() instanceof i1) {
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
                        i2Var = x3Var.H3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        arrayList3.remove(arrayList3.size() - 1);
                        x3Var.y2();
                        x3Var.t4();
                        c71Var.N(false);
                        i2Var2 = x3Var.H3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        x3Var.post(new a3(x3Var, aVar, 2));
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
                    i2Var = x3Var.H3;
                    if (i2Var != null) {
                    }
                    arrayList3.remove(arrayList3.size() - 1);
                    x3Var.y2();
                    x3Var.t4();
                    c71Var.N(false);
                    i2Var2 = x3Var.H3;
                    if (i2Var2 != null) {
                    }
                    x3Var.post(new a3(x3Var, aVar, 2));
                    return true;
                }
                if (indexOf > 0) {
                    int i13 = indexOf - 1;
                    a aVar4 = (a) arrayList2.get(i13);
                    if (y3(aVar4) || aVar4.i) {
                        if (z10 && (!y3(aVar4) || ((i10 = indexOf + 1) < arrayList2.size() && !((a) arrayList2.get(i10)).i))) {
                            i2 i2Var6 = x3Var.H3;
                            if (i2Var6 != null) {
                                i2Var6.d();
                            }
                            arrayList2.remove(indexOf);
                            x3Var.t4();
                            c71Var.N(false);
                            i2 i2Var7 = x3Var.H3;
                            if (i2Var7 != null) {
                                i2Var7.h();
                            }
                            x3Var.post(new a3(x3Var, aVar4, 3));
                        }
                    } else {
                        if (F3(aVar4.b)) {
                            i2 i2Var8 = x3Var.H3;
                            if (i2Var8 != null) {
                                i2Var8.d();
                            }
                            arrayList2.remove(i13);
                            x3Var.t4();
                            c71Var.N(false);
                            i2 i2Var9 = x3Var.H3;
                            if (i2Var9 != null) {
                                i2Var9.h();
                            }
                            x3Var.post(new a3(x3Var, aVar, 4));
                            return true;
                        }
                        i2 i2Var10 = x3Var.H3;
                        if (i2Var10 != null) {
                            i2Var10.d();
                        }
                        View A12 = x3Var.A1(aVar4);
                        int indexOf2 = arrayList.indexOf(aVar);
                        if (!(A12 instanceof f6) || indexOf2 < 0) {
                            SpannableStringBuilder A = f6.A(aVar4.b);
                            int length = A.length();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A);
                            spannableStringBuilder.append((CharSequence) f6.A(aVar.b));
                            f6.d(aVar4.b, spannableStringBuilder);
                            arrayList2.remove(indexOf);
                            x3Var.y2();
                            x3Var.t4();
                            c71Var.N(false);
                            i2 i2Var11 = x3Var.H3;
                            if (i2Var11 != null) {
                                i2Var11.h();
                            }
                            x3Var.post(new r2(x3Var, aVar4, length, 5));
                            return true;
                        }
                        f6 f6Var2 = (f6) A12;
                        i1 editText2 = f6Var2.getEditText();
                        int length2 = editText2.length();
                        SpannableStringBuilder A2 = f6.A(aVar.b);
                        Editable text2 = editText2.getText();
                        if (text2 != null && A2 != null && A2.length() != 0) {
                            editText2.h = true;
                            text2.append((CharSequence) A2);
                            editText2.h = false;
                        }
                        f6.d(aVar4.b, editText2.getText());
                        View A13 = x3Var.A1(aVar);
                        if ((A13 instanceof f6) && (text = (editText = ((f6) A13).getEditText()).getText()) != null && text.length() > 0) {
                            editText.h = true;
                            text.delete(0, text.length());
                            editText.h = false;
                        }
                        f6Var2.B();
                        editText2.setSelection(Math.max(0, Math.min(length2, editText2.length())));
                        arrayList2.remove(indexOf);
                        boolean y22 = x3Var.y2();
                        x3Var.t4();
                        if (y22) {
                            c71Var.N(false);
                            i2 i2Var12 = x3Var.H3;
                            if (i2Var12 != null) {
                                i2Var12.h();
                            }
                            x3Var.post(new r2(x3Var, aVar4, Math.max(0, length2), 4));
                            return true;
                        }
                        c71Var.S();
                        x3Var.q4(indexOf);
                        s4.n0 itemAnimator = x3Var.getItemAnimator();
                        x3Var.setItemAnimator(null);
                        c71Var.u(indexOf2);
                        if ((aVar4.d > 0 || aVar.d > 0) && indexOf2 < arrayList.size()) {
                            c71Var.q(indexOf2, arrayList.size() - indexOf2);
                        }
                        x3Var.post(new z2(x3Var, itemAnimator, 1));
                        i2 i2Var13 = x3Var.H3;
                        if (i2Var13 != null) {
                            i2Var13.h();
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static List R3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (C3(aVar.b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        u uVar = aVar.g;
        return uVar != null ? Collections.singletonList(uVar) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i1 S3(View view) {
        if (view instanceof f6) {
            return ((f6) view).getEditText();
        }
        if (view instanceof m0) {
            return ((m0) view).getCaptionEditText();
        }
        if (view instanceof u0) {
            return ((u0) view).getEditText();
        }
        return null;
    }

    public static void T1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
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

    public static TL_iv.PageBlock T3(TL_iv.PageBlock pageBlock) {
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

    public static u U3(MediaController.PhotoEntry photoEntry, String str) {
        u uVar = new u();
        uVar.b = photoEntry.isVideo;
        uVar.e = str;
        uVar.j = photoEntry.width;
        uVar.k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        boolean z10 = (str2 == null || str == null || !str.equals(str2)) ? false : true;
        uVar.l = z10 ? 0 : photoEntry.orientation;
        uVar.m = z10 ? 0 : photoEntry.invert;
        uVar.a = 1;
        uVar.f = 0.0f;
        return uVar;
    }

    public static q5 V2(i1 i1Var) {
        for (ViewParent parent = i1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof q5) {
                return (q5) parent;
            }
        }
        return null;
    }

    public static void X2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
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
                P2(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new a(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                X2(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar.i = true;
                arrayList.add(aVar);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long a2 = q0.a();
                X2(arrayList, pageblockblockquoteblocks.blocks, map);
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

    public static ArrayList Y2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        X2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void a2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] b5(q5 q5Var) {
        j6 j6Var = q5Var.F;
        for (int size = j6Var != null ? j6Var.g.size() : 0; size >= 0; size--) {
            i1 l4 = q5Var.l(size);
            int length = l4 != null ? l4.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static ArrayList h3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean i4(i1 i1Var, float f7, float f10) {
        if (i1Var != null && i1Var.getVisibility() == 0) {
            i1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - r1[0];
            float f12 = f10 - r1[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= i1Var.getWidth() && f12 <= i1Var.getHeight()) {
                int offsetForPosition = i1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                i1Var.s();
                i1Var.setSelection(Math.max(0, Math.min(offsetForPosition, i1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int l4(int i10, a aVar, boolean z10) {
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        return org.telegram.messenger.q.D(16.0f, Math.max(0, i10 - (aVar.k.size() - (z10 ? aVar.l : aVar.m))), AndroidUtilities.dp(2.0f));
    }

    public static boolean m3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || E3(pageBlock);
    }

    public static int m4(a aVar, a aVar2) {
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
            if (childAt instanceof f6) {
                ((f6) childAt).setLocked(z10);
            } else if (childAt instanceof q5) {
                ((q5) childAt).setLocked(z10);
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof u0) {
                ((u0) childAt).setLocked(z10);
            } else if (childAt instanceof y0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean w3(int i10) {
        return i10 == 21 || i10 == 22 || i10 == 19 || i10 == 20;
    }

    public static int x2(int i10) {
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

    public static boolean y3(a aVar) {
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockDetails);
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : R3((a) arrayList2.get(i10))) {
                if (uVar.b() && (document = uVar.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(uVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void A4() {
        ArrayList arrayList = this.j3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.W2.N(false);
    }

    @Override // org.telegram.ui.Components.k71
    public final boolean B1() {
        return this.R3;
    }

    public final ArrayList B2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : R3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(uVar.g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View B4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.V2.m(i10);
    }

    public final ArrayList C2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            for (u uVar : R3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(uVar.g);
                }
            }
            i10++;
        }
    }

    public final int[] C4() {
        ArrayList arrayList = this.j3;
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x()) {
            a R2 = R2();
            int indexOf = R2 != null ? arrayList.indexOf(R2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(z4(k3Var.p0));
        int indexOf3 = arrayList.indexOf(z4(k3Var.s0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    @Override // org.telegram.ui.Components.k71
    public final void D1() {
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.q();
        }
    }

    public final void D2() {
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.h();
        }
        ArrayList arrayList = this.j3;
        SpannableStringBuilder k10 = e5.k(arrayList);
        H2();
        arrayList.clear();
        HashMap hashMap = this.k3;
        hashMap.clear();
        this.i3 = null;
        X2(arrayList, e5.b(k10), hashMap);
        this.W2.N(false);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.onContentChanged();
            v3Var.H();
        }
    }

    public final boolean D4() {
        k3 k3Var = this.l3;
        if (k3Var != null && k3Var.x()) {
            if (M3()) {
                int i10 = k3Var.p0;
                int i11 = k3Var.q0;
                int i12 = k3Var.t0;
                int i13 = k3Var.r0;
                int i14 = k3Var.u0;
                int i15 = i11;
                while (i15 <= i12) {
                    i1 O4 = O4(i10, i15);
                    if (O4 != null) {
                        int length = O4.length();
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
            } else if (z3()) {
                i1 J2 = J2(k3Var.p0);
                if (J2 != null && Math.max(0, Math.min(Math.min(k3Var.r0, k3Var.u0), J2.length())) < Math.max(0, Math.min(Math.max(k3Var.r0, k3Var.u0), J2.length()))) {
                    return true;
                }
            } else if (x3()) {
                i1 t22 = t2(k3Var.p0);
                if (t22 != null) {
                    int i18 = k3Var.r0;
                    int i19 = k3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i18, i19), t22.length())) < Math.max(0, Math.min(Math.max(i18, i19), t22.length()))) {
                        return true;
                    }
                }
            } else if (H3()) {
                i1 k42 = k4(k3Var.p0);
                if (k42 != null) {
                    int i20 = k3Var.r0;
                    int i21 = k3Var.u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), k42.length())) < Math.max(0, Math.min(Math.max(i20, i21), k42.length()))) {
                        return true;
                    }
                }
            } else {
                int i22 = k3Var.p0;
                int i23 = k3Var.s0;
                int i24 = k3Var.r0;
                int i25 = k3Var.u0;
                if (i22 >= 0 && i23 >= 0 && i23 >= i22 && i23 < this.n4.size()) {
                    int i26 = i22;
                    while (i26 <= i23) {
                        a z42 = z4(i26);
                        if (z42 != null) {
                            if (z42.t == 0) {
                                TL_iv.PageBlock pageBlock = z42.b;
                                if (!B3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int j22 = j2(i26);
                            if (Math.max(0, Math.min(i26 == i22 ? i24 : 0, j22)) < Math.max(0, Math.min(i26 == i23 ? i25 : j22, j22))) {
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

    @Override // org.telegram.ui.Components.k71
    public final void E1() {
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.B();
        }
        y4();
    }

    public final a E2() {
        int i10;
        a z42;
        a R2 = R2();
        if (R2 != null) {
            return R2;
        }
        k3 k3Var = this.l3;
        if (k3Var == null || (i10 = k3Var.p0) < 0 || (z42 = z4(i10)) == null) {
            return null;
        }
        return z42;
    }

    public final int[] E4() {
        k3 k3Var = this.l3;
        if (k3Var == null) {
            return null;
        }
        int i10 = k3Var.p0;
        int i11 = k3Var.s0;
        if (i10 < 0 || i11 < 0) {
            return null;
        }
        a z42 = z4(i10);
        a z43 = z4(i11);
        if (z42 == null || z43 == null) {
            return null;
        }
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(z42);
        int indexOf2 = arrayList.indexOf(z43);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // org.telegram.ui.Components.k71
    public final void F1(s4.d1 d1Var) {
        v3 v3Var = this.f3;
        if (v3Var == null || d1Var == null) {
            return;
        }
        View view = d1Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.R3 = v3Var.f(view.getHeight() + r1[1]);
    }

    public final void F2() {
        ArrayList arrayList;
        k3 k3Var = this.l3;
        int i10 = k3Var.p0;
        int i11 = k3Var.r0;
        int i12 = k3Var.s0;
        if (X1(i10, i11, i12, k3Var.u0, new String[]{""})) {
            return;
        }
        if (i10 > i12) {
            i12 = i10;
            i10 = i12;
        }
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(0, i10);
        while (true) {
            arrayList = this.j3;
            if (max > i12) {
                break;
            }
            ArrayList arrayList3 = this.n4;
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
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.k3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                hashSet.addAll(((a) arrayList.get(i13)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        y2();
        W3();
        t4();
        k3Var.f(false);
        this.W2.N(false);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        post(new p2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
    }

    public final void F4(i1 i1Var) {
        i1Var.adaptiveCreateLinkDialog = this.h3;
        i1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override // org.telegram.ui.Components.k71
    public final void G1(s4.d1 d1Var) {
        a aVar = this.Q3;
        this.Q3 = null;
        this.R3 = false;
        if (aVar == null) {
            if (d1Var != null) {
                View view = d1Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        s4(aVar);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.onContentChanged();
        }
    }

    public final boolean G2() {
        k3 k3Var = this.l3;
        if (k3Var != null && k3Var.x()) {
            k3Var.f(false);
            return true;
        }
        if (this.g4 == null) {
            return false;
        }
        N2();
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
    /* JADX WARN: Removed duplicated region for block: B:134:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04d5 A[LOOP:13: B:176:0x04d3->B:177:0x04d5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e6 A[LOOP:14: B:180:0x04e4->B:181:0x04e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0486 A[EDGE_INSN: B:254:0x0486->B:143:0x0486 BREAK  A[LOOP:9: B:132:0x0462->B:244:0x0462], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[LOOP:3: B:45:0x00c5->B:47:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e A[LOOP:4: B:53:0x0128->B:55:0x012e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216 A[LOOP:8: B:96:0x0210->B:98:0x0216, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G4(q5 q5Var) {
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
        p80 p80Var;
        LinkedHashSet linkedHashSet;
        int dp;
        int i17;
        int[] iArr;
        FrameLayout Q4;
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
        int i24;
        final int i25;
        final int i26;
        boolean z16;
        String string;
        final ?? r62;
        int i27;
        int i28;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean z17;
        boolean equals;
        final q5 q5Var2 = q5Var;
        final j6 model = q5Var2.getModel();
        LinkedHashSet linkedHashSet2 = q5Var2.H;
        if (model == null) {
            return;
        }
        TL_iv.pageBlockTable pageblocktable = model.a;
        Set<TL_iv.pageTableCell> selectedCells = q5Var2.getSelectedCells();
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
                int o9 = j6.o(pagetablecell);
                int i34 = pagetablecell.colspan;
                if (i34 == 0) {
                    i34 = 1;
                }
                i30 = Math.min(i30, b10);
                i31 = Math.min(i31, a2);
                i32 = Math.max(i32, (b10 + o9) - 1);
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
                    if (j6.n(next) <= 1) {
                        int i36 = next.rowspan;
                        if (i36 == 0) {
                            i36 = 1;
                        }
                        if (i36 <= 1) {
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
                                                        i15 = (z13 || !z11 || model.c >= MessagesController.getInstance(this.d3).config.richMessageMaxTableCols.get()) ? 0 : i12;
                                                        i16 = (z13 || !z10) ? 0 : i12;
                                                        p80Var = this.h4;
                                                        if (p80Var != null) {
                                                            linkedHashSet = linkedHashSet2;
                                                            this.h4 = null;
                                                            p80Var.u();
                                                        } else {
                                                            linkedHashSet = linkedHashSet2;
                                                        }
                                                        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                        FrameLayout Q42 = Q4(q5Var2, false);
                                                        i17 = i14;
                                                        iArr = new int[2];
                                                        Q42.getLocationOnScreen(iArr);
                                                        if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                                            Q4 = Q42;
                                                            z14 = i12;
                                                        } else {
                                                            boolean z18 = i12;
                                                            Q4 = Q4(q5Var2, z18);
                                                            z14 = z18;
                                                        }
                                                        final p80 E = this.f3.E(Q4);
                                                        E.s = 0;
                                                        E.t = false;
                                                        E.Z = z14;
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                        linearLayout.setOrientation(1);
                                                        TextView textView = new TextView(getContext());
                                                        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                        i18 = i10;
                                                        textView.setTextSize(1, 12.0f);
                                                        textView.setGravity(17);
                                                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
                                                        linearLayout.addView(textView, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                        i19 = i11;
                                                        i20 = i13;
                                                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                        linearLayout2.setOrientation(0);
                                                        linearLayout.addView(linearLayout2, w7.x5.q(-2, -2, 17));
                                                        Context context = getContext();
                                                        int i41 = R.drawable.iv_align_horiz_left;
                                                        org.telegram.ui.ActionBar.e6 e6Var = this.e3;
                                                        a2 a2Var = new a2(context, i41, e6Var);
                                                        a2Var.e = 4;
                                                        a2Var.e();
                                                        a2Var.b();
                                                        int i42 = org.telegram.ui.ActionBar.i6.G8;
                                                        a2Var.c(i42);
                                                        boolean z19 = z10;
                                                        linearLayout2.addView(a2Var, w7.x5.n(32, 32));
                                                        a2 a2Var2 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var);
                                                        a2Var2.e = 4;
                                                        a2Var2.e();
                                                        a2Var2.b();
                                                        a2Var2.c(i42);
                                                        linearLayout2.addView(a2Var2, w7.x5.n(32, 32));
                                                        a2 a2Var3 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var);
                                                        a2Var3.e = 4;
                                                        a2Var3.e();
                                                        a2Var3.b();
                                                        a2Var3.c(i42);
                                                        final a2[] a2VarArr = {a2Var, a2Var2, a2Var3};
                                                        boolean z20 = z11;
                                                        linearLayout2.addView(a2Var3, w7.x5.n(32, 32));
                                                        z15 = z12;
                                                        linearLayout2.addView(new Space(getContext()), w7.x5.n(8, 0));
                                                        a2 a2Var4 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var);
                                                        a2Var4.e = 4;
                                                        a2Var4.e();
                                                        a2Var4.b();
                                                        a2Var4.c(i42);
                                                        linearLayout2.addView(a2Var4, w7.x5.n(32, 32));
                                                        a2 a2Var5 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var);
                                                        a2Var5.e = 4;
                                                        a2Var5.e();
                                                        a2Var5.b();
                                                        a2Var5.c(i42);
                                                        linearLayout2.addView(a2Var5, w7.x5.n(32, 32));
                                                        a2 a2Var6 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var);
                                                        a2Var6.e = 4;
                                                        a2Var6.e();
                                                        a2Var6.b();
                                                        a2Var6.c(i42);
                                                        final a2[] a2VarArr2 = {a2Var4, a2Var5, a2Var6};
                                                        linearLayout2.addView(a2Var6, w7.x5.n(32, 32));
                                                        E.q(linearLayout);
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
                                                                i21 = i44;
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
                                                                        i21 = -1;
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
                                                        i22 = 0;
                                                        while (i22 < 3) {
                                                            a2VarArr[i22].setSelected(i22 == i43);
                                                            i22++;
                                                        }
                                                        i24 = 0;
                                                        while (i24 < 3) {
                                                            a2VarArr2[i24].setSelected(i24 == i21);
                                                            i24++;
                                                        }
                                                        for (i25 = 0; i25 < 3; i25++) {
                                                            final int i45 = 0;
                                                            a2VarArr[i25].setOnClickListener(new View.OnClickListener() { // from class: ii.m2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i45) {
                                                                        case 0:
                                                                            q5 q5Var3 = q5Var2;
                                                                            s5 s5Var = q5Var3.v;
                                                                            Iterator it9 = q5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i46 = i25;
                                                                                if (!hasNext) {
                                                                                    s5Var.invalidate();
                                                                                    d3 d3Var = q5Var3.E;
                                                                                    if (d3Var != null && q5Var3.a != null) {
                                                                                        d3Var.a();
                                                                                    }
                                                                                    int i47 = 0;
                                                                                    while (i47 < 3) {
                                                                                        a2VarArr[i47].setSelected(i47 == i46);
                                                                                        i47++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    j6.k(pagetablecell4, i46);
                                                                                    t5 m10 = s5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            q5 q5Var4 = q5Var2;
                                                                            s5 s5Var2 = q5Var4.v;
                                                                            Iterator it10 = q5Var4.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i48 = i25;
                                                                                if (!hasNext2) {
                                                                                    s5Var2.invalidate();
                                                                                    d3 d3Var2 = q5Var4.E;
                                                                                    if (d3Var2 != null && q5Var4.a != null) {
                                                                                        d3Var2.a();
                                                                                    }
                                                                                    int i49 = 0;
                                                                                    while (i49 < 3) {
                                                                                        a2VarArr[i49].setSelected(i49 == i48);
                                                                                        i49++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    j6.m(pagetablecell5, i48);
                                                                                    t5 m11 = s5Var2.m(pagetablecell5);
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
                                                        i26 = 0;
                                                        for (i23 = 3; i26 < i23; i23 = 3) {
                                                            final int i46 = 1;
                                                            a2VarArr2[i26].setOnClickListener(new View.OnClickListener() { // from class: ii.m2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i46) {
                                                                        case 0:
                                                                            q5 q5Var3 = q5Var2;
                                                                            s5 s5Var = q5Var3.v;
                                                                            Iterator it9 = q5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i462 = i26;
                                                                                if (!hasNext) {
                                                                                    s5Var.invalidate();
                                                                                    d3 d3Var = q5Var3.E;
                                                                                    if (d3Var != null && q5Var3.a != null) {
                                                                                        d3Var.a();
                                                                                    }
                                                                                    int i47 = 0;
                                                                                    while (i47 < 3) {
                                                                                        a2VarArr2[i47].setSelected(i47 == i462);
                                                                                        i47++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    j6.k(pagetablecell4, i462);
                                                                                    t5 m10 = s5Var.m(pagetablecell4);
                                                                                    if (m10 != null && m10.b != null) {
                                                                                        m10.a();
                                                                                        m10.invalidate();
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        default:
                                                                            q5 q5Var4 = q5Var2;
                                                                            s5 s5Var2 = q5Var4.v;
                                                                            Iterator it10 = q5Var4.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext2 = it10.hasNext();
                                                                                int i48 = i26;
                                                                                if (!hasNext2) {
                                                                                    s5Var2.invalidate();
                                                                                    d3 d3Var2 = q5Var4.E;
                                                                                    if (d3Var2 != null && q5Var4.a != null) {
                                                                                        d3Var2.a();
                                                                                    }
                                                                                    int i49 = 0;
                                                                                    while (i49 < 3) {
                                                                                        a2VarArr2[i49].setSelected(i49 == i48);
                                                                                        i49++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    j6.m(pagetablecell5, i48);
                                                                                    t5 m11 = s5Var2.m(pagetablecell5);
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
                                                            i26++;
                                                        }
                                                        E.o();
                                                        E.S = 208;
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
                                                            final int i47 = 5;
                                                            E.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i47), false);
                                                            if (i18 != 0) {
                                                                final int i48 = 2;
                                                                E.c(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i48) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i49 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i49 = Math.min(i49, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i50 = 0;
                                                                                                for (int i51 = 0; i51 < j6Var.b; i51++) {
                                                                                                    iArr2[i51] = i50;
                                                                                                    if (!zArr[i51]) {
                                                                                                        i50++;
                                                                                                    }
                                                                                                }
                                                                                                if (i50 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i52 = 0;
                                                                                                    while (i52 < size2) {
                                                                                                        Object obj = arrayList2.get(i52);
                                                                                                        i52++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i53 = pagetablecell4.colspan;
                                                                                                        if (i53 == 0) {
                                                                                                            i53 = 1;
                                                                                                        }
                                                                                                        int i54 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i54 < 0) {
                                                                                                                    i54 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i54 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], a10, i55, i53});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i50);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i49, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i19 != 0) {
                                                                final int i49 = 3;
                                                                E.c(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i49) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i50 = 0;
                                                                                                for (int i51 = 0; i51 < j6Var.b; i51++) {
                                                                                                    iArr2[i51] = i50;
                                                                                                    if (!zArr[i51]) {
                                                                                                        i50++;
                                                                                                    }
                                                                                                }
                                                                                                if (i50 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i52 = 0;
                                                                                                    while (i52 < size2) {
                                                                                                        Object obj = arrayList2.get(i52);
                                                                                                        i52++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i53 = pagetablecell4.colspan;
                                                                                                        if (i53 == 0) {
                                                                                                            i53 = 1;
                                                                                                        }
                                                                                                        int i54 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i54 < 0) {
                                                                                                                    i54 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i54 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], a10, i55, i53});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i50);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i15 != 0) {
                                                                final int i50 = 4;
                                                                E.c(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i50) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i51 = 0; i51 < j6Var.b; i51++) {
                                                                                                    iArr2[i51] = i502;
                                                                                                    if (!zArr[i51]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i52 = 0;
                                                                                                    while (i52 < size2) {
                                                                                                        Object obj = arrayList2.get(i52);
                                                                                                        i52++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i53 = pagetablecell4.colspan;
                                                                                                        if (i53 == 0) {
                                                                                                            i53 = 1;
                                                                                                        }
                                                                                                        int i54 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i54 < 0) {
                                                                                                                    i54 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i54 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], a10, i55, i53});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                E.c(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i47) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i51 = 0; i51 < j6Var.b; i51++) {
                                                                                                    iArr2[i51] = i502;
                                                                                                    if (!zArr[i51]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i52 = 0;
                                                                                                    while (i52 < size2) {
                                                                                                        Object obj = arrayList2.get(i52);
                                                                                                        i52++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i53 = pagetablecell4.colspan;
                                                                                                        if (i53 == 0) {
                                                                                                            i53 = 1;
                                                                                                        }
                                                                                                        int i54 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i54 < 0) {
                                                                                                                    i54 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i54 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], a10, i55, i53});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i16 != 0) {
                                                                final int i51 = 6;
                                                                E.c(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i51) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i512 = 0; i512 < j6Var.b; i512++) {
                                                                                                    iArr2[i512] = i502;
                                                                                                    if (!zArr[i512]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i52 = 0;
                                                                                                    while (i52 < size2) {
                                                                                                        Object obj = arrayList2.get(i52);
                                                                                                        i52++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i53 = pagetablecell4.colspan;
                                                                                                        if (i53 == 0) {
                                                                                                            i53 = 1;
                                                                                                        }
                                                                                                        int i54 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i54 < 0) {
                                                                                                                    i54 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i54 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], a10, i55, i53});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i52 = 7;
                                                                E.c(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i52) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i512 = 0; i512 < j6Var.b; i512++) {
                                                                                                    iArr2[i512] = i502;
                                                                                                    if (!zArr[i512]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i522 = 0;
                                                                                                    while (i522 < size2) {
                                                                                                        Object obj = arrayList2.get(i522);
                                                                                                        i522++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i53 = pagetablecell4.colspan;
                                                                                                        if (i53 == 0) {
                                                                                                            i53 = 1;
                                                                                                        }
                                                                                                        int i54 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i54 < 0) {
                                                                                                                    i54 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i54 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i54], a10, i55, i53});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i17 == 0) {
                                                                int i53 = R.drawable.iv_table_remove;
                                                                String string2 = LocaleController.getString(R.string.ArticleDeleteColumn);
                                                                final int i54 = 8;
                                                                Runnable runnable = new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i54) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i512 = 0; i512 < j6Var.b; i512++) {
                                                                                                    iArr2[i512] = i502;
                                                                                                    if (!zArr[i512]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i522 = 0;
                                                                                                    while (i522 < size2) {
                                                                                                        Object obj = arrayList2.get(i522);
                                                                                                        i522++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i532 = pagetablecell4.colspan;
                                                                                                        if (i532 == 0) {
                                                                                                            i532 = 1;
                                                                                                        }
                                                                                                        int i542 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i55 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i542 < 0) {
                                                                                                                    i542 = i56;
                                                                                                                }
                                                                                                                i55++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i542 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i542], a10, i55, i532});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                };
                                                                r62 = 1;
                                                                E.c(i53, string2, runnable, true);
                                                            } else {
                                                                r62 = 1;
                                                            }
                                                            if (i20 != 0) {
                                                                final int i55 = 0;
                                                                E.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (i55) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i512 = 0; i512 < j6Var.b; i512++) {
                                                                                                    iArr2[i512] = i502;
                                                                                                    if (!zArr[i512]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i522 = 0;
                                                                                                    while (i522 < size2) {
                                                                                                        Object obj = arrayList2.get(i522);
                                                                                                        i522++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i532 = pagetablecell4.colspan;
                                                                                                        if (i532 == 0) {
                                                                                                            i532 = 1;
                                                                                                        }
                                                                                                        int i542 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i552 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i542 < 0) {
                                                                                                                    i542 = i56;
                                                                                                                }
                                                                                                                i552++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i542 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i542], a10, i552, i532});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r62);
                                                            }
                                                            if (z15) {
                                                                E.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) { // from class: ii.n2
                                                                    public final /* synthetic */ x3 b;

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
                                                                        x3 x3Var;
                                                                        boolean z21;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z22;
                                                                        switch (r62) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                q5 q5Var3 = q5Var2;
                                                                                LinkedHashSet linkedHashSet3 = q5Var3.H;
                                                                                if (q5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i492 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = q5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i492 = Math.min(i492, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    j6 j6Var = q5Var3.F;
                                                                                    j6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z21 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[j6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z21 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < j6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[j6Var.b];
                                                                                                int i502 = 0;
                                                                                                for (int i512 = 0; i512 < j6Var.b; i512++) {
                                                                                                    iArr2[i512] = i502;
                                                                                                    if (!zArr[i512]) {
                                                                                                        i502++;
                                                                                                    }
                                                                                                }
                                                                                                if (i502 == 0) {
                                                                                                    j6Var.a.rows.clear();
                                                                                                    j6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = j6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i522 = 0;
                                                                                                    while (i522 < size2) {
                                                                                                        Object obj = arrayList2.get(i522);
                                                                                                        i522++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = j6Var.b(pagetablecell4);
                                                                                                        int a10 = j6Var.a(pagetablecell4);
                                                                                                        int o10 = j6.o(pagetablecell4);
                                                                                                        int i532 = pagetablecell4.colspan;
                                                                                                        if (i532 == 0) {
                                                                                                            i532 = 1;
                                                                                                        }
                                                                                                        int i542 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i552 = 0;
                                                                                                        for (int i56 = b13; i56 < b13 + o10 && i56 < j6Var.b; i56++) {
                                                                                                            if (!zArr[i56]) {
                                                                                                                if (i542 < 0) {
                                                                                                                    i542 = i56;
                                                                                                                }
                                                                                                                i552++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i542 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i542], a10, i552, i532});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    j6Var.j(identityHashMap, i502);
                                                                                                    j6Var.i();
                                                                                                    z21 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var3.v();
                                                                                    if (z21) {
                                                                                        q5Var3.q(i492, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.N2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = q5Var2.getRow();
                                                                                x3Var5.N2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.H3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.s4(row);
                                                                                    i2 i2Var2 = x3Var5.H3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.f3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                q5 q5Var4 = q5Var2;
                                                                                LinkedHashSet linkedHashSet4 = q5Var4.H;
                                                                                if (q5Var4.F != null) {
                                                                                    char c10 = 2;
                                                                                    if (linkedHashSet4.size() >= 2) {
                                                                                        HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                        Iterator it12 = hashSet8.iterator();
                                                                                        int i57 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i58 = Integer.MAX_VALUE;
                                                                                        int i59 = Integer.MAX_VALUE;
                                                                                        while (it12.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                            i58 = Math.min(i58, q5Var4.F.b(pagetablecell5));
                                                                                            i59 = Math.min(i59, q5Var4.F.a(pagetablecell5));
                                                                                        }
                                                                                        linkedHashSet4.clear();
                                                                                        j6 j6Var2 = q5Var4.F;
                                                                                        TL_iv.pageBlockTable pageblocktable2 = j6Var2.a;
                                                                                        if (hashSet8.size() >= 2) {
                                                                                            Iterator it13 = hashSet8.iterator();
                                                                                            int i60 = -1;
                                                                                            int i61 = -1;
                                                                                            int i62 = Integer.MAX_VALUE;
                                                                                            while (it13.hasNext()) {
                                                                                                TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                                char c11 = c10;
                                                                                                int b14 = j6Var2.b(pagetablecell6);
                                                                                                int a11 = j6Var2.a(pagetablecell6);
                                                                                                int o11 = j6.o(pagetablecell6);
                                                                                                int i63 = pagetablecell6.colspan;
                                                                                                if (i63 == 0) {
                                                                                                    i63 = 1;
                                                                                                }
                                                                                                i57 = Math.min(i57, b14);
                                                                                                i62 = Math.min(i62, a11);
                                                                                                i60 = Math.max(i60, (b14 + o11) - 1);
                                                                                                i61 = Math.max(i61, (a11 + i63) - 1);
                                                                                                c10 = c11;
                                                                                            }
                                                                                            HashSet hashSet9 = new HashSet();
                                                                                            int i64 = i57;
                                                                                            while (true) {
                                                                                                if (i64 <= i60) {
                                                                                                    for (int i65 = i62; i65 <= i61; i65++) {
                                                                                                        if (i64 >= 0 && i65 >= 0 && i64 < j6Var2.b && i65 < j6Var2.c) {
                                                                                                            hashSet9.add(j6Var2.d[i64][i65]);
                                                                                                        }
                                                                                                    }
                                                                                                    i64++;
                                                                                                } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                    StringBuilder sb2 = new StringBuilder();
                                                                                                    ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                    Collections.sort(arrayList3, new f8(j6Var2, 2));
                                                                                                    int size3 = arrayList3.size();
                                                                                                    int i66 = 0;
                                                                                                    while (i66 < size3) {
                                                                                                        Object obj2 = arrayList3.get(i66);
                                                                                                        i66++;
                                                                                                        String g10 = j6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                    TL_iv.pageTableCell pagetablecell7 = j6Var2.d[i57][i62];
                                                                                                    int i67 = (i61 - i62) + 1;
                                                                                                    int i68 = (i60 - i57) + 1;
                                                                                                    if (i67 <= 1) {
                                                                                                        i67 = 0;
                                                                                                    }
                                                                                                    pagetablecell7.colspan = i67;
                                                                                                    int i69 = i68 > 1 ? i68 : 0;
                                                                                                    pagetablecell7.rowspan = i69;
                                                                                                    int i70 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i67 > 0 ? i70 | 2 : i70 & (-3);
                                                                                                    int i71 = pagetablecell7.flags;
                                                                                                    pagetablecell7.flags = i69 > 0 ? i71 | 4 : i71 & (-5);
                                                                                                    j6.c(pagetablecell7, sb2.toString());
                                                                                                    Iterator it14 = hashSet9.iterator();
                                                                                                    while (it14.hasNext()) {
                                                                                                        TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                        if (pagetablecell8 != pagetablecell7 && (b11 = j6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                            pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                        }
                                                                                                    }
                                                                                                    j6Var2.i();
                                                                                                    q5Var4.v();
                                                                                                    q5Var4.v.invalidate();
                                                                                                    q5Var4.q(i58, i59);
                                                                                                    q5Var4.t();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        linkedHashSet4.addAll(hashSet8);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 3:
                                                                                q5 q5Var5 = q5Var2;
                                                                                LinkedHashSet linkedHashSet5 = q5Var5.H;
                                                                                if (q5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (j6.n(pagetablecell9) <= 1) {
                                                                                        int i72 = pagetablecell9.rowspan;
                                                                                        if (i72 == 0) {
                                                                                            i72 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = q5Var5.F.b(pagetablecell9);
                                                                                    int a12 = q5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (q5Var5.F.p(pagetablecell9)) {
                                                                                        q5Var5.v();
                                                                                        q5Var5.v.invalidate();
                                                                                        q5Var5.q(b15, a12);
                                                                                        q5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.N2();
                                                                                break;
                                                                            case 4:
                                                                                q5Var2.i(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 5:
                                                                                q5Var2.i(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 6:
                                                                                q5Var2.j(true);
                                                                                this.b.N2();
                                                                                break;
                                                                            case 7:
                                                                                q5Var2.j(false);
                                                                                this.b.N2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                q5 q5Var6 = q5Var2;
                                                                                LinkedHashSet linkedHashSet6 = q5Var6.H;
                                                                                if (q5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i73 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = q5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i73 = Math.min(i73, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    j6 j6Var3 = q5Var6.F;
                                                                                    j6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[j6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < j6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[j6Var3.c];
                                                                                                int i74 = 0;
                                                                                                for (int i75 = 0; i75 < j6Var3.c; i75++) {
                                                                                                    iArr4[i75] = i74;
                                                                                                    if (!zArr2[i75]) {
                                                                                                        i74++;
                                                                                                    }
                                                                                                }
                                                                                                if (i74 == 0) {
                                                                                                    j6Var3.a.rows.clear();
                                                                                                    j6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = j6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i76 = 0;
                                                                                                    while (i76 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i76);
                                                                                                        i76++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = j6Var3.b(pagetablecell10);
                                                                                                        int a14 = j6Var3.a(pagetablecell10);
                                                                                                        int o12 = j6.o(pagetablecell10);
                                                                                                        int i77 = pagetablecell10.colspan;
                                                                                                        if (i77 == 0) {
                                                                                                            i77 = 1;
                                                                                                        }
                                                                                                        int i78 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i79 = 0;
                                                                                                        for (int i80 = a14; i80 < a14 + i77 && i80 < j6Var3.c; i80++) {
                                                                                                            if (!zArr3[i80]) {
                                                                                                                if (i78 < 0) {
                                                                                                                    i78 = i80;
                                                                                                                }
                                                                                                                i79++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i78 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i78], o12, i79});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    j6Var3.j(identityHashMap2, j6Var3.b);
                                                                                                    j6Var3.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    q5Var6.v();
                                                                                    if (z22) {
                                                                                        q5Var6.q(0, i73);
                                                                                    }
                                                                                }
                                                                                x3Var2.N2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r62);
                                                                E.o();
                                                                final int i56 = 0;
                                                                E.i(new Runnable() { // from class: ii.o2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i56) {
                                                                            case 0:
                                                                                E.n0 = true;
                                                                                boolean z21 = !model.a.bordered;
                                                                                q5 q5Var3 = q5Var2;
                                                                                j6 j6Var = q5Var3.F;
                                                                                if (j6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = j6Var.a;
                                                                                    if (pageblocktable2.bordered != z21) {
                                                                                        pageblocktable2.bordered = z21;
                                                                                        q5Var3.v.invalidate();
                                                                                        d3 d3Var = q5Var3.E;
                                                                                        if (d3Var != null && q5Var3.a != null) {
                                                                                            d3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z21);
                                                                                break;
                                                                            default:
                                                                                E.n0 = true;
                                                                                boolean z22 = !model.a.compact;
                                                                                q5 q5Var4 = q5Var2;
                                                                                j6 j6Var2 = q5Var4.F;
                                                                                if (j6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = j6Var2.a;
                                                                                    if (pageblocktable3.compact != z22) {
                                                                                        pageblocktable3.compact = z22;
                                                                                        s5 s5Var = q5Var4.v;
                                                                                        if (s5Var.a != null) {
                                                                                            for (int i57 = 0; i57 < s5Var.getChildCount(); i57++) {
                                                                                                View childAt = s5Var.getChildAt(i57);
                                                                                                if (childAt instanceof t5) {
                                                                                                    ((t5) childAt).setCompact(s5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            s5Var.requestLayout();
                                                                                            s5Var.invalidate();
                                                                                        }
                                                                                        q5Var4.w.requestLayout();
                                                                                        q5Var4.requestLayout();
                                                                                        d3 d3Var2 = q5Var4.E;
                                                                                        if (d3Var2 != null && q5Var4.a != null) {
                                                                                            d3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z22);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
                                                                final int i57 = 1;
                                                                q5Var2 = q5Var;
                                                                E.i(new Runnable() { // from class: ii.o2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i57) {
                                                                            case 0:
                                                                                E.n0 = true;
                                                                                boolean z21 = !model.a.bordered;
                                                                                q5 q5Var3 = q5Var2;
                                                                                j6 j6Var = q5Var3.F;
                                                                                if (j6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = j6Var.a;
                                                                                    if (pageblocktable2.bordered != z21) {
                                                                                        pageblocktable2.bordered = z21;
                                                                                        q5Var3.v.invalidate();
                                                                                        d3 d3Var = q5Var3.E;
                                                                                        if (d3Var != null && q5Var3.a != null) {
                                                                                            d3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z21);
                                                                                break;
                                                                            default:
                                                                                E.n0 = true;
                                                                                boolean z22 = !model.a.compact;
                                                                                q5 q5Var4 = q5Var2;
                                                                                j6 j6Var2 = q5Var4.F;
                                                                                if (j6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = j6Var2.a;
                                                                                    if (pageblocktable3.compact != z22) {
                                                                                        pageblocktable3.compact = z22;
                                                                                        s5 s5Var = q5Var4.v;
                                                                                        if (s5Var.a != null) {
                                                                                            for (int i572 = 0; i572 < s5Var.getChildCount(); i572++) {
                                                                                                View childAt = s5Var.getChildAt(i572);
                                                                                                if (childAt instanceof t5) {
                                                                                                    ((t5) childAt).setCompact(s5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            s5Var.requestLayout();
                                                                                            s5Var.invalidate();
                                                                                        }
                                                                                        q5Var4.w.requestLayout();
                                                                                        q5Var4.requestLayout();
                                                                                        d3 d3Var2 = q5Var4.E;
                                                                                        if (d3Var2 != null && q5Var4.a != null) {
                                                                                            d3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z22);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
                                                                final org.telegram.ui.ActionBar.f1[] f1VarArr = {E.y(), E.y()};
                                                            }
                                                            E.p = new gg.t(this, E, q5Var2, 15);
                                                            this.h4 = E;
                                                            E.Z();
                                                        }
                                                        z16 = false;
                                                        if (!z16) {
                                                        }
                                                        final int i472 = 5;
                                                        E.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i472), false);
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
                                                        E.p = new gg.t(this, E, q5Var2, 15);
                                                        this.h4 = E;
                                                        E.Z();
                                                    }
                                                }
                                                i14 = 0;
                                                if (z13) {
                                                }
                                                if (z13) {
                                                }
                                                p80Var = this.h4;
                                                if (p80Var != null) {
                                                }
                                                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                FrameLayout Q422 = Q4(q5Var2, false);
                                                i17 = i14;
                                                iArr = new int[2];
                                                Q422.getLocationOnScreen(iArr);
                                                if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                                }
                                                final p80 E2 = this.f3.E(Q4);
                                                E2.s = 0;
                                                E2.t = false;
                                                E2.Z = z14;
                                                LinearLayout linearLayout3 = new LinearLayout(getContext());
                                                linearLayout3.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                linearLayout3.setOrientation(1);
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                i18 = i10;
                                                textView2.setTextSize(1, 12.0f);
                                                textView2.setGravity(17);
                                                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
                                                linearLayout3.addView(textView2, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout22 = new LinearLayout(getContext());
                                                i19 = i11;
                                                i20 = i13;
                                                linearLayout22.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                linearLayout22.setOrientation(0);
                                                linearLayout3.addView(linearLayout22, w7.x5.q(-2, -2, 17));
                                                Context context2 = getContext();
                                                int i412 = R.drawable.iv_align_horiz_left;
                                                org.telegram.ui.ActionBar.e6 e6Var2 = this.e3;
                                                a2 a2Var7 = new a2(context2, i412, e6Var2);
                                                a2Var7.e = 4;
                                                a2Var7.e();
                                                a2Var7.b();
                                                int i422 = org.telegram.ui.ActionBar.i6.G8;
                                                a2Var7.c(i422);
                                                boolean z192 = z10;
                                                linearLayout22.addView(a2Var7, w7.x5.n(32, 32));
                                                a2 a2Var22 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var2);
                                                a2Var22.e = 4;
                                                a2Var22.e();
                                                a2Var22.b();
                                                a2Var22.c(i422);
                                                linearLayout22.addView(a2Var22, w7.x5.n(32, 32));
                                                a2 a2Var32 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var2);
                                                a2Var32.e = 4;
                                                a2Var32.e();
                                                a2Var32.b();
                                                a2Var32.c(i422);
                                                final a2[] a2VarArr3 = {a2Var7, a2Var22, a2Var32};
                                                boolean z202 = z11;
                                                linearLayout22.addView(a2Var32, w7.x5.n(32, 32));
                                                z15 = z12;
                                                linearLayout22.addView(new Space(getContext()), w7.x5.n(8, 0));
                                                a2 a2Var42 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var2);
                                                a2Var42.e = 4;
                                                a2Var42.e();
                                                a2Var42.b();
                                                a2Var42.c(i422);
                                                linearLayout22.addView(a2Var42, w7.x5.n(32, 32));
                                                a2 a2Var52 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var2);
                                                a2Var52.e = 4;
                                                a2Var52.e();
                                                a2Var52.b();
                                                a2Var52.c(i422);
                                                linearLayout22.addView(a2Var52, w7.x5.n(32, 32));
                                                a2 a2Var62 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var2);
                                                a2Var62.e = 4;
                                                a2Var62.e();
                                                a2Var62.b();
                                                a2Var62.c(i422);
                                                final a2[] a2VarArr22 = {a2Var42, a2Var52, a2Var62};
                                                linearLayout22.addView(a2Var62, w7.x5.n(32, 32));
                                                E2.q(linearLayout3);
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
                                                i22 = 0;
                                                while (i22 < 3) {
                                                }
                                                i24 = 0;
                                                while (i24 < 3) {
                                                }
                                                while (i25 < 3) {
                                                }
                                                i26 = 0;
                                                while (i26 < i23) {
                                                }
                                                E2.o();
                                                E2.S = 208;
                                                if (!linkedHashSet.isEmpty()) {
                                                }
                                                z16 = false;
                                                if (!z16) {
                                                }
                                                final int i4722 = 5;
                                                E2.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i4722), false);
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
                                                E2.p = new gg.t(this, E2, q5Var2, 15);
                                                this.h4 = E2;
                                                E2.Z();
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
                                        p80Var = this.h4;
                                        if (p80Var != null) {
                                        }
                                        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                        FrameLayout Q4222 = Q4(q5Var2, false);
                                        i17 = i14;
                                        iArr = new int[2];
                                        Q4222.getLocationOnScreen(iArr);
                                        if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                        }
                                        final p80 E22 = this.f3.E(Q4);
                                        E22.s = 0;
                                        E22.t = false;
                                        E22.Z = z14;
                                        LinearLayout linearLayout32 = new LinearLayout(getContext());
                                        linearLayout32.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                        linearLayout32.setOrientation(1);
                                        TextView textView22 = new TextView(getContext());
                                        textView22.setText(LocaleController.getString(R.string.ArticleAlignment));
                                        i18 = i10;
                                        textView22.setTextSize(1, 12.0f);
                                        textView22.setGravity(17);
                                        textView22.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
                                        linearLayout32.addView(textView22, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout222 = new LinearLayout(getContext());
                                        i19 = i11;
                                        i20 = i13;
                                        linearLayout222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                        linearLayout222.setOrientation(0);
                                        linearLayout32.addView(linearLayout222, w7.x5.q(-2, -2, 17));
                                        Context context22 = getContext();
                                        int i4122 = R.drawable.iv_align_horiz_left;
                                        org.telegram.ui.ActionBar.e6 e6Var22 = this.e3;
                                        a2 a2Var72 = new a2(context22, i4122, e6Var22);
                                        a2Var72.e = 4;
                                        a2Var72.e();
                                        a2Var72.b();
                                        int i4222 = org.telegram.ui.ActionBar.i6.G8;
                                        a2Var72.c(i4222);
                                        boolean z1922 = z10;
                                        linearLayout222.addView(a2Var72, w7.x5.n(32, 32));
                                        a2 a2Var222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var22);
                                        a2Var222.e = 4;
                                        a2Var222.e();
                                        a2Var222.b();
                                        a2Var222.c(i4222);
                                        linearLayout222.addView(a2Var222, w7.x5.n(32, 32));
                                        a2 a2Var322 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var22);
                                        a2Var322.e = 4;
                                        a2Var322.e();
                                        a2Var322.b();
                                        a2Var322.c(i4222);
                                        final a2[] a2VarArr32 = {a2Var72, a2Var222, a2Var322};
                                        boolean z2022 = z11;
                                        linearLayout222.addView(a2Var322, w7.x5.n(32, 32));
                                        z15 = z12;
                                        linearLayout222.addView(new Space(getContext()), w7.x5.n(8, 0));
                                        a2 a2Var422 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var22);
                                        a2Var422.e = 4;
                                        a2Var422.e();
                                        a2Var422.b();
                                        a2Var422.c(i4222);
                                        linearLayout222.addView(a2Var422, w7.x5.n(32, 32));
                                        a2 a2Var522 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var22);
                                        a2Var522.e = 4;
                                        a2Var522.e();
                                        a2Var522.b();
                                        a2Var522.c(i4222);
                                        linearLayout222.addView(a2Var522, w7.x5.n(32, 32));
                                        a2 a2Var622 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var22);
                                        a2Var622.e = 4;
                                        a2Var622.e();
                                        a2Var622.b();
                                        a2Var622.c(i4222);
                                        final a2[] a2VarArr222 = {a2Var422, a2Var522, a2Var622};
                                        linearLayout222.addView(a2Var622, w7.x5.n(32, 32));
                                        E22.q(linearLayout32);
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
                                        i22 = 0;
                                        while (i22 < 3) {
                                        }
                                        i24 = 0;
                                        while (i24 < 3) {
                                        }
                                        while (i25 < 3) {
                                        }
                                        i26 = 0;
                                        while (i26 < i23) {
                                        }
                                        E22.o();
                                        E22.S = 208;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z16 = false;
                                        if (!z16) {
                                        }
                                        final int i47222 = 5;
                                        E22.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i47222), false);
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
                                        E22.p = new gg.t(this, E22, q5Var2, 15);
                                        this.h4 = E22;
                                        E22.Z();
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
                                    p80Var = this.h4;
                                    if (p80Var != null) {
                                    }
                                    dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                    FrameLayout Q42222 = Q4(q5Var2, false);
                                    i17 = i14;
                                    iArr = new int[2];
                                    Q42222.getLocationOnScreen(iArr);
                                    if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                    }
                                    final p80 E222 = this.f3.E(Q4);
                                    E222.s = 0;
                                    E222.t = false;
                                    E222.Z = z14;
                                    LinearLayout linearLayout322 = new LinearLayout(getContext());
                                    linearLayout322.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                    linearLayout322.setOrientation(1);
                                    TextView textView222 = new TextView(getContext());
                                    textView222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                    i18 = i10;
                                    textView222.setTextSize(1, 12.0f);
                                    textView222.setGravity(17);
                                    textView222.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
                                    linearLayout322.addView(textView222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                    LinearLayout linearLayout2222 = new LinearLayout(getContext());
                                    i19 = i11;
                                    i20 = i13;
                                    linearLayout2222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    linearLayout2222.setOrientation(0);
                                    linearLayout322.addView(linearLayout2222, w7.x5.q(-2, -2, 17));
                                    Context context222 = getContext();
                                    int i41222 = R.drawable.iv_align_horiz_left;
                                    org.telegram.ui.ActionBar.e6 e6Var222 = this.e3;
                                    a2 a2Var722 = new a2(context222, i41222, e6Var222);
                                    a2Var722.e = 4;
                                    a2Var722.e();
                                    a2Var722.b();
                                    int i42222 = org.telegram.ui.ActionBar.i6.G8;
                                    a2Var722.c(i42222);
                                    boolean z19222 = z10;
                                    linearLayout2222.addView(a2Var722, w7.x5.n(32, 32));
                                    a2 a2Var2222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var222);
                                    a2Var2222.e = 4;
                                    a2Var2222.e();
                                    a2Var2222.b();
                                    a2Var2222.c(i42222);
                                    linearLayout2222.addView(a2Var2222, w7.x5.n(32, 32));
                                    a2 a2Var3222 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var222);
                                    a2Var3222.e = 4;
                                    a2Var3222.e();
                                    a2Var3222.b();
                                    a2Var3222.c(i42222);
                                    final a2[] a2VarArr322 = {a2Var722, a2Var2222, a2Var3222};
                                    boolean z20222 = z11;
                                    linearLayout2222.addView(a2Var3222, w7.x5.n(32, 32));
                                    z15 = z12;
                                    linearLayout2222.addView(new Space(getContext()), w7.x5.n(8, 0));
                                    a2 a2Var4222 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var222);
                                    a2Var4222.e = 4;
                                    a2Var4222.e();
                                    a2Var4222.b();
                                    a2Var4222.c(i42222);
                                    linearLayout2222.addView(a2Var4222, w7.x5.n(32, 32));
                                    a2 a2Var5222 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var222);
                                    a2Var5222.e = 4;
                                    a2Var5222.e();
                                    a2Var5222.b();
                                    a2Var5222.c(i42222);
                                    linearLayout2222.addView(a2Var5222, w7.x5.n(32, 32));
                                    a2 a2Var6222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var222);
                                    a2Var6222.e = 4;
                                    a2Var6222.e();
                                    a2Var6222.b();
                                    a2Var6222.c(i42222);
                                    final a2[] a2VarArr2222 = {a2Var4222, a2Var5222, a2Var6222};
                                    linearLayout2222.addView(a2Var6222, w7.x5.n(32, 32));
                                    E222.q(linearLayout322);
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
                                    i22 = 0;
                                    while (i22 < 3) {
                                    }
                                    i24 = 0;
                                    while (i24 < 3) {
                                    }
                                    while (i25 < 3) {
                                    }
                                    i26 = 0;
                                    while (i26 < i23) {
                                    }
                                    E222.o();
                                    E222.S = 208;
                                    if (!linkedHashSet.isEmpty()) {
                                    }
                                    z16 = false;
                                    if (!z16) {
                                    }
                                    final int i472222 = 5;
                                    E222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i472222), false);
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
                                    E222.p = new gg.t(this, E222, q5Var2, 15);
                                    this.h4 = E222;
                                    E222.Z();
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
                                p80Var = this.h4;
                                if (p80Var != null) {
                                }
                                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                FrameLayout Q422222 = Q4(q5Var2, false);
                                i17 = i14;
                                iArr = new int[2];
                                Q422222.getLocationOnScreen(iArr);
                                if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                                }
                                final p80 E2222 = this.f3.E(Q4);
                                E2222.s = 0;
                                E2222.t = false;
                                E2222.Z = z14;
                                LinearLayout linearLayout3222 = new LinearLayout(getContext());
                                linearLayout3222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                linearLayout3222.setOrientation(1);
                                TextView textView2222 = new TextView(getContext());
                                textView2222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                i18 = i10;
                                textView2222.setTextSize(1, 12.0f);
                                textView2222.setGravity(17);
                                textView2222.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
                                linearLayout3222.addView(textView2222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout22222 = new LinearLayout(getContext());
                                i19 = i11;
                                i20 = i13;
                                linearLayout22222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                linearLayout22222.setOrientation(0);
                                linearLayout3222.addView(linearLayout22222, w7.x5.q(-2, -2, 17));
                                Context context2222 = getContext();
                                int i412222 = R.drawable.iv_align_horiz_left;
                                org.telegram.ui.ActionBar.e6 e6Var2222 = this.e3;
                                a2 a2Var7222 = new a2(context2222, i412222, e6Var2222);
                                a2Var7222.e = 4;
                                a2Var7222.e();
                                a2Var7222.b();
                                int i422222 = org.telegram.ui.ActionBar.i6.G8;
                                a2Var7222.c(i422222);
                                boolean z192222 = z10;
                                linearLayout22222.addView(a2Var7222, w7.x5.n(32, 32));
                                a2 a2Var22222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var2222);
                                a2Var22222.e = 4;
                                a2Var22222.e();
                                a2Var22222.b();
                                a2Var22222.c(i422222);
                                linearLayout22222.addView(a2Var22222, w7.x5.n(32, 32));
                                a2 a2Var32222 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var2222);
                                a2Var32222.e = 4;
                                a2Var32222.e();
                                a2Var32222.b();
                                a2Var32222.c(i422222);
                                final a2[] a2VarArr3222 = {a2Var7222, a2Var22222, a2Var32222};
                                boolean z202222 = z11;
                                linearLayout22222.addView(a2Var32222, w7.x5.n(32, 32));
                                z15 = z12;
                                linearLayout22222.addView(new Space(getContext()), w7.x5.n(8, 0));
                                a2 a2Var42222 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var2222);
                                a2Var42222.e = 4;
                                a2Var42222.e();
                                a2Var42222.b();
                                a2Var42222.c(i422222);
                                linearLayout22222.addView(a2Var42222, w7.x5.n(32, 32));
                                a2 a2Var52222 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var2222);
                                a2Var52222.e = 4;
                                a2Var52222.e();
                                a2Var52222.b();
                                a2Var52222.c(i422222);
                                linearLayout22222.addView(a2Var52222, w7.x5.n(32, 32));
                                a2 a2Var62222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var2222);
                                a2Var62222.e = 4;
                                a2Var62222.e();
                                a2Var62222.b();
                                a2Var62222.c(i422222);
                                final a2[] a2VarArr22222 = {a2Var42222, a2Var52222, a2Var62222};
                                linearLayout22222.addView(a2Var62222, w7.x5.n(32, 32));
                                E2222.q(linearLayout3222);
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
                                i22 = 0;
                                while (i22 < 3) {
                                }
                                i24 = 0;
                                while (i24 < 3) {
                                }
                                while (i25 < 3) {
                                }
                                i26 = 0;
                                while (i26 < i23) {
                                }
                                E2222.o();
                                E2222.S = 208;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z16 = false;
                                if (!z16) {
                                }
                                final int i4722222 = 5;
                                E2222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i4722222), false);
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
                                E2222.p = new gg.t(this, E2222, q5Var2, 15);
                                this.h4 = E2222;
                                E2222.Z();
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
                p80Var = this.h4;
                if (p80Var != null) {
                }
                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                FrameLayout Q4222222 = Q4(q5Var2, false);
                i17 = i14;
                iArr = new int[2];
                Q4222222.getLocationOnScreen(iArr);
                if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
                }
                final p80 E22222 = this.f3.E(Q4);
                E22222.s = 0;
                E22222.t = false;
                E22222.Z = z14;
                LinearLayout linearLayout32222 = new LinearLayout(getContext());
                linearLayout32222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                linearLayout32222.setOrientation(1);
                TextView textView22222 = new TextView(getContext());
                textView22222.setText(LocaleController.getString(R.string.ArticleAlignment));
                i18 = i10;
                textView22222.setTextSize(1, 12.0f);
                textView22222.setGravity(17);
                textView22222.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
                linearLayout32222.addView(textView22222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                LinearLayout linearLayout222222 = new LinearLayout(getContext());
                i19 = i11;
                i20 = i13;
                linearLayout222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                linearLayout222222.setOrientation(0);
                linearLayout32222.addView(linearLayout222222, w7.x5.q(-2, -2, 17));
                Context context22222 = getContext();
                int i4122222 = R.drawable.iv_align_horiz_left;
                org.telegram.ui.ActionBar.e6 e6Var22222 = this.e3;
                a2 a2Var72222 = new a2(context22222, i4122222, e6Var22222);
                a2Var72222.e = 4;
                a2Var72222.e();
                a2Var72222.b();
                int i4222222 = org.telegram.ui.ActionBar.i6.G8;
                a2Var72222.c(i4222222);
                boolean z1922222 = z10;
                linearLayout222222.addView(a2Var72222, w7.x5.n(32, 32));
                a2 a2Var222222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var22222);
                a2Var222222.e = 4;
                a2Var222222.e();
                a2Var222222.b();
                a2Var222222.c(i4222222);
                linearLayout222222.addView(a2Var222222, w7.x5.n(32, 32));
                a2 a2Var322222 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var22222);
                a2Var322222.e = 4;
                a2Var322222.e();
                a2Var322222.b();
                a2Var322222.c(i4222222);
                final a2[] a2VarArr32222 = {a2Var72222, a2Var222222, a2Var322222};
                boolean z2022222 = z11;
                linearLayout222222.addView(a2Var322222, w7.x5.n(32, 32));
                z15 = z12;
                linearLayout222222.addView(new Space(getContext()), w7.x5.n(8, 0));
                a2 a2Var422222 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var22222);
                a2Var422222.e = 4;
                a2Var422222.e();
                a2Var422222.b();
                a2Var422222.c(i4222222);
                linearLayout222222.addView(a2Var422222, w7.x5.n(32, 32));
                a2 a2Var522222 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var22222);
                a2Var522222.e = 4;
                a2Var522222.e();
                a2Var522222.b();
                a2Var522222.c(i4222222);
                linearLayout222222.addView(a2Var522222, w7.x5.n(32, 32));
                a2 a2Var622222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var22222);
                a2Var622222.e = 4;
                a2Var622222.e();
                a2Var622222.b();
                a2Var622222.c(i4222222);
                final a2[] a2VarArr222222 = {a2Var422222, a2Var522222, a2Var622222};
                linearLayout222222.addView(a2Var622222, w7.x5.n(32, 32));
                E22222.q(linearLayout32222);
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
                i22 = 0;
                while (i22 < 3) {
                }
                i24 = 0;
                while (i24 < 3) {
                }
                while (i25 < 3) {
                }
                i26 = 0;
                while (i26 < i23) {
                }
                E22222.o();
                E22222.S = 208;
                if (!linkedHashSet.isEmpty()) {
                }
                z16 = false;
                if (!z16) {
                }
                final int i47222222 = 5;
                E22222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i47222222), false);
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
                E22222.p = new gg.t(this, E22222, q5Var2, 15);
                this.h4 = E22222;
                E22222.Z();
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
        p80Var = this.h4;
        if (p80Var != null) {
        }
        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (i15 != 0 ? 2 : 0) + (i16 != 0 ? 2 : 0) + i14 + i13 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
        FrameLayout Q42222222 = Q4(q5Var2, false);
        i17 = i14;
        iArr = new int[2];
        Q42222222.getLocationOnScreen(iArr);
        if (((iArr[i12] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight ? i12 : 0) != 0) {
        }
        final p80 E222222 = this.f3.E(Q4);
        E222222.s = 0;
        E222222.t = false;
        E222222.Z = z14;
        LinearLayout linearLayout322222 = new LinearLayout(getContext());
        linearLayout322222.setMinimumWidth(AndroidUtilities.dp(208.0f));
        linearLayout322222.setOrientation(1);
        TextView textView222222 = new TextView(getContext());
        textView222222.setText(LocaleController.getString(R.string.ArticleAlignment));
        i18 = i10;
        textView222222.setTextSize(1, 12.0f);
        textView222222.setGravity(17);
        textView222222.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.y6, this.n2));
        linearLayout322222.addView(textView222222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2222222 = new LinearLayout(getContext());
        i19 = i11;
        i20 = i13;
        linearLayout2222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2222222.setOrientation(0);
        linearLayout322222.addView(linearLayout2222222, w7.x5.q(-2, -2, 17));
        Context context222222 = getContext();
        int i41222222 = R.drawable.iv_align_horiz_left;
        org.telegram.ui.ActionBar.e6 e6Var222222 = this.e3;
        a2 a2Var722222 = new a2(context222222, i41222222, e6Var222222);
        a2Var722222.e = 4;
        a2Var722222.e();
        a2Var722222.b();
        int i42222222 = org.telegram.ui.ActionBar.i6.G8;
        a2Var722222.c(i42222222);
        boolean z19222222 = z10;
        linearLayout2222222.addView(a2Var722222, w7.x5.n(32, 32));
        a2 a2Var2222222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, e6Var222222);
        a2Var2222222.e = 4;
        a2Var2222222.e();
        a2Var2222222.b();
        a2Var2222222.c(i42222222);
        linearLayout2222222.addView(a2Var2222222, w7.x5.n(32, 32));
        a2 a2Var3222222 = new a2(getContext(), R.drawable.iv_align_horiz_right, e6Var222222);
        a2Var3222222.e = 4;
        a2Var3222222.e();
        a2Var3222222.b();
        a2Var3222222.c(i42222222);
        final a2[] a2VarArr322222 = {a2Var722222, a2Var2222222, a2Var3222222};
        boolean z20222222 = z11;
        linearLayout2222222.addView(a2Var3222222, w7.x5.n(32, 32));
        z15 = z12;
        linearLayout2222222.addView(new Space(getContext()), w7.x5.n(8, 0));
        a2 a2Var4222222 = new a2(getContext(), R.drawable.iv_align_vert_top, e6Var222222);
        a2Var4222222.e = 4;
        a2Var4222222.e();
        a2Var4222222.b();
        a2Var4222222.c(i42222222);
        linearLayout2222222.addView(a2Var4222222, w7.x5.n(32, 32));
        a2 a2Var5222222 = new a2(getContext(), R.drawable.iv_align_vert_middle, e6Var222222);
        a2Var5222222.e = 4;
        a2Var5222222.e();
        a2Var5222222.b();
        a2Var5222222.c(i42222222);
        linearLayout2222222.addView(a2Var5222222, w7.x5.n(32, 32));
        a2 a2Var6222222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, e6Var222222);
        a2Var6222222.e = 4;
        a2Var6222222.e();
        a2Var6222222.b();
        a2Var6222222.c(i42222222);
        final a2[] a2VarArr2222222 = {a2Var4222222, a2Var5222222, a2Var6222222};
        linearLayout2222222.addView(a2Var6222222, w7.x5.n(32, 32));
        E222222.q(linearLayout322222);
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
        i22 = 0;
        while (i22 < 3) {
        }
        i24 = 0;
        while (i24 < 3) {
        }
        while (i25 < 3) {
        }
        i26 = 0;
        while (i26 < i23) {
        }
        E222222.o();
        E222222.S = 208;
        if (!linkedHashSet.isEmpty()) {
        }
        z16 = false;
        if (!z16) {
        }
        final int i472222222 = 5;
        E222222.c(!z16 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.x0(this, q5Var2, z16, i472222222), false);
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
        E222222.p = new gg.t(this, E222222, q5Var2, 15);
        this.h4 = E222222;
        E222222.Z();
    }

    @Override // org.telegram.ui.Components.k71
    public final void H1(s4.d1 d1Var) {
        int b10;
        p61 G;
        a aVar = null;
        if (d1Var != null && (b10 = d1Var.b()) >= 0 && (G = this.W2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.Q3 = aVar;
        this.R3 = false;
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.m();
        }
    }

    public final void H2() {
        k3 k3Var = this.l3;
        if (k3Var != null) {
            k3Var.f(true);
        }
        N2();
        o3();
        IdentityHashMap identityHashMap = this.X3;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((c5) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.Y3;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((y4) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean H3() {
        int i10;
        a z42;
        k3 k3Var = this.l3;
        return k3Var != null && k3Var.x() && (i10 = k3Var.p0) == k3Var.s0 && i10 >= 0 && i10 < this.n4.size() && k3Var.q0 == 1 && k3Var.t0 == 1 && (z42 = z4(i10)) != null && f6.p(z42.b);
    }

    public final f6 H4() {
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x()) {
            return null;
        }
        int i10 = k3Var.p0;
        int i11 = k3Var.s0;
        a z42 = z4(i10);
        if (i10 == i11 && z42 != null && B3(z42.b)) {
            return v2(i10);
        }
        return null;
    }

    public final int I2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.j3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (y3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean I3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.i && !y3(aVar)) {
                        if (!aVar.k.isEmpty() || f6.p(aVar.b)) {
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

    public final Editable I4(int i10, int i11, int i12, int i13) {
        if (i10 != i12) {
            return null;
        }
        if (y3(z4(i10))) {
            i1 J2 = J2(i10);
            if (J2 != null) {
                return J2.getText();
            }
            return null;
        }
        if (H3()) {
            i1 k42 = k4(i10);
            if (k42 != null) {
                return k42.getText();
            }
            return null;
        }
        a z42 = z4(i10);
        if (z42 == null || !B3(z42.b)) {
            return null;
        }
        int j22 = j2(i10);
        if (hg.c.y(i11, i13, j22, 0) >= hg.c.w(i11, i13, j22, 0)) {
            return null;
        }
        f6 v22 = v2(i10);
        return v22 != null ? v22.getEditText().getText() : f6.A(z42.b);
    }

    public final i1 J2(int i10) {
        if (!y3(z4(i10))) {
            return null;
        }
        View B4 = B4(i10);
        if (B4 instanceof u0) {
            return ((u0) B4).getEditText();
        }
        return null;
    }

    public final boolean J3() {
        k3 k3Var = this.l3;
        if (k3Var != null && k3Var.x()) {
            int i10 = k3Var.p0;
            int i11 = k3Var.s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a z42 = z4(i10);
                    if (z42 != null) {
                        if (D3(z42.b)) {
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
    public final boolean J4(int i10, int i11, int i12, int i13, ArrayList arrayList) {
        int i14;
        a aVar;
        CharSequence A;
        CharSequence A2;
        CharSequence subSequence;
        CharSequence subSequence2;
        i2 i2Var;
        ArrayList arrayList2;
        SpannableStringBuilder A3;
        int length;
        int i15;
        i2 i2Var2;
        if (i10 >= 0 && i11 >= 0) {
            ArrayList arrayList3 = this.j3;
            if (i10 < arrayList3.size() && i11 < arrayList3.size()) {
                if (i10 <= i11) {
                    if (i10 == i11) {
                    }
                    for (i14 = i10; i14 <= i11; i14++) {
                        a aVar2 = (a) arrayList3.get(i14);
                        if (!aVar2.i && !y3(aVar2) && !F3(aVar2.b) && !m3(aVar2.b) && !(aVar2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i10);
                    a aVar3 = (a) arrayList3.get(i11);
                    A = f6.A(aVar.b);
                    A2 = i10 != i11 ? A : f6.A(aVar3.b);
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
                    i2Var = this.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (arrayList.size() == 1 || !G3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock T3 = T3(aVar.b);
                            f6.d(T3, subSequence);
                            arrayList2.add(0, new a(T3, aVar.c, aVar.d));
                        }
                        aVar = (a) hg.c.g(1, arrayList);
                        if (aVar != null) {
                            if (y3(aVar)) {
                                length = h6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true).length();
                            } else {
                                TL_iv.PageBlock pageBlock = aVar.b;
                                if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || D3(pageBlock)) && (A3 = f6.A(aVar.b)) != null) {
                                    length = A3.length();
                                }
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock T32 = T3(aVar3.b);
                                f6.d(T32, subSequence2);
                                arrayList2.add(new a(T32, aVar3.c, aVar3.d));
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
                        CharSequence A4 = f6.A(((a) arrayList.get(0)).b);
                        CharSequence charSequence = A4 != null ? A4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        f6.d(aVar.b, spannableStringBuilder);
                        while (i11 > i10) {
                            arrayList3.remove(i11);
                            i11--;
                        }
                    }
                    t4();
                    this.l3.f(false);
                    this.W2.N(false);
                    i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    post(new r2(this, aVar, length, 1));
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
                A = f6.A(aVar.b);
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
                i2Var = this.H3;
                if (i2Var != null) {
                }
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                aVar = (a) hg.c.g(1, arrayList);
                if (aVar != null) {
                }
                length = 0;
                if (subSequence2.length() > 0) {
                }
                while (i11 >= i10) {
                }
                while (i15 < arrayList2.size()) {
                }
                t4();
                this.l3.f(false);
                this.W2.N(false);
                i2Var2 = this.H3;
                if (i2Var2 != null) {
                }
                post(new r2(this, aVar, length, 1));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K3(int i10, int i11, int i12, int i13, int i14) {
        int length;
        int y3;
        int w10;
        int max;
        int max2;
        if (z3()) {
            i1 J2 = J2(i11);
            return (J2 == null || (max = Math.max(0, Math.min(Math.min(i12, i14), J2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i12, i14), J2.length()))) || (i10 & J2.getCurrentStyle(max, max2)) == 0) ? false : true;
        }
        if (!H3()) {
            int i15 = i11;
            boolean z10 = false;
            while (i15 <= i13) {
                a z42 = z4(i15);
                if (z42 != null) {
                    TL_iv.PageBlock pageBlock = z42.b;
                    if (B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int j22 = j2(i15);
                        int i16 = i15 == i11 ? i12 : 0;
                        int i17 = i15 == i13 ? i14 : j22;
                        int max3 = Math.max(0, Math.min(i16, j22));
                        int max4 = Math.max(0, Math.min(i17, j22));
                        if (max3 < max4) {
                            f6 v22 = v2(i15);
                            if (v22 != null ? (v22.getStyleDelegate().getCurrentStyle(max3, max4) & i10) != 0 : h6.i(max3, max4, i10, f6.A(z4(i15).b))) {
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
        i1 k42 = k4(i11);
        if (k42 != null && (y3 = hg.c.y(i12, i14, (length = k42.length()), 0)) < (w10 = hg.c.w(i12, i14, length, 0)) && (i10 & k42.getCurrentStyle(y3, w10)) != 0) {
        }
    }

    public final void K4(View view) {
        s4.d1 T;
        int b10;
        if (view == null || this.X2 == null || !this.a3 || (T = T(view)) == null || (b10 = T.b()) < 0 || this.W2.H(b10) < 0) {
            return;
        }
        this.y3 = true;
        k3 k3Var = this.l3;
        if (k3Var.x()) {
            k3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.X2.r(T);
    }

    public final boolean L3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i12;
        boolean z10 = false;
        while (i16 <= i14) {
            i1 O4 = O4(i11, i16);
            if (O4 != null) {
                int length = O4.length();
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
                    if ((O4.getCurrentStyle(max, max2) & i10) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i16++;
        }
        return z10;
    }

    public final void L4(a aVar, u uVar, MediaController.PhotoEntry photoEntry) {
        long j3;
        c5 c5Var = (c5) this.X3.remove(uVar);
        if (c5Var != null) {
            c5Var.b();
        }
        IdentityHashMap identityHashMap = this.Y3;
        y4 y4Var = (y4) identityHashMap.remove(uVar);
        if (y4Var != null) {
            y4Var.a();
        }
        uVar.a = 1;
        uVar.f = 0.0f;
        y4 y4Var2 = new y4(this.d3, photoEntry, new i3(aVar, uVar, this));
        identityHashMap.put(uVar, y4Var2);
        if (y4Var2.f || y4Var2.h || y4Var2.n) {
            return;
        }
        y4Var2.f = true;
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
                j3 = videoEditedInfo2.endTime;
                if (j3 <= 0 || j3 >= 1000) {
                    break;
                } else {
                    videoEditedInfo2.endTime = j3 * 2;
                }
            }
            if (j3 <= 0) {
                videoEditedInfo2.endTime = 3000L;
            }
            long j10 = videoEditedInfo2.endTime;
            videoEditedInfo2.end = j10;
            videoEditedInfo2.compressQuality = 1;
            videoEditedInfo2.rotationValue = 0;
            videoEditedInfo2.originalPath = photoEntry.path;
            videoEditedInfo2.estimatedSize = (int) ((r13 / 1000.0f) * 115200.0f);
            videoEditedInfo2.estimatedDuration = j10;
            videoEditedInfo2.framerate = 30;
            videoEditedInfo2.originalDuration = j10;
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
        y4Var2.d = videoEditedInfo;
        if (videoEditedInfo == null || !videoEditedInfo.needConvert()) {
            y4Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        y4Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(y4Var2.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        y4Var2.c = messageObject;
        messageObject.videoEditedInfo = y4Var2.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(y4Var2.a);
        notificationCenter.addObserver(y4Var2, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(y4Var2, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(y4Var2, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(y4Var2.c, false, false, false);
    }

    public final boolean M3() {
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x()) {
            return false;
        }
        int i10 = k3Var.p0;
        int i11 = k3Var.s0;
        a z42 = z4(i10);
        return i10 == i11 && z42 != null && (z42.b instanceof TL_iv.pageBlockTable);
    }

    public final void M4(a aVar, u uVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.X3;
        c5 c5Var = (c5) identityHashMap.remove(uVar);
        if (c5Var != null) {
            c5Var.b();
        }
        c5 c5Var2 = new c5(this.d3, str, z10, i10, i11, i12, new j3(aVar, uVar, this));
        identityHashMap.put(uVar, c5Var2);
        c5Var2.d();
    }

    public final void N2() {
        if (this.z3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.z3 = false;
        this.A3 = false;
        this.B3 = null;
        this.C3 = null;
        p80 p80Var = this.h4;
        if (p80Var != null) {
            this.h4 = null;
            p80Var.u();
        }
        q5 q5Var = this.g4;
        if (q5Var != null) {
            LinkedHashSet linkedHashSet = q5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                q5Var.v.invalidate();
                q5Var.t();
            }
            this.g4 = null;
        }
        this.j4 = -1;
        this.i4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean N3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.d3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += R3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList a32 = a3();
        j2 j2Var = new j2();
        j2Var.d = i11;
        j2Var.b = a32.size() + j2Var.b;
        for (int i12 = 0; i12 < a32.size(); i12++) {
            j2.b((TL_iv.PageBlock) a32.get(i12), 1, j2Var);
        }
        return j2Var.a <= appGlobalConfig.richMessageLengthLimit.get() && j2Var.b <= appGlobalConfig.richMessageMaxBlocks.get() && j2Var.c <= appGlobalConfig.richMessageMaxDepth.get() && j2Var.d <= appGlobalConfig.richMessageMaxMedia.get() && j2Var.e <= appGlobalConfig.richMessageMaxTableCols.get();
    }

    public final Editable N4(a aVar) {
        View A1 = A1(aVar);
        return A1 instanceof f6 ? ((f6) A1).getEditText().getText() : f6.A(aVar.b);
    }

    public final i1 O4(int i10, int i11) {
        View B4 = B4(i10);
        if (B4 instanceof q5) {
            return ((q5) B4).l(i11);
        }
        return null;
    }

    public final int[] P3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.L3.size(); i12++) {
            int length = f6.z(((a) this.L3.get(i12)).b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.L3.size() - 1;
        return new int[]{size, f6.z(((a) this.L3.get(size)).b).length()};
    }

    public final i1 Q2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                return ((f6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int Q3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i12 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i12);
            if (y3(aVar)) {
                i11++;
            } else if (aVar.i && i11 - 1 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public final a R2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                f6 f6Var = (f6) childAt;
                if (f6Var.getEditText().isFocused() || (f6Var.n() && f6Var.h.isFocused())) {
                    return f6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void R4() {
        int[] C4 = C4();
        if (C4 == null) {
            return;
        }
        int i10 = C4[0];
        int i11 = C4[1];
        if (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i11 >= arrayList.size() || i10 > i11) {
                return;
            }
            i2 i2Var = this.H3;
            if (i2Var != null) {
                i2Var.d();
            }
            if (I3(i10, i11)) {
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    boolean z10 = aVar.i;
                    ArrayList arrayList2 = aVar.k;
                    if (!z10 && !y3(aVar)) {
                        if (f6.p(aVar.b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.b.text;
                            aVar.b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            a1.g.y(1, arrayList2);
                        }
                    }
                }
            } else {
                long a2 = q0.a();
                for (int i13 = i10; i13 <= i11; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    boolean z11 = aVar2.i;
                    ArrayList arrayList3 = aVar2.k;
                    if (!z11 && !y3(aVar2)) {
                        if (f6.p(aVar2.b)) {
                            long a10 = q0.a();
                            TL_iv.RichText k10 = f6.k(aVar2.b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                this.k3.put(Long.valueOf(a10), k10);
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
            y2();
            W3();
            t4();
            k3 k3Var = this.l3;
            boolean z12 = k3Var != null && k3Var.x();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
            this.W2.N(false);
            i2 i2Var2 = this.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            if (z12) {
                post(new gg.t(this, aVar3, aVar4, 16));
            } else {
                post(new p2(this, aVar3, 9));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(TL_iv.PageBlock pageBlock) {
        i2 i2Var;
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.d();
        }
        a R2 = R2();
        if (R2 == null) {
            R2 = this.a4;
        }
        ArrayList arrayList = this.j3;
        int indexOf = R2 != null ? arrayList.indexOf(R2) : -1;
        if (indexOf >= 0 && (R2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a2 = q0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) R2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.k3.put(Long.valueOf(a2), richText);
            }
            R2.k.add(Long.valueOf(a2));
            R2.b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = indexOf >= 0 && !R2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = R2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && R2.g == null && f6.z(pageBlock2).isEmpty()) {
                R2.b = pageBlock;
                this.a4 = R2;
                if (m3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(R2) + 1;
                    if (indexOf2 >= arrayList.size() || F3(((a) arrayList.get(indexOf2)).b)) {
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z10) {
                            aVar.k.addAll(R2.k);
                        }
                        arrayList.add(indexOf2, aVar);
                        R2 = aVar;
                    } else {
                        R2 = (a) arrayList.get(indexOf2);
                    }
                }
                this.W2.N(false);
                i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.h();
                }
                post(new p2(this, R2, 1));
            }
        }
        a aVar2 = new a(pageBlock, 0, 0);
        if (z10) {
            aVar2.k.addAll(R2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, aVar2);
        } else {
            arrayList.add(aVar2);
        }
        R2 = aVar2;
        this.a4 = R2;
        if (m3(pageBlock)) {
        }
        this.W2.N(false);
        i2Var = this.H3;
        if (i2Var != null) {
        }
        post(new p2(this, R2, 1));
    }

    public final q5 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return V2((i1) findFocus);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        a aVar2;
        i2 i2Var;
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.d();
        }
        aVar.b = pageBlock;
        aVar.c = i10;
        aVar.d = i11;
        aVar.e = z10;
        aVar.f = z11;
        t4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z12) {
            int i12 = indexOf + 1;
            if (i12 >= arrayList.size() || F3(((a) arrayList.get(i12)).b)) {
                arrayList.add(i12, new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        } else if (F3(pageBlock)) {
            if (E3(pageBlock) && aVar.g == null) {
                aVar.g = new u();
            }
            int i13 = indexOf + 1;
            if (i13 >= arrayList.size() || F3(((a) arrayList.get(i13)).b)) {
                aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(i13, aVar2);
            } else {
                aVar2 = (a) arrayList.get(i13);
            }
            if (aVar2 == aVar || z12 || F3(pageBlock) || !(findFocus() instanceof i1)) {
                this.W2.N(false);
                i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.h();
                }
                post(new p2(this, aVar2, 18));
            }
            Y1();
            i2 i2Var3 = this.H3;
            if (i2Var3 != null) {
                i2Var3.h();
            }
            View A1 = A1(aVar);
            if (A1 instanceof f6) {
                f6 f6Var = (f6) A1;
                f6Var.B();
                f6Var.getEditText().setSelection(f6Var.getEditText().length());
                return;
            }
            return;
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.W2.N(false);
        i2Var = this.H3;
        if (i2Var != null) {
        }
        post(new p2(this, aVar2, 18));
    }

    public final TLRPC.Document T2(long j3) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j3 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.j3.size(); i11++) {
            for (u uVar : R3((a) this.j3.get(i11))) {
                if (uVar != null && (document2 = uVar.h) != null && document2.id == j3) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.i3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.Document document3 = arrayList.get(i10);
                i10++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.id == j3) {
                    return document4;
                }
            }
        }
        HashMap hashMap = x4.a;
        synchronized (x4.class) {
            document = j3 != 0 ? (TLRPC.Document) x4.b.get(Long.valueOf(j3)) : null;
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
    
        r7 = r14.n4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0193, code lost:
    
        if (r2 >= r7.size()) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0195, code lost:
    
        r7 = (ii.a) r7.get(r2);
        r12 = r7.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019f, code lost:
    
        if (r12 == 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01a1, code lost:
    
        r0.X(r2, ii.h6.l((org.telegram.tgnet.tl.TL_iv.RichText) r14.k3.get(java.lang.Long.valueOf(r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r0.X(r2, ii.f6.z(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c4, code lost:
    
        if (ii.f6.p(r7.b) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        r7 = ii.h6.l(ii.f6.k(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d4, code lost:
    
        if (r7.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d6, code lost:
    
        r0.w0.put(65536 + r2, org.telegram.ui.Cells.o9.Y(r7));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01f0, code lost:
    
        r2 = r7.size() - 1;
        r7 = (ii.a) r7.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ff, code lost:
    
        if (r7.t != 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0207, code lost:
    
        if (ii.f6.p(r7.b) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r7 = ii.h6.l(ii.f6.k(r7.b));
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
    
        if ((r10 instanceof org.telegram.ui.Cells.n9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r10 = (org.telegram.ui.Cells.n9) r10;
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
    public final boolean T4() {
        q5 q5Var;
        int[] b52;
        int[] b53;
        boolean z10;
        boolean z11;
        int length;
        m0 m0Var;
        f6 f6Var;
        int k10;
        if (this.j3.isEmpty()) {
            return false;
        }
        k3 k3Var = this.l3;
        boolean x10 = k3Var.x();
        SparseIntArray sparseIntArray = k3Var.y0;
        org.telegram.ui.Cells.g gVar = k3Var.m0;
        n9 n9Var = null;
        if (x10) {
            int i10 = k3Var.p0;
            if (i10 == k3Var.s0) {
                View B4 = B4(i10);
                if ((B4 instanceof q5) && (((b52 = b5((q5Var = (q5) B4))) == null || k3Var.q0 != 0 || k3Var.r0 != 0 || k3Var.t0 != b52[0] || k3Var.u0 != b52[1]) && (b53 = b5(q5Var)) != null)) {
                    int i11 = b53[0];
                    int i12 = b53[1];
                    ArrayList arrayList = k3Var.A0;
                    int d02 = k3Var.d0(q5Var);
                    if (d02 >= 0 && (i11 != 0 || i12 != 0)) {
                        k3Var.W = q5Var;
                        k3Var.s0 = d02;
                        k3Var.p0 = d02;
                        k3Var.q0 = 0;
                        k3Var.t0 = i11;
                        k3Var.r0 = 0;
                        k3Var.u0 = i12;
                        k3Var.u = 0;
                        k3Var.v = i12;
                        k3Var.B0 = d02;
                        k3Var.D0 = 0;
                        k3Var.C0 = 0;
                        k3Var.h0(q5Var, d02);
                        arrayList.clear();
                        q5Var.fillTextLayoutBlocks(arrayList);
                        if (!arrayList.isEmpty() && arrayList.size() > 0) {
                            k3Var.a = ((z9) arrayList.get(0)).getX();
                            k3Var.b = ((z9) arrayList.get(0)).getY();
                        } else if (!arrayList.isEmpty()) {
                            k3Var.a = ((z9) arrayList.get(0)).getX();
                            k3Var.b = ((z9) arrayList.get(0)).getY();
                        }
                        aa aaVar = k3Var.C;
                        if (aaVar != null) {
                            aaVar.setVisibility(0);
                        }
                        k3Var.U();
                        k3Var.w();
                        k3Var.u();
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        w7.h0 h0Var = k3Var.D;
                        if (h0Var != null) {
                            h0Var.a(true);
                        }
                        q5Var.invalidate();
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            i1 Q2 = Q2();
            if (Q2 != 0 && Q2.getText() != null && (length = Q2.getText().length()) > 0) {
                q5 V2 = V2(Q2);
                if (V2 != null) {
                    if (Q2 == V2.getTitleEditText()) {
                        k10 = 0;
                    } else {
                        t5 o9 = V2.o(Q2);
                        k10 = o9 != null ? V2.k(o9.b) : -1;
                    }
                    if (k10 >= 0) {
                        Q2.setSelection(Q2.getSelectionEnd());
                        z11 = k3Var.j0(V2, k10, 0, length);
                    }
                } else {
                    if (!(Q2 instanceof m0)) {
                        ViewParent parent = Q2.getParent();
                        while (true) {
                            if (parent == null) {
                                m0Var = null;
                                break;
                            }
                            if (parent instanceof m0) {
                                m0Var = (m0) parent;
                                break;
                            }
                            parent = parent.getParent();
                        }
                    } else {
                        m0Var = (m0) Q2;
                    }
                    if (m0Var instanceof n9) {
                        Q2.setSelection(Q2.getSelectionEnd());
                        z11 = k3Var.j0((n9) m0Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = Q2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                f6Var = null;
                                break;
                            }
                            if (parent2 instanceof f6) {
                                f6Var = (f6) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (f6Var != null) {
                            int i13 = Q2 == f6Var.getAuthorEditText() ? 1 : 0;
                            Q2.setSelection(Q2.getSelectionEnd());
                            z11 = k3Var.j0(f6Var, i13, 0, length);
                        }
                    }
                }
            }
            z11 = false;
        }
    }

    public final void U1(a aVar, MediaController.PhotoEntry photoEntry) {
        x3 x3Var;
        if (aVar != null && E3(aVar.b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                u U3 = U3(photoEntry, str2);
                boolean c10 = y4.c(photoEntry);
                TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (C3(aVar.b)) {
                    h3(aVar.b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(U3);
                } else {
                    u uVar = aVar.g;
                    if (uVar == null || uVar.a == 0) {
                        aVar.b = pageblockvideo;
                        aVar.g = U3;
                    } else {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.b.caption;
                        l0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.g);
                        aVar.h.add(U3);
                        aVar.g = null;
                        aVar.b = pageblockcollage;
                    }
                }
                this.W2.N(false);
                o4(aVar);
                if (c10) {
                    L4(aVar, U3, photoEntry);
                    x3Var = this;
                } else {
                    x3Var = this;
                    x3Var.M4(aVar, U3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                i2 i2Var2 = x3Var.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.f3.onContentChanged();
            }
        }
    }

    public final int U2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (y3(aVar2)) {
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
                    if (!F3(pageBlock) || m3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
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
    public final boolean U4(View view, float f7, float f10) {
        int lineForVertical;
        int lineForVertical2;
        t5 m10;
        int lineForVertical3;
        if (view != 0) {
            k3 k3Var = this.l3;
            if (!k3Var.x()) {
                int left = (int) ((f7 - view.getLeft()) - getLeft());
                int top = (int) ((f10 - view.getTop()) - getTop());
                if (view instanceof f6) {
                    f6 f6Var = (f6) view;
                    i1 i1Var = f6Var.h;
                    i1 i1Var2 = f6Var.f;
                    LinearLayout linearLayout = f6Var.b;
                    if (f6.y(i1Var2, i1Var2.getLeft() + linearLayout.getLeft(), i1Var2.getTop() + linearLayout.getTop(), left, top) || (i1Var.getVisibility() == 0 && f6.y(i1Var, i1Var.getLeft(), i1Var.getTop(), left, top))) {
                        k3Var.k0(f6Var, left, top);
                        k3Var.l0();
                        return true;
                    }
                } else if (view instanceof q5) {
                    q5 q5Var = (q5) view;
                    p5 p5Var = q5Var.w;
                    b4 b4Var = q5Var.s;
                    s5 s5Var = q5Var.v;
                    TL_iv.pageTableCell m11 = q5Var.m(left, top);
                    if (m11 != null && (m10 = s5Var.m(m11)) != null) {
                        i1 i1Var3 = m10.a;
                        int scrollX = b4Var.getScrollX() + (((left - b4Var.getLeft()) - p5Var.getLeft()) - s5Var.getLeft());
                        int top2 = ((top - b4Var.getTop()) - p5Var.getTop()) - s5Var.getTop();
                        int left2 = (scrollX - m10.getLeft()) - i1Var3.getLeft();
                        int top3 = (top2 - m10.getTop()) - i1Var3.getTop();
                        Layout layout = i1Var3.getLayout();
                        if (layout != null) {
                            int paddingTop = top3 - i1Var3.getPaddingTop();
                            int paddingLeft = left2 - i1Var3.getPaddingLeft();
                            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical3 = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical3 < layout.getLineCount()) {
                                float lineLeft = layout.getLineLeft(lineForVertical3);
                                float lineRight = layout.getLineRight(lineForVertical3);
                                float f11 = paddingLeft;
                                if (f11 >= lineLeft) {
                                }
                            }
                        }
                    }
                    i1 i1Var4 = q5Var.r;
                    Layout layout2 = i1Var4.getLayout();
                    if (layout2 != null) {
                        int paddingLeft2 = left - (i1Var4.getPaddingLeft() + i1Var4.getLeft());
                        int paddingTop2 = top - (i1Var4.getPaddingTop() + i1Var4.getTop());
                        if (paddingTop2 >= 0 && paddingTop2 < layout2.getHeight() && (lineForVertical2 = layout2.getLineForVertical(paddingTop2)) >= 0 && lineForVertical2 < layout2.getLineCount()) {
                            float f12 = paddingLeft2;
                            if (f12 >= layout2.getLineLeft(lineForVertical2)) {
                            }
                        }
                    }
                } else if (view instanceof m0) {
                    if (((m0) view).a(left, top)) {
                        k3Var.k0(view, left, top);
                        k3Var.l0();
                        return true;
                    }
                } else if (view instanceof u0) {
                    u0 u0Var = (u0) view;
                    i1 i1Var5 = u0Var.d;
                    Layout layout3 = i1Var5.getLayout();
                    if (layout3 != null && i1Var5.length() != 0) {
                        int paddingLeft3 = left - (i1Var5.getPaddingLeft() + i1Var5.getLeft());
                        int paddingTop3 = top - (i1Var5.getPaddingTop() + i1Var5.getTop());
                        if (paddingTop3 >= 0 && paddingTop3 < layout3.getHeight() && (lineForVertical = layout3.getLineForVertical(paddingTop3)) >= 0 && lineForVertical < layout3.getLineCount()) {
                            int dp = AndroidUtilities.dp(24.0f);
                            int max = Math.max(0, (i1Var5.getWidth() - i1Var5.getPaddingLeft()) - i1Var5.getPaddingRight());
                            float f13 = dp;
                            float max2 = Math.max(0.0f, layout3.getLineLeft(lineForVertical) - f13);
                            float min = Math.min(max, layout3.getLineRight(lineForVertical) + f13);
                            float f14 = paddingLeft3;
                            if (f14 >= max2 && f14 <= min) {
                                k3Var.k0(u0Var, left, top);
                                k3Var.l0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof s4) {
                    s4 s4Var = (s4) view;
                    if (s4Var.w != null) {
                        int[] iArr = new int[4];
                        s4Var.i(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            k3Var.k0(view, left, top);
                            k3Var.l0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void V1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.i3;
        if (richMessage2 == null) {
            this.i3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.i3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        X2(arrayList4, richMessage.blocks, this.k3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            w4((a) arrayList4.get(i10));
        }
        ArrayList arrayList5 = this.j3;
        int size = arrayList5.size();
        a R2 = R2();
        if (R2 != null && (indexOf = arrayList5.indexOf(R2)) >= 0) {
            TL_iv.PageBlock pageBlock = R2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && f6.z(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        W3();
        t4();
        this.W2.N(false);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.onContentChanged();
        }
    }

    public final a V3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.n4;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                if (aVar.t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (F3(pageBlock) && !m3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i10 += i11;
        }
        return null;
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.j3;
        if (arrayList.indexOf(aVar2) < 0 || y3(aVar2) || aVar2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (pageBlock != pageBlock2 && B3(pageBlock2) && B3(pageBlock)) {
            f6 v22 = v2(arrayList.indexOf(aVar2));
            f6.d(pageBlock, v22 != null ? v22.getEditText().getText() : f6.A(aVar2.b));
            TL_iv.RichText k10 = f6.k(aVar2.b);
            if (k10 != null && f6.k(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                }
            }
        }
        S4(aVar2, pageBlock, i10, i11, z10, z11);
    }

    public final a W1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.n4;
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

    public final void W2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                f6 f6Var = (f6) childAt;
                f6Var.f.n();
                f6Var.h.n();
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().n();
            }
        }
    }

    public final void W3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.k.isEmpty() && f6.p(aVar.b)) {
                long a2 = q0.a();
                TL_iv.RichText k10 = f6.k(aVar.b);
                if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                    this.k3.put(Long.valueOf(a2), k10);
                }
                aVar.k.add(Long.valueOf(a2));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.b.text;
                aVar.b = pageblockparagraph;
            }
            i10++;
        }
    }

    public final void W4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        V4(aVar2, pageBlock, aVar2.c, aVar2.d, aVar2.e, aVar2.f);
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
    
        if (I2(r8) <= 0) goto L272;
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
    
        if (I2(r12) <= 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0106, code lost:
    
        r13 = (ii.a) r5.get(r4);
        r7 = (ii.a) r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r8 != r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        if (y3(r13) != false) goto L61;
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
    
        if (y3(r7) != false) goto L69;
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
        r4 = r20.H3;
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
    
        r4 = ii.f6.z(r13.b);
        r1 = r4.substring(0, java.lang.Math.max(0, java.lang.Math.min(r1, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0176, code lost:
    
        if (r18 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        r4 = ii.f6.z(r7.b);
        r15 = r4.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018e, code lost:
    
        ii.f6.f(r13.b, r1 + r3 + r15);
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
    
        r13 = new ii.a(new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph(), r6, r6);
        r5.add(r13);
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022c, code lost:
    
        t4();
        r11.f(r6);
        r14.N(r6);
        r2 = r20.H3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0237, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
    
        post(new ii.r2(r20, r13, r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0245, code lost:
    
        return r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ba, code lost:
    
        if (r18 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:
    
        r1 = ii.f6.z(r7.b);
        r1 = r1.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r1.length())));
        ii.f6.f(r7.b, r3 + r1);
        r5.subList(r8, r9).clear();
        r1 = r3.length();
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f4, code lost:
    
        r5.subList(r8, r12).clear();
        r1 = new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph();
        a2(r1, r3);
        r6 = 0;
        r13 = new ii.a(r1, 0, 0);
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
    public final boolean X1(int i10, int i11, int i12, int i13, String[] strArr) {
        String str;
        q5 q5Var;
        j6 model;
        int max;
        int length;
        int length2;
        int i14 = i11;
        int i15 = i13;
        a z42 = z4(i10);
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(z42);
        int indexOf2 = arrayList.indexOf(z4(i12));
        if (indexOf < 0 || indexOf2 < 0 || indexOf >= arrayList.size() || indexOf2 >= arrayList.size()) {
            return false;
        }
        a aVar = (a) arrayList.get(indexOf);
        a aVar2 = (a) arrayList.get(indexOf2);
        k3 k3Var = this.l3;
        int i16 = 1;
        if (indexOf == indexOf2 && y3(aVar)) {
            View A1 = A1(aVar);
            if (!(A1 instanceof u0) || !(aVar.b instanceof TL_iv.pageBlockDetails)) {
                return true;
            }
            i1 editText = ((u0) A1).getEditText();
            i2 i2Var = this.H3;
            if (i2Var != null) {
                i2Var.d();
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
            int y3 = hg.c.y(i14, i15, length3, 0);
            spannableStringBuilder.replace(y3, hg.c.w(i14, i15, length3, 0), (CharSequence) sb3);
            editText.setTextSilently(spannableStringBuilder);
            editText.invalidateEffects();
            ((TL_iv.pageBlockDetails) aVar.b).title = h6.f(spannableStringBuilder);
            int length4 = sb3.length() + y3;
            k3Var.f(false);
            i2 i2Var2 = this.H3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            post(new w2(editText, length4, 0));
            return true;
        }
        int i18 = indexOf;
        while (true) {
            c71 c71Var = this.W2;
            str = "";
            if (i18 > indexOf2) {
                int i19 = i16;
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                TL_iv.PageBlock pageBlock = aVar.b;
                boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                boolean z11 = aVar2.b instanceof TL_iv.pageBlockTable;
                v3 v3Var = this.f3;
                if (z10 || z11) {
                    if (z10 && z11 && indexOf == indexOf2) {
                        int i20 = k3Var.q0;
                        int i21 = k3Var.t0;
                        View A12 = A1(aVar);
                        if ((A12 instanceof q5) && (model = (q5Var = (q5) A12).getModel()) != null) {
                            ArrayList arrayList2 = model.g;
                            if (i20 == 0 && i21 == 0) {
                                TL_iv.PageBlock pageBlock2 = aVar.b;
                                if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                    TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                                    i2 i2Var4 = this.H3;
                                    if (i2Var4 != null) {
                                        i2Var4.d();
                                    }
                                    String l4 = h6.l(pageblocktable.title);
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
                                    i1 titleEditText = q5Var.getTitleEditText();
                                    titleEditText.setTextSilently(str2);
                                    titleEditText.invalidateEffects();
                                    int length5 = sb5.length() + max2;
                                    k3Var.f(false);
                                    i2 i2Var5 = this.H3;
                                    if (i2Var5 != null) {
                                        i2Var5.h();
                                    }
                                    v3Var.onContentChanged();
                                    post(new w2(titleEditText, length5, 4));
                                    return true;
                                }
                            } else {
                                int i23 = i20 - 1;
                                int i24 = i21 - 1;
                                int size = arrayList2.size();
                                if (i23 >= 0 && i23 < size && i24 >= 0 && i24 < size) {
                                    i2 i2Var6 = this.H3;
                                    if (i2Var6 != null) {
                                        i2Var6.d();
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
                                        String g10 = j6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i14, g10.length()));
                                        String str3 = g10.substring(0, max) + sb7 + g10.substring(Math.max(0, Math.min(i15, g10.length())));
                                        j6.c(pagetablecell, str3);
                                        t5 m10 = q5Var.getGrid().m(pagetablecell);
                                        if (m10 != null) {
                                            m10.a.setTextSilently(str3);
                                        }
                                        length = sb7.length();
                                    } else {
                                        String g11 = j6.g(pagetablecell);
                                        max = Math.max(0, Math.min(i14, g11.length()));
                                        String str4 = g11.substring(0, max) + sb7;
                                        j6.c(pagetablecell, str4);
                                        t5 m11 = q5Var.getGrid().m(pagetablecell);
                                        if (m11 != null) {
                                            m11.a.setTextSilently(str4);
                                        }
                                        for (int i26 = i23 + 1; i26 < i24; i26++) {
                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i26);
                                            j6.c(pagetablecell3, "");
                                            t5 m12 = q5Var.getGrid().m(pagetablecell3);
                                            if (m12 != null) {
                                                m12.a.setTextSilently("");
                                            }
                                        }
                                        String g12 = j6.g(pagetablecell2);
                                        String substring = g12.substring(Math.max(0, Math.min(i15, g12.length())));
                                        j6.c(pagetablecell2, substring);
                                        t5 m13 = q5Var.getGrid().m(pagetablecell2);
                                        if (m13 != null) {
                                            m13.a.setTextSilently(substring);
                                        }
                                        length = sb7.length();
                                    }
                                    int i27 = length + max;
                                    k3Var.f(false);
                                    i2 i2Var7 = this.H3;
                                    if (i2Var7 != null) {
                                        i2Var7.h();
                                    }
                                    post(new ai.s1(q5Var, pagetablecell, i27, 14));
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                boolean m32 = m3(pageBlock);
                boolean m33 = m3(aVar2.b);
                if (m32 || m33) {
                    if (m32 && m33 && indexOf == indexOf2) {
                        View A13 = A1(aVar);
                        if (A13 instanceof m0) {
                            m0 m0Var = (m0) A13;
                            i1 captionEditText = m0Var.getCaptionEditText();
                            i2 i2Var8 = this.H3;
                            if (i2Var8 != null) {
                                i2Var8.d();
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
                            int y10 = hg.c.y(i14, i15, length6, 0);
                            spannableStringBuilder2.replace(y10, hg.c.w(i14, i15, length6, 0), (CharSequence) sb9);
                            captionEditText.setTextSilently(spannableStringBuilder2);
                            captionEditText.invalidateEffects();
                            m0Var.b();
                            int length7 = sb9.length() + y10;
                            k3Var.f(false);
                            i2 i2Var9 = this.H3;
                            if (i2Var9 != null) {
                                i2Var9.h();
                            }
                            post(new w2(captionEditText, length7, 2));
                            return true;
                        }
                    }
                    return false;
                }
                if (indexOf != indexOf2 || !f6.p(aVar.b) || k3Var.q0 != i19 || k3Var.t0 != i19) {
                    String z12 = f6.z(aVar.b);
                    String z13 = indexOf == indexOf2 ? z12 : f6.z(aVar2.b);
                    int max4 = Math.max(0, Math.min(i14, z12.length()));
                    int max5 = Math.max(0, Math.min(i15, z13.length()));
                    String substring2 = z12.substring(0, max4);
                    String substring3 = z13.substring(max5);
                    if (strArr.length <= 1) {
                        str = strArr.length != 0 ? strArr[0] : "";
                        f6.f(aVar.b, substring2 + str + substring3);
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        length2 = str.length() + substring2.length();
                    } else {
                        TL_iv.PageBlock pageBlock3 = aVar.b;
                        StringBuilder v = a1.g.v(substring2);
                        v.append(strArr[0]);
                        f6.f(pageBlock3, v.toString());
                        if (indexOf2 > indexOf) {
                            while (indexOf2 > indexOf) {
                                arrayList.remove(indexOf2);
                                indexOf2--;
                            }
                        }
                        for (int i29 = 1; i29 < strArr.length - 1; i29++) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            a2(pageblockparagraph, strArr[i29]);
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
                        a2(pageblockparagraph2, str5 + substring3);
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
                    t4();
                    a aVar3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (a) arrayList.get(indexOf);
                    k3Var.f(false);
                    c71Var.N(false);
                    i2 i2Var10 = this.H3;
                    if (i2Var10 != null) {
                        i2Var10.h();
                    }
                    post(new r2(this, aVar3, length2, 0));
                    return true;
                }
                View A14 = A1(aVar);
                if (A14 instanceof f6) {
                    f6 f6Var = (f6) A14;
                    i1 authorEditText = f6Var.getAuthorEditText();
                    i2 i2Var11 = this.H3;
                    if (i2Var11 != null) {
                        i2Var11.d();
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
                    int y11 = hg.c.y(i14, i15, length9, 0);
                    spannableStringBuilder3.replace(y11, hg.c.w(i14, i15, length9, 0), (CharSequence) sb11);
                    authorEditText.setTextSilently(spannableStringBuilder3);
                    authorEditText.invalidateEffects();
                    f6Var.w();
                    int length10 = sb11.length() + y11;
                    k3Var.f(false);
                    i2 i2Var12 = this.H3;
                    if (i2Var12 != null) {
                        i2Var12.h();
                    }
                    v3Var.onContentChanged();
                    post(new w2(authorEditText, length10, 1));
                    return true;
                }
                return true;
            }
            boolean z14 = i16;
            if (((a) arrayList.get(i18)).i || y3((a) arrayList.get(i18))) {
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
    public final boolean X3(a aVar, boolean z10) {
        int i10;
        i2 i2Var;
        int indexOf = this.j3.indexOf(aVar);
        if (indexOf >= 0) {
            View A1 = A1(aVar);
            if (A1 instanceof f6) {
                f6 f6Var = (f6) A1;
                if (f6Var.getEditText().isFocused()) {
                    i10 = f6Var.getEditText().getSelectionEnd();
                    i2Var = this.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (r3(indexOf, z10, false)) {
                        t4();
                        if (findFocus() instanceof i1) {
                            Y1();
                        } else {
                            this.W2.N(false);
                        }
                        i2 i2Var2 = this.H3;
                        if (i2Var2 != null) {
                            i2Var2.h();
                        }
                        if (i10 < 0) {
                            return true;
                        }
                        post(new r2(this, aVar, i10, 2));
                        return true;
                    }
                }
            }
            i10 = -1;
            i2Var = this.H3;
            if (i2Var != null) {
            }
            if (r3(indexOf, z10, false)) {
            }
        }
        return false;
    }

    public final void X4(a aVar, int i10) {
        boolean z10;
        x3 x3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            V4(aVar2, aVar2.b, 0, 0, false, false);
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
            x3Var = this;
        } else {
            z10 = false;
            x3Var = this;
            pageBlock = pageBlock2;
        }
        x3Var.V4(aVar2, pageBlock, max, max2, z11, z10);
    }

    public final void Y1() {
        f6 f6Var;
        a aVar;
        c6 c6Var;
        this.W2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof f6) && (aVar = (f6Var = (f6) childAt).x) != null && (c6Var = f6Var.y) != null) {
                f6Var.g(aVar, c6Var, f6Var.E);
            }
        }
    }

    public final void Y3() {
        int length;
        int y3;
        int w10;
        int length2;
        int y10;
        int w11;
        int length3;
        int y11;
        int w12;
        int length4;
        int y12;
        int w13;
        i1 O4;
        int length5;
        int y13;
        int w14;
        boolean M3 = M3();
        k3 k3Var = this.l3;
        if (M3) {
            int i10 = k3Var.p0;
            int i11 = k3Var.q0;
            if (i11 == k3Var.t0 && (O4 = O4(i10, i11)) != null && (y13 = hg.c.y(k3Var.r0, k3Var.u0, (length5 = O4.length()), 0)) < (w14 = hg.c.w(k3Var.r0, k3Var.u0, length5, 0))) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (h6.h(O4.getText(), y13, w14)) {
                    h6.n(O4.getText(), y13, w14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    p4();
                }
                O4.setSelectionOverride(y13, w14);
                O4.makeSelectedDate();
                return;
            }
            return;
        }
        if (z3()) {
            int i12 = k3Var.p0;
            i1 J2 = J2(i12);
            if (J2 != null && (y12 = hg.c.y(k3Var.r0, k3Var.u0, (length4 = J2.length()), 0)) < (w13 = hg.c.w(k3Var.r0, k3Var.u0, length4, 0))) {
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (h6.h(J2.getText(), y12, w13)) {
                    h6.n(J2.getText(), y12, w13);
                    J2.invalidateEffects();
                    f4(i12);
                    i2 i2Var4 = this.H3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    p4();
                }
                J2.setSelectionOverride(y12, w13);
                J2.makeSelectedDate();
                return;
            }
            return;
        }
        if (x3()) {
            int i13 = k3Var.p0;
            i1 t22 = t2(i13);
            if (t22 != null && (y11 = hg.c.y(k3Var.r0, k3Var.u0, (length3 = t22.length()), 0)) < (w12 = hg.c.w(k3Var.r0, k3Var.u0, length3, 0))) {
                i2 i2Var5 = this.H3;
                if (i2Var5 != null) {
                    i2Var5.d();
                }
                if (h6.h(t22.getText(), y11, w12)) {
                    h6.n(t22.getText(), y11, w12);
                    t22.invalidateEffects();
                    e4(i13);
                    i2 i2Var6 = this.H3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    p4();
                }
                t22.setSelectionOverride(y11, w12);
                t22.makeSelectedDate();
                return;
            }
            return;
        }
        if (!H3()) {
            f6 H4 = H4();
            if (H4 != null && (y3 = hg.c.y(k3Var.r0, k3Var.u0, (length = H4.getEditText().length()), 0)) < (w10 = hg.c.w(k3Var.r0, k3Var.u0, length, 0))) {
                i2 i2Var7 = this.H3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (h6.h(H4.getEditText().getText(), y3, w10)) {
                    h6.n(H4.getEditText().getText(), y3, w10);
                    H4.getEditText().invalidateEffects();
                    H4.x();
                    i2 i2Var8 = this.H3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    p4();
                }
                H4.getEditText().setSelectionOverride(y3, w10);
                H4.getEditText().makeSelectedDate();
                return;
            }
            return;
        }
        int i14 = k3Var.p0;
        i1 k42 = k4(i14);
        if (k42 != null && (y10 = hg.c.y(k3Var.r0, k3Var.u0, (length2 = k42.length()), 0)) < (w11 = hg.c.w(k3Var.r0, k3Var.u0, length2, 0))) {
            i2 i2Var9 = this.H3;
            if (i2Var9 != null) {
                i2Var9.d();
            }
            if (h6.h(k42.getText(), y10, w11)) {
                h6.n(k42.getText(), y10, w11);
                k42.invalidateEffects();
                g4(i14);
                i2 i2Var10 = this.H3;
                if (i2Var10 != null) {
                    i2Var10.h();
                }
                p4();
            }
            k42.setSelectionOverride(y10, w11);
            k42.makeSelectedDate();
        }
    }

    public final a Y4() {
        k3 k3Var;
        int i10;
        a R2 = R2();
        return (R2 == null && (k3Var = this.l3) != null && k3Var.x() && (i10 = k3Var.p0) == k3Var.s0) ? z4(i10) : R2;
    }

    public final boolean Z1(int i10, int i11) {
        k3 k3Var;
        ArrayList arrayList = this.L3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] P3 = P3(max);
            int[] P32 = P3(max2);
            a aVar = (a) this.L3.get(P3[0]);
            if (P3[0] == P32[0] || max == max2) {
                View A1 = A1(aVar);
                if (A1 instanceof f6) {
                    f6 f6Var = (f6) A1;
                    f6Var.B();
                    i1 editText = f6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(P3[1], length), Math.min(P32[1], length));
                }
            } else {
                View A12 = A1(aVar);
                View A13 = A1(this.L3.get(P32[0]));
                if ((A12 instanceof f6) && (A13 instanceof f6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.j3;
                        int size = arrayList2.size();
                        k3Var = this.l3;
                        if (i12 >= size) {
                            break;
                        }
                        k3Var.X(i12, f6.z(((a) arrayList2.get(i12)).b));
                        i12++;
                    }
                    f6 f6Var2 = (f6) A12;
                    int length2 = f6Var2.getEditText().length();
                    if (P3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!k3Var.j0(f6Var2, 0, P3[1], length2)) {
                        f6Var2.B();
                        return true;
                    }
                    k3Var.b0(0, P32[1], (f6) A13);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList Z2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        boolean z11;
        x3 x3Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.j3;
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
                ArrayList<TL_iv.PageBlock> Z2 = Z2(i15, i16, i12 + 1, true);
                if (Z2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.k3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Z2.size() == 1 && (Z2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = Z2.get(0).text != null ? Z2.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Z2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (y3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int Q3 = Q3(i15);
                pageblockdetails.blocks = Z2(i15 + 1, Math.min(Q3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = Q3 + 1;
            } else {
                int i17 = aVar.c;
                if (i17 <= 0) {
                    K2(aVar, arrayList);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                        i13 = i11;
                        i14 = i12;
                        x3Var = this;
                    } else {
                        z11 = false;
                        x3Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock l22 = x3Var.l2(i15, i17, i13, i14, z11, iArr);
                    if (l22 != null) {
                        arrayList.add(l22);
                    }
                    int i18 = iArr[0];
                    i15 = i18 <= 0 ? i13 : i18;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && A3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && A3((TL_iv.PageBlock) hg.c.g(1, arrayList))) {
                a1.g.y(1, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z3(int i10) {
        i2 i2Var;
        int i11;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        int length;
        int y3;
        int w10;
        int length2;
        int y10;
        int w11;
        int length3;
        int y11;
        int w12;
        i2 i2Var2;
        int i13;
        k3 k3Var = this.l3;
        if (k3Var != null && k3Var.x()) {
            boolean M3 = M3();
            v3 v3Var = this.f3;
            int i14 = 0;
            if (M3) {
                int i15 = k3Var.p0;
                int i16 = k3Var.q0;
                int i17 = k3Var.t0;
                int i18 = k3Var.r0;
                int i19 = k3Var.u0;
                boolean L3 = L3(i10, i15, i16, i18, i17, i19);
                int x22 = !L3 ? x2(i10) : 0;
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                this.G3 = true;
                int i20 = i16;
                boolean z11 = false;
                while (i20 <= i17) {
                    i1 O4 = O4(i15, i20);
                    if (O4 == null) {
                        i13 = i16;
                    } else {
                        int length4 = O4.length();
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
                            if (L3) {
                                O4.removeStyle(i10, max, max2);
                            } else {
                                if (x22 != 0) {
                                    O4.removeStyle(x22, max, max2);
                                }
                                O4.addStyle(i10, max, max2);
                            }
                            O4.invalidateEffects();
                            O4.requestLayout();
                            h4(i15, i20);
                            z11 = true;
                        }
                    }
                    i20++;
                    i16 = i13;
                }
                this.G3 = false;
                if (z11 && (i2Var2 = this.H3) != null) {
                    i2Var2.h();
                }
                v3Var.l();
                if (z11) {
                    p4();
                }
            } else if (z3()) {
                int i24 = k3Var.p0;
                i1 J2 = J2(i24);
                if (J2 != null && (y11 = hg.c.y(k3Var.r0, k3Var.u0, (length3 = J2.length()), 0)) < (w12 = hg.c.w(k3Var.r0, k3Var.u0, length3, 0))) {
                    boolean z12 = (J2.getCurrentStyle(y11, w12) & i10) == 0;
                    i2 i2Var4 = this.H3;
                    if (i2Var4 != null) {
                        i2Var4.d();
                    }
                    this.G3 = true;
                    if (z12) {
                        int x23 = x2(i10);
                        if (x23 != 0) {
                            J2.removeStyle(x23, y11, w12);
                        }
                        J2.addStyle(i10, y11, w12);
                    } else {
                        J2.removeStyle(i10, y11, w12);
                    }
                    this.G3 = false;
                    f4(i24);
                    J2.invalidateEffects();
                    J2.requestLayout();
                    i2 i2Var5 = this.H3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    v3Var.l();
                    p4();
                }
            } else if (x3()) {
                int i25 = k3Var.p0;
                i1 t22 = t2(i25);
                if (t22 != null && (y10 = hg.c.y(k3Var.r0, k3Var.u0, (length2 = t22.length()), 0)) < (w11 = hg.c.w(k3Var.r0, k3Var.u0, length2, 0))) {
                    boolean z13 = (t22.getCurrentStyle(y10, w11) & i10) == 0;
                    int x24 = z13 ? x2(i10) : 0;
                    i2 i2Var6 = this.H3;
                    if (i2Var6 != null) {
                        i2Var6.d();
                    }
                    this.G3 = true;
                    if (z13) {
                        if (x24 != 0) {
                            t22.removeStyle(x24, y10, w11);
                        }
                        t22.addStyle(i10, y10, w11);
                    } else {
                        t22.removeStyle(i10, y10, w11);
                    }
                    t22.invalidateEffects();
                    t22.requestLayout();
                    e4(i25);
                    this.G3 = false;
                    i2 i2Var7 = this.H3;
                    if (i2Var7 != null) {
                        i2Var7.h();
                    }
                    v3Var.l();
                    p4();
                }
            } else if (H3()) {
                int i26 = k3Var.p0;
                i1 k42 = k4(i26);
                if (k42 != null && (y3 = hg.c.y(k3Var.r0, k3Var.u0, (length = k42.length()), 0)) < (w10 = hg.c.w(k3Var.r0, k3Var.u0, length, 0))) {
                    boolean z14 = (k42.getCurrentStyle(y3, w10) & i10) == 0;
                    int x25 = z14 ? x2(i10) : 0;
                    i2 i2Var8 = this.H3;
                    if (i2Var8 != null) {
                        i2Var8.d();
                    }
                    this.G3 = true;
                    if (z14) {
                        if (x25 != 0) {
                            k42.removeStyle(x25, y3, w10);
                        }
                        k42.addStyle(i10, y3, w10);
                    } else {
                        k42.removeStyle(i10, y3, w10);
                    }
                    k42.invalidateEffects();
                    k42.requestLayout();
                    g4(i26);
                    this.G3 = false;
                    i2 i2Var9 = this.H3;
                    if (i2Var9 != null) {
                        i2Var9.h();
                    }
                    v3Var.l();
                    p4();
                }
            } else {
                int i27 = k3Var.p0;
                int i28 = k3Var.s0;
                int i29 = k3Var.r0;
                int i30 = k3Var.u0;
                if (i27 >= 0 && i28 >= 0 && i28 >= i27 && i28 < this.n4.size()) {
                    int i31 = i10;
                    boolean K3 = K3(i31, i27, i29, i28, i30);
                    boolean z15 = !K3;
                    int x26 = !K3 ? x2(i31) : 0;
                    i2 i2Var10 = this.H3;
                    if (i2Var10 != null) {
                        i2Var10.d();
                    }
                    this.G3 = true;
                    int i32 = i27;
                    boolean z16 = false;
                    while (i32 <= i28) {
                        a z42 = z4(i32);
                        if (z42 != null) {
                            TL_iv.PageBlock pageBlock = z42.b;
                            if (B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int j22 = j2(i32);
                                int i33 = i32 == i27 ? i29 : i14;
                                z10 = z16;
                                int i34 = i32 == i28 ? i30 : j22;
                                int max3 = Math.max(i14, Math.min(i33, j22));
                                int max4 = Math.max(i14, Math.min(i34, j22));
                                if (max3 >= max4) {
                                    i11 = x26;
                                    z16 = z10;
                                    i32++;
                                    i31 = i10;
                                    x26 = i11;
                                    i14 = 0;
                                } else {
                                    f6 v22 = v2(i32);
                                    if (v22 != null) {
                                        org.telegram.ui.ActionBar.v4 styleDelegate = v22.getStyleDelegate();
                                        if (K3) {
                                            styleDelegate.removeStyle(i31, max3, max4);
                                        } else {
                                            if (x26 != 0) {
                                                styleDelegate.removeStyle(x26, max3, max4);
                                            }
                                            styleDelegate.addStyle(i31, max3, max4);
                                        }
                                        v22.getEditText().invalidateEffects();
                                        v22.getEditText().requestLayout();
                                        v22.x();
                                        i11 = x26;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(f6.A(z42.b));
                                        if (K3 || x26 == 0) {
                                            i11 = x26;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i12 = max3;
                                        } else {
                                            i11 = x26;
                                            i12 = max3;
                                            h6.o(spannableStringBuilder2, i12, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        h6.o(spannableStringBuilder, i12, max4, i31, z15, null);
                                        f6.d(z42.b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i32++;
                                    i31 = i10;
                                    x26 = i11;
                                    i14 = 0;
                                }
                            }
                        }
                        i11 = x26;
                        z10 = z16;
                        z16 = z10;
                        i32++;
                        i31 = i10;
                        x26 = i11;
                        i14 = 0;
                    }
                    boolean z17 = z16;
                    this.G3 = i14;
                    if (z17 && (i2Var = this.H3) != null) {
                        i2Var.h();
                    }
                    v3Var.l();
                    if (z17) {
                        p4();
                    }
                }
            }
        }
    }

    public final void Z4(float f7, float f10) {
        TL_iv.pageTableCell m10;
        q5 q5Var = this.g4;
        if (!this.z3 || q5Var == null || this.v3 != q5Var || (m10 = q5Var.m((int) ((f7 - q5Var.getLeft()) - getLeft()), (int) ((f10 - q5Var.getTop()) - getTop()))) == null || m10 == this.C3) {
            return;
        }
        this.C3 = m10;
        q5Var.w(this.B3, m10);
    }

    public final ArrayList a3() {
        return Z2(0, this.j3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a4(View view) {
        i1 editText;
        i1 i1Var;
        x3 x3Var;
        w3 w3Var = null;
        if (m2()) {
            boolean M3 = M3();
            k3 k3Var = this.l3;
            if (M3) {
                int i10 = k3Var.p0;
                int i11 = k3Var.q0;
                if (i11 == k3Var.t0) {
                    editText = O4(i10, i11);
                    i1Var = editText;
                    if (i1Var != null) {
                        int length = i1Var.length();
                        x3Var = this;
                        w3Var = new w3(x3Var, i1Var, hg.c.y(k3Var.r0, k3Var.u0, length, 0), hg.c.w(k3Var.r0, k3Var.u0, length, 0), null);
                    }
                }
            } else {
                if (z3()) {
                    editText = J2(k3Var.p0);
                } else if (x3()) {
                    editText = t2(k3Var.p0);
                } else if (H3()) {
                    editText = k4(k3Var.p0);
                } else {
                    f6 H4 = H4();
                    if (H4 != null) {
                        editText = H4.getEditText();
                    }
                }
                i1Var = editText;
                if (i1Var != null) {
                }
            }
            if (w3Var == null) {
                p3(false);
                x3Var.f3.e(w3Var, view);
                return;
            }
            return;
        }
        x3Var = this;
        if (w3Var == null) {
        }
    }

    public final void a5(a aVar, String str) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                pageblockpreformatted.language = str;
                f6 v22 = v2(this.j3.indexOf(aVar));
                if (v22 != null && (aVar2 = v22.x) != null) {
                    v22.I(aVar2.b, true);
                    v22.H = null;
                    v22.C();
                }
                i2 i2Var2 = this.H3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b2() {
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
            ArrayList arrayList6 = this.j3;
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
                    a1.g.y(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                i13 = i14;
            } else {
                for (int i17 = i14; i17 < arrayList8.size(); i17++) {
                    ((Long) arrayList8.get(i17)).getClass();
                    arrayList7.add(new q0());
                }
                for (int i18 = i14; i18 < arrayList.size(); i18++) {
                    arrayList7.add((q0) arrayList.get(i18));
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
                            arrayList2.add(Long.valueOf(q0.a()));
                            arrayList3.add(Boolean.valueOf(i10 != 0 ? i19 : i11));
                            arrayList4.add(Integer.valueOf(i11));
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i21)).getClass();
                        if (i10 != 0) {
                            if (((((Long) arrayList5.get(i21)).longValue() == 0 || !F3(aVar.b)) ? i12 : i11) != 0) {
                                arrayList4.set(i21, Integer.valueOf(((Integer) arrayList4.get(i21)).intValue() + 1));
                                arrayList5.set(i21, Long.valueOf(aVar.a));
                            } else {
                                ((Integer) arrayList4.get(i21)).getClass();
                                ((Long) arrayList5.get(i21)).getClass();
                            }
                            arrayList7.add(new q0());
                        } else {
                            ((Boolean) arrayList3.get(i21)).getClass();
                            arrayList7.add(new q0());
                        }
                        i20++;
                        i14 = i11;
                        i16 = i12;
                    }
                }
                i13 = i14;
                if (y3(aVar)) {
                    boolean z10 = ((TL_iv.pageBlockDetails) aVar.b).open;
                    q0.a();
                    arrayList.add(new q0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (f6.p(aVar.b)) {
                    q0.a();
                    arrayList7.add(new q0());
                }
            }
            i15++;
            i14 = i13;
        }
    }

    public final boolean b3() {
        ArrayList arrayList = this.j3;
        a aVar = arrayList.isEmpty() ? null : (a) hg.c.g(1, arrayList);
        if (aVar != null && !F3(aVar.b) && !aVar.i && !y3(aVar) && !L2(aVar.b)) {
            if (!(A1(aVar) instanceof f6)) {
                return false;
            }
            f3(aVar);
            return true;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.W2.N(false);
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        post(new p2(this, aVar2, 21));
        return true;
    }

    public final void b4() {
        int length;
        int y3;
        int w10;
        int length2;
        int y10;
        int w11;
        int length3;
        int y11;
        int w12;
        int length4;
        int y12;
        int w13;
        i1 O4;
        int length5;
        int y13;
        int w14;
        boolean M3 = M3();
        v3 v3Var = this.f3;
        k3 k3Var = this.l3;
        if (M3) {
            int i10 = k3Var.p0;
            int i11 = k3Var.q0;
            if (i11 == k3Var.t0 && (O4 = O4(i10, i11)) != null && (y13 = hg.c.y(k3Var.r0, k3Var.u0, (length5 = O4.length()), 0)) < (w14 = hg.c.w(k3Var.r0, k3Var.u0, length5, 0))) {
                if (h6.h(O4.getText(), y13, w14)) {
                    i2 i2Var = this.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    h6.n(O4.getText(), y13, w14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var3 = this.H3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (h6.g(O4.getText(), y13, w14)) {
                    h6.m(O4.getText(), y13, w14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    i2 i2Var4 = this.H3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    p4();
                }
                O4.setSelectionOverride(y13, w14);
                p3(false);
                F4(O4);
                return;
            }
            return;
        }
        if (z3()) {
            int i12 = k3Var.p0;
            i1 J2 = J2(i12);
            if (J2 != null && (y12 = hg.c.y(k3Var.r0, k3Var.u0, (length4 = J2.length()), 0)) < (w13 = hg.c.w(k3Var.r0, k3Var.u0, length4, 0))) {
                if (h6.h(J2.getText(), y12, w13)) {
                    i2 i2Var5 = this.H3;
                    if (i2Var5 != null) {
                        i2Var5.d();
                    }
                    h6.n(J2.getText(), y12, w13);
                    J2.invalidateEffects();
                    f4(i12);
                    i2 i2Var6 = this.H3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var7 = this.H3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (h6.g(J2.getText(), y12, w13)) {
                    h6.m(J2.getText(), y12, w13);
                    J2.invalidateEffects();
                    f4(i12);
                    i2 i2Var8 = this.H3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    p4();
                }
                J2.setSelectionOverride(y12, w13);
                p3(false);
                F4(J2);
                return;
            }
            return;
        }
        if (x3()) {
            int i13 = k3Var.p0;
            i1 t22 = t2(i13);
            if (t22 != null && (y11 = hg.c.y(k3Var.r0, k3Var.u0, (length3 = t22.length()), 0)) < (w12 = hg.c.w(k3Var.r0, k3Var.u0, length3, 0))) {
                if (h6.h(t22.getText(), y11, w12)) {
                    i2 i2Var9 = this.H3;
                    if (i2Var9 != null) {
                        i2Var9.d();
                    }
                    h6.n(t22.getText(), y11, w12);
                    t22.invalidateEffects();
                    e4(i13);
                    i2 i2Var10 = this.H3;
                    if (i2Var10 != null) {
                        i2Var10.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var11 = this.H3;
                if (i2Var11 != null) {
                    i2Var11.d();
                }
                if (h6.g(t22.getText(), y11, w12)) {
                    h6.m(t22.getText(), y11, w12);
                    t22.invalidateEffects();
                    e4(i13);
                    i2 i2Var12 = this.H3;
                    if (i2Var12 != null) {
                        i2Var12.h();
                    }
                    p4();
                }
                t22.setSelectionOverride(y11, w12);
                p3(false);
                F4(t22);
                return;
            }
            return;
        }
        if (!H3()) {
            f6 H4 = H4();
            if (H4 != null && (y3 = hg.c.y(k3Var.r0, k3Var.u0, (length = H4.getEditText().length()), 0)) < (w10 = hg.c.w(k3Var.r0, k3Var.u0, length, 0))) {
                if (h6.h(H4.getEditText().getText(), y3, w10)) {
                    i2 i2Var13 = this.H3;
                    if (i2Var13 != null) {
                        i2Var13.d();
                    }
                    h6.n(H4.getEditText().getText(), y3, w10);
                    H4.getEditText().invalidateEffects();
                    H4.x();
                    i2 i2Var14 = this.H3;
                    if (i2Var14 != null) {
                        i2Var14.h();
                    }
                    v3Var.l();
                    p4();
                    return;
                }
                i2 i2Var15 = this.H3;
                if (i2Var15 != null) {
                    i2Var15.d();
                }
                if (h6.g(H4.getEditText().getText(), y3, w10)) {
                    h6.m(H4.getEditText().getText(), y3, w10);
                    H4.getEditText().invalidateEffects();
                    H4.x();
                    i2 i2Var16 = this.H3;
                    if (i2Var16 != null) {
                        i2Var16.h();
                    }
                    p4();
                }
                H4.getEditText().setSelectionOverride(y3, w10);
                p3(false);
                F4(H4.getEditText());
                return;
            }
            return;
        }
        int i14 = k3Var.p0;
        i1 k42 = k4(i14);
        if (k42 != null && (y10 = hg.c.y(k3Var.r0, k3Var.u0, (length2 = k42.length()), 0)) < (w11 = hg.c.w(k3Var.r0, k3Var.u0, length2, 0))) {
            if (h6.h(k42.getText(), y10, w11)) {
                i2 i2Var17 = this.H3;
                if (i2Var17 != null) {
                    i2Var17.d();
                }
                h6.n(k42.getText(), y10, w11);
                k42.invalidateEffects();
                g4(i14);
                i2 i2Var18 = this.H3;
                if (i2Var18 != null) {
                    i2Var18.h();
                }
                v3Var.l();
                p4();
                return;
            }
            i2 i2Var19 = this.H3;
            if (i2Var19 != null) {
                i2Var19.d();
            }
            if (h6.g(k42.getText(), y10, w11)) {
                h6.m(k42.getText(), y10, w11);
                k42.invalidateEffects();
                g4(i14);
                i2 i2Var20 = this.H3;
                if (i2Var20 != null) {
                    i2Var20.h();
                }
                p4();
            }
            k42.setSelectionOverride(y10, w11);
            p3(false);
            F4(k42);
        }
    }

    public final void c2(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
        a aVar = new a(pageblockaudio, 0, 0);
        u uVar = new u();
        aVar.g = uVar;
        uVar.c = true;
        long j3 = document.id;
        boolean z10 = j3 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (z10) {
            TLRPC.Message message = messageObject.messageOwner;
            String str = message != null ? message.attachPath : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            u uVar2 = aVar.g;
            uVar2.i = document;
            uVar2.e = str;
            uVar2.a = 1;
            uVar2.f = 0.0f;
        } else {
            uVar.h = document;
            uVar.i = document;
            uVar.a = 2;
            pageblockaudio.audio_id = j3;
        }
        v3(aVar);
        if (z10) {
            u uVar3 = aVar.g;
            String str2 = uVar3.e;
            IdentityHashMap identityHashMap = this.X3;
            c5 c5Var = (c5) identityHashMap.remove(uVar3);
            if (c5Var != null) {
                c5Var.b();
            }
            c5 c5Var2 = new c5(this.d3, str2, document, new h3(aVar, uVar3, this));
            identityHashMap.put(uVar3, c5Var2);
            c5Var2.d();
        }
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        this.f3.onContentChanged();
    }

    public final void c3(a aVar, boolean z10) {
        View A1 = A1(aVar);
        if (!(A1 instanceof i5)) {
            d3(aVar, z10);
            return;
        }
        i1 i1Var = ((i5) A1).r;
        i1Var.r();
        i1Var.setSelection(z10 ? i1Var.length() : 0);
    }

    public final void c4() {
        i1 editText;
        Runnable l2Var;
        int length;
        final int y3;
        final int w10;
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x()) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (M3()) {
            int i12 = k3Var.p0;
            int i13 = k3Var.q0;
            if (i13 != k3Var.t0) {
                return;
            }
            editText = O4(i12, i13);
            l2Var = new q2(this, i12, i13, 1);
        } else if (z3()) {
            int i14 = k3Var.p0;
            editText = J2(i14);
            l2Var = new k2(this, i14, 3);
        } else if (x3()) {
            int i15 = k3Var.p0;
            editText = t2(i15);
            l2Var = new k2(this, i15, i11);
        } else if (H3()) {
            int i16 = k3Var.p0;
            editText = k4(i16);
            l2Var = new k2(this, i16, i10);
        } else {
            f6 H4 = H4();
            if (H4 == null) {
                return;
            }
            editText = H4.getEditText();
            l2Var = new l2(H4, i11);
        }
        final i1 i1Var = editText;
        final Runnable runnable = l2Var;
        if (i1Var != null && (y3 = hg.c.y(k3Var.r0, k3Var.u0, (length = i1Var.length()), 0)) <= (w10 = hg.c.w(k3Var.r0, k3Var.u0, length, 0))) {
            Editable text = i1Var.getText();
            int i17 = t.h;
            String str = null;
            if (text != null) {
                t[] tVarArr = (t[]) text.getSpans(y3, w10, t.class);
                if (tVarArr.length > 0) {
                    str = tVarArr[0].a;
                }
            }
            if (str == null) {
                str = i1Var.getText().subSequence(y3, w10).toString();
            }
            final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
            int i18 = org.telegram.ui.ActionBar.i6.G6;
            org.telegram.ui.ActionBar.e6 e6Var = this.e3;
            final int w02 = org.telegram.ui.ActionBar.i6.w0(i18, e6Var);
            r.X(getContext(), str, new Utilities.Callback() { // from class: ii.y2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    t a2;
                    String str2 = (String) obj;
                    x3 x3Var = x3.this;
                    x3Var.getClass();
                    if (TextUtils.isEmpty(str2) || (a2 = t.a(str2, w02, dp)) == null) {
                        return;
                    }
                    i2 i2Var = x3Var.H3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    k3 k3Var2 = x3Var.l3;
                    if (k3Var2 != null) {
                        k3Var2.f(false);
                    }
                    i1 i1Var2 = i1Var;
                    i1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(a2, 0, 1, 33);
                    Editable text2 = i1Var2.getText();
                    int max = Math.max(0, Math.min(y3, text2.length()));
                    text2.replace(max, Math.max(max, Math.min(w10, text2.length())), spannableString);
                    runnable.run();
                    i2 i2Var2 = x3Var.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.f3.onContentChanged();
                    int min = Math.min(max + 1, i1Var2.length());
                    i1Var2.r();
                    x3Var.post(new w2(i1Var2, min, 3));
                }
            }, e6Var);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(1:9)(1:(4:37|11|12|(4:14|16|17|(1:27)(4:19|(1:21)(1:26)|22|24)))(1:36))|10|11|12|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #0 {Exception -> 0x0078, blocks: (B:12:0x0046, B:14:0x006c), top: B:11:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c5(CharSequence charSequence) {
        String str;
        ClipboardManager clipboardManager;
        int i10;
        int i11;
        int i12;
        int i13;
        k3 k3Var = this.l3;
        a z42 = z4(k3Var.p0);
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(z42);
        int indexOf2 = arrayList.indexOf(z4(k3Var.s0));
        int i14 = k3Var.r0;
        int i15 = k3Var.u0;
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
                    HashMap hashMap = this.k3;
                    StringBuilder sb2 = new StringBuilder();
                    d4 d4Var = new d4();
                    f4.F(sb2, arrayList, new int[]{i11}, i12, i11, i12, i13, i10, d4Var, false, 0, hashMap);
                    d4Var.c(sb2);
                    str = sb2.toString();
                    if (!TextUtils.isEmpty(str)) {
                        x4.a(B2(i11, i12), A2(i11, i12));
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
                HashMap hashMap2 = this.k3;
                StringBuilder sb22 = new StringBuilder();
                d4 d4Var2 = new d4();
                f4.F(sb22, arrayList, new int[]{i11}, i12, i11, i12, i13, i10, d4Var2, false, 0, hashMap2);
                d4Var2.c(sb22);
                str = sb22.toString();
                if (!TextUtils.isEmpty(str)) {
                }
            }
            clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager != null) {
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            return;
        }
        str = null;
    }

    public final void d2(String str) {
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
            e2(tL_document, str);
        }
    }

    public final void d3(a aVar, boolean z10) {
        View A1 = A1(aVar);
        if (!(A1 instanceof q5)) {
            if (z10 && (A1 instanceof f6)) {
                f6 f6Var = (f6) A1;
                if (f6Var.n()) {
                    f6Var.i();
                    return;
                }
            }
            i1 S3 = S3(A1);
            if (S3 == null) {
                e3(aVar);
                return;
            }
            S3.r();
            if (z10) {
                S3.setSelection(S3.length());
                return;
            }
            return;
        }
        q5 q5Var = (q5) A1;
        i1 i1Var = q5Var.r;
        j6 j6Var = q5Var.F;
        if (j6Var == null) {
            return;
        }
        if (!z10) {
            i1Var.r();
            i1Var.setSelection(0);
        } else {
            if (j6Var.g.isEmpty()) {
                return;
            }
            t5 m10 = q5Var.v.m((TL_iv.pageTableCell) hg.c.g(1, q5Var.F.g));
            if (m10 == null) {
                return;
            }
            i1 i1Var2 = m10.a;
            i1Var2.r();
            i1Var2.setSelection(i1Var2.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        x3 x3Var;
        HashMap hashMap;
        ArrayList x42;
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
            k3 k3Var = this.l3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    x42 = x4(f4.z(str, hashMap));
                } catch (Exception e7) {
                    e = e7;
                    x3Var = this;
                }
                if (!x42.isEmpty()) {
                    ArrayList arrayList = this.j3;
                    x3Var = this;
                    try {
                        if (x3Var.J4(arrayList.indexOf(z4(k3Var.p0)), arrayList.indexOf(z4(k3Var.s0)), k3Var.r0, k3Var.u0, x42)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            x3Var.k3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                        coerceToText = itemAt.coerceToText(getContext());
                        if (coerceToText == null) {
                        }
                        x3Var.X1(k3Var.p0, k3Var.r0, k3Var.s0, k3Var.u0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    x3Var.X1(k3Var.p0, k3Var.r0, k3Var.s0, k3Var.u0, coerceToText.toString().split("\n", -1));
                }
            }
            x3Var = this;
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
            }
            x3Var.X1(k3Var.p0, k3Var.r0, k3Var.s0, k3Var.u0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        k3 k3Var2 = this.l3;
        if (!isEmpty) {
        }
        x3Var = this;
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        x3Var.X1(k3Var2.p0, k3Var2.r0, k3Var2.s0, k3Var2.u0, coerceToText.toString().split("\n", -1));
    }

    @Override // org.telegram.ui.Components.k71, org.telegram.ui.Components.qm0, android.view.ViewGroup, android.view.View
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
        boolean z10;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.n4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                a aVar4 = (R < 0 || R >= arrayList.size()) ? null : (a) arrayList.get(R);
                if (aVar4 != null) {
                    ArrayList arrayList3 = aVar4.k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.o4 == null) {
                    xm0 xm0Var = new xm0(this);
                    this.o4 = xm0Var;
                    xm0Var.a(null, null, null, this.e3, 1);
                    n8.a(this.o4, this.e3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j3 = 0;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
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
                        if (!z11 || (l4 != null && l4.longValue() == j3)) {
                            l10 = l4;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f7 = f11;
                        } else {
                            int l42 = l4(i15, aVar5, true);
                            l10 = l4;
                            int l43 = l4(i15, aVar6, false);
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
                                int B = org.telegram.messenger.q.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, l42 + f10, B, f12 - l43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.o4.b(canvas, rectF, floor, floor, floor, f11);
                                    f7 = f11;
                                    this.o4.e(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f7 = f11;
                            z11 = false;
                        }
                        if (view == null || l10 == null) {
                            aVar5 = aVar2;
                            aVar = aVar3;
                        } else {
                            if (z11) {
                                aVar5 = aVar2;
                                z10 = z11;
                            } else {
                                j3 = l10.longValue();
                                f10 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            }
                            if (aVar == null || aVar != this.Q3) {
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
                                i16++;
                                aVar6 = aVar;
                                childCount = i10;
                                i15 = i11;
                                i14 = i12;
                                arrayList = arrayList2;
                            } else {
                                z11 = z10;
                            }
                        }
                        f11 = f7;
                        i16++;
                        aVar6 = aVar;
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

    public final void e2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
        a aVar = new a(pageblockdocument, 0, 0);
        u uVar = new u();
        aVar.g = uVar;
        uVar.d = true;
        long j3 = document.id;
        boolean z10 = j3 == 0 || document.dc_id == 0 || document.access_hash == 0;
        if (!z10) {
            uVar.h = document;
            uVar.a = 2;
            pageblockdocument.document_id = j3;
        } else {
            if (TextUtils.isEmpty(str) || !sc.v.u(str)) {
                return;
            }
            u uVar2 = aVar.g;
            uVar2.h = document;
            uVar2.e = str;
            uVar2.a = 1;
            uVar2.f = 0.0f;
        }
        v3(aVar);
        if (z10) {
            u uVar3 = aVar.g;
            IdentityHashMap identityHashMap = this.X3;
            c5 c5Var = (c5) identityHashMap.remove(uVar3);
            if (c5Var != null) {
                c5Var.b();
            }
            c5 c5Var2 = new c5(this.d3, str, document, new g3(this, uVar3, aVar, str));
            identityHashMap.put(uVar3, c5Var2);
            c5Var2.d();
        }
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        this.f3.onContentChanged();
    }

    public final void e3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            ((f6) A1).B();
        } else if (A1 instanceof u0) {
            ((u0) A1).d.r();
        }
    }

    public final void e4(int i10) {
        KeyEvent.Callback B4 = B4(i10);
        if (B4 instanceof m0) {
            ((m0) B4).b();
        }
    }

    public final void f2(Uri uri) {
        if (uri == null) {
            return;
        }
        a aVar = this.Z3;
        String str = null;
        this.Z3 = null;
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            str = context.getContentResolver().getType(uri);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        String str2 = str;
        boolean startsWith = str2 != null ? str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) : uri.toString().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        int i10 = this.p4;
        this.p4 = i10 - 1;
        Utilities.globalQueue.postRunnable(new s2(this, uri, startsWith, str2, i10, aVar));
    }

    public final void f3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            f6 f6Var = (f6) A1;
            f6Var.B();
            i1 editText = f6Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (A1 instanceof u0) {
            u0 u0Var = (u0) A1;
            u0Var.d.r();
            i1 editText2 = u0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void f4(int i10) {
        a z42 = z4(i10);
        i1 J2 = J2(i10);
        if (!y3(z42) || J2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) z42.b).title = h6.f(J2.getText());
    }

    public final void g2(MediaController.PhotoEntry photoEntry) {
        x3 x3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        i2 i2Var = this.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        boolean c10 = y4.c(photoEntry);
        a aVar = new a((photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.g = U3(photoEntry, str2);
        v3(aVar);
        if (c10) {
            L4(aVar, aVar.g, photoEntry);
            x3Var = this;
        } else {
            x3Var = this;
            x3Var.M4(aVar, aVar.g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        i2 i2Var2 = x3Var.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.f3.onContentChanged();
    }

    public final void g3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof f6) {
            f6 f6Var = (f6) A1;
            f6Var.B();
            f6Var.getEditText().setSelection(0);
        } else if (A1 instanceof u0) {
            u0 u0Var = (u0) A1;
            u0Var.d.r();
            u0Var.getEditText().setSelection(0);
        }
    }

    public final void g4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof f6) {
            ((f6) B4).w();
        }
    }

    public i1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        return null;
    }

    public o4 getMapDelegate() {
        return this.b4;
    }

    public View getOverlayView() {
        return this.m3;
    }

    public o9 getTextSelectionHelper() {
        return this.l3;
    }

    public final void h2(q5 q5Var) {
        q5 q5Var2 = this.g4;
        if (q5Var2 != null && q5Var2 != q5Var) {
            LinkedHashSet linkedHashSet = q5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                q5Var2.v.invalidate();
                q5Var2.t();
            }
        }
        this.g4 = q5Var;
        this.A3 = false;
        this.j4 = -1;
        this.i4 = -1;
        q5Var.setCellSelectionListener(this.k4);
        k3 k3Var = this.l3;
        if (k3Var != null && k3Var.x()) {
            k3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void h4(int i10, int i11) {
        t5 m10;
        View B4 = B4(i10);
        if (B4 instanceof q5) {
            q5 q5Var = (q5) B4;
            if (i11 == 0) {
                q5Var.u();
                return;
            }
            TL_iv.pageTableCell h = q5Var.h(i11);
            if (h == null || (m10 = q5Var.getGrid().m(h)) == null) {
                return;
            }
            j6.d(h, m10.a.getText());
        }
    }

    public final o3 i2() {
        int i10;
        int i11;
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x() || H3()) {
            return null;
        }
        a z42 = z4(k3Var.p0);
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(z42);
        int indexOf2 = arrayList.indexOf(z4(k3Var.s0));
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
            if (aVar.i || y3(aVar)) {
                return null;
            }
        }
        return new o3(this, i10, i11, k3Var.r0, k3Var.u0);
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
    public final boolean i3(KeyEvent keyEvent) {
        int i10;
        boolean z10;
        boolean z11;
        View findFocus;
        q5 V2;
        int i11;
        q5 q5Var;
        i5 i5Var;
        a aVar;
        int indexOf;
        boolean z12;
        i1 S3;
        Layout layout;
        boolean z13;
        Layout layout2;
        int i12;
        final float primaryHorizontal;
        a V3;
        int i13;
        int i14;
        int i15;
        int j42;
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
        a R2;
        int indexOf2;
        boolean z14;
        int i26;
        int i27;
        int unicodeChar;
        boolean z15;
        i2 i2Var;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isAltPressed = keyEvent.isAltPressed();
        k3 k3Var = this.l3;
        boolean x10 = k3Var.x();
        if (isCtrlPressed && !isAltPressed && (i2Var = this.H3) != null) {
            if (keyCode == 54 && !isShiftPressed) {
                i2Var.k();
                return true;
            }
            if ((keyCode == 54 && isShiftPressed) || keyCode == 53) {
                i2Var.i();
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
                b4();
                return true;
            }
            if (i28 != 0) {
                Z3(i28);
                return true;
            }
        }
        if (keyCode == 111 && x10) {
            k3Var.f(false);
            return true;
        }
        if (x10) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence r10 = k3Var.r();
                if (r10 == null || r10.length() == 0) {
                    return true;
                }
                c5(r10);
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence r11 = k3Var.r();
                if (r11 != null && r11.length() > 0) {
                    c5(r11);
                }
                F2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                d4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                F2();
                return true;
            }
            if (keyCode == 66) {
                u4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                u4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList = this.j3;
        if (!x10 && isShiftPressed && w3(keyCode) && (R2 = R2()) != null && (indexOf2 = arrayList.indexOf(R2)) >= 0) {
            View A1 = A1(R2);
            if (A1 instanceof f6) {
                f6 f6Var = (f6) A1;
                i1 editText = f6Var.getEditText();
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
                                        k3Var.X(i27, f6.z(((a) arrayList.get(i27)).b));
                                    }
                                    if (length2 != 0) {
                                        int max2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z14) {
                                            if (max2 >= length2) {
                                                length2--;
                                            }
                                            if (k3Var.j0(f6Var, 0, max2, length2)) {
                                                KeyEvent.Callback A12 = A1(aVar2);
                                                if (A12 instanceof n9) {
                                                    k3Var.b0(0, 0, (n9) A12);
                                                    break;
                                                } else {
                                                    u0(i26);
                                                    post(new p2(this, aVar2, 14));
                                                    break;
                                                }
                                            }
                                        } else if (k3Var.j0(f6Var, 0, max2, max2 > 0 ? 0 : 1)) {
                                            KeyEvent.Callback A13 = A1(aVar2);
                                            if (A13 instanceof n9) {
                                                k3Var.b0(0, A13 instanceof f6 ? ((f6) A13).getEditText().length() : 0, (n9) A13);
                                                break;
                                            } else {
                                                u0(i26);
                                                post(new p2(this, aVar2, 15));
                                                break;
                                            }
                                        }
                                    }
                                    if (!x10 && isShiftPressed && w3(keyCode)) {
                                        int i29 = (isCtrlPressed || isAltPressed) ? i10 : 0;
                                        int i30 = k3Var.B0;
                                        int i31 = k3Var.D0;
                                        int i32 = k3Var.C0;
                                        int i33 = k3Var.p0;
                                        int i34 = k3Var.q0;
                                        int i35 = k3Var.r0;
                                        int i36 = k3Var.s0;
                                        int i37 = i29;
                                        int i38 = k3Var.t0;
                                        int i39 = k3Var.u0;
                                        if (i30 == i33 && i31 == i34 && i32 == i35) {
                                            i33 = i36;
                                            i34 = i38;
                                        } else {
                                            i39 = i35;
                                        }
                                        View B4 = B4(i33);
                                        if (B4 != null) {
                                            if (B4 instanceof q5) {
                                                q5 q5Var2 = (q5) B4;
                                                j6 model = q5Var2.getModel();
                                                if (model != null) {
                                                    ArrayList arrayList2 = model.g;
                                                    if (!arrayList2.isEmpty()) {
                                                        int size = arrayList2.size() + 1;
                                                        int i40 = (i34 < 0 || i34 >= size) ? 0 : i34;
                                                        i1 l4 = q5Var2.l(i40);
                                                        if (l4 != null) {
                                                            Layout layout4 = l4.getLayout();
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
                                                                            length = j4(i22);
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
                                                                                    i1 l10 = q5Var2.l(i21);
                                                                                    Layout layout5 = l10 != null ? l10.getLayout() : null;
                                                                                    length = layout5 != null ? layout5.getText().length() : 0;
                                                                                } else {
                                                                                    length = q5Var2.getTitleEditText().length();
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
                                                                                int max3 = Math.max(1, j6.o(pagetablecell2)) + b11;
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
                                                                            i1 l11 = q5Var2.l(i46);
                                                                            Layout layout6 = l11 != null ? l11.getLayout() : null;
                                                                            length = layout6 != null ? layout6.getText().length() : 0;
                                                                            i34 = i46;
                                                                            i22 = i33;
                                                                            break;
                                                                        } else {
                                                                            int i47 = i33 - 1;
                                                                            if (i47 >= 0) {
                                                                                i22 = i47;
                                                                                length = j4(i47);
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
                                                if (B4 instanceof f6) {
                                                    Layout layout7 = ((f6) B4).getEditText().getLayout();
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
                                                                        j42 = j4(i15);
                                                                        int i49 = j42;
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
                                                                    i14 = j4(i16);
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
                                                    if ((B4 instanceof y0) || (B4 instanceof w4) || (B4 instanceof z) || (B4 instanceof q4) || (B4 instanceof s4)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i15 = i33 - 1;
                                                                if (i15 >= 0) {
                                                                    j42 = j4(i15);
                                                                    int i492 = j42;
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
                                                    u0(i18);
                                                }
                                                KeyEvent.Callback B42 = B4(i18);
                                                if (B42 instanceof n9) {
                                                    b02 = k3Var.b0(i19, i17, (n9) B42);
                                                    break;
                                                } else {
                                                    post(new ci.b0(this, i18, i19, i17, 1));
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
                                    if (!x10 && !isShiftPressed && !z10 && !z11 && w3(keyCode)) {
                                        boolean z16 = keyCode == 22 || keyCode == 20;
                                        this.n3 = z16 ? k3Var.s0 : k3Var.p0;
                                        this.o3 = z16 ? k3Var.u0 : k3Var.r0;
                                        this.p3 = z16 ? k3Var.t0 : k3Var.q0;
                                        k3Var.f(false);
                                        break;
                                    } else if (z10 || keyCode != 29 || (!k3Var.a0() && !T4())) {
                                        if (!x10 && !isShiftPressed && !z10 && !z11 && (keyCode == 20 || keyCode == 19)) {
                                            boolean z17 = keyCode != 20;
                                            i11 = 0;
                                            while (true) {
                                                if (i11 >= getChildCount()) {
                                                    View childAt = getChildAt(i11);
                                                    if (childAt instanceof q5) {
                                                        q5Var = (q5) childAt;
                                                        if (q5Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i11++;
                                                } else {
                                                    q5Var = null;
                                                }
                                            }
                                            c71 c71Var = this.W2;
                                            if (q5Var == null) {
                                                int indexOf3 = arrayList.indexOf(q5Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (!z17) {
                                                        int U2 = U2(indexOf3 - 1, -1);
                                                        if (U2 >= 0) {
                                                            post(new p2(this, (a) arrayList.get(U2), 5));
                                                        }
                                                    } else if (!q5Var.r()) {
                                                        int U22 = U2(indexOf3 + 1, 1);
                                                        if (U22 < 0) {
                                                            a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                            arrayList.add(aVar3);
                                                            c71Var.N(false);
                                                            post(new p2(this, aVar3, 2));
                                                        } else {
                                                            post(new p2(this, (a) arrayList.get(U22), 4));
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
                                                        if (childAt2 instanceof i5) {
                                                            i5Var = (i5) childAt2;
                                                            if (i5Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i52++;
                                                    } else {
                                                        i5Var = null;
                                                    }
                                                }
                                                if (i5Var != null) {
                                                    i1 i1Var = i5Var.r;
                                                    int indexOf4 = this.n4.indexOf(i5Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = i1Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(i1Var.getSelectionEnd()) : 0;
                                                        if (z17) {
                                                            if (layout8 != null) {
                                                                i13 = 1;
                                                                break;
                                                            } else {
                                                                i13 = 1;
                                                            }
                                                            a V32 = V3(indexOf4 + i13, i13);
                                                            if (V32 == null) {
                                                                a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(aVar4);
                                                                c71Var.N(false);
                                                                post(new p2(this, aVar4, 6));
                                                            } else {
                                                                post(new p2(this, V32, 7));
                                                            }
                                                            z13 = true;
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (V3 = V3(indexOf4 - 1, -1)) != null) {
                                                            post(new p2(this, V3, 8));
                                                            z13 = true;
                                                        }
                                                    }
                                                    z13 = false;
                                                } else {
                                                    int i53 = 0;
                                                    while (true) {
                                                        if (i53 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i53);
                                                            if (childAt3 instanceof f6) {
                                                                f6 f6Var2 = (f6) childAt3;
                                                                if (f6Var2.getEditText().isFocused() || (f6Var2.n() && f6Var2.h.isFocused())) {
                                                                }
                                                                i53++;
                                                            } else if (childAt3 instanceof m0) {
                                                                m0 m0Var = (m0) childAt3;
                                                                if (m0Var.getCaptionEditText().isFocused()) {
                                                                    aVar = m0Var.getRow();
                                                                } else {
                                                                    i53++;
                                                                }
                                                            } else {
                                                                if (childAt3 instanceof u0) {
                                                                    u0 u0Var = (u0) childAt3;
                                                                    if (u0Var.getEditText().isFocused()) {
                                                                        aVar = u0Var.getRow();
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
                                                        View A14 = A1(aVar);
                                                        boolean z18 = A14 instanceof f6;
                                                        if (z18) {
                                                            final f6 f6Var3 = (f6) A14;
                                                            i1 i1Var2 = f6Var3.f;
                                                            i1 i1Var3 = f6Var3.h;
                                                            if (f6Var3.n()) {
                                                                if (!z17 || i1Var3.isFocused()) {
                                                                    z12 = z17;
                                                                    if (!z12 && i1Var3.isFocused() && ((layout2 = f6Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(f6Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout9 = i1Var3.getLayout();
                                                                        final float primaryHorizontal2 = layout9 == null ? 0.0f : layout9.getPrimaryHorizontal(Math.max(0, Math.min(i1Var3.getSelectionEnd(), i1Var3.length())));
                                                                        i1Var2.r();
                                                                        final int i54 = 0;
                                                                        i1Var2.post(new Runnable() { // from class: ii.u5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                switch (i54) {
                                                                                    case 0:
                                                                                        i1 i1Var4 = f6Var3.f;
                                                                                        Layout layout10 = i1Var4.getLayout();
                                                                                        int length5 = i1Var4.length();
                                                                                        if (layout10 != null) {
                                                                                            length5 = layout10.getOffsetForHorizontal(Math.max(0, layout10.getLineCount() - 1), primaryHorizontal2);
                                                                                        }
                                                                                        i1Var4.setSelection(Math.max(0, Math.min(length5, i1Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        i1 i1Var5 = f6Var3.h;
                                                                                        Layout layout11 = i1Var5.getLayout();
                                                                                        int length6 = i1Var5.length();
                                                                                        if (layout11 != null) {
                                                                                            length6 = layout11.getOffsetForHorizontal(0, primaryHorizontal2);
                                                                                        }
                                                                                        i1Var5.setSelection(Math.max(0, Math.min(length6, i1Var5.length())));
                                                                                        break;
                                                                                }
                                                                            }
                                                                        });
                                                                        z13 = true;
                                                                    }
                                                                    if (z18) {
                                                                        S3 = S3(A14);
                                                                    } else {
                                                                        f6 f6Var4 = (f6) A14;
                                                                        S3 = (f6Var4.n() && f6Var4.h.isFocused()) ? f6Var4.getAuthorEditText() : f6Var4.getEditText();
                                                                    }
                                                                    if (S3 != null && (layout = S3.getLayout()) != null) {
                                                                        int lineForOffset6 = layout.getLineForOffset(S3.getSelectionEnd());
                                                                        if (z12) {
                                                                            if (lineForOffset6 <= 0) {
                                                                                a W1 = W1(aVar, -1);
                                                                                if (W1 != null) {
                                                                                    post(new p2(this, W1, 13));
                                                                                } else {
                                                                                    int U23 = U2(indexOf - 1, -1);
                                                                                    if (U23 >= 0) {
                                                                                        post(new p2(this, (a) arrayList.get(U23), 3));
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                            a W12 = W1(aVar, 1);
                                                                            if (W12 != null) {
                                                                                post(new p2(this, W12, 10));
                                                                                z13 = true;
                                                                                break;
                                                                            } else {
                                                                                int U24 = U2(indexOf + 1, 1);
                                                                                if (U24 < 0) {
                                                                                    a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                    arrayList.add(aVar5);
                                                                                    c71Var.N(false);
                                                                                    post(new p2(this, aVar5, 11));
                                                                                } else {
                                                                                    post(new p2(this, (a) arrayList.get(U24), 12));
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    Layout layout10 = f6Var3.getEditText().getLayout();
                                                                    if (layout10 != null) {
                                                                        z12 = z17;
                                                                        break;
                                                                    }
                                                                    Layout layout11 = i1Var2.getLayout();
                                                                    if (layout11 == null) {
                                                                        i12 = 0;
                                                                        primaryHorizontal = 0.0f;
                                                                    } else {
                                                                        i12 = 0;
                                                                        primaryHorizontal = layout11.getPrimaryHorizontal(Math.max(0, Math.min(i1Var2.getSelectionEnd(), i1Var2.length())));
                                                                    }
                                                                    if (i1Var3.getVisibility() != 0) {
                                                                        i1Var3.setVisibility(i12);
                                                                        f6Var3.requestLayout();
                                                                    }
                                                                    i1Var3.r();
                                                                    final int i55 = 1;
                                                                    i1Var3.post(new Runnable() { // from class: ii.u5
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i55) {
                                                                                case 0:
                                                                                    i1 i1Var4 = f6Var3.f;
                                                                                    Layout layout102 = i1Var4.getLayout();
                                                                                    int length5 = i1Var4.length();
                                                                                    if (layout102 != null) {
                                                                                        length5 = layout102.getOffsetForHorizontal(Math.max(0, layout102.getLineCount() - 1), primaryHorizontal);
                                                                                    }
                                                                                    i1Var4.setSelection(Math.max(0, Math.min(length5, i1Var4.length())));
                                                                                    break;
                                                                                default:
                                                                                    i1 i1Var5 = f6Var3.h;
                                                                                    Layout layout112 = i1Var5.getLayout();
                                                                                    int length6 = i1Var5.length();
                                                                                    if (layout112 != null) {
                                                                                        length6 = layout112.getOffsetForHorizontal(0, primaryHorizontal);
                                                                                    }
                                                                                    i1Var5.setSelection(Math.max(0, Math.min(length6, i1Var5.length())));
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
                                                        if (S3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(S3.getSelectionEnd());
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
                                            if (findFocus instanceof i1) {
                                                if ((V2 = V2((r3 = (i1) findFocus))) != null) {
                                                    if (findFocus != V2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode != 61 && x10) {
                                            int i56 = k3Var.p0;
                                            int i57 = k3Var.s0;
                                            if (i56 >= 0 && i57 >= i56) {
                                                if (i56 == i57) {
                                                    a z42 = z4(i56);
                                                    if (z42 != null) {
                                                        X3(z42, isShiftPressed);
                                                        break;
                                                    }
                                                } else {
                                                    int indexOf5 = arrayList.indexOf(z4(i56));
                                                    int indexOf6 = arrayList.indexOf(z4(i57));
                                                    if (indexOf5 >= 0 && indexOf6 >= indexOf5) {
                                                        n4(indexOf5, indexOf6, isShiftPressed);
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
                                        c71 c71Var2 = this.W2;
                                        if (q5Var == null) {
                                        }
                                    }
                                    if (!x10) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof i1) && (V2 = V2((r3 = (i1) findFocus))) != null) {
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

    public final int j2(int i10) {
        i1 J2 = J2(i10);
        if (J2 != null) {
            return J2.length();
        }
        f6 v22 = v2(i10);
        if (v22 != null) {
            return v22.getEditText().length();
        }
        a z42 = z4(i10);
        if (z42 == null) {
            return 0;
        }
        return f6.z(z42.b).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x0436  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j3(MotionEvent motionEvent) {
        boolean z10;
        a row;
        int i10;
        q5 q5Var;
        int action = motionEvent.getAction();
        k3 k3Var = this.l3;
        View view = null;
        if (action == 0) {
            this.t3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.u3 = y3;
            this.x3 = false;
            this.y3 = false;
            int i11 = (int) this.t3;
            int top = ((int) y3) - getTop();
            q5 q5Var2 = this.g4;
            if (q5Var2 == null) {
                q5Var2 = S2();
            }
            if (q5Var2 != null && q5Var2.getParent() == this) {
                int left = i11 - q5Var2.getLeft();
                int top2 = top - q5Var2.getTop();
                if (q5Var2.p(left, top2) >= 0 || q5Var2.n(left, top2) >= 0) {
                    view = q5Var2;
                    this.v3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z10 = k3Var.x() && eventTime - this.D3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.t3 - this.E3) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.u3 - this.F3) <= ((float) AndroidUtilities.dp(24.0f));
                    this.D3 = eventTime;
                    float f7 = this.t3;
                    this.E3 = f7;
                    float f10 = this.u3;
                    this.F3 = f10;
                    if (!z10 && U4(this.v3, f7, f10)) {
                        this.y3 = true;
                        this.D3 = 0L;
                        org.telegram.ui.Cells.g gVar = k3Var.m0;
                        if (!k3Var.x()) {
                            return true;
                        }
                        k3Var.i = false;
                        k3Var.R = false;
                        k3Var.k = false;
                        aa aaVar = k3Var.C;
                        if (aaVar != null) {
                            aaVar.invalidate();
                        }
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        return true;
                    }
                    if (this.v3 != null) {
                        Runnable runnable = this.w3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        b bVar = new b(this, 2);
                        this.w3 = bVar;
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
            this.v3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (k3Var.x()) {
            }
            this.D3 = eventTime2;
            float f72 = this.t3;
            this.E3 = f72;
            float f102 = this.u3;
            this.F3 = f102;
            if (!z10) {
            }
            if (this.v3 != null) {
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.w3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.w3 = null;
                }
                if (this.z3) {
                    Z4(motionEvent.getX(), motionEvent.getY());
                    q5 q5Var3 = this.g4;
                    if (this.z3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.z3 = false;
                    this.B3 = null;
                    this.C3 = null;
                    this.A3 = q5Var3 != null && q5Var3.getSelectedCells().size() > 1;
                    if (q5Var3 != null && !q5Var3.H.isEmpty()) {
                        G4(q5Var3);
                    }
                    this.v3 = null;
                    this.y3 = false;
                    return true;
                }
                if (!this.x3 && !this.y3) {
                    View view2 = this.v3;
                    if (view2 instanceof q5) {
                        if (k3((q5) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.v3 = null;
                            this.y3 = false;
                            return false;
                        }
                    }
                }
                if (!this.x3 && !this.y3 && (q5Var = this.g4) != null) {
                    View view3 = this.v3;
                    if (view3 == q5Var) {
                        q5 q5Var4 = (q5) view3;
                        TL_iv.pageTableCell m10 = q5Var4.m((int) ((motionEvent.getX() - q5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - q5Var4.getTop()) - getTop()));
                        if (m10 != null) {
                            if (this.i4 >= 0 || this.j4 >= 0) {
                                N2();
                            } else {
                                LinkedHashSet linkedHashSet = q5Var4.H;
                                if (!linkedHashSet.remove(m10)) {
                                    linkedHashSet.add(m10);
                                }
                                q5Var4.v.invalidate();
                                q5Var4.t();
                            }
                        }
                    } else if (view3 != null) {
                        N2();
                    }
                }
                boolean z11 = this.x3;
                c71 c71Var = this.W2;
                ArrayList arrayList = this.j3;
                if (!z11 && !this.y3 && this.v3 == null && !k3Var.x() && this.g4 == null) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x10 >= getLeft() && x10 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i13).getBottom() + getTop());
                        }
                        int B = org.telegram.messenger.q.B(60.0f, view4.getHeight(), Math.max(Math.max(this.O3, this.M3), this.N3));
                        if (y10 >= paddingTop && y10 <= B) {
                            a aVar = arrayList.isEmpty() ? null : (a) hg.c.g(1, arrayList);
                            if (aVar == null || !aVar.k.isEmpty() || F3(aVar.b) || aVar.i || y3(aVar) || L2(aVar.b)) {
                                i2 i2Var = this.H3;
                                if (i2Var != null) {
                                    i2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                c71Var.N(false);
                                i2 i2Var2 = this.H3;
                                if (i2Var2 != null) {
                                    i2Var2.h();
                                }
                                post(new p2(this, aVar2, 19));
                            } else {
                                f3(aVar);
                            }
                        }
                    }
                }
                if (!this.x3 && !this.y3 && this.v3 == null && !k3Var.x() && this.g4 == null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.P3 && x11 >= getLeft() && x11 <= getRight()) {
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
                                if (aVar3 == null || F3(aVar3.b) || aVar3.i || y3(aVar3) || L2(aVar3.b)) {
                                    i2 i2Var3 = this.H3;
                                    if (i2Var3 != null) {
                                        i2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    c71Var.N(false);
                                    i2 i2Var4 = this.H3;
                                    if (i2Var4 != null) {
                                        i2Var4.h();
                                    }
                                    post(new p2(this, aVar4, 16));
                                } else {
                                    g3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.x3 && !this.y3 && (this.v3 instanceof s4) && !k3Var.x() && this.g4 == null && (row = ((s4) this.v3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        r.X(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new ai.h3(22, this, pageblockmath), this.e3);
                    }
                }
                this.v3 = null;
                this.y3 = false;
                return false;
            }
            if (action == 2) {
                if (this.z3 && this.v3 == this.g4) {
                    Z4(motionEvent.getX(), motionEvent.getY());
                    this.x3 = true;
                    return true;
                }
                float x12 = motionEvent.getX() - this.t3;
                float y12 = motionEvent.getY() - this.u3;
                if ((y12 * y12) + (x12 * x12) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                    this.x3 = true;
                    Runnable runnable3 = this.w3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.w3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.w3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.w3 = null;
                }
                if (this.z3) {
                    N2();
                }
                this.v3 = null;
                this.y3 = false;
                return false;
            }
        }
        return false;
    }

    public final int j4(int i10) {
        Layout layout;
        View B4 = B4(i10);
        if (!(B4 instanceof f6) || (layout = ((f6) B4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage k2() {
        if (!l3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> a32 = a3();
        if (a32.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = a32;
        richMessage.photos = C2();
        richMessage.documents = z2();
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
    public final boolean k3(q5 q5Var, int i10, int i11) {
        j6 j6Var;
        j6 j6Var2;
        int p5 = q5Var.p(i10, i11);
        LinkedHashSet linkedHashSet = q5Var.H;
        s5 s5Var = q5Var.v;
        if (p5 >= 0) {
            int r10 = (s5Var.v() && p5 == s5Var.k()) ? s5Var.r() : p5;
            if (q5Var == this.g4 && (j6Var2 = q5Var.F) != null && p5 >= 0 && r10 >= p5 && r10 < j6Var2.b && !linkedHashSet.isEmpty()) {
                int i12 = p5;
                loop0: while (i12 <= r10) {
                    int i13 = 0;
                    while (true) {
                        j6 j6Var3 = q5Var.F;
                        if (i13 < j6Var3.c) {
                            if (!linkedHashSet.contains(j6Var3.d[i12][i13])) {
                                break loop0;
                            }
                            i13++;
                        }
                    }
                }
                G4(q5Var);
                return true;
            }
            h2(q5Var);
            j6 j6Var4 = q5Var.F;
            if (j6Var4 != null && p5 >= 0 && r10 >= p5 && r10 < j6Var4.b) {
                linkedHashSet.clear();
                for (int i14 = p5; i14 <= r10; i14++) {
                    int i15 = 0;
                    while (true) {
                        j6 j6Var5 = q5Var.F;
                        if (i15 < j6Var5.c) {
                            TL_iv.pageTableCell pagetablecell = j6Var5.d[i14][i15];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i15++;
                        }
                    }
                }
                s5Var.invalidate();
                q5Var.t();
            }
            this.i4 = p5;
            return true;
        }
        int n10 = q5Var.n(i10, i11);
        if (n10 < 0) {
            return false;
        }
        int q6 = (s5Var.u() && n10 == s5Var.j()) ? s5Var.q() : n10;
        if (q5Var == this.g4 && (j6Var = q5Var.F) != null && n10 >= 0 && q6 >= n10 && q6 < j6Var.c && !linkedHashSet.isEmpty()) {
            int i16 = n10;
            loop4: while (i16 <= q6) {
                int i17 = 0;
                while (true) {
                    j6 j6Var6 = q5Var.F;
                    if (i17 < j6Var6.b) {
                        if (!linkedHashSet.contains(j6Var6.d[i17][i16])) {
                            break loop4;
                        }
                        i17++;
                    }
                }
            }
            G4(q5Var);
            return true;
        }
        h2(q5Var);
        j6 j6Var7 = q5Var.F;
        if (j6Var7 != null && n10 >= 0 && q6 >= n10 && q6 < j6Var7.c) {
            linkedHashSet.clear();
            for (int i18 = n10; i18 <= q6; i18++) {
                int i19 = 0;
                while (true) {
                    j6 j6Var8 = q5Var.F;
                    if (i19 < j6Var8.b) {
                        TL_iv.pageTableCell pagetablecell2 = j6Var8.d[i19][i18];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i19++;
                    }
                }
            }
            s5Var.invalidate();
            q5Var.t();
        }
        this.j4 = n10;
        return true;
    }

    public final i1 k4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof f6) {
            return ((f6) B4).getAuthorEditText();
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
    public final TL_iv.PageBlock l2(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
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
            x3 x3Var = this;
            ArrayList arrayList2 = x3Var.j3;
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
            boolean F3 = F3(aVar2.b);
            if (F3) {
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
            if (F3) {
                K2(aVar2, arrayList3);
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
                        x3 x3Var2 = x3Var;
                        i15 = i20;
                        arrayList = arrayList4;
                        TL_iv.PageBlock l22 = x3Var2.l2(i15, i21, i16, i17, z11, iArr2);
                        if (l22 != null) {
                            arrayList.add(l22);
                        }
                        i20 = iArr2[0];
                        if (i20 <= i15) {
                            break;
                        }
                        x3Var = this;
                        i16 = i12;
                        i17 = i13;
                        richText = richText2;
                        aVar2 = aVar;
                        arrayList3 = arrayList;
                    } else {
                        if (!F3(aVar3.b)) {
                            break;
                        }
                        K2(aVar3, arrayList3);
                        i20++;
                        aVar2 = aVar;
                    }
                } else {
                    i15 = i20;
                    aVar = aVar2;
                    break;
                }
            }
            if (F3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!F3) {
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
                    tL_pageListOrderedItemBlocks.num = a1.g.n(i19, ".");
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
                tL_pageListOrderedItemText.num = a1.g.n(i19, ".");
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
    public final boolean l3() {
        int i10 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i10);
            if (!f6.z(aVar.b).isEmpty()) {
                break;
            }
            if (!E3(aVar.b)) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (u uVar : R3(aVar)) {
                if (uVar.b() || uVar.a()) {
                    break loop0;
                }
            }
            TL_iv.PageBlock pageBlock2 = aVar.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockMath) && !TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock2).source)) {
                break;
            }
            TL_iv.PageBlock pageBlock3 = aVar.b;
            if (pageBlock3 instanceof TL_iv.pageBlockMap) {
                int i11 = q4.M;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && P4((TL_iv.pageBlockTable) pageBlock3)) {
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

    public final boolean m2() {
        i1 editText;
        int length;
        int y3;
        int w10;
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x() || k3Var.p0 != k3Var.s0) {
            return false;
        }
        if (M3()) {
            int i10 = k3Var.p0;
            int i11 = k3Var.q0;
            if (i11 != k3Var.t0) {
                return false;
            }
            editText = O4(i10, i11);
        } else if (z3()) {
            editText = J2(k3Var.p0);
        } else if (x3()) {
            editText = t2(k3Var.p0);
        } else if (H3()) {
            editText = k4(k3Var.p0);
        } else {
            f6 H4 = H4();
            if (H4 == null) {
                return false;
            }
            editText = H4.getEditText();
        }
        if (editText == null || (y3 = hg.c.y(k3Var.r0, k3Var.u0, (length = editText.length()), 0)) >= (w10 = hg.c.w(k3Var.r0, k3Var.u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && y3 < w10) {
            for (m4 m4Var : (m4[]) text.getSpans(y3, w10, m4.class)) {
                if (text.getSpanStart(m4Var) < w10 && text.getSpanEnd(m4Var) > y3) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean n2() {
        int[] E4 = E4();
        if (E4 == null) {
            return o2(E2());
        }
        for (int i10 = E4[0]; i10 <= E4[1]; i10++) {
            if (o2((a) this.j3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean n3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            Iterator it = R3((a) arrayList.get(i10)).iterator();
            while (it.hasNext()) {
                if (((u) it.next()).a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean n4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.j3;
            if (i11 < arrayList.size()) {
                i2 i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (r3(i11, true, true)) {
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
                        if (r3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    t4();
                    if (findFocus() instanceof i1) {
                        Y1();
                    } else {
                        this.W2.N(false);
                    }
                    i2 i2Var2 = this.H3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean o2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.j3).indexOf(aVar)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        a aVar2 = (a) arrayList.get(indexOf);
        if (aVar2.c == 0) {
            TL_iv.PageBlock pageBlock = aVar2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !p2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).c < aVar2.c) {
            return false;
        }
        return q3(indexOf);
    }

    public final void o3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof f6) {
                f6 f6Var = (f6) childAt;
                f6Var.f.hideActionMode();
                f6Var.h.hideActionMode();
            } else if (childAt instanceof q5) {
                q5 q5Var = (q5) childAt;
                s5 s5Var = q5Var.v;
                q5Var.r.hideActionMode();
                for (int i11 = 0; i11 < s5Var.getChildCount(); i11++) {
                    View childAt2 = s5Var.getChildAt(i11);
                    if (childAt2 instanceof t5) {
                        ((t5) childAt2).a.hideActionMode();
                    }
                }
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void o4(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof w4) {
            w4 w4Var = (w4) A1;
            ArrayList arrayList = w4Var.y;
            if (w4Var.a == null) {
                return;
            }
            w4Var.n();
            if (w4Var.W >= arrayList.size()) {
                w4Var.W = Math.max(0, arrayList.size() - 1);
            }
            w4Var.o(false);
            w4Var.requestLayout();
            w4Var.invalidate();
        }
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.K3);
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.K3);
        this.Y2 = false;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = this.I3;
        boolean z11 = i15 > 0 && i14 < i15;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View findFocus = findFocus();
            View F = findFocus == null ? null : F(findFocus);
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new k2(this, dp, 2));
                }
            }
        }
        this.I3 = i14;
    }

    public final boolean p2(int i10) {
        if (i10 <= 0) {
            return false;
        }
        ArrayList arrayList = this.j3;
        return i10 < arrayList.size() && F3(((a) arrayList.get(i10)).b) && ((a) arrayList.get(i10 - 1)).c >= 1;
    }

    public final void p3(boolean z10) {
        k3 k3Var = this.l3;
        if (k3Var != null) {
            if (z10) {
                k3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(k3Var.m0);
                k3Var.u();
            }
        }
        if (z10) {
            W2();
        } else {
            o3();
        }
    }

    public final void p4() {
        post(new b(this, 3));
    }

    public final boolean q2() {
        int[] E4 = E4();
        if (E4 == null) {
            return r2(E2());
        }
        for (int i10 = E4[0]; i10 <= E4[1]; i10++) {
            if (r2((a) this.j3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean q3(int i10) {
        return ((a) this.j3.get(i10)).c + 1 <= MessagesController.getInstance(this.d3).config.richMessageMaxDepth.get() + (-6);
    }

    public final void q4(int i10) {
        ArrayList arrayList = this.j3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.c > 0) {
                View A1 = A1(aVar);
                if (A1 instanceof f6) {
                    ((f6) A1).F();
                }
            }
        }
    }

    public final boolean r2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        return aVar != null && (indexOf = (arrayList = this.j3).indexOf(aVar)) >= 0 && aVar.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((a) arrayList.get(indexOf)).c > 0;
    }

    public final boolean r3(int i10, boolean z10, boolean z11) {
        int i11 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.j3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar.c > 0) {
                        u2(i10);
                        return true;
                    }
                } else if (aVar.c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || D3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || p2(i10)) && q3(i10)) {
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
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).c >= aVar.c)) && q3(i10)) {
                    aVar.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void r4(a aVar, u uVar) {
        if (aVar == null) {
            return;
        }
        if (!C3(aVar.b)) {
            s4(aVar);
            return;
        }
        ArrayList h32 = h3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(uVar) : -1;
        if (indexOf >= 0) {
            aVar.h.remove(indexOf);
            if (h32 != null && indexOf < h32.size()) {
                h32.remove(indexOf);
            }
        }
        if (aVar.h.isEmpty()) {
            s4(aVar);
            return;
        }
        int size = aVar.h.size();
        c71 c71Var = this.W2;
        if (size != 1) {
            c71Var.N(true);
            o4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) h32.get(0);
        aVar.b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.g = (u) aVar.h.get(0);
        aVar.h = null;
        c71Var.N(true);
        o4(aVar);
    }

    public final boolean s2() {
        i2 i2Var = this.H3;
        if (i2Var != null) {
            return i2Var.e || !i2Var.b.isEmpty();
        }
        return false;
    }

    public final void s3(boolean z10) {
        int i10;
        int i11;
        int[] E4 = E4();
        if (E4 != null && (i10 = E4[0]) != (i11 = E4[1])) {
            n4(i10, i11, z10);
            return;
        }
        a E2 = E4 == null ? E2() : (a) this.j3.get(E4[0]);
        if (E2 != null) {
            X3(E2, z10);
        }
    }

    public final void s4(a aVar) {
        ArrayList arrayList = this.j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.W2.N(true);
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.h3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.P3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.g3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.L3 = new ArrayList();
        ArrayList arrayList = this.j3;
        X2(arrayList, e5.b(charSequence), this.k3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.L3.add((a) arrayList.get(size));
        }
        this.W2.N(false);
    }

    public final i1 t2(int i10) {
        KeyEvent.Callback B4 = B4(i10);
        if (B4 instanceof m0) {
            return ((m0) B4).getCaptionEditText();
        }
        return null;
    }

    public final void t3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
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
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.k3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.k.add((Long) arrayList3.get(i12));
                }
                int i13 = h5.a;
                p61 J = p61.J(h5.class);
                J.G = aVar2;
                J.H = this.d4;
                arrayList2.add(J);
                this.n4.add(aVar2);
            }
        }
    }

    public final void t4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.c > 0 && aVar.d > 0 && !F3(aVar.b)) {
                int i11 = aVar.c;
                int i12 = 1;
                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                    a aVar2 = (a) arrayList.get(i13);
                    int i14 = aVar2.c;
                    if (i14 < i11) {
                        break;
                    }
                    if (i14 == i11 && !F3(aVar2.b)) {
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

    public final void u2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.j3;
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
    public final void u3() {
        i2 i2Var;
        i2 i2Var2 = this.H3;
        if (i2Var2 != null) {
            i2Var2.d();
        }
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        pageblockdetails.open = true;
        pageblockdetails.title = new TL_iv.textEmpty();
        a aVar = new a(pageblockdetails, 0, 0);
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar3.i = true;
        a R2 = R2();
        ArrayList arrayList = this.j3;
        int indexOf = R2 != null ? arrayList.indexOf(R2) : -1;
        if (R2 != null) {
            TL_iv.PageBlock pageBlock = R2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && R2.g == null && !R2.i && f6.z(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, aVar3);
                arrayList.add(indexOf, aVar2);
                arrayList.add(indexOf, aVar);
                this.W2.N(false);
                i2Var = this.H3;
                if (i2Var != null) {
                    i2Var.h();
                }
                post(new p2(this, aVar, 20));
            }
        }
        indexOf = indexOf >= 0 ? indexOf + 1 : arrayList.size();
        arrayList.add(indexOf, aVar3);
        arrayList.add(indexOf, aVar2);
        arrayList.add(indexOf, aVar);
        this.W2.N(false);
        i2Var = this.H3;
        if (i2Var != null) {
        }
        post(new p2(this, aVar, 20));
    }

    public final void u4(String str) {
        k3 k3Var = this.l3;
        X1(k3Var.p0, k3Var.r0, k3Var.s0, k3Var.u0, str.split("\n", -1));
    }

    public final f6 v2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.V2.m(i10);
        if (m10 instanceof f6) {
            return (f6) m10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v3(a aVar) {
        boolean z10;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = aVar.k;
        a R2 = R2();
        if (R2 == null) {
            R2 = this.a4;
        }
        ArrayList arrayList2 = this.j3;
        int indexOf3 = R2 != null ? arrayList2.indexOf(R2) : -1;
        if (indexOf3 < 0 || !(R2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long a2 = q0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) R2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.k3.put(Long.valueOf(a2), richText);
            }
            R2.k.add(Long.valueOf(a2));
            R2.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        }
        boolean z11 = indexOf3 >= 0 && !R2.k.isEmpty();
        if (z11) {
            arrayList.clear();
            arrayList.addAll(R2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = R2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && R2.g == null && f6.z(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, aVar);
                this.a4 = aVar;
                indexOf = arrayList2.indexOf(aVar);
                if (indexOf < arrayList2.size() - 1 || F3(((a) arrayList2.get(indexOf + 1)).b)) {
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z11) {
                        aVar2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, aVar2);
                }
                this.W2.N(!z10);
                indexOf2 = arrayList2.indexOf(aVar) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || F3(((a) arrayList2.get(indexOf2)).b)) {
                    return;
                }
                post(new p2(this, (a) arrayList2.get(indexOf2), 17));
                return;
            }
        }
        if (indexOf3 >= 0) {
            arrayList2.add(indexOf3 + 1, aVar);
        } else {
            arrayList2.add(aVar);
        }
        this.a4 = aVar;
        indexOf = arrayList2.indexOf(aVar);
        if (indexOf < arrayList2.size() - 1) {
        }
        a aVar22 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z11) {
        }
        arrayList2.add(indexOf + 1, aVar22);
        this.W2.N(!z10);
        indexOf2 = arrayList2.indexOf(aVar) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final u v4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document T2 = T2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (T2 == null) {
                return null;
            }
            u uVar = new u();
            uVar.c = true;
            uVar.a = 2;
            uVar.h = T2;
            uVar.i = T2;
            return uVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document T22 = T2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (T22 == null) {
                return null;
            }
            u uVar2 = new u();
            uVar2.d = true;
            uVar2.a = 2;
            uVar2.h = T22;
            return uVar2;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document T23 = T2(pageblockvideo.video_id);
            if (T23 == null) {
                return null;
            }
            u uVar3 = new u();
            uVar3.b = true;
            uVar3.a = 2;
            uVar3.h = T23;
            uVar3.n = pageblockvideo.spoiler;
            while (i10 < T23.attributes.size()) {
                if (T23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) T23.attributes.get(i10);
                    uVar3.j = tL_documentAttributeVideo.w;
                    uVar3.k = tL_documentAttributeVideo.h;
                    return uVar3;
                }
                i10++;
            }
            return uVar3;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            return null;
        }
        TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
        long j3 = pageblockphoto.photo_id;
        if (j3 == 0) {
            photo = null;
        } else {
            int i11 = 0;
            loop1: while (true) {
                if (i11 < this.j3.size()) {
                    for (u uVar4 : R3((a) this.j3.get(i11))) {
                        if (uVar4 != null && (photo = uVar4.g) != null && photo.id == j3) {
                            break loop1;
                        }
                    }
                    i11++;
                } else {
                    TL_iv.RichMessage richMessage = this.i3;
                    if (richMessage != null && (arrayList = richMessage.photos) != null) {
                        int size = arrayList.size();
                        while (i10 < size) {
                            TLRPC.Photo photo2 = arrayList.get(i10);
                            i10++;
                            photo = photo2;
                            if (photo != null && photo.id == j3) {
                                break;
                            }
                        }
                    }
                    HashMap hashMap = x4.a;
                    synchronized (x4.class) {
                        photo = j3 == 0 ? null : (TLRPC.Photo) x4.a.get(Long.valueOf(j3));
                    }
                }
            }
        }
        if (photo == null) {
            return null;
        }
        u uVar5 = new u();
        uVar5.a = 2;
        uVar5.g = photo;
        uVar5.n = pageblockphoto.spoiler;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null) {
            uVar5.j = closestPhotoSizeWithSize.w;
            uVar5.k = closestPhotoSizeWithSize.h;
        }
        return uVar5;
    }

    public final void w2() {
        H2();
        this.i3 = null;
        this.Z3 = null;
        this.a4 = null;
        this.H3 = new i2(this.m4);
        A4();
        this.H3.j();
        v3 v3Var = this.f3;
        if (v3Var != null) {
            v3Var.H();
        }
    }

    public final void w4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.i3 == null || aVar == null || (pageBlock = aVar.b) == null) {
            return;
        }
        if (!C3(pageBlock)) {
            u v42 = v4(aVar.b);
            if (v42 != null) {
                aVar.g = v42;
                return;
            }
            return;
        }
        ArrayList h32 = h3(aVar.b);
        aVar.h = new ArrayList();
        if (h32 != null) {
            for (int i10 = 0; i10 < h32.size(); i10++) {
                u v43 = v4((TL_iv.PageBlock) h32.get(i10));
                ArrayList arrayList = aVar.h;
                if (v43 == null) {
                    v43 = new u();
                }
                arrayList.add(v43);
            }
        }
    }

    public final boolean x3() {
        int i10;
        k3 k3Var = this.l3;
        if (k3Var == null || !k3Var.x() || (i10 = k3Var.p0) != k3Var.s0 || i10 < 0 || i10 >= this.n4.size()) {
            return false;
        }
        return B4(i10) instanceof m0;
    }

    public final ArrayList x4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (C3(aVar.b)) {
                ArrayList h32 = h3(aVar.b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (h32 != null) {
                    int size2 = h32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = h32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        u v42 = v4(pageBlock);
                        if (v42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(v42);
                        }
                    }
                    h32.clear();
                    h32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.b;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    u v43 = v4(pageBlock2);
                    if (v43 != null) {
                        aVar.g = v43;
                        arrayList2.add(aVar);
                    }
                } else {
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }

    public final boolean y2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.i;
            ArrayList arrayList2 = aVar.k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.-EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new x2());
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
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.k3.remove(l4);
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

    public final void y4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof n4) {
                a0 a0Var = (a0) ((n4) childAt);
                a0Var.b.a(a0Var.a, new ei.c5(a0Var, 13));
            }
        }
        invalidate();
    }

    public final ArrayList z2() {
        TLRPC.Document document;
        u uVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i10);
            if ((aVar.b instanceof TL_iv.pageBlockDocument) && (uVar = aVar.g) != null && uVar.b() && (document2 = aVar.g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.b).document_id = document2.id;
            }
            for (u uVar2 : R3(aVar)) {
                if (uVar2.b() && (document = uVar2.h) != null) {
                    long j3 = document.id;
                    if (j3 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j3))) {
                        arrayList.add(uVar2.h);
                    }
                }
            }
            i10++;
        }
    }

    public final boolean z3() {
        int i10;
        k3 k3Var = this.l3;
        return k3Var != null && k3Var.x() && (i10 = k3Var.p0) == k3Var.s0 && y3(z4(i10));
    }

    public final a z4(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.n4;
        if (i10 < arrayList.size()) {
            return (a) arrayList.get(i10);
        }
        return null;
    }
}
