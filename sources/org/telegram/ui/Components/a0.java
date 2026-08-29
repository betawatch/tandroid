package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a0 extends xa {
    public final FrameLayout T;
    public final FrameLayout U;
    public final t9 V;
    public final org.telegram.ui.Cells.g3 W;
    public final org.telegram.ui.Cells.g3 X;
    public final FrameLayout Y;
    public final hp Z;
    public final FrameLayout a0;
    public final FrameLayout b0;
    public final nh.d c0;
    public Long d0;
    public z e0;
    public TL_aicompose.TL_aiComposeTone f0;
    public e g0;
    public e h0;
    public k51 i0;

    public a0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, false, false, 2, c6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, i7.f6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        i7.h6.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.V();
                        break;
                    default:
                        this.b.Z.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.T = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var)));
        i7.h6.a(frameLayout2);
        frameLayout.addView(frameLayout2, i7.f6.e(100, 100, 17));
        t9 t9Var = new t9(context);
        this.V = t9Var;
        X();
        frameLayout2.addView(t9Var, i7.f6.e(64, 64, 17));
        final int i12 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.V();
                        break;
                    default:
                        this.b.Z.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), c6Var);
        this.W = g3Var;
        g3Var.b.addTextChangedListener(new w(this, 0));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), c6Var);
        this.X = g3Var2;
        g3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        g3Var2.b.addTextChangedListener(new w(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var), 24, 24));
        hp hpVar = new hp(context, 24, c6Var);
        this.Z = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.h7, org.telegram.ui.ActionBar.g6.j7, org.telegram.ui.ActionBar.g6.k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(false, false);
        hpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(hpVar, i7.f6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.q5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
        final int i13 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ a0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.V();
                        break;
                    default:
                        this.b.Z.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y = frameLayout3;
        frameLayout3.addView(linearLayout, i7.f6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i14 = org.telegram.ui.ActionBar.g6.a7;
        this.behindKeyboardColorKey = i14;
        setBackgroundColor(getThemedColor(i14));
        jl0 jl0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new eg.w0(9, this, c6Var));
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.K = true;
        x xVar = new x(this);
        xVar.m = false;
        xVar.C = false;
        xVar.o(jr.h);
        xVar.n(350L);
        this.d.setItemAnimator(xVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.a0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14), getThemedColor(i14)}));
        FrameLayout.LayoutParams e10 = i7.f6.e(-1, -2, 80);
        int i16 = e10.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        e10.leftMargin = i16 + i17;
        e10.rightMargin += i17;
        this.containerView.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.b0 = frameLayout5;
        FrameLayout.LayoutParams d = i7.f6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = d.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        d.leftMargin = i18 + i19;
        d.rightMargin += i19;
        this.containerView.addView(frameLayout5, d);
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.c0 = o10;
        o10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        o10.setOnClickListener(new nh.r7(27, this, c6Var));
        frameLayout4.addView(o10, i7.f6.e(-1, 48, 119));
        W();
        this.i0.N(false);
    }

    public static void P(a0 a0Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var) {
        cVar.c(false);
        c2Var.dismiss();
        a0Var.dismiss();
        MessagesController.getInstance(a0Var.currentAccount).getTonesController().remove(a0Var.f0);
    }

    public static void Q(final a0 a0Var, final org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.Cells.g3 g3Var = a0Var.X;
        org.telegram.ui.Cells.g3 g3Var2 = a0Var.W;
        hp hpVar = a0Var.Z;
        nh.d dVar = a0Var.c0;
        if (dVar.J) {
            return;
        }
        if (!dVar.S) {
            if (a0Var.d0 == null) {
                a0Var.V();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (a0Var.f0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = hpVar.a.q;
            createtone.emoji_id = a0Var.d0.longValue();
            createtone.title = g3Var2.getText().toString();
            createtone.prompt = g3Var.getText().toString();
            final int i10 = 1;
            ConnectionsManager.getInstance(a0Var.currentAccount).sendRequestTyped(createtone, new org.telegram.messenger.a(), new Utilities.Callback2(a0Var) { // from class: org.telegram.ui.Components.v
                public final /* synthetic */ a0 b;

                {
                    this.b = a0Var;
                }

                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (i10) {
                        case 0:
                            a0 a0Var2 = this.b;
                            a0Var2.c0.setLoading(false);
                            if (aiComposeTone == null) {
                                if (tL_error != null) {
                                    org.telegram.ui.th.t(a0Var2.b0, c6Var, tL_error, false);
                                    break;
                                }
                            } else {
                                e eVar = a0Var2.h0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                a0Var2.dismiss();
                                break;
                            }
                            break;
                        default:
                            a0.R(this.b, c6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = hpVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(a0Var.f0);
        updatetone.flags |= 2;
        updatetone.emoji_id = a0Var.d0.longValue();
        updatetone.flags |= 4;
        updatetone.title = g3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = g3Var.getText().toString();
        final int i11 = 0;
        ConnectionsManager.getInstance(a0Var.currentAccount).sendRequestTyped(updatetone, new org.telegram.messenger.a(), new Utilities.Callback2(a0Var) { // from class: org.telegram.ui.Components.v
            public final /* synthetic */ a0 b;

            {
                this.b = a0Var;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                switch (i11) {
                    case 0:
                        a0 a0Var2 = this.b;
                        a0Var2.c0.setLoading(false);
                        if (aiComposeTone == null) {
                            if (tL_error != null) {
                                org.telegram.ui.th.t(a0Var2.b0, c6Var, tL_error, false);
                                break;
                            }
                        } else {
                            e eVar = a0Var2.h0;
                            if (eVar != null) {
                                eVar.run(aiComposeTone);
                            }
                            a0Var2.dismiss();
                            break;
                        }
                        break;
                    default:
                        a0.R(this.b, c6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void R(a0 a0Var, org.telegram.ui.ActionBar.c6 c6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = a0Var.b0;
        a0Var.c0.setLoading(false);
        if (aiComposeTone != null) {
            a0Var.dismiss();
            e eVar = a0Var.g0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                org.telegram.ui.th.t(frameLayout, c6Var, tL_error, false);
            } else {
                g0.o0(a0Var.currentAccount, new tc(frameLayout, c6Var));
            }
        }
    }

    public static void S(a0 a0Var, org.telegram.ui.ActionBar.c2 c2Var) {
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(a0Var.f0);
        ConnectionsManager.getInstance(a0Var.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new ih.b0(a0Var, g10, c2Var, 7));
    }

    public final void V() {
        if (this.e0 != null) {
            return;
        }
        y yVar = new y(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        yVar.setSelected(this.d0);
        yVar.setSaveState(1);
        z zVar = new z(this, yVar);
        this.e0 = zVar;
        org.telegram.ui.u51[] u51VarArr = {zVar};
        zVar.showAsDropDown(this.U, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        u51VarArr[0].b();
    }

    public final void W() {
        this.c0.setEnabled(this.d0 != null && this.W.getText().length() > 0 && this.X.getText().length() > 0);
    }

    public final void X() {
        Long l10 = this.d0;
        t9 t9Var = this.V;
        if (l10 == null) {
            t9Var.setImageResource(R.drawable.menu_smile_add);
            t9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            t9Var.setAnimatedEmojiDrawable(new p5(4, this.currentAccount, this.d0.longValue()));
            t9Var.setColorFilter(null);
            t9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f9) {
        super.onSmoothContainerViewLayout(f9);
        this.a0.setTranslationY(f9);
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(jl0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.i0 = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(this.f0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
