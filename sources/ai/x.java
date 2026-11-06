package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.ri0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class x extends FrameLayout implements ls {
    public static final long[] K = {5449505950283078474L, 5420315771991497307L, 5373141891321699086L, 5373026167722876724L, 5435957248314579621L, 5440354006335495210L, 5436040291507247633L, 5445284980978621387L, 5442983582882601962L, 5409008750893734809L, 5371017798065592581L, 5472030678633684592L, 5467583879948803288L, 5471952986970267163L, 5415696465945173620L, 5397915559037785261L, 5283020991981693429L, 5283051451889756068L, 5282816560128336499L, 5465449362807070392L, 5470012829983580233L};
    public static final PorterDuffColorFilter L = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    public TLRPC.TL_messages_stickerSet D;
    public boolean E;
    public boolean F;
    public final HashSet G;
    public final HashSet H;
    public ArrayList I;
    public boolean J;
    public final int a;
    public final p0 b;
    public final r c;
    public final v4.s d;
    public final p e;
    public final ri0 f;
    public final w h;
    public final ArrayList n;
    public int r;
    public int s;
    public boolean w;
    public final boolean x;
    public int y;

    public x(Context context, int i7, p0 p0Var) {
        super(context);
        q0 q0Var = (q0) this;
        p pVar = new p(q0Var);
        this.e = pVar;
        this.n = new ArrayList();
        this.r = 7;
        this.y = -1711276033;
        this.G = new HashSet();
        this.H = new HashSet();
        this.a = i7;
        this.b = p0Var;
        this.x = p10.i(i7).q();
        r rVar = new r(context, null);
        this.c = rVar;
        v4.s sVar = new v4.s(this.r);
        this.d = sVar;
        int i10 = 0;
        sVar.O = new l(q0Var, i10);
        rVar.setLayoutManager(sVar);
        ri0 ri0Var = new ri0(rVar, sVar);
        this.f = ri0Var;
        ri0Var.i = new m(q0Var, i10);
        rVar.setAdapter(pVar);
        rVar.setSelectorDrawableColor(0);
        rVar.setOnItemClickListener(new k(p0Var, 0));
        rVar.setItemAnimator(null);
        rVar.setOverScrollMode(2);
        rVar.setVerticalScrollBarEnabled(false);
        rVar.setClipToPadding(false);
        rVar.j(new b(q0Var, 1));
        addView(rVar, ha.c(-1.0f, -1));
        w wVar = new w(q0Var, context);
        this.h = wVar;
        addView(wVar, ha.e(-1, 36, 48));
        e();
    }

    public static void b(Canvas canvas, Drawable drawable) {
        boolean d = d(drawable);
        if (d) {
            drawable.setColorFilter(L);
        }
        drawable.draw(canvas);
        if (d) {
            drawable.setColorFilter(null);
        }
    }

    public static boolean d(Drawable drawable) {
        return (drawable instanceof i5) && ij.D4(((i5) drawable).e);
    }

    public final ArrayList a() {
        if (this.I == null) {
            this.I = new ArrayList();
            for (String str : qp.s1(this.a).e7.getString("qrAppliedEmoji", "").split(",")) {
                try {
                    if (!str.isEmpty()) {
                        this.I.add(Long.valueOf(Long.parseLong(str)));
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return this.I;
    }

    public final int c() {
        int R;
        r rVar = this.c;
        int paddingTop = rVar.getPaddingTop();
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = -1;
        for (int i11 = 0; i11 < rVar.getChildCount(); i11++) {
            View childAt = rVar.getChildAt(i11);
            this.d.getClass();
            int z9 = v4.n0.z(childAt);
            if (z9 >= paddingTop && z9 < i7 && (R = RecyclerView.R(childAt)) != -1) {
                i10 = R;
                i7 = z9;
            }
        }
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.x0 && objArr.length > 0) {
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
        ui b02 = ui.b0(i11);
        ArrayList<t> arrayList6 = this.n;
        arrayList6.clear();
        ArrayList arrayList7 = new ArrayList();
        ArrayList s02 = b02.s0(5);
        int size = s02.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            str = "application/x-tgsticker";
            if (i13 >= size) {
                break;
            }
            Object obj = s02.get(i13);
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
                    arrayList7.add(new t(2, tL_messages_stickerSet.set.title, arrayList8));
                }
            }
        }
        if (this.D == null && !this.E) {
            this.E = true;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
            TLRPC.TL_messages_stickerSet l02 = ui.b0(i11).l0(tL_inputStickerSetShortName, null, false, true, new i(this, i12));
            if (l02 != null && (arrayList5 = l02.documents) != null && !arrayList5.isEmpty()) {
                this.D = l02;
            }
        }
        ArrayList arrayList10 = new ArrayList(21);
        HashSet hashSet = this.H;
        hashSet.clear();
        if (this.D != null || this.F) {
            HashMap hashMap = new HashMap();
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.D;
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
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.D;
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
                long j11 = (i17 == 4 && j10 != j3 && hashMap.containsKey(Long.valueOf(j10))) ? j10 : K[i17];
                TLRPC.Document document6 = (TLRPC.Document) hashMap.get(Long.valueOf(j11));
                if (document6 == null) {
                    document6 = i5.e(i11, j11);
                }
                if (document6 != null) {
                    arrayList10.add(document6);
                    hashSet.add(Long.valueOf(document6.id));
                } else if (this.G.add(Long.valueOf(j11))) {
                    i5.g(i11).b(j11, new f5() { // from class: ai.j
                        @Override // org.telegram.ui.Components.f5
                        public final void a(TLRPC.Document document7) {
                            org.telegram.messenger.g0.h3(new a1.e(8, x.this, document7));
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
            arrayList6.add(new t(0, hd.M0(2131746496, null), arrayList10));
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
                document = i5.e(i11, longValue);
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
            ArrayList arrayList12 = i6.i;
            if (i21 >= arrayList12.size() || arrayList11.size() >= i19) {
                break;
            }
            String str5 = (String) arrayList12.get(i21);
            if (str5 != null && str5.startsWith("animated_")) {
                try {
                    TLRPC.Document e10 = i5.e(i11, Long.parseLong(str5.substring(9)));
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
            arrayList6.add(new t(1, hd.M0(2131746360, null), arrayList11));
        }
        arrayList6.addAll(arrayList7);
        int size6 = arrayList6.size();
        int i22 = 0;
        int i23 = 0;
        while (i23 < size6) {
            t tVar = arrayList6.get(i23);
            i23++;
            t tVar2 = tVar;
            tVar2.d = i22;
            i22 += tVar2.c.size() + (tVar2.b != null ? i7 : 0);
        }
        this.s = i22;
        this.e.f();
        w wVar = this.h;
        wVar.setSections(arrayList6);
        wVar.a(f(c()), false);
    }

    public final int f(int i7) {
        ArrayList arrayList = this.n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((t) arrayList.get(size)).d <= i7) {
                return size;
            }
        }
        return 0;
    }

    public r getGrid() {
        return this.c;
    }

    public w getTabs() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        qs.f(i7).c(this, qs.x0);
        qs.f(i7).c(this, qs.B0);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        qs.f(i7).n(this, qs.x0);
        qs.f(i7).n(this, qs.B0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        r rVar = this.c;
        int max = Math.max(5, ((i7 - rVar.getPaddingLeft()) - rVar.getPaddingRight()) / org.telegram.messenger.g0.L(46.0f));
        if (max != this.r) {
            this.r = max;
            this.d.y1(max);
            post(new a3.f(this, 4));
        }
    }

    public void setHeaderColor(int i7) {
        if (this.y == i7) {
            return;
        }
        this.y = i7;
        int i10 = 0;
        while (true) {
            r rVar = this.c;
            if (i10 >= rVar.getChildCount()) {
                return;
            }
            View childAt = rVar.getChildAt(i10);
            if (childAt instanceof s) {
                ((s) childAt).a.setTextColor(i7);
            }
            i10++;
        }
    }
}
