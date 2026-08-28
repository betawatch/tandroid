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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y extends sa {
    public final FrameLayout T;
    public final FrameLayout U;
    public final o9 V;
    public final org.telegram.ui.Cells.j3 W;
    public final org.telegram.ui.Cells.j3 X;
    public final FrameLayout Y;
    public final dp Z;
    public final FrameLayout a0;
    public final FrameLayout b0;
    public final kh.d c0;
    public Long d0;
    public x e0;
    public TL_aicompose.TL_aiComposeTone f0;
    public e g0;
    public e h0;
    public z41 i0;

    public y(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, false, false, 2, b6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        imageView.setColorFilter(getThemedColor(i9));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, getThemedColor(i9)), 1, -1));
        this.e.addView(imageView, g7.e6.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        g7.g6.b(imageView, 0.1f, 1.5f);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
            public final /* synthetic */ y b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        this.b.U();
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
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var)));
        g7.g6.a(frameLayout2);
        frameLayout.addView(frameLayout2, g7.e6.e(100, 100, 17));
        o9 o9Var = new o9(context);
        this.V = o9Var;
        W();
        frameLayout2.addView(o9Var, g7.e6.e(64, 64, 17));
        final int i11 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
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
                        this.b.U();
                        break;
                    default:
                        this.b.Z.a(!r3.a.q, true);
                        break;
                }
            }
        });
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStyleTitleHint), false, false, MessagesController.getInstance(this.currentAccount).config.aicomposeToneTitleLengthMax.get(), b6Var);
        this.W = j3Var;
        j3Var.b.addTextChangedListener(new u(this, 0));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AIEditorStylePromptHint), true, false, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get(), b6Var);
        this.X = j3Var2;
        j3Var2.setShowLimitWhenNear(Math.max(100, MessagesController.getInstance(this.currentAccount).config.aicomposeTonePromptLengthMax.get() / 2));
        j3Var2.b.addTextChangedListener(new u(this, 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var), 24, 24));
        dp dpVar = new dp(context, 24, b6Var);
        this.Z = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.h7, org.telegram.ui.ActionBar.f6.j7, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(false, false);
        dpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(dpVar, g7.e6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.q5, b6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.AIEditorStyleAddLink));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 16, 9, 0, 0, 0));
        final int i12 = 2;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.r
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
                        this.b.U();
                        break;
                    default:
                        this.b.Z.a(!r3.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y = frameLayout3;
        frameLayout3.addView(linearLayout, g7.e6.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i13 = org.telegram.ui.ActionBar.f6.a7;
        this.behindKeyboardColorKey = i13;
        setBackgroundColor(getThemedColor(i13));
        wk0 wk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new bg.b1(10, this, b6Var));
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        this.v = 0.35f;
        this.smoothKeyboardAnimationEnabled = true;
        this.K = true;
        v vVar = new v(this);
        vVar.m = false;
        vVar.C = false;
        vVar.o(gr.h);
        vVar.n(350L);
        this.d.setItemAnimator(vVar);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.a0 = frameLayout4;
        frameLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, getThemedColor(i13)), getThemedColor(i13), getThemedColor(i13)}));
        FrameLayout.LayoutParams e10 = g7.e6.e(-1, -2, 80);
        int i15 = e10.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        e10.leftMargin = i15 + i16;
        e10.rightMargin += i16;
        this.containerView.addView(frameLayout4, e10);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.b0 = frameLayout5;
        FrameLayout.LayoutParams d = g7.e6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i17 = d.leftMargin;
        int i18 = this.backgroundPaddingLeft;
        d.leftMargin = i17 + i18;
        d.rightMargin += i18;
        this.containerView.addView(frameLayout5, d);
        kh.d i19 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        this.c0 = i19;
        i19.setText(LocaleController.getString(R.string.AIEditorStyleCreate));
        i19.setOnClickListener(new mh.k3(26, this, b6Var));
        frameLayout4.addView(i19, g7.e6.e(-1, 48, 119));
        V();
        this.i0.N(false);
    }

    public static void O(y yVar, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var) {
        dVar.c(false);
        c2Var.dismiss();
        yVar.dismiss();
        MessagesController.getInstance(yVar.currentAccount).getTonesController().remove(yVar.f0);
    }

    public static void P(final y yVar, final org.telegram.ui.ActionBar.b6 b6Var) {
        org.telegram.ui.Cells.j3 j3Var = yVar.X;
        org.telegram.ui.Cells.j3 j3Var2 = yVar.W;
        dp dpVar = yVar.Z;
        kh.d dVar = yVar.c0;
        if (dVar.J) {
            return;
        }
        if (!dVar.S) {
            if (yVar.d0 == null) {
                yVar.U();
                return;
            }
            return;
        }
        dVar.setLoading(true);
        if (yVar.f0 == null) {
            TL_aicompose.createTone createtone = new TL_aicompose.createTone();
            createtone.display_author = dpVar.a.q;
            createtone.emoji_id = yVar.d0.longValue();
            createtone.title = j3Var2.getText().toString();
            createtone.prompt = j3Var.getText().toString();
            final int i9 = 1;
            ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(createtone, new org.telegram.messenger.a(), new Utilities.Callback2(yVar) { // from class: org.telegram.ui.Components.t
                public final /* synthetic */ y b;

                {
                    this.b = yVar;
                }

                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    switch (i9) {
                        case 0:
                            y yVar2 = this.b;
                            yVar2.c0.setLoading(false);
                            if (aiComposeTone == null) {
                                if (tL_error != null) {
                                    org.telegram.ui.Cells.j2.s(yVar2.b0, b6Var, tL_error, false);
                                    break;
                                }
                            } else {
                                e eVar = yVar2.h0;
                                if (eVar != null) {
                                    eVar.run(aiComposeTone);
                                }
                                yVar2.dismiss();
                                break;
                            }
                            break;
                        default:
                            y.Q(this.b, b6Var, aiComposeTone, tL_error);
                            break;
                    }
                }
            });
            return;
        }
        TL_aicompose.updateTone updatetone = new TL_aicompose.updateTone();
        updatetone.flags = 1 | updatetone.flags;
        updatetone.display_author = dpVar.a.q;
        updatetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f0);
        updatetone.flags |= 2;
        updatetone.emoji_id = yVar.d0.longValue();
        updatetone.flags |= 4;
        updatetone.title = j3Var2.getText().toString();
        updatetone.flags |= 8;
        updatetone.prompt = j3Var.getText().toString();
        final int i10 = 0;
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(updatetone, new org.telegram.messenger.a(), new Utilities.Callback2(yVar) { // from class: org.telegram.ui.Components.t
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
                        yVar2.c0.setLoading(false);
                        if (aiComposeTone == null) {
                            if (tL_error != null) {
                                org.telegram.ui.Cells.j2.s(yVar2.b0, b6Var, tL_error, false);
                                break;
                            }
                        } else {
                            e eVar = yVar2.h0;
                            if (eVar != null) {
                                eVar.run(aiComposeTone);
                            }
                            yVar2.dismiss();
                            break;
                        }
                        break;
                    default:
                        y.Q(this.b, b6Var, aiComposeTone, tL_error);
                        break;
                }
            }
        });
    }

    public static void Q(y yVar, org.telegram.ui.ActionBar.b6 b6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = yVar.b0;
        yVar.c0.setLoading(false);
        if (aiComposeTone != null) {
            yVar.dismiss();
            e eVar = yVar.g0;
            if (eVar != null) {
                eVar.run(aiComposeTone);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                org.telegram.ui.Cells.j2.s(frameLayout, b6Var, tL_error, false);
            } else {
                e0.n0(yVar.currentAccount, new oc(frameLayout, b6Var));
            }
        }
    }

    public static void R(y yVar, org.telegram.ui.ActionBar.c2 c2Var) {
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
        deletetone.tone = TL_aicompose.InputAiComposeTone.from(yVar.f0);
        ConnectionsManager.getInstance(yVar.currentAccount).sendRequestTyped(deletetone, new org.telegram.messenger.a(), new fh.f0(yVar, g10, c2Var, 7));
    }

    public final void U() {
        if (this.e0 != null) {
            return;
        }
        w wVar = new w(this, getContext(), Integer.valueOf(AndroidUtilities.dp(150.0f)), this.resourcesProvider, r6);
        wVar.setSelected(this.d0);
        wVar.setSaveState(1);
        x xVar = new x(this, wVar);
        this.e0 = xVar;
        org.telegram.ui.s51[] s51VarArr = {xVar};
        xVar.showAsDropDown(this.U, AndroidUtilities.dp(150.0f), -AndroidUtilities.dp(390.0f), 80);
        s51VarArr[0].b();
    }

    public final void V() {
        this.c0.setEnabled(this.d0 != null && this.W.getText().length() > 0 && this.X.getText().length() > 0);
    }

    public final void W() {
        Long l10 = this.d0;
        o9 o9Var = this.V;
        if (l10 == null) {
            o9Var.setImageResource(R.drawable.menu_smile_add);
            o9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        } else {
            o9Var.setAnimatedEmojiDrawable(new k5(4, this.currentAccount, this.d0.longValue()));
            o9Var.setColorFilter(null);
            o9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onSmoothContainerViewLayout(float f10) {
        super.onSmoothContainerViewLayout(f10);
        this.a0.setTranslationY(f10);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new d(this, 2), this.resourcesProvider);
        this.i0 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(this.f0 != null ? R.string.AIEditorEditStyle : R.string.AIEditorNewStyle);
    }
}
