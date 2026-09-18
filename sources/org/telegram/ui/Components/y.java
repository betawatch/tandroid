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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class y extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final w9 Z;
    public final org.telegram.ui.Cells.j3 a0;
    public final org.telegram.ui.Cells.j3 b0;
    public final FrameLayout c0;
    public final np d0;
    public final FrameLayout e0;
    public final FrameLayout f0;
    public final ci.d g0;
    public Long h0;
    public x i0;
    public TL_aicompose.TL_aiComposeTone j0;
    public e k0;
    public e l0;
    public l61 m0;

    public y(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, 2, e6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.y5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.a6.b(imageView, 0.1f, 1.5f);
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
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, e6Var)));
        w7.a6.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.y5.e(100, 100, 17));
        w9 w9Var = new w9(context);
        this.Z = w9Var;
        X();
        frameLayout2.addView(w9Var, w7.y5.e(64, 64, 17));
        final int i12 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
            public final /* synthetic */ y b;

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
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), e6Var);
        this.a0 = j3Var;
        j3Var.b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), e6Var);
        this.b0 = j3Var2;
        j3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        j3Var2.b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, e6Var), 24, 24));
        np npVar = new np(context, 24, e6Var);
        this.d0 = npVar;
        npVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(npVar, w7.y5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.wh.m(org.telegram.ui.ActionBar.j6.q5, e6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.y5.t(-2, -2, 16, 9, 0, 0, 0));
        final int i13 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
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
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.y5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i14 = org.telegram.ui.ActionBar.j6.a7;
        this.behindKeyboardColorKey = i14;
        setBackgroundColor(getThemedColor(i14));
        wl0 wl0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.q1();
        this.d.setOnItemClickListener(new ai.o6(8, this, e6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        v vVar = new v(this);
        vVar.m = false;
        vVar.C = false;
        vVar.o(qr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14), getThemedColor(i14)}));
        FrameLayout.LayoutParams e = w7.y5.e(-1, -2, 80);
        int i16 = e.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        e.leftMargin = i16 + i17;
        e.rightMargin += i17;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.y5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = d.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        d.leftMargin = i18 + i19;
        d.rightMargin += i19;
        this.containerView.addView(frameLayout5, d);
        ci.d f7 = org.telegram.messenger.wh.f(24, context, e6Var, true);
        this.g0 = f7;
        f7.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        f7.setOnClickListener(new org.telegram.ui.sf(9, this, e6Var));
        frameLayout4.addView(f7, w7.y5.e(-1, 48, 119));
        W();
        this.m0.N(false);
    }

    public static void P(y yVar, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var) {
        eVar.c(false);
        b2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.j0);
    }

    public static void Q(final y yVar, final org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.Cells.j3 j3Var = yVar.b0;
        org.telegram.ui.Cells.j3 j3Var2 = yVar.a0;
        np npVar = yVar.d0;
        ci.d dVar = yVar.g0;
        if (dVar.N) {
            return;
        }
        if (!dVar.W) {
            if (yVar.h0 == null) {
                yVar.V();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (yVar.j0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = npVar.a.q;
            createtone.emoji_id = yVar.h0.longValue();
            createtone.title = j3Var2.getText().toString();
            createtone.prompt = j3Var.getText().toString();
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
                                    org.telegram.ui.Cells.c1.p(yVar2.f0, e6Var, tL_error, false);
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
                            y.R(this.b, e6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = npVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.j0);
        updatetone.flags |= 2;
        updatetone.emoji_id = yVar.h0.longValue();
        updatetone.flags |= 4;
        updatetone.title = j3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = j3Var.getText().toString();
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
                                org.telegram.ui.Cells.c1.p(yVar2.f0, e6Var, tL_error, false);
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
                        y.R(this.b, e6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.e6 e6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
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
                org.telegram.ui.Cells.c1.p(frameLayout, e6Var, tL_error, false);
            } else {
                e0.o0(yVar.currentAccount, new xc(frameLayout, e6Var));
            }
        }
    }

    public static void S(y yVar, org.telegram.ui.ActionBar.b2 b2Var) {
        nf.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.j0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new org.telegram.tgnet.e(yVar, g10, b2Var, 3));
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
        org.telegram.ui.x61[] x61VarArr = {xVar};
        xVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        x61VarArr[0].b();
    }

    public final void W() {
        this.g0.setEnabled(this.h0 != null && this.a0.getText().length() > 0 && this.b0.getText().length() > 0);
    }

    public final void X() {
        Long l4 = this.h0;
        w9 w9Var = this.Z;
        if (l4 == null) {
            w9Var.setImageResource(R.drawable.menu_smile_add);
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            w9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, this.h0.longValue()));
            w9Var.setColorFilter(null);
            w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.e0.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(wl0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = l61Var;
        l61Var.r = false;
        return l61Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(this.j0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
