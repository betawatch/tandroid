package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.k8;
import bi.u1;
import bi.w2;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class s extends FrameLayout implements gs {
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
    public final g0 b;
    public final m c;
    public final v4.t d;
    public final k e;
    public final k5 f;
    public final r h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean w;
    public final boolean x;
    public int y;

    public s(Context context, int i7, g0 g0Var) {
        super(context);
        h0 h0Var = (h0) this;
        k kVar = new k(h0Var);
        this.e = kVar;
        this.n = new ArrayList();
        this.r = 7;
        this.y = -1711276033;
        this.H = new HashSet();
        this.I = new HashSet();
        this.a = i7;
        this.b = g0Var;
        this.x = k10.i(i7).q();
        m mVar = new m(context, null);
        this.c = mVar;
        v4.t tVar = new v4.t(this.r);
        this.d = tVar;
        tVar.O = new w2(h0Var, 3);
        mVar.setLayoutManager(tVar);
        k5 k5Var = new k5(mVar, tVar);
        this.f = k5Var;
        k5Var.r = new h(h0Var, 0);
        mVar.setAdapter(kVar);
        mVar.setSelectorDrawableColor(0);
        mVar.setOnItemClickListener(new k8(g0Var, 1));
        mVar.setItemAnimator(null);
        mVar.setOverScrollMode(2);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setClipToPadding(false);
        mVar.j(new u1(h0Var, 6));
        addView(mVar, ma.c(-1.0f, -1));
        r rVar = new r(h0Var, context);
        this.h = rVar;
        addView(rVar, ma.e(-1, 36, 48));
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
        return (drawable instanceof p5) && gj.C4(((p5) drawable).e);
    }

    public final ArrayList a() {
        if (this.J == null) {
            this.J = new ArrayList();
            for (String str : np.u1(this.a).h7.getString("qrAppliedEmoji", "").split(",")) {
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
            int z10 = v4.p0.z(childAt);
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

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.x0 && objArr.length > 0) {
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
        ArrayList arrayList4;
        int i10;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList5;
        int i11 = this.a;
        si d02 = si.d0(i11);
        ArrayList<o> arrayList6 = this.n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList u02 = d02.u0(5);
        int size = u02.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i13 >= size) {
                break;
            }
            Object obj = u02.get(i13);
            i13++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null && tL_messages_stickerSet.documents != null) {
                ArrayList arrayList8 = new ArrayList();
                ArrayList<TLRPC.Document> arrayList9 = tL_messages_stickerSet.documents;
                int size2 = arrayList9.size();
                int i14 = 0;
                while (i14 < size2) {
                    TLRPC.Document document2 = arrayList9.get(i14);
                    i14++;
                    TLRPC.Document document3 = document2;
                    if (document3 != null && "application/x-tgsticker".equals(document3.mime_type)) {
                        arrayList8.add(document3);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    arrayList7.add(new o(2, tL_messages_stickerSet.set.title, arrayList8));
                }
            }
        }
        if (this.E == null && !this.F) {
            this.F = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet n02 = si.d0(i11).n0(tL_inputStickerSetShortName, null, false, true, new ai.h0(this, 6));
            if (n02 != null && (arrayList5 = n02.documents) != null && !arrayList5.isEmpty()) {
                this.E = n02;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.I;
        hashSet.clear();
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
                    String str4 = str;
                    if (document5 != null) {
                        hashMap.put(Long.valueOf(document5.id), document5);
                    }
                    str = str4;
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
            while (i17 < 21) {
                long j11 = (i17 == 4 && j10 != j3 && hashMap.containsKey(Long.valueOf(j10))) ? j10 : L[i17];
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j11));
                if (document6 == null) {
                    document6 = p5.e(i11, j11);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.id));
                } else if (this.H.add(Long.valueOf(j11))) {
                    p5.g(i11).b(j11, new m5() { // from class: ci.g
                        @Override // org.telegram.ui.Components.m5
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.g3(new c1.a(9, s.this, document7));
                        }
                    });
                }
                i17++;
            }
        } else {
            for (int i18 = 0; i18 < 21; i18++) {
                arrayList10.add(new TLRPC.TL_documentEmpty());
            }
            str2 = "application/x-tgsticker";
        }
        if (!arrayList10.isEmpty()) {
            arrayList6.add(new o(0, hd.N0(2131746301, null), arrayList10));
        }
        ArrayList arrayList11 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i19 = this.r * 3;
        ArrayList a10 = a();
        int i20 = 0;
        while (i20 < a10.size() && arrayList11.size() < i19) {
            long longValue = ((Long) a10.get(i20)).longValue();
            int size5 = arrayList10.size();
            while (true) {
                if (i12 >= size5) {
                    arrayList4 = a10;
                    i10 = i20;
                    document = null;
                    break;
                }
                Object obj2 = arrayList10.get(i12);
                i12++;
                document = (TLRPC.Document) obj2;
                arrayList4 = a10;
                i10 = i20;
                if (document.id == longValue) {
                    break;
                }
                a10 = arrayList4;
                i20 = i10;
            }
            if (document == null) {
                document = p5.e(i11, longValue);
            }
            if (document != null && str2.equals(document.mime_type) && hashSet2.add(Long.valueOf(document.id))) {
                arrayList11.add(document);
            }
            i20 = i10 + 1;
            a10 = arrayList4;
            i12 = 0;
        }
        int i21 = 0;
        while (true) {
            ArrayList arrayList12 = j6.i;
            if (i21 >= arrayList12.size() || arrayList11.size() >= i19) {
                break;
            }
            String str5 = (String) arrayList12.get(i21);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document e10 = p5.e(i11, Long.parseLong(str5.substring(9)));
                    if ((e10 != null && str2.equals(e10.mime_type)) && hashSet2.add(Long.valueOf(e10.id))) {
                        arrayList11.add(e10);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i21++;
        }
        if (arrayList11.isEmpty()) {
            i7 = 1;
        } else {
            i7 = 1;
            arrayList6.add(new o(1, hd.N0(2131746165, null), arrayList11));
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i22 = 0;
        int i23 = 0;
        while (i23 < size6) {
            o oVar = arrayList6.get(i23);
            i23++;
            o oVar2 = oVar;
            oVar2.d = i22;
            i22 += oVar2.c.size() + (oVar2.b != null ? i7 : 0);
        }
        this.s = i22;
        this.e.f();
        r rVar = this.h;
        rVar.setSections(arrayList6);
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
        ls.f(i7).c(this, ls.x0);
        ls.f(i7).c(this, ls.B0);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        ls.f(i7).n(this, ls.x0);
        ls.f(i7).n(this, ls.B0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        m mVar = this.c;
        int max = Math.max(5, ((i7 - mVar.getPaddingLeft()) - mVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.y1(max);
            post(new ca.r(this, 5));
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
