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
import bi.g2;
import bi.x4;
import c8.i9;
import c8.ja;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fd;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o extends e2 implements is {
    public final Paint E;
    public u41 F;
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
    public m b;
    public final h b0;
    public g2 c;
    public f d;
    public q8 e;
    public y8 f;
    public l h;
    public s7 n;
    public q8 r;
    public t0 s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public o(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().z4;
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

    public final void c0(p5 p5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(p5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            p5[] p5VarArr = (p5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), p5.class);
            for (p5 p5Var2 : p5VarArr) {
                p5Var2.setAnimateChanges();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f8 A[EDGE_INSN: B:54:0x03f8->B:55:0x03f8 BREAK  A[LOOP:1: B:42:0x034e->B:53:0x034e], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.e2
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
        int i10;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c10;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(hd.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 1));
        u41 u41Var = new u41(this, new bi.b(this, 10), null, null);
        this.F = u41Var;
        u41Var.setSections(true);
        this.F.setSectionsDrawBackground(true);
        ai.k0 k0Var = new ai.k0(this, context);
        k0Var.setFocusableInTouchMode(true);
        k0Var.requestFocus();
        q8 q8Var = new q8(context);
        this.e = q8Var;
        q8Var.setHeight(56);
        q8 q8Var2 = this.e;
        q6.h(q8Var2.e.h ? j6.f6 : j6.e6, q8Var2, null);
        this.e.setTypeface(org.telegram.messenger.g0.o());
        this.e.d(j6.g6, j6.O6, j6.P6, j6.Q6, j6.R6);
        final int i11 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q8 q8Var3;
                switch (i11) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (q8Var3 = oVar.r) != null && q8Var3.e.h) {
                            oVar.k0();
                        }
                        boolean z11 = oVar.e.e.h;
                        oVar.i0(z11 ? 2 : 1, z11 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.k0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.X;
                            if (tL_premium_boostsStatus != null) {
                                int i12 = tL_premium_boostsStatus.level;
                                int i13 = oVar2.Y;
                                if (i12 < i13) {
                                    s0.f(-oVar2.T, i13, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            q8 q8Var4 = oVar2.r;
                            Boolean valueOf = (q8Var4 == null || !oVar2.S.paid_media_allowed) ? null : Boolean.valueOf(q8Var4.e.h);
                            oVar2.s.setLoading(true);
                            oVar2.N = oVar2.Z;
                            np messagesController = oVar2.getMessagesController();
                            long j3 = oVar2.T;
                            int i14 = oVar2.Z;
                            ArrayList h02 = oVar2.h0(false);
                            int i15 = oVar2.V;
                            oVar2.U = i15;
                            messagesController.H4(j3, i14, h02, i15, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        y8 y8Var = new y8(12, context, this.resourceProvider);
        this.f = y8Var;
        z70 textView = y8Var.getTextView();
        int i12 = j6.B6;
        q6.U(textView, i12, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(hd.M0(2131746409, null));
        n4 n4Var = new n4(context);
        n4Var.setText(hd.M0(2131753759, null));
        q6.h(j6.d6, n4Var, null);
        n4Var.setTextSize(15.0f);
        n4Var.setTopMargin(14);
        b0(n4Var, false);
        e6 resourceProvider = getResourceProvider();
        int i13 = this.O;
        l lVar = new l(this, context, resourceProvider, i13);
        this.h = lVar;
        int i14 = 3;
        lVar.setOnFocused(new h(this, i14));
        b0(this.h, false);
        y8 y8Var2 = new y8(12, context, this.resourceProvider);
        q6.U(y8Var2.getTextView(), i12, null);
        y8Var2.setText(org.telegram.messenger.g0.S2(hd.M0(2131746406, null), j6.Xc, 0, new h(this, 4), getResourceProvider()));
        b0(y8Var2, true);
        n4 n4Var2 = new n4(context, this.resourceProvider);
        n4Var2.setText(hd.M0(2131748667, null));
        b0(n4Var2, false);
        this.n = new s7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.S;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            int i15 = getMessagesController().L5;
            this.V = i15;
            this.U = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.V = i16;
            this.U = i16;
        }
        s7 s7Var = this.n;
        int i17 = this.V;
        int i18 = getMessagesController().L5;
        r7 r7Var = new r7();
        r7Var.a = 1;
        r7Var.b = i18;
        r7Var.e = new fd(21);
        s7Var.d(i17, r7Var, new i(this, i14));
        b0(this.n, false);
        y8 y8Var3 = new y8(12, context, this.resourceProvider);
        y8Var3.setTopPadding(12);
        y8Var3.setBottomPadding(16);
        y8Var3.setText(hd.M0(2131748666, null));
        b0(y8Var3, true);
        if (chatFull.paid_media_allowed) {
            q8 q8Var3 = new q8(context);
            this.r = q8Var3;
            q8Var3.f(hd.M0(2131752411, null), false, false);
            b0(this.r, false);
            final int i19 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q8 q8Var32;
                    switch (i19) {
                        case 0:
                            o oVar = this.b;
                            if (oVar.e.e.h && (q8Var32 = oVar.r) != null && q8Var32.e.h) {
                                oVar.k0();
                            }
                            boolean z11 = oVar.e.e.h;
                            oVar.i0(z11 ? 2 : 1, z11 ? false : oVar.a, true);
                            break;
                        case 1:
                            this.b.k0();
                            break;
                        default:
                            o oVar2 = this.b;
                            if (!oVar2.s.R) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.X;
                                if (tL_premium_boostsStatus != null) {
                                    int i122 = tL_premium_boostsStatus.level;
                                    int i132 = oVar2.Y;
                                    if (i122 < i132) {
                                        s0.f(-oVar2.T, i132, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                q8 q8Var4 = oVar2.r;
                                Boolean valueOf = (q8Var4 == null || !oVar2.S.paid_media_allowed) ? null : Boolean.valueOf(q8Var4.e.h);
                                oVar2.s.setLoading(true);
                                oVar2.N = oVar2.Z;
                                np messagesController = oVar2.getMessagesController();
                                long j3 = oVar2.T;
                                int i142 = oVar2.Z;
                                ArrayList h02 = oVar2.h0(false);
                                int i152 = oVar2.V;
                                oVar2.U = i152;
                                messagesController.H4(j3, i142, h02, i152, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                                break;
                            }
                            break;
                    }
                }
            });
            y8 y8Var4 = new y8(12, context, this.resourceProvider);
            q6.U(y8Var4.getTextView(), i12, null);
            y8Var4.setTopPadding(12);
            y8Var4.setBottomPadding(70);
            y8Var4.setText(org.telegram.messenger.g0.c4(hd.M0(2131752410, null), new h(this, 5)));
            b0(y8Var4, true);
        } else {
            y8Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        q6.s(this.x, j6.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, ja.e(-1, -1, ns.E1));
        t0 t0Var = new t0(context, getResourceProvider(), true);
        this.s = t0Var;
        t0Var.f();
        t0 t0Var2 = this.s;
        t0Var2.getClass();
        t0Var2.i(new SpannableStringBuilder(hd.M0(2131746388, null)), false, true);
        t0Var2.l0 = new SpannableStringBuilder("l");
        eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
        eqVar.n = 1;
        char c11 = '!';
        t0Var2.l0.setSpan(eqVar, 0, 1, 33);
        final int i20 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q8 q8Var32;
                switch (i20) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (q8Var32 = oVar.r) != null && q8Var32.e.h) {
                            oVar.k0();
                        }
                        boolean z11 = oVar.e.e.h;
                        oVar.i0(z11 ? 2 : 1, z11 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.k0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.X;
                            if (tL_premium_boostsStatus != null) {
                                int i122 = tL_premium_boostsStatus.level;
                                int i132 = oVar2.Y;
                                if (i122 < i132) {
                                    s0.f(-oVar2.T, i132, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            q8 q8Var4 = oVar2.r;
                            Boolean valueOf = (q8Var4 == null || !oVar2.S.paid_media_allowed) ? null : Boolean.valueOf(q8Var4.e.h);
                            oVar2.s.setLoading(true);
                            oVar2.N = oVar2.Z;
                            np messagesController = oVar2.getMessagesController();
                            long j3 = oVar2.T;
                            int i142 = oVar2.Z;
                            ArrayList h02 = oVar2.h0(false);
                            int i152 = oVar2.V;
                            oVar2.U = i152;
                            messagesController.H4(j3, i142, h02, i152, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        k0Var.addView(this.F);
        k0Var.addView(this.w, ja.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, ja.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        l0();
        g2 g2Var = new g2(this, context);
        this.c = g2Var;
        g2Var.setVisibility(4);
        k0Var.addView(this.c, ja.e(-1, -2, 80));
        this.R = new te.a(0, new cb.c(this, 10), er.f, 350L, false);
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
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i22 >= size) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList6.get(i22);
                    i22++;
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
                            i21++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList5;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            m mVar = this.b;
                            i10 = i22;
                            p5 e10 = s0.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e10);
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList6;
                            c10 = '!';
                            spannableString.setSpan(e10, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (mVar != null) {
                                mVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i21++;
                            if (i21 < i13) {
                                break;
                            }
                            i22 = i10;
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
                    i10 = i22;
                    if (i21 < i13) {
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
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            break;
                        }
                        Object obj = arrayList3.get(i24);
                        i24++;
                        ArrayList arrayList8 = arrayList7;
                        s0.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z10 = true;
                        i23++;
                        if (i23 >= i13) {
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
            this.e.f(hd.M0(2131751153, null), (this.Z == i7 || this.a) ? z10 : false, false);
            this.h.J();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                k0();
            }
            this.K.putAll(linkedHashMap);
            this.M = this.a;
            this.N = this.Z;
            this.fragmentView = k0Var;
            return k0Var;
        }
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        int size3 = arrayList3.size();
        int i25 = 0;
        int i26 = 0;
        while (true) {
            if (i26 >= size3) {
                linkedHashMap2 = linkedHashMap3;
                spannableStringBuilder3 = spannableStringBuilder6;
                break;
            }
            Object obj2 = arrayList3.get(i26);
            i26++;
            ArrayList arrayList9 = arrayList4;
            linkedHashMap2 = linkedHashMap3;
            s0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
            spannableStringBuilder3 = spannableStringBuilder6;
            i25++;
            if (i25 >= i13) {
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
        this.e.f(hd.M0(2131751153, null), (this.Z == i7 || this.a) ? z10 : false, false);
        this.h.J();
        if (chatFull.paid_media_allowed) {
            k0();
        }
        this.K.putAll(linkedHashMap);
        this.M = this.a;
        this.N = this.Z;
        this.fragmentView = k0Var;
        return k0Var;
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
            String M0 = hd.M0(2131743835, "UnsavedChanges");
            t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            t1Var.U = hd.M0(2131746407, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(hd.M0(2131754216, "ApplyTheme"), new q1(this) { // from class: ch.g
                public final /* synthetic */ o b;

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
            alertDialog$Builder.h(hd.M0(2131751406, null), new q1(this) { // from class: ch.g
                public final /* synthetic */ o b;

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

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            o4 o4Var = this.parentLayout;
            if (o4Var == null || o4Var.getLastFragment() != this) {
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
            cc.a0(this).Q(R.raw.chats_infotip, 36, org.telegram.messenger.g0.X2(hd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
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
            ns.e().k(ns.j1, 512);
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
        p5[] p5VarArr = (p5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, p5.class);
        for (p5 p5Var : p5VarArr) {
            this.I.remove(Long.valueOf(p5Var.documentId));
            this.J.remove(Long.valueOf(p5Var.documentId));
            this.b.A(Long.valueOf(p5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final uj0 getListViewForSimpleGlass() {
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
        int x02 = j6.x0(null, z12 ? j6.f6 : j6.e6, false);
        if (!z11) {
            q6.h(z12 ? j6.f6 : j6.e6, this.e, null);
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
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(er.f).setListener(new ai.j0(this, 3)).start();
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.F.g3.O(z11);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(er.f).start();
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
                n01 n01Var = this.b.q0;
                if (n01Var != null) {
                    n01Var.f();
                }
                e0(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f10) {
        float a10 = i9.a(f10, 0.0f, 1.0f);
        g2 g2Var = this.c;
        if (g2Var != null && this.w != null) {
            g2Var.setTranslationY((1.0f - a10) * g2Var.getMeasuredHeight());
            this.w.setTranslationY((-a10) * this.c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        q8 q8Var = this.r;
        boolean z10 = q8Var.e.h;
        int i7 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            q8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            p5 p5Var = (p5) linkedHashMap.remove(-1L);
            if (p5Var != null) {
                p5Var.setRemoved(new c1.c(2, this, p5Var));
            }
            c0(p5Var);
            this.b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Z, this.a, true);
        } else {
            q8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = g5.f();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                e0(true);
                c0(nVar);
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
            this.E.setColor(j6.w0(j6.d6, this.resourceProvider));
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
        u41 u41Var = this.F;
        i0.c cVar = this.mSystemInsets;
        ri.a.e(u41Var, cVar.b, cVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
    }

    @Override // org.telegram.ui.ActionBar.e2
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

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        np messagesController = getMessagesController();
        long j3 = this.T;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.W = M0;
        int i7 = 0;
        if (M0 == null) {
            TLRPC.Chat P = vr.a0(this.currentAccount).P(j3);
            this.W = P;
            if (P != null) {
                getMessagesController().Q3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().G0().a(-j3, new i(this, i7));
            getNotificationCenter().c(this, ns.V4);
            this.L.addAll(getMediaDataController().n);
            ns.e().k(ns.j1, 512);
            getNotificationCenter().c(this, ns.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().H4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, ns.V4);
        getNotificationCenter().n(this, ns.y1);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.y = i12;
        l0();
        m0();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                org.telegram.messenger.g0.i3(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q8 q8Var = this.e;
            if (q8Var == null || !(q8Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            q8 q8Var2 = this.e;
            q8Var2.setBackgroundColor(j6.x0(null, q8Var2.e.h ? j6.f6 : j6.e6, false));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
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
            m mVar = new m(this, this, getParentActivity(), getResourceProvider(), j6.w0(j6.G6, getResourceProvider()));
            this.b = mVar;
            mVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            q6.h(j6.d6, this.b, null);
            this.c.addView(this.b, ja.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, ja.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                this.b.x((Long) obj, false);
            }
        }
        org.telegram.messenger.g0.i3(new ai.o(5), 200L);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
