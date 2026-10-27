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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final y9 Z;
    public final org.telegram.ui.Cells.g3 a0;
    public final org.telegram.ui.Cells.g3 b0;
    public final FrameLayout c0;
    public final aq d0;
    public final FrameLayout e0;
    public final FrameLayout f0;
    public final fi.d g0;
    public Long h0;
    public x i0;
    public TL_aicompose.TL_aiComposeTone j0;
    public e k0;
    public e l0;
    public int m0;
    public k71 n0;
    public int o0;

    public y(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, true, false, 2, u6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, L, u6Var);
        this.e.addView(imageView, kb1.h(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        kb1.c(imageView, 0.1f, 1.5f);
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
        int i12 = org.telegram.ui.ActionBar.y6.d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, u6Var);
        kb1.b(frameLayout2);
        frameLayout.addView(frameLayout2, kb1.i(100, 100, 17));
        y9 y9Var = new y9(context);
        this.Z = y9Var;
        X();
        frameLayout2.addView(y9Var, kb1.i(64, 64, 17));
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
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), u6Var);
        this.a0 = g3Var;
        g3Var.d.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), u6Var);
        this.b0 = g3Var2;
        g3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        g3Var2.d.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i14, u6Var), 24, 24);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N2, u6Var);
        aq aqVar = new aq(context, 24, u6Var);
        this.d0 = aqVar;
        aqVar.b(org.telegram.ui.ActionBar.y6.h7, org.telegram.ui.ActionBar.y6.j7, org.telegram.ui.ActionBar.y6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(aqVar, kb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q5, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, kb1.x(-2, -2, 16, 9, 0, 0, 0));
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
        frameLayout3.addView(linearLayout, kb1.h(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i16 = org.telegram.ui.ActionBar.y6.a7;
        this.behindKeyboardColorKey = i16;
        setBackgroundColor(getThemedColor(i16));
        nm0 nm0Var = this.d;
        int i17 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i17, 0, i17, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.u1();
        this.d.setOnItemClickListener(new di.x4(8, this, u6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.m = false;
        vVar.C = false;
        vVar.o(ds.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i16)), getThemedColor(i16), getThemedColor(i16)}));
        FrameLayout.LayoutParams i18 = kb1.i(-1, -2, 80);
        int i19 = i18.leftMargin;
        int i20 = this.backgroundPaddingLeft;
        i18.leftMargin = i19 + i20;
        i18.rightMargin += i20;
        this.containerView.addView(frameLayout4, i18);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f0 = frameLayout5;
        FrameLayout.LayoutParams h = kb1.h(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i21 = h.leftMargin;
        int i22 = this.backgroundPaddingLeft;
        h.leftMargin = i21 + i22;
        h.rightMargin += i22;
        this.containerView.addView(frameLayout5, h);
        fi.d f7 = org.telegram.messenger.wh.f(24, context, u6Var, true);
        this.g0 = f7;
        f7.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        f7.setOnClickListener(new org.telegram.ui.ActionBar.u1(19, this, u6Var));
        frameLayout4.addView(f7, kb1.i(-1, 48, 119));
        W();
        this.n0.O(false);
    }

    public static void P(y yVar, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var) {
        cVar.c(false);
        e2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.u6 u6Var) {
        org.telegram.ui.Cells.g3 g3Var = yVar.b0;
        org.telegram.ui.Cells.g3 g3Var2 = yVar.a0;
        aq aqVar = yVar.d0;
        fi.d dVar = yVar.g0;
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
            createtone.display_author = aqVar.a.q;
            createtone.emoji_id = yVar.h0.longValue();
            createtone.title = g3Var2.getText().toString();
            createtone.prompt = g3Var.getText().toString();
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
                                    org.telegram.ui.d3.t(yVar2.f0, u6Var, tL_error, false);
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
                            y.R(this.b, u6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = aqVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.j0);
        updatetone.flags |= 2;
        updatetone.emoji_id = yVar.h0.longValue();
        updatetone.flags |= 4;
        updatetone.title = g3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = g3Var.getText().toString();
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
                                org.telegram.ui.d3.t(yVar2.f0, u6Var, tL_error, false);
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
                        y.R(this.b, u6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.u6 u6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
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
                org.telegram.ui.d3.t(frameLayout, u6Var, tL_error, false);
            } else {
                e0.o0(yVar.currentAccount, new wc(frameLayout, u6Var));
            }
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.e2 e2Var) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new bi.t0(yVar, h, e2Var, 5));
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
        org.telegram.ui.w51[] w51VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        w51VarArr[0].b();
    }

    public final void W() {
        this.g0.setEnabled(this.h0 != null && this.a0.getText().length() > 0 && this.b0.getText().length() > 0);
    }

    public final void X() {
        this.m0 = 0;
        Long l4 = this.h0;
        y9 y9Var = this.Z;
        if (l4 == null) {
            y9Var.setImageResource(R.drawable.menu_smile_add);
            y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            y9Var.setAnimatedEmojiDrawable(new t5(4, this.currentAccount, this.h0.longValue()));
            y9Var.setColorFilter(null);
            y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.e0.setTranslationY(f7);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.a7);
            if (themedColor != this.o0) {
                this.o0 = themedColor;
                setBackgroundColor(themedColor);
                this.e0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        y9 y9Var = this.Z;
        if (y9Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(this.h0 == null ? org.telegram.ui.ActionBar.y6.W5 : org.telegram.ui.ActionBar.y6.j5, this.resourcesProvider);
                if (w02 != this.m0) {
                    this.m0 = w02;
                    if (this.h0 == null) {
                        y9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.n0 = k71Var;
        k71Var.r = false;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(this.j0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
