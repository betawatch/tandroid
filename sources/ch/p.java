package ch;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.e3;
import bi.v1;
import c8.l9;
import c8.ma;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fd;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.s01;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p extends g2 implements gs {
    public final Paint E;
    public h51 F;
    public final ArrayList G;
    public final ArrayList H;
    public final LinkedHashMap I;
    public final ArrayList J;
    public final LinkedHashMap K;
    public final ArrayList L;
    public boolean M;
    public int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public te.a R;
    public final TLRPC.ChatFull S;
    public final long T;
    public int U;
    public int V;
    public TLRPC.Chat W;
    public TL_stories.TL_premium_boostsStatus X;
    public int Y;
    public int Z;
    public boolean a;
    public boolean a0;
    public n b;
    public final h b0;
    public e3 c;
    public f d;
    public s8 e;
    public a9 f;
    public m h;
    public u7 n;
    public s8 r;
    public t0 s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public p(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().B4;
        this.P = false;
        this.Z = -1;
        this.b0 = new h(this, 6);
        this.T = j3;
        this.S = chatFull;
    }

    public final void b0(View view, boolean z10) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z10));
    }

    public final void c0(y5 y5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(y5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            y5[] y5VarArr = (y5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), y5.class);
            for (y5 y5Var2 : y5VarArr) {
                y5Var2.setAnimateChanges();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f3 A[EDGE_INSN: B:54:0x03f3->B:55:0x03f3 BREAK  A[LOOP:1: B:42:0x034b->B:53:0x034b], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.g2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        int i7;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c10;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(hd.N0(2131746191, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = 3;
        this.simpleActionBar.setActionBarMenuOnItemClick(new v1(this, i10));
        h51 h51Var = new h51(this, new bi.b(this, 12), null, null);
        this.F = h51Var;
        h51Var.setSections(true);
        this.F.setSectionsDrawBackground(true);
        ai.l0 l0Var = new ai.l0(this, context);
        l0Var.setFocusableInTouchMode(true);
        l0Var.requestFocus();
        s8 s8Var = new s8(context);
        this.e = s8Var;
        s8Var.setHeight(56);
        s8 s8Var2 = this.e;
        t6.h(s8Var2.e.h ? m6.f6 : m6.e6, s8Var2, null);
        this.e.setTypeface(org.telegram.messenger.g0.o());
        this.e.d(m6.g6, m6.O6, m6.P6, m6.Q6, m6.R6);
        final int i11 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s8 s8Var3;
                switch (i11) {
                    case 0:
                        p pVar = this.b;
                        if (pVar.e.e.h && (s8Var3 = pVar.r) != null && s8Var3.e.h) {
                            pVar.k0();
                        }
                        boolean z11 = pVar.e.e.h;
                        pVar.i0(z11 ? 2 : 1, z11 ? false : pVar.a, true);
                        break;
                    case 1:
                        this.b.k0();
                        break;
                    default:
                        p pVar2 = this.b;
                        if (!pVar2.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pVar2.X;
                            if (tL_premium_boostsStatus != null) {
                                int i12 = tL_premium_boostsStatus.level;
                                int i13 = pVar2.Y;
                                if (i12 < i13) {
                                    s0.f(-pVar2.T, i13, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            s8 s8Var4 = pVar2.r;
                            Boolean valueOf = (s8Var4 == null || !pVar2.S.paid_media_allowed) ? null : Boolean.valueOf(s8Var4.e.h);
                            pVar2.s.setLoading(true);
                            pVar2.N = pVar2.Z;
                            np messagesController = pVar2.getMessagesController();
                            long j3 = pVar2.T;
                            int i14 = pVar2.Z;
                            ArrayList h02 = pVar2.h0(false);
                            int i15 = pVar2.V;
                            pVar2.U = i15;
                            messagesController.R4(j3, i14, h02, i15, valueOf, new i(pVar2, 2), new h(pVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        a9 a9Var = new a9(12, context, this.resourceProvider);
        this.f = a9Var;
        m80 textView = a9Var.getTextView();
        int i12 = m6.B6;
        t6.U(textView, i12, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(hd.N0(2131746213, null));
        o4 o4Var = new o4(context);
        o4Var.setText(hd.N0(2131753756, null));
        t6.h(m6.d6, o4Var, null);
        o4Var.setTextSize(15.0f);
        o4Var.setTopMargin(14);
        b0(o4Var, false);
        h6 resourceProvider = getResourceProvider();
        int i13 = this.O;
        m mVar = new m(this, context, resourceProvider, i13);
        this.h = mVar;
        mVar.setOnFocused(new h(this, i10));
        b0(this.h, false);
        a9 a9Var2 = new a9(12, context, this.resourceProvider);
        t6.U(a9Var2.getTextView(), i12, null);
        a9Var2.setText(org.telegram.messenger.g0.R2(hd.N0(2131746210, null), m6.Xc, 0, new h(this, 4), getResourceProvider()));
        b0(a9Var2, true);
        o4 o4Var2 = new o4(context, this.resourceProvider);
        o4Var2.setText(hd.N0(2131748474, null));
        b0(o4Var2, false);
        this.n = new u7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.S;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            int i14 = getMessagesController().N5;
            this.V = i14;
            this.U = i14;
        } else {
            int i15 = chatFull.reactions_limit;
            this.V = i15;
            this.U = i15;
        }
        u7 u7Var = this.n;
        int i16 = this.V;
        int i17 = getMessagesController().N5;
        t7 t7Var = new t7();
        t7Var.a = 1;
        t7Var.b = i17;
        t7Var.e = new fd(22);
        u7Var.d(i16, t7Var, new i(this, i10));
        b0(this.n, false);
        a9 a9Var3 = new a9(12, context, this.resourceProvider);
        a9Var3.setTopPadding(12);
        a9Var3.setBottomPadding(16);
        a9Var3.setText(hd.N0(2131748473, null));
        b0(a9Var3, true);
        if (chatFull.paid_media_allowed) {
            s8 s8Var3 = new s8(context);
            this.r = s8Var3;
            s8Var3.f(hd.N0(2131752399, null), false, false);
            b0(this.r, false);
            final int i18 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s8 s8Var32;
                    switch (i18) {
                        case 0:
                            p pVar = this.b;
                            if (pVar.e.e.h && (s8Var32 = pVar.r) != null && s8Var32.e.h) {
                                pVar.k0();
                            }
                            boolean z11 = pVar.e.e.h;
                            pVar.i0(z11 ? 2 : 1, z11 ? false : pVar.a, true);
                            break;
                        case 1:
                            this.b.k0();
                            break;
                        default:
                            p pVar2 = this.b;
                            if (!pVar2.s.R) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pVar2.X;
                                if (tL_premium_boostsStatus != null) {
                                    int i122 = tL_premium_boostsStatus.level;
                                    int i132 = pVar2.Y;
                                    if (i122 < i132) {
                                        s0.f(-pVar2.T, i132, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                s8 s8Var4 = pVar2.r;
                                Boolean valueOf = (s8Var4 == null || !pVar2.S.paid_media_allowed) ? null : Boolean.valueOf(s8Var4.e.h);
                                pVar2.s.setLoading(true);
                                pVar2.N = pVar2.Z;
                                np messagesController = pVar2.getMessagesController();
                                long j3 = pVar2.T;
                                int i142 = pVar2.Z;
                                ArrayList h02 = pVar2.h0(false);
                                int i152 = pVar2.V;
                                pVar2.U = i152;
                                messagesController.R4(j3, i142, h02, i152, valueOf, new i(pVar2, 2), new h(pVar2, 2));
                                break;
                            }
                            break;
                    }
                }
            });
            a9 a9Var4 = new a9(12, context, this.resourceProvider);
            t6.U(a9Var4.getTextView(), i12, null);
            a9Var4.setTopPadding(12);
            a9Var4.setBottomPadding(70);
            a9Var4.setText(org.telegram.messenger.g0.b4(hd.N0(2131752398, null), new h(this, 5)));
            b0(a9Var4, true);
        } else {
            a9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        t6.s(this.x, m6.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, ma.e(-1, -1, ls.E1));
        t0 t0Var = new t0(context, getResourceProvider(), true);
        this.s = t0Var;
        t0Var.f();
        t0 t0Var2 = this.s;
        t0Var2.getClass();
        t0Var2.i(new SpannableStringBuilder(hd.N0(2131746192, null)), false, true);
        t0Var2.m0 = new SpannableStringBuilder("l");
        nq nqVar = new nq(R.drawable.mini_switch_lock, 0);
        nqVar.n = 1;
        char c11 = '!';
        t0Var2.m0.setSpan(nqVar, 0, 1, 33);
        final int i19 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
            public final /* synthetic */ p b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s8 s8Var32;
                switch (i19) {
                    case 0:
                        p pVar = this.b;
                        if (pVar.e.e.h && (s8Var32 = pVar.r) != null && s8Var32.e.h) {
                            pVar.k0();
                        }
                        boolean z11 = pVar.e.e.h;
                        pVar.i0(z11 ? 2 : 1, z11 ? false : pVar.a, true);
                        break;
                    case 1:
                        this.b.k0();
                        break;
                    default:
                        p pVar2 = this.b;
                        if (!pVar2.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pVar2.X;
                            if (tL_premium_boostsStatus != null) {
                                int i122 = tL_premium_boostsStatus.level;
                                int i132 = pVar2.Y;
                                if (i122 < i132) {
                                    s0.f(-pVar2.T, i132, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            s8 s8Var4 = pVar2.r;
                            Boolean valueOf = (s8Var4 == null || !pVar2.S.paid_media_allowed) ? null : Boolean.valueOf(s8Var4.e.h);
                            pVar2.s.setLoading(true);
                            pVar2.N = pVar2.Z;
                            np messagesController = pVar2.getMessagesController();
                            long j3 = pVar2.T;
                            int i142 = pVar2.Z;
                            ArrayList h02 = pVar2.h0(false);
                            int i152 = pVar2.V;
                            pVar2.U = i152;
                            messagesController.R4(j3, i142, h02, i152, valueOf, new i(pVar2, 2), new h(pVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        l0Var.addView(this.F);
        l0Var.addView(this.w, ma.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, ma.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        l0();
        e3 e3Var = new e3(this, context);
        this.c = e3Var;
        e3Var.setVisibility(4);
        l0Var.addView(this.c, ma.e(-1, -2, 80));
        this.R = new te.a(0, new d6.i(this, 6), nr.f, 350L, false);
        m0();
        n0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.L;
        ArrayList arrayList4 = this.J;
        LinkedHashMap linkedHashMap3 = this.I;
        if (!z11) {
            ArrayList arrayList5 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList6 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size = arrayList6.size();
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (i21 >= size) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList6.get(i21);
                    i21++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction == null) {
                            continue;
                        } else {
                            s0.a(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList5;
                            spannableStringBuilder2 = spannableStringBuilder4;
                            i20++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList5;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            n nVar = this.b;
                            y5 e10 = s0.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e10);
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList6;
                            c10 = '!';
                            spannableString.setSpan(e10, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (nVar != null) {
                                nVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i20++;
                            if (i20 < i13) {
                                break;
                            }
                            c11 = c10;
                            spannableStringBuilder4 = spannableStringBuilder2;
                            arrayList5 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList6 = arrayList2;
                            document = null;
                        }
                    }
                    arrayList2 = arrayList6;
                    c10 = c11;
                    if (i20 < i13) {
                    }
                }
                this.h.append(spannableStringBuilder2);
                i0(1, this.a, false);
                z10 = true;
                i7 = 2;
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList5;
                boolean z12 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z12 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i7 = 2;
                    i0(2, this.a, false);
                } else if (z12) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    int size2 = arrayList3.size();
                    int i22 = 0;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            break;
                        }
                        Object obj = arrayList3.get(i23);
                        i23++;
                        ArrayList arrayList8 = arrayList7;
                        s0.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z10 = true;
                        i22++;
                        if (i22 >= i13) {
                            break;
                        }
                        spannableStringBuilder5 = spannableStringBuilder;
                        arrayList7 = arrayList8;
                    }
                    this.h.append(spannableStringBuilder);
                    i7 = 2;
                    i0(2, this.a, false);
                } else {
                    i7 = 2;
                }
            }
            this.e.f(hd.N0(2131751141, null), (this.Z == i7 || this.a) ? z10 : false, false);
            this.h.J();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                k0();
            }
            this.K.putAll(linkedHashMap);
            this.M = this.a;
            this.N = this.Z;
            this.fragmentView = l0Var;
            return l0Var;
        }
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        int size3 = arrayList3.size();
        int i24 = 0;
        int i25 = 0;
        while (true) {
            if (i25 >= size3) {
                linkedHashMap2 = linkedHashMap3;
                spannableStringBuilder3 = spannableStringBuilder6;
                break;
            }
            Object obj2 = arrayList3.get(i25);
            i25++;
            ArrayList arrayList9 = arrayList4;
            linkedHashMap2 = linkedHashMap3;
            s0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
            spannableStringBuilder3 = spannableStringBuilder6;
            i24++;
            if (i24 >= i13) {
                break;
            }
            spannableStringBuilder6 = spannableStringBuilder3;
            linkedHashMap3 = linkedHashMap2;
            arrayList4 = arrayList9;
        }
        this.h.append(spannableStringBuilder3);
        i0(0, this.a, false);
        i7 = 2;
        linkedHashMap = linkedHashMap2;
        z10 = true;
        this.e.f(hd.N0(2131751141, null), (this.Z == i7 || this.a) ? z10 : false, false);
        this.h.J();
        if (chatFull.paid_media_allowed) {
            k0();
        }
        this.K.putAll(linkedHashMap);
        this.M = this.a;
        this.N = this.Z;
        this.fragmentView = l0Var;
        return l0Var;
    }

    public final boolean d0(boolean z10) {
        final int i7 = 1;
        boolean z11 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        final int i10 = 0;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z11 = false;
        }
        if (this.M != this.a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String N0 = hd.N0(2131743590, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = hd.N0(2131746211, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(hd.N0(2131754213, "ApplyTheme"), new q1(this) { // from class: ch.g
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(t1 t1Var2, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.s.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.h(hd.N0(2131751394, null), new q1(this) { // from class: ch.g
                public final /* synthetic */ p b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.q1
                public final void h(t1 t1Var2, int i11) {
                    switch (i7) {
                        case 0:
                            this.b.s.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.p();
        }
        return z11;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            r4 r4Var = this.parentLayout;
            if (r4Var == null || r4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(boolean z10) {
        if (this.X == null) {
            return;
        }
        if (this.Z == 0) {
            this.Z = 1;
        }
        int size = h0(true).size();
        this.Y = size;
        if (this.X.level >= size) {
            this.s.g(null, true);
            return;
        }
        if (z10) {
            lc.b0(this).Q(R.raw.chats_infotip, 36, org.telegram.messenger.g0.W2(hd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.Y);
    }

    public final void f0() {
        if (this.P) {
            this.P = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.F.setFocusableInTouchMode(true);
                this.F.requestFocus();
            }
            ls.e().k(ls.j1, 512);
            this.c.setLayerType(2, null);
            this.R.a(false, true);
        }
    }

    public final boolean g0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, y5.class);
        for (y5 y5Var : y5VarArr) {
            this.I.remove(Long.valueOf(y5Var.documentId));
            this.J.remove(Long.valueOf(y5Var.documentId));
            this.b.A(Long.valueOf(y5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ek0 getListViewForSimpleGlass() {
        return this.F;
    }

    public final ArrayList h0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.L;
                int size2 = arrayList4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l10.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l10.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z10 ? arrayList2 : arrayList;
    }

    public final void i0(int i7, boolean z10, boolean z11) {
        if (this.Z == i7 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i7 == 1 || i7 == 0 || z10;
        this.e.setChecked(z12);
        int x02 = m6.x0(null, z12 ? m6.f6 : m6.e6, false);
        if (!z11) {
            t6.h(z12 ? m6.f6 : m6.e6, this.e, null);
        } else if (z12) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.Z = i7;
        if (i7 != 1 && i7 != 0 && !z10) {
            if (!z11) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            } else {
                f0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(nr.f).setListener(new ai.k0(this, 3)).start();
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.F.g3.O(z11);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(nr.f).start();
            this.F.post(new h(this, 1));
            LinkedHashMap linkedHashMap = this.I;
            if (linkedHashMap.isEmpty()) {
                this.b.L.clear();
                this.h.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    s0.a((TLRPC.TL_availableReaction) arrayList.get(i11), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i10++;
                    if (i10 >= this.O) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.J();
                s01 s01Var = this.b.q0;
                if (s01Var != null) {
                    s01Var.f();
                }
                e0(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f10) {
        float a10 = l9.a(f10, 0.0f, 1.0f);
        e3 e3Var = this.c;
        if (e3Var != null && this.w != null) {
            e3Var.setTranslationY((1.0f - a10) * e3Var.getMeasuredHeight());
            this.w.setTranslationY((-a10) * this.c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        s8 s8Var = this.r;
        boolean z10 = s8Var.e.h;
        int i7 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            s8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            y5 y5Var = (y5) linkedHashMap.remove(-1L);
            if (y5Var != null) {
                y5Var.setRemoved(new c1.a(3, this, y5Var));
            }
            c0(y5Var);
            this.b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Z, this.a, true);
        } else {
            s8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                o oVar = new o(this);
                oVar.cacheType = p5.f();
                oVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, oVar);
                spannableString.setSpan(oVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                e0(true);
                c0(oVar);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            i0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        if (this.w == null || this.s == null) {
            return;
        }
        te.a aVar = this.R;
        int round = Math.round((1.0f - (aVar != null ? aVar.e : 0.0f)) * this.y);
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height = org.telegram.messenger.g0.L(74.0f) + round;
        this.w.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    public final void m0() {
        if (this.c != null) {
            this.E.setColor(m6.w0(m6.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void n0() {
        if (this.F == null) {
            return;
        }
        te.a aVar = this.R;
        int W1 = org.telegram.messenger.g0.W1(aVar != null ? aVar.e : 0.0f, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        h51 h51Var = this.F;
        i0.b bVar = this.mSystemInsets;
        ri.a.e(h51Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onBackPressed(boolean z10) {
        if (this.P) {
            if (z10) {
                f0();
                return false;
            }
        } else if (!d0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        np messagesController = getMessagesController();
        long j3 = this.T;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        this.W = O0;
        int i7 = 0;
        if (O0 == null) {
            TLRPC.Chat P = ur.a0(this.currentAccount).P(j3);
            this.W = P;
            if (P != null) {
                getMessagesController().X3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().I0().a(-j3, new i(this, i7));
            getNotificationCenter().c(this, ls.Y4);
            this.L.addAll(getMediaDataController().n);
            ls.e().k(ls.j1, 512);
            getNotificationCenter().c(this, ls.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().R4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, ls.Y4);
        getNotificationCenter().n(this, ls.y1);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.y = i12;
        l0();
        m0();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                org.telegram.messenger.g0.h3(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            s8 s8Var = this.e;
            if (s8Var == null || !(s8Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            s8 s8Var2 = this.e;
            s8Var2.setBackgroundColor(m6.x0(null, s8Var2.e.h ? m6.f6 : m6.e6, false));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.Z != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.Q = true;
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            n nVar = new n(this, this, getParentActivity(), getResourceProvider(), m6.w0(m6.G6, getResourceProvider()));
            this.b = nVar;
            nVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            t6.h(m6.d6, this.b, null);
            this.c.addView(this.b, ma.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, ma.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                this.b.x((Long) obj, false);
            }
        }
        org.telegram.messenger.g0.h3(new ai.n(6), 200L);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
