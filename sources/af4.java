// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class af4 extends FrameLayout implements tjb, gk7, x74 {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public rf4 E;
    public long F;
    public long G;
    public long H;
    public long I;
    public String J;
    public boolean K;
    public final Activity L;
    public final d M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public String R;
    public int S;
    public final se4 T;
    public final te4 U;
    public final ye4 V;
    public final ve4 W;
    public final fm0 a;
    public final xe4 a0;
    public final fu b;
    public final ve4 b0;
    public final zya c;
    public final ve4 c0;
    public n39 d;
    public final ArrayList d0;
    public je4 e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final ez3 g0;
    public final SparseArray h;
    public final me4 h0;
    public qe4 i0;
    public pt9 j0;
    public final t26 k0;
    public final ne4 l0;
    public final on m0;
    public final ArrayList n;
    public final re4 n0;
    public final s54 o0;
    public ze4 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public byte s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public af4(d dVar) {
        super(dVar.getParentActivity());
        this.a = new fm0(0, this, s33.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = (byte) 3;
        this.T = new se4(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new ez3(this, (byte) 3);
        this.h0 = new me4(this);
        this.m0 = new on(null);
        this.o0 = new s54((Object) this, (byte) 11);
        this.M = dVar;
        Activity parentActivity = dVar.getParentActivity();
        this.L = parentActivity;
        zkb.h(bkb.c6, null, this);
        fu fuVar = new fu((byte) 19, (Context) parentActivity, (Object) this);
        this.b = fuVar;
        fuVar.setOnItemClickListener(new nrc(this, (byte) 1));
        fuVar.setOnItemLongClickListener(new qx4(this));
        t26 t26Var = new t26();
        this.k0 = t26Var;
        fuVar.setLayoutManager(t26Var);
        ne4 ne4Var = new ne4((byte) 0, parentActivity, this);
        this.l0 = ne4Var;
        addView(ne4Var);
        addView(fuVar);
        fuVar.setSectionsType(2);
        fuVar.setSkipDrawSection(true);
        fuVar.setOnScrollListener(new oe4(this));
        re4 re4Var = new re4(parentActivity);
        this.n0 = re4Var;
        String u = k96.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(re4Var.c, u)) {
            re4Var.c = u;
            re4Var.a.t(u, true, true);
        }
        addView(re4Var, nme.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new te4(this);
        this.V = new ye4(this, getContext());
        this.W = new ve4(this, getContext(), 1);
        this.a0 = new xe4(this, getContext());
        this.b0 = new ve4(this, getContext(), 4);
        this.c0 = new ve4(this, getContext(), 2);
        zya zyaVar = new zya(parentActivity, ne4Var, 1, null);
        this.c = zyaVar;
        addView(zyaVar);
        fuVar.setEmptyView(zyaVar);
        zyaVar.setVisibility(8);
        a();
    }

    public static CharSequence b(k27 k27Var, boolean z) {
        return c(k27Var, z, 0, null);
    }

    public static CharSequence c(k27 k27Var, boolean z, int i, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat K0;
        TLRPC.Chat K02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f;
        TLRPC.TL_forumTopic f2;
        int i2;
        if (k27Var == null || (message = k27Var.k) == null) {
            return "";
        }
        if (k27.a4(message)) {
            nx8 c = ox8.f(k27Var.K1).c(k27.I1(k27Var.k));
            return c != null ? c.b : "";
        }
        CharSequence charSequence = null;
        if (k27Var.q4()) {
            return k27Var.b1 ? k96.M0(2131745021, null) : k27Var.U0 ? k96.M0(2131745022, null) : k96.M0(2131745023, null);
        }
        SpannableStringBuilder[] spannableStringBuilderArr = t0;
        if (spannableStringBuilderArr[i] == null) {
            spannableStringBuilderArr[i] = new SpannableStringBuilder(">");
            if (i == 0) {
                i2 = R.drawable.attach_arrow_right;
            } else if (i == 1) {
                i2 = R.drawable.msg_mini_arrow_mediathin;
            } else {
                if (i != 2) {
                    return "";
                }
                i2 = R.drawable.msg_mini_arrow_mediabold;
            }
            cm2 cm2Var = new cm2(i == 0 ? 2 : 1, a.b.getDrawable(i2).mutate());
            if (i == 1 || i == 2) {
                cm2Var.I = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
            spannableStringBuilder.setSpan(cm2Var, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = k27Var.k;
        if (message2.saved_peer_id != null) {
            if (k27Var.P1() >= 0) {
                user = na7.q1(y6c.t0).V1(Long.valueOf(k27Var.P1()));
                K0 = null;
            } else if (k27Var.P1() < 0) {
                K0 = na7.q1(y6c.t0).K0(Long.valueOf(-k27Var.P1()));
                user = null;
                K02 = null;
            } else {
                user = null;
                K0 = null;
            }
            K02 = K0;
        } else {
            TLRPC.User V1 = message2.from_id.user_id != 0 ? na7.q1(y6c.t0).V1(Long.valueOf(k27Var.k.from_id.user_id)) : null;
            K0 = k27Var.k.from_id.chat_id != 0 ? na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.chat_id)) : null;
            if (K0 == null) {
                K0 = k27Var.k.from_id.channel_id != 0 ? na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.channel_id)) : null;
            }
            K02 = k27Var.k.peer_id.channel_id != 0 ? na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.channel_id)) : null;
            if (K02 == null) {
                K02 = k27Var.k.peer_id.chat_id != 0 ? na7.q1(y6c.t0).K0(Long.valueOf(k27Var.k.peer_id.chat_id)) : null;
            }
            if (!hc2.V(K02) && !z) {
                K02 = null;
            }
            user = V1;
        }
        if (user != null) {
            if (K02 != null) {
                CharSequence charSequence2 = K02.title;
                if (hc2.c0(K02) && (f2 = na7.q1(y6c.t0).g4.f(K02.id, k27.b2(k27Var.K1, k27Var.k, true, false))) != null) {
                    charSequence2 = mm4.k(f2, null, null);
                }
                CharSequence m = vu3.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(vu3.m(l7c.k(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(m);
                charSequence = spannableStringBuilder2;
            } else {
                charSequence = vu3.m(l7c.r(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            }
        } else if (K0 != null) {
            CharSequence charSequence3 = K0.title;
            if (hc2.c0(K0) && (f = na7.q1(y6c.t0).g4.f(K0.id, k27.b2(k27Var.K1, k27Var.k, true, false))) != null) {
                charSequence3 = mm4.k(f, null, null);
            }
            charSequence = vu3.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence != null ? charSequence : "";
    }

    public final void a() {
        float f = this.a.e;
        re4 re4Var = this.n0;
        re4Var.setTranslationY((1.0f - f) * (-gl.L(24.0f)));
        re4Var.setAlpha(f);
        re4Var.setVisibility(f > 0.0f ? 0 : 4);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.j7));
        hashSet.add(Integer.valueOf(bkb.S8));
        hashSet.add(Integer.valueOf(bkb.b9));
        hashSet.add(Integer.valueOf(bkb.c9));
        hashSet.add(Integer.valueOf(bkb.B9));
        hashSet.add(Integer.valueOf(bkb.A9));
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.z9));
        hashSet.add(Integer.valueOf(bkb.x9));
        hashSet.add(Integer.valueOf(bkb.w9));
        hashSet.add(Integer.valueOf(bkb.v9));
        hashSet.add(Integer.valueOf(bkb.u9));
        hashSet.add(Integer.valueOf(bkb.t9));
        hashSet.add(Integer.valueOf(bkb.s9));
        hashSet.add(Integer.valueOf(bkb.r9));
        hashSet.add(Integer.valueOf(bkb.p9));
        hashSet.add(Integer.valueOf(bkb.o9));
        hashSet.add(Integer.valueOf(bkb.i9));
        hashSet.add(Integer.valueOf(bkb.l9));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.h9));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.a9));
        hashSet.add(Integer.valueOf(bkb.Z8));
        hashSet.add(Integer.valueOf(bkb.V8));
        hashSet.add(Integer.valueOf(bkb.U8));
        hashSet.add(Integer.valueOf(bkb.T8));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.zi));
        hashSet.add(Integer.valueOf(bkb.Ai));
        hashSet.add(Integer.valueOf(bkb.J6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.rj));
        hashSet.add(Integer.valueOf(bkb.yi));
        hashSet.add(Integer.valueOf(bkb.z6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (hc2.S(y6c.t0, r5) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList, long j) {
        n39 n39Var;
        int i;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                break;
            }
            k27 k27Var = (k27) arrayList2.get(i2);
            TLRPC.Message message = k27Var.k;
            String str = k27Var.Y;
            long B0 = k27.B0(message);
            if (B0 < 0) {
                i = (int) (-B0);
            }
            i = 0;
            if (i == j) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (k27Var.e1() == ((Integer) arrayList.get(i3)).intValue()) {
                        arrayList2.remove(i2);
                        this.h.remove(k27Var.e1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(k27Var);
                        if (arrayList3.size() == 0) {
                            this.n.remove(str);
                            hashMap.remove(str);
                        }
                        i2--;
                        this.P--;
                        z = true;
                    }
                }
            }
            i2++;
        }
        if (!z || (n39Var = this.d) == null) {
            return;
        }
        n39Var.f();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            fu fuVar = this.b;
            int childCount = fuVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fuVar.getChildAt(i3) instanceof ue3) {
                    ((ue3) fuVar.getChildAt(i3)).k0(0, true);
                }
                fuVar.getChildAt(i3).invalidate();
            }
        }
    }

    public final void e(int i, View view, k27 k27Var, int i2) {
        String str;
        if (k27Var != null) {
            if (this.p0.t()) {
                this.p0.f(k27Var, view, i2);
                return;
            }
            if (view instanceof ue3) {
                this.p0.n(k27Var);
                return;
            }
            byte b = this.E.d;
            me4 me4Var = this.h0;
            ArrayList arrayList = this.f;
            d dVar = this.M;
            if (b == 0) {
                PhotoViewer.r0().T1(null, dVar, null);
                PhotoViewer.r0().j1(arrayList, i, 0L, 0L, 0L, me4Var);
                this.S = PhotoViewer.r0().c;
                return;
            }
            if (b == 3 || b == 5) {
                if (view instanceof eba) {
                    ((eba) view).a();
                    return;
                }
                return;
            }
            if (b == 1) {
                if (view instanceof iba) {
                    iba ibaVar = (iba) view;
                    TLRPC.Document F0 = k27Var.F0();
                    if (!ibaVar.H) {
                        if (ibaVar.G) {
                            ba4.G(j5.a(y6c.t0).a).f(F0);
                            ibaVar.f(true);
                            return;
                        } else {
                            k27 message = ibaVar.getMessage();
                            message.P = true;
                            ba4.G(j5.a(y6c.t0).a).X(F0, message, 0, 0);
                            ibaVar.f(true);
                            return;
                        }
                    }
                    if (!k27Var.x()) {
                        gl.q2(k27Var, this.L, dVar);
                        return;
                    }
                    PhotoViewer.r0().T1(null, dVar, null);
                    int indexOf = arrayList.indexOf(k27Var);
                    if (indexOf >= 0) {
                        PhotoViewer.r0().T1(null, dVar, null);
                        PhotoViewer.r0().j1(arrayList, indexOf, 0L, 0L, 0L, me4Var);
                        this.S = PhotoViewer.r0().c;
                        return;
                    } else {
                        ArrayList t = tb4.t(k27Var);
                        PhotoViewer.r0().T1(null, dVar, null);
                        PhotoViewer.r0().j1(t, 0, 0L, 0L, 0L, me4Var);
                        this.S = PhotoViewer.r0().c;
                        return;
                    }
                }
                return;
            }
            if (b == 2) {
                try {
                    TLRPC.MessageMedia messageMedia = k27Var.k.media;
                    TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                    if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                        str = null;
                    } else {
                        if (webPage.cached_page != null) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                                dVar.createArticleViewer(false).L(k27Var, null, null, null);
                                return;
                            }
                            return;
                        }
                        String str2 = webPage.embed_url;
                        if (str2 != null && str2.length() != 0) {
                            ou3.I0(this.M, k27Var, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                            return;
                        }
                        str = webPage.url;
                    }
                    if (str == null) {
                        ArrayList arrayList2 = ((lba) view).F;
                        str = arrayList2.size() > 0 ? ((CharSequence) arrayList2.get(0)).toString() : null;
                    }
                    if (str != null) {
                        g(str);
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void f(k27 k27Var, View view, int i) {
        if (!this.p0.t()) {
            this.p0.c();
        }
        if (this.p0.t()) {
            this.p0.f(k27Var, view, i);
        }
    }

    public final void g(String str) {
        if (gl.D3(str)) {
            ij.n0(this.M, str, true, true);
        } else {
            d01.t(this.L, str);
        }
    }

    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g5));
        arrayList.add(new blb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        int i = bkb.h7;
        fu fuVar = this.b;
        arrayList.add(new blb(fuVar, TLObject.FLAG_13, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        int i2 = bkb.j7;
        arrayList.add(new blb(fuVar, TLObject.FLAG_14, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(fuVar, 8, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.pj));
        arrayList.add(new blb(fuVar, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, bkb.g6));
        arrayList.add(new blb(fuVar, TLObject.FLAG_13, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(fuVar, TLObject.FLAG_14, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(fuVar, TLObject.FLAG_13, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(fuVar, TLObject.FLAG_14, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i2));
        zya zyaVar = this.c;
        arrayList.add(new blb(zyaVar.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
        arrayList.add(new blb(zyaVar.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, je4] */
    public final void h(final long j, final long j2, final long j3, final long j4, final rf4 rf4Var, final boolean z, String str, boolean z2) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j + j2 + j3 + j4 + ((int) (rf4Var == null ? (byte) -1 : rf4Var.d)) + str2 + z;
        String str4 = this.y;
        boolean z3 = str4 != null && str4.equals(str3);
        boolean z4 = !z3 && z2;
        this.E = rf4Var;
        this.F = j;
        this.G = j2;
        this.I = j3;
        this.H = j4;
        this.J = str2;
        this.K = z;
        je4 je4Var = this.e;
        if (je4Var != null) {
            gl.r(je4Var);
        }
        ez3 ez3Var = this.g0;
        gl.r(ez3Var);
        if (z3 && z2) {
            return;
        }
        ArrayList arrayList2 = this.e0;
        final boolean z5 = z3;
        ArrayList arrayList3 = this.d0;
        zya zyaVar = this.c;
        ArrayList arrayList4 = this.f;
        if (z4 || (rf4Var == null && j2 == 0 && j == 0 && j3 == 0 && j4 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.N = true;
            zyaVar.setVisibility(0);
            n39 n39Var = this.d;
            if (n39Var != null) {
                n39Var.f();
            }
            this.Q++;
            fu fuVar = this.b;
            if (fuVar.getPinnedHeader() != null) {
                arrayList = arrayList4;
                fuVar.getPinnedHeader().setAlpha(0.0f);
            } else {
                arrayList = arrayList4;
            }
            arrayList3.clear();
            arrayList2.clear();
            if (!z4) {
                return;
            }
        } else if (z2 && !arrayList4.isEmpty()) {
            return;
        } else {
            arrayList = arrayList4;
        }
        this.N = true;
        n39 n39Var2 = this.d;
        if (n39Var2 != null) {
            n39Var2.f();
        }
        if (!z5) {
            ez3Var.run();
            zyaVar.e(true, !z2);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            qe4 qe4Var = this.i0;
            if (qe4Var != null) {
                ((ag3) qe4Var).h(false, null, null, false);
            }
        }
        final int i = this.Q + 1;
        this.Q = i;
        final int i2 = y6c.t0;
        ?? r0 = new Runnable() { // from class: je4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                long j5;
                int i3;
                int i4;
                long j6;
                int i5;
                int i6;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
                final af4 af4Var = af4.this;
                ArrayList arrayList5 = af4Var.f;
                final long j7 = j;
                long j8 = j2;
                String str5 = str2;
                final rf4 rf4Var2 = rf4Var;
                int i7 = i2;
                long j9 = j3;
                long j10 = j4;
                final boolean z6 = z5;
                ArrayList arrayList6 = null;
                if (j7 == 0 || j8 != 0) {
                    boolean isEmpty = TextUtils.isEmpty(str5);
                    boolean z7 = z;
                    if (isEmpty) {
                        j5 = j10;
                        i3 = i7;
                        i4 = z7 ? 1 : 0;
                        j6 = j9;
                        i5 = 20;
                        i6 = 1;
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        j6 = j9;
                        i5 = 20;
                        j5 = j10;
                        i3 = i7;
                        i6 = 1;
                        ad7.Y(i7).J0(0, str5, arrayList7, new ArrayList(), new ArrayList(), null, z7 ? 1 : 0);
                        i4 = z7 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i5;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = rf4Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : rf4Var2.e;
                    tL_messages_searchGlobal2.community = na7.q1(i3).f1(j8);
                    if (j6 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j6 / 1000);
                    }
                    if (j5 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j5 / 1000);
                    }
                    if (z6 && str5.equals(af4Var.x) && !arrayList5.isEmpty()) {
                        k27 k27Var = (k27) b00.f(i6, arrayList5);
                        tL_messages_searchGlobal2.offset_id = k27Var.e1();
                        tL_messages_searchGlobal2.offset_rate = af4Var.w;
                        tL_messages_searchGlobal2.offset_peer = na7.q1(i3).h1(k27.B1(k27Var.k.peer_id));
                    } else {
                        tL_messages_searchGlobal2.offset_rate = 0;
                        tL_messages_searchGlobal2.offset_id = 0;
                        tL_messages_searchGlobal2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    }
                    tL_messages_searchGlobal2.flags |= i6;
                    tL_messages_searchGlobal2.folder_id = i4;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                } else {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.q = str5;
                    tL_messages_search.limit = 20;
                    tL_messages_search.filter = rf4Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : rf4Var2.e;
                    tL_messages_search.peer = na7.q1(j5.a(i7).a).h1(j7);
                    if (j9 > 0) {
                        tL_messages_search.min_date = (int) (j9 / 1000);
                    }
                    if (j10 > 0) {
                        tL_messages_search.max_date = (int) (j10 / 1000);
                    }
                    if (z6) {
                        str5 = str5;
                        if (str5.equals(af4Var.x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((k27) b00.f(1, arrayList5)).e1();
                            i3 = i7;
                            j6 = j9;
                            tL_messages_searchGlobal = tL_messages_search;
                        }
                    } else {
                        str5 = str5;
                    }
                    tL_messages_search.offset_id = 0;
                    i3 = i7;
                    j6 = j9;
                    tL_messages_searchGlobal = tL_messages_search;
                }
                final ArrayList arrayList8 = arrayList6;
                af4Var.x = str5;
                af4Var.y = str3;
                final ArrayList arrayList9 = new ArrayList();
                tf4.B1(af4Var.x, arrayList9);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i8 = i;
                final String str6 = str5;
                final int i9 = i3;
                final long j11 = j6;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new i8c() { // from class: ke4
                    @Override // i8c
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList10 = new ArrayList();
                        final int i10 = i9;
                        final String str7 = str6;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                k27 k27Var2 = new k27(i10, messages_messages.messages.get(i11), false, true);
                                k27Var2.J5(str7, true);
                                arrayList10.add(k27Var2);
                            }
                        }
                        final af4 af4Var2 = af4.this;
                        final int i12 = i8;
                        final boolean z8 = z6;
                        final rf4 rf4Var3 = rf4Var2;
                        final long j12 = j7;
                        final long j13 = j11;
                        final ArrayList arrayList11 = arrayList8;
                        final ArrayList arrayList12 = arrayList9;
                        gl.c3(new Runnable() { // from class: le4
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:109:0x02d3  */
                            /* JADX WARN: Type inference failed for: r12v12 */
                            /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
                            /* JADX WARN: Type inference failed for: r12v16 */
                            /* JADX WARN: Type inference failed for: r16v0 */
                            /* JADX WARN: Type inference failed for: r16v1 */
                            /* JADX WARN: Type inference failed for: r16v2 */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run() {
                                String str8;
                                View view;
                                int i13;
                                ?? r12;
                                qe4 qe4Var2;
                                ArrayList arrayList13;
                                ArrayList arrayList14;
                                SparseArray sparseArray;
                                ?? r16;
                                char c;
                                af4 af4Var3 = af4.this;
                                te4 te4Var = af4Var3.U;
                                ye4 ye4Var = af4Var3.V;
                                ArrayList arrayList15 = af4Var3.n;
                                SparseArray sparseArray2 = af4Var3.h;
                                ArrayList arrayList16 = af4Var3.e0;
                                HashMap hashMap = af4Var3.r;
                                ArrayList arrayList17 = af4Var3.d0;
                                ArrayList arrayList18 = af4Var3.f;
                                fu fuVar2 = af4Var3.b;
                                zya zyaVar2 = af4Var3.c;
                                if (i12 != af4Var3.Q) {
                                    return;
                                }
                                af4Var3.N = false;
                                if (tL_error != null) {
                                    wla wlaVar = zyaVar2.d;
                                    l46 l46Var = zyaVar2.e;
                                    wlaVar.setText(k96.M0(2131745608, null));
                                    l46Var.setVisibility(0);
                                    l46Var.setText(k96.M0(2131745615, null));
                                    zyaVar2.e(false, true);
                                    return;
                                }
                                zyaVar2.e(false, true);
                                wla wlaVar2 = zyaVar2.d;
                                l46 l46Var2 = zyaVar2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                af4Var3.w = messages_messages2.next_rate;
                                int i14 = i10;
                                ad7.Y(i14).j1(messages_messages2.users, messages_messages2.chats, true, true);
                                na7.q1(i14).b4(messages_messages2.users, false);
                                na7.q1(i14).V3(messages_messages2.chats, false);
                                boolean z9 = z8;
                                if (!z9) {
                                    arrayList18.clear();
                                    sparseArray2.clear();
                                    arrayList15.clear();
                                    hashMap.clear();
                                }
                                af4Var3.P = messages_messages2.count;
                                String str9 = str7;
                                af4Var3.R = str9;
                                ArrayList arrayList19 = arrayList10;
                                int size2 = arrayList19.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    boolean z10 = z9;
                                    k27 k27Var3 = (k27) arrayList19.get(i15);
                                    ArrayList arrayList20 = arrayList19;
                                    String str10 = k27Var3.Y;
                                    ArrayList arrayList21 = (ArrayList) hashMap.get(str10);
                                    int i16 = i15;
                                    if (arrayList21 == null) {
                                        arrayList13 = new ArrayList();
                                        hashMap.put(str10, arrayList13);
                                        arrayList15.add(str10);
                                    } else {
                                        arrayList13 = arrayList21;
                                    }
                                    arrayList13.add(k27Var3);
                                    arrayList18.add(k27Var3);
                                    sparseArray2.put(k27Var3.e1(), k27Var3);
                                    if (PhotoViewer.r0().V0()) {
                                        PhotoViewer r02 = PhotoViewer.r0();
                                        int i17 = af4Var3.S;
                                        arrayList14 = arrayList15;
                                        ArrayList arrayList22 = r02.X6;
                                        sparseArray = sparseArray2;
                                        SparseArray[] sparseArrayArr = r02.Y6;
                                        if (i17 == r02.c) {
                                            if (sparseArrayArr[0].indexOfKey(k27Var3.e1()) < 0) {
                                                if (r02.P5) {
                                                    arrayList22.add(k27Var3);
                                                    c = 0;
                                                } else {
                                                    c = 0;
                                                    arrayList22.add(0, k27Var3);
                                                }
                                                r16 = c;
                                                sparseArrayArr[c].put(k27Var3.e1(), k27Var3);
                                            } else {
                                                r16 = 0;
                                            }
                                            r02.O5[r16] = arrayList22.size() == r02.I5 ? true : r16;
                                            r02.M1();
                                        }
                                    } else {
                                        arrayList14 = arrayList15;
                                        sparseArray = sparseArray2;
                                    }
                                    i15 = i16 + 1;
                                    arrayList19 = arrayList20;
                                    z9 = z10;
                                    arrayList15 = arrayList14;
                                    sparseArray2 = sparseArray;
                                }
                                boolean z11 = z9;
                                if (arrayList18.size() > af4Var3.P) {
                                    af4Var3.P = arrayList18.size();
                                }
                                af4Var3.O = arrayList18.size() >= af4Var3.P;
                                boolean isEmpty2 = arrayList18.isEmpty();
                                rf4 rf4Var4 = rf4Var3;
                                byte b = 2;
                                if (!isEmpty2) {
                                    str8 = str9;
                                } else if (rf4Var4 != null) {
                                    if (TextUtils.isEmpty(af4Var3.R)) {
                                        str8 = str9;
                                        if (j12 == 0 && j13 == 0) {
                                            wlaVar2.setText(k96.M0(2131745609, null));
                                            byte b2 = rf4Var4.d;
                                            String M0 = b2 == 1 ? k96.M0(2131745614, null) : b2 == 0 ? k96.M0(2131745612, null) : b2 == 2 ? k96.M0(2131745613, null) : b2 == 3 ? k96.M0(2131745611, null) : k96.M0(2131745610, null);
                                            l46Var2.setVisibility(0);
                                            l46Var2.setText(M0);
                                        }
                                    } else {
                                        str8 = str9;
                                    }
                                    wlaVar2.setText(k96.M0(2131745608, null));
                                    l46Var2.setVisibility(0);
                                    l46Var2.setText(k96.M0(2131745615, null));
                                } else {
                                    str8 = str9;
                                    wlaVar2.setText(k96.M0(2131745608, null));
                                    l46Var2.setVisibility(8);
                                }
                                if (rf4Var4 != null) {
                                    byte b3 = rf4Var4.d;
                                    if (b3 != 0) {
                                        if (b3 == 1) {
                                            af4Var3.d = af4Var3.W;
                                        } else if (b3 == 2) {
                                            af4Var3.d = af4Var3.a0;
                                        } else if (b3 == 3) {
                                            af4Var3.d = af4Var3.b0;
                                        } else if (b3 == 5) {
                                            af4Var3.d = af4Var3.c0;
                                        }
                                    } else if (TextUtils.isEmpty(af4Var3.R)) {
                                        af4Var3.d = ye4Var;
                                    } else {
                                        af4Var3.d = te4Var;
                                    }
                                } else {
                                    af4Var3.d = te4Var;
                                }
                                w39 adapter = fuVar2.getAdapter();
                                n39 n39Var3 = af4Var3.d;
                                if (adapter != n39Var3) {
                                    fuVar2.setAdapter(n39Var3);
                                }
                                if (z11) {
                                    view = null;
                                    i13 = 0;
                                } else {
                                    arrayList17.clear();
                                    ArrayList arrayList23 = arrayList11;
                                    if (arrayList23 != null) {
                                        arrayList17.addAll(arrayList23);
                                    }
                                    if (str8 != null && str8.length() >= 3 && (k96.M0(2131745709, null).toLowerCase().startsWith(str8) || "saved messages".startsWith(str8))) {
                                        for (int i18 = 0; i18 < arrayList17.size(); i18++) {
                                            if (!(arrayList17.get(i18) instanceof TLRPC.User) || y6c.h(y6c.t0).f().id != ((TLRPC.User) arrayList17.get(i18)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList17.add(0, y6c.h(y6c.t0).f());
                                        arrayList16.clear();
                                        arrayList16.addAll(arrayList12);
                                        af4Var3.f0 = r12;
                                        if (str8 != null || str8.length() < 3) {
                                            view = null;
                                        } else {
                                            view = null;
                                            if (k96.M0(2131754147, null).toLowerCase().startsWith(str8) || "archive".startsWith(str8)) {
                                                af4Var3.f0 = true;
                                            }
                                        }
                                        qe4Var2 = af4Var3.i0;
                                        i13 = r12;
                                        if (qe4Var2 != null) {
                                            ((ag3) qe4Var2).h(TextUtils.isEmpty(af4Var3.R), arrayList17, arrayList16, af4Var3.f0);
                                            i13 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList16.clear();
                                    arrayList16.addAll(arrayList12);
                                    af4Var3.f0 = r12;
                                    if (str8 != null) {
                                    }
                                    view = null;
                                    qe4Var2 = af4Var3.i0;
                                    i13 = r12;
                                    if (qe4Var2 != null) {
                                    }
                                }
                                int i19 = -1;
                                View view2 = view;
                                for (int i20 = i13; i20 < size2; i20++) {
                                    View childAt = fuVar2.getChildAt(i20);
                                    if (childAt instanceof pi4) {
                                        i19 = RecyclerView.R(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    fuVar2.removeView(view2);
                                }
                                if ((af4Var3.l0.getVisibility() == 0 && fuVar2.getChildCount() == 0) || (fuVar2.getAdapter() != ye4Var && view2 != null)) {
                                    af4Var3.getViewTreeObserver().addOnPreDrawListener(new a32(af4Var3, (pi4) view2, i19, b));
                                }
                                af4Var3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r0;
        gl.d3(r0, (!z5 || arrayList.isEmpty()) ? 350L : 0L);
        ne4 ne4Var = this.l0;
        if (rf4Var == null) {
            ne4Var.setViewType(1);
            return;
        }
        byte b = rf4Var.d;
        if (b == 0) {
            if (TextUtils.isEmpty(this.J)) {
                ne4Var.setViewType(2);
                return;
            } else {
                ne4Var.setViewType(1);
                return;
            }
        }
        if (b == 1) {
            ne4Var.setViewType(3);
            return;
        }
        if (b == 3 || b == 5) {
            ne4Var.setViewType(4);
        } else if (b == 2) {
            ne4Var.setViewType(5);
        }
    }

    public final void i(qe4 qe4Var, boolean z) {
        this.i0 = qe4Var;
        if (!z || qe4Var == null) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((ag3) qe4Var).h(false, arrayList, this.e0, this.f0);
    }

    public final void j(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.s0 = z;
        setPadding(0, i, 0, i2);
        fu fuVar = this.b;
        if (z) {
            fuVar.q1(0, i, 0, i2);
        } else {
            fuVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fuVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.s0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = y6c.t0;
        this.r0 = i;
        kk7.f(i).b(this, kk7.k4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.r0).n(this, kk7.k4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        n39 n39Var;
        byte b = this.s;
        byte b2 = 3;
        if (gl.O1()) {
            this.s = (byte) 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            b2 = 6;
            this.s = (byte) 6;
        } else {
            this.s = (byte) 3;
        }
        if (b != b2 && (n39Var = this.d) == this.V) {
            this.s0 = true;
            n39Var.f();
            this.s0 = false;
        }
        super.onMeasure(i, i2);
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            a();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(kl0 kl0Var) {
        nl0 nl0Var = new nl0(null);
        nl0Var.e = new wz((byte) 16);
        nl0Var.f(385875968, 402653183);
        nl0Var.e(385875968, 402653183);
        nl0Var.d(0, 0);
        nl0Var.f = 1.0f;
        nl0Var.h = 1.0f;
        re4 re4Var = this.n0;
        il0 c = kl0Var.c(re4Var, nl0Var, false);
        re4Var.b = c;
        c.r(gl.L(11.5f));
        re4Var.b.q(gl.L(5.0f));
    }

    public void setChatPreviewDelegate(pt9 pt9Var) {
        this.j0 = pt9Var;
    }

    public void setUiCallback(ze4 ze4Var) {
        this.p0 = ze4Var;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.q0 = z;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            re4 re4Var = this.n0;
            if (re4Var != null) {
                re4Var.updateColors();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // x74
    public final void F(float f, int i) {
    }
}
