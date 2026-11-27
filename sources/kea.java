// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class kea extends nx0 implements fn7 {
    public static final /* synthetic */ int T2 = 0;
    public final mda A1;
    public TL_stories.StoryItem A2;
    public final mda B1;
    public mq5 B2;
    public final u55 C1;
    public int C2;
    public final u55 D1;
    public boolean D2;
    public final sd4 E1;
    public n8 E2;
    public final dea F1;
    public int F2;
    public final iea G1;
    public boolean G2;
    public final hea H1;
    public boolean H2;
    public final ArrayList I1;
    public int I2;
    public final String[] J1;
    public final tq3 J2;
    public final byte K1;
    public final oz4 K2;
    public final z2b L1;
    public final ll0 L2;
    public final Drawable M1;
    public final ll0 M2;
    public final View[] N1;
    public final ll0 N2;
    public final AnimatorSet[] O1;
    public final mr0 O2;
    public final zh6 P1;
    public final jl0 P2;
    public final HashMap Q1;
    public final rl0 Q2;
    public final yda R1;
    public final jl0 R2;
    public int S1;
    public boolean S2;
    public boolean T1;
    public final boolean U1;
    public boolean V1;
    public final int W1;
    public final FrameLayout X1;
    public final LinearLayout Y1;
    public final og2 Z1;
    public final zu1 a2;
    public final Activity b2;
    public final boolean c2;
    public boolean d2;
    public final TextPaint e2;
    public TLRPC.TL_exportedMessageLink f2;
    public boolean g2;
    public boolean h2;
    public final boolean i2;
    public final String[] j2;
    public int k2;
    public final FrameLayout l1;
    public int l2;
    public final pda m1;
    public boolean m2;
    public final qda n1;
    public aea n2;
    public final di3 o1;
    public float o2;
    public final pda p1;
    public float p2;
    public final FrameLayout q1;
    public float q2;
    public float r1;
    public ValueAnimator r2;
    public final nf9 s1;
    public final i69 s2;
    public final FrameLayout t1;
    public final rq4 t2;
    public final ema u1;
    public final a u2;
    public final FrameLayout v1;
    public boolean v2;
    public final FrameLayout w1;
    public vpa w2;
    public final LinearLayout x1;
    public TLRPC.Dialog x2;
    public AnimatorSet y1;
    public final xda y2;
    public final d79 z1;
    public ArrayList z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kea(Context context, zu1 zu1Var, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, vnb vnbVar) {
        super(1, vnbVar, context, true);
        byte b;
        int i;
        float f;
        mda mdaVar;
        mda mdaVar2;
        float f2;
        LinearLayout linearLayout;
        int i2;
        byte b2 = 1;
        final byte b3 = 2;
        String[] strArr = new String[2];
        this.J1 = strArr;
        this.N1 = new View[2];
        this.O1 = new AnimatorSet[2];
        this.P1 = new zh6();
        this.Q1 = new HashMap();
        this.S1 = -1;
        final byte b4 = 0;
        this.T1 = false;
        new Paint(1);
        this.e2 = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.j2 = strArr2;
        this.z2 = new ArrayList();
        byte b5 = 4;
        int i3 = 4;
        while (true) {
            b = 12;
            if (i3 >= 32) {
                i = 80;
                break;
            }
            i = (1 << i3) - 12;
            if (80 <= i) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = i / 8;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        this.B2 = mq5.e;
        this.C2 = 4;
        this.D2 = true;
        this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        hl.S(getWindow());
        oz4 d = this.X0.d(new fda(this, b5));
        this.K2 = d;
        if (Build.VERSION.SDK_INT < 31 || !xea.f()) {
            this.J2 = null;
            ll0 ll0Var = new ll0(d, d, d);
            ll0Var.j = this.X0;
            this.M2 = ll0Var;
            this.L2 = ll0Var;
            this.N2 = ll0Var;
        } else {
            tq3 tq3Var = new tq3(false);
            this.J2 = tq3Var;
            this.X0.a(tq3Var);
            rz4 rz4Var = new rz4(d);
            rz4Var.f = d;
            rz4Var.d = tq3Var;
            rz4Var.e = -2;
            rz4 rz4Var2 = new rz4(d);
            rz4Var2.f = d;
            rz4Var2.d = tq3Var;
            rz4Var2.e = -3;
            ll0 ll0Var2 = new ll0(rz4Var, rz4Var, rz4Var);
            this.L2 = ll0Var2;
            ll0Var2.k = true;
            int L = i86.e(262144) ? hl.L(8.0f) : hl.L(48.0f);
            ll0Var2.d = L;
            ll0Var2.e = L;
            ll0Var2.j = this.X0;
            ll0 ll0Var3 = new ll0(rz4Var2, rz4Var2, rz4Var2);
            this.M2 = ll0Var3;
            ll0Var3.k = true;
            int L2 = hl.L(48.0f);
            ll0Var3.d = L2;
            ll0Var3.e = L2;
            vy4 vy4Var = this.X0;
            ll0Var3.j = vy4Var;
            ll0 ll0Var4 = new ll0(d, d, d);
            this.N2 = ll0Var4;
            ll0Var4.j = vy4Var;
        }
        this.J0 = vnbVar;
        this.U1 = z4;
        this.b2 = hl.W(context);
        this.c2 = z3;
        byte b6 = 3;
        if (z3) {
            this.J0 = new w53(b6);
        }
        d.a(aob.v0(aob.d6, this.J0));
        this.a2 = zu1Var;
        Drawable e = c00.e(context, R.drawable.sheet_shadow_round);
        this.M1 = e;
        int i5 = aob.h5;
        this.b0 = i5;
        e.setColorFilter(new PorterDuffColorFilter(aob.v0(i5, this.J0), PorterDuff.Mode.MULTIPLY));
        this.y = true;
        this.W = z2;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            r47 r47Var = (r47) arrayList.get(0);
            String q = wf3.q(uc7.s1(this.a).b2(r47.B0(r47Var.k)));
            if (!TextUtils.isEmpty(q)) {
                StringBuilder sb = new StringBuilder("https://");
                qu6.u(sb, uc7.s1(this.a).N2, "/", q, "/");
                sb.append(r47Var.e1());
                strArr2[0] = sb.toString();
                if (arrayList.size() == 1 && r47Var.z2()) {
                    strArr2[0] = c00.k(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.I1 = arrayList;
        this.H1 = new hea(this, context);
        this.i2 = z;
        strArr[0] = str;
        strArr[1] = str2;
        this.G = true;
        this.z0 = new ut(this, b6);
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                r47 r47Var2 = (r47) this.I1.get(i6);
                if (r47Var2.C4()) {
                    this.K1 = (byte) 3;
                } else if (r47Var2.S3()) {
                    byte b7 = r47Var2.Y3() ? (byte) 2 : (byte) 1;
                    this.K1 = b7;
                    if (b7 == 2) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            this.g2 = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((r47) arrayList.get(0)).e1();
            tL_channels_exportMessageLink.channel = uc7.s1(this.a).h1(((r47) arrayList.get(0)).k.peer_id.channel_id);
            ConnectionsManager.getInstance(this.a).sendRequest(tL_channels_exportMessageLink, new ol7(this, context, (byte) 27));
        }
        xda xdaVar = new xda(this, context);
        this.y2 = xdaVar;
        this.b = xdaVar;
        xdaVar.setWillNotDraw(false);
        this.b.setClipChildren(false);
        ViewGroup viewGroup = this.b;
        int i7 = this.u0;
        viewGroup.setPadding(i7, 0, i7, this.B2.d);
        FrameLayout frameLayout = new FrameLayout(context);
        this.l1 = frameLayout;
        frameLayout.setBackground(new hc(this));
        if (this.c2 && this.j2[1] != null) {
            yda ydaVar = new yda(this, context);
            this.R1 = ydaVar;
            frameLayout.addView(ydaVar, tre.d(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        rq4 rq4Var = new rq4(context, this.J0);
        this.t2 = rq4Var;
        rda rdaVar = new rda(this, b2);
        m7 m7Var = rq4Var.r;
        m7Var.addTextChangedListener(rdaVar);
        m7Var.setHint(ob6.M0(2131745168, null));
        m7Var.setOnEditorActionListener(new j(this, (byte) 24));
        rq4Var.setCloseButtonOnClickListener(new gda(this, b4));
        frameLayout.addView(rq4Var, tre.d(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        a aVar = new a(context, null);
        this.u2 = aVar;
        aVar.setOccupyStatusBar(false);
        aVar.setBackButtonImage(R.drawable.ic_ab_back);
        int i8 = aob.j5;
        yob.l(aVar, 5, i8, this.J0);
        yob.l(aVar, 6, aob.q5, this.J0);
        yob.l(aVar, 1, aob.z6, null);
        yob.l(aVar, 3, aob.u8, null);
        aVar.setActionBarMenuOnItemClick(new rn8(this, (byte) 16));
        aVar.setVisibility(8);
        frameLayout.addView(aVar, tre.e(-1, 58, 83));
        d79 d79Var = new d79(context, this.J0);
        this.z1 = d79Var;
        u55 u55Var = new u55(4);
        this.D1 = u55Var;
        d79Var.setLayoutManager(u55Var);
        u55Var.O = new nda(this, b3);
        d79Var.setOnScrollListener(new oda(this, b3));
        iea ieaVar = new iea(this, context);
        this.G1 = ieaVar;
        d79Var.setAdapter(ieaVar);
        int i9 = aob.A5;
        yob.l(d79Var, 21, i9, this.J0);
        d79Var.setVerticalScrollBarEnabled(false);
        d79Var.setHorizontalScrollBarEnabled(false);
        d79Var.setOverScrollMode(2);
        d79Var.setSelectorDrawableColor(0);
        byte b8 = 14;
        d79Var.setItemSelectorColorProvider(new vr9(b8));
        d79Var.setPadding(0, 0, 0, hl.L(48.0f));
        d79Var.setClipToPadding(false);
        byte b9 = 11;
        d79Var.i(new br1(b9));
        d79Var.setOnItemClickListener(new r69(this) { // from class: hda
            public final /* synthetic */ kea b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // r69
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void e(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b10 = b4;
                TLRPC.Dialog dialog2 = null;
                kea keaVar = this.b;
                switch (b10) {
                    case 0:
                        rq4 rq4Var2 = keaVar.t2;
                        HashMap hashMap = keaVar.Q1;
                        zh6 zh6Var = keaVar.P1;
                        dea deaVar = keaVar.F1;
                        iea ieaVar2 = keaVar.G1;
                        if (ieaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = keaVar.x2;
                            if (dialog3 != null) {
                                zh6Var.k(dialog3.id, dialog3);
                                hashMap.remove(dialog3);
                                keaVar.X0(2);
                                if (keaVar.G2 || keaVar.H2) {
                                    if (((TLRPC.Dialog) deaVar.e.f(dialog3.id)) == null) {
                                        deaVar.e.k(dialog3.id, dialog3);
                                        ArrayList arrayList2 = deaVar.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    deaVar.f();
                                    keaVar.v2 = false;
                                    rq4Var2.r.setText("");
                                    keaVar.E0(false);
                                }
                                for (int i11 = 0; i11 < keaVar.K0().getChildCount(); i11++) {
                                    View childAt = keaVar.K0().getChildAt(i11);
                                    if (childAt instanceof nea) {
                                        nea neaVar = (nea) childAt;
                                        if (neaVar.getCurrentDialog() == keaVar.x2.id) {
                                            neaVar.d(null, false, true);
                                            neaVar.b(true, true);
                                        }
                                    }
                                }
                                keaVar.F0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = ieaVar2.E(i10);
                            if (E != null && (dialog = keaVar.x2) != null) {
                                long j = dialog.id;
                                boolean B2 = uc7.s1(keaVar.a).B2(j);
                                TLRPC.Dialog dialog4 = keaVar.x2;
                                zh6Var.k(j, dialog4);
                                hashMap.put(dialog4, E);
                                keaVar.X0(2);
                                if (keaVar.G2 || keaVar.H2) {
                                    if (((TLRPC.Dialog) deaVar.e.f(dialog4.id)) == null) {
                                        deaVar.e.k(dialog4.id, dialog4);
                                        ArrayList arrayList3 = deaVar.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    deaVar.f();
                                    keaVar.v2 = false;
                                    rq4Var2.r.setText("");
                                    keaVar.E0(false);
                                }
                                for (int i12 = 0; i12 < keaVar.K0().getChildCount(); i12++) {
                                    View childAt2 = keaVar.K0().getChildAt(i12);
                                    if (childAt2 instanceof nea) {
                                        nea neaVar2 = (nea) childAt2;
                                        if (neaVar2.getCurrentDialog() == keaVar.x2.id) {
                                            neaVar2.d(E, B2, true);
                                            neaVar2.b(true, true);
                                        }
                                    }
                                }
                                keaVar.F0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = keaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                keaVar.P0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            hea heaVar = keaVar.H1;
                            kea keaVar2 = heaVar.L;
                            int i14 = heaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = heaVar.d.size();
                                    ArrayList arrayList5 = heaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((zda) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = heaVar.e.d;
                                        if (size3 < arrayList6.size()) {
                                            TLObject tLObject = (TLObject) arrayList6.get(size3);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog2 == null) {
                                    keaVar.P0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < keaVar2.z2.size()) {
                                    TLObject tLObject2 = ((sl3) keaVar2.z2.get(i16)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog2 = tL_dialog;
                                }
                                if (dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        d79Var.setVisibility(8);
        this.b.addView(d79Var, tre.e(-1, -1, 51));
        mda mdaVar3 = new mda(this, context, this.J0, b4);
        this.A1 = mdaVar3;
        mdaVar3.setSelectorDrawableColor(0);
        mdaVar3.setItemSelectorColorProvider(new vr9(b8));
        mdaVar3.setPadding(0, 0, 0, hl.L(48.0f));
        mdaVar3.setClipToPadding(false);
        getContext();
        u55 u55Var2 = new u55(4);
        this.C1 = u55Var2;
        mdaVar3.setLayoutManager(u55Var2);
        this.O2 = new mr0(this, b9);
        u55Var2.O = new nda(this, b4);
        mdaVar3.setHorizontalScrollBarEnabled(false);
        mdaVar3.setVerticalScrollBarEnabled(false);
        mdaVar3.setOverScrollMode(2);
        mdaVar3.i(new br1(b));
        this.b.addView(mdaVar3, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        dea deaVar = new dea(this, context);
        this.F1 = deaVar;
        mdaVar3.setAdapter(deaVar);
        yob.l(mdaVar3, 21, i9, this.J0);
        final byte b10 = 1;
        mdaVar3.setOnItemClickListener(new r69(this) { // from class: hda
            public final /* synthetic */ kea b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // r69
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void e(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b102 = b10;
                TLRPC.Dialog dialog2 = null;
                kea keaVar = this.b;
                switch (b102) {
                    case 0:
                        rq4 rq4Var2 = keaVar.t2;
                        HashMap hashMap = keaVar.Q1;
                        zh6 zh6Var = keaVar.P1;
                        dea deaVar2 = keaVar.F1;
                        iea ieaVar2 = keaVar.G1;
                        if (ieaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = keaVar.x2;
                            if (dialog3 != null) {
                                zh6Var.k(dialog3.id, dialog3);
                                hashMap.remove(dialog3);
                                keaVar.X0(2);
                                if (keaVar.G2 || keaVar.H2) {
                                    if (((TLRPC.Dialog) deaVar2.e.f(dialog3.id)) == null) {
                                        deaVar2.e.k(dialog3.id, dialog3);
                                        ArrayList arrayList2 = deaVar2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    deaVar2.f();
                                    keaVar.v2 = false;
                                    rq4Var2.r.setText("");
                                    keaVar.E0(false);
                                }
                                for (int i11 = 0; i11 < keaVar.K0().getChildCount(); i11++) {
                                    View childAt = keaVar.K0().getChildAt(i11);
                                    if (childAt instanceof nea) {
                                        nea neaVar = (nea) childAt;
                                        if (neaVar.getCurrentDialog() == keaVar.x2.id) {
                                            neaVar.d(null, false, true);
                                            neaVar.b(true, true);
                                        }
                                    }
                                }
                                keaVar.F0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = ieaVar2.E(i10);
                            if (E != null && (dialog = keaVar.x2) != null) {
                                long j = dialog.id;
                                boolean B2 = uc7.s1(keaVar.a).B2(j);
                                TLRPC.Dialog dialog4 = keaVar.x2;
                                zh6Var.k(j, dialog4);
                                hashMap.put(dialog4, E);
                                keaVar.X0(2);
                                if (keaVar.G2 || keaVar.H2) {
                                    if (((TLRPC.Dialog) deaVar2.e.f(dialog4.id)) == null) {
                                        deaVar2.e.k(dialog4.id, dialog4);
                                        ArrayList arrayList3 = deaVar2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    deaVar2.f();
                                    keaVar.v2 = false;
                                    rq4Var2.r.setText("");
                                    keaVar.E0(false);
                                }
                                for (int i12 = 0; i12 < keaVar.K0().getChildCount(); i12++) {
                                    View childAt2 = keaVar.K0().getChildAt(i12);
                                    if (childAt2 instanceof nea) {
                                        nea neaVar2 = (nea) childAt2;
                                        if (neaVar2.getCurrentDialog() == keaVar.x2.id) {
                                            neaVar2.d(E, B2, true);
                                            neaVar2.b(true, true);
                                        }
                                    }
                                }
                                keaVar.F0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = keaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                keaVar.P0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            hea heaVar = keaVar.H1;
                            kea keaVar2 = heaVar.L;
                            int i14 = heaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = heaVar.d.size();
                                    ArrayList arrayList5 = heaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((zda) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = heaVar.e.d;
                                        if (size3 < arrayList6.size()) {
                                            TLObject tLObject = (TLObject) arrayList6.get(size3);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog2 == null) {
                                    keaVar.P0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < keaVar2.z2.size()) {
                                    TLObject tLObject2 = ((sl3) keaVar2.z2.get(i16)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog2 = tL_dialog;
                                }
                                if (dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        mdaVar3.setOnScrollListener(new oda(this, b4));
        this.X0.b(mdaVar3);
        mda mdaVar4 = new mda(this, context, this.J0, b10);
        this.B1 = mdaVar4;
        mdaVar4.setItemSelectorColorProvider(new vr9(b8));
        mdaVar4.setSelectorDrawableColor(0);
        mdaVar4.setPadding(0, 0, 0, hl.L(48.0f));
        mdaVar4.setClipToPadding(false);
        getContext();
        sd4 sd4Var = new sd4(4, 0, mdaVar4);
        this.E1 = sd4Var;
        mdaVar4.setLayoutManager(sd4Var);
        byte b11 = 1;
        sd4Var.O = new nda(this, b11);
        mdaVar4.setOnItemClickListener(new r69(this) { // from class: hda
            public final /* synthetic */ kea b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            @Override // r69
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void e(int i10, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                byte b102 = b3;
                TLRPC.Dialog dialog2 = null;
                kea keaVar = this.b;
                switch (b102) {
                    case 0:
                        rq4 rq4Var2 = keaVar.t2;
                        HashMap hashMap = keaVar.Q1;
                        zh6 zh6Var = keaVar.P1;
                        dea deaVar2 = keaVar.F1;
                        iea ieaVar2 = keaVar.G1;
                        if (ieaVar2.d && i10 == 1) {
                            TLRPC.Dialog dialog3 = keaVar.x2;
                            if (dialog3 != null) {
                                zh6Var.k(dialog3.id, dialog3);
                                hashMap.remove(dialog3);
                                keaVar.X0(2);
                                if (keaVar.G2 || keaVar.H2) {
                                    if (((TLRPC.Dialog) deaVar2.e.f(dialog3.id)) == null) {
                                        deaVar2.e.k(dialog3.id, dialog3);
                                        ArrayList arrayList2 = deaVar2.d;
                                        arrayList2.add(!arrayList2.isEmpty() ? 1 : 0, dialog3);
                                    }
                                    deaVar2.f();
                                    keaVar.v2 = false;
                                    rq4Var2.r.setText("");
                                    keaVar.E0(false);
                                }
                                for (int i11 = 0; i11 < keaVar.K0().getChildCount(); i11++) {
                                    View childAt = keaVar.K0().getChildAt(i11);
                                    if (childAt instanceof nea) {
                                        nea neaVar = (nea) childAt;
                                        if (neaVar.getCurrentDialog() == keaVar.x2.id) {
                                            neaVar.d(null, false, true);
                                            neaVar.b(true, true);
                                        }
                                    }
                                }
                                keaVar.F0();
                                break;
                            }
                        } else {
                            TLRPC.TL_forumTopic E = ieaVar2.E(i10);
                            if (E != null && (dialog = keaVar.x2) != null) {
                                long j = dialog.id;
                                boolean B2 = uc7.s1(keaVar.a).B2(j);
                                TLRPC.Dialog dialog4 = keaVar.x2;
                                zh6Var.k(j, dialog4);
                                hashMap.put(dialog4, E);
                                keaVar.X0(2);
                                if (keaVar.G2 || keaVar.H2) {
                                    if (((TLRPC.Dialog) deaVar2.e.f(dialog4.id)) == null) {
                                        deaVar2.e.k(dialog4.id, dialog4);
                                        ArrayList arrayList3 = deaVar2.d;
                                        arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog4);
                                    }
                                    deaVar2.f();
                                    keaVar.v2 = false;
                                    rq4Var2.r.setText("");
                                    keaVar.E0(false);
                                }
                                for (int i12 = 0; i12 < keaVar.K0().getChildCount(); i12++) {
                                    View childAt2 = keaVar.K0().getChildAt(i12);
                                    if (childAt2 instanceof nea) {
                                        nea neaVar2 = (nea) childAt2;
                                        if (neaVar2.getCurrentDialog() == keaVar.x2.id) {
                                            neaVar2.d(E, B2, true);
                                            neaVar2.b(true, true);
                                        }
                                    }
                                }
                                keaVar.F0();
                                break;
                            }
                        }
                        break;
                    case 1:
                        if (i10 >= 0) {
                            ArrayList arrayList4 = keaVar.F1.d;
                            int i13 = i10 - 1;
                            if (i13 >= 0 && i13 < arrayList4.size()) {
                                dialog2 = (TLRPC.Dialog) arrayList4.get(i13);
                            }
                            if (dialog2 != null) {
                                keaVar.P0(view, dialog2);
                                break;
                            }
                        }
                        break;
                    default:
                        if (i10 >= 0) {
                            hea heaVar = keaVar.H1;
                            kea keaVar2 = heaVar.L;
                            int i14 = heaVar.F;
                            if (i10 < i14 || i14 < 0) {
                                int i15 = i10 - 1;
                                if (i15 >= 0) {
                                    int size2 = heaVar.d.size();
                                    ArrayList arrayList5 = heaVar.d;
                                    if (i15 < size2) {
                                        dialog2 = ((zda) arrayList5.get(i15)).a;
                                    } else {
                                        int size3 = i15 - arrayList5.size();
                                        ArrayList arrayList6 = heaVar.e.d;
                                        if (size3 < arrayList6.size()) {
                                            TLObject tLObject = (TLObject) arrayList6.get(size3);
                                            tL_dialog = new TLRPC.TL_dialog();
                                            if (tLObject instanceof TLRPC.User) {
                                                tL_dialog.id = ((TLRPC.User) tLObject).id;
                                            } else if (tLObject instanceof TLRPC.Chat) {
                                                tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                            }
                                            dialog2 = tL_dialog;
                                        }
                                    }
                                }
                                if (dialog2 == null) {
                                    keaVar.P0(view, dialog2);
                                    break;
                                }
                            } else {
                                int i16 = i10 - i14;
                                if (i16 >= 0 && i16 < keaVar2.z2.size()) {
                                    TLObject tLObject2 = ((sl3) keaVar2.z2.get(i16)).a;
                                    tL_dialog = new TLRPC.TL_dialog();
                                    if (tLObject2 instanceof TLRPC.User) {
                                        tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                    } else if (tLObject2 instanceof TLRPC.Chat) {
                                        tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                    }
                                    dialog2 = tL_dialog;
                                }
                                if (dialog2 == null) {
                                }
                            }
                        }
                        break;
                }
            }
        });
        mdaVar4.setHasFixedSize(true);
        mdaVar4.setItemAnimator(null);
        mdaVar4.setHorizontalScrollBarEnabled(false);
        mdaVar4.setVerticalScrollBarEnabled(false);
        mdaVar4.setOnScrollListener(new oda(this, b11));
        mdaVar4.i(new br1((byte) 13));
        mdaVar4.setAdapter(this.H1);
        yob.l(mdaVar4, 21, i9, this.J0);
        this.s2 = new i69(mdaVar4, true);
        tk4 tk4Var = new tk4(context, this.J0);
        tk4Var.setViewType(12);
        z2b z2bVar = new z2b(context, tk4Var, 1, this.J0);
        this.L1 = z2bVar;
        z2bVar.addView(tk4Var, 0);
        z2bVar.setAnimateLayoutChange(true);
        z2bVar.e(false, false);
        boolean z5 = this.c2;
        tpa tpaVar = z2bVar.d;
        if (z5) {
            yob.X(tpaVar, aob.eh, this.J0);
        }
        tpaVar.setText(ob6.M0(2131747898, null));
        mdaVar4.setEmptyView(z2bVar);
        mdaVar4.setHideIfEmpty(false);
        mdaVar4.X1 = true;
        mdaVar4.Y1 = false;
        this.b.addView(z2bVar, tre.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.b.addView(mdaVar4, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        nf9 nf9Var = new nf9((byte) 4, context, this);
        this.s1 = nf9Var;
        this.b.addView(nf9Var, tre.e(-1, jn7.W4, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, hl.e1(), 51);
        layoutParams.topMargin = hl.L((!this.c2 || this.j2[1] == null) ? 58.0f : 111.0f);
        this.N1[0] = new View(context);
        View view = this.N1[0];
        int i10 = aob.V5;
        yob.h(i10, this.J0, view);
        this.N1[0].setAlpha(0.0f);
        this.N1[0].setTag(1);
        this.b.addView(this.N1[0], layoutParams);
        this.b.addView(frameLayout, tre.e(-1, (!this.c2 || this.j2[1] == null) ? 58 : jn7.v1, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, hl.e1(), 83);
        layoutParams2.bottomMargin = hl.L(48.0f);
        this.N1[1] = new View(context);
        yob.h(i10, this.J0, this.N1[1]);
        this.N1[1].setLayoutParams(layoutParams2);
        if (this.i2 || this.j2[0] != null) {
            f = 4.0f;
            if (this.c2) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.q1 = frameLayout2;
                f2 = 9.0f;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.t1 = frameLayout3;
                frameLayout2.addView(frameLayout3, tre.d(-1, -1.0f, jn7.D1, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                frameLayout3.addView(linearLayout2, tre.e(-1, -1, jn7.D1));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                iye.b(linearLayout3, 0.015f, 1.2f);
                linearLayout3.setOnClickListener(new eda(this, (byte) 4));
                ema emaVar = new ema(context);
                this.u1 = emaVar;
                emaVar.setTextSize(15);
                yob.W(emaVar, aob.Kl, this.J0);
                emaVar.setEllipsizeByGradient(true);
                W0();
                linearLayout3.addView(emaVar, tre.q(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                yob.X(textView, aob.G6, this.J0);
                textView.setText(ob6.M0(2131751732, null).toUpperCase());
                textView.setPadding(hl.L(9.0f), 0, hl.L(9.0f), 0);
                textView.setTypeface(hl.o());
                textView.setGravity(17);
                int i11 = aob.i6;
                hf0 Y = aob.Y(aob.v0(i11, this.J0), 4, 4);
                uob M = yob.M(i11);
                vnb vnbVar2 = this.J0;
                textView.setBackground(Y);
                mdaVar2 = mdaVar4;
                yob.j(textView, Y, null, M, vnbVar2);
                linearLayout3.addView(textView, tre.q(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new eda(this, (byte) 5));
                iye.a(textView);
                this.b.addView(frameLayout2, tre.e(-1, 58, 83));
                ArrayList arrayList2 = this.I1;
                if (arrayList2 != null && arrayList2.size() > 0 && ((r47) this.I1.get(0)).k != null && ((r47) this.I1.get(0)).k.forwards > 0) {
                    final r47 r47Var3 = (r47) this.I1.get(0);
                    if (xc2.N(uc7.s1(this.a).M0(Long.valueOf(-r47.B0(r47Var3.k)))) && !r47.l3(r47Var3.k)) {
                        final byte b12 = 0;
                        linearLayout = uh9.j(context, 0);
                        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: lda
                            public final /* synthetic */ kea b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b13 = b12;
                                r47 r47Var4 = r47Var3;
                                kea keaVar = this.b;
                                switch (b13) {
                                    case 0:
                                        e eVar = keaVar.a2;
                                        if (eVar == null) {
                                            eVar = LaunchActivity.S();
                                        }
                                        if (eVar != null) {
                                            keaVar.dismiss();
                                            eVar.presentFragment(new z67(r47Var4));
                                            break;
                                        }
                                        break;
                                    default:
                                        e eVar2 = keaVar.a2;
                                        if (eVar2 == null) {
                                            eVar2 = LaunchActivity.S();
                                        }
                                        if (eVar2 != null) {
                                            keaVar.dismiss();
                                            eVar2.presentFragment(new z67(r47Var4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), hl.L(4.0f));
                        hf0 Y2 = aob.Y(aob.v0(i11, this.J0), 6, 6);
                        uob M2 = yob.M(i11);
                        vnb vnbVar3 = this.J0;
                        linearLayout.setBackground(Y2);
                        yob.j(linearLayout, Y2, null, M2, vnbVar3);
                        iye.a(linearLayout);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i12 = aob.Ml;
                        yob.s(imageView, i12, this.J0, PorterDuff.Mode.SRC_IN);
                        mdaVar = mdaVar3;
                        linearLayout.addView(imageView, tre.p(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        yob.X(textView2, i12, this.J0);
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(ob6.E(r47Var3.k.forwards, ','));
                        linearLayout.addView(textView2, tre.q(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i2 = 8;
                        linearLayout2.addView(linearLayout3, tre.q(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                        if (linearLayout != null) {
                            linearLayout2.addView(linearLayout, tre.q(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                        }
                    }
                }
                mdaVar = mdaVar3;
                linearLayout = null;
                i2 = 11;
                linearLayout2.addView(linearLayout3, tre.q(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                if (linearLayout != null) {
                }
            } else {
                mdaVar = mdaVar3;
                mdaVar2 = mdaVar4;
                f2 = 9.0f;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.q1 = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.t1 = frameLayout5;
                frameLayout4.addView(frameLayout5, tre.d(-1, -1.0f, jn7.D1, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i13 = aob.i6;
                hf0 Y3 = aob.Y(aob.v0(i13, this.J0), 20, 20);
                uob M3 = yob.M(i13);
                vnb vnbVar4 = this.J0;
                textView3.setBackground(Y3);
                yob.j(textView3, Y3, null, M3, vnbVar4);
                yob.X(textView3, this.c2 ? aob.gh : aob.n5, this.J0);
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
                textView3.setTypeface(hl.o());
                textView3.setGravity(17);
                if (!this.c2 || this.j2[1] == null) {
                    textView3.setText(ob6.M0(2131751727, null).toUpperCase());
                } else {
                    textView3.setText(ob6.M0(2131743039, null).toUpperCase());
                }
                textView3.setOnClickListener(new eda(this, (byte) 6));
                frameLayout5.addView(textView3, tre.e(-1, -1, jn7.D1));
                this.b.addView(frameLayout4, tre.e(-1, 58, 87));
                ArrayList arrayList3 = this.I1;
                if (arrayList3 != null && arrayList3.size() > 0 && ((r47) this.I1.get(0)).k != null && ((r47) this.I1.get(0)).k.forwards > 0) {
                    final r47 r47Var4 = (r47) this.I1.get(0);
                    if (xc2.N(uc7.s1(this.a).M0(Long.valueOf(-r47.B0(r47Var4.k)))) && !r47.l3(r47Var4.k)) {
                        LinearLayout linearLayout4 = new LinearLayout(context);
                        this.x1 = linearLayout4;
                        linearLayout4.setOrientation(0);
                        linearLayout4.setGravity(16);
                        hf0 Y4 = aob.Y(aob.v0(this.c2 ? aob.Vg : i13, this.J0), 20, 20);
                        uob M4 = yob.M(this.c2 ? aob.Vg : i13);
                        vnb vnbVar5 = this.J0;
                        linearLayout4.setBackground(Y4);
                        yob.j(linearLayout4, Y4, null, M4, vnbVar5);
                        frameLayout5.addView(linearLayout4, tre.e(-2, -1, 21));
                        final byte b13 = 1;
                        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: lda
                            public final /* synthetic */ kea b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                byte b132 = b13;
                                r47 r47Var42 = r47Var4;
                                kea keaVar = this.b;
                                switch (b132) {
                                    case 0:
                                        e eVar = keaVar.a2;
                                        if (eVar == null) {
                                            eVar = LaunchActivity.S();
                                        }
                                        if (eVar != null) {
                                            keaVar.dismiss();
                                            eVar.presentFragment(new z67(r47Var42));
                                            break;
                                        }
                                        break;
                                    default:
                                        e eVar2 = keaVar.a2;
                                        if (eVar2 == null) {
                                            eVar2 = LaunchActivity.S();
                                        }
                                        if (eVar2 != null) {
                                            keaVar.dismiss();
                                            eVar2.presentFragment(new z67(r47Var42));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        yob.s(imageView2, this.c2 ? aob.gh : aob.n5, this.J0, PorterDuff.Mode.MULTIPLY);
                        linearLayout4.addView(imageView2, tre.t(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(r47Var4.k.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        yob.X(textView4, this.c2 ? aob.gh : aob.n5, this.J0);
                        textView4.setGravity(16);
                        textView4.setTypeface(hl.o());
                        linearLayout4.addView(textView4, tre.t(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        } else {
            this.N1[1].setAlpha(0.0f);
            mdaVar = mdaVar3;
            mdaVar2 = mdaVar4;
            f = 4.0f;
            f2 = 9.0f;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.v1 = frameLayout6;
        this.b.addView(frameLayout6, tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.t1 != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.w1 = frameLayout7;
        this.b.addView(frameLayout7, tre.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        pda pdaVar = new pda(this, context, (byte) 0);
        this.m1 = pdaVar;
        pdaVar.setWillNotDraw(false);
        pdaVar.setAlpha(0.0f);
        pdaVar.setVisibility(4);
        this.b.addView(pdaVar, tre.d(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        pdaVar.setOnTouchListener(new b02((byte) 24));
        ex0 ex0Var = this.c;
        boolean z6 = hl.B(aob.v0(aob.h5, this.J0)) > 0.721f;
        this.S2 = z6;
        hl.j3(ex0Var, z6);
        qda qdaVar = new qda(this, context, xdaVar, this.J0);
        this.n1 = qdaVar;
        qdaVar.K = true;
        if (this.c2) {
            xt3 editText = qdaVar.getEditText();
            int i14 = aob.eh;
            editText.setTextColor(aob.v0(i14, this.J0));
            qdaVar.getEditText().setCursorColor(aob.v0(i14, this.J0));
        }
        qdaVar.setHint(ob6.M0(2131745190, null));
        qdaVar.s();
        qdaVar.setPadding(0, 0, hl.L(84.0f), 0);
        pdaVar.addView(qdaVar, tre.e(-1, -2, 51));
        pdaVar.setClipChildren(false);
        pdaVar.setClipToPadding(false);
        qdaVar.setClipChildren(false);
        qdaVar.getEditText().addTextChangedListener(new rda(this, (byte) 0));
        pda pdaVar2 = new pda(this, context, (byte) 1);
        this.p1 = pdaVar2;
        pdaVar2.setFocusable(true);
        pdaVar2.setFocusableInTouchMode(true);
        pdaVar2.setVisibility(4);
        pdaVar2.setScaleX(0.2f);
        pdaVar2.setScaleY(0.2f);
        pdaVar2.setAlpha(0.0f);
        this.b.addView(pdaVar2, tre.e(jn7.u1, 50, 85));
        di3 di3Var = new di3(this, context, this.J0);
        this.o1 = di3Var;
        int L3 = hl.L(52.0f);
        int L4 = hl.L(38.0f);
        di3Var.L = L3;
        di3Var.M = L4;
        float L5 = hl.L(1.0f);
        float L6 = hl.L(6.0f);
        di3Var.P = L5;
        di3Var.Q = L6;
        di3Var.t0 = true;
        pdaVar2.addView(di3Var, tre.g());
        di3Var.setOnClickListener(new eda(this, (byte) 0));
        di3Var.setOnLongClickListener(new zs(this, (byte) 16));
        this.e2.setTextSize(hl.L(12.0f));
        this.e2.setTypeface(hl.o());
        if (num != null) {
            this.W1 = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.X1 = frameLayout8;
            LinearLayout linearLayout5 = new LinearLayout(context);
            this.Y1 = linearLayout5;
            linearLayout5.setPadding(hl.L(12.0f), hl.L(f), hl.L(12.0f), hl.L(f));
            linearLayout5.setClipToPadding(false);
            linearLayout5.setOrientation(0);
            int i15 = aob.i6;
            yob.R(linearLayout5, aob.Y(T(i15), 6, 6), null, yob.M(i15), this.J0);
            og2 og2Var = new og2(24, this.J0, context);
            this.Z1 = og2Var;
            og2Var.b(aob.h7, aob.j7, aob.k7);
            og2Var.setDrawUnchecked(true);
            og2Var.a(false, false);
            og2Var.setDrawBackgroundAsArc(10);
            linearLayout5.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            yob.X(textView5, i8, this.J0);
            textView5.setTextSize(1, 14.0f);
            textView5.setText(ob6.Z(2131743233, hl.g0(num.intValue(), false, false)));
            linearLayout5.addView(textView5, tre.t(-2, -2, 16, 9, 0, 0, 0));
            iye.b(linearLayout5, 0.025f, 1.5f);
            linearLayout5.setOnClickListener(new eda(this, (byte) 1));
            frameLayout8.addView(linearLayout5, tre.e(-2, -2, 17));
            if (this.q1 == null) {
                View view2 = new View(context);
                yob.h(aob.d7, this.J0, view2);
                frameLayout8.addView(view2, tre.a(-1.0f, this.c2 ? 0.66f : 1.0f / hl.p, 55));
            }
            this.b.addView(frameLayout8, tre.e(-1, 58, 83));
            if (this.q1 == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        rl0 rl0Var = new rl0(this.N2.b(nf9Var, null));
        this.Q2 = rl0Var;
        if (xea.f()) {
            i86.e(262144);
        }
        rl0Var.b(hl.L(72.0f), true);
        jl0 b14 = this.M2.b(this.y2, dtd.f(this.J0));
        this.P2 = b14;
        b14.U = true;
        b14.s(hl.L(29.0f), hl.L(29.0f), 0.0f, 0.0f);
        b14.u(hl.L(32.0f));
        b14.S.g = 0.4f;
        b14.n();
        jl0 b15 = this.L2.b(pdaVar, dtd.f(this.J0));
        this.R2 = b15;
        b15.r(hl.L(22.0f));
        b15.q(hl.L(f2));
        pdaVar.setPadding(hl.L(f2), hl.L(7.0f), hl.L(f2), hl.L(7.0f));
        FrameLayout frameLayout9 = this.t1;
        if (frameLayout9 != null) {
            jl0 b16 = this.L2.b(frameLayout9, dtd.f(this.J0));
            b16.q(hl.L(f2));
            b16.r(hl.L(22.0f));
            this.t1.setBackground(b16);
            this.t1.setPadding(hl.L(f2), hl.L(f2), hl.L(f2), hl.L(f2));
        }
        FrameLayout frameLayout10 = this.X1;
        if (frameLayout10 != null) {
            jl0 b17 = this.L2.b(frameLayout10, dtd.f(this.J0));
            b17.q(hl.L(f2));
            b17.r(hl.L(22.0f));
            this.X1.setBackground(b17);
            this.X1.setPadding(hl.L(f2), hl.L(f2), hl.L(f2), hl.L(f2));
        }
        X0(0);
        uj3.x4(k5.a(this.a));
        if (deaVar.d.isEmpty()) {
            jn7.f(this.a).b(this, jn7.r);
        }
        int i16 = this.a;
        byte b18 = 0;
        jf7.Y(i16).a.c(new bt(i16, (int) b18, (Object) new sda(this), (byte) 6));
        ls6.d0(this.a).O0(true);
        this.X0.i(this.b);
        vy4 vy4Var2 = this.X0;
        vy4Var2.a = new fda(this, b18);
        vy4Var2.d = new gz4(hl.L(48.0f));
        hl.Q3(1.0f, mdaVar, true, false);
        hl.Q3(1.0f, mdaVar2, false, false);
        ex0 ex0Var2 = this.c;
        fda fdaVar = new fda(this, (byte) 1);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(ex0Var2, fdaVar);
    }

    public static kea H0(Context context, r47 r47Var, String str, boolean z, String str2) {
        return new kea(context, r47Var != null ? qd4.t(r47Var) : null, str, null, z, str2, null, false);
    }

    public static void R0(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, vnb vnbVar) {
        int v0 = aob.v0(i, vnbVar);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        int i2 = 0;
        while (i2 < itemsCount) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
            int i3 = 6;
            int i4 = i2 == 0 ? 6 : 0;
            if (i2 != itemsCount - 1) {
                i3 = 0;
            }
            yob.R(childAt, aob.Y(v0, i4, i3), null, yob.M(i), vnbVar);
            i2++;
        }
    }

    @Override // nx0
    public final boolean D() {
        return false;
    }

    public final void E0(boolean z) {
        rq4 rq4Var = this.t2;
        m7 m7Var = rq4Var.r;
        m7 m7Var2 = rq4Var.r;
        boolean isEmpty = TextUtils.isEmpty(m7Var.getText());
        mda mdaVar = this.A1;
        mda mdaVar2 = this.B1;
        boolean z2 = true;
        if (!isEmpty || ((this.d && m7Var2.hasFocus()) || this.H2)) {
            this.v2 = true;
            if (this.x2 == null) {
                hl.T3(mdaVar, false, 0.98f, true, true);
                hl.R3(mdaVar2, true);
            }
        } else {
            if (this.x2 == null) {
                hl.T3(mdaVar, true, 0.98f, true, true);
                hl.R3(mdaVar2, false);
            }
            z2 = false;
        }
        if (this.G2 != z2 || z) {
            this.G2 = z2;
            hea heaVar = this.H1;
            heaVar.f();
            this.F1.f();
            boolean z3 = this.G2;
            int i = this.F2;
            if (z3) {
                if (i == Integer.MAX_VALUE) {
                    ((x46) mdaVar2.getLayoutManager()).g1(0, -mdaVar2.getPaddingTop());
                } else {
                    ((x46) mdaVar2.getLayoutManager()).g1(0, this.F2 - mdaVar2.getPaddingTop());
                }
                heaVar.E(m7Var2.getText().toString());
                return;
            }
            u55 u55Var = this.C1;
            if (i == Integer.MAX_VALUE) {
                u55Var.g1(0, 0);
            } else {
                u55Var.g1(0, 0);
            }
        }
    }

    public final void F0() {
        TLRPC.Dialog dialog = this.x2;
        if (dialog != null) {
            View view = null;
            this.x2 = null;
            byte b = 0;
            for (int i = 0; i < K0().getChildCount(); i++) {
                View childAt = K0().getChildAt(i);
                if ((childAt instanceof nea) && ((nea) childAt).getCurrentDialog() == dialog.id) {
                    view = childAt;
                }
            }
            if (view == null) {
                return;
            }
            vpa vpaVar = this.w2;
            if (vpaVar != null) {
                vpaVar.d();
            }
            K0().setVisibility(0);
            rq4 rq4Var = this.t2;
            rq4Var.setVisibility(0);
            m7 m7Var = rq4Var.r;
            if (this.G2 || this.H2) {
                this.y2.I.v = true;
                m7Var.requestFocus();
                hl.E3(m7Var);
            }
            int[] iArr = new int[2];
            vpa vpaVar2 = new vpa(new xk4(1000.0f));
            wpa wpaVar = new wpa(0.0f);
            zu1 zu1Var = this.a2;
            wpaVar.b((zu1Var == null || !zu1Var.b) ? 800.0f : 10.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            this.w2 = vpaVar2;
            vpaVar2.b(new dda(this, (nea) view, iArr, b));
            this.w2.a(new iw0(this, (byte) 10));
            this.w2.h();
        }
    }

    public final void G0() {
        boolean z = false;
        if (this.f2 == null && this.j2[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", J0()));
            aea aeaVar = this.n2;
            if ((aeaVar == null || !aeaVar.E()) && (this.b2 instanceof LaunchActivity)) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.b2).H0(new k64((byte) 7, z));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0
    public void H() {
        super.H();
        qda qdaVar = this.n1;
        if (qdaVar != null) {
            qdaVar.o();
        }
    }

    public final int I0() {
        mda mdaVar = this.A1;
        if (mdaVar.getChildCount() == 0) {
            return -1000;
        }
        int i = 0;
        View childAt = mdaVar.getChildAt(0);
        n69 n69Var = (n69) mdaVar.H(childAt);
        if (n69Var == null) {
            return -1000;
        }
        int paddingTop = mdaVar.getPaddingTop();
        if (n69Var.c() == 0 && childAt.getTop() >= 0) {
            i = childAt.getTop();
        }
        return paddingTop - i;
    }

    public final String J0() {
        String str;
        String[] strArr = this.j2;
        yda ydaVar = this.R1;
        if (ydaVar != null) {
            str = strArr[ydaVar.e ? 1 : 0];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.f2;
            String str2 = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            str = str2 == null ? strArr[0] : str2;
        }
        og2 og2Var = this.Z1;
        if (og2Var != null && og2Var.a.q) {
            try {
                str = Uri.parse(str).buildUpon().appendQueryParameter("t", hl.n0(this.W1)).build().toString();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return str == null ? "" : str;
    }

    public final d79 K0() {
        return (this.G2 || this.H2) ? this.B1 : this.A1;
    }

    public final void L0(View view, int[] iArr, float f) {
        float width = (view.getWidth() / 2.0f) + view.getX();
        d79 d79Var = this.z1;
        d79Var.setPivotX(width);
        d79Var.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        d79Var.setScaleX(f3);
        d79Var.setScaleY(f3);
        d79Var.setAlpha(f);
        d79 K0 = K0();
        K0.setPivotX((view.getWidth() / 2.0f) + view.getX());
        K0.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        K0.setScaleX(f4);
        K0.setScaleY(f4);
        float f5 = 1.0f - f;
        K0.setAlpha(f5);
        rq4 rq4Var = this.t2;
        rq4Var.setPivotX(rq4Var.getWidth() / 2.0f);
        rq4Var.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        rq4Var.setScaleX(f6);
        rq4Var.setScaleY(f6);
        rq4Var.setAlpha(f5);
        a aVar = this.u2;
        aVar.getBackButton().setTranslationX((-hl.L(16.0f)) * f5);
        aVar.getTitleTextView().setTranslationY(hl.L(16.0f) * f5);
        aVar.getSubtitleTextView().setTranslationY(hl.L(16.0f) * f5);
        aVar.setAlpha(f);
        d79Var.getLocationInWindow(iArr);
        float interpolation = k43.g.getInterpolation(f);
        for (int i = 0; i < K0.getChildCount(); i++) {
            View childAt = K0.getChildAt(i);
            if (childAt instanceof nea) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < d79Var.getChildCount(); i2++) {
            View childAt2 = d79Var.getChildAt(i2);
            if (childAt2 instanceof tea) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * (-((d79Var.getTranslationY() + childAt2.getY()) - view.getY()))));
            }
        }
        this.b.requestLayout();
        K0.invalidate();
    }

    public final void O0(boolean z) {
        byte b = 0;
        View[] viewArr = this.N1;
        if (z) {
            if (viewArr[0].getTag() == null) {
                return;
            }
        } else if (viewArr[0].getTag() != null) {
            return;
        }
        viewArr[0].setTag(z ? null : 1);
        if (z) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.O1;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new vda(this, z, b));
        animatorSetArr[0].start();
    }

    @Override // nx0
    public final int P() {
        return this.b.getMeasuredHeight() - this.S1;
    }

    public final void P0(View view, TLRPC.Dialog dialog) {
        Activity activity;
        ArrayList l;
        gea geaVar;
        if (dialog instanceof cea) {
            N0(view);
            return;
        }
        if (((view instanceof nea) && ((nea) view).G) || ((view instanceof bv8) && ((bv8) view).p0)) {
            T0(dialog.id, view);
            return;
        }
        d79 d79Var = this.z1;
        if (d79Var.getVisibility() != 8 || (activity = this.b2) == null) {
            return;
        }
        boolean y = wf3.y(dialog.id);
        byte b = this.K1;
        if (y) {
            TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-dialog.id));
            if (xc2.T(M0) && !M0.megagroup) {
                TLRPC.Chat M02 = uc7.s1(this.a).M0(Long.valueOf(-dialog.id));
                if ((!xc2.n(M02) && !M02.megagroup) || b == 2 || b == 3) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M03 = ob6.M0(2131745324, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M03;
                    if (b == 3) {
                        if (xc2.P(10, M0)) {
                            idVar.U = ob6.M0(2131751049, null);
                        } else {
                            idVar.U = ob6.M0(2131751050, null);
                        }
                    } else if (b != 2) {
                        idVar.U = ob6.M0(2131752414, null);
                    } else if (this.i2) {
                        idVar.U = ob6.M0(2131746314, null);
                    } else if (xc2.P(10, M0)) {
                        idVar.U = ob6.M0(2131751057, null);
                    } else {
                        idVar.U = ob6.M0(2131751058, null);
                    }
                    ik8.y(null, 2131747558, alertDialog$Builder, null);
                    return;
                }
            }
        } else if (wf3.B(dialog.id) && b != 0) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity);
            String M04 = ob6.M0(2131745324, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M04;
            if (b == 3) {
                idVar2.U = ob6.M0(2131743743, null);
            } else if (b != 0) {
                idVar2.U = ob6.M0(2131746903, null);
            } else {
                idVar2.U = ob6.M0(2131748858, null);
            }
            ik8.y(null, 2131747558, alertDialog$Builder2, null);
            return;
        }
        long j = dialog.id;
        zh6 zh6Var = this.P1;
        if (zh6Var.h(j) >= 0) {
            zh6Var.l(dialog.id);
            this.Q1.remove(dialog);
            if (view instanceof bv8) {
                ((bv8) view).A(false, true);
            } else if (view instanceof nea) {
                ((nea) view).b(false, true);
            }
            X0(1);
        } else {
            TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(dialog.id));
            TLRPC.Chat M05 = uc7.s1(this.a).M0(Long.valueOf(-dialog.id));
            if ((lbc.w(X1) && (((l = uc7.s1(this.a).g4.l(-X1.id)) != null && !l.isEmpty()) || !uc7.s1(this.a).g4.e(-X1.id))) || (wf3.y(dialog.id) && (xc2.c0(M05) || (xc2.p0(M05) && xc2.A(this.a, M05, 24))))) {
                this.x2 = dialog;
                this.D1.g1(0, this.k2 - d79Var.getPaddingTop());
                AtomicReference atomicReference = new AtomicReference();
                tda tdaVar = new tda(this, dialog, atomicReference, view);
                atomicReference.set(new vp8((Object) this, (Object) atomicReference, (Object) tdaVar, (Object) dialog, (byte) 24));
                jn7 f = jn7.f(this.a);
                int i = jn7.t5;
                f.a(tdaVar, i);
                ArrayList l2 = uc7.s1(this.a).g4.l(-dialog.id);
                int i2 = this.a;
                if (l2 != null) {
                    tdaVar.didReceivedNotification(i, i2, Long.valueOf(-dialog.id));
                    return;
                } else {
                    uc7.s1(i2).g4.o(-dialog.id);
                    hl.d3((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            zh6Var.k(dialog.id, dialog);
            if (view instanceof bv8) {
                ((bv8) view).A(true, true);
            } else if (view instanceof nea) {
                ((nea) view).b(true, true);
            }
            X0(2);
            long j2 = yac.h(this.a).n;
            if (this.G2) {
                dea deaVar = this.F1;
                zh6 zh6Var2 = deaVar.e;
                ArrayList arrayList = deaVar.d;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var2.f(dialog.id);
                if (dialog2 == null) {
                    deaVar.e.k(dialog.id, dialog);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j2) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                deaVar.f();
                this.v2 = false;
                rq4 rq4Var = this.t2;
                rq4Var.r.setText("");
                E0(false);
                hl.t1(rq4Var.r);
            }
        }
        hea heaVar = this.H1;
        if (heaVar == null || (geaVar = heaVar.I) == null) {
            return;
        }
        geaVar.l(0, geaVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v32 */
    public final void Q0(final boolean z) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zh6 zh6Var = this.P1;
            int m = zh6Var.m();
            pda pdaVar = this.m1;
            qda qdaVar = this.n1;
            if (i3 >= m) {
                Editable text = qdaVar.getText();
                du3 du3Var = qdaVar.a;
                final CharSequence[] charSequenceArr = {text};
                final ArrayList Y = ls6.d0(this.a).Y(charSequenceArr, true, true);
                og2 og2Var = this.Z1;
                int i4 = (og2Var == null || !og2Var.a.q) ? -1 : this.W1;
                ArrayList arrayList = new ArrayList();
                if (this.I1 != null) {
                    i = 0;
                    while (i2 < zh6Var.m()) {
                        long j = zh6Var.j(i2);
                        long M1 = uc7.s1(this.a).M1(j);
                        if (M1 <= 0) {
                            M1 = wf3.j(uc7.s1(this.a).P2(j));
                        }
                        if (pdaVar.getTag() != null && du3Var.length() > 0 && M1 > 0) {
                            i++;
                        }
                        if (M1 > 0) {
                            i++;
                        }
                        if (M1 > 0 && !arrayList.contains(Long.valueOf(j))) {
                            arrayList.add(Long.valueOf(j));
                        }
                        i2++;
                    }
                } else {
                    yda ydaVar = this.R1;
                    ?? r9 = ydaVar != null ? ydaVar.e : 0;
                    if (this.A2 != null) {
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < zh6Var.m()) {
                            long j2 = zh6Var.j(i5);
                            long M12 = uc7.s1(this.a).M1(j2);
                            if (M12 <= 0) {
                                M12 = wf3.j(uc7.s1(this.a).P2(j2));
                            }
                            int i7 = i2;
                            if (this.A2 != null && pdaVar.getTag() != null && du3Var.length() > 0 && charSequenceArr[i7] != null && M12 > 0) {
                                i6++;
                            }
                            if (M12 > 0) {
                                i6++;
                            }
                            if (M12 > 0 && !arrayList.contains(Long.valueOf(j2))) {
                                arrayList.add(Long.valueOf(j2));
                            }
                            i5++;
                            i2 = i7;
                        }
                        i = i6;
                    } else {
                        int i8 = 0;
                        if (this.J1[r9] != null) {
                            for (int i9 = 0; i9 < zh6Var.m(); i9++) {
                                long j3 = zh6Var.j(i9);
                                long M13 = uc7.s1(this.a).M1(j3);
                                if (M13 <= 0) {
                                    M13 = wf3.j(uc7.s1(this.a).P2(j3));
                                }
                                if (pdaVar.getTag() != null && du3Var.length() > 0 && M13 > 0) {
                                    i8++;
                                }
                                if (M13 > 0) {
                                    i8++;
                                }
                                if (M13 > 0 && !arrayList.contains(Long.valueOf(j3))) {
                                    arrayList.add(Long.valueOf(j3));
                                }
                            }
                        }
                        i = i8;
                    }
                }
                final int i10 = i4;
                jj.Z(this.a, arrayList, i, new pcc() { // from class: kda
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v10, types: [vnb] */
                    /* JADX WARN: Type inference failed for: r11v12 */
                    /* JADX WARN: Type inference failed for: r11v9 */
                    /* JADX WARN: Type inference failed for: r12v1 */
                    /* JADX WARN: Type inference failed for: r12v2 */
                    /* JADX WARN: Type inference failed for: r12v9 */
                    @Override // pcc
                    public final void a(Object obj) {
                        int i11;
                        boolean z2;
                        int i12;
                        HashMap hashMap;
                        long j4;
                        boolean z3;
                        char c;
                        r47 r47Var;
                        qda qdaVar2;
                        long longValue;
                        String[] strArr;
                        boolean z4;
                        long j5;
                        int i13;
                        Long l;
                        r47 r47Var2;
                        p7a b;
                        ArrayList arrayList2;
                        TLRPC.TL_forumTopic tL_forumTopic;
                        int i14;
                        boolean z5;
                        long j6;
                        Long l2;
                        CharSequence[] charSequenceArr2;
                        r47 r47Var3;
                        r47 r47Var4;
                        ArrayList arrayList3;
                        ?? r11;
                        HashMap hashMap2 = (HashMap) obj;
                        kea keaVar = kea.this;
                        String[] strArr2 = keaVar.J1;
                        pda pdaVar2 = keaVar.m1;
                        qda qdaVar3 = keaVar.n1;
                        HashMap hashMap3 = keaVar.Q1;
                        Long l3 = 0L;
                        zh6 zh6Var2 = keaVar.P1;
                        ArrayList arrayList4 = keaVar.I1;
                        CharSequence[] charSequenceArr3 = charSequenceArr;
                        ArrayList arrayList5 = Y;
                        boolean z6 = z;
                        if (arrayList4 != null) {
                            ArrayList arrayList6 = new ArrayList();
                            int i15 = 0;
                            boolean z7 = false;
                            while (true) {
                                if (i15 >= zh6Var2.m()) {
                                    arrayList2 = arrayList4;
                                    tL_forumTopic = null;
                                    break;
                                }
                                boolean z8 = z6;
                                long j7 = zh6Var2.j(i15);
                                boolean B2 = uc7.s1(keaVar.a).B2(j7);
                                pda pdaVar3 = pdaVar2;
                                Long l4 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j7));
                                boolean z9 = (l4 == null || l4.longValue() <= 0) ? z7 : true;
                                Long l5 = l4;
                                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.f(j7));
                                if (tL_forumTopic2 == null || !B2) {
                                    i14 = i15;
                                    z5 = B2;
                                    j6 = 0;
                                } else {
                                    i14 = i15;
                                    z5 = B2;
                                    j6 = wf3.n(tL_forumTopic2.from_id);
                                }
                                if (tL_forumTopic2 == null || z5) {
                                    l2 = l3;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    r47Var3 = null;
                                } else {
                                    l2 = l3;
                                    arrayList2 = arrayList4;
                                    charSequenceArr2 = charSequenceArr3;
                                    r47Var3 = new r47(keaVar.a, tL_forumTopic2.topicStartMessage, false, false);
                                }
                                if (r47Var3 != null) {
                                    r47Var3.p = true;
                                }
                                if (pdaVar3.getTag() == null || qdaVar3.a.length() <= 0) {
                                    r47Var4 = r47Var3;
                                    arrayList3 = arrayList5;
                                    r11 = 0;
                                } else {
                                    CharSequence charSequence = charSequenceArr2[0];
                                    r11 = 0;
                                    r47Var4 = r47Var3;
                                    ArrayList arrayList7 = arrayList5;
                                    p7a b2 = p7a.b(charSequence == null ? null : charSequence.toString(), j7, r47Var4, r47Var3, null, true, arrayList7, null, null, z8, 0, 0, null, false);
                                    arrayList3 = arrayList7;
                                    z8 = z8;
                                    b2.Q = l5 == null ? 0L : l5.longValue();
                                    b2.R = j6;
                                    r7a.B(keaVar.a).q0(b2);
                                }
                                boolean z10 = z8;
                                int p0 = r7a.B(keaVar.a).p0(keaVar.I1, j7, !keaVar.D2, false, z10, 0, 0, r47Var4, i10, l5 == null ? 0L : l5.longValue(), j6, null);
                                if (p0 != 0) {
                                    arrayList6.add(Long.valueOf(j7));
                                }
                                if (zh6Var2.m() == 1) {
                                    jj.q0(p0, r11, keaVar.a2);
                                    if (p0 != 0) {
                                        z7 = z9;
                                        tL_forumTopic = r11;
                                        break;
                                    }
                                }
                                i15 = i14 + 1;
                                arrayList5 = arrayList3;
                                z6 = z10;
                                pdaVar2 = pdaVar3;
                                z7 = z9;
                                l3 = l2;
                                arrayList4 = arrayList2;
                                charSequenceArr3 = charSequenceArr2;
                            }
                            int size = arrayList6.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj2 = arrayList6.get(i16);
                                i16++;
                                long longValue2 = ((Long) obj2).longValue();
                                TLRPC.Dialog dialog = (TLRPC.Dialog) zh6Var2.f(longValue2);
                                zh6Var2.l(longValue2);
                                if (dialog != null) {
                                    hashMap3.remove(dialog);
                                }
                            }
                            if (!zh6Var2.i()) {
                                keaVar.M0(zh6Var2, arrayList2.size(), zh6Var2.m() == 1 ? (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.n(0)) : tL_forumTopic, !z7);
                            }
                        } else {
                            boolean z11 = z6;
                            yda ydaVar2 = keaVar.R1;
                            ?? r12 = ydaVar2 != null ? ydaVar2.e : 0;
                            if (keaVar.A2 != null) {
                                int i17 = 0;
                                boolean z12 = false;
                                while (i17 < zh6Var2.m()) {
                                    long j8 = zh6Var2.j(i17);
                                    boolean B22 = uc7.s1(keaVar.a).B2(j8);
                                    Long l6 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j8));
                                    if (l6 != null && l6.longValue() > 0) {
                                        z12 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.f(j8));
                                    if (tL_forumTopic3 == null || !B22) {
                                        strArr = strArr2;
                                        z4 = z12;
                                        j5 = 0;
                                    } else {
                                        strArr = strArr2;
                                        z4 = z12;
                                        j5 = wf3.n(tL_forumTopic3.from_id);
                                    }
                                    if (tL_forumTopic3 == null || B22) {
                                        i13 = i17;
                                        l = l6;
                                        r47Var2 = null;
                                    } else {
                                        i13 = i17;
                                        l = l6;
                                        r47Var2 = new r47(keaVar.a, tL_forumTopic3.topicStartMessage, false, false);
                                    }
                                    if (keaVar.A2 != null) {
                                        if (pdaVar2.getTag() != null && qdaVar3.a.length() > 0 && charSequenceArr3[0] != null) {
                                            r47 r47Var5 = r47Var2;
                                            r47Var2 = r47Var5;
                                            r7a.B(keaVar.a).q0(p7a.b(charSequenceArr3[0].toString(), j8, null, r47Var5, null, true, null, null, null, z11, 0, 0, null, false));
                                        }
                                        b = p7a.b(null, j8, r47Var2, r47Var2, null, true, null, null, null, z11, 0, 0, null, false);
                                        b.I = keaVar.A2;
                                    } else if (pdaVar2.getTag() == null || qdaVar3.a.length() <= 0) {
                                        b = p7a.b(strArr[r12], j8, r47Var2, r47Var2, null, true, null, null, null, z11, 0, 0, null, false);
                                    } else {
                                        CharSequence charSequence2 = charSequenceArr3[0];
                                        boolean z13 = z11;
                                        b = p7a.b(charSequence2 == null ? null : charSequence2.toString(), j8, r47Var2, r47Var2, null, true, arrayList5, null, null, z13, 0, 0, null, false);
                                        z11 = z13;
                                    }
                                    b.Q = l == null ? 0L : l.longValue();
                                    b.R = j5;
                                    r7a.B(keaVar.a).q0(b);
                                    i17 = i13 + 1;
                                    z12 = z4;
                                    strArr2 = strArr;
                                }
                                z2 = z12;
                            } else if (strArr2[r12] != null) {
                                int i18 = 0;
                                boolean z14 = false;
                                while (i18 < zh6Var2.m()) {
                                    long j9 = zh6Var2.j(i18);
                                    boolean B23 = uc7.s1(keaVar.a).B2(j9);
                                    Long l7 = hashMap2 == null ? l3 : (Long) hashMap2.get(Long.valueOf(j9));
                                    if (l7 != null && l7.longValue() > 0) {
                                        z14 = true;
                                    }
                                    TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.f(j9));
                                    if (tL_forumTopic4 == null || !B23) {
                                        i12 = i18;
                                        hashMap = hashMap2;
                                        j4 = 0;
                                    } else {
                                        i12 = i18;
                                        hashMap = hashMap2;
                                        j4 = wf3.n(tL_forumTopic4.from_id);
                                    }
                                    if (tL_forumTopic4 == null || B23) {
                                        z3 = z14;
                                        c = 0;
                                        r47Var = null;
                                    } else {
                                        z3 = z14;
                                        c = 0;
                                        r47Var = new r47(keaVar.a, tL_forumTopic4.topicStartMessage, false, false);
                                    }
                                    if (pdaVar2.getTag() == null || qdaVar3.a.length() <= 0) {
                                        qdaVar2 = qdaVar3;
                                    } else {
                                        CharSequence charSequence3 = charSequenceArr3[c];
                                        boolean z15 = z11;
                                        p7a b3 = p7a.b(charSequence3 == null ? null : charSequence3.toString(), j9, r47Var, r47Var, null, true, arrayList5, null, null, z15, 0, 0, null, false);
                                        z11 = z15;
                                        if (l7 == null) {
                                            qdaVar2 = qdaVar3;
                                            longValue = 0;
                                        } else {
                                            qdaVar2 = qdaVar3;
                                            longValue = l7.longValue();
                                        }
                                        b3.Q = longValue;
                                        b3.R = j4;
                                        r7a.B(keaVar.a).q0(b3);
                                    }
                                    r47 r47Var6 = r47Var;
                                    p7a b4 = p7a.b(strArr2[r12], j9, r47Var6, r47Var6, null, true, null, null, null, z11, 0, 0, null, false);
                                    b4.Q = l7 == null ? 0L : l7.longValue();
                                    b4.R = j4;
                                    r7a.B(keaVar.a).q0(b4);
                                    i18 = i12 + 1;
                                    z14 = z3;
                                    qdaVar3 = qdaVar2;
                                    hashMap2 = hashMap;
                                }
                                z2 = z14;
                            } else {
                                i11 = 0;
                                z2 = false;
                                keaVar.M0(zh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.n(i11)), !z2);
                            }
                            i11 = 0;
                            keaVar.M0(zh6Var2, 1, (TLRPC.TL_forumTopic) hashMap3.get(zh6Var2.n(i11)), !z2);
                        }
                        aea aeaVar = keaVar.n2;
                        if (aeaVar != null) {
                            aeaVar.u();
                        }
                        keaVar.dismiss();
                    }
                });
                return;
            }
            if (jj.h(getContext(), this.a, zh6Var.j(i3), pdaVar.getTag() != null && qdaVar.a.length() > 0)) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void S0(boolean z) {
        pda pdaVar = this.m1;
        byte b = 1;
        if (z == (pdaVar.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.y1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        pdaVar.setTag(z ? 1 : null);
        qda qdaVar = this.n1;
        if (qdaVar.getEditText().isFocused()) {
            hl.t1(qdaVar.getEditText());
        }
        qdaVar.k(true);
        FrameLayout frameLayout = this.X1;
        pda pdaVar2 = this.p1;
        FrameLayout frameLayout2 = this.q1;
        if (z) {
            pdaVar.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            pdaVar2.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i = z ? 4 : 1;
            WeakHashMap weakHashMap = ihc.a;
            frameLayout2.setImportantForAccessibility(i);
        }
        LinearLayout linearLayout = this.x1;
        if (linearLayout != null) {
            int i2 = z ? 4 : 1;
            WeakHashMap weakHashMap2 = ihc.a;
            linearLayout.setImportantForAccessibility(i2);
        }
        this.y1 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float f = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(pdaVar, (Property<pda, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(pdaVar2, (Property<pda, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(pdaVar2, (Property<pda, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(pdaVar2, (Property<pda, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.N1[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.t1;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.c2 && z) {
                f = hl.L(this.Y1 != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, f));
        }
        this.y1.playTogether(arrayList);
        this.y1.setInterpolator(new DecelerateInterpolator());
        this.y1.setDuration(180L);
        this.y1.addListener(new vda(this, z, b));
        this.y1.start();
    }

    public final void T0(long j, View view) {
        int i = -this.C2;
        this.C2 = i;
        hl.A3(i, view, null);
        yw0.E.a();
        String r = j >= 0 ? lbc.r(uc7.s1(this.a).X1(Long.valueOf(j))) : "";
        boolean M3 = uc7.s1(this.a).M3();
        vnb vnbVar = this.J0;
        byte b = 1;
        FrameLayout frameLayout = this.v1;
        (M3 ? new d31(frameLayout, vnbVar).Q(R.raw.star_premium_2, 36, hl.S2(ob6.a0(null, null, 2131743415, r))) : new d31(frameLayout, vnbVar).K(R.raw.star_premium_2, hl.S2(ob6.a0(null, null, 2131743415, r)), ob6.M0(2131743414, null), new gda(this, b))).j();
    }

    public final void U0() {
        hb hbVar;
        pda pdaVar = this.m1;
        if (pdaVar == null) {
            return;
        }
        qda qdaVar = this.n1;
        if (qdaVar == null || !qdaVar.m()) {
            xda xdaVar = this.y2;
            if (xdaVar != null && (hbVar = xdaVar.I) != null && !hbVar.f) {
                Typeface typeface = hl.a;
            }
        } else {
            qdaVar.getEmojiPaddingShown();
        }
        float f = 0.0f;
        FrameLayout frameLayout = this.X1;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            f = 0.0f + hl.L(48.0f);
        }
        FrameLayout frameLayout2 = this.q1;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY(-f);
        }
        float f2 = -f;
        pdaVar.setTranslationY(f2);
        this.p1.setTranslationY(f2);
    }

    public final void V0() {
        if (this.m2) {
            return;
        }
        boolean z = this.G2;
        mda mdaVar = this.A1;
        mda mdaVar2 = this.B1;
        mda mdaVar3 = z ? mdaVar2 : mdaVar;
        if (mdaVar3.getChildCount() > 0) {
            View childAt = mdaVar3.getChildAt(0);
            for (int i = 0; i < mdaVar3.getChildCount(); i++) {
                if (mdaVar3.getChildAt(i).getTop() < childAt.getTop()) {
                    childAt = mdaVar3.getChildAt(i);
                }
            }
            n69 n69Var = (n69) mdaVar3.H(childAt);
            int top = childAt.getTop() - hl.L(8.0f);
            int i2 = (top <= 0 || n69Var == null || n69Var.b() != 0) ? 0 : top;
            if (top < 0 || n69Var == null || n69Var.b() != 0) {
                this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                O0(true);
                top = i2;
            } else {
                this.F2 = childAt.getTop();
                O0(false);
            }
            d79 d79Var = this.z1;
            if (d79Var.getVisibility() == 0) {
                if (d79Var.getChildCount() <= 0) {
                    return;
                }
                View childAt2 = d79Var.getChildAt(0);
                for (int i3 = 0; i3 < d79Var.getChildCount(); i3++) {
                    if (d79Var.getChildAt(i3).getTop() < childAt2.getTop()) {
                        childAt2 = d79Var.getChildAt(i3);
                    }
                }
                n69 n69Var2 = (n69) d79Var.H(childAt2);
                int top2 = childAt2.getTop() - hl.L(8.0f);
                int i4 = (top2 <= 0 || n69Var2 == null || n69Var2.b() != 0) ? 0 : top2;
                if (top2 < 0 || n69Var2 == null || n69Var2.b() != 0) {
                    this.F2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    O0(true);
                    top2 = i4;
                } else {
                    this.F2 = childAt2.getTop();
                    O0(false);
                }
                top = hl.U1(d79Var.getAlpha(), top, top2);
            }
            int i5 = this.k2;
            if (i5 != top) {
                this.l2 = i5;
                float f = top;
                int i6 = (int) (this.o2 + f);
                this.k2 = i6;
                mdaVar.setTopGlowOffset(i6);
                int i7 = (int) (this.o2 + f);
                this.k2 = i7;
                mdaVar2.setTopGlowOffset(i7);
                int i8 = (int) (f + this.o2);
                this.k2 = i8;
                d79Var.setTopGlowOffset(i8);
                this.l1.setTranslationY(this.k2 + this.o2);
                this.L1.setTranslationY(this.k2 + this.o2);
                this.b.invalidate();
            }
        }
    }

    public final void W0() {
        ema emaVar = this.u1;
        if (emaVar != null) {
            String J0 = J0();
            if (J0.startsWith("https://")) {
                J0 = J0.substring(8);
            } else if (J0.startsWith("http://")) {
                J0 = J0.substring(7);
            }
            emaVar.l(J0, false);
        }
    }

    public final void X0(int i) {
        zh6 zh6Var = this.P1;
        if (zh6Var.m() == 0) {
            S0(false);
            return;
        }
        ArrayList arrayList = this.I1;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.m1.getTag();
        qda qdaVar = this.n1;
        if (tag != null && qdaVar.a.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < zh6Var.m(); i2++) {
            long j2 = ((TLRPC.Dialog) zh6Var.n(i2)).id;
            long M1 = uc7.s1(this.a).M1(j2);
            if (M1 <= 0) {
                M1 = wf3.j(uc7.s1(this.a).P2(j2));
            }
            j += M1;
        }
        int max = Math.max(1, zh6Var.m());
        boolean z = i != 0;
        di3 di3Var = this.o1;
        di3Var.g(max, z);
        di3Var.i(size, j, i != 0);
        S0(true);
        qdaVar.setPadding(0, 0, Math.max(hl.L(84.0f), di3Var.l()), 0);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.r;
        if (i == i3) {
            dea deaVar = this.F1;
            if (deaVar != null) {
                deaVar.E();
            }
            jn7.f(this.a).n(this, i3);
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        qda qdaVar = this.n1;
        if (qdaVar != null) {
            hl.t1(qdaVar.getEditText());
        }
        this.T1 = false;
        super.dismiss();
        jn7.f(this.a).n(this, jn7.r);
    }

    @Override // nx0, android.app.Dialog
    public final void onBackPressed() {
        if (this.x2 != null) {
            F0();
            return;
        }
        qda qdaVar = this.n1;
        if (qdaVar == null || !qdaVar.e) {
            super.onBackPressed();
        } else {
            qdaVar.k(true);
        }
    }

    @Override // nx0
    public final void p0() {
        try {
            super.p0();
            oz4 oz4Var = this.K2;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.d6, this.J0));
            }
            ex0 ex0Var = this.c;
            if (ex0Var != null) {
                boolean z = hl.B(aob.v0(aob.h5, this.J0)) > 0.721f;
                if (z != this.S2) {
                    this.S2 = z;
                    hl.j3(ex0Var, z);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void N0(View view) {
    }

    public void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public kea(Context context, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        this(context, null, arrayList, str, str2, z, str3, str4, false, z2, false, null, null);
    }

    public kea(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, vnb vnbVar) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, vnbVar);
    }
}
