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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z extends sa {
    public final FrameLayout U;
    public final FrameLayout V;
    public final p9 W;
    public final org.telegram.ui.Cells.h3 X;
    public final org.telegram.ui.Cells.h3 Y;
    public final FrameLayout Z;
    public final kp a0;
    public final FrameLayout b0;
    public final FrameLayout c0;
    public final ph.d d0;
    public Long e0;
    public y f0;
    public TL_aicompose.TL_aiComposeTone g0;
    public e h0;
    public e i0;
    public w51 j0;

    public z(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, false, false, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, k7.b6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.d6.b(imageView, 0.1f, 1.5f);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

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
                        this.b.a0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.U = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        k7.d6.a(frameLayout2);
        frameLayout.addView(frameLayout2, k7.b6.e(100, 100, 17));
        p9 p9Var = new p9(context);
        this.W = p9Var;
        X();
        frameLayout2.addView(p9Var, k7.b6.e(64, 64, 17));
        final int i12 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

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
                        this.b.a0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), f6Var);
        this.X = h3Var;
        h3Var.b.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.Y = h3Var2;
        h3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        h3Var2.b.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 24, 24));
        kp kpVar = new kp(context, 24, f6Var);
        this.a0 = kpVar;
        kpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        kpVar.setDrawUnchecked(true);
        kpVar.a(false, false);
        kpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(kpVar, k7.b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.q5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, k7.b6.t(-2, -2, 16, 9, 0, 0, 0));
        final int i13 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.s
            public final /* synthetic */ z b;

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
                        this.b.a0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z = frameLayout3;
        frameLayout3.addView(linearLayout, k7.b6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i14 = org.telegram.ui.ActionBar.j6.a7;
        this.behindKeyboardColorKey = i14;
        setBackgroundColor(getThemedColor(i14));
        rl0 rl0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new gg.v0(9, this, f6Var));
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.L = true;
        w wVar = new w(this);
        wVar.m = false;
        wVar.C = false;
        wVar.o(mr.h);
        wVar.n(350L);
        this.d.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.b0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14), getThemedColor(i14)}));
        FrameLayout.LayoutParams e = k7.b6.e(-1, -2, 80);
        int i16 = e.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        e.leftMargin = i16 + i17;
        e.rightMargin += i17;
        this.containerView.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.c0 = frameLayout5;
        FrameLayout.LayoutParams d = k7.b6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = d.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        d.leftMargin = i18 + i19;
        d.rightMargin += i19;
        this.containerView.addView(frameLayout5, d);
        ph.d p10 = org.telegram.messenger.y3.p(24, context, f6Var, true);
        this.d0 = p10;
        p10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        p10.setOnClickListener(new org.telegram.messenger.video.g(24, this, f6Var));
        frameLayout4.addView(p10, k7.b6.e(-1, 48, 119));
        W();
        this.j0.N(false);
    }

    public static void P(z zVar, ze.c cVar, org.telegram.ui.ActionBar.d2 d2Var) {
        cVar.c(false);
        d2Var.dismiss();
        zVar.dismiss();
        MessagesController.getInstance(zVar.currentAccount).getTonesController().remove(zVar.g0);
    }

    public static void Q(final z zVar, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.h3 h3Var = zVar.Y;
        org.telegram.ui.Cells.h3 h3Var2 = zVar.X;
        kp kpVar = zVar.a0;
        ph.d dVar = zVar.d0;
        if (dVar.K) {
            return;
        }
        if (!dVar.T) {
            if (zVar.e0 == null) {
                zVar.V();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (zVar.g0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = kpVar.a.q;
            createtone.emoji_id = zVar.e0.longValue();
            createtone.title = h3Var2.getText().toString();
            createtone.prompt = h3Var.getText().toString();
            final int i10 = 1;
            ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(createtone, new org.telegram.messenger.a(), new Utilities.Callback2(zVar) { // from class: org.telegram.ui.Components.u
                public final /* synthetic */ z b;

                {
                    this.b = zVar;
                }

                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (i10) {
                        case 0:
                            z zVar2 = this.b;
                            zVar2.d0.setLoading(false);
                            if (aiComposeTone == null) {
                                if (tL_error != null) {
                                    org.telegram.ui.ai.u(zVar2.c0, f6Var, tL_error, false);
                                    break;
                                }
                            } else {
                                e eVar = zVar2.i0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                zVar2.dismiss();
                                break;
                            }
                            break;
                        default:
                            z.R(this.b, f6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = kpVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.g0);
        updatetone.flags |= 2;
        updatetone.emoji_id = zVar.e0.longValue();
        updatetone.flags |= 4;
        updatetone.title = h3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = h3Var.getText().toString();
        final int i11 = 0;
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(updatetone, new org.telegram.messenger.a(), new Utilities.Callback2(zVar) { // from class: org.telegram.ui.Components.u
            public final /* synthetic */ z b;

            {
                this.b = zVar;
            }

            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                switch (i11) {
                    case 0:
                        z zVar2 = this.b;
                        zVar2.d0.setLoading(false);
                        if (aiComposeTone == null) {
                            if (tL_error != null) {
                                org.telegram.ui.ai.u(zVar2.c0, f6Var, tL_error, false);
                                break;
                            }
                        } else {
                            e eVar = zVar2.i0;
                            if (eVar != null) {
                                eVar.run(aiComposeTone);
                            }
                            zVar2.dismiss();
                            break;
                        }
                        break;
                    default:
                        z.R(this.b, f6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void R(z zVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = zVar.c0;
        zVar.d0.setLoading(false);
        if (aiComposeTone != null) {
            zVar.dismiss();
            e eVar = zVar.h0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                org.telegram.ui.ai.u(frameLayout, f6Var, tL_error, false);
            } else {
                f0.o0(zVar.currentAccount, new qc(frameLayout, f6Var));
            }
        }
    }

    public static void S(z zVar, org.telegram.ui.ActionBar.d2 d2Var) {
        ze.c g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.g0);
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new kh.a0(zVar, g10, d2Var, 7));
    }

    public final void V() {
        if (this.f0 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        xVar.setSelected(this.e0);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.f0 = yVar;
        org.telegram.ui.n61[] n61VarArr = {yVar};
        yVar.showAsDropDown(this.V, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        n61VarArr[0].b();
    }

    public final void W() {
        this.d0.setEnabled(this.e0 != null && this.X.getText().length() > 0 && this.Y.getText().length() > 0);
    }

    public final void X() {
        Long l10 = this.e0;
        p9 p9Var = this.W;
        if (l10 == null) {
            p9Var.setImageResource(R.drawable.menu_smile_add);
            p9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            p9Var.setAnimatedEmojiDrawable(new l5(4, this.currentAccount, this.e0.longValue()));
            p9Var.setColorFilter(null);
            p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.b0.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(rl0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.j0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(this.g0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
