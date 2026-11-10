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
import bi.a4;
import bi.e5;
import bi.t5;
import bi.x5;
import c8.ha;
import c8.j9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ch;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.t01;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o extends f2 implements ls {
    public final Paint D;
    public r41 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public int M;
    public final int N;
    public boolean O;
    public boolean P;
    public te.a Q;
    public final TLRPC.ChatFull R;
    public final long S;
    public int T;
    public int U;
    public TLRPC.Chat V;
    public TL_stories.TL_premium_boostsStatus W;
    public int X;
    public int Y;
    public boolean Z;
    public boolean a;
    public final h a0;
    public m b;
    public e5 c;
    public f d;
    public r8 e;
    public z8 f;
    public l h;
    public t7 n;
    public r8 r;
    public r0 s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public o(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.D = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.N = getMessagesController().y4;
        this.O = false;
        this.Y = -1;
        this.a0 = new h(this, 6);
        this.S = j3;
        this.R = chatFull;
    }

    public final void b0(View view, boolean z9) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z9));
    }

    public final void c0(q5 q5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(q5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            q5[] q5VarArr = (q5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), q5.class);
            for (q5 q5Var2 : q5VarArr) {
                q5Var2.setAnimateChanges();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f8 A[EDGE_INSN: B:54:0x03f8->B:55:0x03f8 BREAK  A[LOOP:1: B:42:0x034e->B:53:0x034e], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        int i7;
        SpannableStringBuilder spannableStringBuilder;
        boolean z9;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i10;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c10;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(id.M0(2131746387, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 1));
        r41 r41Var = new r41(this, new ai.e(this, 13), null, null);
        this.E = r41Var;
        r41Var.setSections(true);
        this.E.setSectionsDrawBackground(true);
        x5 x5Var = new x5(this, context);
        x5Var.setFocusableInTouchMode(true);
        x5Var.requestFocus();
        r8 r8Var = new r8(context);
        this.e = r8Var;
        r8Var.setHeight(56);
        r8 r8Var2 = this.e;
        t6.h(r8Var2.e.h ? m6.f6 : m6.e6, r8Var2, null);
        this.e.setTypeface(org.telegram.messenger.g0.o());
        this.e.d(m6.g6, m6.O6, m6.P6, m6.Q6, m6.R6);
        final int i11 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r8 r8Var3;
                switch (i11) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (r8Var3 = oVar.r) != null && r8Var3.e.h) {
                            oVar.k0();
                        }
                        boolean z10 = oVar.e.e.h;
                        oVar.i0(z10 ? 2 : 1, z10 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.k0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.W;
                            if (tL_premium_boostsStatus != null) {
                                int i12 = tL_premium_boostsStatus.level;
                                int i13 = oVar2.X;
                                if (i12 < i13) {
                                    q0.f(-oVar2.S, i13, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            r8 r8Var4 = oVar2.r;
                            Boolean valueOf = (r8Var4 == null || !oVar2.R.paid_media_allowed) ? null : Boolean.valueOf(r8Var4.e.h);
                            oVar2.s.setLoading(true);
                            oVar2.M = oVar2.Y;
                            qp messagesController = oVar2.getMessagesController();
                            long j3 = oVar2.S;
                            int i14 = oVar2.Y;
                            ArrayList h02 = oVar2.h0(false);
                            int i15 = oVar2.U;
                            oVar2.T = i15;
                            messagesController.G4(j3, i14, h02, i15, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        z8 z8Var = new z8(12, context, this.resourceProvider);
        this.f = z8Var;
        w70 textView = z8Var.getTextView();
        int i12 = m6.B6;
        t6.U(textView, i12, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(id.M0(2131746409, null));
        n4 n4Var = new n4(context);
        n4Var.setText(id.M0(2131753759, null));
        t6.h(m6.d6, n4Var, null);
        n4Var.setTextSize(15.0f);
        n4Var.setTopMargin(14);
        b0(n4Var, false);
        h6 resourceProvider = getResourceProvider();
        int i13 = this.N;
        l lVar = new l(this, context, resourceProvider, i13);
        this.h = lVar;
        int i14 = 3;
        lVar.setOnFocused(new h(this, i14));
        b0(this.h, false);
        z8 z8Var2 = new z8(12, context, this.resourceProvider);
        t6.U(z8Var2.getTextView(), i12, null);
        z8Var2.setText(org.telegram.messenger.g0.S2(id.M0(2131746406, null), m6.Uc, 0, new h(this, 4), getResourceProvider()));
        b0(z8Var2, true);
        n4 n4Var2 = new n4(context, this.resourceProvider);
        n4Var2.setText(id.M0(2131748667, null));
        b0(n4Var2, false);
        this.n = new t7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.R;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            int i15 = getMessagesController().K5;
            this.U = i15;
            this.T = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.U = i16;
            this.T = i16;
        }
        t7 t7Var = this.n;
        int i17 = this.U;
        int i18 = getMessagesController().K5;
        s7 s7Var = new s7();
        s7Var.a = 1;
        s7Var.b = i18;
        s7Var.e = new ch(17);
        t7Var.d(i17, s7Var, new i(this, i14));
        b0(this.n, false);
        z8 z8Var3 = new z8(12, context, this.resourceProvider);
        z8Var3.setTopPadding(12);
        z8Var3.setBottomPadding(16);
        z8Var3.setText(id.M0(2131748666, null));
        b0(z8Var3, true);
        if (chatFull.paid_media_allowed) {
            r8 r8Var3 = new r8(context);
            this.r = r8Var3;
            r8Var3.f(id.M0(2131752411, null), false, false);
            b0(this.r, false);
            final int i19 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r8 r8Var32;
                    switch (i19) {
                        case 0:
                            o oVar = this.b;
                            if (oVar.e.e.h && (r8Var32 = oVar.r) != null && r8Var32.e.h) {
                                oVar.k0();
                            }
                            boolean z10 = oVar.e.e.h;
                            oVar.i0(z10 ? 2 : 1, z10 ? false : oVar.a, true);
                            break;
                        case 1:
                            this.b.k0();
                            break;
                        default:
                            o oVar2 = this.b;
                            if (!oVar2.s.Q) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.W;
                                if (tL_premium_boostsStatus != null) {
                                    int i122 = tL_premium_boostsStatus.level;
                                    int i132 = oVar2.X;
                                    if (i122 < i132) {
                                        q0.f(-oVar2.S, i132, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                r8 r8Var4 = oVar2.r;
                                Boolean valueOf = (r8Var4 == null || !oVar2.R.paid_media_allowed) ? null : Boolean.valueOf(r8Var4.e.h);
                                oVar2.s.setLoading(true);
                                oVar2.M = oVar2.Y;
                                qp messagesController = oVar2.getMessagesController();
                                long j3 = oVar2.S;
                                int i142 = oVar2.Y;
                                ArrayList h02 = oVar2.h0(false);
                                int i152 = oVar2.U;
                                oVar2.T = i152;
                                messagesController.G4(j3, i142, h02, i152, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                                break;
                            }
                            break;
                    }
                }
            });
            z8 z8Var4 = new z8(12, context, this.resourceProvider);
            t6.U(z8Var4.getTextView(), i12, null);
            z8Var4.setTopPadding(12);
            z8Var4.setBottomPadding(70);
            z8Var4.setText(org.telegram.messenger.g0.d4(id.M0(2131752410, null), new h(this, 5)));
            b0(z8Var4, true);
        } else {
            z8Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        t6.s(this.x, m6.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, ha.e(-1, -1, qs.E1));
        r0 r0Var = new r0(context, getResourceProvider(), true);
        this.s = r0Var;
        r0Var.f();
        r0 r0Var2 = this.s;
        r0Var2.getClass();
        r0Var2.i(new SpannableStringBuilder(id.M0(2131746388, null)), false, true);
        r0Var2.k0 = new SpannableStringBuilder("l");
        wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
        wpVar.n = 1;
        char c11 = '!';
        r0Var2.k0.setSpan(wpVar, 0, 1, 33);
        final int i20 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: ch.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r8 r8Var32;
                switch (i20) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (r8Var32 = oVar.r) != null && r8Var32.e.h) {
                            oVar.k0();
                        }
                        boolean z10 = oVar.e.e.h;
                        oVar.i0(z10 ? 2 : 1, z10 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.k0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.W;
                            if (tL_premium_boostsStatus != null) {
                                int i122 = tL_premium_boostsStatus.level;
                                int i132 = oVar2.X;
                                if (i122 < i132) {
                                    q0.f(-oVar2.S, i132, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            r8 r8Var4 = oVar2.r;
                            Boolean valueOf = (r8Var4 == null || !oVar2.R.paid_media_allowed) ? null : Boolean.valueOf(r8Var4.e.h);
                            oVar2.s.setLoading(true);
                            oVar2.M = oVar2.Y;
                            qp messagesController = oVar2.getMessagesController();
                            long j3 = oVar2.S;
                            int i142 = oVar2.Y;
                            ArrayList h02 = oVar2.h0(false);
                            int i152 = oVar2.U;
                            oVar2.T = i152;
                            messagesController.G4(j3, i142, h02, i152, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        x5Var.addView(this.E);
        x5Var.addView(this.w, ha.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, ha.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        l0();
        e5 e5Var = new e5(this, context);
        this.c = e5Var;
        e5Var.setVisibility(4);
        x5Var.addView(this.c, ha.e(-1, -2, 80));
        this.Q = new te.a(0, new cb.c(this, 13), wq.f, 350L, false);
        m0();
        n0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z10 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.K;
        ArrayList arrayList4 = this.I;
        LinkedHashMap linkedHashMap3 = this.H;
        if (!z10) {
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
                            q0.a(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
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
                            q5 e10 = q0.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
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
                z9 = true;
                i7 = 2;
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList5;
                boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z11 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i7 = 2;
                    i0(2, this.a, false);
                } else if (z11) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    int size2 = arrayList3.size();
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z9 = true;
                            break;
                        }
                        Object obj = arrayList3.get(i24);
                        i24++;
                        ArrayList arrayList8 = arrayList7;
                        q0.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z9 = true;
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
            this.e.f(id.M0(2131751153, null), (this.Y == i7 || this.a) ? z9 : false, false);
            this.h.I();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                k0();
            }
            this.J.putAll(linkedHashMap);
            this.L = this.a;
            this.M = this.Y;
            this.fragmentView = x5Var;
            return x5Var;
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
            q0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
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
        z9 = true;
        this.e.f(id.M0(2131751153, null), (this.Y == i7 || this.a) ? z9 : false, false);
        this.h.I();
        if (chatFull.paid_media_allowed) {
            k0();
        }
        this.J.putAll(linkedHashMap);
        this.L = this.a;
        this.M = this.Y;
        this.fragmentView = x5Var;
        return x5Var;
    }

    public final boolean d0(boolean z9) {
        final int i7 = 1;
        boolean z10 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.W;
        final int i10 = 0;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.X) {
            z10 = false;
        }
        if (this.L != this.a) {
            z10 = true;
        }
        if (z9 && z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String M0 = id.M0(2131743835, "UnsavedChanges");
            u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = id.M0(2131746407, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(id.M0(2131754216, "ApplyTheme"), new r1(this) { // from class: ch.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(u1 u1Var2, int i11) {
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
            alertDialog$Builder.h(id.M0(2131751406, null), new r1(this) { // from class: ch.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.r1
                public final void g(u1 u1Var2, int i11) {
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
        return z10;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y1 && ((Long) objArr[0]).longValue() == (-this.S)) {
            r4 r4Var = this.parentLayout;
            if (r4Var == null || r4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(boolean z9) {
        if (this.W == null) {
            return;
        }
        if (this.Y == 0) {
            this.Y = 1;
        }
        int size = h0(true).size();
        this.X = size;
        if (this.W.level >= size) {
            this.s.g(null, true);
            return;
        }
        if (z9) {
            gc.a0(this).Q(R.raw.chats_infotip, 36, org.telegram.messenger.g0.X2(id.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.X);
    }

    public final void f0() {
        if (this.O) {
            this.O = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            }
            qs.e().k(qs.j1, 512);
            this.c.setLayerType(2, null);
            this.Q.a(false, true);
        }
    }

    public final boolean g0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        q5[] q5VarArr = (q5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, q5.class);
        for (q5 q5Var : q5VarArr) {
            this.H.remove(Long.valueOf(q5Var.documentId));
            this.I.remove(Long.valueOf(q5Var.documentId));
            this.b.A(Long.valueOf(q5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final pj0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final ArrayList h0(boolean z9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (l10.longValue() != -1) {
                ArrayList arrayList4 = this.K;
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
        return z9 ? arrayList2 : arrayList;
    }

    public final void i0(int i7, boolean z9, boolean z10) {
        if (this.Y == i7 && this.a == z9) {
            return;
        }
        this.a = z9;
        boolean z11 = i7 == 1 || i7 == 0 || z9;
        this.e.setChecked(z11);
        int x02 = m6.x0(null, z11 ? m6.f6 : m6.e6, false);
        if (!z10) {
            t6.h(z11 ? m6.f6 : m6.e6, this.e, null);
        } else if (z11) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.Y = i7;
        if (i7 != 1 && i7 != 0 && !z9) {
            if (!z10) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f3.O(false);
                return;
            } else {
                f0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(wq.f).setListener(new t5(this, 3)).start();
                this.h.setFocusableInTouchMode(false);
                this.E.f3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.E.f3.O(z10);
        if (z10) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(wq.f).start();
            this.E.post(new h(this, 1));
            LinkedHashMap linkedHashMap = this.H;
            if (linkedHashMap.isEmpty()) {
                this.b.K.clear();
                this.h.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.K;
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11 + 1;
                    q0.a((TLRPC.TL_availableReaction) arrayList.get(i11), linkedHashMap, this.I, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i10++;
                    if (i10 >= this.N) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.I();
                t01 t01Var = this.b.p0;
                if (t01Var != null) {
                    t01Var.f();
                }
                e0(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f10) {
        float a10 = j9.a(f10, 0.0f, 1.0f);
        e5 e5Var = this.c;
        if (e5Var != null && this.w != null) {
            e5Var.setTranslationY((1.0f - a10) * e5Var.getMeasuredHeight());
            this.w.setTranslationY((-a10) * this.c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        r8 r8Var = this.r;
        boolean z9 = r8Var.e.h;
        int i7 = this.N;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z9) {
            r8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            q5 q5Var = (q5) linkedHashMap.remove(-1L);
            if (q5Var != null) {
                q5Var.setRemoved(new a4(15, this, q5Var));
            }
            c0(q5Var);
            this.b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i7);
            i0(this.Y, this.a, true);
        } else {
            r8Var.setChecked(true);
            try {
                this.h.setMaxLength(i7 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = h5.f();
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
            i0(this.Y, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        if (this.w == null || this.s == null) {
            return;
        }
        te.a aVar = this.Q;
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
            this.D.setColor(m6.w0(m6.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void n0() {
        if (this.E == null) {
            return;
        }
        te.a aVar = this.Q;
        int W1 = org.telegram.messenger.g0.W1(aVar != null ? aVar.e : 0.0f, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        r41 r41Var = this.E;
        i0.b bVar = this.mSystemInsets;
        oi.a.e(r41Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), W1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.O) {
            if (z9) {
                f0();
                return false;
            }
        } else if (!d0(z9)) {
            return super.onBackPressed(z9);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        qp messagesController = getMessagesController();
        long j3 = this.S;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        this.V = M0;
        int i7 = 0;
        if (M0 == null) {
            TLRPC.Chat P = yr.a0(this.currentAccount).P(j3);
            this.V = P;
            if (P != null) {
                getMessagesController().Q3(this.V, true);
            }
            return false;
        }
        if (this.R != null) {
            getMessagesController().G0().a(-j3, new i(this, i7));
            getNotificationCenter().c(this, qs.V4);
            this.K.addAll(getMediaDataController().n);
            qs.e().k(qs.j1, 512);
            getNotificationCenter().c(this, qs.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.a0);
        if (this.Y == 2 && (this.U != this.T || (this.M != 2 && !this.L && !this.a))) {
            getMessagesController().G4(this.S, this.Y, h0(false), this.U, null, null, null);
        }
        getNotificationCenter().n(this, qs.V4);
        getNotificationCenter().n(this, qs.y1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.y = i12;
        l0();
        m0();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        this.Z = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        if (this.Z) {
            this.Z = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.O) {
                this.h.J(false);
                org.telegram.messenger.g0.i3(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            r8 r8Var = this.e;
            if (r8Var == null || !(r8Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            r8 r8Var2 = this.e;
            r8Var2.setBackgroundColor(m6.x0(null, r8Var2.e.h ? m6.f6 : m6.e6, false));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && this.Y != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z9) {
            this.P = true;
        }
        if (!z9 || z10) {
            return;
        }
        if (this.b == null) {
            m mVar = new m(this, this, getParentActivity(), getResourceProvider(), m6.w0(m6.G6, getResourceProvider()));
            this.b = mVar;
            mVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            t6.h(m6.d6, this.b, null);
            this.c.addView(this.b, ha.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, ha.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.I;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                this.b.x((Long) obj, false);
            }
        }
        org.telegram.messenger.g0.i3(new ai.m0(6), 200L);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
