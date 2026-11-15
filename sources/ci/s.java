package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.b6;
import bi.y1;
import bi.z4;
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.j6;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.wi0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class s extends FrameLayout implements is {
    public static final long[] L = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter M = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet E;
    public boolean F;
    public boolean G;
    public final HashSet H;
    public final HashSet I;
    public ArrayList J;
    public boolean K;
    public final int a;
    public final f0 b;
    public final m c;
    public final v4.s d;
    public final k e;
    public final wi0 f;
    public final r h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean w;
    public final boolean x;
    public int y;

    public s(Context context, int i7, f0 f0Var) {
        super(context);
        g0 g0Var = (g0) this;
        k kVar = new k(g0Var);
        this.e = kVar;
        this.n = new ArrayList();
        this.r = 7;
        this.y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.a = i7;
        this.b = f0Var;
        this.x = m10.i(i7).q();
        m mVar = new m(context, null);
        this.c = mVar;
        v4.s sVar = new v4.s(this.r);
        this.d = sVar;
        sVar.O = new y1(g0Var, 3);
        mVar.setLayoutManager(sVar);
        wi0 wi0Var = new wi0(mVar, sVar);
        this.f = wi0Var;
        wi0Var.i = new h(g0Var, 0);
        mVar.setAdapter(kVar);
        mVar.setSelectorDrawableColor(0);
        mVar.setOnItemClickListener(new b6(f0Var, 1));
        mVar.setItemAnimator(null);
        mVar.setOverScrollMode(2);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setClipToPadding(false);
        mVar.j(new z4(g0Var, 5));
        addView(mVar, ja.c(-1.0f, -1));
        r rVar = new r(g0Var, context);
        this.h = rVar;
        addView(rVar, ja.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(M);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        return (drawable instanceof g5) && gj.C4(((g5) drawable).e);
    }

    public final ArrayList a() {
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : np.s1(this.a).f7.getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.J.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.J;
    }

    public final int c() {
        int R;
        m mVar = this.c;
        int paddingTop = mVar.getPaddingTop();
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = -1;
        for (int i11 = 0; i11 < mVar.getChildCount(); i11++) {
            View childAt = mVar.getChildAt(i11);
            this.d.getClass();
            int z10 = v4.o0.z(childAt);
            if (z10 >= paddingTop && z10 < i7 && (R = RecyclerView.R(childAt)) != -1) {
                i10 = R;
                i7 = z10;
            }
        }
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.x0 && objArr.length > 0) {
            Object obj = objArr[0];
            if ((obj instanceof Integer) && ((Integer) obj).intValue() != 5) {
                return;
            }
        }
        e();
    }

    public final void e() {
        String str;
        String str2;
        long j3;
        long j10;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        String str3;
        ArrayList<Long> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        int i7;
        HashSet hashSet;
        TLRPC.Document document;
        String str4;
        HashSet hashSet2;
        ArrayList<TLRPC.Document> arrayList4;
        int i10 = this.a;
        si b02 = si.b0(i10);
        ArrayList<o> arrayList5 = this.n;
        arrayList5.clear();
        ArrayList arrayList6 = new ArrayList();
        ArrayList s02 = b02.s0(5);
        int size = s02.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i12 >= size) {
                break;
            }
            Object obj = s02.get(i12);
            i12++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList7 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList8 = tL_messages_stickerSet.documents;
                int size2 = arrayList8.size();
                int i13 = 0;
                while (i13 < size2) {
                    TLRPC.Document document2 = arrayList8.get(i13);
                    i13++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList7.add(document3);
                    }
                }
                if (!arrayList7.isEmpty()) {
                    arrayList6.add(new o(2, tL_messages_stickerSet.set.title, arrayList7));
                }
            }
        }
        int i14 = 4;
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet l02 = si.b0(i10).l0(tL_inputStickerSetShortName, null, false, true, new ai.f0(this, i14));
            if (l02 != null && (arrayList4 = l02.documents) != null && !arrayList4.isEmpty()) {
                this.E = l02;
            }
        }
        ArrayList arrayList9 = new ArrayList(21);
        HashSet hashSet3 = this.I;
        hashSet3.clear();
        if (this.E != null || this.G) {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.E;
            if (tL_messages_stickerSet2 != null && (arrayList3 = tL_messages_stickerSet2.documents) != null) {
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    TLRPC.Document document4 = arrayList3.get(i15);
                    i15++;
                    TLRPC.Document document5 = document4;
                    String str5 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.id), document5);
                    }
                    str = str5;
                }
            }
            str2 = str;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.E;
            if (tL_messages_stickerSet3 != null && (arrayList = tL_messages_stickerSet3.packs) != null) {
                int size4 = arrayList.size();
                int i16 = 0;
                while (i16 < size4) {
                    TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i16);
                    i16++;
                    TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                    j3 = 0;
                    if (tL_stickerPack2 != null && (str3 = tL_stickerPack2.emoticon) != null && str3.replace("️", "").equals("❄") && (arrayList2 = tL_stickerPack2.documents) != null && !arrayList2.isEmpty()) {
                        j10 = tL_stickerPack2.documents.get(0).longValue();
                        break;
                    }
                }
            }
            j3 = 0;
            j10 = 0;
            int i17 = 0;
            for (int i18 = 21; i17 < i18; i18 = 21) {
                long j11 = (i17 == 4 && j10 != j3 && hashMap.containsKey(Long.valueOf(j10))) ? j10 : L[i17];
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j11));
                if (document6 == null) {
                    document6 = g5.e(i10, j11);
                }
                if (document6 != null) {
                    arrayList9.add(document6);
                    hashSet3.add(Long.valueOf(document6.id));
                } else if (this.H.add(Long.valueOf(j11))) {
                    g5.g(i10).b(j11, new d5() { // from class: ci.g
                        @Override // org.telegram.ui.Components.d5
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.h3(new c1.c(8, s.this, document7));
                        }
                    });
                }
                i17++;
            }
        } else {
            for (int i19 = 0; i19 < 21; i19++) {
                arrayList9.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        }
        if (!arrayList9.isEmpty()) {
            arrayList5.add(new o(0, hd.M0(2131746497, null), arrayList9));
        }
        ArrayList arrayList10 = new ArrayList();
        HashSet hashSet4 = new HashSet();
        int i20 = this.r * 3;
        ArrayList a10 = a();
        int i21 = 0;
        while (i21 < a10.size() && arrayList10.size() < i20) {
            long longValue = ((Long) a10.get(i21)).longValue();
            int size5 = arrayList9.size();
            int i22 = i11;
            while (true) {
                if (i22 >= size5) {
                    hashSet = hashSet4;
                    document = null;
                    break;
                }
                Object obj2 = arrayList9.get(i22);
                i22++;
                document = (TLRPC.Document) obj2;
                hashSet = hashSet4;
                if (document.id == longValue) {
                    break;
                } else {
                    hashSet4 = hashSet;
                }
            }
            if (document == null) {
                document = g5.e(i10, longValue);
            }
            if (document != null) {
                str4 = str2;
                if (str4.equals(document.mime_type)) {
                    hashSet2 = hashSet;
                    if (hashSet2.add(Long.valueOf(document.id))) {
                        arrayList10.add(document);
                    }
                    i21++;
                    str2 = str4;
                    hashSet4 = hashSet2;
                    i11 = 0;
                }
            } else {
                str4 = str2;
            }
            hashSet2 = hashSet;
            i21++;
            str2 = str4;
            hashSet4 = hashSet2;
            i11 = 0;
        }
        HashSet hashSet5 = hashSet4;
        String str6 = str2;
        int i23 = 0;
        while (true) {
            ArrayList arrayList11 = j6.i;
            if (i23 >= arrayList11.size() || arrayList10.size() >= i20) {
                break;
            }
            String str7 = (String) arrayList11.get(i23);
            if (str7 != null && str7.startsWith("animated_")) {
                try {
                    TLRPC.Document e10 = g5.e(i10, Long.parseLong(str7.substring(9)));
                    if ((e10 != null && str6.equals(e10.mime_type)) && hashSet5.add(Long.valueOf(e10.id))) {
                        arrayList10.add(e10);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i23++;
        }
        if (arrayList10.isEmpty()) {
            i7 = 1;
        } else {
            i7 = 1;
            arrayList5.add(new o(1, hd.M0(2131746361, null), arrayList10));
        }
        arrayList5.addAll(arrayList6);
        int size6 = arrayList5.size();
        int i24 = 0;
        int i25 = 0;
        while (i25 < size6) {
            o oVar = arrayList5.get(i25);
            i25++;
            o oVar2 = oVar;
            oVar2.d = i24;
            i24 += oVar2.c.size() + (oVar2.b != null ? i7 : 0);
        }
        this.s = i24;
        this.e.f();
        r rVar = this.h;
        rVar.setSections(arrayList5);
        rVar.a(f(c()), false);
    }

    public final int f(int i7) {
        ArrayList arrayList = this.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).d <= i7) {
                return size;
            }
        }
        return 0;
    }

    public m getGrid() {
        return this.c;
    }

    public r getTabs() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        ns.f(i7).c(this, ns.x0);
        ns.f(i7).c(this, ns.B0);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        ns.f(i7).n(this, ns.x0);
        ns.f(i7).n(this, ns.B0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        m mVar = this.c;
        int max = Math.max(5, ((i7 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.y1(max);
            post(new ch.w(this, 1));
        }
    }

    public void setHeaderColor(int i7) {
        if (this.y == i7) {
            return;
        }
        this.y = i7;
        int i10 = 0;
        while (true) {
            m mVar = this.c;
            if (i10 >= mVar.getChildCount()) {
                return;
            }
            View childAt = mVar.getChildAt(i10);
            if (childAt instanceof n) {
                ((n) childAt).a.setTextColor(i7);
            }
            i10++;
        }
    }
}
