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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class z extends bb {
    public final FrameLayout X;
    public final FrameLayout Y;
    public final x9 Z;
    public final org.telegram.ui.Cells.i3 a0;
    public final org.telegram.ui.Cells.i3 b0;
    public final FrameLayout c0;
    public final mp d0;
    public final FrameLayout e0;
    public final FrameLayout f0;
    public final di.d g0;
    public Long h0;
    public y i0;
    public TL_aicompose.TL_aiComposeTone j0;
    public e k0;
    public e l0;
    public v51 m0;

    public z(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, 2, f6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.e.addView(imageView, w7.x5.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
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
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.Y = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        w7.z5.a(frameLayout2);
        frameLayout.addView(frameLayout2, w7.x5.e(100, 100, 17));
        x9 x9Var = new x9(context);
        this.Z = x9Var;
        X();
        frameLayout2.addView(x9Var, w7.x5.e(64, 64, 17));
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
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), f6Var);
        this.a0 = i3Var;
        i3Var.b.addTextChangedListener(new v(this, 0));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), f6Var);
        this.b0 = i3Var2;
        i3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        i3Var2.b.addTextChangedListener(new v(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 24, 24));
        mp mpVar = new mp(context, 24, f6Var);
        this.d0 = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, w7.x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.q5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, w7.x5.t(-2, -2, 16, 9, 0, 0, 0));
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
                        this.b.d0.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.c0 = frameLayout3;
        frameLayout3.addView(linearLayout, w7.x5.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i14 = org.telegram.ui.ActionBar.j6.a7;
        this.behindKeyboardColorKey = i14;
        setBackgroundColor(getThemedColor(i14));
        ll0 ll0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new bi.x5(8, this, f6Var));
        this.L = false;
        this.K = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.O = true;
        w wVar = new w(this);
        wVar.m = false;
        wVar.C = false;
        wVar.o(pr.h);
        wVar.n(350L);
        this.d.setItemAnimator(wVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i14)), getThemedColor(i14), getThemedColor(i14)}));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 80);
        int i16 = e7.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        e7.leftMargin = i16 + i17;
        e7.rightMargin += i17;
        this.containerView.addView(frameLayout4, e7);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.f0 = frameLayout5;
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i18 = d.leftMargin;
        int i19 = this.backgroundPaddingLeft;
        d.leftMargin = i18 + i19;
        d.rightMargin += i19;
        this.containerView.addView(frameLayout5, d);
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.g0 = g10;
        g10.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        g10.setOnClickListener(new org.telegram.ui.rf(9, this, f6Var));
        frameLayout4.addView(g10, w7.x5.e(-1, 48, 119));
        W();
        this.m0.N(false);
    }

    public static void P(z zVar, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var) {
        eVar.c(false);
        b2Var.dismiss();
        zVar.dismiss();
        MessagesController.getInstance(zVar.currentAccount).getTonesController().remove(zVar.j0);
    }

    public static void Q(final z zVar, final org.telegram.ui.ActionBar.f6 f6Var) {
        org.telegram.ui.Cells.i3 i3Var = zVar.b0;
        org.telegram.ui.Cells.i3 i3Var2 = zVar.a0;
        mp mpVar = zVar.d0;
        di.d dVar = zVar.g0;
        if (dVar.N) {
            return;
        }
        if (!dVar.W) {
            if (zVar.h0 == null) {
                zVar.V();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (zVar.j0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = mpVar.a.q;
            createtone.emoji_id = zVar.h0.longValue();
            createtone.title = i3Var2.getText().toString();
            createtone.prompt = i3Var.getText().toString();
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
                            zVar2.g0.setLoading(false);
                            if (aiComposeTone == null) {
                                if (tL_error != null) {
                                    org.telegram.ui.Cells.p6.q(zVar2.f0, f6Var, tL_error, false);
                                    break;
                                }
                            } else {
                                e eVar = zVar2.l0;
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
        updatetone.display_author = mpVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.j0);
        updatetone.flags |= 2;
        updatetone.emoji_id = zVar.h0.longValue();
        updatetone.flags |= 4;
        updatetone.title = i3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = i3Var.getText().toString();
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
                        zVar2.g0.setLoading(false);
                        if (aiComposeTone == null) {
                            if (tL_error != null) {
                                org.telegram.ui.Cells.p6.q(zVar2.f0, f6Var, tL_error, false);
                                break;
                            }
                        } else {
                            e eVar = zVar2.l0;
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
        FrameLayout frameLayout = zVar.f0;
        zVar.g0.setLoading(false);
        if (aiComposeTone != null) {
            zVar.dismiss();
            e eVar = zVar.k0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                org.telegram.ui.Cells.p6.q(frameLayout, f6Var, tL_error, false);
            } else {
                f0.o0(zVar.currentAccount, new yc(frameLayout, f6Var));
            }
        }
    }

    public static void S(z zVar, org.telegram.ui.ActionBar.b2 b2Var) {
        of.e g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(zVar.j0);
        ConnectionsManager.getInstance(zVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new org.telegram.tgnet.e(zVar, g10, b2Var, 3));
    }

    public final void V() {
        if (this.i0 != null) {
            return;
        }
        x xVar = new x(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        xVar.setSelected(this.h0);
        xVar.setSaveState(1);
        y yVar = new y(this, xVar);
        this.i0 = yVar;
        org.telegram.ui.a71[] a71VarArr = {yVar};
        yVar.showAsDropDown(this.Y, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        a71VarArr[0].b();
    }

    public final void W() {
        this.g0.setEnabled(this.h0 != null && this.a0.getText().length() > 0 && this.b0.getText().length() > 0);
    }

    public final void X() {
        Long l4 = this.h0;
        x9 x9Var = this.Z;
        if (l4 == null) {
            x9Var.setImageResource(R.drawable.menu_smile_add);
            x9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            x9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, this.h0.longValue()));
            x9Var.setColorFilter(null);
            x9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f7) {
        super.onSmoothContainerViewLayout(f7);
        this.e0.setTranslationY(f7);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.m0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(this.j0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
