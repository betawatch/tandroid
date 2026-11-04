package dh;

import ai.e1;
import ai.g5;
import ai.o2;
import ai.y1;
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
import b8.be;
import b8.mf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.go;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.g01;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o extends d2 implements cs {
    public final Paint E;
    public l41 F;
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
    public qe.a R;
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
    public o2 c;
    public f d;
    public q8 e;
    public y8 f;
    public l h;
    public s7 n;
    public q8 r;
    public q0 s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public o(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().y4;
        this.P = false;
        this.Z = -1;
        this.b0 = new h(this, 6);
        this.T = j10;
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f2 A[EDGE_INSN: B:54:0x03f2->B:55:0x03f2 BREAK  A[LOOP:1: B:42:0x0348->B:53:0x0348], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        int i3;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i10;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c2;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        final int i11 = 1;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(bd.M0(2131746395, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 2));
        l41 l41Var = new l41(this, new ai.c(this, 23), null, null);
        this.F = l41Var;
        l41Var.setSections(true);
        this.F.setSectionsDrawBackground(true);
        ai.c0 c0Var = new ai.c0(this, context);
        c0Var.setFocusableInTouchMode(true);
        c0Var.requestFocus();
        q8 q8Var = new q8(context);
        this.e = q8Var;
        q8Var.setHeight(56);
        q8 q8Var2 = this.e;
        r6.i(q8Var2.e.h ? k6.f6 : k6.e6, q8Var2, null);
        this.e.setTypeface(org.telegram.messenger.g0.o());
        this.e.d(k6.g6, k6.O6, k6.P6, k6.Q6, k6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: dh.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q8 q8Var3;
                switch (i12) {
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
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = oVar2.Y;
                                if (i13 < i14) {
                                    p0.f(-oVar2.T, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            q8 q8Var4 = oVar2.r;
                            Boolean valueOf = (q8Var4 == null || !oVar2.S.paid_media_allowed) ? null : Boolean.valueOf(q8Var4.e.h);
                            oVar2.s.setLoading(true);
                            oVar2.N = oVar2.Z;
                            hp messagesController = oVar2.getMessagesController();
                            long j10 = oVar2.T;
                            int i15 = oVar2.Z;
                            ArrayList h02 = oVar2.h0(false);
                            int i16 = oVar2.V;
                            oVar2.U = i16;
                            messagesController.G4(j10, i15, h02, i16, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        y8 y8Var = new y8(12, context, this.resourceProvider);
        this.f = y8Var;
        s70 textView = y8Var.getTextView();
        int i13 = k6.B6;
        r6.V(textView, i13, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(bd.M0(2131746417, null));
        n4 n4Var = new n4(context);
        n4Var.setText(bd.M0(2131753759, null));
        r6.i(k6.d6, n4Var, null);
        n4Var.setTextSize(15.0f);
        int i14 = 14;
        n4Var.setTopMargin(14);
        b0(n4Var, false);
        e6 resourceProvider = getResourceProvider();
        int i15 = this.O;
        l lVar = new l(this, context, resourceProvider, i15);
        this.h = lVar;
        int i16 = 3;
        lVar.setOnFocused(new h(this, i16));
        b0(this.h, false);
        y8 y8Var2 = new y8(12, context, this.resourceProvider);
        r6.V(y8Var2.getTextView(), i13, null);
        y8Var2.setText(org.telegram.messenger.g0.S2(bd.M0(2131746414, null), k6.Uc, 0, new h(this, 4), getResourceProvider()));
        b0(y8Var2, true);
        n4 n4Var2 = new n4(context, this.resourceProvider);
        n4Var2.setText(bd.M0(2131748675, null));
        b0(n4Var2, false);
        this.n = new s7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.S;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            int i17 = getMessagesController().K5;
            this.V = i17;
            this.U = i17;
        } else {
            int i18 = chatFull.reactions_limit;
            this.V = i18;
            this.U = i18;
        }
        s7 s7Var = this.n;
        int i19 = this.V;
        int i20 = getMessagesController().K5;
        r7 r7Var = new r7();
        r7Var.a = 1;
        r7Var.b = i20;
        r7Var.e = new go(i14);
        s7Var.d(i19, r7Var, new i(this, i16));
        b0(this.n, false);
        y8 y8Var3 = new y8(12, context, this.resourceProvider);
        y8Var3.setTopPadding(12);
        y8Var3.setBottomPadding(16);
        y8Var3.setText(bd.M0(2131748674, null));
        b0(y8Var3, true);
        if (chatFull.paid_media_allowed) {
            q8 q8Var3 = new q8(context);
            this.r = q8Var3;
            q8Var3.f(bd.M0(2131752411, null), false, false);
            b0(this.r, false);
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: dh.j
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q8 q8Var32;
                    switch (i11) {
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
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = oVar2.Y;
                                    if (i132 < i142) {
                                        p0.f(-oVar2.T, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                q8 q8Var4 = oVar2.r;
                                Boolean valueOf = (q8Var4 == null || !oVar2.S.paid_media_allowed) ? null : Boolean.valueOf(q8Var4.e.h);
                                oVar2.s.setLoading(true);
                                oVar2.N = oVar2.Z;
                                hp messagesController = oVar2.getMessagesController();
                                long j10 = oVar2.T;
                                int i152 = oVar2.Z;
                                ArrayList h02 = oVar2.h0(false);
                                int i162 = oVar2.V;
                                oVar2.U = i162;
                                messagesController.G4(j10, i152, h02, i162, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                                break;
                            }
                            break;
                    }
                }
            });
            y8 y8Var4 = new y8(12, context, this.resourceProvider);
            r6.V(y8Var4.getTextView(), i13, null);
            y8Var4.setTopPadding(12);
            y8Var4.setBottomPadding(70);
            y8Var4.setText(org.telegram.messenger.g0.d4(bd.M0(2131752410, null), new h(this, 5)));
            b0(y8Var4, true);
        } else {
            y8Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        r6.t(this.x, k6.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, mf.e(-1, -1, hs.E1));
        q0 q0Var = new q0(context, getResourceProvider(), true);
        this.s = q0Var;
        q0Var.f();
        q0 q0Var2 = this.s;
        q0Var2.getClass();
        q0Var2.i(new SpannableStringBuilder(bd.M0(2131746396, null)), false, true);
        q0Var2.l0 = new SpannableStringBuilder("l");
        wp wpVar = new wp(R.drawable.mini_switch_lock, 0);
        wpVar.n = 1;
        char c10 = '!';
        q0Var2.l0.setSpan(wpVar, 0, 1, 33);
        final int i21 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: dh.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q8 q8Var32;
                switch (i21) {
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
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = oVar2.Y;
                                if (i132 < i142) {
                                    p0.f(-oVar2.T, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            q8 q8Var4 = oVar2.r;
                            Boolean valueOf = (q8Var4 == null || !oVar2.S.paid_media_allowed) ? null : Boolean.valueOf(q8Var4.e.h);
                            oVar2.s.setLoading(true);
                            oVar2.N = oVar2.Z;
                            hp messagesController = oVar2.getMessagesController();
                            long j10 = oVar2.T;
                            int i152 = oVar2.Z;
                            ArrayList h02 = oVar2.h0(false);
                            int i162 = oVar2.V;
                            oVar2.U = i162;
                            messagesController.G4(j10, i152, h02, i162, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        c0Var.addView(this.F);
        c0Var.addView(this.w, mf.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, mf.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        l0();
        o2 o2Var = new o2(this, context);
        this.c = o2Var;
        o2Var.setVisibility(4);
        c0Var.addView(this.c, mf.e(-1, -2, 80));
        this.R = new qe.a(0, new c6.i(this, 18), xq.f, 350L, false);
        m0();
        n0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.L;
        ArrayList arrayList4 = this.J;
        LinkedHashMap linkedHashMap3 = this.I;
        if (z11) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList3.size();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i23 >= size) {
                    linkedHashMap2 = linkedHashMap3;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList3.get(i23);
                i23++;
                ArrayList arrayList5 = arrayList4;
                linkedHashMap2 = linkedHashMap3;
                p0.a((TLRPC.TL_availableReaction) obj, linkedHashMap2, arrayList5, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i22++;
                if (i22 >= i15) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
                linkedHashMap3 = linkedHashMap2;
                arrayList4 = arrayList5;
            }
            this.h.append(spannableStringBuilder3);
            i0(0, this.a, false);
            z10 = true;
            linkedHashMap = linkedHashMap2;
        } else {
            ArrayList arrayList6 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList6;
                boolean z12 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z12 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i3 = 2;
                    i0(2, this.a, false);
                } else {
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        int size2 = arrayList3.size();
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i25 >= size2) {
                                spannableStringBuilder = spannableStringBuilder5;
                                z10 = true;
                                break;
                            }
                            Object obj2 = arrayList3.get(i25);
                            i25++;
                            ArrayList arrayList8 = arrayList7;
                            p0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            i24++;
                            if (i24 >= i15) {
                                break;
                            }
                            spannableStringBuilder5 = spannableStringBuilder;
                            arrayList7 = arrayList8;
                        }
                        this.h.append(spannableStringBuilder);
                        i3 = 2;
                        i0(2, this.a, false);
                        this.e.f(bd.M0(2131751154, null), (this.Z == i3 || this.a) ? z10 : false, false);
                        this.h.I();
                        if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                            k0();
                        }
                        this.K.putAll(linkedHashMap);
                        this.M = this.a;
                        this.N = this.Z;
                        this.fragmentView = c0Var;
                        return c0Var;
                    }
                    i3 = 2;
                }
                z10 = true;
                this.e.f(bd.M0(2131751154, null), (this.Z == i3 || this.a) ? z10 : false, false);
                this.h.I();
                if (chatFull.paid_media_allowed) {
                    k0();
                }
                this.K.putAll(linkedHashMap);
                this.M = this.a;
                this.N = this.Z;
                this.fragmentView = c0Var;
                return c0Var;
            }
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList9 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size3 = arrayList9.size();
            int i26 = 0;
            int i27 = 0;
            while (true) {
                if (i27 >= size3) {
                    linkedHashMap = linkedHashMap4;
                    spannableStringBuilder2 = spannableStringBuilder6;
                    break;
                }
                TLRPC.Reaction reaction = arrayList9.get(i27);
                i27++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction == null) {
                        continue;
                    } else {
                        p0.a(tL_availableReaction, linkedHashMap4, arrayList6, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList6;
                        spannableStringBuilder2 = spannableStringBuilder6;
                        i26++;
                    }
                } else {
                    linkedHashMap = linkedHashMap4;
                    arrayList = arrayList6;
                    spannableStringBuilder2 = spannableStringBuilder6;
                    if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                        m mVar = this.b;
                        i10 = i27;
                        p5 e10 = p0.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                        linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e10);
                        arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                        SpannableString spannableString = new SpannableString("e");
                        arrayList2 = arrayList9;
                        c2 = '!';
                        spannableString.setSpan(e10, 0, spannableString.length(), 33);
                        spannableStringBuilder2.append((CharSequence) spannableString);
                        if (mVar != null) {
                            mVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                        }
                        i26++;
                        if (i26 < i15) {
                            break;
                        }
                        i27 = i10;
                        c10 = c2;
                        spannableStringBuilder6 = spannableStringBuilder2;
                        arrayList6 = arrayList;
                        linkedHashMap4 = linkedHashMap;
                        arrayList9 = arrayList2;
                        document = null;
                    }
                }
                arrayList2 = arrayList9;
                c2 = c10;
                i10 = i27;
                if (i26 < i15) {
                }
            }
            this.h.append(spannableStringBuilder2);
            i0(1, this.a, false);
            z10 = true;
        }
        i3 = 2;
        this.e.f(bd.M0(2131751154, null), (this.Z == i3 || this.a) ? z10 : false, false);
        this.h.I();
        if (chatFull.paid_media_allowed) {
        }
        this.K.putAll(linkedHashMap);
        this.M = this.a;
        this.N = this.Z;
        this.fragmentView = c0Var;
        return c0Var;
    }

    public final boolean d0(boolean z10) {
        final int i3 = 1;
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
            String M0 = bd.M0(2131743845, "UnsavedChanges");
            s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.M0(2131746415, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(bd.M0(2131754216, "ApplyTheme"), new p1(this) { // from class: dh.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(s1 s1Var2, int i11) {
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
            alertDialog$Builder.h(bd.M0(2131751407, null), new p1(this) { // from class: dh.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.p1
                public final void g(s1 s1Var2, int i11) {
                    switch (i3) {
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getLastFragment() != this) {
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
            fc.a0(this).Q(R.raw.chats_infotip, 36, org.telegram.messenger.g0.X2(bd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
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
            hs.e().k(hs.j1, 512);
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

    @Override // org.telegram.ui.ActionBar.d2
    public final tj0 getListViewForSimpleGlass() {
        return this.F;
    }

    public final ArrayList h0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
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

    public final void i0(int i3, boolean z10, boolean z11) {
        if (this.Z == i3 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i3 == 1 || i3 == 0 || z10;
        this.e.setChecked(z12);
        int x02 = k6.x0(null, z12 ? k6.f6 : k6.e6, false);
        if (!z11) {
            r6.i(z12 ? k6.f6 : k6.e6, this.e, null);
        } else if (z12) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.Z = i3;
        if (i3 != 1 && i3 != 0 && !z10) {
            if (!z11) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            } else {
                f0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(xq.f).setListener(new e1(this, 4)).start();
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.F.g3.O(z11);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(xq.f).start();
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
                    p0.a((TLRPC.TL_availableReaction) arrayList.get(i11), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i10++;
                    if (i10 >= this.O) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.I();
                g01 g01Var = this.b.q0;
                if (g01Var != null) {
                    g01Var.f();
                }
                e0(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f10) {
        float a10 = be.a(f10, 0.0f, 1.0f);
        o2 o2Var = this.c;
        if (o2Var != null && this.w != null) {
            o2Var.setTranslationY((1.0f - a10) * o2Var.getMeasuredHeight());
            this.w.setTranslationY((-a10) * this.c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        q8 q8Var = this.r;
        boolean z10 = q8Var.e.h;
        int i3 = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z10) {
            q8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            p5 p5Var = (p5) linkedHashMap.remove(-1L);
            if (p5Var != null) {
                p5Var.setRemoved(new ci.e0(20, this, p5Var));
            }
            c0(p5Var);
            this.b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i3);
            i0(this.Z, this.a, true);
        } else {
            q8Var.setChecked(true);
            try {
                this.h.setMaxLength(i3 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = org.telegram.ui.Components.g5.f();
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
        qe.a aVar = this.R;
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
            this.E.setColor(k6.w0(k6.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void n0() {
        if (this.F == null) {
            return;
        }
        qe.a aVar = this.R;
        int W1 = org.telegram.messenger.g0.W1(aVar != null ? aVar.e : 0.0f, org.telegram.messenger.g0.L(72.0f), org.telegram.messenger.g0.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        l41 l41Var = this.F;
        i0.b bVar = this.mSystemInsets;
        pi.a.e(l41Var, bVar.b, bVar.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), W1);
    }

    @Override // org.telegram.ui.ActionBar.d2
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

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        hp messagesController = getMessagesController();
        long j10 = this.T;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        this.W = M0;
        int i3 = 0;
        if (M0 == null) {
            TLRPC.Chat P = qr.a0(this.currentAccount).P(j10);
            this.W = P;
            if (P != null) {
                getMessagesController().Q3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().G0().a(-j10, new i(this, i3));
            getNotificationCenter().c(this, hs.V4);
            this.L.addAll(getMediaDataController().n);
            hs.e().k(hs.j1, 512);
            getNotificationCenter().c(this, hs.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().G4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, hs.V4);
        getNotificationCenter().n(this, hs.y1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.y = i12;
        l0();
        m0();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.J(false);
                org.telegram.messenger.g0.i3(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q8 q8Var = this.e;
            if (q8Var == null || !(q8Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            q8 q8Var2 = this.e;
            q8Var2.setBackgroundColor(k6.x0(null, q8Var2.e.h ? k6.f6 : k6.e6, false));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
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
            m mVar = new m(this, this, getParentActivity(), getResourceProvider(), k6.w0(k6.G6, getResourceProvider()));
            this.b = mVar;
            mVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            r6.i(k6.d6, this.b, null);
            this.c.addView(this.b, mf.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, mf.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.J;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                this.b.x((Long) obj, false);
            }
        }
        org.telegram.messenger.g0.i3(new y1(7), 200L);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
