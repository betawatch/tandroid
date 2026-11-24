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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ch4 extends FrameLayout implements vlb, jm7, g94 {
    public static final SpannableStringBuilder[] t0 = new SpannableStringBuilder[3];
    public sh4 E;
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
    public final ug4 T;
    public final vg4 U;
    public final ah4 V;
    public final xg4 W;
    public final fn0 a;
    public final zg4 a0;
    public final fv b;
    public final xg4 b0;
    public final a1b c;
    public final xg4 c0;
    public q59 d;
    public final ArrayList d0;
    public lg4 e;
    public final ArrayList e0;
    public final ArrayList f;
    public boolean f0;
    public final o04 g0;
    public final SparseArray h;
    public final og4 h0;
    public sg4 i0;
    public rv9 j0;
    public final u46 k0;
    public final pg4 l0;
    public final po m0;
    public final ArrayList n;
    public final tg4 n0;
    public final a14 o0;
    public bh4 p0;
    public boolean q0;
    public final HashMap r;
    public int r0;
    public byte s;
    public boolean s0;
    public int w;
    public String x;
    public String y;

    public ch4(d dVar) {
        super(dVar.getParentActivity());
        this.a = new fn0(0, this, d53.h, 380L, false);
        this.f = new ArrayList();
        this.h = new SparseArray();
        this.n = new ArrayList();
        this.r = new HashMap();
        this.s = (byte) 3;
        this.T = new ug4(0, 0L);
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.g0 = new o04(this, (byte) 3);
        this.h0 = new og4(this);
        this.m0 = new po(null);
        this.o0 = new a14((Object) this, (byte) 18);
        this.M = dVar;
        Activity parentActivity = dVar.getParentActivity();
        this.L = parentActivity;
        anb.h(cmb.c6, null, this);
        fv fvVar = new fv((byte) 19, (Context) parentActivity, (Object) this);
        this.b = fvVar;
        fvVar.setOnItemClickListener(new kg4(this, (byte) 0));
        fvVar.setOnItemLongClickListener(new k44(this, (byte) 1));
        u46 u46Var = new u46();
        this.k0 = u46Var;
        fvVar.setLayoutManager(u46Var);
        pg4 pg4Var = new pg4((byte) 0, parentActivity, this);
        this.l0 = pg4Var;
        addView(pg4Var);
        addView(fvVar);
        fvVar.setSectionsType(2);
        fvVar.setSkipDrawSection(true);
        fvVar.setOnScrollListener(new qg4(this));
        tg4 tg4Var = new tg4(parentActivity);
        this.n0 = tg4Var;
        String u = jb6.u((int) (System.currentTimeMillis() / 1000), false);
        if (!TextUtils.equals(tg4Var.c, u)) {
            tg4Var.c = u;
            tg4Var.a.t(u, true, true);
        }
        addView(tg4Var, qoe.d(-1, 33.0f, 49, 0.0f, -2.0f, 0.0f, 0.0f));
        this.U = new vg4(this);
        this.V = new ah4(this, getContext());
        this.W = new xg4(this, getContext(), 1);
        this.a0 = new zg4(this, getContext());
        this.b0 = new xg4(this, getContext(), 4);
        this.c0 = new xg4(this, getContext(), 2);
        a1b a1bVar = new a1b(parentActivity, pg4Var, 1, null);
        this.c = a1bVar;
        addView(a1bVar);
        fvVar.setEmptyView(a1bVar);
        a1bVar.setVisibility(8);
        a();
    }

    public static CharSequence b(k47 k47Var, boolean z) {
        return c(k47Var, z, 0, null);
    }

    public static CharSequence c(k47 k47Var, boolean z, int i, TextPaint textPaint) {
        TLRPC.Message message;
        TLRPC.Chat L0;
        TLRPC.Chat L02;
        TLRPC.User user;
        TLRPC.TL_forumTopic f;
        TLRPC.TL_forumTopic f2;
        int i2;
        if (k47Var == null || (message = k47Var.k) == null) {
            return "";
        }
        if (k47.a4(message)) {
            oz8 c = pz8.f(k47Var.K1).c(k47.I1(k47Var.k));
            return c != null ? c.b : "";
        }
        CharSequence charSequence = null;
        if (k47Var.q4()) {
            return k47Var.b1 ? jb6.M0(2131744947, null) : k47Var.U0 ? jb6.M0(2131744948, null) : jb6.M0(2131744949, null);
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
            pn2 pn2Var = new pn2(i == 0 ? 2 : 1, a.b.getDrawable(i2).mutate());
            if (i == 1 || i == 2) {
                pn2Var.I = 0.85f;
            }
            SpannableStringBuilder spannableStringBuilder = spannableStringBuilderArr[i];
            spannableStringBuilder.setSpan(pn2Var, 0, spannableStringBuilder.length(), 0);
        }
        TLRPC.Message message2 = k47Var.k;
        if (message2.saved_peer_id != null) {
            if (k47Var.P1() >= 0) {
                user = oc7.r1(z8c.t0).W1(Long.valueOf(k47Var.P1()));
                L0 = null;
            } else if (k47Var.P1() < 0) {
                L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-k47Var.P1()));
                user = null;
                L02 = null;
            } else {
                user = null;
                L0 = null;
            }
            L02 = L0;
        } else {
            TLRPC.User W1 = message2.from_id.user_id != 0 ? oc7.r1(z8c.t0).W1(Long.valueOf(k47Var.k.from_id.user_id)) : null;
            L0 = k47Var.k.from_id.chat_id != 0 ? oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.chat_id)) : null;
            if (L0 == null) {
                L0 = k47Var.k.from_id.channel_id != 0 ? oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.channel_id)) : null;
            }
            L02 = k47Var.k.peer_id.channel_id != 0 ? oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.channel_id)) : null;
            if (L02 == null) {
                L02 = k47Var.k.peer_id.chat_id != 0 ? oc7.r1(z8c.t0).L0(Long.valueOf(k47Var.k.peer_id.chat_id)) : null;
            }
            if (!sd2.V(L02) && !z) {
                L02 = null;
            }
            user = W1;
        }
        if (user != null) {
            if (L02 != null) {
                CharSequence charSequence2 = L02.title;
                if (sd2.c0(L02) && (f2 = oc7.r1(z8c.t0).g4.f(L02.id, k47.b2(k47Var.K1, k47Var.k, true, false))) != null) {
                    charSequence2 = no4.k(f2, null, null);
                }
                CharSequence m = gw3.m(charSequence2, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append(gw3.m(m9c.k(user, true), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0)).append((char) 8202).append((CharSequence) spannableStringBuilderArr[i]).append((char) 8202).append(m);
                charSequence = spannableStringBuilder2;
            } else {
                charSequence = gw3.m(m9c.r(user), textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
            }
        } else if (L0 != null) {
            CharSequence charSequence3 = L0.title;
            if (sd2.c0(L0) && (f = oc7.r1(z8c.t0).g4.f(L0.id, k47.b2(k47Var.K1, k47Var.k, true, false))) != null) {
                charSequence3 = no4.k(f, null, null);
            }
            charSequence = gw3.m(charSequence3, textPaint == null ? null : textPaint.getFontMetricsInt(), false, null, 0);
        }
        return charSequence != null ? charSequence : "";
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            a();
        }
    }

    public final void a() {
        float f = this.a.e;
        tg4 tg4Var = this.n0;
        tg4Var.setTranslationY((1.0f - f) * (-gm.L(24.0f)));
        tg4Var.setAlpha(f);
        tg4Var.setVisibility(f > 0.0f ? 0 : 4);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.j7));
        hashSet.add(Integer.valueOf(cmb.S8));
        hashSet.add(Integer.valueOf(cmb.b9));
        hashSet.add(Integer.valueOf(cmb.c9));
        hashSet.add(Integer.valueOf(cmb.B9));
        hashSet.add(Integer.valueOf(cmb.A9));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.x9));
        hashSet.add(Integer.valueOf(cmb.w9));
        hashSet.add(Integer.valueOf(cmb.v9));
        hashSet.add(Integer.valueOf(cmb.u9));
        hashSet.add(Integer.valueOf(cmb.t9));
        hashSet.add(Integer.valueOf(cmb.s9));
        hashSet.add(Integer.valueOf(cmb.r9));
        hashSet.add(Integer.valueOf(cmb.p9));
        hashSet.add(Integer.valueOf(cmb.o9));
        hashSet.add(Integer.valueOf(cmb.i9));
        hashSet.add(Integer.valueOf(cmb.l9));
        hashSet.add(Integer.valueOf(cmb.f9));
        hashSet.add(Integer.valueOf(cmb.h9));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.a9));
        hashSet.add(Integer.valueOf(cmb.Z8));
        hashSet.add(Integer.valueOf(cmb.V8));
        hashSet.add(Integer.valueOf(cmb.U8));
        hashSet.add(Integer.valueOf(cmb.T8));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.zi));
        hashSet.add(Integer.valueOf(cmb.Ai));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.rj));
        hashSet.add(Integer.valueOf(cmb.yi));
        hashSet.add(Integer.valueOf(cmb.z6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (sd2.S(z8c.t0, r5) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ArrayList arrayList, long j) {
        q59 q59Var;
        int i;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                break;
            }
            k47 k47Var = (k47) arrayList2.get(i2);
            TLRPC.Message message = k47Var.k;
            String str = k47Var.Y;
            long B0 = k47.B0(message);
            if (B0 < 0) {
                i = (int) (-B0);
            }
            i = 0;
            if (i == j) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (k47Var.e1() == ((Integer) arrayList.get(i3)).intValue()) {
                        arrayList2.remove(i2);
                        this.h.remove(k47Var.e1());
                        HashMap hashMap = this.r;
                        ArrayList arrayList3 = (ArrayList) hashMap.get(str);
                        arrayList3.remove(k47Var);
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
        if (!z || (q59Var = this.d) == null) {
            return;
        }
        q59Var.f();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            fv fvVar = this.b;
            int childCount = fvVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (fvVar.getChildAt(i3) instanceof hg3) {
                    ((hg3) fvVar.getChildAt(i3)).j0(0, true);
                }
                fvVar.getChildAt(i3).invalidate();
            }
        }
    }

    public final void e(int i, View view, k47 k47Var, int i2) {
        String str;
        if (k47Var != null) {
            if (this.p0.u()) {
                this.p0.i(k47Var, view, i2);
                return;
            }
            if (view instanceof hg3) {
                this.p0.r(k47Var);
                return;
            }
            byte b = this.E.d;
            og4 og4Var = this.h0;
            ArrayList arrayList = this.f;
            d dVar = this.M;
            if (b == 0) {
                PhotoViewer.r0().T1(null, dVar, null);
                PhotoViewer.r0().n1(arrayList, i, 0L, 0L, 0L, og4Var);
                this.S = PhotoViewer.r0().c;
                return;
            }
            if (b == 3 || b == 5) {
                if (view instanceof eda) {
                    ((eda) view).a();
                    return;
                }
                return;
            }
            if (b == 1) {
                if (view instanceof ida) {
                    ida idaVar = (ida) view;
                    TLRPC.Document F0 = k47Var.F0();
                    if (!idaVar.H) {
                        if (idaVar.G) {
                            bc4.G(j5.a(z8c.t0).a).f(F0);
                            idaVar.f(true);
                            return;
                        } else {
                            k47 message = idaVar.getMessage();
                            message.P = true;
                            bc4.G(j5.a(z8c.t0).a).X(F0, message, 0, 0);
                            idaVar.f(true);
                            return;
                        }
                    }
                    if (!k47Var.x()) {
                        gm.q2(k47Var, this.L, dVar);
                        return;
                    }
                    PhotoViewer.r0().T1(null, dVar, null);
                    int indexOf = arrayList.indexOf(k47Var);
                    if (indexOf >= 0) {
                        PhotoViewer.r0().T1(null, dVar, null);
                        PhotoViewer.r0().n1(arrayList, indexOf, 0L, 0L, 0L, og4Var);
                        this.S = PhotoViewer.r0().c;
                        return;
                    } else {
                        ArrayList u = td4.u(k47Var);
                        PhotoViewer.r0().T1(null, dVar, null);
                        PhotoViewer.r0().n1(u, 0, 0L, 0L, 0L, og4Var);
                        this.S = PhotoViewer.r0().c;
                        return;
                    }
                }
                return;
            }
            if (b == 2) {
                try {
                    TLRPC.MessageMedia messageMedia = k47Var.k.media;
                    TLRPC.WebPage webPage = messageMedia != null ? messageMedia.webpage : null;
                    if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                        str = null;
                    } else {
                        if (webPage.cached_page != null) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var) == null) {
                                dVar.createArticleViewer(false).L(k47Var, null, null, null);
                                return;
                            }
                            return;
                        }
                        String str2 = webPage.embed_url;
                        if (str2 != null && str2.length() != 0) {
                            zv3.I0(this.M, k47Var, this.h0, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                            return;
                        }
                        str = webPage.url;
                    }
                    if (str == null) {
                        ArrayList arrayList2 = ((lda) view).F;
                        str = arrayList2.size() > 0 ? ((CharSequence) arrayList2.get(0)).toString() : null;
                    }
                    if (str != null) {
                        g(str);
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void f(k47 k47Var, View view, int i) {
        if (!this.p0.u()) {
            this.p0.f();
        }
        if (this.p0.u()) {
            this.p0.i(k47Var, view, i);
        }
    }

    public final void g(String str) {
        if (gm.D3(str)) {
            ik.n0(this.M, str, true, true);
        } else {
            l11.u(this.L, str);
        }
    }

    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g5));
        arrayList.add(new cnb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        int i = cmb.h7;
        fv fvVar = this.b;
        arrayList.add(new cnb(fvVar, TLObject.FLAG_13, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        int i2 = cmb.j7;
        arrayList.add(new cnb(fvVar, TLObject.FLAG_14, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(fvVar, 8, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.pj));
        arrayList.add(new cnb(fvVar, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(fvVar, TLObject.FLAG_13, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(fvVar, TLObject.FLAG_14, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(fvVar, TLObject.FLAG_13, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(fvVar, TLObject.FLAG_14, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i2));
        a1b a1bVar = this.c;
        arrayList.add(new cnb(a1bVar.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(a1bVar.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x6));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Runnable, lg4] */
    public final void h(final long j, final long j2, final long j3, final long j4, final sh4 sh4Var, final boolean z, String str, boolean z2) {
        ArrayList arrayList;
        final String str2 = str == null ? "" : str;
        Locale locale = Locale.ENGLISH;
        final String str3 = j + j2 + j3 + j4 + ((int) (sh4Var == null ? (byte) -1 : sh4Var.d)) + str2 + z;
        String str4 = this.y;
        boolean z3 = str4 != null && str4.equals(str3);
        boolean z4 = !z3 && z2;
        this.E = sh4Var;
        this.F = j;
        this.G = j2;
        this.I = j3;
        this.H = j4;
        this.J = str2;
        this.K = z;
        lg4 lg4Var = this.e;
        if (lg4Var != null) {
            gm.r(lg4Var);
        }
        o04 o04Var = this.g0;
        gm.r(o04Var);
        if (z3 && z2) {
            return;
        }
        ArrayList arrayList2 = this.e0;
        final boolean z5 = z3;
        ArrayList arrayList3 = this.d0;
        a1b a1bVar = this.c;
        ArrayList arrayList4 = this.f;
        if (z4 || (sh4Var == null && j2 == 0 && j == 0 && j3 == 0 && j4 == 0)) {
            arrayList4.clear();
            this.n.clear();
            this.r.clear();
            this.N = true;
            a1bVar.setVisibility(0);
            q59 q59Var = this.d;
            if (q59Var != null) {
                q59Var.f();
            }
            this.Q++;
            fv fvVar = this.b;
            if (fvVar.getPinnedHeader() != null) {
                arrayList = arrayList4;
                fvVar.getPinnedHeader().setAlpha(0.0f);
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
        q59 q59Var2 = this.d;
        if (q59Var2 != null) {
            q59Var2.f();
        }
        if (!z5) {
            o04Var.run();
            a1bVar.e(true, !z2);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList2.clear();
            arrayList3.clear();
            sg4 sg4Var = this.i0;
            if (sg4Var != null) {
                ((nh3) sg4Var).h(false, null, null, false);
            }
        }
        final int i = this.Q + 1;
        this.Q = i;
        final int i2 = z8c.t0;
        ?? r0 = new Runnable() { // from class: lg4
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
                final ch4 ch4Var = ch4.this;
                ArrayList arrayList5 = ch4Var.f;
                final long j7 = j;
                long j8 = j2;
                String str5 = str2;
                final sh4 sh4Var2 = sh4Var;
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
                        cf7.Y(i7).J0(0, str5, arrayList7, new ArrayList(), new ArrayList(), null, z7 ? 1 : 0);
                        i4 = z7 ? 1 : 0;
                        arrayList6 = arrayList7;
                    }
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal2.limit = i5;
                    tL_messages_searchGlobal2.q = str5;
                    tL_messages_searchGlobal2.filter = sh4Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : sh4Var2.e;
                    tL_messages_searchGlobal2.community = oc7.r1(i3).g1(j8);
                    if (j6 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j6 / 1000);
                    }
                    if (j5 > 0) {
                        tL_messages_searchGlobal2.max_date = (int) (j5 / 1000);
                    }
                    if (z6 && str5.equals(ch4Var.x) && !arrayList5.isEmpty()) {
                        k47 k47Var = (k47) b10.f(i6, arrayList5);
                        tL_messages_searchGlobal2.offset_id = k47Var.e1();
                        tL_messages_searchGlobal2.offset_rate = ch4Var.w;
                        tL_messages_searchGlobal2.offset_peer = oc7.r1(i3).i1(k47.B1(k47Var.k.peer_id));
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
                    tL_messages_search.filter = sh4Var2 == null ? new TLRPC.TL_inputMessagesFilterEmpty() : sh4Var2.e;
                    tL_messages_search.peer = oc7.r1(j5.a(i7).a).i1(j7);
                    if (j9 > 0) {
                        tL_messages_search.min_date = (int) (j9 / 1000);
                    }
                    if (j10 > 0) {
                        tL_messages_search.max_date = (int) (j10 / 1000);
                    }
                    if (z6) {
                        str5 = str5;
                        if (str5.equals(ch4Var.x) && !arrayList5.isEmpty()) {
                            tL_messages_search.offset_id = ((k47) b10.f(1, arrayList5)).e1();
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
                ch4Var.x = str5;
                ch4Var.y = str3;
                final ArrayList arrayList9 = new ArrayList();
                uh4.B1(ch4Var.x, arrayList9);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                final int i8 = i;
                final String str6 = str5;
                final int i9 = i3;
                final long j11 = j6;
                connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new jac() { // from class: mg4
                    @Override // jac
                    public final void a(Object obj, Object obj2) {
                        final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                        final TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        final ArrayList arrayList10 = new ArrayList();
                        final int i10 = i9;
                        final String str7 = str6;
                        if (tL_error == null) {
                            int size = messages_messages.messages.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                k47 k47Var2 = new k47(i10, messages_messages.messages.get(i11), false, true);
                                k47Var2.J5(str7, true);
                                arrayList10.add(k47Var2);
                            }
                        }
                        final ch4 ch4Var2 = ch4.this;
                        final int i12 = i8;
                        final boolean z8 = z6;
                        final sh4 sh4Var3 = sh4Var2;
                        final long j12 = j7;
                        final long j13 = j11;
                        final ArrayList arrayList11 = arrayList8;
                        final ArrayList arrayList12 = arrayList9;
                        gm.c3(new Runnable() { // from class: ng4
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
                                sg4 sg4Var2;
                                ArrayList arrayList13;
                                ArrayList arrayList14;
                                SparseArray sparseArray;
                                ?? r16;
                                char c;
                                ch4 ch4Var3 = ch4.this;
                                vg4 vg4Var = ch4Var3.U;
                                ah4 ah4Var = ch4Var3.V;
                                ArrayList arrayList15 = ch4Var3.n;
                                SparseArray sparseArray2 = ch4Var3.h;
                                ArrayList arrayList16 = ch4Var3.e0;
                                HashMap hashMap = ch4Var3.r;
                                ArrayList arrayList17 = ch4Var3.d0;
                                ArrayList arrayList18 = ch4Var3.f;
                                fv fvVar2 = ch4Var3.b;
                                a1b a1bVar2 = ch4Var3.c;
                                if (i12 != ch4Var3.Q) {
                                    return;
                                }
                                ch4Var3.N = false;
                                if (tL_error != null) {
                                    xna xnaVar = a1bVar2.d;
                                    l66 l66Var = a1bVar2.e;
                                    xnaVar.setText(jb6.M0(2131745534, null));
                                    l66Var.setVisibility(0);
                                    l66Var.setText(jb6.M0(2131745541, null));
                                    a1bVar2.e(false, true);
                                    return;
                                }
                                a1bVar2.e(false, true);
                                xna xnaVar2 = a1bVar2.d;
                                l66 l66Var2 = a1bVar2.e;
                                TLRPC.messages_Messages messages_messages2 = messages_messages;
                                ch4Var3.w = messages_messages2.next_rate;
                                int i14 = i10;
                                cf7.Y(i14).j1(messages_messages2.users, messages_messages2.chats, true, true);
                                oc7.r1(i14).d4(messages_messages2.users, false);
                                oc7.r1(i14).X3(messages_messages2.chats, false);
                                boolean z9 = z8;
                                if (!z9) {
                                    arrayList18.clear();
                                    sparseArray2.clear();
                                    arrayList15.clear();
                                    hashMap.clear();
                                }
                                ch4Var3.P = messages_messages2.count;
                                String str9 = str7;
                                ch4Var3.R = str9;
                                ArrayList arrayList19 = arrayList10;
                                int size2 = arrayList19.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    boolean z10 = z9;
                                    k47 k47Var3 = (k47) arrayList19.get(i15);
                                    ArrayList arrayList20 = arrayList19;
                                    String str10 = k47Var3.Y;
                                    ArrayList arrayList21 = (ArrayList) hashMap.get(str10);
                                    int i16 = i15;
                                    if (arrayList21 == null) {
                                        arrayList13 = new ArrayList();
                                        hashMap.put(str10, arrayList13);
                                        arrayList15.add(str10);
                                    } else {
                                        arrayList13 = arrayList21;
                                    }
                                    arrayList13.add(k47Var3);
                                    arrayList18.add(k47Var3);
                                    sparseArray2.put(k47Var3.e1(), k47Var3);
                                    if (PhotoViewer.r0().V0()) {
                                        PhotoViewer r02 = PhotoViewer.r0();
                                        int i17 = ch4Var3.S;
                                        arrayList14 = arrayList15;
                                        ArrayList arrayList22 = r02.X6;
                                        sparseArray = sparseArray2;
                                        SparseArray[] sparseArrayArr = r02.Y6;
                                        if (i17 == r02.c) {
                                            if (sparseArrayArr[0].indexOfKey(k47Var3.e1()) < 0) {
                                                if (r02.P5) {
                                                    arrayList22.add(k47Var3);
                                                    c = 0;
                                                } else {
                                                    c = 0;
                                                    arrayList22.add(0, k47Var3);
                                                }
                                                r16 = c;
                                                sparseArrayArr[c].put(k47Var3.e1(), k47Var3);
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
                                if (arrayList18.size() > ch4Var3.P) {
                                    ch4Var3.P = arrayList18.size();
                                }
                                ch4Var3.O = arrayList18.size() >= ch4Var3.P;
                                boolean isEmpty2 = arrayList18.isEmpty();
                                sh4 sh4Var4 = sh4Var3;
                                byte b = 2;
                                if (!isEmpty2) {
                                    str8 = str9;
                                } else if (sh4Var4 != null) {
                                    if (TextUtils.isEmpty(ch4Var3.R)) {
                                        str8 = str9;
                                        if (j12 == 0 && j13 == 0) {
                                            xnaVar2.setText(jb6.M0(2131745535, null));
                                            byte b2 = sh4Var4.d;
                                            String M0 = b2 == 1 ? jb6.M0(2131745540, null) : b2 == 0 ? jb6.M0(2131745538, null) : b2 == 2 ? jb6.M0(2131745539, null) : b2 == 3 ? jb6.M0(2131745537, null) : jb6.M0(2131745536, null);
                                            l66Var2.setVisibility(0);
                                            l66Var2.setText(M0);
                                        }
                                    } else {
                                        str8 = str9;
                                    }
                                    xnaVar2.setText(jb6.M0(2131745534, null));
                                    l66Var2.setVisibility(0);
                                    l66Var2.setText(jb6.M0(2131745541, null));
                                } else {
                                    str8 = str9;
                                    xnaVar2.setText(jb6.M0(2131745534, null));
                                    l66Var2.setVisibility(8);
                                }
                                if (sh4Var4 != null) {
                                    byte b3 = sh4Var4.d;
                                    if (b3 != 0) {
                                        if (b3 == 1) {
                                            ch4Var3.d = ch4Var3.W;
                                        } else if (b3 == 2) {
                                            ch4Var3.d = ch4Var3.a0;
                                        } else if (b3 == 3) {
                                            ch4Var3.d = ch4Var3.b0;
                                        } else if (b3 == 5) {
                                            ch4Var3.d = ch4Var3.c0;
                                        }
                                    } else if (TextUtils.isEmpty(ch4Var3.R)) {
                                        ch4Var3.d = ah4Var;
                                    } else {
                                        ch4Var3.d = vg4Var;
                                    }
                                } else {
                                    ch4Var3.d = vg4Var;
                                }
                                y59 adapter = fvVar2.getAdapter();
                                q59 q59Var3 = ch4Var3.d;
                                if (adapter != q59Var3) {
                                    fvVar2.setAdapter(q59Var3);
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
                                    if (str8 != null && str8.length() >= 3 && (jb6.M0(2131745635, null).toLowerCase().startsWith(str8) || "saved messages".startsWith(str8))) {
                                        for (int i18 = 0; i18 < arrayList17.size(); i18++) {
                                            if (!(arrayList17.get(i18) instanceof TLRPC.User) || z8c.h(z8c.t0).f().id != ((TLRPC.User) arrayList17.get(i18)).id) {
                                            }
                                        }
                                        r12 = 0;
                                        arrayList17.add(0, z8c.h(z8c.t0).f());
                                        arrayList16.clear();
                                        arrayList16.addAll(arrayList12);
                                        ch4Var3.f0 = r12;
                                        if (str8 != null || str8.length() < 3) {
                                            view = null;
                                        } else {
                                            view = null;
                                            if (jb6.M0(2131754115, null).toLowerCase().startsWith(str8) || "archive".startsWith(str8)) {
                                                ch4Var3.f0 = true;
                                            }
                                        }
                                        sg4Var2 = ch4Var3.i0;
                                        i13 = r12;
                                        if (sg4Var2 != null) {
                                            ((nh3) sg4Var2).h(TextUtils.isEmpty(ch4Var3.R), arrayList17, arrayList16, ch4Var3.f0);
                                            i13 = r12;
                                        }
                                    }
                                    r12 = 0;
                                    arrayList16.clear();
                                    arrayList16.addAll(arrayList12);
                                    ch4Var3.f0 = r12;
                                    if (str8 != null) {
                                    }
                                    view = null;
                                    sg4Var2 = ch4Var3.i0;
                                    i13 = r12;
                                    if (sg4Var2 != null) {
                                    }
                                }
                                int i19 = -1;
                                View view2 = view;
                                for (int i20 = i13; i20 < size2; i20++) {
                                    View childAt = fvVar2.getChildAt(i20);
                                    if (childAt instanceof tk4) {
                                        i19 = RecyclerView.R(childAt);
                                        view2 = childAt;
                                    }
                                }
                                if (view2 != null) {
                                    fvVar2.removeView(view2);
                                }
                                if ((ch4Var3.l0.getVisibility() == 0 && fvVar2.getChildCount() == 0) || (fvVar2.getAdapter() != ah4Var && view2 != null)) {
                                    ch4Var3.getViewTreeObserver().addOnPreDrawListener(new m42(ch4Var3, (tk4) view2, i19, b));
                                }
                                ch4Var3.d.f();
                            }
                        });
                    }
                });
            }
        };
        this.e = r0;
        gm.d3(r0, (!z5 || arrayList.isEmpty()) ? 350L : 0L);
        pg4 pg4Var = this.l0;
        if (sh4Var == null) {
            pg4Var.setViewType(1);
            return;
        }
        byte b = sh4Var.d;
        if (b == 0) {
            if (TextUtils.isEmpty(this.J)) {
                pg4Var.setViewType(2);
                return;
            } else {
                pg4Var.setViewType(1);
                return;
            }
        }
        if (b == 1) {
            pg4Var.setViewType(3);
            return;
        }
        if (b == 3 || b == 5) {
            pg4Var.setViewType(4);
        } else if (b == 2) {
            pg4Var.setViewType(5);
        }
    }

    public final void i(sg4 sg4Var, boolean z) {
        this.i0 = sg4Var;
        if (!z || sg4Var == null) {
            return;
        }
        ArrayList arrayList = this.d0;
        if (arrayList.isEmpty()) {
            return;
        }
        ((nh3) sg4Var).h(false, arrayList, this.e0, this.f0);
    }

    public final void j(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.s0 = z;
        setPadding(0, i, 0, i2);
        fv fvVar = this.b;
        if (z) {
            fvVar.q1(0, i, 0, i2);
        } else {
            fvVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fvVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.s0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = z8c.t0;
        this.r0 = i;
        nm7.f(i).b(this, nm7.m4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.r0).n(this, nm7.m4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        q59 q59Var;
        byte b = this.s;
        byte b2 = 3;
        if (gm.O1()) {
            this.s = (byte) 3;
        } else if (getResources().getConfiguration().orientation == 2) {
            b2 = 6;
            this.s = (byte) 6;
        } else {
            this.s = (byte) 3;
        }
        if (b != b2 && (q59Var = this.d) == this.V) {
            this.s0 = true;
            q59Var.f();
            this.s0 = false;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }

    public void setBlurredBackgroundDrawableFactory(km0 km0Var) {
        nm0 nm0Var = new nm0(null);
        nm0Var.e = new w00((byte) 16);
        nm0Var.f(385875968, 402653183);
        nm0Var.e(385875968, 402653183);
        nm0Var.d(0, 0);
        nm0Var.f = 1.0f;
        nm0Var.h = 1.0f;
        tg4 tg4Var = this.n0;
        im0 c = km0Var.c(tg4Var, nm0Var, false);
        tg4Var.b = c;
        c.r(gm.L(11.5f));
        tg4Var.b.q(gm.L(5.0f));
    }

    public void setChatPreviewDelegate(rv9 rv9Var) {
        this.j0 = rv9Var;
    }

    public void setUiCallback(bh4 bh4Var) {
        this.p0 = bh4Var;
    }

    public void setUseFromUserAsAvatar(boolean z) {
        this.q0 = z;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            tg4 tg4Var = this.n0;
            if (tg4Var != null) {
                tg4Var.updateColors();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
