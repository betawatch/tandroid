// default package

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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n92 extends d implements jm7 {
    public final Paint E;
    public q7c F;
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
    public fn0 R;
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
    public l92 b;
    public final f92 b0;
    public yd c;
    public he0 d;
    public bjb e;
    public njb f;
    public k92 h;
    public jla n;
    public bjb r;
    public n8c s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public n92(long j, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().l4.S1.f();
        this.P = false;
        this.Z = -1;
        this.b0 = new f92(this, (byte) 6);
        this.T = j;
        this.S = chatFull;
    }

    public final void b0(View view, boolean z) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z));
    }

    public final void c0(gn gnVar) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(gnVar)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            gn[] gnVarArr = (gn[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), gn.class);
            for (gn gnVar2 : gnVarArr) {
                gnVar2.setAnimateChanges();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        if (d0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03fb A[EDGE_INSN: B:54:0x03fb->B:55:0x03fb BREAK  A[LOOP:1: B:42:0x0357->B:53:0x0357], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        LinkedHashMap linkedHashMap;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i3;
        ArrayList<TLRPC.Reaction> arrayList2;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(jb6.M0(2131746120, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 24));
        final byte b = 0;
        q7c q7cVar = new q7c(this, new h92(this, b), null, null);
        this.F = q7cVar;
        q7cVar.setSections(true);
        this.F.setSectionsDrawBackground(true);
        su suVar = new su(this, context);
        suVar.setFocusableInTouchMode(true);
        suVar.requestFocus();
        bjb bjbVar = new bjb(context);
        this.e = bjbVar;
        bjbVar.setHeight(56);
        bjb bjbVar2 = this.e;
        anb.h(bjbVar2.e.h ? cmb.e6 : cmb.d6, null, bjbVar2);
        this.e.setTypeface(gm.o());
        this.e.d(cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: i92
            public final /* synthetic */ n92 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bjb bjbVar3;
                byte b2 = b;
                boolean z2 = false;
                byte b3 = 2;
                n92 n92Var = this.b;
                switch (b2) {
                    case 0:
                        if (n92Var.e.e.h && (bjbVar3 = n92Var.r) != null && bjbVar3.e.h) {
                            n92Var.k0();
                        }
                        if (!n92Var.e.e.h) {
                            z2 = n92Var.a;
                            b3 = 1;
                        }
                        n92Var.i0(b3, z2, true);
                        break;
                    case 1:
                        n92Var.k0();
                        break;
                    default:
                        if (!n92Var.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = n92Var.X;
                            if (tL_premium_boostsStatus != null) {
                                int i4 = tL_premium_boostsStatus.level;
                                int i5 = n92Var.Y;
                                if (i4 < i5) {
                                    n39.f(-n92Var.T, i5, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            bjb bjbVar4 = n92Var.r;
                            Boolean valueOf = (bjbVar4 == null || !n92Var.S.paid_media_allowed) ? null : Boolean.valueOf(bjbVar4.e.h);
                            n92Var.s.setLoading(true);
                            n92Var.N = n92Var.Z;
                            oc7 messagesController = n92Var.getMessagesController();
                            long j = n92Var.T;
                            int i6 = n92Var.Z;
                            ArrayList h0 = n92Var.h0(false);
                            int i7 = n92Var.V;
                            n92Var.U = i7;
                            messagesController.N4(j, i6, h0, i7, valueOf, new g92(n92Var, b3), new f92(n92Var, (byte) 2));
                            break;
                        }
                        break;
                }
            }
        });
        njb njbVar = new njb(12, this.resourceProvider, context);
        this.f = njbVar;
        l66 textView = njbVar.getTextView();
        int i4 = cmb.A6;
        anb.X(textView, i4, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(jb6.M0(2131746142, null));
        jf5 jf5Var = new jf5(context);
        jf5Var.setText(jb6.M0(2131753724, null));
        anb.h(cmb.c6, null, jf5Var);
        jf5Var.setTextSize(15.0f);
        jf5Var.setTopMargin(14);
        b0(jf5Var, false);
        ylb resourceProvider = getResourceProvider();
        int i5 = this.O;
        k92 k92Var = new k92(this, context, resourceProvider, i5);
        this.h = k92Var;
        byte b2 = 3;
        k92Var.setOnFocused(new f92(this, b2));
        b0(this.h, false);
        njb njbVar2 = new njb(12, this.resourceProvider, context);
        anb.X(njbVar2.getTextView(), i4, null);
        njbVar2.setText(gm.N2(jb6.M0(2131746139, null), cmb.Wc, 0, new f92(this, (byte) 4), getResourceProvider()));
        b0(njbVar2, true);
        jf5 jf5Var2 = new jf5(context, this.resourceProvider);
        jf5Var2.setText(jb6.M0(2131748424, null));
        b0(jf5Var2, false);
        this.n = new jla(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.S;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            i = getMessagesController().l4.j3.f();
            this.V = i;
            this.U = i;
        } else {
            i = chatFull.reactions_limit;
            this.V = i;
            this.U = i;
        }
        jla jlaVar = this.n;
        int f = getMessagesController().l4.j3.f();
        ila ilaVar = new ila();
        ilaVar.a = 1;
        ilaVar.b = f;
        ilaVar.e = new dq9((byte) 22);
        jlaVar.d(i, ilaVar, new g92(this, b2));
        b0(this.n, false);
        njb njbVar3 = new njb(12, this.resourceProvider, context);
        njbVar3.setTopPadding(12);
        njbVar3.setBottomPadding(16);
        njbVar3.setText(jb6.M0(2131748423, null));
        b0(njbVar3, true);
        if (chatFull.paid_media_allowed) {
            bjb bjbVar3 = new bjb(context);
            this.r = bjbVar3;
            bjbVar3.f(jb6.M0(2131752355, null), false, false);
            b0(this.r, false);
            final byte b3 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: i92
                public final /* synthetic */ n92 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bjb bjbVar32;
                    byte b22 = b3;
                    boolean z2 = false;
                    byte b32 = 2;
                    n92 n92Var = this.b;
                    switch (b22) {
                        case 0:
                            if (n92Var.e.e.h && (bjbVar32 = n92Var.r) != null && bjbVar32.e.h) {
                                n92Var.k0();
                            }
                            if (!n92Var.e.e.h) {
                                z2 = n92Var.a;
                                b32 = 1;
                            }
                            n92Var.i0(b32, z2, true);
                            break;
                        case 1:
                            n92Var.k0();
                            break;
                        default:
                            if (!n92Var.s.R) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = n92Var.X;
                                if (tL_premium_boostsStatus != null) {
                                    int i42 = tL_premium_boostsStatus.level;
                                    int i52 = n92Var.Y;
                                    if (i42 < i52) {
                                        n39.f(-n92Var.T, i52, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                bjb bjbVar4 = n92Var.r;
                                Boolean valueOf = (bjbVar4 == null || !n92Var.S.paid_media_allowed) ? null : Boolean.valueOf(bjbVar4.e.h);
                                n92Var.s.setLoading(true);
                                n92Var.N = n92Var.Z;
                                oc7 messagesController = n92Var.getMessagesController();
                                long j = n92Var.T;
                                int i6 = n92Var.Z;
                                ArrayList h0 = n92Var.h0(false);
                                int i7 = n92Var.V;
                                n92Var.U = i7;
                                messagesController.N4(j, i6, h0, i7, valueOf, new g92(n92Var, b32), new f92(n92Var, (byte) 2));
                                break;
                            }
                            break;
                    }
                }
            });
            njb njbVar4 = new njb(12, this.resourceProvider, context);
            anb.X(njbVar4.getTextView(), i4, null);
            njbVar4.setTopPadding(12);
            njbVar4.setBottomPadding(70);
            njbVar4.setText(gm.X3(jb6.M0(2131752354, null), new f92(this, (byte) 5)));
            b0(njbVar4, true);
        } else {
            njbVar3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        anb.s(this.x, cmb.Z6, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, qoe.e(-1, -1, nm7.D1));
        n8c n8cVar = new n8c(getResourceProvider(), context, true);
        this.s = n8cVar;
        n8cVar.f();
        n8c n8cVar2 = this.s;
        n8cVar2.getClass();
        n8cVar2.i(new SpannableStringBuilder(jb6.M0(2131746121, null)), false, true);
        n8cVar2.m0 = new SpannableStringBuilder("l");
        pn2 pn2Var = new pn2(R.drawable.mini_switch_lock, 0);
        pn2Var.n = 1;
        n8cVar2.m0.setSpan(pn2Var, 0, 1, 33);
        final byte b4 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: i92
            public final /* synthetic */ n92 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bjb bjbVar32;
                byte b22 = b4;
                boolean z2 = false;
                byte b32 = 2;
                n92 n92Var = this.b;
                switch (b22) {
                    case 0:
                        if (n92Var.e.e.h && (bjbVar32 = n92Var.r) != null && bjbVar32.e.h) {
                            n92Var.k0();
                        }
                        if (!n92Var.e.e.h) {
                            z2 = n92Var.a;
                            b32 = 1;
                        }
                        n92Var.i0(b32, z2, true);
                        break;
                    case 1:
                        n92Var.k0();
                        break;
                    default:
                        if (!n92Var.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = n92Var.X;
                            if (tL_premium_boostsStatus != null) {
                                int i42 = tL_premium_boostsStatus.level;
                                int i52 = n92Var.Y;
                                if (i42 < i52) {
                                    n39.f(-n92Var.T, i52, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            bjb bjbVar4 = n92Var.r;
                            Boolean valueOf = (bjbVar4 == null || !n92Var.S.paid_media_allowed) ? null : Boolean.valueOf(bjbVar4.e.h);
                            n92Var.s.setLoading(true);
                            n92Var.N = n92Var.Z;
                            oc7 messagesController = n92Var.getMessagesController();
                            long j = n92Var.T;
                            int i6 = n92Var.Z;
                            ArrayList h0 = n92Var.h0(false);
                            int i7 = n92Var.V;
                            n92Var.U = i7;
                            messagesController.N4(j, i6, h0, i7, valueOf, new g92(n92Var, b32), new f92(n92Var, (byte) 2));
                            break;
                        }
                        break;
                }
            }
        });
        suVar.addView(this.F);
        suVar.addView(this.w, qoe.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, qoe.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        l0();
        yd ydVar = new yd(this, context);
        this.c = ydVar;
        ydVar.setVisibility(4);
        suVar.addView(this.c, qoe.e(-1, -2, 80));
        this.R = new fn0(0, new k6d((Object) this, (byte) 20), d53.f, 350L, false);
        m0();
        n0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z2 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.L;
        ArrayList arrayList4 = this.J;
        LinkedHashMap linkedHashMap3 = this.I;
        if (!z2) {
            ArrayList arrayList5 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList6 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size = arrayList6.size();
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList6.get(i7);
                    i7++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (!(reaction2 instanceof TLRPC.TL_reactionEmoji)) {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList5;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            l92 l92Var = this.b;
                            i3 = i7;
                            gn e = n39.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList6;
                            spannableString.setSpan(e, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (l92Var != null) {
                                l92Var.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i6++;
                            if (i6 < i5) {
                                break;
                            }
                            i7 = i3;
                            spannableStringBuilder4 = spannableStringBuilder2;
                            arrayList5 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList6 = arrayList2;
                            document = null;
                        }
                    } else {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction != null) {
                            n39.a(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList5;
                            spannableStringBuilder2 = spannableStringBuilder4;
                            i6++;
                        } else {
                            continue;
                        }
                    }
                    arrayList2 = arrayList6;
                    i3 = i7;
                    if (i6 < i5) {
                    }
                }
                this.h.append(spannableStringBuilder2);
                i0(1, this.a, false);
                z = true;
                i2 = 2;
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList5;
                boolean z3 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z3 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i2 = 2;
                    i0(2, this.a, false);
                } else if (z3) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    int size2 = arrayList3.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z = true;
                            break;
                        }
                        Object obj = arrayList3.get(i9);
                        i9++;
                        ArrayList arrayList8 = arrayList7;
                        n39.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z = true;
                        i8++;
                        if (i8 >= i5) {
                            break;
                        }
                        spannableStringBuilder5 = spannableStringBuilder;
                        arrayList7 = arrayList8;
                    }
                    this.h.append(spannableStringBuilder);
                    i2 = 2;
                    i0(2, this.a, false);
                } else {
                    i2 = 2;
                }
            }
            this.e.f(jb6.M0(2131751090, null), (this.Z == i2 || this.a) ? z : false, false);
            this.h.J();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                k0();
            }
            this.K.putAll(linkedHashMap);
            this.M = this.a;
            this.N = this.Z;
            this.fragmentView = suVar;
            return suVar;
        }
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        int size3 = arrayList3.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                linkedHashMap2 = linkedHashMap3;
                spannableStringBuilder3 = spannableStringBuilder6;
                break;
            }
            Object obj2 = arrayList3.get(i11);
            i11++;
            ArrayList arrayList9 = arrayList4;
            linkedHashMap2 = linkedHashMap3;
            n39.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
            spannableStringBuilder3 = spannableStringBuilder6;
            i10++;
            if (i10 >= i5) {
                break;
            }
            spannableStringBuilder6 = spannableStringBuilder3;
            linkedHashMap3 = linkedHashMap2;
            arrayList4 = arrayList9;
        }
        this.h.append(spannableStringBuilder3);
        i0(0, this.a, false);
        i2 = 2;
        linkedHashMap = linkedHashMap2;
        z = true;
        this.e.f(jb6.M0(2131751090, null), (this.Z == i2 || this.a) ? z : false, false);
        this.h.J();
        if (chatFull.paid_media_allowed) {
            k0();
        }
        this.K.putAll(linkedHashMap);
        this.M = this.a;
        this.N = this.Z;
        this.fragmentView = suVar;
        return suVar;
    }

    public final boolean d0(boolean z) {
        final byte b = 1;
        boolean z2 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        final byte b2 = 0;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z2 = false;
        }
        if (this.M != this.a) {
            z2 = true;
        }
        if (z && z2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = jb6.M0(2131743522, "UnsavedChanges");
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131746140, "ReactionApplyChangesDialog");
            alertDialog$Builder.j(jb6.M0(2131754181, "ApplyTheme"), new ee(this) { // from class: e92
                public final /* synthetic */ n92 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i) {
                    byte b3 = b2;
                    n92 n92Var = this.b;
                    switch (b3) {
                        case 0:
                            n92Var.s.performClick();
                            break;
                        default:
                            n92Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131751343, null), new ee(this) { // from class: e92
                public final /* synthetic */ n92 b;

                {
                    this.b = this;
                }

                @Override // ee
                public final void r(he heVar2, int i) {
                    byte b3 = b;
                    n92 n92Var = this.b;
                    switch (b3) {
                        case 0:
                            n92Var.s.performClick();
                            break;
                        default:
                            n92Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z2;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var == null || tk5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(boolean z) {
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
        if (z) {
            c41.b0(this).Q(R.raw.chats_infotip, 36, gm.S2(jb6.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
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
            nm7.e().k(nm7.j1, 512);
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
        gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, gn.class);
        for (gn gnVar : gnVarArr) {
            this.I.remove(Long.valueOf(gnVar.documentId));
            this.J.remove(Long.valueOf(gnVar.documentId));
            this.b.A(Long.valueOf(gnVar.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        e0(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.F;
    }

    public final ArrayList h0(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() != -1) {
                ArrayList arrayList4 = this.L;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z ? arrayList2 : arrayList;
    }

    public final void i0(int i, boolean z, boolean z2) {
        if (this.Z == i && this.a == z) {
            return;
        }
        this.a = z;
        byte b = 1;
        boolean z3 = i == 1 || i == 0 || z;
        this.e.setChecked(z3);
        int w0 = cmb.w0(null, z3 ? cmb.e6 : cmb.d6, false);
        bjb bjbVar = this.e;
        if (!z2) {
            anb.h(z3 ? cmb.e6 : cmb.d6, null, bjbVar);
        } else if (z3) {
            bjbVar.b(w0, true);
        } else {
            bjbVar.setBackgroundColorAnimatedReverse(w0);
        }
        this.Z = i;
        if (i != 1 && i != 0 && !z) {
            if (!z2) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            } else {
                f0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(d53.f).setListener(new b91((Object) this, (byte) 22)).start();
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.F.g3.O(z2);
        if (z2) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(d53.f).start();
            this.F.post(new f92(this, b));
            LinkedHashMap linkedHashMap = this.I;
            if (linkedHashMap.isEmpty()) {
                this.b.L.clear();
                this.h.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    n39.a((TLRPC.TL_availableReaction) arrayList.get(i3), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i2++;
                    if (i2 >= this.O) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.J();
                vy9 vy9Var = this.b.q0;
                if (vy9Var != null) {
                    vy9Var.f();
                }
                e0(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(float f) {
        float a = pqe.a(f, 0.0f, 1.0f);
        yd ydVar = this.c;
        if (ydVar != null && this.w != null) {
            ydVar.setTranslationY((1.0f - a) * ydVar.getMeasuredHeight());
            this.w.setTranslationY((-a) * this.c.getMeasuredHeight());
        }
        l0();
        n0();
    }

    public final void k0() {
        bjb bjbVar = this.r;
        boolean z = bjbVar.e.h;
        int i = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z) {
            bjbVar.setChecked(false);
            arrayList.remove((Object) (-1L));
            gn gnVar = (gn) linkedHashMap.remove(-1L);
            if (gnVar != null) {
                gnVar.setRemoved(new lx1(this, gnVar, (byte) 24));
            }
            c0(gnVar);
            this.b.x(-1L, true);
            e0(false);
            this.h.setMaxLength(i);
            i0(this.Z, this.a, true);
        } else {
            bjbVar.setChecked(true);
            try {
                this.h.setMaxLength(i + 1);
                SpannableString spannableString = new SpannableString("b");
                m92 m92Var = new m92(this);
                m92Var.cacheType = vm.f();
                m92Var.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, m92Var);
                spannableString.setSpan(m92Var, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                e0(true);
                c0(m92Var);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            i0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void l0() {
        if (this.w == null || this.s == null) {
            return;
        }
        fn0 fn0Var = this.R;
        int round = Math.round((1.0f - (fn0Var != null ? fn0Var.e : 0.0f)) * this.y);
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height = gm.L(74.0f) + round;
        this.w.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = gm.L(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    public final void m0() {
        if (this.c != null) {
            this.E.setColor(cmb.v0(cmb.c6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void n0() {
        if (this.F == null) {
            return;
        }
        fn0 fn0Var = this.R;
        int U1 = gm.U1(fn0Var != null ? fn0Var.e : 0.0f, gm.L(72.0f), gm.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        q7c q7cVar = this.F;
        iq5 iq5Var = this.mSystemInsets;
        eh0.e(q7cVar, iq5Var.b, iq5Var.d, a.getCurrentActionBarHeight(), U1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.P) {
            if (z) {
                f0();
                return false;
            }
        } else if (!d0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        oc7 messagesController = getMessagesController();
        long j = this.T;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        this.W = L0;
        byte b = 0;
        if (L0 == null) {
            TLRPC.Chat O = cf7.Y(this.currentAccount).O(j);
            this.W = O;
            if (O != null) {
                getMessagesController().V3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().F0().a(-j, new g92(this, b));
            getNotificationCenter().b(this, nm7.Z4);
            this.L.addAll(getMediaDataController().n);
            nm7.e().k(nm7.j1, 512);
            getNotificationCenter().b(this, nm7.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        gm.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().N4(this.T, this.Z, h0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, nm7.Z4);
        getNotificationCenter().n(this, nm7.y1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.y = i4;
        l0();
        m0();
        n0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                gm.d3(new f92(this, (byte) 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            bjb bjbVar = this.e;
            if (bjbVar == null || !(bjbVar.getBackground() instanceof ColorDrawable)) {
                return;
            }
            bjb bjbVar2 = this.e;
            bjbVar2.setBackgroundColor(cmb.w0(null, bjbVar2.e.h ? cmb.e6 : cmb.d6, false));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        byte b = 1;
        if (z && this.Z != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z) {
            this.Q = true;
            if (z2) {
                return;
            }
            if (this.b == null) {
                l92 l92Var = new l92(this, this, getParentActivity(), getResourceProvider(), cmb.v0(cmb.F6, getResourceProvider()));
                this.b = l92Var;
                l92Var.setAnimationsEnabled(false);
                this.b.setClipChildren(false);
                anb.h(cmb.c6, null, this.b);
                this.c.addView(this.b, qoe.e(-1, -2, 80));
                he0 he0Var = new he0(getParentActivity(), getResourceProvider());
                this.d = he0Var;
                he0Var.setOnBackspace(new g92(this, b));
                this.c.addView(this.d, qoe.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.b.x((Long) obj, false);
                }
            }
            gm.d3(new jd((byte) 22), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
