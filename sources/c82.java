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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c82 extends d implements gk7 {
    public final Paint E;
    public q5c F;
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
    public fm0 R;
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
    public a82 b;
    public final u72 b0;
    public yc c;
    public hd0 d;
    public ahb e;
    public mhb f;
    public z72 h;
    public ija n;
    public ahb r;
    public m6c s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public c82(long j, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().k4.S1.f();
        this.P = false;
        this.Z = -1;
        this.b0 = new u72(this, (byte) 6);
        this.T = j;
        this.S = chatFull;
    }

    public final void a0(View view, boolean z) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z));
    }

    public final void b0(gm gmVar) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(gmVar)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            gm[] gmVarArr = (gm[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), gm.class);
            for (gm gmVar2 : gmVarArr) {
                gmVar2.setAnimateChanges();
            }
        }
    }

    public final boolean c0(boolean z) {
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
            String M0 = k96.M0(2131743596, "UnsavedChanges");
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131746214, "ReactionApplyChangesDialog");
            alertDialog$Builder.j(k96.M0(2131754213, "ApplyTheme"), new ed(this) { // from class: t72
                public final /* synthetic */ c82 b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i) {
                    byte b3 = b2;
                    c82 c82Var = this.b;
                    switch (b3) {
                        case 0:
                            c82Var.s.performClick();
                            break;
                        default:
                            c82Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.g(k96.M0(2131751394, null), new ed(this) { // from class: t72
                public final /* synthetic */ c82 b;

                {
                    this.b = this;
                }

                @Override // ed
                public final void u(hd hdVar2, int i) {
                    byte b3 = b;
                    c82 c82Var = this.b;
                    switch (b3) {
                        case 0:
                            c82Var.s.performClick();
                            break;
                        default:
                            c82Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z2;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        if (c0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03f7 A[EDGE_INSN: B:54:0x03f7->B:55:0x03f7 BREAK  A[LOOP:1: B:42:0x0355->B:53:0x0355], SYNTHETIC] */
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
        ArrayList<TLRPC.Reaction> arrayList2;
        int i3;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(k96.M0(2131746194, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 23));
        final byte b = 0;
        q5c q5cVar = new q5c(this, new w72(this, b), null, null);
        this.F = q5cVar;
        q5cVar.setSections(true);
        this.F.setSectionsDrawBackground(true);
        st stVar = new st(this, context);
        stVar.setFocusableInTouchMode(true);
        stVar.requestFocus();
        ahb ahbVar = new ahb(context);
        this.e = ahbVar;
        ahbVar.setHeight(56);
        ahb ahbVar2 = this.e;
        zkb.h(ahbVar2.e.h ? bkb.e6 : bkb.d6, null, ahbVar2);
        this.e.setTypeface(gl.o());
        this.e.d(bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: x72
            public final /* synthetic */ c82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ahb ahbVar3;
                byte b2 = b;
                boolean z2 = false;
                byte b3 = 2;
                c82 c82Var = this.b;
                switch (b2) {
                    case 0:
                        if (c82Var.e.e.h && (ahbVar3 = c82Var.r) != null && ahbVar3.e.h) {
                            c82Var.j0();
                        }
                        if (!c82Var.e.e.h) {
                            z2 = c82Var.a;
                            b3 = 1;
                        }
                        c82Var.h0(b3, z2, true);
                        break;
                    case 1:
                        c82Var.j0();
                        break;
                    default:
                        if (!c82Var.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = c82Var.X;
                            if (tL_premium_boostsStatus != null) {
                                int i4 = tL_premium_boostsStatus.level;
                                int i5 = c82Var.Y;
                                if (i4 < i5) {
                                    k19.f(-c82Var.T, i5, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            ahb ahbVar4 = c82Var.r;
                            Boolean valueOf = (ahbVar4 == null || !c82Var.S.paid_media_allowed) ? null : Boolean.valueOf(ahbVar4.e.h);
                            c82Var.s.setLoading(true);
                            c82Var.N = c82Var.Z;
                            na7 messagesController = c82Var.getMessagesController();
                            long j = c82Var.T;
                            int i6 = c82Var.Z;
                            ArrayList g0 = c82Var.g0(false);
                            int i7 = c82Var.V;
                            c82Var.U = i7;
                            messagesController.K4(j, i6, g0, i7, valueOf, new v72(c82Var, b3), new u72(c82Var, (byte) 2));
                            break;
                        }
                        break;
                }
            }
        });
        mhb mhbVar = new mhb(12, this.resourceProvider, context);
        this.f = mhbVar;
        l46 textView = mhbVar.getTextView();
        int i4 = bkb.A6;
        zkb.X(textView, i4, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(k96.M0(2131746216, null));
        ld5 ld5Var = new ld5(context);
        ld5Var.setText(k96.M0(2131753756, null));
        zkb.h(bkb.c6, null, ld5Var);
        ld5Var.setTextSize(15.0f);
        ld5Var.setTopMargin(14);
        a0(ld5Var, false);
        wjb resourceProvider = getResourceProvider();
        int i5 = this.O;
        z72 z72Var = new z72(this, context, resourceProvider, i5);
        this.h = z72Var;
        byte b2 = 3;
        z72Var.setOnFocused(new u72(this, b2));
        a0(this.h, false);
        mhb mhbVar2 = new mhb(12, this.resourceProvider, context);
        zkb.X(mhbVar2.getTextView(), i4, null);
        mhbVar2.setText(gl.O2(k96.M0(2131746213, null), bkb.Wc, 0, new u72(this, (byte) 4), getResourceProvider()));
        a0(mhbVar2, true);
        ld5 ld5Var2 = new ld5(context, this.resourceProvider);
        ld5Var2.setText(k96.M0(2131748475, null));
        a0(ld5Var2, false);
        this.n = new ija(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.S;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            i = getMessagesController().k4.j3.f();
            this.V = i;
            this.U = i;
        } else {
            i = chatFull.reactions_limit;
            this.V = i;
            this.U = i;
        }
        ija ijaVar = this.n;
        int f = getMessagesController().k4.j3.f();
        hja hjaVar = new hja();
        hjaVar.a = 1;
        hjaVar.b = f;
        byte b3 = 21;
        hjaVar.e = new ho9((byte) 21);
        ijaVar.d(i, hjaVar, new v72(this, b2));
        a0(this.n, false);
        mhb mhbVar3 = new mhb(12, this.resourceProvider, context);
        mhbVar3.setTopPadding(12);
        mhbVar3.setBottomPadding(16);
        mhbVar3.setText(k96.M0(2131748474, null));
        a0(mhbVar3, true);
        if (chatFull.paid_media_allowed) {
            ahb ahbVar3 = new ahb(context);
            this.r = ahbVar3;
            ahbVar3.f(k96.M0(2131752399, null), false, false);
            a0(this.r, false);
            final byte b4 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: x72
                public final /* synthetic */ c82 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ahb ahbVar32;
                    byte b22 = b4;
                    boolean z2 = false;
                    byte b32 = 2;
                    c82 c82Var = this.b;
                    switch (b22) {
                        case 0:
                            if (c82Var.e.e.h && (ahbVar32 = c82Var.r) != null && ahbVar32.e.h) {
                                c82Var.j0();
                            }
                            if (!c82Var.e.e.h) {
                                z2 = c82Var.a;
                                b32 = 1;
                            }
                            c82Var.h0(b32, z2, true);
                            break;
                        case 1:
                            c82Var.j0();
                            break;
                        default:
                            if (!c82Var.s.R) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = c82Var.X;
                                if (tL_premium_boostsStatus != null) {
                                    int i42 = tL_premium_boostsStatus.level;
                                    int i52 = c82Var.Y;
                                    if (i42 < i52) {
                                        k19.f(-c82Var.T, i52, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                ahb ahbVar4 = c82Var.r;
                                Boolean valueOf = (ahbVar4 == null || !c82Var.S.paid_media_allowed) ? null : Boolean.valueOf(ahbVar4.e.h);
                                c82Var.s.setLoading(true);
                                c82Var.N = c82Var.Z;
                                na7 messagesController = c82Var.getMessagesController();
                                long j = c82Var.T;
                                int i6 = c82Var.Z;
                                ArrayList g0 = c82Var.g0(false);
                                int i7 = c82Var.V;
                                c82Var.U = i7;
                                messagesController.K4(j, i6, g0, i7, valueOf, new v72(c82Var, b32), new u72(c82Var, (byte) 2));
                                break;
                            }
                            break;
                    }
                }
            });
            mhb mhbVar4 = new mhb(12, this.resourceProvider, context);
            zkb.X(mhbVar4.getTextView(), i4, null);
            mhbVar4.setTopPadding(12);
            mhbVar4.setBottomPadding(70);
            mhbVar4.setText(gl.Y3(k96.M0(2131752398, null), new u72(this, (byte) 5)));
            a0(mhbVar4, true);
        } else {
            mhbVar3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        zkb.s(this.x, bkb.Z6, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, nme.e(-1, -1, kk7.D1));
        m6c m6cVar = new m6c(getResourceProvider(), context, true);
        this.s = m6cVar;
        m6cVar.f();
        m6c m6cVar2 = this.s;
        m6cVar2.getClass();
        m6cVar2.i(new SpannableStringBuilder(k96.M0(2131746195, null)), false, true);
        m6cVar2.m0 = new SpannableStringBuilder("l");
        cm2 cm2Var = new cm2(R.drawable.mini_switch_lock, 0);
        cm2Var.n = 1;
        m6cVar2.m0.setSpan(cm2Var, 0, 1, 33);
        final byte b5 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: x72
            public final /* synthetic */ c82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ahb ahbVar32;
                byte b22 = b5;
                boolean z2 = false;
                byte b32 = 2;
                c82 c82Var = this.b;
                switch (b22) {
                    case 0:
                        if (c82Var.e.e.h && (ahbVar32 = c82Var.r) != null && ahbVar32.e.h) {
                            c82Var.j0();
                        }
                        if (!c82Var.e.e.h) {
                            z2 = c82Var.a;
                            b32 = 1;
                        }
                        c82Var.h0(b32, z2, true);
                        break;
                    case 1:
                        c82Var.j0();
                        break;
                    default:
                        if (!c82Var.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = c82Var.X;
                            if (tL_premium_boostsStatus != null) {
                                int i42 = tL_premium_boostsStatus.level;
                                int i52 = c82Var.Y;
                                if (i42 < i52) {
                                    k19.f(-c82Var.T, i52, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            ahb ahbVar4 = c82Var.r;
                            Boolean valueOf = (ahbVar4 == null || !c82Var.S.paid_media_allowed) ? null : Boolean.valueOf(ahbVar4.e.h);
                            c82Var.s.setLoading(true);
                            c82Var.N = c82Var.Z;
                            na7 messagesController = c82Var.getMessagesController();
                            long j = c82Var.T;
                            int i6 = c82Var.Z;
                            ArrayList g0 = c82Var.g0(false);
                            int i7 = c82Var.V;
                            c82Var.U = i7;
                            messagesController.K4(j, i6, g0, i7, valueOf, new v72(c82Var, b32), new u72(c82Var, (byte) 2));
                            break;
                        }
                        break;
                }
            }
        });
        stVar.addView(this.F);
        stVar.addView(this.w, nme.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, nme.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        k0();
        yc ycVar = new yc(this, context);
        this.c = ycVar;
        ycVar.setVisibility(4);
        stVar.addView(this.c, nme.e(-1, -2, 80));
        this.R = new fm0(0, new l69(this, b3), s33.f, 350L, false);
        l0();
        m0();
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
                            a82 a82Var = this.b;
                            arrayList2 = arrayList6;
                            i3 = size;
                            gm e = k19.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            spannableString.setSpan(e, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (a82Var != null) {
                                a82Var.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i6++;
                            if (i6 < i5) {
                                break;
                            }
                            size = i3;
                            spannableStringBuilder4 = spannableStringBuilder2;
                            arrayList5 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList6 = arrayList2;
                            document = null;
                        }
                    } else {
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction != null) {
                            k19.a(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList5;
                            spannableStringBuilder2 = spannableStringBuilder4;
                            i6++;
                        } else {
                            continue;
                        }
                    }
                    arrayList2 = arrayList6;
                    i3 = size;
                    if (i6 < i5) {
                    }
                }
                this.h.append(spannableStringBuilder2);
                h0(1, this.a, false);
                z = true;
                i2 = 2;
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList5;
                boolean z3 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z3 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i2 = 2;
                    h0(2, this.a, false);
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
                        k19.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
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
                    h0(2, this.a, false);
                } else {
                    i2 = 2;
                }
            }
            this.e.f(k96.M0(2131751141, null), (this.Z == i2 || this.a) ? z : false, false);
            this.h.J();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                j0();
            }
            this.K.putAll(linkedHashMap);
            this.M = this.a;
            this.N = this.Z;
            this.fragmentView = stVar;
            return stVar;
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
            k19.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
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
        h0(0, this.a, false);
        i2 = 2;
        linkedHashMap = linkedHashMap2;
        z = true;
        this.e.f(k96.M0(2131751141, null), (this.Z == i2 || this.a) ? z : false, false);
        this.h.J();
        if (chatFull.paid_media_allowed) {
            j0();
        }
        this.K.putAll(linkedHashMap);
        this.M = this.a;
        this.N = this.Z;
        this.fragmentView = stVar;
        return stVar;
    }

    public final void d0(boolean z) {
        if (this.X == null) {
            return;
        }
        if (this.Z == 0) {
            this.Z = 1;
        }
        int size = g0(true).size();
        this.Y = size;
        if (this.X.level >= size) {
            this.s.g(null, true);
            return;
        }
        if (z) {
            u21.b0(this).Q(R.raw.chats_infotip, 36, gl.T2(k96.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.Y);
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.x1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var == null || ui5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0() {
        if (this.P) {
            this.P = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.F.setFocusableInTouchMode(true);
                this.F.requestFocus();
            }
            kk7.e().k(kk7.i1, 512);
            this.c.setLayerType(2, null);
            this.R.a(false, true);
        }
    }

    public final boolean f0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        gm[] gmVarArr = (gm[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, gm.class);
        for (gm gmVar : gmVarArr) {
            this.I.remove(Long.valueOf(gmVar.documentId));
            this.J.remove(Long.valueOf(gmVar.documentId));
            this.b.A(Long.valueOf(gmVar.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        d0(false);
        return true;
    }

    public final ArrayList g0(boolean z) {
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

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.F;
    }

    public final void h0(int i, boolean z, boolean z2) {
        if (this.Z == i && this.a == z) {
            return;
        }
        this.a = z;
        byte b = 1;
        boolean z3 = i == 1 || i == 0 || z;
        this.e.setChecked(z3);
        int w0 = bkb.w0(null, z3 ? bkb.e6 : bkb.d6, false);
        ahb ahbVar = this.e;
        if (!z2) {
            zkb.h(z3 ? bkb.e6 : bkb.d6, null, ahbVar);
        } else if (z3) {
            ahbVar.b(w0, true);
        } else {
            ahbVar.setBackgroundColorAnimatedReverse(w0);
        }
        this.Z = i;
        if (i != 1 && i != 0 && !z) {
            if (!z2) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            } else {
                e0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(s33.f).setListener(new bb1((Object) this, (byte) 20)).start();
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.F.g3.O(z2);
        if (z2) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33.f).start();
            this.F.post(new u72(this, b));
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
                    k19.a((TLRPC.TL_availableReaction) arrayList.get(i3), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i2++;
                    if (i2 >= this.O) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.J();
                tw9 tw9Var = this.b.q0;
                if (tw9Var != null) {
                    tw9Var.f();
                }
                d0(false);
            }
        }
    }

    public final void i0(float f) {
        float a = moe.a(f, 0.0f, 1.0f);
        yc ycVar = this.c;
        if (ycVar != null && this.w != null) {
            ycVar.setTranslationY((1.0f - a) * ycVar.getMeasuredHeight());
            this.w.setTranslationY((-a) * this.c.getMeasuredHeight());
        }
        k0();
        m0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        ahb ahbVar = this.r;
        boolean z = ahbVar.e.h;
        int i = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z) {
            ahbVar.setChecked(false);
            arrayList.remove((Object) (-1L));
            gm gmVar = (gm) linkedHashMap.remove(-1L);
            if (gmVar != null) {
                gmVar.setRemoved(new kx1(this, gmVar, (byte) 23));
            }
            b0(gmVar);
            this.b.x(-1L, true);
            d0(false);
            this.h.setMaxLength(i);
            h0(this.Z, this.a, true);
        } else {
            ahbVar.setChecked(true);
            try {
                this.h.setMaxLength(i + 1);
                SpannableString spannableString = new SpannableString("b");
                b82 b82Var = new b82(this);
                b82Var.cacheType = vl.f();
                b82Var.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, b82Var);
                spannableString.setSpan(b82Var, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                d0(true);
                b0(b82Var);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            h0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void k0() {
        if (this.w == null || this.s == null) {
            return;
        }
        fm0 fm0Var = this.R;
        int round = Math.round((1.0f - (fm0Var != null ? fm0Var.e : 0.0f)) * this.y);
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height = gl.L(74.0f) + round;
        this.w.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = gl.L(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    public final void l0() {
        if (this.c != null) {
            this.E.setColor(bkb.v0(bkb.c6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void m0() {
        if (this.F == null) {
            return;
        }
        fm0 fm0Var = this.R;
        int U1 = gl.U1(fm0Var != null ? fm0Var.e : 0.0f, gl.L(72.0f), gl.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        q5c q5cVar = this.F;
        io5 io5Var = this.mSystemInsets;
        dg0.e(q5cVar, io5Var.b, io5Var.d, a.getCurrentActionBarHeight(), U1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.P) {
            if (z) {
                e0();
                return false;
            }
        } else if (!c0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        na7 messagesController = getMessagesController();
        long j = this.T;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        this.W = K0;
        byte b = 0;
        if (K0 == null) {
            TLRPC.Chat O = ad7.Y(this.currentAccount).O(j);
            this.W = O;
            if (O != null) {
                getMessagesController().S3(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().E0().a(-j, new v72(this, b));
            getNotificationCenter().b(this, kk7.X4);
            this.L.addAll(getMediaDataController().n);
            kk7.e().k(kk7.i1, 512);
            getNotificationCenter().b(this, kk7.x1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        gl.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().K4(this.T, this.Z, g0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, kk7.X4);
        getNotificationCenter().n(this, kk7.x1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.y = i4;
        k0();
        l0();
        m0();
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
                gl.e3(new u72(this, (byte) 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            ahb ahbVar = this.e;
            if (ahbVar == null || !(ahbVar.getBackground() instanceof ColorDrawable)) {
                return;
            }
            ahb ahbVar2 = this.e;
            ahbVar2.setBackgroundColor(bkb.w0(null, ahbVar2.e.h ? bkb.e6 : bkb.d6, false));
        } catch (Exception e) {
            fa4.g(e, true);
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
                a82 a82Var = new a82(this, this, getParentActivity(), getResourceProvider(), bkb.v0(bkb.F6, getResourceProvider()));
                this.b = a82Var;
                a82Var.setAnimationsEnabled(false);
                this.b.setClipChildren(false);
                zkb.h(bkb.c6, null, this.b);
                this.c.addView(this.b, nme.e(-1, -2, 80));
                hd0 hd0Var = new hd0(getParentActivity(), getResourceProvider());
                this.d = hd0Var;
                hd0Var.setOnBackspace(new v72(this, b));
                this.c.addView(this.d, nme.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.b.x((Long) obj, false);
                }
            }
            gl.e3(new jc((byte) 22), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
