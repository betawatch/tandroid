package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final w9 Z;
    public final org.telegram.ui.Cells.h3 a0;
    public final org.telegram.ui.Cells.h3 b0;
    public final FrameLayout c0;
    public final xp d0;
    public final FrameLayout e0;
    public final FrameLayout f0;
    public final ei.d g0;
    public Long h0;
    public x i0;
    public TL_aicompose.TL_aiComposeTone j0;
    public e k0;
    public e l0;
    public int m0;
    public b71 n0;
    public int o0;

    public y(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, 2, g6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, M, g6Var);
        this.e.addView(imageView, w7.z5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
            public final /* synthetic */ y b;

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
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        int dp = AndroidUtilities.dp(100.0f);
        int i12 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, g6Var);
        w7.b6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.z5.e(100, 100, 17));
        w9 w9Var = new w9(context);
        this.Z = w9Var;
        X();
        frameLayout2.addView(w9Var, w7.z5.e(64, 64, 17));
        final int i13 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
            public final /* synthetic */ y b;

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
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), g6Var);
        this.a0 = h3Var;
        h3Var.d.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), g6Var);
        this.b0 = h3Var2;
        h3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        h3Var2.d.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), 24, 24);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(linearLayout, Z, null, O2, g6Var);
        xp xpVar = new xp(context, 24, g6Var);
        this.d0 = xpVar;
        xpVar.b(org.telegram.ui.ActionBar.k6.h7, org.telegram.ui.ActionBar.k6.j7, org.telegram.ui.ActionBar.k6.k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(false, false);
        xpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q5, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        final int i15 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
            public final /* synthetic */ y b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.V();
                        break;
                    default:
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.z5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i16 = org.telegram.ui.ActionBar.k6.a7;
        this.behindKeyboardColorKey = i16;
        setBackgroundColor(getThemedColor(i16));
        mm0 mm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new ci.x4(8, this, g6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.m = false;
        vVar.C = false;
        vVar.o(bs.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i16)), getThemedColor(i16), getThemedColor(i16)}));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 80);
        int i18 = e.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        e.leftMargin = i18 + i19;
        e.rightMargin += i19;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView(frameLayout5, d);
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        this.g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.ActionBar.s1(19, this, g6Var));
        frameLayout4.addView(g10, w7.z5.e(-1, 48, 119));
        W();
        this.n0.N(false);
    }

    public static void P(y yVar, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var) {
        cVar.c(false);
        c2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.g6 g6Var) {
        org.telegram.ui.Cells.h3 h3Var = yVar.b0;
        org.telegram.ui.Cells.h3 h3Var2 = yVar.a0;
        xp xpVar = yVar.d0;
        ei.d dVar = yVar.g0;
        if (dVar.Q) {
            return;
        }
        if (!dVar.c0) {
            if (yVar.h0 == null) {
                yVar.V();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (yVar.j0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = xpVar.a.q;
            createtone.emoji_id = yVar.h0.longValue();
            createtone.title = h3Var2.getText().toString();
            createtone.prompt = h3Var.getText().toString();
            final int i10 = 1;
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new org.telegram.messenger.a(), new Utilities.Callback2(yVar) { // from class: org.telegram.ui.Components.t
                public final /* synthetic */ y b;

                {
                    this.b = yVar;
                }

                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (i10) {
                        case 0:
                            y yVar2 = this.b;
                            yVar2.g0.setLoading(false);
                            if (aiComposeTone == null) {
                                if (tL_error != null) {
                                    org.telegram.ui.Cells.b1.s(yVar2.f0, g6Var, tL_error, false);
                                    break;
                                }
                            } else {
                                e eVar = yVar2.l0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                break;
                            }
                            break;
                        default:
                            y.R(this.b, g6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = xpVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.j0);
        updatetone.flags |= 2;
        updatetone.emoji_id = yVar.h0.longValue();
        updatetone.flags |= 4;
        updatetone.title = h3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = h3Var.getText().toString();
        final int i11 = 0;
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new org.telegram.messenger.a(), new Utilities.Callback2(yVar) { // from class: org.telegram.ui.Components.t
            public final /* synthetic */ y b;

            {
                this.b = yVar;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                switch (i11) {
                    case 0:
                        y yVar2 = this.b;
                        yVar2.g0.setLoading(false);
                        if (aiComposeTone == null) {
                            if (tL_error != null) {
                                org.telegram.ui.Cells.b1.s(yVar2.f0, g6Var, tL_error, false);
                                break;
                            }
                        } else {
                            e eVar = yVar2.l0;
                            if (eVar != null) {
                                eVar.run(aiComposeTone);
                            }
                            yVar2.dismiss();
                            break;
                        }
                        break;
                    default:
                        y.R(this.b, g6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.f0;
        yVar.g0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                org.telegram.ui.Cells.b1.s(frameLayout, g6Var, tL_error, false);
            } else {
                e0.o0(yVar.currentAccount, new xc(frameLayout, g6Var));
            }
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.c2 c2Var) {
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new ai.s0(yVar, h, c2Var, 5));
    }

    public final void V() {
        if (this.i0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.h0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.i0 = xVar;
        org.telegram.ui.s51[] s51VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        s51VarArr[0].b();
    }

    public final void W() {
        this.g0.setEnabled(this.h0 != null && this.a0.getText().length() > 0 && this.b0.getText().length() > 0);
    }

    public final void X() {
        this.m0 = 0;
        Long l4 = this.h0;
        w9 w9Var = this.Z;
        if (l4 == null) {
            w9Var.setImageResource(R.drawable.menu_smile_add);
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            w9Var.setAnimatedEmojiDrawable(new r5(4, this.currentAccount, this.h0.longValue()));
            w9Var.setColorFilter(null);
            w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.e0.setTranslationY(f7);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            if (themedColor != this.o0) {
                this.o0 = themedColor;
                setBackgroundColor(themedColor);
                this.e0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        w9 w9Var = this.Z;
        if (w9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.h0 == null ? org.telegram.ui.ActionBar.k6.W5 : org.telegram.ui.ActionBar.k6.j5, this.resourcesProvider);
                if (w02 != this.m0) {
                    this.m0 = w02;
                    if (this.h0 == null) {
                        w9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.n0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(this.j0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
