package ii;

import ai.e8;
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
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.v51;
import org.webrtc.MediaStreamTrack;
import v7.o8;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class x3 extends d61 {
    public static final ArrayList s4 = new ArrayList();
    public boolean A3;
    public boolean B3;
    public boolean C3;
    public TL_iv.pageTableCell D3;
    public TL_iv.pageTableCell E3;
    public long F3;
    public float G3;
    public float H3;
    public boolean I3;
    public i2 J3;
    public int K3;
    public i1 L3;
    public final i M3;
    public ArrayList N3;
    public int O3;
    public int P3;
    public int Q3;
    public boolean R3;
    public a S3;
    public boolean T3;
    public final p3 U3;
    public final t2 V3;
    public final q3 W3;
    public final r3 X3;
    public final s3 Y3;
    public final IdentityHashMap Z3;
    public final IdentityHashMap a4;
    public a b4;
    public a c4;
    public final t3 d4;
    public final b3 e4;
    public final int f3;
    public final c3 f4;
    public final org.telegram.ui.ActionBar.d6 g3;
    public final d3 g4;
    public final v3 h3;
    public final e3 h4;
    public MessageObject i3;
    public p5 i4;
    public boolean j3;
    public o70 j4;
    public TL_iv.RichMessage k3;
    public int k4;
    public final ArrayList l3;
    public int l4;
    public final HashMap m3;
    public final u2 m4;
    public final k3 n3;
    public final f3 n4;
    public final da o3;
    public final a4.m o4;
    public int p3;
    public final ArrayList p4;
    public int q3;
    public tl0 q4;
    public int r3;
    public int r4;
    public boolean s3;
    public float t3;
    public float u3;
    public float v3;
    public float w3;
    public View x3;
    public b y3;
    public boolean z3;

    public x3(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, v3 v3Var) {
        super(context, i10, 0, false, new hi.a(r1, 4), new ei.d5(r1, 16), null, d6Var);
        this.j3 = true;
        this.l3 = new ArrayList();
        this.m3 = new HashMap();
        this.p3 = -1;
        this.q3 = -1;
        this.r3 = 0;
        this.M3 = new i(this, 2);
        this.R3 = true;
        this.U3 = new p3(this);
        this.V3 = new t2(this);
        this.W3 = new q3(this);
        this.X3 = new r3(this);
        this.Y3 = new s3(this);
        this.Z3 = new IdentityHashMap();
        this.a4 = new IdentityHashMap();
        this.d4 = new t3(this);
        this.e4 = new b3(this);
        this.f4 = new c3(this);
        this.g4 = new d3(this);
        this.h4 = new e3(this);
        this.k4 = -1;
        this.l4 = -1;
        this.m4 = new u2(this);
        this.n4 = new f3(this);
        a4.m mVar = new a4.m(this, 21);
        this.o4 = mVar;
        this.p4 = new ArrayList();
        this.r4 = -1;
        x3[] x3VarArr = {this};
        this.f3 = i10;
        this.g3 = d6Var;
        this.h3 = v3Var;
        this.Y2.r = false;
        setClipToPadding(false);
        setClipChildren(false);
        B1(new hi.a(this, 5), false);
        setReorderLongPressEnabled(false);
        w1(true);
        k3 k3Var = new k3(this, v3Var);
        this.n3 = k3Var;
        k3Var.T(this);
        k3Var.E0 = this.X2;
        da o9 = k3Var.o(context);
        this.o3 = o9;
        AndroidUtilities.removeFromParent(o9);
        k3Var.D = new m3(this, v3Var);
        j(new n3(0, this, v3Var));
        this.J3 = new i2(mVar);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        return (E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails)) ? false : true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || B3(pageBlock);
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockDivider) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockButtonRow) || (pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList);
    }

    public static boolean F3(a aVar) {
        return aVar != null && !aVar.i && !x3(aVar) && (aVar.b instanceof TL_iv.pageBlockParagraph) && aVar.c == 0 && aVar.d == 0 && !aVar.e && aVar.k.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0128, code lost:
    
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0154, code lost:
    
        r22.L();
        r12 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I1(x3[] x3VarArr, ArrayList arrayList, v51 v51Var) {
        int i10;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        int i11;
        x3 x3Var = x3VarArr[0];
        if (x3Var != null) {
            ArrayList arrayList3 = x3Var.l3;
            x3Var.a2();
            ArrayList arrayList4 = x3Var.p4;
            arrayList4.clear();
            HashMap hashMap = new HashMap();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                i10 = 1;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(i12);
                boolean z12 = aVar.i;
                ArrayList arrayList5 = aVar.k;
                if (!z12) {
                    for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                        Map.-EL.merge(hashMap, (Long) arrayList5.get(i14), 1, new x2());
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
            boolean z14 = false;
            a aVar2 = null;
            int i17 = -1;
            while (i16 < arrayList3.size()) {
                a aVar3 = (a) arrayList3.get(i16);
                boolean z15 = aVar3.i;
                ArrayList arrayList7 = aVar3.k;
                if (z15) {
                    boolean z16 = i17 != i15;
                    if (!arrayList6.isEmpty()) {
                        a4.a.y(i10, arrayList6);
                    }
                    if (i17 == i15 || arrayList6.size() >= i17) {
                        if (!z16) {
                            if (z14) {
                                v51Var.L();
                                z14 = false;
                            }
                            int i18 = v0.a;
                            h51 J = h51.J(v0.class);
                            J.G = aVar3;
                            arrayList.add(J);
                            arrayList4.add(aVar3);
                        }
                        z10 = z13;
                        arrayList2 = arrayList6;
                    } else {
                        z10 = z13;
                        arrayList2 = arrayList6;
                        i17 = -1;
                    }
                } else {
                    boolean z17 = i17 != i15;
                    if (x3(aVar3)) {
                        if (!z17) {
                            boolean z18 = ((TL_iv.pageBlockDetails) aVar3.b).open;
                            if (!arrayList6.isEmpty() || z18) {
                                if (z14) {
                                    v51Var.L();
                                    z14 = false;
                                }
                            } else if (!z14) {
                                v51Var.M();
                                z14 = true;
                            }
                            e3 e3Var = x3Var.h4;
                            int i19 = t0.a;
                            h51 J2 = h51.J(t0.class);
                            J2.G = aVar3;
                            J2.H = e3Var;
                            arrayList.add(J2);
                            arrayList4.add(aVar3);
                            if (!z18) {
                                i17 = arrayList6.size() + 1;
                            }
                        }
                        arrayList6.add(aVar3);
                    } else if (!z17) {
                        if (aVar2 != null) {
                            ArrayList arrayList8 = aVar2.k;
                            int size = arrayList8.size();
                            int i20 = 0;
                            while (true) {
                                z10 = z13;
                                if (i20 >= size || i20 >= arrayList7.size()) {
                                    break;
                                }
                                arrayList2 = arrayList6;
                                if (!((Long) arrayList8.get(i20)).equals(arrayList7.get(i20))) {
                                    break;
                                }
                                i20++;
                                z13 = z10;
                                arrayList6 = arrayList2;
                            }
                            int i21 = size - 1;
                            while (i21 >= i20) {
                                Long l4 = (Long) arrayList8.get(i21);
                                l4.getClass();
                                Integer num = (Integer) hashMap.get(l4);
                                if (num != null) {
                                    i11 = i20;
                                    if (num.intValue() >= 2 || i21 > 0 || x3Var.m3.containsKey(l4)) {
                                    }
                                } else {
                                    i11 = i20;
                                }
                                i21--;
                                i20 = i11;
                            }
                        } else {
                            z10 = z13;
                            arrayList2 = arrayList6;
                        }
                        if (aVar2 != null) {
                            x3Var.s3(aVar2, arrayList7, hashMap, arrayList);
                        }
                        if (arrayList2.isEmpty()) {
                            if (!z14) {
                                v51Var.M();
                                z14 = true;
                            }
                        } else if (z14) {
                            v51Var.L();
                            z14 = false;
                        }
                        TL_iv.PageBlock pageBlock = aVar3.b;
                        if (pageBlock instanceof TL_iv.pageBlockDivider) {
                            t2 t2Var = x3Var.V3;
                            int i22 = x0.a;
                            h51 J3 = h51.J(x0.class);
                            J3.G = aVar3;
                            J3.H = t2Var;
                            arrayList.add(J3);
                        } else if (D3(pageBlock)) {
                            q3 q3Var = x3Var.W3;
                            int i23 = u4.a;
                            h51 J4 = h51.J(u4.class);
                            J4.d = (int) aVar3.a;
                            J4.G = aVar3;
                            J4.H = q3Var;
                            arrayList.add(J4);
                        } else {
                            TL_iv.PageBlock pageBlock2 = aVar3.b;
                            if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                r3 r3Var = x3Var.X3;
                                int i24 = y.a;
                                h51 J5 = h51.J(y.class);
                                J5.G = aVar3;
                                J5.H = r3Var;
                                arrayList.add(J5);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                s3 s3Var = x3Var.Y3;
                                int i25 = z0.a;
                                h51 J6 = h51.J(z0.class);
                                J6.G = aVar3;
                                J6.H = s3Var;
                                arrayList.add(J6);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                t3 t3Var = x3Var.d4;
                                int i26 = o4.a;
                                h51 J7 = h51.J(o4.class);
                                J7.G = aVar3;
                                J7.H = t3Var;
                                arrayList.add(J7);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                b3 b3Var = x3Var.e4;
                                int i27 = q4.a;
                                h51 J8 = h51.J(q4.class);
                                J8.G = aVar3;
                                J8.H = b3Var;
                                arrayList.add(J8);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                d3 d3Var = x3Var.g4;
                                int i28 = n5.a;
                                h51 J9 = h51.J(n5.class);
                                J9.G = aVar3;
                                J9.H = d3Var;
                                arrayList.add(J9);
                            } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                p3 p3Var = x3Var.U3;
                                int i29 = g0.a;
                                h51 J10 = h51.J(g0.class);
                                J10.G = aVar3;
                                J10.H = p3Var;
                                arrayList.add(J10);
                            } else {
                                aVar3.p = i16 == 0;
                                aVar3.q = z10 && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                if (arrayList3.size() == 2 && i16 == 1 && (aVar3.b instanceof TL_iv.pageBlockParagraph) && (((a) arrayList3.get(0)).b instanceof TL_iv.pageBlockHeading1)) {
                                    z11 = true;
                                    f3 f3Var = x3Var.n4;
                                    int i30 = c6.a;
                                    h51 J11 = h51.J(c6.class);
                                    J11.G = aVar3;
                                    J11.H = f3Var;
                                    J11.r = z11;
                                    arrayList.add(J11);
                                    arrayList4.add(aVar3);
                                    aVar2 = aVar3;
                                }
                                z11 = false;
                                f3 f3Var2 = x3Var.n4;
                                int i302 = c6.a;
                                h51 J112 = h51.J(c6.class);
                                J112.G = aVar3;
                                J112.H = f3Var2;
                                J112.r = z11;
                                arrayList.add(J112);
                                arrayList4.add(aVar3);
                                aVar2 = aVar3;
                            }
                        }
                        arrayList4.add(aVar3);
                        aVar2 = aVar3;
                    }
                    z10 = z13;
                    arrayList2 = arrayList6;
                }
                i16++;
                z13 = z10;
                arrayList6 = arrayList2;
                i10 = 1;
                i15 = -1;
            }
            if (z14) {
                v51Var.L();
            }
            if (aVar2 != null) {
                x3Var.s3(aVar2, s4, hashMap, arrayList);
            }
            int i31 = 0;
            while (i31 < arrayList4.size()) {
                a aVar4 = (a) arrayList4.get(i31);
                aVar4.n = false;
                aVar4.o = false;
                aVar4.l = 0;
                aVar4.m = 0;
                int size2 = aVar4.k.size();
                if (size2 != 0) {
                    a aVar5 = i31 > 0 ? (a) arrayList4.get(i31 - 1) : null;
                    int i32 = i31 + 1;
                    a aVar6 = i32 < arrayList4.size() ? (a) arrayList4.get(i32) : null;
                    aVar4.l = size2 - l4(aVar4, aVar5);
                    int l42 = size2 - l4(aVar4, aVar6);
                    aVar4.m = l42;
                    aVar4.n = aVar4.l > 0;
                    aVar4.o = l42 > 0;
                }
                i31++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J2(a aVar, ArrayList arrayList) {
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
        if (B3(pageBlock)) {
            ArrayList g32 = g3(aVar.b);
            List Q3 = Q3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i10 = 0; g32 != null && i10 < g32.size() && i10 < Q3.size(); i10++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) g32.get(i10);
                if (((u) Q3.get(i10)).b()) {
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
            int i11 = p4.M;
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
                            i6.c(pagetablecell, "");
                        } else {
                            pagetablecell.flags |= 128;
                        }
                        pagetablecell.flags = pagetablecell.colspan > 1 ? pagetablecell.flags | 2 : pagetablecell.flags & (-3);
                        pagetablecell.flags = pagetablecell.rowspan > 1 ? pagetablecell.flags | 4 : pagetablecell.flags & (-5);
                    }
                }
            }
        }
        if (O4(pageblocktable)) {
            arrayList.add(pageblocktable);
        }
    }

    public static void K1(x3 x3Var, int i10, int i11, int i12) {
        if (i10 < 0) {
            return;
        }
        KeyEvent.Callback m10 = x3Var.X2.m(i10);
        if (m10 instanceof e6) {
            e6 e6Var = (e6) m10;
            i1 authorEditText = (i11 == 1 && e6Var.n()) ? e6Var.getAuthorEditText() : e6Var.getEditText();
            authorEditText.s();
            authorEditText.setSelection(Math.max(0, Math.min(i12, authorEditText.length())));
            return;
        }
        if (!(m10 instanceof p5)) {
            if (m10 instanceof m0) {
                i1 captionEditText = ((m0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
                return;
            }
            return;
        }
        p5 p5Var = (p5) m10;
        i1 l4 = p5Var.l(i11);
        if (l4 == null) {
            l4 = p5Var.l(0);
        }
        if (l4 == null) {
            return;
        }
        l4.s();
        l4.setSelection(Math.max(0, Math.min(i12, l4.length())));
    }

    public static boolean K2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.PageBlock L1(x3 x3Var, a aVar, int i10, int i11) {
        TL_iv.PageBlock TLdeserialize;
        x3Var.getClass();
        if (!A3(aVar.b)) {
            return null;
        }
        Editable M4 = x3Var.M4(aVar);
        int length = M4.length();
        int max = Math.max(0, Math.min(i10, length));
        if (i11 >= 0) {
            length = Math.max(0, Math.min(i11, length));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(Math.min(max, length), Math.max(max, length)));
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock != null) {
            try {
                L2(pageBlock);
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
        e6.d(TLdeserialize, spannableStringBuilder);
        return TLdeserialize;
    }

    public static void L2(TL_iv.PageBlock pageBlock) {
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

    public static void M1(x3 x3Var, i1 i1Var) {
        if (i1Var == null) {
            x3Var.getClass();
            return;
        }
        i1Var.adaptiveCreateLinkDialog = x3Var.j3;
        i1Var.setInlineButtonContext(x3Var.f3);
        i1Var.setInlineButtonClickListener(new u2(x3Var));
    }

    public static void N1(a aVar, u uVar, x3 x3Var) {
        v3 v3Var = x3Var.h3;
        IdentityHashMap identityHashMap = x3Var.a4;
        IdentityHashMap identityHashMap2 = x3Var.Z3;
        if (uVar != null) {
            b5 b5Var = (b5) identityHashMap2.remove(uVar);
            if (b5Var != null) {
                b5Var.b();
            }
            x4 x4Var = (x4) identityHashMap.remove(uVar);
            if (x4Var != null) {
                x4Var.a();
            }
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            x3Var.q4(aVar, uVar);
            i2 i2Var2 = x3Var.J3;
            if (i2Var2 != null) {
                i2Var2.h();
            }
            v3Var.onContentChanged();
            return;
        }
        ArrayList arrayList = x3Var.l3;
        for (u uVar2 : Q3(aVar)) {
            b5 b5Var2 = (b5) identityHashMap2.remove(uVar2);
            if (b5Var2 != null) {
                b5Var2.b();
            }
            x4 x4Var2 = (x4) identityHashMap.remove(uVar2);
            if (x4Var2 != null) {
                x4Var2.a();
            }
        }
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            i2 i2Var3 = x3Var.J3;
            if (i2Var3 != null) {
                i2Var3.d();
            }
            arrayList.remove(indexOf);
            x3Var.Y2.N(true);
            i2 i2Var4 = x3Var.J3;
            if (i2Var4 != null) {
                i2Var4.h();
            }
        }
        v3Var.onContentChanged();
    }

    public static void N2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if ((pageBlock instanceof TL_iv.pageBlockList) || (pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        S1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    O2(arrayList, pageBlock, i10 + 1);
                } else if (z13) {
                    arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                } else {
                    if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                        S1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
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
        S1(arrayList, null, i10, i11, z11, z12);
    }

    public static TL_iv.PageBlock N3(a aVar, u uVar) {
        if (!B3(aVar.b)) {
            return aVar.b;
        }
        ArrayList g32 = g3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(uVar) : -1;
        if (indexOf < 0 || g32 == null || indexOf >= g32.size()) {
            return null;
        }
        return (TL_iv.PageBlock) g32.get(indexOf);
    }

    public static void O1(x3 x3Var) {
        if (x3Var.I3) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.h();
        }
        x3Var.h3.l();
        x3Var.o4();
    }

    public static void O2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (!(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            ArrayList<TL_iv.PageListItem> arrayList2 = ((TL_iv.pageBlockList) pageBlock).items;
            int size = arrayList2.size();
            while (i11 < size) {
                TL_iv.PageListItem pageListItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListItem pageListItem2 = pageListItem;
                if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                    S1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
                } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                    N2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
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
                S1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
            } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                int i13 = i12;
                N2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                i12 = i13;
            }
            i12++;
        }
    }

    public static boolean O4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(g6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!i6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void P1(x3 x3Var, a aVar) {
        ArrayList arrayList = x3Var.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.k.addAll(aVar.k);
        arrayList.add(indexOf + 1, aVar2);
        x3Var.s4();
        x3Var.Y2.N(false);
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 23));
    }

    public static FrameLayout P4(p5 p5Var, boolean z10) {
        s5 m10;
        i6 model = p5Var.getModel();
        if (model != null) {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i11 = z10 ? -1 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : p5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o9 = z10 ? (i6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o9 < i11 || (o9 == i11 && a2 < i10) : o9 > i11 || (o9 == i11 && a2 < i10)) {
                    pagetablecell = pagetablecell2;
                    i10 = a2;
                    i11 = o9;
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
    public static boolean Q1(x3 x3Var, a aVar, boolean z10) {
        int i10;
        i1 editText;
        Editable text;
        i2 i2Var;
        i2 i2Var2;
        int i11;
        ArrayList arrayList = x3Var.p4;
        v51 v51Var = x3Var.Y2;
        ArrayList arrayList2 = x3Var.l3;
        int indexOf = arrayList2.indexOf(aVar);
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock = aVar.b;
            ArrayList arrayList3 = aVar.k;
            if (C3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote)) {
                x3Var.U4(aVar, new TL_iv.pageBlockParagraph(), 0, 0, false, false);
                return true;
            }
            if (aVar.c > 0) {
                i2 i2Var3 = x3Var.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                View z12 = x3Var.z1(aVar);
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    if (e6Var.getEditText().isFocused()) {
                        i11 = e6Var.getEditText().getSelectionEnd();
                        x3Var.t2(indexOf);
                        x3Var.s4();
                        if (x3Var.findFocus() instanceof i1) {
                            v51Var.N(false);
                            i2 i2Var4 = x3Var.J3;
                            if (i2Var4 != null) {
                                i2Var4.h();
                            }
                            x3Var.post(new a3(x3Var, aVar, 1));
                            return true;
                        }
                        x3Var.X1();
                        i2 i2Var5 = x3Var.J3;
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
                x3Var.t2(indexOf);
                x3Var.s4();
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
                        i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                        }
                        arrayList3.remove(arrayList3.size() - 1);
                        x3Var.x2();
                        x3Var.s4();
                        v51Var.N(false);
                        i2Var2 = x3Var.J3;
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
                    i2Var = x3Var.J3;
                    if (i2Var != null) {
                    }
                    arrayList3.remove(arrayList3.size() - 1);
                    x3Var.x2();
                    x3Var.s4();
                    v51Var.N(false);
                    i2Var2 = x3Var.J3;
                    if (i2Var2 != null) {
                    }
                    x3Var.post(new a3(x3Var, aVar, 2));
                    return true;
                }
                if (indexOf > 0) {
                    int i13 = indexOf - 1;
                    a aVar4 = (a) arrayList2.get(i13);
                    if (x3(aVar4) || aVar4.i) {
                        if (z10 && (!x3(aVar4) || ((i10 = indexOf + 1) < arrayList2.size() && !((a) arrayList2.get(i10)).i))) {
                            i2 i2Var6 = x3Var.J3;
                            if (i2Var6 != null) {
                                i2Var6.d();
                            }
                            arrayList2.remove(indexOf);
                            x3Var.s4();
                            v51Var.N(false);
                            i2 i2Var7 = x3Var.J3;
                            if (i2Var7 != null) {
                                i2Var7.h();
                            }
                            x3Var.post(new a3(x3Var, aVar4, 3));
                        }
                    } else {
                        if (E3(aVar4.b)) {
                            i2 i2Var8 = x3Var.J3;
                            if (i2Var8 != null) {
                                i2Var8.d();
                            }
                            arrayList2.remove(i13);
                            x3Var.s4();
                            v51Var.N(false);
                            i2 i2Var9 = x3Var.J3;
                            if (i2Var9 != null) {
                                i2Var9.h();
                            }
                            x3Var.post(new a3(x3Var, aVar, 4));
                            return true;
                        }
                        i2 i2Var10 = x3Var.J3;
                        if (i2Var10 != null) {
                            i2Var10.d();
                        }
                        View z13 = x3Var.z1(aVar4);
                        int indexOf2 = arrayList.indexOf(aVar);
                        if (!(z13 instanceof e6) || indexOf2 < 0) {
                            SpannableStringBuilder A = e6.A(aVar4.b);
                            int length = A.length();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A);
                            spannableStringBuilder.append((CharSequence) e6.A(aVar.b));
                            e6.d(aVar4.b, spannableStringBuilder);
                            arrayList2.remove(indexOf);
                            x3Var.x2();
                            x3Var.s4();
                            v51Var.N(false);
                            i2 i2Var11 = x3Var.J3;
                            if (i2Var11 != null) {
                                i2Var11.h();
                            }
                            x3Var.post(new r2(x3Var, aVar4, length, 5));
                            return true;
                        }
                        e6 e6Var2 = (e6) z13;
                        i1 editText2 = e6Var2.getEditText();
                        int length2 = editText2.length();
                        SpannableStringBuilder A2 = e6.A(aVar.b);
                        Editable text2 = editText2.getText();
                        if (text2 != null && A2 != null && A2.length() != 0) {
                            editText2.h = true;
                            text2.append((CharSequence) A2);
                            editText2.h = false;
                        }
                        e6.d(aVar4.b, editText2.getText());
                        View z14 = x3Var.z1(aVar);
                        if ((z14 instanceof e6) && (text = (editText = ((e6) z14).getEditText()).getText()) != null && text.length() > 0) {
                            editText.h = true;
                            text.delete(0, text.length());
                            editText.h = false;
                        }
                        e6Var2.B();
                        editText2.setSelection(Math.max(0, Math.min(length2, editText2.length())));
                        arrayList2.remove(indexOf);
                        boolean x22 = x3Var.x2();
                        x3Var.s4();
                        if (x22) {
                            v51Var.N(false);
                            i2 i2Var12 = x3Var.J3;
                            if (i2Var12 != null) {
                                i2Var12.h();
                            }
                            x3Var.post(new r2(x3Var, aVar4, Math.max(0, length2), 4));
                            return true;
                        }
                        v51Var.S();
                        x3Var.p4(indexOf);
                        s4.m0 itemAnimator = x3Var.getItemAnimator();
                        x3Var.setItemAnimator(null);
                        v51Var.u(indexOf2);
                        if ((aVar4.d > 0 || aVar.d > 0) && indexOf2 < arrayList.size()) {
                            v51Var.q(indexOf2, arrayList.size() - indexOf2);
                        }
                        x3Var.post(new z2(x3Var, itemAnimator, 1));
                        i2 i2Var13 = x3Var.J3;
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

    public static List Q3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (B3(aVar.b)) {
            ArrayList arrayList = aVar.h;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        u uVar = aVar.g;
        return uVar != null ? Collections.singletonList(uVar) : Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i1 R3(View view) {
        if (view instanceof e6) {
            return ((e6) view).getEditText();
        }
        if (view instanceof m0) {
            return ((m0) view).getCaptionEditText();
        }
        if (view instanceof u0) {
            return ((u0) view).getEditText();
        }
        return null;
    }

    public static void S1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
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

    public static TL_iv.PageBlock S3(TL_iv.PageBlock pageBlock) {
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

    public static u T3(MediaController.PhotoEntry photoEntry, String str) {
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

    public static p5 U2(i1 i1Var) {
        for (ViewParent parent = i1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof p5) {
                return (p5) parent;
            }
        }
        return null;
    }

    public static void W2(ArrayList arrayList, ArrayList arrayList2, java.util.Map map) {
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
                O2(arrayList, pageBlock, 1);
            } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                arrayList.add(new a(pageblockdetails, 0, 0));
                int size2 = arrayList.size();
                W2(arrayList, pageblockdetails.blocks, map);
                if (arrayList.size() == size2) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar.i = true;
                arrayList.add(aVar);
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                long a2 = q0.a();
                W2(arrayList, pageblockblockquoteblocks.blocks, map);
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

    public static ArrayList X2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        W2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void Z1(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] a5(p5 p5Var) {
        i6 i6Var = p5Var.F;
        for (int size = i6Var != null ? i6Var.g.size() : 0; size >= 0; size--) {
            i1 l4 = p5Var.l(size);
            int length = l4 != null ? l4.length() : 0;
            if (length > 0) {
                return new int[]{size, length};
            }
        }
        return null;
    }

    public static ArrayList g3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean h4(i1 i1Var, float f7, float f10) {
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

    public static int k4(int i10, a aVar, boolean z10) {
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        return org.telegram.messenger.z0.D(16.0f, Math.max(0, i10 - (aVar.k.size() - (z10 ? aVar.l : aVar.m))), AndroidUtilities.dp(2.0f));
    }

    public static boolean l3(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || D3(pageBlock);
    }

    public static int l4(a aVar, a aVar2) {
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
            if (childAt instanceof e6) {
                ((e6) childAt).setLocked(z10);
            } else if (childAt instanceof p5) {
                ((p5) childAt).setLocked(z10);
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof u0) {
                ((u0) childAt).setLocked(z10);
            } else if (childAt instanceof y0) {
                childAt.invalidate();
            }
        }
    }

    public static boolean v3(int i10) {
        return i10 == 21 || i10 == 22 || i10 == 19 || i10 == 20;
    }

    public static int w2(int i10) {
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

    public static boolean x3(a aVar) {
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockDetails);
    }

    public static boolean z3(TL_iv.PageBlock pageBlock) {
        return ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || E3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !e6.z(pageBlock).isEmpty()) ? false : true;
    }

    @Override // org.telegram.ui.Components.d61
    public final boolean A1() {
        return this.T3;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.l3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : Q3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(uVar.g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View A4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.X2.m(i10);
    }

    public final ArrayList B2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.l3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            for (u uVar : Q3((a) arrayList2.get(i10))) {
                if (uVar.b() && (photo = uVar.g) != null && hashSet.add(Long.valueOf(photo.id))) {
                    arrayList.add(uVar.g);
                }
            }
            i10++;
        }
    }

    public final int[] B4() {
        ArrayList arrayList = this.l3;
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y()) {
            a Q2 = Q2();
            int indexOf = Q2 != null ? arrayList.indexOf(Q2) : -1;
            if (indexOf >= 0) {
                return new int[]{indexOf, indexOf};
            }
            return null;
        }
        int indexOf2 = arrayList.indexOf(y4(k3Var.u0));
        int indexOf3 = arrayList.indexOf(y4(k3Var.x0));
        if (indexOf2 < 0 || indexOf3 < 0) {
            return null;
        }
        return new int[]{Math.min(indexOf2, indexOf3), Math.max(indexOf2, indexOf3)};
    }

    @Override // org.telegram.ui.Components.d61
    public final void C1() {
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.s();
        }
    }

    public final void C2() {
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.h();
        }
        ArrayList arrayList = this.l3;
        SpannableStringBuilder k10 = d5.k(arrayList);
        G2();
        arrayList.clear();
        HashMap hashMap = this.m3;
        hashMap.clear();
        this.k3 = null;
        W2(arrayList, d5.b(k10), hashMap);
        this.Y2.N(false);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.onContentChanged();
            v3Var.F();
        }
    }

    public final boolean C4() {
        k3 k3Var = this.n3;
        if (k3Var != null && k3Var.y()) {
            if (L3()) {
                int i10 = k3Var.u0;
                int i11 = k3Var.v0;
                int i12 = k3Var.y0;
                int i13 = k3Var.w0;
                int i14 = k3Var.z0;
                int i15 = i11;
                while (i15 <= i12) {
                    i1 N4 = N4(i10, i15);
                    if (N4 != null) {
                        int length = N4.length();
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
            } else if (y3()) {
                i1 I2 = I2(k3Var.u0);
                if (I2 != null && Math.max(0, Math.min(Math.min(k3Var.w0, k3Var.z0), I2.length())) < Math.max(0, Math.min(Math.max(k3Var.w0, k3Var.z0), I2.length()))) {
                    return true;
                }
            } else if (w3()) {
                i1 s22 = s2(k3Var.u0);
                if (s22 != null) {
                    int i18 = k3Var.w0;
                    int i19 = k3Var.z0;
                    if (Math.max(0, Math.min(Math.min(i18, i19), s22.length())) < Math.max(0, Math.min(Math.max(i18, i19), s22.length()))) {
                        return true;
                    }
                }
            } else if (G3()) {
                i1 j42 = j4(k3Var.u0);
                if (j42 != null) {
                    int i20 = k3Var.w0;
                    int i21 = k3Var.z0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), j42.length())) < Math.max(0, Math.min(Math.max(i20, i21), j42.length()))) {
                        return true;
                    }
                }
            } else {
                int i22 = k3Var.u0;
                int i23 = k3Var.x0;
                int i24 = k3Var.w0;
                int i25 = k3Var.z0;
                if (i22 >= 0 && i23 >= 0 && i23 >= i22 && i23 < this.p4.size()) {
                    int i26 = i22;
                    while (i26 <= i23) {
                        a y42 = y4(i26);
                        if (y42 != null) {
                            if (y42.t == 0) {
                                TL_iv.PageBlock pageBlock = y42.b;
                                if (!A3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int i27 = i2(i26);
                            if (Math.max(0, Math.min(i26 == i22 ? i24 : 0, i27)) < Math.max(0, Math.min(i26 == i23 ? i25 : i27, i27))) {
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

    @Override // org.telegram.ui.Components.d61
    public final void D1() {
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.z();
        }
        x4();
    }

    public final a D2() {
        int i10;
        a y42;
        a Q2 = Q2();
        if (Q2 != null) {
            return Q2;
        }
        k3 k3Var = this.n3;
        if (k3Var == null || (i10 = k3Var.u0) < 0 || (y42 = y4(i10)) == null) {
            return null;
        }
        return y42;
    }

    public final int[] D4() {
        k3 k3Var = this.n3;
        if (k3Var == null) {
            return null;
        }
        int i10 = k3Var.u0;
        int i11 = k3Var.x0;
        if (i10 < 0 || i11 < 0) {
            return null;
        }
        a y42 = y4(i10);
        a y43 = y4(i11);
        if (y42 == null || y43 == null) {
            return null;
        }
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y43);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (indexOf > indexOf2) {
            indexOf = indexOf2;
            indexOf2 = indexOf;
        }
        return new int[]{indexOf, indexOf2};
    }

    @Override // org.telegram.ui.Components.d61
    public final void E1(s4.c1 c1Var) {
        v3 v3Var = this.h3;
        if (v3Var == null || c1Var == null) {
            return;
        }
        View view = c1Var.a;
        view.getLocationOnScreen(new int[2]);
        view.getWidth();
        this.T3 = v3Var.e(view.getHeight() + r1[1]);
    }

    public final void E2() {
        ArrayList arrayList;
        k3 k3Var = this.n3;
        int i10 = k3Var.u0;
        int i11 = k3Var.w0;
        int i12 = k3Var.x0;
        if (W1(i10, i11, i12, k3Var.z0, new String[]{""})) {
            return;
        }
        if (i10 > i12) {
            i12 = i10;
            i10 = i12;
        }
        ArrayList arrayList2 = new ArrayList();
        int max = Math.max(0, i10);
        while (true) {
            arrayList = this.l3;
            if (max > i12) {
                break;
            }
            ArrayList arrayList3 = this.p4;
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
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        int indexOf = arrayList.indexOf(arrayList2.get(0));
        arrayList.removeAll(arrayList2);
        if (arrayList.isEmpty()) {
            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        }
        HashMap hashMap = this.m3;
        if (!hashMap.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                hashSet.addAll(((a) arrayList.get(i13)).k);
            }
            hashMap.keySet().retainAll(hashSet);
        }
        x2();
        V3();
        s4();
        k3Var.f(false);
        this.Y2.N(false);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        post(new p2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
    }

    public final void E4(i1 i1Var) {
        i1Var.adaptiveCreateLinkDialog = this.j3;
        i1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override // org.telegram.ui.Components.d61
    public final void F1(s4.c1 c1Var) {
        a aVar = this.S3;
        this.S3 = null;
        this.T3 = false;
        if (aVar == null) {
            if (c1Var != null) {
                View view = c1Var.a;
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            }
            return;
        }
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        r4(aVar);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.onContentChanged();
        }
    }

    public final boolean F2() {
        k3 k3Var = this.n3;
        if (k3Var != null && k3Var.y()) {
            k3Var.f(false);
            return true;
        }
        if (this.i4 == null) {
            return false;
        }
        M2();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x047d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04cf A[LOOP:13: B:176:0x04cd->B:177:0x04cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e0 A[LOOP:14: B:180:0x04de->B:181:0x04e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x047b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0480 A[EDGE_INSN: B:254:0x0480->B:143:0x0480 BREAK  A[LOOP:9: B:132:0x045c->B:244:0x045c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[LOOP:3: B:45:0x00c7->B:47:0x00cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130 A[LOOP:4: B:53:0x012a->B:55:0x0130, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216 A[LOOP:8: B:96:0x0210->B:98:0x0216, LOOP_END] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F4(p5 p5Var) {
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
        char c10;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        o70 o70Var;
        LinkedHashSet linkedHashSet;
        int dp;
        int i14;
        int[] iArr;
        boolean z16;
        FrameLayout P4;
        int i15;
        int i16;
        int i17;
        boolean z17;
        Iterator it3;
        Iterator it4;
        int i18;
        int i19;
        int i20;
        int i21;
        final int i22;
        final int i23;
        boolean z18;
        String string;
        final ?? r62;
        int i24;
        int i25;
        HashSet hashSet3;
        Iterator<TL_iv.pageTableCell> it5;
        boolean z19;
        boolean equals;
        final p5 p5Var2 = p5Var;
        final i6 model = p5Var2.getModel();
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
        if (size >= 2) {
            int i26 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i27 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            int i28 = -1;
            int i29 = -1;
            for (TL_iv.pageTableCell pagetablecell : selectedCells) {
                int b10 = model.b(pagetablecell);
                int a2 = model.a(pagetablecell);
                int o9 = i6.o(pagetablecell);
                int i30 = pagetablecell.colspan;
                if (i30 == 0) {
                    i30 = 1;
                }
                i26 = Math.min(i26, b10);
                i27 = Math.min(i27, a2);
                i28 = Math.max(i28, (b10 + o9) - 1);
                i29 = Math.max(i29, (a2 + i30) - 1);
            }
            HashSet hashSet4 = new HashSet();
            loop1: while (i26 <= i28) {
                for (int i31 = i27; i31 <= i29; i31++) {
                    if (i26 < 0 || i31 < 0 || i26 >= model.b || i31 >= model.c) {
                        equals = false;
                        break loop1;
                    }
                    hashSet4.add(model.d[i26][i31]);
                }
                i26++;
            }
            equals = hashSet4.equals(new HashSet(selectedCells));
            if (equals) {
                i10 = 1;
                if (size == 1) {
                    TL_iv.pageTableCell next = selectedCells.iterator().next();
                    if (i6.n(next) <= 1) {
                        int i32 = next.rowspan;
                        if (i32 == 0) {
                            i32 = 1;
                        }
                        if (i32 <= 1) {
                            z19 = false;
                            if (z19) {
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
                                            for (int i33 = 0; i33 < model.c; i33++) {
                                                if (model.e[intValue][i33] == intValue && selectedCells.contains(model.d[intValue][i33])) {
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
                                                for (int i34 = 0; i34 < model.b; i34++) {
                                                    if (model.f[i34][intValue2] == intValue2 && selectedCells.contains(model.d[i34][intValue2])) {
                                                    }
                                                }
                                            }
                                        }
                                        z11 = true;
                                        if (!selectedCells.isEmpty() || model.b <= 0 || model.c <= 0) {
                                            z12 = false;
                                        } else {
                                            HashSet hashSet5 = new HashSet();
                                            for (int i35 = 0; i35 < model.b; i35++) {
                                                for (int i36 = 0; i36 < model.c; i36++) {
                                                    hashSet5.add(model.d[i35][i36]);
                                                }
                                            }
                                            z12 = hashSet5.equals(new HashSet(selectedCells));
                                        }
                                        z13 = z12 || (model.b == 1 && model.c == 1);
                                        if (z10 || z12) {
                                            c10 = 1;
                                        } else {
                                            HashSet hashSet6 = new HashSet();
                                            Iterator<TL_iv.pageTableCell> it8 = selectedCells.iterator();
                                            while (it8.hasNext()) {
                                                hashSet6.add(Integer.valueOf(model.b(it8.next())));
                                            }
                                            c10 = 1;
                                            if (hashSet6.size() < model.b) {
                                                i12 = 1;
                                                if (z11 && !z12) {
                                                    hashSet3 = new HashSet();
                                                    it5 = selectedCells.iterator();
                                                    while (it5.hasNext()) {
                                                        hashSet3.add(Integer.valueOf(model.a(it5.next())));
                                                    }
                                                    if (hashSet3.size() < model.c) {
                                                        i13 = 1;
                                                        z14 = !z13 && z11 && model.c < MessagesController.getInstance(this.f3).config.richMessageMaxTableCols.get();
                                                        z15 = !z13 && z10;
                                                        o70Var = this.j4;
                                                        if (o70Var != null) {
                                                            linkedHashSet = linkedHashSet2;
                                                            this.j4 = null;
                                                            o70Var.u();
                                                        } else {
                                                            linkedHashSet = linkedHashSet2;
                                                        }
                                                        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                        FrameLayout P42 = P4(p5Var2, false);
                                                        i14 = i13;
                                                        iArr = new int[2];
                                                        P42.getLocationOnScreen(iArr);
                                                        if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                                            P4 = P42;
                                                            z16 = true;
                                                        } else {
                                                            z16 = true;
                                                            P4 = P4(p5Var2, true);
                                                        }
                                                        final o70 D = this.h3.D(P4);
                                                        D.s = 0;
                                                        D.t = false;
                                                        D.Z = z16;
                                                        LinearLayout linearLayout = new LinearLayout(getContext());
                                                        linearLayout.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                        linearLayout.setOrientation(1);
                                                        TextView textView = new TextView(getContext());
                                                        textView.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                        i15 = i10;
                                                        textView.setTextSize(1, 12.0f);
                                                        textView.setGravity(17);
                                                        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
                                                        linearLayout.addView(textView, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                                        i16 = i11;
                                                        i17 = i12;
                                                        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                        linearLayout2.setOrientation(0);
                                                        linearLayout.addView(linearLayout2, w7.x5.q(-2, -2, 17));
                                                        Context context = getContext();
                                                        int i37 = R.drawable.iv_align_horiz_left;
                                                        org.telegram.ui.ActionBar.d6 d6Var = this.g3;
                                                        a2 a2Var = new a2(context, i37, d6Var);
                                                        a2Var.e = 4;
                                                        a2Var.e();
                                                        a2Var.b();
                                                        int i38 = org.telegram.ui.ActionBar.h6.G8;
                                                        a2Var.c(i38);
                                                        boolean z20 = z10;
                                                        linearLayout2.addView(a2Var, w7.x5.n(32, 32));
                                                        a2 a2Var2 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var);
                                                        a2Var2.e = 4;
                                                        a2Var2.e();
                                                        a2Var2.b();
                                                        a2Var2.c(i38);
                                                        linearLayout2.addView(a2Var2, w7.x5.n(32, 32));
                                                        a2 a2Var3 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var);
                                                        a2Var3.e = 4;
                                                        a2Var3.e();
                                                        a2Var3.b();
                                                        a2Var3.c(i38);
                                                        final a2[] a2VarArr = {a2Var, a2Var2, a2Var3};
                                                        boolean z21 = z11;
                                                        linearLayout2.addView(a2Var3, w7.x5.n(32, 32));
                                                        z17 = z12;
                                                        linearLayout2.addView(new Space(getContext()), w7.x5.n(8, 0));
                                                        a2 a2Var4 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var);
                                                        a2Var4.e = 4;
                                                        a2Var4.e();
                                                        a2Var4.b();
                                                        a2Var4.c(i38);
                                                        linearLayout2.addView(a2Var4, w7.x5.n(32, 32));
                                                        a2 a2Var5 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var);
                                                        a2Var5.e = 4;
                                                        a2Var5.e();
                                                        a2Var5.b();
                                                        a2Var5.c(i38);
                                                        linearLayout2.addView(a2Var5, w7.x5.n(32, 32));
                                                        a2 a2Var6 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var);
                                                        a2Var6.e = 4;
                                                        a2Var6.e();
                                                        a2Var6.b();
                                                        a2Var6.c(i38);
                                                        final a2[] a2VarArr2 = {a2Var4, a2Var5, a2Var6};
                                                        linearLayout2.addView(a2Var6, w7.x5.n(32, 32));
                                                        D.q(linearLayout);
                                                        it3 = linkedHashSet.iterator();
                                                        int i39 = -1;
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) it3.next();
                                                            if (pagetablecell2 != null) {
                                                                if (pagetablecell2.align_right) {
                                                                    i25 = 2;
                                                                } else if (pagetablecell2.align_center) {
                                                                    i25 = 1;
                                                                }
                                                                if (i39 == -1) {
                                                                    if (i39 != i25) {
                                                                        i39 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i39 = i25;
                                                                }
                                                            }
                                                            i25 = 0;
                                                            if (i39 == -1) {
                                                            }
                                                        }
                                                        it4 = linkedHashSet.iterator();
                                                        int i40 = -1;
                                                        while (true) {
                                                            if (!it4.hasNext()) {
                                                                i18 = i40;
                                                                break;
                                                            }
                                                            TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) it4.next();
                                                            if (pagetablecell3 != null) {
                                                                if (pagetablecell3.valign_bottom) {
                                                                    i24 = 2;
                                                                } else if (pagetablecell3.valign_middle) {
                                                                    i24 = 1;
                                                                }
                                                                if (i40 == -1) {
                                                                    if (i40 != i24) {
                                                                        i18 = -1;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i40 = i24;
                                                                }
                                                            }
                                                            i24 = 0;
                                                            if (i40 == -1) {
                                                            }
                                                        }
                                                        i19 = 0;
                                                        while (i19 < 3) {
                                                            a2VarArr[i19].setSelected(i19 == i39);
                                                            i19++;
                                                        }
                                                        i21 = 0;
                                                        while (i21 < 3) {
                                                            a2VarArr2[i21].setSelected(i21 == i18);
                                                            i21++;
                                                        }
                                                        for (i22 = 0; i22 < 3; i22++) {
                                                            final int i41 = 0;
                                                            a2VarArr[i22].setOnClickListener(new View.OnClickListener() { // from class: ii.m2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i41) {
                                                                        case 0:
                                                                            p5 p5Var3 = p5Var2;
                                                                            r5 r5Var = p5Var3.v;
                                                                            Iterator it9 = p5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i42 = i22;
                                                                                if (!hasNext) {
                                                                                    r5Var.invalidate();
                                                                                    d3 d3Var = p5Var3.E;
                                                                                    if (d3Var != null && p5Var3.a != null) {
                                                                                        d3Var.a();
                                                                                    }
                                                                                    int i43 = 0;
                                                                                    while (i43 < 3) {
                                                                                        a2VarArr[i43].setSelected(i43 == i42);
                                                                                        i43++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    i6.k(pagetablecell4, i42);
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
                                                                                int i44 = i22;
                                                                                if (!hasNext2) {
                                                                                    r5Var2.invalidate();
                                                                                    d3 d3Var2 = p5Var4.E;
                                                                                    if (d3Var2 != null && p5Var4.a != null) {
                                                                                        d3Var2.a();
                                                                                    }
                                                                                    int i45 = 0;
                                                                                    while (i45 < 3) {
                                                                                        a2VarArr[i45].setSelected(i45 == i44);
                                                                                        i45++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    i6.m(pagetablecell5, i44);
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
                                                        i23 = 0;
                                                        for (i20 = 3; i23 < i20; i20 = 3) {
                                                            final int i42 = 1;
                                                            a2VarArr2[i23].setOnClickListener(new View.OnClickListener() { // from class: ii.m2
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    switch (i42) {
                                                                        case 0:
                                                                            p5 p5Var3 = p5Var2;
                                                                            r5 r5Var = p5Var3.v;
                                                                            Iterator it9 = p5Var3.H.iterator();
                                                                            while (true) {
                                                                                boolean hasNext = it9.hasNext();
                                                                                int i422 = i23;
                                                                                if (!hasNext) {
                                                                                    r5Var.invalidate();
                                                                                    d3 d3Var = p5Var3.E;
                                                                                    if (d3Var != null && p5Var3.a != null) {
                                                                                        d3Var.a();
                                                                                    }
                                                                                    int i43 = 0;
                                                                                    while (i43 < 3) {
                                                                                        a2VarArr2[i43].setSelected(i43 == i422);
                                                                                        i43++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) it9.next();
                                                                                    i6.k(pagetablecell4, i422);
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
                                                                                int i44 = i23;
                                                                                if (!hasNext2) {
                                                                                    r5Var2.invalidate();
                                                                                    d3 d3Var2 = p5Var4.E;
                                                                                    if (d3Var2 != null && p5Var4.a != null) {
                                                                                        d3Var2.a();
                                                                                    }
                                                                                    int i45 = 0;
                                                                                    while (i45 < 3) {
                                                                                        a2VarArr2[i45].setSelected(i45 == i44);
                                                                                        i45++;
                                                                                    }
                                                                                    break;
                                                                                } else {
                                                                                    TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it10.next();
                                                                                    i6.m(pagetablecell5, i44);
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
                                                            i23++;
                                                        }
                                                        D.o();
                                                        D.S = 208;
                                                        if (!linkedHashSet.isEmpty()) {
                                                            Iterator it9 = linkedHashSet.iterator();
                                                            while (it9.hasNext()) {
                                                                if (!((TL_iv.pageTableCell) it9.next()).header) {
                                                                }
                                                            }
                                                            z18 = true;
                                                            if (!z18) {
                                                                string = LocaleController.getString(R.string.ArticleRemoveHighlight);
                                                            } else if (z17 || !(size <= 1 || z21 || z20)) {
                                                                string = LocaleController.getString(R.string.ArticleHighlightCells);
                                                            } else {
                                                                string = LocaleController.getString(z21 ? R.string.ArticleHighlightColumn : z20 ? R.string.ArticleHighlightRow : R.string.ArticleHighlightCell);
                                                            }
                                                            final int i43 = 5;
                                                            D.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i43), false);
                                                            if (i15 != 0) {
                                                                final int i44 = 2;
                                                                D.c(R.drawable.iv_table_merge, LocaleController.getString(R.string.ArticleMergeCells), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i44) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i45 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i45 = Math.min(i45, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i46 = 0;
                                                                                                for (int i47 = 0; i47 < i6Var.b; i47++) {
                                                                                                    iArr2[i47] = i46;
                                                                                                    if (!zArr[i47]) {
                                                                                                        i46++;
                                                                                                    }
                                                                                                }
                                                                                                if (i46 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i48 = 0;
                                                                                                    while (i48 < size2) {
                                                                                                        Object obj = arrayList2.get(i48);
                                                                                                        i48++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i49 = pagetablecell4.colspan;
                                                                                                        if (i49 == 0) {
                                                                                                            i49 = 1;
                                                                                                        }
                                                                                                        int i50 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i50 < 0) {
                                                                                                                    i50 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i50 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i50], a10, i51, i49});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i46);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i45, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i16 != 0) {
                                                                final int i45 = 3;
                                                                D.c(R.drawable.iv_table_unmerge, LocaleController.getString(R.string.ArticleSplitCells), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i45) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i46 = 0;
                                                                                                for (int i47 = 0; i47 < i6Var.b; i47++) {
                                                                                                    iArr2[i47] = i46;
                                                                                                    if (!zArr[i47]) {
                                                                                                        i46++;
                                                                                                    }
                                                                                                }
                                                                                                if (i46 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i48 = 0;
                                                                                                    while (i48 < size2) {
                                                                                                        Object obj = arrayList2.get(i48);
                                                                                                        i48++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i49 = pagetablecell4.colspan;
                                                                                                        if (i49 == 0) {
                                                                                                            i49 = 1;
                                                                                                        }
                                                                                                        int i50 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i50 < 0) {
                                                                                                                    i50 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i50 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i50], a10, i51, i49});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i46);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (z14) {
                                                                final int i46 = 4;
                                                                D.c(R.drawable.iv_table_insert_left, LocaleController.getString(R.string.ArticleInsertLeft), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i46) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i47 = 0; i47 < i6Var.b; i47++) {
                                                                                                    iArr2[i47] = i462;
                                                                                                    if (!zArr[i47]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i48 = 0;
                                                                                                    while (i48 < size2) {
                                                                                                        Object obj = arrayList2.get(i48);
                                                                                                        i48++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i49 = pagetablecell4.colspan;
                                                                                                        if (i49 == 0) {
                                                                                                            i49 = 1;
                                                                                                        }
                                                                                                        int i50 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i50 < 0) {
                                                                                                                    i50 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i50 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i50], a10, i51, i49});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                D.c(R.drawable.iv_table_insert_right, LocaleController.getString(R.string.ArticleInsertRight), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i43) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i47 = 0; i47 < i6Var.b; i47++) {
                                                                                                    iArr2[i47] = i462;
                                                                                                    if (!zArr[i47]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i48 = 0;
                                                                                                    while (i48 < size2) {
                                                                                                        Object obj = arrayList2.get(i48);
                                                                                                        i48++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i49 = pagetablecell4.colspan;
                                                                                                        if (i49 == 0) {
                                                                                                            i49 = 1;
                                                                                                        }
                                                                                                        int i50 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i50 < 0) {
                                                                                                                    i50 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i50 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i50], a10, i51, i49});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (z15) {
                                                                final int i47 = 6;
                                                                D.c(R.drawable.iv_table_insert_top, LocaleController.getString(R.string.ArticleInsertAbove), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i47) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i472 = 0; i472 < i6Var.b; i472++) {
                                                                                                    iArr2[i472] = i462;
                                                                                                    if (!zArr[i472]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i48 = 0;
                                                                                                    while (i48 < size2) {
                                                                                                        Object obj = arrayList2.get(i48);
                                                                                                        i48++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i49 = pagetablecell4.colspan;
                                                                                                        if (i49 == 0) {
                                                                                                            i49 = 1;
                                                                                                        }
                                                                                                        int i50 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i50 < 0) {
                                                                                                                    i50 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i50 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i50], a10, i51, i49});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                                final int i48 = 7;
                                                                D.c(R.drawable.iv_table_insert_bottom, LocaleController.getString(R.string.ArticleInsertBelow), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i48) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i472 = 0; i472 < i6Var.b; i472++) {
                                                                                                    iArr2[i472] = i462;
                                                                                                    if (!zArr[i472]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i482 = 0;
                                                                                                    while (i482 < size2) {
                                                                                                        Object obj = arrayList2.get(i482);
                                                                                                        i482++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i49 = pagetablecell4.colspan;
                                                                                                        if (i49 == 0) {
                                                                                                            i49 = 1;
                                                                                                        }
                                                                                                        int i50 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i50 < 0) {
                                                                                                                    i50 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i50 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i50], a10, i51, i49});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, false);
                                                            }
                                                            if (i14 == 0) {
                                                                int i49 = R.drawable.iv_table_remove;
                                                                String string2 = LocaleController.getString(R.string.ArticleDeleteColumn);
                                                                final int i50 = 8;
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i50) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i472 = 0; i472 < i6Var.b; i472++) {
                                                                                                    iArr2[i472] = i462;
                                                                                                    if (!zArr[i472]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i482 = 0;
                                                                                                    while (i482 < size2) {
                                                                                                        Object obj = arrayList2.get(i482);
                                                                                                        i482++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i492 = pagetablecell4.colspan;
                                                                                                        if (i492 == 0) {
                                                                                                            i492 = 1;
                                                                                                        }
                                                                                                        int i502 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i51 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i502 < 0) {
                                                                                                                    i502 = i52;
                                                                                                                }
                                                                                                                i51++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i502 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i502], a10, i51, i492});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                };
                                                                r62 = 1;
                                                                D.c(i49, string2, runnable, true);
                                                            } else {
                                                                r62 = 1;
                                                            }
                                                            if (i17 != 0) {
                                                                final int i51 = 0;
                                                                D.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteRow), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (i51) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i472 = 0; i472 < i6Var.b; i472++) {
                                                                                                    iArr2[i472] = i462;
                                                                                                    if (!zArr[i472]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i482 = 0;
                                                                                                    while (i482 < size2) {
                                                                                                        Object obj = arrayList2.get(i482);
                                                                                                        i482++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i492 = pagetablecell4.colspan;
                                                                                                        if (i492 == 0) {
                                                                                                            i492 = 1;
                                                                                                        }
                                                                                                        int i502 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i512 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i502 < 0) {
                                                                                                                    i502 = i52;
                                                                                                                }
                                                                                                                i512++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i502 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i502], a10, i512, i492});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r62);
                                                            }
                                                            if (z17) {
                                                                D.c(R.drawable.iv_table_remove, LocaleController.getString(R.string.ArticleDeleteTable), new Runnable(this) { // from class: ii.n2
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
                                                                        boolean z22;
                                                                        int b11;
                                                                        ArrayList arrayList;
                                                                        x3 x3Var2;
                                                                        boolean z23;
                                                                        switch (r62) {
                                                                            case 0:
                                                                                x3 x3Var3 = this.b;
                                                                                x3Var3.getClass();
                                                                                p5 p5Var3 = p5Var2;
                                                                                LinkedHashSet linkedHashSet3 = p5Var3.H;
                                                                                if (p5Var3.F == null || linkedHashSet3.isEmpty()) {
                                                                                    x3Var = x3Var3;
                                                                                } else {
                                                                                    HashSet hashSet7 = new HashSet();
                                                                                    Iterator it10 = linkedHashSet3.iterator();
                                                                                    int i452 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it10.hasNext()) {
                                                                                        int b12 = p5Var3.F.b((TL_iv.pageTableCell) it10.next());
                                                                                        hashSet7.add(Integer.valueOf(b12));
                                                                                        i452 = Math.min(i452, b12);
                                                                                    }
                                                                                    linkedHashSet3.clear();
                                                                                    i6 i6Var = p5Var3.F;
                                                                                    i6Var.getClass();
                                                                                    if (hashSet7.isEmpty()) {
                                                                                        x3Var = x3Var3;
                                                                                        z22 = false;
                                                                                    } else {
                                                                                        boolean[] zArr = new boolean[i6Var.b];
                                                                                        Iterator it11 = hashSet7.iterator();
                                                                                        while (true) {
                                                                                            z22 = true;
                                                                                            if (it11.hasNext()) {
                                                                                                int intValue3 = ((Integer) it11.next()).intValue();
                                                                                                if (intValue3 >= 0 && intValue3 < i6Var.b) {
                                                                                                    zArr[intValue3] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr2 = new int[i6Var.b];
                                                                                                int i462 = 0;
                                                                                                for (int i472 = 0; i472 < i6Var.b; i472++) {
                                                                                                    iArr2[i472] = i462;
                                                                                                    if (!zArr[i472]) {
                                                                                                        i462++;
                                                                                                    }
                                                                                                }
                                                                                                if (i462 == 0) {
                                                                                                    i6Var.a.rows.clear();
                                                                                                    i6Var.i();
                                                                                                    x3Var = x3Var3;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap = new IdentityHashMap();
                                                                                                    ArrayList arrayList2 = i6Var.g;
                                                                                                    int size2 = arrayList2.size();
                                                                                                    int i482 = 0;
                                                                                                    while (i482 < size2) {
                                                                                                        Object obj = arrayList2.get(i482);
                                                                                                        i482++;
                                                                                                        TL_iv.pageTableCell pagetablecell4 = (TL_iv.pageTableCell) obj;
                                                                                                        int b13 = i6Var.b(pagetablecell4);
                                                                                                        int a10 = i6Var.a(pagetablecell4);
                                                                                                        int o10 = i6.o(pagetablecell4);
                                                                                                        int i492 = pagetablecell4.colspan;
                                                                                                        if (i492 == 0) {
                                                                                                            i492 = 1;
                                                                                                        }
                                                                                                        int i502 = -1;
                                                                                                        x3 x3Var4 = x3Var3;
                                                                                                        int[] iArr3 = iArr2;
                                                                                                        int i512 = 0;
                                                                                                        for (int i52 = b13; i52 < b13 + o10 && i52 < i6Var.b; i52++) {
                                                                                                            if (!zArr[i52]) {
                                                                                                                if (i502 < 0) {
                                                                                                                    i502 = i52;
                                                                                                                }
                                                                                                                i512++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i502 >= 0) {
                                                                                                            identityHashMap.put(pagetablecell4, new int[]{iArr3[i502], a10, i512, i492});
                                                                                                        }
                                                                                                        x3Var3 = x3Var4;
                                                                                                        iArr2 = iArr3;
                                                                                                    }
                                                                                                    x3Var = x3Var3;
                                                                                                    i6Var.j(identityHashMap, i462);
                                                                                                    i6Var.i();
                                                                                                    z22 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var3.v();
                                                                                    if (z22) {
                                                                                        p5Var3.q(i452, 0);
                                                                                    }
                                                                                }
                                                                                x3Var.M2();
                                                                                break;
                                                                            case 1:
                                                                                x3 x3Var5 = this.b;
                                                                                x3Var5.getClass();
                                                                                a row = p5Var2.getRow();
                                                                                x3Var5.M2();
                                                                                if (row != null) {
                                                                                    i2 i2Var = x3Var5.J3;
                                                                                    if (i2Var != null) {
                                                                                        i2Var.d();
                                                                                    }
                                                                                    x3Var5.r4(row);
                                                                                    i2 i2Var2 = x3Var5.J3;
                                                                                    if (i2Var2 != null) {
                                                                                        i2Var2.h();
                                                                                    }
                                                                                    v3 v3Var = x3Var5.h3;
                                                                                    if (v3Var != null) {
                                                                                        v3Var.onContentChanged();
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 2:
                                                                                p5 p5Var4 = p5Var2;
                                                                                LinkedHashSet linkedHashSet4 = p5Var4.H;
                                                                                if (p5Var4.F != null && linkedHashSet4.size() >= 2) {
                                                                                    HashSet hashSet8 = new HashSet(linkedHashSet4);
                                                                                    Iterator it12 = hashSet8.iterator();
                                                                                    int i53 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i54 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    int i55 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it12.hasNext()) {
                                                                                        TL_iv.pageTableCell pagetablecell5 = (TL_iv.pageTableCell) it12.next();
                                                                                        i54 = Math.min(i54, p5Var4.F.b(pagetablecell5));
                                                                                        i55 = Math.min(i55, p5Var4.F.a(pagetablecell5));
                                                                                    }
                                                                                    linkedHashSet4.clear();
                                                                                    i6 i6Var2 = p5Var4.F;
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var2.a;
                                                                                    if (hashSet8.size() >= 2) {
                                                                                        Iterator it13 = hashSet8.iterator();
                                                                                        int i56 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                        int i57 = -1;
                                                                                        int i58 = -1;
                                                                                        while (it13.hasNext()) {
                                                                                            TL_iv.pageTableCell pagetablecell6 = (TL_iv.pageTableCell) it13.next();
                                                                                            int b14 = i6Var2.b(pagetablecell6);
                                                                                            int a11 = i6Var2.a(pagetablecell6);
                                                                                            int o11 = i6.o(pagetablecell6);
                                                                                            int i59 = pagetablecell6.colspan;
                                                                                            if (i59 == 0) {
                                                                                                i59 = 1;
                                                                                            }
                                                                                            i53 = Math.min(i53, b14);
                                                                                            i56 = Math.min(i56, a11);
                                                                                            i57 = Math.max(i57, (b14 + o11) - 1);
                                                                                            i58 = Math.max(i58, (a11 + i59) - 1);
                                                                                        }
                                                                                        HashSet hashSet9 = new HashSet();
                                                                                        int i60 = i53;
                                                                                        while (true) {
                                                                                            if (i60 <= i57) {
                                                                                                for (int i61 = i56; i61 <= i58; i61++) {
                                                                                                    if (i60 >= 0 && i61 >= 0 && i60 < i6Var2.b && i61 < i6Var2.c) {
                                                                                                        hashSet9.add(i6Var2.d[i60][i61]);
                                                                                                    }
                                                                                                }
                                                                                                i60++;
                                                                                            } else if (hashSet9.equals(new HashSet(hashSet8))) {
                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                ArrayList arrayList3 = new ArrayList(hashSet9);
                                                                                                Collections.sort(arrayList3, new e8(i6Var2, 2));
                                                                                                int size3 = arrayList3.size();
                                                                                                int i62 = 0;
                                                                                                while (i62 < size3) {
                                                                                                    Object obj2 = arrayList3.get(i62);
                                                                                                    i62++;
                                                                                                    String g10 = i6.g((TL_iv.pageTableCell) obj2);
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
                                                                                                TL_iv.pageTableCell pagetablecell7 = i6Var2.d[i53][i56];
                                                                                                int i63 = (i58 - i56) + 1;
                                                                                                int i64 = (i57 - i53) + 1;
                                                                                                if (i63 <= 1) {
                                                                                                    i63 = 0;
                                                                                                }
                                                                                                pagetablecell7.colspan = i63;
                                                                                                int i65 = i64 > 1 ? i64 : 0;
                                                                                                pagetablecell7.rowspan = i65;
                                                                                                int i66 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i63 > 0 ? i66 | 2 : i66 & (-3);
                                                                                                int i67 = pagetablecell7.flags;
                                                                                                pagetablecell7.flags = i65 > 0 ? i67 | 4 : i67 & (-5);
                                                                                                i6.c(pagetablecell7, sb2.toString());
                                                                                                Iterator it14 = hashSet9.iterator();
                                                                                                while (it14.hasNext()) {
                                                                                                    TL_iv.pageTableCell pagetablecell8 = (TL_iv.pageTableCell) it14.next();
                                                                                                    if (pagetablecell8 != pagetablecell7 && (b11 = i6Var2.b(pagetablecell8)) >= 0 && b11 < pageblocktable2.rows.size()) {
                                                                                                        pageblocktable2.rows.get(b11).cells.remove(pagetablecell8);
                                                                                                    }
                                                                                                }
                                                                                                i6Var2.i();
                                                                                                p5Var4.v();
                                                                                                p5Var4.v.invalidate();
                                                                                                p5Var4.q(i54, i55);
                                                                                                p5Var4.t();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    linkedHashSet4.addAll(hashSet8);
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 3:
                                                                                p5 p5Var5 = p5Var2;
                                                                                LinkedHashSet linkedHashSet5 = p5Var5.H;
                                                                                if (p5Var5.F != null && linkedHashSet5.size() == 1) {
                                                                                    TL_iv.pageTableCell pagetablecell9 = (TL_iv.pageTableCell) linkedHashSet5.iterator().next();
                                                                                    if (i6.n(pagetablecell9) <= 1) {
                                                                                        int i68 = pagetablecell9.rowspan;
                                                                                        if (i68 == 0) {
                                                                                            i68 = 1;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    int b15 = p5Var5.F.b(pagetablecell9);
                                                                                    int a12 = p5Var5.F.a(pagetablecell9);
                                                                                    linkedHashSet5.clear();
                                                                                    if (p5Var5.F.p(pagetablecell9)) {
                                                                                        p5Var5.v();
                                                                                        p5Var5.v.invalidate();
                                                                                        p5Var5.q(b15, a12);
                                                                                        p5Var5.t();
                                                                                    } else {
                                                                                        linkedHashSet5.add(pagetablecell9);
                                                                                    }
                                                                                }
                                                                                this.b.M2();
                                                                                break;
                                                                            case 4:
                                                                                p5Var2.i(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 5:
                                                                                p5Var2.i(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 6:
                                                                                p5Var2.j(true);
                                                                                this.b.M2();
                                                                                break;
                                                                            case 7:
                                                                                p5Var2.j(false);
                                                                                this.b.M2();
                                                                                break;
                                                                            default:
                                                                                x3 x3Var6 = this.b;
                                                                                x3Var6.getClass();
                                                                                p5 p5Var6 = p5Var2;
                                                                                LinkedHashSet linkedHashSet6 = p5Var6.H;
                                                                                if (p5Var6.F == null || linkedHashSet6.isEmpty()) {
                                                                                    x3Var2 = x3Var6;
                                                                                } else {
                                                                                    HashSet hashSet10 = new HashSet();
                                                                                    Iterator it15 = linkedHashSet6.iterator();
                                                                                    int i69 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                                    while (it15.hasNext()) {
                                                                                        int a13 = p5Var6.F.a((TL_iv.pageTableCell) it15.next());
                                                                                        hashSet10.add(Integer.valueOf(a13));
                                                                                        i69 = Math.min(i69, a13);
                                                                                    }
                                                                                    linkedHashSet6.clear();
                                                                                    i6 i6Var3 = p5Var6.F;
                                                                                    i6Var3.getClass();
                                                                                    if (hashSet10.isEmpty()) {
                                                                                        x3Var2 = x3Var6;
                                                                                        z23 = false;
                                                                                    } else {
                                                                                        boolean[] zArr2 = new boolean[i6Var3.c];
                                                                                        Iterator it16 = hashSet10.iterator();
                                                                                        while (true) {
                                                                                            z23 = true;
                                                                                            if (it16.hasNext()) {
                                                                                                int intValue4 = ((Integer) it16.next()).intValue();
                                                                                                if (intValue4 >= 0 && intValue4 < i6Var3.c) {
                                                                                                    zArr2[intValue4] = true;
                                                                                                }
                                                                                            } else {
                                                                                                int[] iArr4 = new int[i6Var3.c];
                                                                                                int i70 = 0;
                                                                                                for (int i71 = 0; i71 < i6Var3.c; i71++) {
                                                                                                    iArr4[i71] = i70;
                                                                                                    if (!zArr2[i71]) {
                                                                                                        i70++;
                                                                                                    }
                                                                                                }
                                                                                                if (i70 == 0) {
                                                                                                    i6Var3.a.rows.clear();
                                                                                                    i6Var3.i();
                                                                                                    x3Var2 = x3Var6;
                                                                                                } else {
                                                                                                    IdentityHashMap identityHashMap2 = new IdentityHashMap();
                                                                                                    ArrayList arrayList4 = i6Var3.g;
                                                                                                    int size4 = arrayList4.size();
                                                                                                    int i72 = 0;
                                                                                                    while (i72 < size4) {
                                                                                                        Object obj3 = arrayList4.get(i72);
                                                                                                        i72++;
                                                                                                        TL_iv.pageTableCell pagetablecell10 = (TL_iv.pageTableCell) obj3;
                                                                                                        int b16 = i6Var3.b(pagetablecell10);
                                                                                                        int a14 = i6Var3.a(pagetablecell10);
                                                                                                        int o12 = i6.o(pagetablecell10);
                                                                                                        int i73 = pagetablecell10.colspan;
                                                                                                        if (i73 == 0) {
                                                                                                            i73 = 1;
                                                                                                        }
                                                                                                        int i74 = -1;
                                                                                                        x3 x3Var7 = x3Var6;
                                                                                                        int[] iArr5 = iArr4;
                                                                                                        boolean[] zArr3 = zArr2;
                                                                                                        int i75 = 0;
                                                                                                        for (int i76 = a14; i76 < a14 + i73 && i76 < i6Var3.c; i76++) {
                                                                                                            if (!zArr3[i76]) {
                                                                                                                if (i74 < 0) {
                                                                                                                    i74 = i76;
                                                                                                                }
                                                                                                                i75++;
                                                                                                            }
                                                                                                        }
                                                                                                        if (i74 >= 0) {
                                                                                                            identityHashMap2.put(pagetablecell10, new int[]{b16, iArr5[i74], o12, i75});
                                                                                                        }
                                                                                                        x3Var6 = x3Var7;
                                                                                                        iArr4 = iArr5;
                                                                                                        zArr2 = zArr3;
                                                                                                    }
                                                                                                    x3Var2 = x3Var6;
                                                                                                    i6Var3.j(identityHashMap2, i6Var3.b);
                                                                                                    i6Var3.i();
                                                                                                    z23 = true;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    p5Var6.v();
                                                                                    if (z23) {
                                                                                        p5Var6.q(0, i69);
                                                                                    }
                                                                                }
                                                                                x3Var2.M2();
                                                                                break;
                                                                        }
                                                                    }
                                                                }, r62);
                                                                D.o();
                                                                final int i52 = 0;
                                                                D.i(new Runnable() { // from class: ii.o2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i52) {
                                                                            case 0:
                                                                                D.n0 = true;
                                                                                boolean z22 = !model.a.bordered;
                                                                                p5 p5Var3 = p5Var2;
                                                                                i6 i6Var = p5Var3.F;
                                                                                if (i6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var.a;
                                                                                    if (pageblocktable2.bordered != z22) {
                                                                                        pageblocktable2.bordered = z22;
                                                                                        p5Var3.v.invalidate();
                                                                                        d3 d3Var = p5Var3.E;
                                                                                        if (d3Var != null && p5Var3.a != null) {
                                                                                            d3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z22);
                                                                                break;
                                                                            default:
                                                                                D.n0 = true;
                                                                                boolean z23 = !model.a.compact;
                                                                                p5 p5Var4 = p5Var2;
                                                                                i6 i6Var2 = p5Var4.F;
                                                                                if (i6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = i6Var2.a;
                                                                                    if (pageblocktable3.compact != z23) {
                                                                                        pageblocktable3.compact = z23;
                                                                                        r5 r5Var = p5Var4.v;
                                                                                        if (r5Var.a != null) {
                                                                                            for (int i53 = 0; i53 < r5Var.getChildCount(); i53++) {
                                                                                                View childAt = r5Var.getChildAt(i53);
                                                                                                if (childAt instanceof s5) {
                                                                                                    ((s5) childAt).setCompact(r5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            r5Var.requestLayout();
                                                                                            r5Var.invalidate();
                                                                                        }
                                                                                        p5Var4.w.requestLayout();
                                                                                        p5Var4.requestLayout();
                                                                                        d3 d3Var2 = p5Var4.E;
                                                                                        if (d3Var2 != null && p5Var4.a != null) {
                                                                                            d3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z23);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableBordered), pageblocktable.bordered);
                                                                final int i53 = 1;
                                                                p5Var2 = p5Var;
                                                                D.i(new Runnable() { // from class: ii.o2
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        switch (i53) {
                                                                            case 0:
                                                                                D.n0 = true;
                                                                                boolean z22 = !model.a.bordered;
                                                                                p5 p5Var3 = p5Var2;
                                                                                i6 i6Var = p5Var3.F;
                                                                                if (i6Var != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable2 = i6Var.a;
                                                                                    if (pageblocktable2.bordered != z22) {
                                                                                        pageblocktable2.bordered = z22;
                                                                                        p5Var3.v.invalidate();
                                                                                        d3 d3Var = p5Var3.E;
                                                                                        if (d3Var != null && p5Var3.a != null) {
                                                                                            d3Var.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[0].setChecked(z22);
                                                                                break;
                                                                            default:
                                                                                D.n0 = true;
                                                                                boolean z23 = !model.a.compact;
                                                                                p5 p5Var4 = p5Var2;
                                                                                i6 i6Var2 = p5Var4.F;
                                                                                if (i6Var2 != null) {
                                                                                    TL_iv.pageBlockTable pageblocktable3 = i6Var2.a;
                                                                                    if (pageblocktable3.compact != z23) {
                                                                                        pageblocktable3.compact = z23;
                                                                                        r5 r5Var = p5Var4.v;
                                                                                        if (r5Var.a != null) {
                                                                                            for (int i532 = 0; i532 < r5Var.getChildCount(); i532++) {
                                                                                                View childAt = r5Var.getChildAt(i532);
                                                                                                if (childAt instanceof s5) {
                                                                                                    ((s5) childAt).setCompact(r5Var.a.a.compact);
                                                                                                }
                                                                                            }
                                                                                            r5Var.requestLayout();
                                                                                            r5Var.invalidate();
                                                                                        }
                                                                                        p5Var4.w.requestLayout();
                                                                                        p5Var4.requestLayout();
                                                                                        d3 d3Var2 = p5Var4.E;
                                                                                        if (d3Var2 != null && p5Var4.a != null) {
                                                                                            d3Var2.a();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r4[1].setChecked(z23);
                                                                                break;
                                                                        }
                                                                    }
                                                                }, LocaleController.getString(R.string.ArticleTableCompact), pageblocktable.compact);
                                                                final org.telegram.ui.ActionBar.f1[] f1VarArr = {D.y(), D.y()};
                                                            }
                                                            D.p = new gg.t(this, D, p5Var2, 15);
                                                            this.j4 = D;
                                                            D.Z();
                                                        }
                                                        z18 = false;
                                                        if (!z18) {
                                                        }
                                                        final int i432 = 5;
                                                        D.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i432), false);
                                                        if (i15 != 0) {
                                                        }
                                                        if (i16 != 0) {
                                                        }
                                                        if (z14) {
                                                        }
                                                        if (z15) {
                                                        }
                                                        if (i14 == 0) {
                                                        }
                                                        if (i17 != 0) {
                                                        }
                                                        if (z17) {
                                                        }
                                                        D.p = new gg.t(this, D, p5Var2, 15);
                                                        this.j4 = D;
                                                        D.Z();
                                                    }
                                                }
                                                i13 = 0;
                                                if (z13) {
                                                }
                                                if (z13) {
                                                }
                                                o70Var = this.j4;
                                                if (o70Var != null) {
                                                }
                                                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                                FrameLayout P422 = P4(p5Var2, false);
                                                i14 = i13;
                                                iArr = new int[2];
                                                P422.getLocationOnScreen(iArr);
                                                if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                                }
                                                final o70 D2 = this.h3.D(P4);
                                                D2.s = 0;
                                                D2.t = false;
                                                D2.Z = z16;
                                                LinearLayout linearLayout3 = new LinearLayout(getContext());
                                                linearLayout3.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                                linearLayout3.setOrientation(1);
                                                TextView textView2 = new TextView(getContext());
                                                textView2.setText(LocaleController.getString(R.string.ArticleAlignment));
                                                i15 = i10;
                                                textView2.setTextSize(1, 12.0f);
                                                textView2.setGravity(17);
                                                textView2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
                                                linearLayout3.addView(textView2, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                                LinearLayout linearLayout22 = new LinearLayout(getContext());
                                                i16 = i11;
                                                i17 = i12;
                                                linearLayout22.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                                linearLayout22.setOrientation(0);
                                                linearLayout3.addView(linearLayout22, w7.x5.q(-2, -2, 17));
                                                Context context2 = getContext();
                                                int i372 = R.drawable.iv_align_horiz_left;
                                                org.telegram.ui.ActionBar.d6 d6Var2 = this.g3;
                                                a2 a2Var7 = new a2(context2, i372, d6Var2);
                                                a2Var7.e = 4;
                                                a2Var7.e();
                                                a2Var7.b();
                                                int i382 = org.telegram.ui.ActionBar.h6.G8;
                                                a2Var7.c(i382);
                                                boolean z202 = z10;
                                                linearLayout22.addView(a2Var7, w7.x5.n(32, 32));
                                                a2 a2Var22 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var2);
                                                a2Var22.e = 4;
                                                a2Var22.e();
                                                a2Var22.b();
                                                a2Var22.c(i382);
                                                linearLayout22.addView(a2Var22, w7.x5.n(32, 32));
                                                a2 a2Var32 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var2);
                                                a2Var32.e = 4;
                                                a2Var32.e();
                                                a2Var32.b();
                                                a2Var32.c(i382);
                                                final a2[] a2VarArr3 = {a2Var7, a2Var22, a2Var32};
                                                boolean z212 = z11;
                                                linearLayout22.addView(a2Var32, w7.x5.n(32, 32));
                                                z17 = z12;
                                                linearLayout22.addView(new Space(getContext()), w7.x5.n(8, 0));
                                                a2 a2Var42 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var2);
                                                a2Var42.e = 4;
                                                a2Var42.e();
                                                a2Var42.b();
                                                a2Var42.c(i382);
                                                linearLayout22.addView(a2Var42, w7.x5.n(32, 32));
                                                a2 a2Var52 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var2);
                                                a2Var52.e = 4;
                                                a2Var52.e();
                                                a2Var52.b();
                                                a2Var52.c(i382);
                                                linearLayout22.addView(a2Var52, w7.x5.n(32, 32));
                                                a2 a2Var62 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var2);
                                                a2Var62.e = 4;
                                                a2Var62.e();
                                                a2Var62.b();
                                                a2Var62.c(i382);
                                                final a2[] a2VarArr22 = {a2Var42, a2Var52, a2Var62};
                                                linearLayout22.addView(a2Var62, w7.x5.n(32, 32));
                                                D2.q(linearLayout3);
                                                it3 = linkedHashSet.iterator();
                                                int i392 = -1;
                                                while (true) {
                                                    if (!it3.hasNext()) {
                                                    }
                                                }
                                                it4 = linkedHashSet.iterator();
                                                int i402 = -1;
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                    }
                                                }
                                                i19 = 0;
                                                while (i19 < 3) {
                                                }
                                                i21 = 0;
                                                while (i21 < 3) {
                                                }
                                                while (i22 < 3) {
                                                }
                                                i23 = 0;
                                                while (i23 < i20) {
                                                }
                                                D2.o();
                                                D2.S = 208;
                                                if (!linkedHashSet.isEmpty()) {
                                                }
                                                z18 = false;
                                                if (!z18) {
                                                }
                                                final int i4322 = 5;
                                                D2.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i4322), false);
                                                if (i15 != 0) {
                                                }
                                                if (i16 != 0) {
                                                }
                                                if (z14) {
                                                }
                                                if (z15) {
                                                }
                                                if (i14 == 0) {
                                                }
                                                if (i17 != 0) {
                                                }
                                                if (z17) {
                                                }
                                                D2.p = new gg.t(this, D2, p5Var2, 15);
                                                this.j4 = D2;
                                                D2.Z();
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
                                        o70Var = this.j4;
                                        if (o70Var != null) {
                                        }
                                        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                        FrameLayout P4222 = P4(p5Var2, false);
                                        i14 = i13;
                                        iArr = new int[2];
                                        P4222.getLocationOnScreen(iArr);
                                        if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                        }
                                        final o70 D22 = this.h3.D(P4);
                                        D22.s = 0;
                                        D22.t = false;
                                        D22.Z = z16;
                                        LinearLayout linearLayout32 = new LinearLayout(getContext());
                                        linearLayout32.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                        linearLayout32.setOrientation(1);
                                        TextView textView22 = new TextView(getContext());
                                        textView22.setText(LocaleController.getString(R.string.ArticleAlignment));
                                        i15 = i10;
                                        textView22.setTextSize(1, 12.0f);
                                        textView22.setGravity(17);
                                        textView22.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
                                        linearLayout32.addView(textView22, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                        LinearLayout linearLayout222 = new LinearLayout(getContext());
                                        i16 = i11;
                                        i17 = i12;
                                        linearLayout222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                        linearLayout222.setOrientation(0);
                                        linearLayout32.addView(linearLayout222, w7.x5.q(-2, -2, 17));
                                        Context context22 = getContext();
                                        int i3722 = R.drawable.iv_align_horiz_left;
                                        org.telegram.ui.ActionBar.d6 d6Var22 = this.g3;
                                        a2 a2Var72 = new a2(context22, i3722, d6Var22);
                                        a2Var72.e = 4;
                                        a2Var72.e();
                                        a2Var72.b();
                                        int i3822 = org.telegram.ui.ActionBar.h6.G8;
                                        a2Var72.c(i3822);
                                        boolean z2022 = z10;
                                        linearLayout222.addView(a2Var72, w7.x5.n(32, 32));
                                        a2 a2Var222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var22);
                                        a2Var222.e = 4;
                                        a2Var222.e();
                                        a2Var222.b();
                                        a2Var222.c(i3822);
                                        linearLayout222.addView(a2Var222, w7.x5.n(32, 32));
                                        a2 a2Var322 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var22);
                                        a2Var322.e = 4;
                                        a2Var322.e();
                                        a2Var322.b();
                                        a2Var322.c(i3822);
                                        final a2[] a2VarArr32 = {a2Var72, a2Var222, a2Var322};
                                        boolean z2122 = z11;
                                        linearLayout222.addView(a2Var322, w7.x5.n(32, 32));
                                        z17 = z12;
                                        linearLayout222.addView(new Space(getContext()), w7.x5.n(8, 0));
                                        a2 a2Var422 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var22);
                                        a2Var422.e = 4;
                                        a2Var422.e();
                                        a2Var422.b();
                                        a2Var422.c(i3822);
                                        linearLayout222.addView(a2Var422, w7.x5.n(32, 32));
                                        a2 a2Var522 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var22);
                                        a2Var522.e = 4;
                                        a2Var522.e();
                                        a2Var522.b();
                                        a2Var522.c(i3822);
                                        linearLayout222.addView(a2Var522, w7.x5.n(32, 32));
                                        a2 a2Var622 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var22);
                                        a2Var622.e = 4;
                                        a2Var622.e();
                                        a2Var622.b();
                                        a2Var622.c(i3822);
                                        final a2[] a2VarArr222 = {a2Var422, a2Var522, a2Var622};
                                        linearLayout222.addView(a2Var622, w7.x5.n(32, 32));
                                        D22.q(linearLayout32);
                                        it3 = linkedHashSet.iterator();
                                        int i3922 = -1;
                                        while (true) {
                                            if (!it3.hasNext()) {
                                            }
                                        }
                                        it4 = linkedHashSet.iterator();
                                        int i4022 = -1;
                                        while (true) {
                                            if (!it4.hasNext()) {
                                            }
                                        }
                                        i19 = 0;
                                        while (i19 < 3) {
                                        }
                                        i21 = 0;
                                        while (i21 < 3) {
                                        }
                                        while (i22 < 3) {
                                        }
                                        i23 = 0;
                                        while (i23 < i20) {
                                        }
                                        D22.o();
                                        D22.S = 208;
                                        if (!linkedHashSet.isEmpty()) {
                                        }
                                        z18 = false;
                                        if (!z18) {
                                        }
                                        final int i43222 = 5;
                                        D22.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i43222), false);
                                        if (i15 != 0) {
                                        }
                                        if (i16 != 0) {
                                        }
                                        if (z14) {
                                        }
                                        if (z15) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i17 != 0) {
                                        }
                                        if (z17) {
                                        }
                                        D22.p = new gg.t(this, D22, p5Var2, 15);
                                        this.j4 = D22;
                                        D22.Z();
                                    }
                                    z11 = false;
                                    if (selectedCells.isEmpty()) {
                                    }
                                    z12 = false;
                                    if (z12) {
                                    }
                                    if (z10) {
                                    }
                                    c10 = 1;
                                    i12 = 0;
                                    if (z11) {
                                    }
                                    i13 = 0;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    o70Var = this.j4;
                                    if (o70Var != null) {
                                    }
                                    dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                    FrameLayout P42222 = P4(p5Var2, false);
                                    i14 = i13;
                                    iArr = new int[2];
                                    P42222.getLocationOnScreen(iArr);
                                    if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                    }
                                    final o70 D222 = this.h3.D(P4);
                                    D222.s = 0;
                                    D222.t = false;
                                    D222.Z = z16;
                                    LinearLayout linearLayout322 = new LinearLayout(getContext());
                                    linearLayout322.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                    linearLayout322.setOrientation(1);
                                    TextView textView222 = new TextView(getContext());
                                    textView222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                    i15 = i10;
                                    textView222.setTextSize(1, 12.0f);
                                    textView222.setGravity(17);
                                    textView222.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
                                    linearLayout322.addView(textView222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                    LinearLayout linearLayout2222 = new LinearLayout(getContext());
                                    i16 = i11;
                                    i17 = i12;
                                    linearLayout2222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                    linearLayout2222.setOrientation(0);
                                    linearLayout322.addView(linearLayout2222, w7.x5.q(-2, -2, 17));
                                    Context context222 = getContext();
                                    int i37222 = R.drawable.iv_align_horiz_left;
                                    org.telegram.ui.ActionBar.d6 d6Var222 = this.g3;
                                    a2 a2Var722 = new a2(context222, i37222, d6Var222);
                                    a2Var722.e = 4;
                                    a2Var722.e();
                                    a2Var722.b();
                                    int i38222 = org.telegram.ui.ActionBar.h6.G8;
                                    a2Var722.c(i38222);
                                    boolean z20222 = z10;
                                    linearLayout2222.addView(a2Var722, w7.x5.n(32, 32));
                                    a2 a2Var2222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var222);
                                    a2Var2222.e = 4;
                                    a2Var2222.e();
                                    a2Var2222.b();
                                    a2Var2222.c(i38222);
                                    linearLayout2222.addView(a2Var2222, w7.x5.n(32, 32));
                                    a2 a2Var3222 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var222);
                                    a2Var3222.e = 4;
                                    a2Var3222.e();
                                    a2Var3222.b();
                                    a2Var3222.c(i38222);
                                    final a2[] a2VarArr322 = {a2Var722, a2Var2222, a2Var3222};
                                    boolean z21222 = z11;
                                    linearLayout2222.addView(a2Var3222, w7.x5.n(32, 32));
                                    z17 = z12;
                                    linearLayout2222.addView(new Space(getContext()), w7.x5.n(8, 0));
                                    a2 a2Var4222 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var222);
                                    a2Var4222.e = 4;
                                    a2Var4222.e();
                                    a2Var4222.b();
                                    a2Var4222.c(i38222);
                                    linearLayout2222.addView(a2Var4222, w7.x5.n(32, 32));
                                    a2 a2Var5222 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var222);
                                    a2Var5222.e = 4;
                                    a2Var5222.e();
                                    a2Var5222.b();
                                    a2Var5222.c(i38222);
                                    linearLayout2222.addView(a2Var5222, w7.x5.n(32, 32));
                                    a2 a2Var6222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var222);
                                    a2Var6222.e = 4;
                                    a2Var6222.e();
                                    a2Var6222.b();
                                    a2Var6222.c(i38222);
                                    final a2[] a2VarArr2222 = {a2Var4222, a2Var5222, a2Var6222};
                                    linearLayout2222.addView(a2Var6222, w7.x5.n(32, 32));
                                    D222.q(linearLayout322);
                                    it3 = linkedHashSet.iterator();
                                    int i39222 = -1;
                                    while (true) {
                                        if (!it3.hasNext()) {
                                        }
                                    }
                                    it4 = linkedHashSet.iterator();
                                    int i40222 = -1;
                                    while (true) {
                                        if (!it4.hasNext()) {
                                        }
                                    }
                                    i19 = 0;
                                    while (i19 < 3) {
                                    }
                                    i21 = 0;
                                    while (i21 < 3) {
                                    }
                                    while (i22 < 3) {
                                    }
                                    i23 = 0;
                                    while (i23 < i20) {
                                    }
                                    D222.o();
                                    D222.S = 208;
                                    if (!linkedHashSet.isEmpty()) {
                                    }
                                    z18 = false;
                                    if (!z18) {
                                    }
                                    final int i432222 = 5;
                                    D222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i432222), false);
                                    if (i15 != 0) {
                                    }
                                    if (i16 != 0) {
                                    }
                                    if (z14) {
                                    }
                                    if (z15) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i17 != 0) {
                                    }
                                    if (z17) {
                                    }
                                    D222.p = new gg.t(this, D222, p5Var2, 15);
                                    this.j4 = D222;
                                    D222.Z();
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
                                c10 = 1;
                                i12 = 0;
                                if (z11) {
                                }
                                i13 = 0;
                                if (z13) {
                                }
                                if (z13) {
                                }
                                o70Var = this.j4;
                                if (o70Var != null) {
                                }
                                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                                FrameLayout P422222 = P4(p5Var2, false);
                                i14 = i13;
                                iArr = new int[2];
                                P422222.getLocationOnScreen(iArr);
                                if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                                }
                                final o70 D2222 = this.h3.D(P4);
                                D2222.s = 0;
                                D2222.t = false;
                                D2222.Z = z16;
                                LinearLayout linearLayout3222 = new LinearLayout(getContext());
                                linearLayout3222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                                linearLayout3222.setOrientation(1);
                                TextView textView2222 = new TextView(getContext());
                                textView2222.setText(LocaleController.getString(R.string.ArticleAlignment));
                                i15 = i10;
                                textView2222.setTextSize(1, 12.0f);
                                textView2222.setGravity(17);
                                textView2222.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
                                linearLayout3222.addView(textView2222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                                LinearLayout linearLayout22222 = new LinearLayout(getContext());
                                i16 = i11;
                                i17 = i12;
                                linearLayout22222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                                linearLayout22222.setOrientation(0);
                                linearLayout3222.addView(linearLayout22222, w7.x5.q(-2, -2, 17));
                                Context context2222 = getContext();
                                int i372222 = R.drawable.iv_align_horiz_left;
                                org.telegram.ui.ActionBar.d6 d6Var2222 = this.g3;
                                a2 a2Var7222 = new a2(context2222, i372222, d6Var2222);
                                a2Var7222.e = 4;
                                a2Var7222.e();
                                a2Var7222.b();
                                int i382222 = org.telegram.ui.ActionBar.h6.G8;
                                a2Var7222.c(i382222);
                                boolean z202222 = z10;
                                linearLayout22222.addView(a2Var7222, w7.x5.n(32, 32));
                                a2 a2Var22222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var2222);
                                a2Var22222.e = 4;
                                a2Var22222.e();
                                a2Var22222.b();
                                a2Var22222.c(i382222);
                                linearLayout22222.addView(a2Var22222, w7.x5.n(32, 32));
                                a2 a2Var32222 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var2222);
                                a2Var32222.e = 4;
                                a2Var32222.e();
                                a2Var32222.b();
                                a2Var32222.c(i382222);
                                final a2[] a2VarArr3222 = {a2Var7222, a2Var22222, a2Var32222};
                                boolean z212222 = z11;
                                linearLayout22222.addView(a2Var32222, w7.x5.n(32, 32));
                                z17 = z12;
                                linearLayout22222.addView(new Space(getContext()), w7.x5.n(8, 0));
                                a2 a2Var42222 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var2222);
                                a2Var42222.e = 4;
                                a2Var42222.e();
                                a2Var42222.b();
                                a2Var42222.c(i382222);
                                linearLayout22222.addView(a2Var42222, w7.x5.n(32, 32));
                                a2 a2Var52222 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var2222);
                                a2Var52222.e = 4;
                                a2Var52222.e();
                                a2Var52222.b();
                                a2Var52222.c(i382222);
                                linearLayout22222.addView(a2Var52222, w7.x5.n(32, 32));
                                a2 a2Var62222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var2222);
                                a2Var62222.e = 4;
                                a2Var62222.e();
                                a2Var62222.b();
                                a2Var62222.c(i382222);
                                final a2[] a2VarArr22222 = {a2Var42222, a2Var52222, a2Var62222};
                                linearLayout22222.addView(a2Var62222, w7.x5.n(32, 32));
                                D2222.q(linearLayout3222);
                                it3 = linkedHashSet.iterator();
                                int i392222 = -1;
                                while (true) {
                                    if (!it3.hasNext()) {
                                    }
                                }
                                it4 = linkedHashSet.iterator();
                                int i402222 = -1;
                                while (true) {
                                    if (!it4.hasNext()) {
                                    }
                                }
                                i19 = 0;
                                while (i19 < 3) {
                                }
                                i21 = 0;
                                while (i21 < 3) {
                                }
                                while (i22 < 3) {
                                }
                                i23 = 0;
                                while (i23 < i20) {
                                }
                                D2222.o();
                                D2222.S = 208;
                                if (!linkedHashSet.isEmpty()) {
                                }
                                z18 = false;
                                if (!z18) {
                                }
                                final int i4322222 = 5;
                                D2222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i4322222), false);
                                if (i15 != 0) {
                                }
                                if (i16 != 0) {
                                }
                                if (z14) {
                                }
                                if (z15) {
                                }
                                if (i14 == 0) {
                                }
                                if (i17 != 0) {
                                }
                                if (z17) {
                                }
                                D2222.p = new gg.t(this, D2222, p5Var2, 15);
                                this.j4 = D2222;
                                D2222.Z();
                            }
                        }
                    }
                    z19 = true;
                    if (z19) {
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
                c10 = 1;
                i12 = 0;
                if (z11) {
                }
                i13 = 0;
                if (z13) {
                }
                if (z13) {
                }
                o70Var = this.j4;
                if (o70Var != null) {
                }
                dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
                FrameLayout P4222222 = P4(p5Var2, false);
                i14 = i13;
                iArr = new int[2];
                P4222222.getLocationOnScreen(iArr);
                if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
                }
                final o70 D22222 = this.h3.D(P4);
                D22222.s = 0;
                D22222.t = false;
                D22222.Z = z16;
                LinearLayout linearLayout32222 = new LinearLayout(getContext());
                linearLayout32222.setMinimumWidth(AndroidUtilities.dp(208.0f));
                linearLayout32222.setOrientation(1);
                TextView textView22222 = new TextView(getContext());
                textView22222.setText(LocaleController.getString(R.string.ArticleAlignment));
                i15 = i10;
                textView22222.setTextSize(1, 12.0f);
                textView22222.setGravity(17);
                textView22222.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
                linearLayout32222.addView(textView22222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
                LinearLayout linearLayout222222 = new LinearLayout(getContext());
                i16 = i11;
                i17 = i12;
                linearLayout222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                linearLayout222222.setOrientation(0);
                linearLayout32222.addView(linearLayout222222, w7.x5.q(-2, -2, 17));
                Context context22222 = getContext();
                int i3722222 = R.drawable.iv_align_horiz_left;
                org.telegram.ui.ActionBar.d6 d6Var22222 = this.g3;
                a2 a2Var72222 = new a2(context22222, i3722222, d6Var22222);
                a2Var72222.e = 4;
                a2Var72222.e();
                a2Var72222.b();
                int i3822222 = org.telegram.ui.ActionBar.h6.G8;
                a2Var72222.c(i3822222);
                boolean z2022222 = z10;
                linearLayout222222.addView(a2Var72222, w7.x5.n(32, 32));
                a2 a2Var222222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var22222);
                a2Var222222.e = 4;
                a2Var222222.e();
                a2Var222222.b();
                a2Var222222.c(i3822222);
                linearLayout222222.addView(a2Var222222, w7.x5.n(32, 32));
                a2 a2Var322222 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var22222);
                a2Var322222.e = 4;
                a2Var322222.e();
                a2Var322222.b();
                a2Var322222.c(i3822222);
                final a2[] a2VarArr32222 = {a2Var72222, a2Var222222, a2Var322222};
                boolean z2122222 = z11;
                linearLayout222222.addView(a2Var322222, w7.x5.n(32, 32));
                z17 = z12;
                linearLayout222222.addView(new Space(getContext()), w7.x5.n(8, 0));
                a2 a2Var422222 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var22222);
                a2Var422222.e = 4;
                a2Var422222.e();
                a2Var422222.b();
                a2Var422222.c(i3822222);
                linearLayout222222.addView(a2Var422222, w7.x5.n(32, 32));
                a2 a2Var522222 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var22222);
                a2Var522222.e = 4;
                a2Var522222.e();
                a2Var522222.b();
                a2Var522222.c(i3822222);
                linearLayout222222.addView(a2Var522222, w7.x5.n(32, 32));
                a2 a2Var622222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var22222);
                a2Var622222.e = 4;
                a2Var622222.e();
                a2Var622222.b();
                a2Var622222.c(i3822222);
                final a2[] a2VarArr222222 = {a2Var422222, a2Var522222, a2Var622222};
                linearLayout222222.addView(a2Var622222, w7.x5.n(32, 32));
                D22222.q(linearLayout32222);
                it3 = linkedHashSet.iterator();
                int i3922222 = -1;
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                it4 = linkedHashSet.iterator();
                int i4022222 = -1;
                while (true) {
                    if (!it4.hasNext()) {
                    }
                }
                i19 = 0;
                while (i19 < 3) {
                }
                i21 = 0;
                while (i21 < 3) {
                }
                while (i22 < 3) {
                }
                i23 = 0;
                while (i23 < i20) {
                }
                D22222.o();
                D22222.S = 208;
                if (!linkedHashSet.isEmpty()) {
                }
                z18 = false;
                if (!z18) {
                }
                final int i43222222 = 5;
                D22222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i43222222), false);
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (z14) {
                }
                if (z15) {
                }
                if (i14 == 0) {
                }
                if (i17 != 0) {
                }
                if (z17) {
                }
                D22222.p = new gg.t(this, D22222, p5Var2, 15);
                this.j4 = D22222;
                D22222.Z();
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
        c10 = 1;
        i12 = 0;
        if (z11) {
        }
        i13 = 0;
        if (z13) {
        }
        if (z13) {
        }
        o70Var = this.j4;
        if (o70Var != null) {
        }
        dp = AndroidUtilities.dp(((i10 + 1 + i11 + (z14 ? 2 : 0) + (z15 ? 2 : 0) + i13 + i12 + (z12 ? 3 : 0)) * 48) + 68 + (z12 ? 8 : 0));
        FrameLayout P42222222 = P4(p5Var2, false);
        i14 = i13;
        iArr = new int[2];
        P42222222.getLocationOnScreen(iArr);
        if ((iArr[c10] - dp) - AndroidUtilities.dp(8.0f) >= AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight) {
        }
        final o70 D222222 = this.h3.D(P4);
        D222222.s = 0;
        D222222.t = false;
        D222222.Z = z16;
        LinearLayout linearLayout322222 = new LinearLayout(getContext());
        linearLayout322222.setMinimumWidth(AndroidUtilities.dp(208.0f));
        linearLayout322222.setOrientation(1);
        TextView textView222222 = new TextView(getContext());
        textView222222.setText(LocaleController.getString(R.string.ArticleAlignment));
        i15 = i10;
        textView222222.setTextSize(1, 12.0f);
        textView222222.setGravity(17);
        textView222222.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.y6, this.p2));
        linearLayout322222.addView(textView222222, w7.x5.k(0.0f, 5.0f, 0.0f, 4.0f, -1, -2));
        LinearLayout linearLayout2222222 = new LinearLayout(getContext());
        i16 = i11;
        i17 = i12;
        linearLayout2222222.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        linearLayout2222222.setOrientation(0);
        linearLayout322222.addView(linearLayout2222222, w7.x5.q(-2, -2, 17));
        Context context222222 = getContext();
        int i37222222 = R.drawable.iv_align_horiz_left;
        org.telegram.ui.ActionBar.d6 d6Var222222 = this.g3;
        a2 a2Var722222 = new a2(context222222, i37222222, d6Var222222);
        a2Var722222.e = 4;
        a2Var722222.e();
        a2Var722222.b();
        int i38222222 = org.telegram.ui.ActionBar.h6.G8;
        a2Var722222.c(i38222222);
        boolean z20222222 = z10;
        linearLayout2222222.addView(a2Var722222, w7.x5.n(32, 32));
        a2 a2Var2222222 = new a2(getContext(), R.drawable.iv_align_horiz_middle, d6Var222222);
        a2Var2222222.e = 4;
        a2Var2222222.e();
        a2Var2222222.b();
        a2Var2222222.c(i38222222);
        linearLayout2222222.addView(a2Var2222222, w7.x5.n(32, 32));
        a2 a2Var3222222 = new a2(getContext(), R.drawable.iv_align_horiz_right, d6Var222222);
        a2Var3222222.e = 4;
        a2Var3222222.e();
        a2Var3222222.b();
        a2Var3222222.c(i38222222);
        final a2[] a2VarArr322222 = {a2Var722222, a2Var2222222, a2Var3222222};
        boolean z21222222 = z11;
        linearLayout2222222.addView(a2Var3222222, w7.x5.n(32, 32));
        z17 = z12;
        linearLayout2222222.addView(new Space(getContext()), w7.x5.n(8, 0));
        a2 a2Var4222222 = new a2(getContext(), R.drawable.iv_align_vert_top, d6Var222222);
        a2Var4222222.e = 4;
        a2Var4222222.e();
        a2Var4222222.b();
        a2Var4222222.c(i38222222);
        linearLayout2222222.addView(a2Var4222222, w7.x5.n(32, 32));
        a2 a2Var5222222 = new a2(getContext(), R.drawable.iv_align_vert_middle, d6Var222222);
        a2Var5222222.e = 4;
        a2Var5222222.e();
        a2Var5222222.b();
        a2Var5222222.c(i38222222);
        linearLayout2222222.addView(a2Var5222222, w7.x5.n(32, 32));
        a2 a2Var6222222 = new a2(getContext(), R.drawable.iv_align_vert_bottom, d6Var222222);
        a2Var6222222.e = 4;
        a2Var6222222.e();
        a2Var6222222.b();
        a2Var6222222.c(i38222222);
        final a2[] a2VarArr2222222 = {a2Var4222222, a2Var5222222, a2Var6222222};
        linearLayout2222222.addView(a2Var6222222, w7.x5.n(32, 32));
        D222222.q(linearLayout322222);
        it3 = linkedHashSet.iterator();
        int i39222222 = -1;
        while (true) {
            if (!it3.hasNext()) {
            }
        }
        it4 = linkedHashSet.iterator();
        int i40222222 = -1;
        while (true) {
            if (!it4.hasNext()) {
            }
        }
        i19 = 0;
        while (i19 < 3) {
        }
        i21 = 0;
        while (i21 < 3) {
        }
        while (i22 < 3) {
        }
        i23 = 0;
        while (i23 < i20) {
        }
        D222222.o();
        D222222.S = 208;
        if (!linkedHashSet.isEmpty()) {
        }
        z18 = false;
        if (!z18) {
        }
        final int i432222222 = 5;
        D222222.c(!z18 ? R.drawable.iv_table_highlight_remove : R.drawable.iv_table_highlight, string, new ci.y0(this, p5Var2, z18, i432222222), false);
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (z14) {
        }
        if (z15) {
        }
        if (i14 == 0) {
        }
        if (i17 != 0) {
        }
        if (z17) {
        }
        D222222.p = new gg.t(this, D222222, p5Var2, 15);
        this.j4 = D222222;
        D222222.Z();
    }

    @Override // org.telegram.ui.Components.d61
    public final void G1(s4.c1 c1Var) {
        int b10;
        h51 G;
        a aVar = null;
        if (c1Var != null && (b10 = c1Var.b()) >= 0 && (G = this.Y2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.S3 = aVar;
        this.T3 = false;
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.o();
        }
    }

    public final void G2() {
        k3 k3Var = this.n3;
        if (k3Var != null) {
            k3Var.f(true);
        }
        M2();
        n3();
        IdentityHashMap identityHashMap = this.Z3;
        Iterator it = identityHashMap.values().iterator();
        while (it.hasNext()) {
            ((b5) it.next()).b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.a4;
        Iterator it2 = identityHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((x4) it2.next()).a();
        }
        identityHashMap2.clear();
    }

    public final boolean G3() {
        int i10;
        a y42;
        k3 k3Var = this.n3;
        return k3Var != null && k3Var.y() && (i10 = k3Var.u0) == k3Var.x0 && i10 >= 0 && i10 < this.p4.size() && k3Var.v0 == 1 && k3Var.y0 == 1 && (y42 = y4(i10)) != null && e6.p(y42.b);
    }

    public final e6 G4() {
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y()) {
            return null;
        }
        int i10 = k3Var.u0;
        int i11 = k3Var.x0;
        a y42 = y4(i10);
        if (i10 == i11 && y42 != null && A3(y42.b)) {
            return u2(i10);
        }
        return null;
    }

    public final int H2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.l3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (x3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean H3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.l3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.i && !x3(aVar)) {
                        if (!aVar.k.isEmpty() || e6.p(aVar.b)) {
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

    public final Editable H4(int i10, int i11, int i12, int i13) {
        if (i10 != i12) {
            return null;
        }
        if (x3(y4(i10))) {
            i1 I2 = I2(i10);
            if (I2 != null) {
                return I2.getText();
            }
            return null;
        }
        if (G3()) {
            i1 j42 = j4(i10);
            if (j42 != null) {
                return j42.getText();
            }
            return null;
        }
        a y42 = y4(i10);
        if (y42 == null || !A3(y42.b)) {
            return null;
        }
        int i22 = i2(i10);
        if (hg.c.B(i11, i13, i22, 0) >= hg.c.y(i11, i13, i22, 0)) {
            return null;
        }
        e6 u22 = u2(i10);
        return u22 != null ? u22.getEditText().getText() : e6.A(y42.b);
    }

    public final i1 I2(int i10) {
        if (!x3(y4(i10))) {
            return null;
        }
        View A4 = A4(i10);
        if (A4 instanceof u0) {
            return ((u0) A4).getEditText();
        }
        return null;
    }

    public final boolean I3() {
        k3 k3Var = this.n3;
        if (k3Var != null && k3Var.y()) {
            int i10 = k3Var.u0;
            int i11 = k3Var.x0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a y42 = y4(i10);
                    if (y42 != null) {
                        if (C3(y42.b)) {
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
    public final boolean I4(int i10, int i11, int i12, int i13, ArrayList arrayList) {
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
            ArrayList arrayList3 = this.l3;
            if (i10 < arrayList3.size() && i11 < arrayList3.size()) {
                if (i10 <= i11) {
                    if (i10 == i11) {
                    }
                    for (i14 = i10; i14 <= i11; i14++) {
                        a aVar2 = (a) arrayList3.get(i14);
                        if (!aVar2.i && !x3(aVar2) && !E3(aVar2.b) && !l3(aVar2.b) && !(aVar2.b instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    aVar = (a) arrayList3.get(i10);
                    a aVar3 = (a) arrayList3.get(i11);
                    A = e6.A(aVar.b);
                    A2 = i10 != i11 ? A : e6.A(aVar3.b);
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
                    i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (arrayList.size() == 1 || !F3((a) arrayList.get(0))) {
                        arrayList2 = new ArrayList(arrayList);
                        if (subSequence.length() > 0) {
                            TL_iv.PageBlock S3 = S3(aVar.b);
                            e6.d(S3, subSequence);
                            arrayList2.add(0, new a(S3, aVar.c, aVar.d));
                        }
                        aVar = (a) hg.c.h(1, arrayList);
                        if (aVar != null) {
                            if (x3(aVar)) {
                                length = g6.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true).length();
                            } else {
                                TL_iv.PageBlock pageBlock = aVar.b;
                                if (((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || C3(pageBlock)) && (A3 = e6.A(aVar.b)) != null) {
                                    length = A3.length();
                                }
                            }
                            if (subSequence2.length() > 0) {
                                TL_iv.PageBlock S32 = S3(aVar3.b);
                                e6.d(S32, subSequence2);
                                arrayList2.add(new a(S32, aVar3.c, aVar3.d));
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
                        CharSequence A4 = e6.A(((a) arrayList.get(0)).b);
                        CharSequence charSequence = A4 != null ? A4 : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
                        spannableStringBuilder.append(charSequence);
                        length = spannableStringBuilder.length();
                        spannableStringBuilder.append(subSequence2);
                        e6.d(aVar.b, spannableStringBuilder);
                        while (i11 > i10) {
                            arrayList3.remove(i11);
                            i11--;
                        }
                    }
                    s4();
                    this.n3.f(false);
                    this.Y2.N(false);
                    i2Var2 = this.J3;
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
                A = e6.A(aVar.b);
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
                i2Var = this.J3;
                if (i2Var != null) {
                }
                if (arrayList.size() == 1) {
                }
                arrayList2 = new ArrayList(arrayList);
                if (subSequence.length() > 0) {
                }
                aVar = (a) hg.c.h(1, arrayList);
                if (aVar != null) {
                }
                length = 0;
                if (subSequence2.length() > 0) {
                }
                while (i11 >= i10) {
                }
                while (i15 < arrayList2.size()) {
                }
                s4();
                this.n3.f(false);
                this.Y2.N(false);
                i2Var2 = this.J3;
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
    public final boolean J3(int i10, int i11, int i12, int i13, int i14) {
        int length;
        int B;
        int y3;
        int max;
        int max2;
        if (y3()) {
            i1 I2 = I2(i11);
            return (I2 == null || (max = Math.max(0, Math.min(Math.min(i12, i14), I2.length()))) >= (max2 = Math.max(0, Math.min(Math.max(i12, i14), I2.length()))) || (i10 & I2.getCurrentStyle(max, max2)) == 0) ? false : true;
        }
        if (!G3()) {
            int i15 = i11;
            boolean z10 = false;
            while (i15 <= i13) {
                a y42 = y4(i15);
                if (y42 != null) {
                    TL_iv.PageBlock pageBlock = y42.b;
                    if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                        int i22 = i2(i15);
                        int i16 = i15 == i11 ? i12 : 0;
                        int i17 = i15 == i13 ? i14 : i22;
                        int max3 = Math.max(0, Math.min(i16, i22));
                        int max4 = Math.max(0, Math.min(i17, i22));
                        if (max3 < max4) {
                            e6 u22 = u2(i15);
                            if (u22 != null ? (u22.getStyleDelegate().getCurrentStyle(max3, max4) & i10) != 0 : g6.i(max3, max4, i10, e6.A(y4(i15).b))) {
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
        i1 j42 = j4(i11);
        if (j42 != null && (B = hg.c.B(i12, i14, (length = j42.length()), 0)) < (y3 = hg.c.y(i12, i14, length, 0)) && (i10 & j42.getCurrentStyle(B, y3)) != 0) {
        }
    }

    public final void J4(View view) {
        s4.c1 T;
        int b10;
        if (view == null || this.Z2 == null || !this.c3 || (T = T(view)) == null || (b10 = T.b()) < 0 || this.Y2.H(b10) < 0) {
            return;
        }
        this.A3 = true;
        k3 k3Var = this.n3;
        if (k3Var.y()) {
            k3Var.f(false);
        }
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        this.Z2.r(T);
    }

    public final boolean K3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i12;
        boolean z10 = false;
        while (i16 <= i14) {
            i1 N4 = N4(i11, i16);
            if (N4 != null) {
                int length = N4.length();
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
                    if ((N4.getCurrentStyle(max, max2) & i10) == 0) {
                        return false;
                    }
                    z10 = true;
                }
            }
            i16++;
        }
        return z10;
    }

    public final void K4(a aVar, u uVar, MediaController.PhotoEntry photoEntry) {
        long j3;
        b5 b5Var = (b5) this.Z3.remove(uVar);
        if (b5Var != null) {
            b5Var.b();
        }
        IdentityHashMap identityHashMap = this.a4;
        x4 x4Var = (x4) identityHashMap.remove(uVar);
        if (x4Var != null) {
            x4Var.a();
        }
        uVar.a = 1;
        uVar.f = 0.0f;
        x4 x4Var2 = new x4(this.f3, photoEntry, new i3(aVar, uVar, this));
        identityHashMap.put(uVar, x4Var2);
        if (x4Var2.f || x4Var2.h || x4Var2.n) {
            return;
        }
        x4Var2.f = true;
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
        x4Var2.d = videoEditedInfo;
        if (videoEditedInfo == null || !videoEditedInfo.needConvert()) {
            x4Var2.b();
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.id = 1;
        String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
        x4Var2.e = absolutePath;
        tL_message.attachPath = absolutePath;
        MessageObject messageObject = new MessageObject(x4Var2.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        x4Var2.c = messageObject;
        messageObject.videoEditedInfo = x4Var2.d;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(x4Var2.a);
        notificationCenter.addObserver(x4Var2, NotificationCenter.filePreparingStarted);
        notificationCenter.addObserver(x4Var2, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.addObserver(x4Var2, NotificationCenter.filePreparingFailed);
        MediaController.getInstance().scheduleVideoConvert(x4Var2.c, false, false, false);
    }

    public final boolean L3() {
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y()) {
            return false;
        }
        int i10 = k3Var.u0;
        int i11 = k3Var.x0;
        a y42 = y4(i10);
        return i10 == i11 && y42 != null && (y42.b instanceof TL_iv.pageBlockTable);
    }

    public final void L4(a aVar, u uVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.Z3;
        b5 b5Var = (b5) identityHashMap.remove(uVar);
        if (b5Var != null) {
            b5Var.b();
        }
        b5 b5Var2 = new b5(this.f3, str, z10, i10, i11, i12, new j3(aVar, uVar, this));
        identityHashMap.put(uVar, b5Var2);
        b5Var2.d();
    }

    public final void M2() {
        if (this.B3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.B3 = false;
        this.C3 = false;
        this.D3 = null;
        this.E3 = null;
        o70 o70Var = this.j4;
        if (o70Var != null) {
            this.j4 = null;
            o70Var.u();
        }
        p5 p5Var = this.i4;
        if (p5Var != null) {
            LinkedHashSet linkedHashSet = p5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var.v.invalidate();
                p5Var.t();
            }
            this.i4 = null;
        }
        this.l4 = -1;
        this.k4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean M3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += Q3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList Z2 = Z2();
        j2 j2Var = new j2();
        j2Var.d = i11;
        j2Var.b = Z2.size() + j2Var.b;
        for (int i12 = 0; i12 < Z2.size(); i12++) {
            j2.b((TL_iv.PageBlock) Z2.get(i12), 1, j2Var);
        }
        return j2Var.a <= appGlobalConfig.richMessageLengthLimit.get() && j2Var.b <= appGlobalConfig.richMessageMaxBlocks.get() && j2Var.c <= appGlobalConfig.richMessageMaxDepth.get() && j2Var.d <= appGlobalConfig.richMessageMaxMedia.get() && j2Var.e <= appGlobalConfig.richMessageMaxTableCols.get();
    }

    public final Editable M4(a aVar) {
        View z12 = z1(aVar);
        return z12 instanceof e6 ? ((e6) z12).getEditText().getText() : e6.A(aVar.b);
    }

    public final i1 N4(int i10, int i11) {
        View A4 = A4(i10);
        if (A4 instanceof p5) {
            return ((p5) A4).l(i11);
        }
        return null;
    }

    public final int[] O3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.N3.size(); i12++) {
            int length = e6.z(((a) this.N3.get(i12)).b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.N3.size() - 1;
        return new int[]{size, e6.z(((a) this.N3.get(size)).b).length()};
    }

    public final i1 P2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                return ((e6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int P3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.l3;
            if (i12 >= arrayList.size()) {
                return arrayList.size();
            }
            a aVar = (a) arrayList.get(i12);
            if (x3(aVar)) {
                i11++;
            } else if (aVar.i && i11 - 1 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public final a Q2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                e6 e6Var = (e6) childAt;
                if (e6Var.getEditText().isFocused() || (e6Var.n() && e6Var.h.isFocused())) {
                    return e6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void Q4() {
        int[] B4 = B4();
        if (B4 == null) {
            return;
        }
        int i10 = B4[0];
        int i11 = B4[1];
        if (i10 >= 0) {
            ArrayList arrayList = this.l3;
            if (i11 >= arrayList.size() || i10 > i11) {
                return;
            }
            i2 i2Var = this.J3;
            if (i2Var != null) {
                i2Var.d();
            }
            if (H3(i10, i11)) {
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    boolean z10 = aVar.i;
                    ArrayList arrayList2 = aVar.k;
                    if (!z10 && !x3(aVar)) {
                        if (e6.p(aVar.b)) {
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            pageblockparagraph.text = aVar.b.text;
                            aVar.b = pageblockparagraph;
                        } else if (!arrayList2.isEmpty()) {
                            a4.a.y(1, arrayList2);
                        }
                    }
                }
            } else {
                long a2 = q0.a();
                for (int i13 = i10; i13 <= i11; i13++) {
                    a aVar2 = (a) arrayList.get(i13);
                    boolean z11 = aVar2.i;
                    ArrayList arrayList3 = aVar2.k;
                    if (!z11 && !x3(aVar2)) {
                        if (e6.p(aVar2.b)) {
                            long a10 = q0.a();
                            TL_iv.RichText k10 = e6.k(aVar2.b);
                            if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                this.m3.put(Long.valueOf(a10), k10);
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
            x2();
            V3();
            s4();
            k3 k3Var = this.n3;
            boolean z12 = k3Var != null && k3Var.y();
            a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
            a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
            this.Y2.N(false);
            i2 i2Var2 = this.J3;
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
    public final void R1(TL_iv.PageBlock pageBlock) {
        i2 i2Var;
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.d();
        }
        a Q2 = Q2();
        if (Q2 == null) {
            Q2 = this.c4;
        }
        ArrayList arrayList = this.l3;
        int indexOf = Q2 != null ? arrayList.indexOf(Q2) : -1;
        if (indexOf >= 0 && (Q2.b instanceof TL_iv.pageBlockBlockquote)) {
            long a2 = q0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) Q2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.m3.put(Long.valueOf(a2), richText);
            }
            Q2.k.add(Long.valueOf(a2));
            Q2.b = new TL_iv.pageBlockParagraph();
        }
        boolean z10 = indexOf >= 0 && !Q2.k.isEmpty();
        if (indexOf >= 0) {
            TL_iv.PageBlock pageBlock2 = Q2.b;
            if ((pageBlock2 instanceof TL_iv.pageBlockParagraph) && Q2.g == null && e6.z(pageBlock2).isEmpty()) {
                Q2.b = pageBlock;
                this.c4 = Q2;
                if (l3(pageBlock)) {
                    int indexOf2 = arrayList.indexOf(Q2) + 1;
                    if (indexOf2 >= arrayList.size() || E3(((a) arrayList.get(indexOf2)).b)) {
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        if (z10) {
                            aVar.k.addAll(Q2.k);
                        }
                        arrayList.add(indexOf2, aVar);
                        Q2 = aVar;
                    } else {
                        Q2 = (a) arrayList.get(indexOf2);
                    }
                }
                this.Y2.N(false);
                i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.h();
                }
                post(new p2(this, Q2, 1));
            }
        }
        a aVar2 = new a(pageBlock, 0, 0);
        if (z10) {
            aVar2.k.addAll(Q2.k);
        }
        if (indexOf >= 0) {
            arrayList.add(indexOf + 1, aVar2);
        } else {
            arrayList.add(aVar2);
        }
        Q2 = aVar2;
        this.c4 = Q2;
        if (l3(pageBlock)) {
        }
        this.Y2.N(false);
        i2Var = this.J3;
        if (i2Var != null) {
        }
        post(new p2(this, Q2, 1));
    }

    public final p5 R2() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return U2((i1) findFocus);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        a aVar2;
        i2 i2Var;
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.d();
        }
        aVar.b = pageBlock;
        aVar.c = i10;
        aVar.d = i11;
        aVar.e = z10;
        aVar.f = z11;
        s4();
        boolean z12 = pageBlock instanceof TL_iv.pageBlockTable;
        if (z12) {
            int i12 = indexOf + 1;
            if (i12 >= arrayList.size() || E3(((a) arrayList.get(i12)).b)) {
                arrayList.add(i12, new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        } else if (E3(pageBlock)) {
            if (D3(pageBlock) && aVar.g == null) {
                aVar.g = new u();
            }
            int i13 = indexOf + 1;
            if (i13 >= arrayList.size() || E3(((a) arrayList.get(i13)).b)) {
                aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                arrayList.add(i13, aVar2);
            } else {
                aVar2 = (a) arrayList.get(i13);
            }
            if (aVar2 == aVar || z12 || E3(pageBlock) || !(findFocus() instanceof i1)) {
                this.Y2.N(false);
                i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.h();
                }
                post(new p2(this, aVar2, 18));
            }
            X1();
            i2 i2Var3 = this.J3;
            if (i2Var3 != null) {
                i2Var3.h();
            }
            View z13 = z1(aVar);
            if (z13 instanceof e6) {
                e6 e6Var = (e6) z13;
                e6Var.B();
                e6Var.getEditText().setSelection(e6Var.getEditText().length());
                return;
            }
            return;
        }
        aVar2 = aVar;
        if (aVar2 == aVar) {
        }
        this.Y2.N(false);
        i2Var = this.J3;
        if (i2Var != null) {
        }
        post(new p2(this, aVar2, 18));
    }

    public final TLRPC.Document S2(long j3) {
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document2;
        if (j3 == 0) {
            return null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.l3.size(); i11++) {
            for (u uVar : Q3((a) this.l3.get(i11))) {
                if (uVar != null && (document2 = uVar.h) != null && document2.id == j3) {
                    return document2;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.k3;
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
        HashMap hashMap = w4.a;
        synchronized (w4.class) {
            document = j3 != 0 ? (TLRPC.Document) w4.b.get(Long.valueOf(j3)) : null;
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
    
        r7 = r14.p4;
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
    
        r0.Y(r2, ii.g6.l((org.telegram.tgnet.tl.TL_iv.RichText) r14.m3.get(java.lang.Long.valueOf(r12))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        r0.Y(r2, ii.e6.z(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c4, code lost:
    
        if (ii.e6.p(r7.b) == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c6, code lost:
    
        r7 = ii.g6.l(ii.e6.k(r7.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01d4, code lost:
    
        if (r7.isEmpty() != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01d6, code lost:
    
        r0.B0.put(65536 + r2, org.telegram.ui.Cells.r9.Z(r7));
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
    
        if (ii.e6.p(r7.b) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0209, code lost:
    
        r7 = ii.g6.l(ii.e6.k(r7.b));
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
    
        if ((r10 instanceof org.telegram.ui.Cells.q9) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r10 = (org.telegram.ui.Cells.q9) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023f, code lost:
    
        if (r0.e0(r10) != r2) goto L149;
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
        r0.u0 = 0;
        r0.x0 = r2;
        r0.v0 = 0;
        r0.y0 = 1;
        r0.w0 = 0;
        r0.z0 = r7;
        r3.put(0, java.lang.Math.max(1, r3.get(0)));
        r3.put(r2, java.lang.Math.max(2, r3.get(r2)));
        r0.G0 = 0;
        r0.I0 = 0;
        r0.H0 = 0;
        r2 = r0.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0276, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0278, code lost:
    
        r2.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x027b, code lost:
    
        r0.V();
        r0.x();
        r0.v();
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
    
        r0.j0(0, r2);
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
    public final boolean S4() {
        p5 p5Var;
        int[] a52;
        int[] a53;
        boolean z10;
        boolean z11;
        int length;
        m0 m0Var;
        e6 e6Var;
        int k10;
        if (this.l3.isEmpty()) {
            return false;
        }
        k3 k3Var = this.n3;
        boolean y3 = k3Var.y();
        SparseIntArray sparseIntArray = k3Var.D0;
        org.telegram.ui.Cells.g gVar = k3Var.r0;
        q9 q9Var = null;
        if (y3) {
            int i10 = k3Var.u0;
            if (i10 == k3Var.x0) {
                View A4 = A4(i10);
                if ((A4 instanceof p5) && (((a52 = a5((p5Var = (p5) A4))) == null || k3Var.v0 != 0 || k3Var.w0 != 0 || k3Var.y0 != a52[0] || k3Var.z0 != a52[1]) && (a53 = a5(p5Var)) != null)) {
                    int i11 = a53[0];
                    int i12 = a53[1];
                    ArrayList arrayList = k3Var.F0;
                    int e02 = k3Var.e0(p5Var);
                    if (e02 >= 0 && (i11 != 0 || i12 != 0)) {
                        k3Var.W = p5Var;
                        k3Var.x0 = e02;
                        k3Var.u0 = e02;
                        k3Var.v0 = 0;
                        k3Var.y0 = i11;
                        k3Var.w0 = 0;
                        k3Var.z0 = i12;
                        k3Var.u = 0;
                        k3Var.v = i12;
                        k3Var.G0 = e02;
                        k3Var.I0 = 0;
                        k3Var.H0 = 0;
                        k3Var.i0(p5Var, e02);
                        arrayList.clear();
                        p5Var.fillTextLayoutBlocks(arrayList);
                        if (!arrayList.isEmpty() && arrayList.size() > 0) {
                            k3Var.a = ((ca) arrayList.get(0)).getX();
                            k3Var.b = ((ca) arrayList.get(0)).getY();
                        } else if (!arrayList.isEmpty()) {
                            k3Var.a = ((ca) arrayList.get(0)).getX();
                            k3Var.b = ((ca) arrayList.get(0)).getY();
                        }
                        da daVar = k3Var.C;
                        if (daVar != null) {
                            daVar.setVisibility(0);
                        }
                        k3Var.V();
                        k3Var.x();
                        k3Var.v();
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        w7.h0 h0Var = k3Var.D;
                        if (h0Var != null) {
                            h0Var.a(true);
                        }
                        p5Var.invalidate();
                        z10 = true;
                    }
                }
            }
            z10 = false;
        } else {
            i1 P2 = P2();
            if (P2 != 0 && P2.getText() != null && (length = P2.getText().length()) > 0) {
                p5 U2 = U2(P2);
                if (U2 != null) {
                    if (P2 == U2.getTitleEditText()) {
                        k10 = 0;
                    } else {
                        s5 o9 = U2.o(P2);
                        k10 = o9 != null ? U2.k(o9.b) : -1;
                    }
                    if (k10 >= 0) {
                        P2.setSelection(P2.getSelectionEnd());
                        z11 = k3Var.k0(U2, k10, 0, length);
                    }
                } else {
                    if (!(P2 instanceof m0)) {
                        ViewParent parent = P2.getParent();
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
                        m0Var = (m0) P2;
                    }
                    if (m0Var instanceof q9) {
                        P2.setSelection(P2.getSelectionEnd());
                        z11 = k3Var.k0((q9) m0Var, 0, 0, length);
                    } else {
                        ViewParent parent2 = P2.getParent();
                        while (true) {
                            if (parent2 == null) {
                                e6Var = null;
                                break;
                            }
                            if (parent2 instanceof e6) {
                                e6Var = (e6) parent2;
                                break;
                            }
                            parent2 = parent2.getParent();
                        }
                        if (e6Var != null) {
                            int i13 = P2 == e6Var.getAuthorEditText() ? 1 : 0;
                            P2.setSelection(P2.getSelectionEnd());
                            z11 = k3Var.k0(e6Var, i13, 0, length);
                        }
                    }
                }
            }
            z11 = false;
        }
    }

    public final void T1(a aVar, MediaController.PhotoEntry photoEntry) {
        x3 x3Var;
        if (aVar != null && D3(aVar.b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                u T3 = T3(photoEntry, str2);
                boolean c10 = x4.c(photoEntry);
                TL_iv.PageBlock pageblockvideo = (photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto();
                if (B3(aVar.b)) {
                    g3(aVar.b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(T3);
                } else {
                    u uVar = aVar.g;
                    if (uVar == null || uVar.a == 0) {
                        aVar.b = pageblockvideo;
                        aVar.g = T3;
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
                        aVar.h.add(T3);
                        aVar.g = null;
                        aVar.b = pageblockcollage;
                    }
                }
                this.Y2.N(false);
                n4(aVar);
                if (c10) {
                    K4(aVar, T3, photoEntry);
                    x3Var = this;
                } else {
                    x3Var = this;
                    x3Var.L4(aVar, T3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                i2 i2Var2 = x3Var.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
                x3Var.h3.onContentChanged();
            }
        }
    }

    public final int T2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.l3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                int i12 = 0;
                int i13 = -1;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (x3(aVar2)) {
                        i12++;
                        if (i13 == -1 && !((TL_iv.pageBlockDetails) aVar2.b).open) {
                            i13 = i12;
                        }
                    } else if (aVar2.i) {
                        if (i13 != -1 && i12 == i13) {
                            i13 = -1;
                        }
                        i12--;
                    }
                }
                if (i13 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (!E3(pageBlock) || l3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
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
    
        r1.l0(r11, r12, r13);
        r1.m0();
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
    public final boolean T4(View view, float f7, float f10) {
        int lineForVertical;
        int lineForVertical2;
        s5 m10;
        int lineForVertical3;
        if (view != 0) {
            k3 k3Var = this.n3;
            if (!k3Var.y()) {
                int left = (int) ((f7 - view.getLeft()) - getLeft());
                int top = (int) ((f10 - view.getTop()) - getTop());
                if (view instanceof e6) {
                    e6 e6Var = (e6) view;
                    i1 i1Var = e6Var.h;
                    i1 i1Var2 = e6Var.f;
                    LinearLayout linearLayout = e6Var.b;
                    if (e6.y(i1Var2, i1Var2.getLeft() + linearLayout.getLeft(), i1Var2.getTop() + linearLayout.getTop(), left, top) || (i1Var.getVisibility() == 0 && e6.y(i1Var, i1Var.getLeft(), i1Var.getTop(), left, top))) {
                        k3Var.l0(e6Var, left, top);
                        k3Var.m0();
                        return true;
                    }
                } else if (view instanceof p5) {
                    p5 p5Var = (p5) view;
                    o5 o5Var = p5Var.w;
                    b4 b4Var = p5Var.s;
                    r5 r5Var = p5Var.v;
                    TL_iv.pageTableCell m11 = p5Var.m(left, top);
                    if (m11 != null && (m10 = r5Var.m(m11)) != null) {
                        i1 i1Var3 = m10.a;
                        int scrollX = b4Var.getScrollX() + (((left - b4Var.getLeft()) - o5Var.getLeft()) - r5Var.getLeft());
                        int top2 = ((top - b4Var.getTop()) - o5Var.getTop()) - r5Var.getTop();
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
                    i1 i1Var4 = p5Var.r;
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
                        k3Var.l0(view, left, top);
                        k3Var.m0();
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
                                k3Var.l0(u0Var, left, top);
                                k3Var.m0();
                                return true;
                            }
                        }
                    }
                } else if (view instanceof r4) {
                    r4 r4Var = (r4) view;
                    if (r4Var.w != null) {
                        int[] iArr = new int[4];
                        r4Var.i(iArr);
                        if (left >= iArr[0] && left <= iArr[2] && top >= iArr[1] && top <= iArr[3]) {
                            k3Var.l0(view, left, top);
                            k3Var.m0();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void U1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage == null || (arrayList = richMessage.blocks) == null || arrayList.isEmpty()) {
            return;
        }
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        TL_iv.RichMessage richMessage2 = this.k3;
        if (richMessage2 == null) {
            this.k3 = richMessage;
        } else {
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null) {
                richMessage2.photos.addAll(arrayList2);
            }
            ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
            if (arrayList3 != null) {
                this.k3.documents.addAll(arrayList3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        W2(arrayList4, richMessage.blocks, this.m3);
        if (arrayList4.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            v4((a) arrayList4.get(i10));
        }
        ArrayList arrayList5 = this.l3;
        int size = arrayList5.size();
        a Q2 = Q2();
        if (Q2 != null && (indexOf = arrayList5.indexOf(Q2)) >= 0) {
            TL_iv.PageBlock pageBlock = Q2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && e6.z(pageBlock).isEmpty()) {
                arrayList5.remove(indexOf);
                size = indexOf;
            } else {
                size = indexOf + 1;
            }
        }
        arrayList5.addAll(size, arrayList4);
        V3();
        s4();
        this.Y2.N(false);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.onContentChanged();
        }
    }

    public final a U3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.p4;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.i) {
                if (aVar.t == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (E3(pageBlock) && !l3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                    }
                }
                return aVar;
            }
            i10 += i11;
        }
        return null;
    }

    public final void U4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null || pageBlock == null) {
            return;
        }
        ArrayList arrayList = this.l3;
        if (arrayList.indexOf(aVar2) < 0 || x3(aVar2) || aVar2.i) {
            return;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.b;
        if (pageBlock != pageBlock2 && A3(pageBlock2) && A3(pageBlock)) {
            e6 u22 = u2(arrayList.indexOf(aVar2));
            e6.d(pageBlock, u22 != null ? u22.getEditText().getText() : e6.A(aVar2.b));
            TL_iv.RichText k10 = e6.k(aVar2.b);
            if (k10 != null && e6.k(pageBlock) != null) {
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                    ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                }
            }
        }
        R4(aVar2, pageBlock, i10, i11, z10, z11);
    }

    public final a V1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.p4;
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

    public final void V2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                e6 e6Var = (e6) childAt;
                e6Var.f.n();
                e6Var.h.n();
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().n();
            }
        }
    }

    public final void V3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.l3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.k.isEmpty() && e6.p(aVar.b)) {
                long a2 = q0.a();
                TL_iv.RichText k10 = e6.k(aVar.b);
                if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                    this.m3.put(Long.valueOf(a2), k10);
                }
                aVar.k.add(Long.valueOf(a2));
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = aVar.b.text;
                aVar.b = pageblockparagraph;
            }
            i10++;
        }
    }

    public final void V4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        U4(aVar2, pageBlock, aVar2.c, aVar2.d, aVar2.e, aVar2.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0122, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r8 <= 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (H2(r8) <= 0) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        r12 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if (r12 >= r5.size()) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
    
        if (H2(r12) <= 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r13 = (ii.a) r5.get(r4);
        r7 = (ii.a) r5.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        if (r8 != r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
    
        if (x3(r13) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        if (r13.i == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        if (r9 != r6) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (x3(r7) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
    
        if (r7.i == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0130, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
    
        r10 = new java.lang.StringBuilder();
        r17 = r4;
        r18 = r6;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        if (r4 >= r25.length) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
    
        if (r4 <= 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
    
        r10.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        r10.append(r25[r4]);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r3 = r10.toString();
        r4 = r20.J3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0155, code lost:
    
        if (r4 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0157, code lost:
    
        r4.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        if (r17 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        r4 = ii.e6.z(r13.b);
        r1 = r4.substring(0, java.lang.Math.max(0, java.lang.Math.min(r1, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0173, code lost:
    
        if (r18 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0175, code lost:
    
        r4 = ii.e6.z(r7.b);
        r15 = r4.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r4.length())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018b, code lost:
    
        ii.e6.f(r13.b, r1 + r3 + r15);
        r5.subList(r8 + 1, r12).clear();
        r1 = r3.length() + r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b5, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0219, code lost:
    
        if (r5.isEmpty() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x021b, code lost:
    
        r13 = new ii.a(new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph(), r6, r6);
        r5.add(r13);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0229, code lost:
    
        s4();
        r11.f(r6);
        r14.N(r6);
        r2 = r20.J3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0234, code lost:
    
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0236, code lost:
    
        r2.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0239, code lost:
    
        post(new ii.r2(r20, r13, r1, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0242, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b7, code lost:
    
        if (r18 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        r1 = ii.e6.z(r7.b);
        r1 = r1.substring(java.lang.Math.max(0, java.lang.Math.min(r2, r1.length())));
        ii.e6.f(r7.b, r3 + r1);
        r5.subList(r8, r9).clear();
        r1 = r3.length();
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        r5.subList(r8, r12).clear();
        r1 = new org.telegram.tgnet.tl.TL_iv.pageBlockParagraph();
        Z1(r1, r3);
        r6 = 0;
        r13 = new ii.a(r1, 0, 0);
        r5.add(java.lang.Math.min(r8, r5.size()), r13);
        r1 = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0132, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W1(int i10, int i11, int i12, int i13, String[] strArr) {
        String str;
        p5 p5Var;
        i6 model;
        int max;
        int length;
        int length2;
        int i14 = i11;
        int i15 = i13;
        a y42 = y4(i10);
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y4(i12));
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf < arrayList.size() && indexOf2 < arrayList.size()) {
            a aVar = (a) arrayList.get(indexOf);
            a aVar2 = (a) arrayList.get(indexOf2);
            k3 k3Var = this.n3;
            if (indexOf == indexOf2 && x3(aVar)) {
                View z12 = z1(aVar);
                if ((z12 instanceof u0) && (aVar.b instanceof TL_iv.pageBlockDetails)) {
                    i1 editText = ((u0) z12).getEditText();
                    i2 i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
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
                    int B = hg.c.B(i14, i15, length3, 0);
                    spannableStringBuilder.replace(B, hg.c.y(i14, i15, length3, 0), (CharSequence) sb3);
                    editText.setTextSilently(spannableStringBuilder);
                    editText.invalidateEffects();
                    ((TL_iv.pageBlockDetails) aVar.b).title = g6.f(spannableStringBuilder);
                    int length4 = sb3.length() + B;
                    k3Var.f(false);
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    post(new w2(editText, length4, 0));
                    return true;
                }
            } else {
                int i17 = indexOf;
                while (true) {
                    v51 v51Var = this.Y2;
                    str = "";
                    if (i17 > indexOf2) {
                        i2 i2Var3 = this.J3;
                        if (i2Var3 != null) {
                            i2Var3.d();
                        }
                        TL_iv.PageBlock pageBlock = aVar.b;
                        boolean z10 = pageBlock instanceof TL_iv.pageBlockTable;
                        boolean z11 = aVar2.b instanceof TL_iv.pageBlockTable;
                        v3 v3Var = this.h3;
                        if (!z10 && !z11) {
                            boolean l32 = l3(pageBlock);
                            boolean l33 = l3(aVar2.b);
                            if (!l32 && !l33) {
                                if (indexOf != indexOf2 || !e6.p(aVar.b) || k3Var.v0 != 1 || k3Var.y0 != 1) {
                                    String z13 = e6.z(aVar.b);
                                    String z14 = indexOf == indexOf2 ? z13 : e6.z(aVar2.b);
                                    int max2 = Math.max(0, Math.min(i14, z13.length()));
                                    int max3 = Math.max(0, Math.min(i15, z14.length()));
                                    String substring = z13.substring(0, max2);
                                    String substring2 = z14.substring(max3);
                                    if (strArr.length <= 1) {
                                        str = strArr.length != 0 ? strArr[0] : "";
                                        e6.f(aVar.b, substring + str + substring2);
                                        if (indexOf2 > indexOf) {
                                            while (indexOf2 > indexOf) {
                                                arrayList.remove(indexOf2);
                                                indexOf2--;
                                            }
                                        }
                                        length2 = str.length() + substring.length();
                                    } else {
                                        TL_iv.PageBlock pageBlock2 = aVar.b;
                                        StringBuilder v = a4.a.v(substring);
                                        v.append(strArr[0]);
                                        e6.f(pageBlock2, v.toString());
                                        if (indexOf2 > indexOf) {
                                            while (indexOf2 > indexOf) {
                                                arrayList.remove(indexOf2);
                                                indexOf2--;
                                            }
                                        }
                                        for (int i18 = 1; i18 < strArr.length - 1; i18++) {
                                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                            Z1(pageblockparagraph, strArr[i18]);
                                            int i19 = indexOf + i18;
                                            int i20 = aVar.c;
                                            int i21 = aVar.d;
                                            if (i21 > 0) {
                                                i21 += i18;
                                            }
                                            arrayList.add(i19, new a(pageblockparagraph, i20, i21));
                                        }
                                        String str2 = strArr[strArr.length - 1];
                                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                        Z1(pageblockparagraph2, str2 + substring2);
                                        int length5 = (strArr.length + indexOf) - 1;
                                        int i22 = aVar.c;
                                        int i23 = aVar.d;
                                        if (i23 > 0) {
                                            i23 = (i23 + strArr.length) - 1;
                                        }
                                        arrayList.add(length5, new a(pageblockparagraph2, i22, i23));
                                        indexOf = (indexOf + strArr.length) - 1;
                                        length2 = str2.length();
                                    }
                                    s4();
                                    a aVar3 = (indexOf < 0 || indexOf >= arrayList.size()) ? null : (a) arrayList.get(indexOf);
                                    k3Var.f(false);
                                    v51Var.N(false);
                                    i2 i2Var4 = this.J3;
                                    if (i2Var4 != null) {
                                        i2Var4.h();
                                    }
                                    post(new r2(this, aVar3, length2, 0));
                                    return true;
                                }
                                View z15 = z1(aVar);
                                if (z15 instanceof e6) {
                                    e6 e6Var = (e6) z15;
                                    i1 authorEditText = e6Var.getAuthorEditText();
                                    i2 i2Var5 = this.J3;
                                    if (i2Var5 != null) {
                                        i2Var5.d();
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    for (int i24 = 0; i24 < strArr.length; i24++) {
                                        if (i24 > 0) {
                                            sb4.append(' ');
                                        }
                                        sb4.append(strArr[i24]);
                                    }
                                    String sb5 = sb4.toString();
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(authorEditText.getText());
                                    int length6 = spannableStringBuilder2.length();
                                    int B2 = hg.c.B(i14, i15, length6, 0);
                                    spannableStringBuilder2.replace(B2, hg.c.y(i14, i15, length6, 0), (CharSequence) sb5);
                                    authorEditText.setTextSilently(spannableStringBuilder2);
                                    authorEditText.invalidateEffects();
                                    e6Var.w();
                                    int length7 = sb5.length() + B2;
                                    k3Var.f(false);
                                    i2 i2Var6 = this.J3;
                                    if (i2Var6 != null) {
                                        i2Var6.h();
                                    }
                                    v3Var.onContentChanged();
                                    post(new w2(authorEditText, length7, 1));
                                    return true;
                                }
                            } else if (l32 && l33 && indexOf == indexOf2) {
                                KeyEvent.Callback z16 = z1(aVar);
                                if (z16 instanceof m0) {
                                    m0 m0Var = (m0) z16;
                                    i1 captionEditText = m0Var.getCaptionEditText();
                                    i2 i2Var7 = this.J3;
                                    if (i2Var7 != null) {
                                        i2Var7.d();
                                    }
                                    StringBuilder sb6 = new StringBuilder();
                                    for (int i25 = 0; i25 < strArr.length; i25++) {
                                        if (i25 > 0) {
                                            sb6.append(' ');
                                        }
                                        sb6.append(strArr[i25]);
                                    }
                                    String sb7 = sb6.toString();
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(captionEditText.getText());
                                    int length8 = spannableStringBuilder3.length();
                                    int B3 = hg.c.B(i14, i15, length8, 0);
                                    spannableStringBuilder3.replace(B3, hg.c.y(i14, i15, length8, 0), (CharSequence) sb7);
                                    captionEditText.setTextSilently(spannableStringBuilder3);
                                    captionEditText.invalidateEffects();
                                    m0Var.b();
                                    int length9 = sb7.length() + B3;
                                    k3Var.f(false);
                                    i2 i2Var8 = this.J3;
                                    if (i2Var8 != null) {
                                        i2Var8.h();
                                    }
                                    post(new w2(captionEditText, length9, 2));
                                    return true;
                                }
                            }
                        } else if (z10 && z11 && indexOf == indexOf2) {
                            int i26 = k3Var.v0;
                            int i27 = k3Var.y0;
                            View z17 = z1(aVar);
                            if ((z17 instanceof p5) && (model = (p5Var = (p5) z17).getModel()) != null) {
                                ArrayList arrayList2 = model.g;
                                if (i26 == 0 && i27 == 0) {
                                    TL_iv.PageBlock pageBlock3 = aVar.b;
                                    if (pageBlock3 instanceof TL_iv.pageBlockTable) {
                                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock3;
                                        i2 i2Var9 = this.J3;
                                        if (i2Var9 != null) {
                                            i2Var9.d();
                                        }
                                        String l4 = g6.l(pageblocktable.title);
                                        int max4 = Math.max(0, Math.min(Math.min(i14, i15), l4.length()));
                                        int max5 = Math.max(0, Math.min(Math.max(i14, i15), l4.length()));
                                        StringBuilder sb8 = new StringBuilder();
                                        for (int i28 = 0; i28 < strArr.length; i28++) {
                                            if (i28 > 0) {
                                                sb8.append(' ');
                                            }
                                            sb8.append(strArr[i28]);
                                        }
                                        String sb9 = sb8.toString();
                                        String str3 = l4.substring(0, max4) + sb9 + l4.substring(max5);
                                        TL_iv.textPlain textplain = new TL_iv.textPlain();
                                        textplain.text = str3;
                                        pageblocktable.title = textplain;
                                        i1 titleEditText = p5Var.getTitleEditText();
                                        titleEditText.setTextSilently(str3);
                                        titleEditText.invalidateEffects();
                                        int length10 = sb9.length() + max4;
                                        k3Var.f(false);
                                        i2 i2Var10 = this.J3;
                                        if (i2Var10 != null) {
                                            i2Var10.h();
                                        }
                                        v3Var.onContentChanged();
                                        post(new w2(titleEditText, length10, 4));
                                        return true;
                                    }
                                } else {
                                    int i29 = i26 - 1;
                                    int i30 = i27 - 1;
                                    int size = arrayList2.size();
                                    if (i29 >= 0 && i29 < size && i30 >= 0 && i30 < size) {
                                        i2 i2Var11 = this.J3;
                                        if (i2Var11 != null) {
                                            i2Var11.d();
                                        }
                                        if (i29 > i30 || (i29 == i30 && i14 > i15)) {
                                            i15 = i14;
                                            i14 = i15;
                                            i30 = i29;
                                            i29 = i30;
                                        }
                                        StringBuilder sb10 = new StringBuilder();
                                        for (int i31 = 0; i31 < strArr.length; i31++) {
                                            if (i31 > 0) {
                                                sb10.append('\n');
                                            }
                                            sb10.append(strArr[i31]);
                                        }
                                        String sb11 = sb10.toString();
                                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i29);
                                        TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i30);
                                        if (i29 == i30) {
                                            String g10 = i6.g(pagetablecell);
                                            max = Math.max(0, Math.min(i14, g10.length()));
                                            String str4 = g10.substring(0, max) + sb11 + g10.substring(Math.max(0, Math.min(i15, g10.length())));
                                            i6.c(pagetablecell, str4);
                                            s5 m10 = p5Var.getGrid().m(pagetablecell);
                                            if (m10 != null) {
                                                m10.a.setTextSilently(str4);
                                            }
                                            length = sb11.length();
                                        } else {
                                            String g11 = i6.g(pagetablecell);
                                            max = Math.max(0, Math.min(i14, g11.length()));
                                            String str5 = g11.substring(0, max) + sb11;
                                            i6.c(pagetablecell, str5);
                                            s5 m11 = p5Var.getGrid().m(pagetablecell);
                                            if (m11 != null) {
                                                m11.a.setTextSilently(str5);
                                            }
                                            for (int i32 = i29 + 1; i32 < i30; i32++) {
                                                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) arrayList2.get(i32);
                                                i6.c(pagetablecell3, "");
                                                s5 m12 = p5Var.getGrid().m(pagetablecell3);
                                                if (m12 != null) {
                                                    m12.a.setTextSilently("");
                                                }
                                            }
                                            String g12 = i6.g(pagetablecell2);
                                            String substring3 = g12.substring(Math.max(0, Math.min(i15, g12.length())));
                                            i6.c(pagetablecell2, substring3);
                                            s5 m13 = p5Var.getGrid().m(pagetablecell2);
                                            if (m13 != null) {
                                                m13.a.setTextSilently(substring3);
                                            }
                                            length = sb11.length();
                                        }
                                        int i33 = length + max;
                                        k3Var.f(false);
                                        i2 i2Var12 = this.J3;
                                        if (i2Var12 != null) {
                                            i2Var12.h();
                                        }
                                        post(new ai.s1(p5Var, pagetablecell, i33, 14));
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        if (((a) arrayList.get(i17)).i || x3((a) arrayList.get(i17))) {
                            break;
                        }
                        i17++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean W3(a aVar, boolean z10) {
        int i10;
        i2 i2Var;
        int indexOf = this.l3.indexOf(aVar);
        if (indexOf >= 0) {
            View z12 = z1(aVar);
            if (z12 instanceof e6) {
                e6 e6Var = (e6) z12;
                if (e6Var.getEditText().isFocused()) {
                    i10 = e6Var.getEditText().getSelectionEnd();
                    i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    if (q3(indexOf, z10, false)) {
                        s4();
                        if (findFocus() instanceof i1) {
                            X1();
                        } else {
                            this.Y2.N(false);
                        }
                        i2 i2Var2 = this.J3;
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
            i2Var = this.J3;
            if (i2Var != null) {
            }
            if (q3(indexOf, z10, false)) {
            }
        }
        return false;
    }

    public final void W4(a aVar, int i10) {
        if (aVar == null) {
            aVar = X4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            U4(aVar2, aVar2.b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.c);
        int max2 = i10 == 2 ? Math.max(1, aVar2.d) : 0;
        boolean z10 = i10 == 3;
        TL_iv.PageBlock pageBlock = aVar2.b;
        if (!(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            pageBlock = new TL_iv.pageBlockParagraph();
        }
        U4(aVar2, pageBlock, max, max2, z10, z10 && aVar2.f);
    }

    public final void X1() {
        e6 e6Var;
        a aVar;
        b6 b6Var;
        this.Y2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof e6) && (aVar = (e6Var = (e6) childAt).x) != null && (b6Var = e6Var.y) != null) {
                e6Var.g(aVar, b6Var, e6Var.E);
            }
        }
    }

    public final void X3() {
        int length;
        int B;
        int y3;
        int length2;
        int B2;
        int y10;
        int length3;
        int B3;
        int y11;
        int length4;
        int B4;
        int y12;
        i1 N4;
        int length5;
        int B5;
        int y13;
        boolean L3 = L3();
        k3 k3Var = this.n3;
        if (L3) {
            int i10 = k3Var.u0;
            int i11 = k3Var.v0;
            if (i11 == k3Var.y0 && (N4 = N4(i10, i11)) != null && (B5 = hg.c.B(k3Var.w0, k3Var.z0, (length5 = N4.length()), 0)) < (y13 = hg.c.y(k3Var.w0, k3Var.z0, length5, 0))) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (g6.h(N4.getText(), B5, y13)) {
                    g6.n(N4.getText(), B5, y13);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(B5, y13);
                N4.makeSelectedDate();
                return;
            }
            return;
        }
        if (y3()) {
            int i12 = k3Var.u0;
            i1 I2 = I2(i12);
            if (I2 != null && (B4 = hg.c.B(k3Var.w0, k3Var.z0, (length4 = I2.length()), 0)) < (y12 = hg.c.y(k3Var.w0, k3Var.z0, length4, 0))) {
                i2 i2Var3 = this.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (g6.h(I2.getText(), B4, y12)) {
                    g6.n(I2.getText(), B4, y12);
                    I2.invalidateEffects();
                    e4(i12);
                    i2 i2Var4 = this.J3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(B4, y12);
                I2.makeSelectedDate();
                return;
            }
            return;
        }
        if (w3()) {
            int i13 = k3Var.u0;
            i1 s22 = s2(i13);
            if (s22 != null && (B3 = hg.c.B(k3Var.w0, k3Var.z0, (length3 = s22.length()), 0)) < (y11 = hg.c.y(k3Var.w0, k3Var.z0, length3, 0))) {
                i2 i2Var5 = this.J3;
                if (i2Var5 != null) {
                    i2Var5.d();
                }
                if (g6.h(s22.getText(), B3, y11)) {
                    g6.n(s22.getText(), B3, y11);
                    s22.invalidateEffects();
                    d4(i13);
                    i2 i2Var6 = this.J3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(B3, y11);
                s22.makeSelectedDate();
                return;
            }
            return;
        }
        if (!G3()) {
            e6 G4 = G4();
            if (G4 != null && (B = hg.c.B(k3Var.w0, k3Var.z0, (length = G4.getEditText().length()), 0)) < (y3 = hg.c.y(k3Var.w0, k3Var.z0, length, 0))) {
                i2 i2Var7 = this.J3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (g6.h(G4.getEditText().getText(), B, y3)) {
                    g6.n(G4.getEditText().getText(), B, y3);
                    G4.getEditText().invalidateEffects();
                    G4.x();
                    i2 i2Var8 = this.J3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    o4();
                }
                G4.getEditText().setSelectionOverride(B, y3);
                G4.getEditText().makeSelectedDate();
                return;
            }
            return;
        }
        int i14 = k3Var.u0;
        i1 j42 = j4(i14);
        if (j42 != null && (B2 = hg.c.B(k3Var.w0, k3Var.z0, (length2 = j42.length()), 0)) < (y10 = hg.c.y(k3Var.w0, k3Var.z0, length2, 0))) {
            i2 i2Var9 = this.J3;
            if (i2Var9 != null) {
                i2Var9.d();
            }
            if (g6.h(j42.getText(), B2, y10)) {
                g6.n(j42.getText(), B2, y10);
                j42.invalidateEffects();
                f4(i14);
                i2 i2Var10 = this.J3;
                if (i2Var10 != null) {
                    i2Var10.h();
                }
                o4();
            }
            j42.setSelectionOverride(B2, y10);
            j42.makeSelectedDate();
        }
    }

    public final a X4() {
        k3 k3Var;
        int i10;
        a Q2 = Q2();
        return (Q2 == null && (k3Var = this.n3) != null && k3Var.y() && (i10 = k3Var.u0) == k3Var.x0) ? y4(i10) : Q2;
    }

    public final boolean Y1(int i10, int i11) {
        k3 k3Var;
        ArrayList arrayList = this.N3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] O3 = O3(max);
            int[] O32 = O3(max2);
            a aVar = (a) this.N3.get(O3[0]);
            if (O3[0] == O32[0] || max == max2) {
                View z12 = z1(aVar);
                if (z12 instanceof e6) {
                    e6 e6Var = (e6) z12;
                    e6Var.B();
                    i1 editText = e6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.min(O3[1], length), Math.min(O32[1], length));
                }
            } else {
                View z13 = z1(aVar);
                View z14 = z1(this.N3.get(O32[0]));
                if ((z13 instanceof e6) && (z14 instanceof e6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.l3;
                        int size = arrayList2.size();
                        k3Var = this.n3;
                        if (i12 >= size) {
                            break;
                        }
                        k3Var.Y(i12, e6.z(((a) arrayList2.get(i12)).b));
                        i12++;
                    }
                    e6 e6Var2 = (e6) z13;
                    int length2 = e6Var2.getEditText().length();
                    if (O3[1] >= length2) {
                        length2 = Math.max(0, length2 - 1);
                    }
                    if (!k3Var.k0(e6Var2, 0, O3[1], length2)) {
                        e6Var2.B();
                        return true;
                    }
                    k3Var.c0(0, O32[1], (e6) z14);
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList Y2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.l3;
            a aVar = (a) arrayList2.get(i15);
            boolean z11 = aVar.i;
            ArrayList arrayList3 = aVar.k;
            if (z11) {
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
                ArrayList<TL_iv.PageBlock> Y2 = Y2(i15, i16, i12 + 1, true);
                if (Y2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.m3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Y2.size() == 1 && (Y2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = Y2.get(0).text != null ? Y2.get(0).text : new TL_iv.textEmpty();
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Y2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (x3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int P3 = P3(i15);
                pageblockdetails.blocks = Y2(i15 + 1, Math.min(P3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = P3 + 1;
            } else {
                int i17 = aVar.c;
                if (i17 <= 0) {
                    J2(aVar, arrayList);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    boolean z12 = aVar.d > 0;
                    i13 = i11;
                    i14 = i12;
                    TL_iv.PageBlock k22 = k2(i15, i17, i13, i14, z12, iArr);
                    if (k22 != null) {
                        arrayList.add(k22);
                    }
                    int i18 = iArr[0];
                    i15 = i18 <= 0 ? i13 : i18;
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && z3((TL_iv.PageBlock) hg.c.h(1, arrayList))) {
                a4.a.y(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Y3(int i10) {
        i2 i2Var;
        int i11;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i12;
        int length;
        int B;
        int y3;
        int length2;
        int B2;
        int y10;
        int length3;
        int B3;
        int y11;
        i2 i2Var2;
        int i13;
        k3 k3Var = this.n3;
        if (k3Var != null && k3Var.y()) {
            boolean L3 = L3();
            v3 v3Var = this.h3;
            int i14 = 0;
            if (L3) {
                int i15 = k3Var.u0;
                int i16 = k3Var.v0;
                int i17 = k3Var.y0;
                int i18 = k3Var.w0;
                int i19 = k3Var.z0;
                boolean K3 = K3(i10, i15, i16, i18, i17, i19);
                int w22 = !K3 ? w2(i10) : 0;
                i2 i2Var3 = this.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                this.I3 = true;
                int i20 = i16;
                boolean z11 = false;
                while (i20 <= i17) {
                    i1 N4 = N4(i15, i20);
                    if (N4 == null) {
                        i13 = i16;
                    } else {
                        int length4 = N4.length();
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
                            if (K3) {
                                N4.removeStyle(i10, max, max2);
                            } else {
                                if (w22 != 0) {
                                    N4.removeStyle(w22, max, max2);
                                }
                                N4.addStyle(i10, max, max2);
                            }
                            N4.invalidateEffects();
                            N4.requestLayout();
                            g4(i15, i20);
                            z11 = true;
                        }
                    }
                    i20++;
                    i16 = i13;
                }
                this.I3 = false;
                if (z11 && (i2Var2 = this.J3) != null) {
                    i2Var2.h();
                }
                v3Var.l();
                if (z11) {
                    o4();
                }
            } else if (y3()) {
                int i24 = k3Var.u0;
                i1 I2 = I2(i24);
                if (I2 != null && (B3 = hg.c.B(k3Var.w0, k3Var.z0, (length3 = I2.length()), 0)) < (y11 = hg.c.y(k3Var.w0, k3Var.z0, length3, 0))) {
                    boolean z12 = (I2.getCurrentStyle(B3, y11) & i10) == 0;
                    i2 i2Var4 = this.J3;
                    if (i2Var4 != null) {
                        i2Var4.d();
                    }
                    this.I3 = true;
                    if (z12) {
                        int w23 = w2(i10);
                        if (w23 != 0) {
                            I2.removeStyle(w23, B3, y11);
                        }
                        I2.addStyle(i10, B3, y11);
                    } else {
                        I2.removeStyle(i10, B3, y11);
                    }
                    this.I3 = false;
                    e4(i24);
                    I2.invalidateEffects();
                    I2.requestLayout();
                    i2 i2Var5 = this.J3;
                    if (i2Var5 != null) {
                        i2Var5.h();
                    }
                    v3Var.l();
                    o4();
                }
            } else if (w3()) {
                int i25 = k3Var.u0;
                i1 s22 = s2(i25);
                if (s22 != null && (B2 = hg.c.B(k3Var.w0, k3Var.z0, (length2 = s22.length()), 0)) < (y10 = hg.c.y(k3Var.w0, k3Var.z0, length2, 0))) {
                    boolean z13 = (s22.getCurrentStyle(B2, y10) & i10) == 0;
                    int w24 = z13 ? w2(i10) : 0;
                    i2 i2Var6 = this.J3;
                    if (i2Var6 != null) {
                        i2Var6.d();
                    }
                    this.I3 = true;
                    if (z13) {
                        if (w24 != 0) {
                            s22.removeStyle(w24, B2, y10);
                        }
                        s22.addStyle(i10, B2, y10);
                    } else {
                        s22.removeStyle(i10, B2, y10);
                    }
                    s22.invalidateEffects();
                    s22.requestLayout();
                    d4(i25);
                    this.I3 = false;
                    i2 i2Var7 = this.J3;
                    if (i2Var7 != null) {
                        i2Var7.h();
                    }
                    v3Var.l();
                    o4();
                }
            } else if (G3()) {
                int i26 = k3Var.u0;
                i1 j42 = j4(i26);
                if (j42 != null && (B = hg.c.B(k3Var.w0, k3Var.z0, (length = j42.length()), 0)) < (y3 = hg.c.y(k3Var.w0, k3Var.z0, length, 0))) {
                    boolean z14 = (j42.getCurrentStyle(B, y3) & i10) == 0;
                    int w25 = z14 ? w2(i10) : 0;
                    i2 i2Var8 = this.J3;
                    if (i2Var8 != null) {
                        i2Var8.d();
                    }
                    this.I3 = true;
                    if (z14) {
                        if (w25 != 0) {
                            j42.removeStyle(w25, B, y3);
                        }
                        j42.addStyle(i10, B, y3);
                    } else {
                        j42.removeStyle(i10, B, y3);
                    }
                    j42.invalidateEffects();
                    j42.requestLayout();
                    f4(i26);
                    this.I3 = false;
                    i2 i2Var9 = this.J3;
                    if (i2Var9 != null) {
                        i2Var9.h();
                    }
                    v3Var.l();
                    o4();
                }
            } else {
                int i27 = k3Var.u0;
                int i28 = k3Var.x0;
                int i29 = k3Var.w0;
                int i30 = k3Var.z0;
                if (i27 >= 0 && i28 >= 0 && i28 >= i27 && i28 < this.p4.size()) {
                    int i31 = i10;
                    boolean J3 = J3(i31, i27, i29, i28, i30);
                    boolean z15 = !J3;
                    int w26 = !J3 ? w2(i31) : 0;
                    i2 i2Var10 = this.J3;
                    if (i2Var10 != null) {
                        i2Var10.d();
                    }
                    this.I3 = true;
                    int i32 = i27;
                    boolean z16 = false;
                    while (i32 <= i28) {
                        a y42 = y4(i32);
                        if (y42 != null) {
                            TL_iv.PageBlock pageBlock = y42.b;
                            if (A3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int i210 = i2(i32);
                                int i33 = i32 == i27 ? i29 : 0;
                                z10 = z16;
                                int i34 = i32 == i28 ? i30 : i210;
                                int max3 = Math.max(i14, Math.min(i33, i210));
                                int max4 = Math.max(i14, Math.min(i34, i210));
                                if (max3 >= max4) {
                                    i11 = w26;
                                    z16 = z10;
                                    i32++;
                                    i31 = i10;
                                    w26 = i11;
                                    i14 = 0;
                                } else {
                                    e6 u22 = u2(i32);
                                    if (u22 != null) {
                                        org.telegram.ui.ActionBar.v4 styleDelegate = u22.getStyleDelegate();
                                        if (J3) {
                                            styleDelegate.removeStyle(i31, max3, max4);
                                        } else {
                                            if (w26 != 0) {
                                                styleDelegate.removeStyle(w26, max3, max4);
                                            }
                                            styleDelegate.addStyle(i31, max3, max4);
                                        }
                                        u22.getEditText().invalidateEffects();
                                        u22.getEditText().requestLayout();
                                        u22.x();
                                        i11 = w26;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(e6.A(y42.b));
                                        if (J3 || w26 == 0) {
                                            i11 = w26;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i12 = max3;
                                        } else {
                                            i11 = w26;
                                            i12 = max3;
                                            g6.o(spannableStringBuilder2, i12, max4, i11, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        g6.o(spannableStringBuilder, i12, max4, i31, z15, null);
                                        e6.d(y42.b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i32++;
                                    i31 = i10;
                                    w26 = i11;
                                    i14 = 0;
                                }
                            }
                        }
                        i11 = w26;
                        z10 = z16;
                        z16 = z10;
                        i32++;
                        i31 = i10;
                        w26 = i11;
                        i14 = 0;
                    }
                    boolean z17 = z16;
                    this.I3 = false;
                    if (z17 && (i2Var = this.J3) != null) {
                        i2Var.h();
                    }
                    v3Var.l();
                    if (z17) {
                        o4();
                    }
                }
            }
        }
    }

    public final void Y4(float f7, float f10) {
        TL_iv.pageTableCell m10;
        p5 p5Var = this.i4;
        if (!this.B3 || p5Var == null || this.x3 != p5Var || (m10 = p5Var.m((int) ((f7 - p5Var.getLeft()) - getLeft()), (int) ((f10 - p5Var.getTop()) - getTop()))) == null || m10 == this.E3) {
            return;
        }
        this.E3 = m10;
        p5Var.w(this.D3, m10);
    }

    public final ArrayList Z2() {
        return Y2(0, this.l3.size(), 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z3(View view) {
        i1 editText;
        i1 i1Var;
        x3 x3Var;
        w3 w3Var = null;
        if (l2()) {
            boolean L3 = L3();
            k3 k3Var = this.n3;
            if (L3) {
                int i10 = k3Var.u0;
                int i11 = k3Var.v0;
                if (i11 == k3Var.y0) {
                    editText = N4(i10, i11);
                    i1Var = editText;
                    if (i1Var != null) {
                        int length = i1Var.length();
                        x3Var = this;
                        w3Var = new w3(x3Var, i1Var, hg.c.B(k3Var.w0, k3Var.z0, length, 0), hg.c.y(k3Var.w0, k3Var.z0, length, 0), null);
                    }
                }
            } else {
                if (y3()) {
                    editText = I2(k3Var.u0);
                } else if (w3()) {
                    editText = s2(k3Var.u0);
                } else if (G3()) {
                    editText = j4(k3Var.u0);
                } else {
                    e6 G4 = G4();
                    if (G4 != null) {
                        editText = G4.getEditText();
                    }
                }
                i1Var = editText;
                if (i1Var != null) {
                }
            }
            if (w3Var == null) {
                o3(false);
                x3Var.h3.d(w3Var, view);
                return;
            }
            return;
        }
        x3Var = this;
        if (w3Var == null) {
        }
    }

    public final void Z4(a aVar, String str) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (TextUtils.equals(pageblockpreformatted.language, str)) {
                    return;
                }
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                pageblockpreformatted.language = str;
                e6 u22 = u2(this.l3.indexOf(aVar));
                if (u22 != null && (aVar2 = u22.x) != null) {
                    u22.I(aVar2.b, true);
                    u22.H = null;
                    u22.C();
                }
                i2 i2Var2 = this.J3;
                if (i2Var2 != null) {
                    i2Var2.h();
                }
            }
        }
    }

    public final void a2() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList6 = this.l3;
            if (i11 >= arrayList6.size()) {
                return;
            }
            a aVar = (a) arrayList6.get(i11);
            ArrayList arrayList7 = aVar.j;
            ArrayList arrayList8 = aVar.k;
            arrayList7.clear();
            if (aVar.i) {
                if (!arrayList.isEmpty()) {
                    a4.a.y(1, arrayList);
                }
                arrayList2.clear();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
            } else {
                for (int i12 = 0; i12 < arrayList8.size(); i12++) {
                    ((Long) arrayList8.get(i12)).getClass();
                    arrayList7.add(new q0());
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    arrayList7.add((q0) arrayList.get(i13));
                }
                int max = Math.max(i10, aVar.c);
                if (max == 0) {
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                } else {
                    boolean z10 = aVar.d > 0;
                    while (arrayList2.size() > max) {
                        arrayList2.remove(arrayList2.size() - 1);
                        arrayList3.remove(arrayList3.size() - 1);
                        arrayList4.remove(arrayList4.size() - 1);
                        arrayList5.remove(arrayList5.size() - 1);
                    }
                    int i14 = 1;
                    while (i14 <= max) {
                        int i15 = i14 - 1;
                        boolean z11 = i14 == max;
                        boolean z12 = i15 < arrayList2.size();
                        if (z12 && z11) {
                            if (((Boolean) arrayList3.get(i15)).booleanValue() != z10) {
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            while (arrayList2.size() > i15) {
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList3.remove(arrayList3.size() - 1);
                                arrayList4.remove(arrayList4.size() - 1);
                                arrayList5.remove(arrayList5.size() - 1);
                            }
                            arrayList2.add(Long.valueOf(q0.a()));
                            arrayList3.add(Boolean.valueOf(z11 ? z10 : false));
                            arrayList4.add(0);
                            arrayList5.add(0L);
                        }
                        ((Long) arrayList2.get(i15)).getClass();
                        if (z11) {
                            if (((Long) arrayList5.get(i15)).longValue() == 0 || !E3(aVar.b)) {
                                arrayList4.set(i15, Integer.valueOf(((Integer) arrayList4.get(i15)).intValue() + 1));
                                arrayList5.set(i15, Long.valueOf(aVar.a));
                            } else {
                                ((Integer) arrayList4.get(i15)).getClass();
                                ((Long) arrayList5.get(i15)).getClass();
                            }
                            arrayList7.add(new q0());
                        } else {
                            ((Boolean) arrayList3.get(i15)).getClass();
                            arrayList7.add(new q0());
                        }
                        i14++;
                    }
                }
                if (x3(aVar)) {
                    boolean z13 = ((TL_iv.pageBlockDetails) aVar.b).open;
                    q0.a();
                    arrayList.add(new q0());
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                }
                if (e6.p(aVar.b)) {
                    q0.a();
                    arrayList7.add(new q0());
                }
            }
            i11++;
            i10 = 0;
        }
    }

    public final boolean a3() {
        ArrayList arrayList = this.l3;
        a aVar = arrayList.isEmpty() ? null : (a) hg.c.h(1, arrayList);
        if (aVar != null && !E3(aVar.b) && !aVar.i && !x3(aVar) && !K2(aVar.b)) {
            if (!(z1(aVar) instanceof e6)) {
                return false;
            }
            e3(aVar);
            return true;
        }
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.Y2.N(false);
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        post(new p2(this, aVar2, 21));
        return true;
    }

    public final void a4() {
        int length;
        int B;
        int y3;
        int length2;
        int B2;
        int y10;
        int length3;
        int B3;
        int y11;
        int length4;
        int B4;
        int y12;
        i1 N4;
        int length5;
        int B5;
        int y13;
        boolean L3 = L3();
        v3 v3Var = this.h3;
        k3 k3Var = this.n3;
        if (L3) {
            int i10 = k3Var.u0;
            int i11 = k3Var.v0;
            if (i11 == k3Var.y0 && (N4 = N4(i10, i11)) != null && (B5 = hg.c.B(k3Var.w0, k3Var.z0, (length5 = N4.length()), 0)) < (y13 = hg.c.y(k3Var.w0, k3Var.z0, length5, 0))) {
                if (g6.h(N4.getText(), B5, y13)) {
                    i2 i2Var = this.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    g6.n(N4.getText(), B5, y13);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var3 = this.J3;
                if (i2Var3 != null) {
                    i2Var3.d();
                }
                if (g6.g(N4.getText(), B5, y13)) {
                    g6.m(N4.getText(), B5, y13);
                    N4.invalidateEffects();
                    g4(i10, i11);
                    i2 i2Var4 = this.J3;
                    if (i2Var4 != null) {
                        i2Var4.h();
                    }
                    o4();
                }
                N4.setSelectionOverride(B5, y13);
                o3(false);
                E4(N4);
                return;
            }
            return;
        }
        if (y3()) {
            int i12 = k3Var.u0;
            i1 I2 = I2(i12);
            if (I2 != null && (B4 = hg.c.B(k3Var.w0, k3Var.z0, (length4 = I2.length()), 0)) < (y12 = hg.c.y(k3Var.w0, k3Var.z0, length4, 0))) {
                if (g6.h(I2.getText(), B4, y12)) {
                    i2 i2Var5 = this.J3;
                    if (i2Var5 != null) {
                        i2Var5.d();
                    }
                    g6.n(I2.getText(), B4, y12);
                    I2.invalidateEffects();
                    e4(i12);
                    i2 i2Var6 = this.J3;
                    if (i2Var6 != null) {
                        i2Var6.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var7 = this.J3;
                if (i2Var7 != null) {
                    i2Var7.d();
                }
                if (g6.g(I2.getText(), B4, y12)) {
                    g6.m(I2.getText(), B4, y12);
                    I2.invalidateEffects();
                    e4(i12);
                    i2 i2Var8 = this.J3;
                    if (i2Var8 != null) {
                        i2Var8.h();
                    }
                    o4();
                }
                I2.setSelectionOverride(B4, y12);
                o3(false);
                E4(I2);
                return;
            }
            return;
        }
        if (w3()) {
            int i13 = k3Var.u0;
            i1 s22 = s2(i13);
            if (s22 != null && (B3 = hg.c.B(k3Var.w0, k3Var.z0, (length3 = s22.length()), 0)) < (y11 = hg.c.y(k3Var.w0, k3Var.z0, length3, 0))) {
                if (g6.h(s22.getText(), B3, y11)) {
                    i2 i2Var9 = this.J3;
                    if (i2Var9 != null) {
                        i2Var9.d();
                    }
                    g6.n(s22.getText(), B3, y11);
                    s22.invalidateEffects();
                    d4(i13);
                    i2 i2Var10 = this.J3;
                    if (i2Var10 != null) {
                        i2Var10.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var11 = this.J3;
                if (i2Var11 != null) {
                    i2Var11.d();
                }
                if (g6.g(s22.getText(), B3, y11)) {
                    g6.m(s22.getText(), B3, y11);
                    s22.invalidateEffects();
                    d4(i13);
                    i2 i2Var12 = this.J3;
                    if (i2Var12 != null) {
                        i2Var12.h();
                    }
                    o4();
                }
                s22.setSelectionOverride(B3, y11);
                o3(false);
                E4(s22);
                return;
            }
            return;
        }
        if (!G3()) {
            e6 G4 = G4();
            if (G4 != null && (B = hg.c.B(k3Var.w0, k3Var.z0, (length = G4.getEditText().length()), 0)) < (y3 = hg.c.y(k3Var.w0, k3Var.z0, length, 0))) {
                if (g6.h(G4.getEditText().getText(), B, y3)) {
                    i2 i2Var13 = this.J3;
                    if (i2Var13 != null) {
                        i2Var13.d();
                    }
                    g6.n(G4.getEditText().getText(), B, y3);
                    G4.getEditText().invalidateEffects();
                    G4.x();
                    i2 i2Var14 = this.J3;
                    if (i2Var14 != null) {
                        i2Var14.h();
                    }
                    v3Var.l();
                    o4();
                    return;
                }
                i2 i2Var15 = this.J3;
                if (i2Var15 != null) {
                    i2Var15.d();
                }
                if (g6.g(G4.getEditText().getText(), B, y3)) {
                    g6.m(G4.getEditText().getText(), B, y3);
                    G4.getEditText().invalidateEffects();
                    G4.x();
                    i2 i2Var16 = this.J3;
                    if (i2Var16 != null) {
                        i2Var16.h();
                    }
                    o4();
                }
                G4.getEditText().setSelectionOverride(B, y3);
                o3(false);
                E4(G4.getEditText());
                return;
            }
            return;
        }
        int i14 = k3Var.u0;
        i1 j42 = j4(i14);
        if (j42 != null && (B2 = hg.c.B(k3Var.w0, k3Var.z0, (length2 = j42.length()), 0)) < (y10 = hg.c.y(k3Var.w0, k3Var.z0, length2, 0))) {
            if (g6.h(j42.getText(), B2, y10)) {
                i2 i2Var17 = this.J3;
                if (i2Var17 != null) {
                    i2Var17.d();
                }
                g6.n(j42.getText(), B2, y10);
                j42.invalidateEffects();
                f4(i14);
                i2 i2Var18 = this.J3;
                if (i2Var18 != null) {
                    i2Var18.h();
                }
                v3Var.l();
                o4();
                return;
            }
            i2 i2Var19 = this.J3;
            if (i2Var19 != null) {
                i2Var19.d();
            }
            if (g6.g(j42.getText(), B2, y10)) {
                g6.m(j42.getText(), B2, y10);
                j42.invalidateEffects();
                f4(i14);
                i2 i2Var20 = this.J3;
                if (i2Var20 != null) {
                    i2Var20.h();
                }
                o4();
            }
            j42.setSelectionOverride(B2, y10);
            o3(false);
            E4(j42);
        }
    }

    public final void b2(MessageObject messageObject) {
        TLRPC.Document document;
        if (messageObject == null || (document = messageObject.getDocument()) == null) {
            return;
        }
        i2 i2Var = this.J3;
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
        u3(aVar);
        if (z10) {
            u uVar3 = aVar.g;
            String str2 = uVar3.e;
            IdentityHashMap identityHashMap = this.Z3;
            b5 b5Var = (b5) identityHashMap.remove(uVar3);
            if (b5Var != null) {
                b5Var.b();
            }
            b5 b5Var2 = new b5(this.f3, str2, document, new h3(aVar, uVar3, this));
            identityHashMap.put(uVar3, b5Var2);
            b5Var2.d();
        }
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        this.h3.onContentChanged();
    }

    public final void b3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (!(z12 instanceof h5)) {
            c3(aVar, z10);
            return;
        }
        i1 i1Var = ((h5) z12).r;
        i1Var.r();
        i1Var.setSelection(z10 ? i1Var.length() : 0);
    }

    public final void b4() {
        i1 editText;
        Runnable l2Var;
        int length;
        final int B;
        final int y3;
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y()) {
            return;
        }
        int i10 = 1;
        int i11 = 0;
        if (L3()) {
            int i12 = k3Var.u0;
            int i13 = k3Var.v0;
            if (i13 != k3Var.y0) {
                return;
            }
            editText = N4(i12, i13);
            l2Var = new q2(this, i12, i13, 1);
        } else if (y3()) {
            int i14 = k3Var.u0;
            editText = I2(i14);
            l2Var = new k2(this, i14, 3);
        } else if (w3()) {
            int i15 = k3Var.u0;
            editText = s2(i15);
            l2Var = new k2(this, i15, i11);
        } else if (G3()) {
            int i16 = k3Var.u0;
            editText = j4(i16);
            l2Var = new k2(this, i16, i10);
        } else {
            e6 G4 = G4();
            if (G4 == null) {
                return;
            }
            editText = G4.getEditText();
            l2Var = new l2(G4, i11);
        }
        final i1 i1Var = editText;
        final Runnable runnable = l2Var;
        if (i1Var != null && (B = hg.c.B(k3Var.w0, k3Var.z0, (length = i1Var.length()), 0)) <= (y3 = hg.c.y(k3Var.w0, k3Var.z0, length, 0))) {
            Editable text = i1Var.getText();
            int i17 = t.h;
            String str = null;
            if (text != null) {
                t[] tVarArr = (t[]) text.getSpans(B, y3, t.class);
                if (tVarArr.length > 0) {
                    str = tVarArr[0].a;
                }
            }
            if (str == null) {
                str = i1Var.getText().subSequence(B, y3).toString();
            }
            final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
            int i18 = org.telegram.ui.ActionBar.h6.G6;
            org.telegram.ui.ActionBar.d6 d6Var = this.g3;
            final int v02 = org.telegram.ui.ActionBar.h6.v0(i18, d6Var);
            r.U(getContext(), str, new Utilities.Callback() { // from class: ii.y2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    t a2;
                    String str2 = (String) obj;
                    x3 x3Var = x3.this;
                    x3Var.getClass();
                    if (TextUtils.isEmpty(str2) || (a2 = t.a(str2, v02, dp)) == null) {
                        return;
                    }
                    i2 i2Var = x3Var.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    k3 k3Var2 = x3Var.n3;
                    if (k3Var2 != null) {
                        k3Var2.f(false);
                    }
                    i1 i1Var2 = i1Var;
                    i1Var2.setLocked(false);
                    SpannableString spannableString = new SpannableString(" ");
                    spannableString.setSpan(a2, 0, 1, 33);
                    Editable text2 = i1Var2.getText();
                    int max = Math.max(0, Math.min(B, text2.length()));
                    text2.replace(max, Math.max(max, Math.min(y3, text2.length())), spannableString);
                    runnable.run();
                    i2 i2Var2 = x3Var.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var.h3.onContentChanged();
                    int min = Math.min(max + 1, i1Var2.length());
                    i1Var2.r();
                    x3Var.post(new w2(i1Var2, min, 3));
                }
            }, d6Var);
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
    public final void b5(CharSequence charSequence) {
        String str;
        ClipboardManager clipboardManager;
        int i10;
        int i11;
        int i12;
        int i13;
        k3 k3Var = this.n3;
        a y42 = y4(k3Var.u0);
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y4(k3Var.x0));
        int i14 = k3Var.w0;
        int i15 = k3Var.z0;
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
                    HashMap hashMap = this.m3;
                    StringBuilder sb2 = new StringBuilder();
                    d7.c cVar = new d7.c(1);
                    e4.F(sb2, arrayList, new int[]{i11}, i12, i11, i12, i13, i10, cVar, false, 0, hashMap);
                    cVar.b(sb2);
                    str = sb2.toString();
                    if (!TextUtils.isEmpty(str)) {
                        w4.a(A2(i11, i12), z2(i11, i12));
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
                HashMap hashMap2 = this.m3;
                StringBuilder sb22 = new StringBuilder();
                d7.c cVar2 = new d7.c(1);
                e4.F(sb22, arrayList, new int[]{i11}, i12, i11, i12, i13, i10, cVar2, false, 0, hashMap2);
                cVar2.b(sb22);
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

    public final void c2(String str) {
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
            d2(tL_document, str);
        }
    }

    public final void c3(a aVar, boolean z10) {
        View z12 = z1(aVar);
        if (!(z12 instanceof p5)) {
            if (z10 && (z12 instanceof e6)) {
                e6 e6Var = (e6) z12;
                if (e6Var.n()) {
                    e6Var.i();
                    return;
                }
            }
            i1 R3 = R3(z12);
            if (R3 == null) {
                d3(aVar);
                return;
            }
            R3.r();
            if (z10) {
                R3.setSelection(R3.length());
                return;
            }
            return;
        }
        p5 p5Var = (p5) z12;
        i1 i1Var = p5Var.r;
        i6 i6Var = p5Var.F;
        if (i6Var == null) {
            return;
        }
        if (!z10) {
            i1Var.r();
            i1Var.setSelection(0);
        } else {
            if (i6Var.g.isEmpty()) {
                return;
            }
            s5 m10 = p5Var.v.m((TL_iv.pageTableCell) hg.c.h(1, p5Var.F.g));
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
    public final void c4() {
        ClipData primaryClip;
        String str;
        boolean isEmpty;
        x3 x3Var;
        HashMap hashMap;
        ArrayList w42;
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
            k3 k3Var = this.n3;
            if (!isEmpty) {
                try {
                    hashMap = new HashMap();
                    w42 = w4(e4.z(str, hashMap));
                } catch (Exception e) {
                    e = e;
                    x3Var = this;
                }
                if (!w42.isEmpty()) {
                    ArrayList arrayList = this.l3;
                    x3Var = this;
                    try {
                        if (x3Var.I4(arrayList.indexOf(y4(k3Var.u0)), arrayList.indexOf(y4(k3Var.x0)), k3Var.w0, k3Var.z0, w42)) {
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            x3Var.m3.putAll(hashMap);
                            return;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e);
                        coerceToText = itemAt.coerceToText(getContext());
                        if (coerceToText == null) {
                        }
                        x3Var.W1(k3Var.u0, k3Var.w0, k3Var.x0, k3Var.z0, coerceToText.toString().split("\n", -1));
                    }
                    coerceToText = itemAt.coerceToText(getContext());
                    if (coerceToText == null) {
                        coerceToText = "";
                    }
                    x3Var.W1(k3Var.u0, k3Var.w0, k3Var.x0, k3Var.z0, coerceToText.toString().split("\n", -1));
                }
            }
            x3Var = this;
            coerceToText = itemAt.coerceToText(getContext());
            if (coerceToText == null) {
            }
            x3Var.W1(k3Var.u0, k3Var.w0, k3Var.x0, k3Var.z0, coerceToText.toString().split("\n", -1));
        }
        str = null;
        isEmpty = TextUtils.isEmpty(str);
        k3 k3Var2 = this.n3;
        if (!isEmpty) {
        }
        x3Var = this;
        coerceToText = itemAt.coerceToText(getContext());
        if (coerceToText == null) {
        }
        x3Var.W1(k3Var2.u0, k3Var2.w0, k3Var2.x0, k3Var2.z0, coerceToText.toString().split("\n", -1));
    }

    public final void d2(TLRPC.Document document, String str) {
        if (document == null) {
            return;
        }
        i2 i2Var = this.J3;
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
            if (TextUtils.isEmpty(str) || !w.c.p(str)) {
                return;
            }
            u uVar2 = aVar.g;
            uVar2.h = document;
            uVar2.e = str;
            uVar2.a = 1;
            uVar2.f = 0.0f;
        }
        u3(aVar);
        if (z10) {
            u uVar3 = aVar.g;
            IdentityHashMap identityHashMap = this.Z3;
            b5 b5Var = (b5) identityHashMap.remove(uVar3);
            if (b5Var != null) {
                b5Var.b();
            }
            b5 b5Var2 = new b5(this.f3, str, document, new g3(this, uVar3, aVar, str));
            identityHashMap.put(uVar3, b5Var2);
            b5Var2.d();
        }
        i2 i2Var2 = this.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        this.h3.onContentChanged();
    }

    public final void d3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            ((e6) z12).B();
        } else if (z12 instanceof u0) {
            ((u0) z12).d.r();
        }
    }

    public final void d4(int i10) {
        KeyEvent.Callback A4 = A4(i10);
        if (A4 instanceof m0) {
            ((m0) A4).b();
        }
    }

    @Override // org.telegram.ui.Components.d61, org.telegram.ui.Components.ml0, android.view.ViewGroup, android.view.View
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
                arrayList = this.p4;
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
                if (this.q4 == null) {
                    tl0 tl0Var = new tl0(this);
                    this.q4 = tl0Var;
                    tl0Var.a(null, null, null, this.g3, 1);
                    o8.a(this.q4, this.g3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j3 = 0;
                    float f11 = 0.0f;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar5 = null;
                    a aVar6 = null;
                    float f12 = 1.0f;
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
                            f7 = f12;
                        } else {
                            int k42 = k4(i15, aVar5, true);
                            l10 = l4;
                            int k43 = k4(i15, aVar6, false);
                            if (f11 - f10 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.z0.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, k42 + f10, B, f11 - k43);
                                    aVar2 = aVar5;
                                    aVar3 = aVar6;
                                    this.q4.b(canvas, rectF, floor, floor, floor, f12);
                                    f7 = f12;
                                    this.q4.e(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar5;
                            aVar3 = aVar6;
                            f7 = f12;
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
                                f11 = -3.4028235E38f;
                                aVar5 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            }
                            if (aVar == null || aVar != this.S3) {
                                float y3 = view.getY();
                                float height = view.getHeight() + y3;
                                if (y3 < f10) {
                                    f10 = y3;
                                }
                                if (height > f11) {
                                    f11 = height;
                                }
                                f12 = Math.min(f7, view.getAlpha());
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
                        f12 = f7;
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

    public final void e2(Uri uri) {
        if (uri == null) {
            return;
        }
        a aVar = this.b4;
        String str = null;
        this.b4 = null;
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
        int i10 = this.r4;
        this.r4 = i10 - 1;
        Utilities.globalQueue.postRunnable(new s2(this, uri, startsWith, str2, i10, aVar));
    }

    public final void e3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            e6 e6Var = (e6) z12;
            e6Var.B();
            i1 editText = e6Var.getEditText();
            editText.setSelection(editText.length());
            return;
        }
        if (z12 instanceof u0) {
            u0 u0Var = (u0) z12;
            u0Var.d.r();
            i1 editText2 = u0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void e4(int i10) {
        a y42 = y4(i10);
        i1 I2 = I2(i10);
        if (!x3(y42) || I2 == null) {
            return;
        }
        ((TL_iv.pageBlockDetails) y42.b).title = g6.f(I2.getText());
    }

    public final void f2(MediaController.PhotoEntry photoEntry) {
        x3 x3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        i2 i2Var = this.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        boolean c10 = x4.c(photoEntry);
        a aVar = new a((photoEntry.isVideo || c10) ? new TL_iv.pageBlockVideo() : new TL_iv.pageBlockPhoto(), 0, 0);
        aVar.g = T3(photoEntry, str2);
        u3(aVar);
        if (c10) {
            K4(aVar, aVar.g, photoEntry);
            x3Var = this;
        } else {
            x3Var = this;
            x3Var.L4(aVar, aVar.g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.h3.onContentChanged();
    }

    public final void f3(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof e6) {
            e6 e6Var = (e6) z12;
            e6Var.B();
            e6Var.getEditText().setSelection(0);
        } else if (z12 instanceof u0) {
            u0 u0Var = (u0) z12;
            u0Var.d.r();
            u0Var.getEditText().setSelection(0);
        }
    }

    public final void f4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof e6) {
            ((e6) A4).w();
        }
    }

    public final void g2(p5 p5Var) {
        p5 p5Var2 = this.i4;
        if (p5Var2 != null && p5Var2 != p5Var) {
            LinkedHashSet linkedHashSet = p5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var2.v.invalidate();
                p5Var2.t();
            }
        }
        this.i4 = p5Var;
        this.C3 = false;
        this.l4 = -1;
        this.k4 = -1;
        p5Var.setCellSelectionListener(this.m4);
        k3 k3Var = this.n3;
        if (k3Var != null && k3Var.y()) {
            k3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void g4(int i10, int i11) {
        s5 m10;
        View A4 = A4(i10);
        if (A4 instanceof p5) {
            p5 p5Var = (p5) A4;
            if (i11 == 0) {
                p5Var.u();
                return;
            }
            TL_iv.pageTableCell h = p5Var.h(i11);
            if (h == null || (m10 = p5Var.getGrid().m(h)) == null) {
                return;
            }
            i6.d(h, m10.a.getText());
        }
    }

    public i1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof i1) {
            return (i1) findFocus;
        }
        return null;
    }

    public n4 getMapDelegate() {
        return this.d4;
    }

    public View getOverlayView() {
        return this.o3;
    }

    public r9 getTextSelectionHelper() {
        return this.n3;
    }

    public final o3 h2() {
        int i10;
        int i11;
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y() || G3()) {
            return null;
        }
        a y42 = y4(k3Var.u0);
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(y42);
        int indexOf2 = arrayList.indexOf(y4(k3Var.x0));
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
            if (aVar.i || x3(aVar)) {
                return null;
            }
        }
        return new o3(this, i10, i11, k3Var.w0, k3Var.z0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x056f, code lost:
    
        if (r0 != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x08ed, code lost:
    
        if (r6 == false) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x06b1, code lost:
    
        if (r3 < (r5.getLineCount() - 1)) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x072c, code lost:
    
        r13 = r4.getRow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07a8, code lost:
    
        if (r15.getLineForOffset(r6.getEditText().getSelectionEnd()) >= (r15.getLineCount() - 1)) goto L540;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02c4, code lost:
    
        if (r3 < r14.size()) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x048b, code lost:
    
        if (r3 < r14.size()) goto L332;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:600:0x052f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0174 A[LOOP:0: B:128:0x016e->B:130:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x092c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h3(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        View findFocus;
        p5 U2;
        int i10;
        p5 p5Var;
        h5 h5Var;
        a aVar;
        int indexOf;
        boolean z12;
        i1 R3;
        Layout layout;
        Layout layout2;
        int i11;
        final float primaryHorizontal;
        a U3;
        int i12;
        boolean z13;
        int i13;
        int i14;
        int i42;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean c02;
        Layout layout3;
        int i19;
        int length;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int max;
        a Q2;
        int indexOf2;
        boolean z14;
        int i25;
        int i26;
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
        k3 k3Var = this.n3;
        boolean y3 = k3Var.y();
        if (isCtrlPressed && !isAltPressed && (i2Var = this.J3) != null) {
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
            int i27 = 4;
            if (isShiftPressed) {
                if (keyCode != 41) {
                    if (keyCode != 44) {
                        if (keyCode == 47 || keyCode == 52) {
                            i27 = 8;
                        }
                        i27 = 0;
                    } else {
                        i27 = 256;
                    }
                }
                z15 = false;
            } else {
                if (keyCode == 30) {
                    i27 = 1;
                } else if (keyCode != 33) {
                    if (keyCode == 37) {
                        i27 = 2;
                    } else if (keyCode != 39) {
                        if (keyCode == 49) {
                            i27 = 16;
                        }
                        i27 = 0;
                    } else {
                        i27 = 0;
                        z15 = true;
                    }
                }
                z15 = false;
            }
            if (z15) {
                a4();
                return true;
            }
            if (i27 != 0) {
                Y3(i27);
                return true;
            }
        }
        if (keyCode == 111 && y3) {
            k3Var.f(false);
            return true;
        }
        if (y3) {
            if (isCtrlPressed && !isShiftPressed && keyCode == 31) {
                CharSequence s10 = k3Var.s();
                if (s10 != null && s10.length() != 0) {
                    b5(s10);
                    return true;
                }
                return true;
            }
            if (isCtrlPressed && !isShiftPressed && keyCode == 52) {
                CharSequence s11 = k3Var.s();
                if (s11 != null && s11.length() > 0) {
                    b5(s11);
                }
                E2();
                return true;
            }
            if (isCtrlPressed && keyCode == 50) {
                c4();
                return true;
            }
            if (keyCode == 67 || keyCode == 112) {
                E2();
                return true;
            }
            if (keyCode == 66) {
                t4("\n");
                return true;
            }
            if (!isCtrlPressed && !isAltPressed && (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) >= 32) {
                t4(String.valueOf((char) unicodeChar));
                return true;
            }
        }
        ArrayList arrayList = this.l3;
        if (!y3 && isShiftPressed && v3(keyCode) && (Q2 = Q2()) != null && (indexOf2 = arrayList.indexOf(Q2)) >= 0) {
            View z16 = z1(Q2);
            if (z16 instanceof e6) {
                e6 e6Var = (e6) z16;
                i1 editText = e6Var.getEditText();
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
                                    for (i26 = 0; i26 < arrayList.size(); i26++) {
                                        k3Var.Y(i26, e6.z(((a) arrayList.get(i26)).b));
                                    }
                                    if (length2 != 0) {
                                        int max2 = Math.max(0, Math.min(editText.getSelectionStart(), length2));
                                        if (z14) {
                                            if (max2 >= length2) {
                                                length2--;
                                            }
                                            if (k3Var.k0(e6Var, 0, max2, length2)) {
                                                KeyEvent.Callback z17 = z1(aVar2);
                                                if (z17 instanceof q9) {
                                                    k3Var.c0(0, 0, (q9) z17);
                                                    return true;
                                                }
                                                u0(i25);
                                                post(new p2(this, aVar2, 14));
                                                return true;
                                            }
                                        } else if (k3Var.k0(e6Var, 0, max2, max2 > 0 ? 0 : 1)) {
                                            KeyEvent.Callback z18 = z1(aVar2);
                                            if (z18 instanceof q9) {
                                                k3Var.c0(0, z18 instanceof e6 ? ((e6) z18).getEditText().length() : 0, (q9) z18);
                                                return true;
                                            }
                                            u0(i25);
                                            post(new p2(this, aVar2, 15));
                                            return true;
                                        }
                                    }
                                    if (!y3 && isShiftPressed && v3(keyCode)) {
                                        boolean z19 = isCtrlPressed || isAltPressed;
                                        int i28 = k3Var.G0;
                                        int i29 = k3Var.I0;
                                        int i30 = k3Var.H0;
                                        int i31 = k3Var.u0;
                                        int i32 = k3Var.v0;
                                        int i33 = k3Var.w0;
                                        int i34 = k3Var.x0;
                                        boolean z20 = z19;
                                        int i35 = k3Var.y0;
                                        int i36 = k3Var.z0;
                                        if (i28 == i31 && i29 == i32 && i30 == i33) {
                                            i31 = i34;
                                            i32 = i35;
                                        } else {
                                            i36 = i33;
                                        }
                                        View A4 = A4(i31);
                                        if (A4 != null) {
                                            if (!(A4 instanceof p5)) {
                                                z10 = isCtrlPressed;
                                                z11 = isAltPressed;
                                                if (A4 instanceof e6) {
                                                    Layout layout4 = ((e6) A4).getEditText().getLayout();
                                                    if (layout4 != null) {
                                                        CharSequence text = layout4.getText();
                                                        int length3 = text.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset = layout4.getLineForOffset(i36) - 1;
                                                                if (lineForOffset >= 0) {
                                                                    i13 = layout4.getOffsetForHorizontal(lineForOffset, layout4.getPrimaryHorizontal(i36));
                                                                    i15 = i31;
                                                                    break;
                                                                } else {
                                                                    i14 = i31 - 1;
                                                                    if (i14 >= 0) {
                                                                        i42 = i4(i14);
                                                                        int i37 = i42;
                                                                        i15 = i14;
                                                                        i13 = i37;
                                                                        break;
                                                                    } else {
                                                                        i15 = i31;
                                                                        i13 = 0;
                                                                        break;
                                                                    }
                                                                }
                                                            case 20:
                                                                int lineForOffset2 = layout4.getLineForOffset(i36) + 1;
                                                                if (lineForOffset2 < layout4.getLineCount()) {
                                                                    i13 = layout4.getOffsetForHorizontal(lineForOffset2, layout4.getPrimaryHorizontal(i36));
                                                                } else {
                                                                    int i38 = i31 + 1;
                                                                    if (i38 < arrayList.size()) {
                                                                        i15 = i38;
                                                                        i13 = 0;
                                                                        break;
                                                                    } else {
                                                                        i13 = length3;
                                                                    }
                                                                }
                                                                i15 = i31;
                                                                break;
                                                            case 21:
                                                                if (z20) {
                                                                    BreakIterator wordInstance = BreakIterator.getWordInstance();
                                                                    wordInstance.setText(text.toString());
                                                                    int preceding = wordInstance.preceding(Math.max(0, Math.min(i36, text.length())));
                                                                    i13 = preceding == -1 ? 0 : preceding;
                                                                } else {
                                                                    i13 = Math.max(0, i36 - 1);
                                                                }
                                                                if (i13 == i36 && i36 <= 0 && i31 - 1 >= 0) {
                                                                    i13 = i4(i15);
                                                                    break;
                                                                }
                                                                i15 = i31;
                                                                break;
                                                            case 22:
                                                                if (z20) {
                                                                    BreakIterator wordInstance2 = BreakIterator.getWordInstance();
                                                                    wordInstance2.setText(text.toString());
                                                                    i13 = wordInstance2.following(Math.min(i36, text.length()));
                                                                    if (i13 == -1) {
                                                                        i13 = text.length();
                                                                    }
                                                                } else {
                                                                    i13 = Math.min(length3, i36 + 1);
                                                                }
                                                                if (i13 == i36) {
                                                                    if (i36 >= length3) {
                                                                        i15 = i31 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i15 = i31;
                                                                break;
                                                            default:
                                                                i13 = i36;
                                                                i15 = i31;
                                                                break;
                                                        }
                                                        i16 = i13;
                                                        i17 = i15;
                                                        i18 = i32;
                                                    }
                                                    c02 = false;
                                                    break;
                                                } else {
                                                    if ((A4 instanceof y0) || (A4 instanceof v4) || (A4 instanceof z) || (A4 instanceof p4) || (A4 instanceof r4)) {
                                                        switch (keyCode) {
                                                            case 19:
                                                            case 21:
                                                                i14 = i31 - 1;
                                                                if (i14 >= 0) {
                                                                    i42 = i4(i14);
                                                                    int i372 = i42;
                                                                    i15 = i14;
                                                                    i13 = i372;
                                                                    break;
                                                                }
                                                                i13 = i36;
                                                                i15 = i31;
                                                                break;
                                                            case 20:
                                                            case 22:
                                                                int i39 = i31 + 1;
                                                                if (i39 < arrayList.size()) {
                                                                    i15 = i39;
                                                                    i13 = 0;
                                                                    break;
                                                                }
                                                                i13 = i36;
                                                                i15 = i31;
                                                                break;
                                                            default:
                                                                i13 = i36;
                                                                i15 = i31;
                                                                break;
                                                        }
                                                        i16 = i13;
                                                        i17 = i15;
                                                        i18 = i32;
                                                    }
                                                    c02 = false;
                                                }
                                                return true;
                                            }
                                            p5 p5Var2 = (p5) A4;
                                            i6 model = p5Var2.getModel();
                                            if (model != null) {
                                                ArrayList arrayList2 = model.g;
                                                if (!arrayList2.isEmpty()) {
                                                    int size = arrayList2.size() + 1;
                                                    int i40 = (i32 < 0 || i32 >= size) ? 0 : i32;
                                                    i1 l4 = p5Var2.l(i40);
                                                    if (l4 != null) {
                                                        Layout layout5 = l4.getLayout();
                                                        z10 = isCtrlPressed;
                                                        layout3 = layout5;
                                                    } else {
                                                        z10 = isCtrlPressed;
                                                        layout3 = null;
                                                    }
                                                    if (layout3 != null) {
                                                        CharSequence text2 = layout3.getText();
                                                        z11 = isAltPressed;
                                                        int length4 = text2.length();
                                                        switch (keyCode) {
                                                            case 19:
                                                                int lineForOffset3 = layout3.getLineForOffset(i36) - 1;
                                                                if (lineForOffset3 >= 0) {
                                                                    length = layout3.getOffsetForHorizontal(lineForOffset3, layout3.getPrimaryHorizontal(i36));
                                                                } else if (i40 == 0) {
                                                                    i21 = i31 - 1;
                                                                    if (i21 >= 0) {
                                                                        length = i4(i21);
                                                                        i32 = 0;
                                                                        break;
                                                                    }
                                                                    i21 = i31;
                                                                    length = 0;
                                                                    break;
                                                                } else {
                                                                    int i41 = i40 - 1;
                                                                    if (i41 >= 0 && i41 < arrayList2.size()) {
                                                                        TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) arrayList2.get(i41);
                                                                        int b10 = model.b(pagetablecell);
                                                                        int a2 = model.a(pagetablecell);
                                                                        int i43 = b10 - 1;
                                                                        if (i43 >= 0) {
                                                                            i19 = arrayList2.indexOf(model.d[i43][Math.min(a2, model.c - 1)]);
                                                                            if (i19 < 0) {
                                                                                i20 = i19 + 1;
                                                                                i1 l10 = p5Var2.l(i20);
                                                                                Layout layout6 = l10 != null ? l10.getLayout() : null;
                                                                                length = layout6 != null ? layout6.getText().length() : 0;
                                                                            } else {
                                                                                length = p5Var2.getTitleEditText().length();
                                                                                i20 = 0;
                                                                            }
                                                                            i32 = i20;
                                                                        }
                                                                    }
                                                                    i19 = -1;
                                                                    if (i19 < 0) {
                                                                    }
                                                                    i32 = i20;
                                                                }
                                                                i21 = i31;
                                                                break;
                                                            case 20:
                                                                int lineForOffset4 = layout3.getLineForOffset(i36) + 1;
                                                                int i44 = length4;
                                                                if (lineForOffset4 < layout3.getLineCount()) {
                                                                    length = layout3.getOffsetForHorizontal(lineForOffset4, layout3.getPrimaryHorizontal(i36));
                                                                    i21 = i31;
                                                                    break;
                                                                } else {
                                                                    if (i40 == 0) {
                                                                        if (size > 1) {
                                                                            i21 = i31;
                                                                            length = 0;
                                                                            i32 = 1;
                                                                            break;
                                                                        } else {
                                                                            i21 = i31 + 1;
                                                                            if (i21 >= arrayList.size()) {
                                                                                i21 = i31;
                                                                            }
                                                                            length = 0;
                                                                            i32 = 0;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        int i45 = i40 - 1;
                                                                        if (i45 < 0 || i45 >= arrayList2.size()) {
                                                                            i22 = 1;
                                                                        } else {
                                                                            TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) arrayList2.get(i45);
                                                                            int b11 = model.b(pagetablecell2);
                                                                            int a10 = model.a(pagetablecell2);
                                                                            i22 = 1;
                                                                            int max3 = Math.max(1, i6.o(pagetablecell2)) + b11;
                                                                            if (max3 < model.b) {
                                                                                i23 = arrayList2.indexOf(model.d[max3][Math.min(a10, model.c - 1)]);
                                                                                if (i23 < 0) {
                                                                                    i24 = i23 + i22;
                                                                                    i21 = i31;
                                                                                } else {
                                                                                    int i46 = i31 + 1;
                                                                                    if (i46 < arrayList.size()) {
                                                                                        i21 = i46;
                                                                                        i24 = 0;
                                                                                    } else {
                                                                                        i21 = i31;
                                                                                        i24 = i32;
                                                                                        i32 = i24;
                                                                                    }
                                                                                }
                                                                                i44 = 0;
                                                                                i32 = i24;
                                                                            }
                                                                        }
                                                                        i23 = -1;
                                                                        if (i23 < 0) {
                                                                        }
                                                                        i44 = 0;
                                                                        i32 = i24;
                                                                    }
                                                                    length = i44;
                                                                    break;
                                                                }
                                                            case 21:
                                                                if (z20) {
                                                                    BreakIterator wordInstance3 = BreakIterator.getWordInstance();
                                                                    wordInstance3.setText(text2.toString());
                                                                    int preceding2 = wordInstance3.preceding(Math.max(0, Math.min(i36, text2.length())));
                                                                    max = preceding2 == -1 ? 0 : preceding2;
                                                                } else {
                                                                    max = Math.max(0, i36 - 1);
                                                                }
                                                                if (max == i36 && i36 <= 0) {
                                                                    int i47 = i40 - 1;
                                                                    if (i47 >= 0) {
                                                                        i1 l11 = p5Var2.l(i47);
                                                                        Layout layout7 = l11 != null ? l11.getLayout() : null;
                                                                        length = layout7 != null ? layout7.getText().length() : 0;
                                                                        i32 = i47;
                                                                        i21 = i31;
                                                                        break;
                                                                    } else {
                                                                        int i48 = i31 - 1;
                                                                        if (i48 >= 0) {
                                                                            i21 = i48;
                                                                            length = i4(i48);
                                                                            i32 = 0;
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                length = max;
                                                                i21 = i31;
                                                            case 22:
                                                                if (z20) {
                                                                    BreakIterator wordInstance4 = BreakIterator.getWordInstance();
                                                                    wordInstance4.setText(text2.toString());
                                                                    length = wordInstance4.following(Math.min(i36, text2.length()));
                                                                    if (length == -1) {
                                                                        length = text2.length();
                                                                    }
                                                                } else {
                                                                    length = Math.min(length4, i36 + 1);
                                                                }
                                                                if (length == i36 && i36 >= length4) {
                                                                    int i49 = i40 + 1;
                                                                    if (i49 < size) {
                                                                        i32 = i49;
                                                                        i21 = i31;
                                                                        length = 0;
                                                                        break;
                                                                    } else {
                                                                        i21 = i31 + 1;
                                                                        break;
                                                                    }
                                                                }
                                                                i21 = i31;
                                                                break;
                                                            default:
                                                                length = i36;
                                                                i21 = i31;
                                                                break;
                                                        }
                                                        i16 = length;
                                                        i17 = i21;
                                                        i18 = i32;
                                                        i32 = i40;
                                                    }
                                                }
                                            }
                                            z10 = isCtrlPressed;
                                            if (i17 != i31 || i18 != i32 || i16 != i36) {
                                                if (i17 != i31) {
                                                    u0(i17);
                                                }
                                                KeyEvent.Callback A42 = A4(i17);
                                                if (A42 instanceof q9) {
                                                    c02 = k3Var.c0(i18, i16, (q9) A42);
                                                    break;
                                                } else {
                                                    post(new ci.b0(this, i17, i18, i16, 1));
                                                }
                                            }
                                            c02 = true;
                                            break;
                                        } else {
                                            z10 = isCtrlPressed;
                                        }
                                        z11 = isAltPressed;
                                        c02 = false;
                                    } else {
                                        z10 = isCtrlPressed;
                                        z11 = isAltPressed;
                                    }
                                    if (!y3 && !isShiftPressed && !z10 && !z11 && v3(keyCode)) {
                                        boolean z21 = keyCode == 22 || keyCode == 20;
                                        this.p3 = z21 ? k3Var.x0 : k3Var.u0;
                                        this.q3 = z21 ? k3Var.z0 : k3Var.w0;
                                        this.r3 = z21 ? k3Var.y0 : k3Var.v0;
                                        k3Var.f(false);
                                        return true;
                                    }
                                    if (z10 || keyCode != 29 || (!k3Var.b0() && !S4())) {
                                        if (!y3 && !isShiftPressed && !z10 && !z11 && (keyCode == 20 || keyCode == 19)) {
                                            boolean z22 = keyCode != 20;
                                            i10 = 0;
                                            while (true) {
                                                if (i10 >= getChildCount()) {
                                                    View childAt = getChildAt(i10);
                                                    if (childAt instanceof p5) {
                                                        p5Var = (p5) childAt;
                                                        if (p5Var.getTitleEditText().isFocused()) {
                                                        }
                                                    }
                                                    i10++;
                                                } else {
                                                    p5Var = null;
                                                }
                                            }
                                            v51 v51Var = this.Y2;
                                            if (p5Var == null) {
                                                int indexOf3 = arrayList.indexOf(p5Var.getRow());
                                                if (indexOf3 >= 0) {
                                                    if (!z22) {
                                                        int T2 = T2(indexOf3 - 1, -1);
                                                        if (T2 >= 0) {
                                                            post(new p2(this, (a) arrayList.get(T2), 5));
                                                        }
                                                    } else if (!p5Var.r()) {
                                                        int T22 = T2(indexOf3 + 1, 1);
                                                        if (T22 < 0) {
                                                            a aVar3 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                            arrayList.add(aVar3);
                                                            v51Var.N(false);
                                                            post(new p2(this, aVar3, 2));
                                                        } else {
                                                            post(new p2(this, (a) arrayList.get(T22), 4));
                                                        }
                                                    }
                                                    z13 = true;
                                                    break;
                                                }
                                                z13 = false;
                                                break;
                                            } else {
                                                int i50 = 0;
                                                while (true) {
                                                    if (i50 < getChildCount()) {
                                                        View childAt2 = getChildAt(i50);
                                                        if (childAt2 instanceof h5) {
                                                            h5Var = (h5) childAt2;
                                                            if (h5Var.r.isFocused()) {
                                                            }
                                                        }
                                                        i50++;
                                                    } else {
                                                        h5Var = null;
                                                    }
                                                }
                                                if (h5Var != null) {
                                                    i1 i1Var = h5Var.r;
                                                    int indexOf4 = this.p4.indexOf(h5Var.getRow());
                                                    if (indexOf4 >= 0) {
                                                        Layout layout8 = i1Var.getLayout();
                                                        int lineForOffset5 = layout8 != null ? layout8.getLineForOffset(i1Var.getSelectionEnd()) : 0;
                                                        if (z22) {
                                                            if (layout8 != null) {
                                                                i12 = 1;
                                                                break;
                                                            } else {
                                                                i12 = 1;
                                                            }
                                                            a U32 = U3(indexOf4 + i12, i12);
                                                            if (U32 == null) {
                                                                a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                arrayList.add(aVar4);
                                                                v51Var.N(false);
                                                                post(new p2(this, aVar4, 6));
                                                            } else {
                                                                post(new p2(this, U32, 7));
                                                            }
                                                            z13 = true;
                                                        } else if ((layout8 == null || lineForOffset5 <= 0) && (U3 = U3(indexOf4 - 1, -1)) != null) {
                                                            post(new p2(this, U3, 8));
                                                            z13 = true;
                                                        }
                                                    }
                                                    z13 = false;
                                                } else {
                                                    int i51 = 0;
                                                    while (true) {
                                                        if (i51 < getChildCount()) {
                                                            KeyEvent.Callback childAt3 = getChildAt(i51);
                                                            if (childAt3 instanceof e6) {
                                                                e6 e6Var2 = (e6) childAt3;
                                                                if (e6Var2.getEditText().isFocused() || (e6Var2.n() && e6Var2.h.isFocused())) {
                                                                }
                                                                i51++;
                                                            } else if (childAt3 instanceof m0) {
                                                                m0 m0Var = (m0) childAt3;
                                                                if (m0Var.getCaptionEditText().isFocused()) {
                                                                    aVar = m0Var.getRow();
                                                                } else {
                                                                    i51++;
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
                                                                i51++;
                                                            }
                                                        } else {
                                                            aVar = null;
                                                        }
                                                    }
                                                    if (aVar != null && (indexOf = arrayList.indexOf(aVar)) >= 0) {
                                                        View z110 = z1(aVar);
                                                        boolean z23 = z110 instanceof e6;
                                                        if (z23) {
                                                            final e6 e6Var3 = (e6) z110;
                                                            i1 i1Var2 = e6Var3.f;
                                                            i1 i1Var3 = e6Var3.h;
                                                            if (e6Var3.n()) {
                                                                if (!z22 || i1Var3.isFocused()) {
                                                                    z12 = z22;
                                                                    if (!z12 && i1Var3.isFocused() && ((layout2 = e6Var3.getAuthorEditText().getLayout()) == null || layout2.getLineForOffset(e6Var3.getAuthorEditText().getSelectionEnd()) <= 0)) {
                                                                        Layout layout9 = i1Var3.getLayout();
                                                                        final float primaryHorizontal2 = layout9 == null ? 0.0f : layout9.getPrimaryHorizontal(Math.max(0, Math.min(i1Var3.getSelectionEnd(), i1Var3.length())));
                                                                        i1Var2.r();
                                                                        final int i52 = 0;
                                                                        i1Var2.post(new Runnable() { // from class: ii.t5
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                switch (i52) {
                                                                                    case 0:
                                                                                        i1 i1Var4 = e6Var3.f;
                                                                                        Layout layout10 = i1Var4.getLayout();
                                                                                        int length5 = i1Var4.length();
                                                                                        if (layout10 != null) {
                                                                                            length5 = layout10.getOffsetForHorizontal(Math.max(0, layout10.getLineCount() - 1), primaryHorizontal2);
                                                                                        }
                                                                                        i1Var4.setSelection(Math.max(0, Math.min(length5, i1Var4.length())));
                                                                                        break;
                                                                                    default:
                                                                                        i1 i1Var5 = e6Var3.h;
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
                                                                    if (z23) {
                                                                        R3 = R3(z110);
                                                                    } else {
                                                                        e6 e6Var4 = (e6) z110;
                                                                        R3 = (e6Var4.n() && e6Var4.h.isFocused()) ? e6Var4.getAuthorEditText() : e6Var4.getEditText();
                                                                    }
                                                                    if (R3 != null && (layout = R3.getLayout()) != null) {
                                                                        int lineForOffset6 = layout.getLineForOffset(R3.getSelectionEnd());
                                                                        if (z12) {
                                                                            if (lineForOffset6 <= 0) {
                                                                                a V1 = V1(aVar, -1);
                                                                                if (V1 != null) {
                                                                                    post(new p2(this, V1, 13));
                                                                                } else {
                                                                                    int T23 = T2(indexOf - 1, -1);
                                                                                    if (T23 >= 0) {
                                                                                        post(new p2(this, (a) arrayList.get(T23), 3));
                                                                                    }
                                                                                }
                                                                                z13 = true;
                                                                            }
                                                                        } else if (lineForOffset6 >= layout.getLineCount() - 1) {
                                                                            a V12 = V1(aVar, 1);
                                                                            if (V12 != null) {
                                                                                post(new p2(this, V12, 10));
                                                                            } else {
                                                                                int T24 = T2(indexOf + 1, 1);
                                                                                if (T24 < 0) {
                                                                                    a aVar5 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                                                                    arrayList.add(aVar5);
                                                                                    v51Var.N(false);
                                                                                    post(new p2(this, aVar5, 11));
                                                                                } else {
                                                                                    post(new p2(this, (a) arrayList.get(T24), 12));
                                                                                }
                                                                            }
                                                                            z13 = true;
                                                                        }
                                                                    }
                                                                } else {
                                                                    Layout layout10 = e6Var3.getEditText().getLayout();
                                                                    if (layout10 != null) {
                                                                        z12 = z22;
                                                                        break;
                                                                    }
                                                                    Layout layout11 = i1Var2.getLayout();
                                                                    if (layout11 == null) {
                                                                        i11 = 0;
                                                                        primaryHorizontal = 0.0f;
                                                                    } else {
                                                                        i11 = 0;
                                                                        primaryHorizontal = layout11.getPrimaryHorizontal(Math.max(0, Math.min(i1Var2.getSelectionEnd(), i1Var2.length())));
                                                                    }
                                                                    if (i1Var3.getVisibility() != 0) {
                                                                        i1Var3.setVisibility(i11);
                                                                        e6Var3.requestLayout();
                                                                    }
                                                                    i1Var3.r();
                                                                    final int i53 = 1;
                                                                    i1Var3.post(new Runnable() { // from class: ii.t5
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            switch (i53) {
                                                                                case 0:
                                                                                    i1 i1Var4 = e6Var3.f;
                                                                                    Layout layout102 = i1Var4.getLayout();
                                                                                    int length5 = i1Var4.length();
                                                                                    if (layout102 != null) {
                                                                                        length5 = layout102.getOffsetForHorizontal(Math.max(0, layout102.getLineCount() - 1), primaryHorizontal);
                                                                                    }
                                                                                    i1Var4.setSelection(Math.max(0, Math.min(length5, i1Var4.length())));
                                                                                    break;
                                                                                default:
                                                                                    i1 i1Var5 = e6Var3.h;
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
                                                        z12 = z22;
                                                        if (z23) {
                                                        }
                                                        if (R3 != null) {
                                                            int lineForOffset62 = layout.getLineForOffset(R3.getSelectionEnd());
                                                            if (z12) {
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                }
                                            }
                                        }
                                        if (!y3 && !z10 && !z11 && keyCode == 61) {
                                            findFocus = findFocus();
                                            if (findFocus instanceof i1) {
                                                if ((U2 = U2((r3 = (i1) findFocus))) != null) {
                                                    if (findFocus != U2.getTitleEditText()) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (keyCode == 61 && y3) {
                                            int i54 = k3Var.u0;
                                            int i55 = k3Var.x0;
                                            if (i54 >= 0 && i55 >= i54) {
                                                if (i54 != i55) {
                                                    int indexOf5 = arrayList.indexOf(y4(i54));
                                                    int indexOf6 = arrayList.indexOf(y4(i55));
                                                    if (indexOf5 < 0 || indexOf6 < indexOf5) {
                                                        return true;
                                                    }
                                                    m4(indexOf5, indexOf6, isShiftPressed);
                                                    return true;
                                                }
                                                a y42 = y4(i54);
                                                if (y42 != null) {
                                                    W3(y42, isShiftPressed);
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                    return true;
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
                                    while (i26 < arrayList.size()) {
                                    }
                                    if (length2 != 0) {
                                    }
                                    if (!y3) {
                                    }
                                    z10 = isCtrlPressed;
                                    z11 = isAltPressed;
                                    if (!y3) {
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    if (!y3) {
                                        if (keyCode != 20) {
                                        }
                                        i10 = 0;
                                        while (true) {
                                            if (i10 >= getChildCount()) {
                                            }
                                            i10++;
                                        }
                                        v51 v51Var2 = this.Y2;
                                        if (p5Var == null) {
                                        }
                                    }
                                    if (!y3) {
                                        findFocus = findFocus();
                                        if ((findFocus instanceof i1) && (U2 = U2((r3 = (i1) findFocus))) != null) {
                                        }
                                    }
                                    return keyCode == 61 ? false : false;
                                }
                            }
                            break;
                    }
                }
            }
        }
        if (!y3) {
        }
        z10 = isCtrlPressed;
        z11 = isAltPressed;
        if (!y3) {
        }
        if (z10) {
        }
        if (!y3) {
        }
        if (!y3) {
        }
        if (keyCode == 61) {
        }
    }

    public final int i2(int i10) {
        i1 I2 = I2(i10);
        if (I2 != null) {
            return I2.length();
        }
        e6 u22 = u2(i10);
        if (u22 != null) {
            return u22.getEditText().length();
        }
        a y42 = y4(i10);
        if (y42 == null) {
            return 0;
        }
        return e6.z(y42.b).length();
    }

    /* JADX WARN: Removed duplicated region for block: B:237:0x043b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i3(MotionEvent motionEvent) {
        boolean z10;
        a row;
        int i10;
        p5 p5Var;
        int action = motionEvent.getAction();
        k3 k3Var = this.n3;
        View view = null;
        if (action == 0) {
            this.v3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            this.w3 = y3;
            this.z3 = false;
            this.A3 = false;
            int i11 = (int) this.v3;
            int top = ((int) y3) - getTop();
            p5 p5Var2 = this.i4;
            if (p5Var2 == null) {
                p5Var2 = R2();
            }
            if (p5Var2 != null && p5Var2.getParent() == this) {
                int left = i11 - p5Var2.getLeft();
                int top2 = top - p5Var2.getTop();
                if (p5Var2.p(left, top2) >= 0 || p5Var2.n(left, top2) >= 0) {
                    view = p5Var2;
                    this.x3 = view;
                    long eventTime = motionEvent.getEventTime();
                    z10 = k3Var.y() && eventTime - this.F3 <= ((long) ViewConfiguration.getDoubleTapTimeout()) && Math.abs(this.v3 - this.G3) <= ((float) AndroidUtilities.dp(24.0f)) && Math.abs(this.w3 - this.H3) <= ((float) AndroidUtilities.dp(24.0f));
                    this.F3 = eventTime;
                    float f7 = this.v3;
                    this.G3 = f7;
                    float f10 = this.w3;
                    this.H3 = f10;
                    if (!z10 && T4(this.x3, f7, f10)) {
                        this.A3 = true;
                        this.F3 = 0L;
                        org.telegram.ui.Cells.g gVar = k3Var.r0;
                        if (!k3Var.y()) {
                            return true;
                        }
                        k3Var.i = false;
                        k3Var.R = false;
                        k3Var.k = false;
                        da daVar = k3Var.C;
                        if (daVar != null) {
                            daVar.invalidate();
                        }
                        AndroidUtilities.cancelRunOnUIThread(gVar);
                        AndroidUtilities.runOnUIThread(gVar);
                        return true;
                    }
                    if (this.x3 != null) {
                        Runnable runnable = this.y3;
                        if (runnable != null) {
                            removeCallbacks(runnable);
                        }
                        b bVar = new b(this, 2);
                        this.y3 = bVar;
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
            this.x3 = view;
            long eventTime2 = motionEvent.getEventTime();
            if (k3Var.y()) {
            }
            this.F3 = eventTime2;
            float f72 = this.v3;
            this.G3 = f72;
            float f102 = this.w3;
            this.H3 = f102;
            if (!z10) {
            }
            if (this.x3 != null) {
            }
        } else {
            if (action == 1) {
                Runnable runnable2 = this.y3;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                    this.y3 = null;
                }
                if (this.B3) {
                    Y4(motionEvent.getX(), motionEvent.getY());
                    p5 p5Var3 = this.i4;
                    if (this.B3) {
                        requestDisallowInterceptTouchEvent(false);
                    }
                    this.B3 = false;
                    this.D3 = null;
                    this.E3 = null;
                    this.C3 = p5Var3 != null && p5Var3.getSelectedCells().size() > 1;
                    if (p5Var3 != null && !p5Var3.H.isEmpty()) {
                        F4(p5Var3);
                    }
                    this.x3 = null;
                    this.A3 = false;
                    return true;
                }
                if (!this.z3 && !this.A3) {
                    View view2 = this.x3;
                    if (view2 instanceof p5) {
                        if (j3((p5) view2, (int) ((motionEvent.getX() - r0.getLeft()) - getLeft()), (int) ((motionEvent.getY() - r0.getTop()) - getTop()))) {
                            this.x3 = null;
                            this.A3 = false;
                            return false;
                        }
                    }
                }
                if (!this.z3 && !this.A3 && (p5Var = this.i4) != null) {
                    View view3 = this.x3;
                    if (view3 == p5Var) {
                        p5 p5Var4 = (p5) view3;
                        TL_iv.pageTableCell m10 = p5Var4.m((int) ((motionEvent.getX() - p5Var4.getLeft()) - getLeft()), (int) ((motionEvent.getY() - p5Var4.getTop()) - getTop()));
                        if (m10 != null) {
                            if (this.k4 >= 0 || this.l4 >= 0) {
                                M2();
                            } else {
                                LinkedHashSet linkedHashSet = p5Var4.H;
                                if (!linkedHashSet.remove(m10)) {
                                    linkedHashSet.add(m10);
                                }
                                p5Var4.v.invalidate();
                                p5Var4.t();
                            }
                        }
                    } else if (view3 != null) {
                        M2();
                    }
                }
                boolean z11 = this.z3;
                v51 v51Var = this.Y2;
                ArrayList arrayList = this.l3;
                if (!z11 && !this.A3 && this.x3 == null && !k3Var.y() && this.i4 == null) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    View view4 = (View) getParent();
                    if (view4 != null && x10 >= getLeft() && x10 <= getRight()) {
                        int paddingTop = getPaddingTop() + getTop();
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            paddingTop = Math.max(paddingTop, getChildAt(i13).getBottom() + getTop());
                        }
                        int B = org.telegram.messenger.z0.B(60.0f, view4.getHeight(), Math.max(Math.max(this.Q3, this.O3), this.P3));
                        if (y10 >= paddingTop && y10 <= B) {
                            a aVar = arrayList.isEmpty() ? null : (a) hg.c.h(1, arrayList);
                            if (aVar == null || !aVar.k.isEmpty() || E3(aVar.b) || aVar.i || x3(aVar) || K2(aVar.b)) {
                                i2 i2Var = this.J3;
                                if (i2Var != null) {
                                    i2Var.d();
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                arrayList.add(aVar2);
                                v51Var.N(false);
                                i2 i2Var2 = this.J3;
                                if (i2Var2 != null) {
                                    i2Var2.h();
                                }
                                post(new p2(this, aVar2, 19));
                            } else {
                                e3(aVar);
                            }
                        }
                    }
                }
                if (!this.z3 && !this.A3 && this.x3 == null && !k3Var.y() && this.i4 == null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    if (this.R3 && x11 >= getLeft() && x11 <= getRight()) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= getChildCount()) {
                                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
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
                                if (aVar3 == null || E3(aVar3.b) || aVar3.i || x3(aVar3) || K2(aVar3.b)) {
                                    i2 i2Var3 = this.J3;
                                    if (i2Var3 != null) {
                                        i2Var3.d();
                                    }
                                    a aVar4 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                                    arrayList.add(0, aVar4);
                                    v51Var.N(false);
                                    i2 i2Var4 = this.J3;
                                    if (i2Var4 != null) {
                                        i2Var4.h();
                                    }
                                    post(new p2(this, aVar4, 16));
                                } else {
                                    f3(aVar3);
                                }
                            }
                        }
                    }
                }
                if (!this.z3 && !this.A3 && (this.x3 instanceof r4) && !k3Var.y() && this.i4 == null && (row = ((r4) this.x3).getRow()) != null) {
                    TL_iv.PageBlock pageBlock = row.b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                        r.U(getContext(), TextUtils.isEmpty(pageblockmath.source) ? "" : pageblockmath.source, new ai.g3(22, this, pageblockmath), this.g3);
                    }
                }
                this.x3 = null;
                this.A3 = false;
                return false;
            }
            if (action == 2) {
                if (this.B3 && this.x3 == this.i4) {
                    Y4(motionEvent.getX(), motionEvent.getY());
                    this.z3 = true;
                    return true;
                }
                float x12 = motionEvent.getX() - this.v3;
                float y12 = motionEvent.getY() - this.w3;
                if ((y12 * y12) + (x12 * x12) > AndroidUtilities.dp(8.0f) * AndroidUtilities.dp(8.0f)) {
                    this.z3 = true;
                    Runnable runnable3 = this.y3;
                    if (runnable3 != null) {
                        removeCallbacks(runnable3);
                        this.y3 = null;
                        return false;
                    }
                }
            } else if (action == 3) {
                Runnable runnable4 = this.y3;
                if (runnable4 != null) {
                    removeCallbacks(runnable4);
                    this.y3 = null;
                }
                if (this.B3) {
                    M2();
                }
                this.x3 = null;
                this.A3 = false;
                return false;
            }
        }
        return false;
    }

    public final int i4(int i10) {
        Layout layout;
        View A4 = A4(i10);
        if (!(A4 instanceof e6) || (layout = ((e6) A4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage j2() {
        if (!k3()) {
            return null;
        }
        ArrayList<TL_iv.PageBlock> Z2 = Z2();
        if (Z2.isEmpty()) {
            return null;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks = Z2;
        richMessage.photos = B2();
        richMessage.documents = y2();
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
    public final boolean j3(p5 p5Var, int i10, int i11) {
        i6 i6Var;
        i6 i6Var2;
        int p5 = p5Var.p(i10, i11);
        LinkedHashSet linkedHashSet = p5Var.H;
        r5 r5Var = p5Var.v;
        if (p5 >= 0) {
            int r10 = (r5Var.v() && p5 == r5Var.k()) ? r5Var.r() : p5;
            if (p5Var == this.i4 && (i6Var2 = p5Var.F) != null && p5 >= 0 && r10 >= p5 && r10 < i6Var2.b && !linkedHashSet.isEmpty()) {
                int i12 = p5;
                loop0: while (i12 <= r10) {
                    int i13 = 0;
                    while (true) {
                        i6 i6Var3 = p5Var.F;
                        if (i13 < i6Var3.c) {
                            if (!linkedHashSet.contains(i6Var3.d[i12][i13])) {
                                break loop0;
                            }
                            i13++;
                        }
                    }
                }
                F4(p5Var);
                return true;
            }
            g2(p5Var);
            i6 i6Var4 = p5Var.F;
            if (i6Var4 != null && p5 >= 0 && r10 >= p5 && r10 < i6Var4.b) {
                linkedHashSet.clear();
                for (int i14 = p5; i14 <= r10; i14++) {
                    int i15 = 0;
                    while (true) {
                        i6 i6Var5 = p5Var.F;
                        if (i15 < i6Var5.c) {
                            TL_iv.pageTableCell pagetablecell = i6Var5.d[i14][i15];
                            if (pagetablecell != null) {
                                linkedHashSet.add(pagetablecell);
                            }
                            i15++;
                        }
                    }
                }
                r5Var.invalidate();
                p5Var.t();
            }
            this.k4 = p5;
            return true;
        }
        int n10 = p5Var.n(i10, i11);
        if (n10 < 0) {
            return false;
        }
        int q6 = (r5Var.u() && n10 == r5Var.j()) ? r5Var.q() : n10;
        if (p5Var == this.i4 && (i6Var = p5Var.F) != null && n10 >= 0 && q6 >= n10 && q6 < i6Var.c && !linkedHashSet.isEmpty()) {
            int i16 = n10;
            loop4: while (i16 <= q6) {
                int i17 = 0;
                while (true) {
                    i6 i6Var6 = p5Var.F;
                    if (i17 < i6Var6.b) {
                        if (!linkedHashSet.contains(i6Var6.d[i17][i16])) {
                            break loop4;
                        }
                        i17++;
                    }
                }
            }
            F4(p5Var);
            return true;
        }
        g2(p5Var);
        i6 i6Var7 = p5Var.F;
        if (i6Var7 != null && n10 >= 0 && q6 >= n10 && q6 < i6Var7.c) {
            linkedHashSet.clear();
            for (int i18 = n10; i18 <= q6; i18++) {
                int i19 = 0;
                while (true) {
                    i6 i6Var8 = p5Var.F;
                    if (i19 < i6Var8.b) {
                        TL_iv.pageTableCell pagetablecell2 = i6Var8.d[i19][i18];
                        if (pagetablecell2 != null) {
                            linkedHashSet.add(pagetablecell2);
                        }
                        i19++;
                    }
                }
            }
            r5Var.invalidate();
            p5Var.t();
        }
        this.l4 = n10;
        return true;
    }

    public final i1 j4(int i10) {
        View A4 = A4(i10);
        if (A4 instanceof e6) {
            return ((e6) A4).getAuthorEditText();
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
    public final TL_iv.PageBlock k2(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
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
            ArrayList arrayList2 = x3Var.l3;
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
            boolean E3 = E3(aVar2.b);
            if (E3) {
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
            if (E3) {
                J2(aVar2, arrayList3);
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
                        TL_iv.PageBlock k22 = x3Var2.k2(i15, i21, i16, i17, z11, iArr2);
                        if (k22 != null) {
                            arrayList.add(k22);
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
                        if (!E3(aVar3.b)) {
                            break;
                        }
                        J2(aVar3, arrayList3);
                        i20++;
                        aVar2 = aVar;
                    }
                } else {
                    i15 = i20;
                    aVar = aVar2;
                    break;
                }
            }
            if (E3 || !arrayList.isEmpty()) {
                ArrayList<TL_iv.PageBlock> arrayList5 = new ArrayList<>();
                if (!E3) {
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
                    tL_pageListOrderedItemBlocks.num = a4.a.n(i19, ".");
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
                tL_pageListOrderedItemText.num = a4.a.n(i19, ".");
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
    public final boolean k3() {
        int i10 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.l3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            a aVar = (a) arrayList.get(i10);
            if (!e6.z(aVar.b).isEmpty()) {
                break;
            }
            if (!D3(aVar.b)) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if (!(pageBlock instanceof TL_iv.pageBlockAudio)) {
                }
            }
            for (u uVar : Q3(aVar)) {
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
                int i11 = p4.M;
                if (((TL_iv.pageBlockMap) pageBlock3).geo instanceof TLRPC.TL_geoPoint) {
                    return true;
                }
            }
            if ((pageBlock3 instanceof TL_iv.pageBlockTable) && O4((TL_iv.pageBlockTable) pageBlock3)) {
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

    public final boolean l2() {
        i1 editText;
        int length;
        int B;
        int y3;
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y() || k3Var.u0 != k3Var.x0) {
            return false;
        }
        if (L3()) {
            int i10 = k3Var.u0;
            int i11 = k3Var.v0;
            if (i11 != k3Var.y0) {
                return false;
            }
            editText = N4(i10, i11);
        } else if (y3()) {
            editText = I2(k3Var.u0);
        } else if (w3()) {
            editText = s2(k3Var.u0);
        } else if (G3()) {
            editText = j4(k3Var.u0);
        } else {
            e6 G4 = G4();
            if (G4 == null) {
                return false;
            }
            editText = G4.getEditText();
        }
        if (editText == null || (B = hg.c.B(k3Var.w0, k3Var.z0, (length = editText.length()), 0)) >= (y3 = hg.c.y(k3Var.w0, k3Var.z0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && B < y3) {
            for (l4 l4Var : (l4[]) text.getSpans(B, y3, l4.class)) {
                if (text.getSpanStart(l4Var) < y3 && text.getSpanEnd(l4Var) > B) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean m2() {
        int[] D4 = D4();
        if (D4 == null) {
            return n2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (n2((a) this.l3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean m3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.l3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            Iterator it = Q3((a) arrayList.get(i10)).iterator();
            while (it.hasNext()) {
                if (((u) it.next()).a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean m4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.l3;
            if (i11 < arrayList.size()) {
                i2 i2Var = this.J3;
                if (i2Var != null) {
                    i2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (q3(i11, true, true)) {
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
                        if (q3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    s4();
                    if (findFocus() instanceof i1) {
                        X1();
                    } else {
                        this.Y2.N(false);
                    }
                    i2 i2Var2 = this.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean n2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.l3).indexOf(aVar)) < 0 || indexOf < 0 || indexOf >= arrayList.size()) {
            return false;
        }
        a aVar2 = (a) arrayList.get(indexOf);
        if (aVar2.c == 0) {
            TL_iv.PageBlock pageBlock = aVar2.b;
            if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !C3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !o2(indexOf)) {
                return false;
            }
        } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).c < aVar2.c) {
            return false;
        }
        return p3(indexOf);
    }

    public final void n3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof e6) {
                e6 e6Var = (e6) childAt;
                e6Var.f.hideActionMode();
                e6Var.h.hideActionMode();
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
            } else if (childAt instanceof m0) {
                ((m0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof u0) {
                ((u0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void n4(a aVar) {
        View z12 = z1(aVar);
        if (z12 instanceof v4) {
            v4 v4Var = (v4) z12;
            ArrayList arrayList = v4Var.y;
            if (v4Var.a == null) {
                return;
            }
            v4Var.n();
            if (v4Var.W >= arrayList.size()) {
                v4Var.W = Math.max(0, arrayList.size() - 1);
            }
            v4Var.o(false);
            v4Var.requestLayout();
            v4Var.invalidate();
        }
    }

    public final boolean o2(int i10) {
        if (i10 <= 0) {
            return false;
        }
        ArrayList arrayList = this.l3;
        return i10 < arrayList.size() && E3(((a) arrayList.get(i10)).b) && ((a) arrayList.get(i10 - 1)).c >= 1;
    }

    public final void o3(boolean z10) {
        k3 k3Var = this.n3;
        if (k3Var != null) {
            if (z10) {
                k3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(k3Var.r0);
                k3Var.v();
            }
        }
        if (z10) {
            V2();
        } else {
            n3();
        }
    }

    public final void o4() {
        post(new b(this, 3));
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.M3);
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.M3);
        this.a3 = false;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = this.K3;
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
        this.K3 = i14;
    }

    public final boolean p2() {
        int[] D4 = D4();
        if (D4 == null) {
            return q2(D2());
        }
        for (int i10 = D4[0]; i10 <= D4[1]; i10++) {
            if (q2((a) this.l3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean p3(int i10) {
        return ((a) this.l3.get(i10)).c + 1 <= MessagesController.getInstance(this.f3).config.richMessageMaxDepth.get() + (-6);
    }

    public final void p4(int i10) {
        ArrayList arrayList = this.l3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.c > 0) {
                View z12 = z1(aVar);
                if (z12 instanceof e6) {
                    ((e6) z12).F();
                }
            }
        }
    }

    public final boolean q2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        return aVar != null && (indexOf = (arrayList = this.l3).indexOf(aVar)) >= 0 && aVar.c > 0 && indexOf >= 0 && indexOf < arrayList.size() && ((a) arrayList.get(indexOf)).c > 0;
    }

    public final boolean q3(int i10, boolean z10, boolean z11) {
        int i11 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.l3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar.c > 0) {
                        t2(i10);
                        return true;
                    }
                } else if (aVar.c == 0) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    boolean z12 = (pageBlock instanceof TL_iv.pageBlockParagraph) || C3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter);
                    if ((z12 || o2(i10)) && p3(i10)) {
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
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).c >= aVar.c)) && p3(i10)) {
                    aVar.c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void q4(a aVar, u uVar) {
        if (aVar == null) {
            return;
        }
        if (!B3(aVar.b)) {
            r4(aVar);
            return;
        }
        ArrayList g32 = g3(aVar.b);
        ArrayList arrayList = aVar.h;
        int indexOf = arrayList != null ? arrayList.indexOf(uVar) : -1;
        if (indexOf >= 0) {
            aVar.h.remove(indexOf);
            if (g32 != null && indexOf < g32.size()) {
                g32.remove(indexOf);
            }
        }
        if (aVar.h.isEmpty()) {
            r4(aVar);
            return;
        }
        int size = aVar.h.size();
        v51 v51Var = this.Y2;
        if (size != 1) {
            v51Var.N(true);
            n4(aVar);
            return;
        }
        TL_iv.PageCaption pageCaption = aVar.b.caption;
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
        aVar.b = pageBlock;
        pageBlock.caption = pageCaption;
        aVar.g = (u) aVar.h.get(0);
        aVar.h = null;
        v51Var.N(true);
        n4(aVar);
    }

    public final boolean r2() {
        i2 i2Var = this.J3;
        if (i2Var != null) {
            return i2Var.e || !i2Var.b.isEmpty();
        }
        return false;
    }

    public final void r3(boolean z10) {
        int i10;
        int i11;
        int[] D4 = D4();
        if (D4 != null && (i10 = D4[0]) != (i11 = D4[1])) {
            m4(i10, i11, z10);
            return;
        }
        a D2 = D4 == null ? D2() : (a) this.l3.get(D4[0]);
        if (D2 != null) {
            W3(D2, z10);
        }
    }

    public final void r4(a aVar) {
        ArrayList arrayList = this.l3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.Y2.N(true);
        }
    }

    public final i1 s2(int i10) {
        KeyEvent.Callback A4 = A4(i10);
        if (A4 instanceof m0) {
            return ((m0) A4).getCaptionEditText();
        }
        return null;
    }

    public final void s3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
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
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.m3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.k.add((Long) arrayList3.get(i12));
                }
                int i13 = g5.a;
                h51 J = h51.J(g5.class);
                J.G = aVar2;
                J.H = this.f4;
                arrayList2.add(J);
                this.p4.add(aVar2);
            }
        }
    }

    public final void s4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.l3;
            if (i10 >= arrayList.size()) {
                return;
            }
            a aVar = (a) arrayList.get(i10);
            if (aVar.c > 0 && aVar.d > 0 && !E3(aVar.b)) {
                int i11 = aVar.c;
                int i12 = 1;
                for (int i13 = i10 - 1; i13 >= 0; i13--) {
                    a aVar2 = (a) arrayList.get(i13);
                    int i14 = aVar2.c;
                    if (i14 < i11) {
                        break;
                    }
                    if (i14 == i11 && !E3(aVar2.b)) {
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

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.j3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.R3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.i3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.N3 = new ArrayList();
        ArrayList arrayList = this.l3;
        W2(arrayList, d5.b(charSequence), this.m3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.N3.add((a) arrayList.get(size));
        }
        this.Y2.N(false);
    }

    public final void t2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.l3;
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
    public final void t3() {
        i2 i2Var;
        i2 i2Var2 = this.J3;
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
        a Q2 = Q2();
        ArrayList arrayList = this.l3;
        int indexOf = Q2 != null ? arrayList.indexOf(Q2) : -1;
        if (Q2 != null) {
            TL_iv.PageBlock pageBlock = Q2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && Q2.g == null && !Q2.i && e6.z(pageBlock).isEmpty()) {
                arrayList.remove(indexOf);
                arrayList.add(indexOf, aVar3);
                arrayList.add(indexOf, aVar2);
                arrayList.add(indexOf, aVar);
                this.Y2.N(false);
                i2Var = this.J3;
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
        this.Y2.N(false);
        i2Var = this.J3;
        if (i2Var != null) {
        }
        post(new p2(this, aVar, 20));
    }

    public final void t4(String str) {
        k3 k3Var = this.n3;
        W1(k3Var.u0, k3Var.w0, k3Var.x0, k3Var.z0, str.split("\n", -1));
    }

    public final e6 u2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.X2.m(i10);
        if (m10 instanceof e6) {
            return (e6) m10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u3(a aVar) {
        boolean z10;
        int indexOf;
        int indexOf2;
        ArrayList arrayList = aVar.k;
        a Q2 = Q2();
        if (Q2 == null) {
            Q2 = this.c4;
        }
        ArrayList arrayList2 = this.l3;
        int indexOf3 = Q2 != null ? arrayList2.indexOf(Q2) : -1;
        if (indexOf3 < 0 || !(Q2.b instanceof TL_iv.pageBlockBlockquote)) {
            z10 = false;
        } else {
            long a2 = q0.a();
            TL_iv.RichText richText = ((TL_iv.pageBlockBlockquote) Q2.b).caption;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                this.m3.put(Long.valueOf(a2), richText);
            }
            Q2.k.add(Long.valueOf(a2));
            Q2.b = new TL_iv.pageBlockParagraph();
            z10 = true;
        }
        boolean z11 = indexOf3 >= 0 && !Q2.k.isEmpty();
        if (z11) {
            arrayList.clear();
            arrayList.addAll(Q2.k);
        }
        if (indexOf3 >= 0) {
            TL_iv.PageBlock pageBlock = Q2.b;
            if ((pageBlock instanceof TL_iv.pageBlockParagraph) && Q2.g == null && e6.z(pageBlock).isEmpty()) {
                arrayList2.set(indexOf3, aVar);
                this.c4 = aVar;
                indexOf = arrayList2.indexOf(aVar);
                if (indexOf < arrayList2.size() - 1 || E3(((a) arrayList2.get(indexOf + 1)).b)) {
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    if (z11) {
                        aVar2.k.addAll(arrayList);
                    }
                    arrayList2.add(indexOf + 1, aVar2);
                }
                this.Y2.N(!z10);
                indexOf2 = arrayList2.indexOf(aVar) + 1;
                if (indexOf2 > 0 || indexOf2 >= arrayList2.size() || E3(((a) arrayList2.get(indexOf2)).b)) {
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
        this.c4 = aVar;
        indexOf = arrayList2.indexOf(aVar);
        if (indexOf < arrayList2.size() - 1) {
        }
        a aVar22 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        if (z11) {
        }
        arrayList2.add(indexOf + 1, aVar22);
        this.Y2.N(!z10);
        indexOf2 = arrayList2.indexOf(aVar) + 1;
        if (indexOf2 > 0) {
        }
    }

    public final u u4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document S2 = S2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (S2 == null) {
                return null;
            }
            u uVar = new u();
            uVar.c = true;
            uVar.a = 2;
            uVar.h = S2;
            uVar.i = S2;
            return uVar;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document S22 = S2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (S22 == null) {
                return null;
            }
            u uVar2 = new u();
            uVar2.d = true;
            uVar2.a = 2;
            uVar2.h = S22;
            return uVar2;
        }
        int i10 = 0;
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            TLRPC.Document S23 = S2(pageblockvideo.video_id);
            if (S23 == null) {
                return null;
            }
            u uVar3 = new u();
            uVar3.b = true;
            uVar3.a = 2;
            uVar3.h = S23;
            uVar3.n = pageblockvideo.spoiler;
            while (i10 < S23.attributes.size()) {
                if (S23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) S23.attributes.get(i10);
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
                if (i11 < this.l3.size()) {
                    for (u uVar4 : Q3((a) this.l3.get(i11))) {
                        if (uVar4 != null && (photo = uVar4.g) != null && photo.id == j3) {
                            break loop1;
                        }
                    }
                    i11++;
                } else {
                    TL_iv.RichMessage richMessage = this.k3;
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
                    HashMap hashMap = w4.a;
                    synchronized (w4.class) {
                        photo = j3 == 0 ? null : (TLRPC.Photo) w4.a.get(Long.valueOf(j3));
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

    public final void v2() {
        G2();
        this.k3 = null;
        this.b4 = null;
        this.c4 = null;
        this.J3 = new i2(this.o4);
        z4();
        this.J3.j();
        v3 v3Var = this.h3;
        if (v3Var != null) {
            v3Var.F();
        }
    }

    public final void v4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.k3 == null || aVar == null || (pageBlock = aVar.b) == null) {
            return;
        }
        if (!B3(pageBlock)) {
            u u42 = u4(aVar.b);
            if (u42 != null) {
                aVar.g = u42;
                return;
            }
            return;
        }
        ArrayList g32 = g3(aVar.b);
        aVar.h = new ArrayList();
        if (g32 != null) {
            for (int i10 = 0; i10 < g32.size(); i10++) {
                u u43 = u4((TL_iv.PageBlock) g32.get(i10));
                ArrayList arrayList = aVar.h;
                if (u43 == null) {
                    u43 = new u();
                }
                arrayList.add(u43);
            }
        }
    }

    public final boolean w3() {
        int i10;
        k3 k3Var = this.n3;
        if (k3Var == null || !k3Var.y() || (i10 = k3Var.u0) != k3Var.x0 || i10 < 0 || i10 >= this.p4.size()) {
            return false;
        }
        return A4(i10) instanceof m0;
    }

    public final ArrayList w4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (B3(aVar.b)) {
                ArrayList g32 = g3(aVar.b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (g32 != null) {
                    int size2 = g32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = g32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        u u42 = u4(pageBlock);
                        if (u42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(u42);
                        }
                    }
                    g32.clear();
                    g32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.b;
                if ((pageBlock2 instanceof TL_iv.pageBlockPhoto) || (pageBlock2 instanceof TL_iv.pageBlockVideo) || (pageBlock2 instanceof TL_iv.pageBlockAudio) || (pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    u u43 = u4(pageBlock2);
                    if (u43 != null) {
                        aVar.g = u43;
                        arrayList2.add(aVar);
                    }
                } else {
                    arrayList2.add(aVar);
                }
            }
        }
        return arrayList2;
    }

    public final boolean x2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.l3;
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
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.m3.remove(l4);
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

    public final void x4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof m4) {
                a0 a0Var = (a0) ((m4) childAt);
                a0Var.b.a(a0Var.a, new ei.d5(a0Var, 13));
            }
        }
        invalidate();
    }

    public final ArrayList y2() {
        TLRPC.Document document;
        u uVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.l3;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            a aVar = (a) arrayList2.get(i10);
            if ((aVar.b instanceof TL_iv.pageBlockDocument) && (uVar = aVar.g) != null && uVar.b() && (document2 = aVar.g.h) != null) {
                ((TL_iv.pageBlockDocument) aVar.b).document_id = document2.id;
            }
            for (u uVar2 : Q3(aVar)) {
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

    public final boolean y3() {
        int i10;
        k3 k3Var = this.n3;
        return k3Var != null && k3Var.y() && (i10 = k3Var.u0) == k3Var.x0 && x3(y4(i10));
    }

    public final a y4(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.p4;
        if (i10 < arrayList.size()) {
            return (a) arrayList.get(i10);
        }
        return null;
    }

    public final ArrayList z2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.l3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (u uVar : Q3((a) arrayList2.get(i10))) {
                if (uVar.b() && (document = uVar.h) != null && hashSet.add(Long.valueOf(document.id))) {
                    arrayList.add(uVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void z4() {
        ArrayList arrayList = this.l3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.Y2.N(false);
    }
}
