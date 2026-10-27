package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w extends bb {
    public final int X;
    public final Utilities.Callback Y;
    public k71 Z;
    public final FrameLayout a0;
    public final FrameLayout b0;
    public final RichMessageLayout.PreviewView c0;
    public final FrameLayout d0;
    public final org.telegram.ui.Cells.g3 e0;
    public final fi.d f0;
    public boolean g0;
    public int h0;
    public TL_iv.RichMessage i0;

    public w(int i10, Context context, Utilities.Callback callback, u6 u6Var) {
        super(context, null, true, false, u6Var);
        this.X = i10;
        this.Y = callback;
        int i11 = y6.a7;
        setBackgroundColorKey(i11);
        fixNavigationBarKey(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleAICreate));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i12 = y6.G6;
        f7.V(textView, i12, u6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, kb1.h(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.I = AndroidUtilities.dp(-8.0f);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f7.t(imageView, i12, u6Var, PorterDuff.Mode.SRC_IN);
        kb1.b(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: li.u
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        w wVar = this.b;
                        org.telegram.ui.Cells.g3 g3Var = wVar.e0;
                        if (!wVar.g0) {
                            TL_iv.RichMessage richMessage = wVar.i0;
                            if (richMessage == null) {
                                String trim = g3Var.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    wVar.g0 = true;
                                    wVar.f0.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    wVar.h0 = ConnectionsManager.getInstance(wVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new bi.i0(wVar, 21));
                                    AndroidUtilities.hideKeyboard(g3Var.d);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = wVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView, kb1.h(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.b0 = frameLayout2;
        RichMessageLayout.PreviewView previewView = new RichMessageLayout.PreviewView(context, i10, u6Var);
        this.c0 = previewView;
        previewView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        int i14 = y6.d6;
        ShapeDrawable c02 = y6.c0(dp, y6.w0(i14, u6Var));
        b7 N = f7.N(i14);
        previewView.setBackground(c02);
        f7.k(previewView, c02, N, null, u6Var);
        frameLayout2.addView(previewView, kb1.g(-2.0f, -1));
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d0 = frameLayout3;
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.ArticleAIPrompt), true, false, MessagesController.getInstance(i10).config.aicomposeTonePromptLengthMax.get(), u6Var);
        this.e0 = g3Var;
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setImeOptions(6);
        e3Var.setMaxLines(5);
        ShapeDrawable c03 = y6.c0(AndroidUtilities.dp(20.0f), y6.w0(i14, u6Var));
        b7 N2 = f7.N(i14);
        g3Var.setBackground(c03);
        f7.k(g3Var, c03, N2, null, u6Var);
        e3Var.addTextChangedListener(new v(this));
        frameLayout3.addView(g3Var, kb1.g(-2.0f, -1));
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        fi.d f7 = wh.f(24, context, u6Var, true);
        this.f0 = f7;
        f7.i(LocaleController.getString(R.string.ArticleAIGenerate), false, true);
        final int i15 = 1;
        f7.setOnClickListener(new View.OnClickListener(this) { // from class: li.u
            public final /* synthetic */ w b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        w wVar = this.b;
                        org.telegram.ui.Cells.g3 g3Var2 = wVar.e0;
                        if (!wVar.g0) {
                            TL_iv.RichMessage richMessage = wVar.i0;
                            if (richMessage == null) {
                                String trim = g3Var2.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    wVar.g0 = true;
                                    wVar.f0.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    wVar.h0 = ConnectionsManager.getInstance(wVar.X).sendRequest(tL_messages_composeRichMessageWithAI, new bi.i0(wVar, 21));
                                    AndroidUtilities.hideKeyboard(g3Var2.d);
                                    break;
                                }
                            } else {
                                Utilities.Callback callback2 = wVar.Y;
                                if (callback2 != null) {
                                    callback2.run(richMessage);
                                }
                                wVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.containerView.addView(f7, kb1.h(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).leftMargin += this.backgroundPaddingLeft;
        ((ViewGroup.MarginLayoutParams) f7.getLayoutParams()).rightMargin += this.backgroundPaddingLeft;
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(ds.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        nm0 nm0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(72.0f));
        this.d.setClipToPadding(false);
        this.Z.O(false);
        P();
    }

    public final void P() {
        TL_iv.RichMessage richMessage = this.i0;
        fi.d dVar = this.f0;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.e0.d.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        if (this.h0 != 0) {
            ConnectionsManager.getInstance(this.X).cancelRequest(this.h0, true);
            this.h0 = 0;
        }
        AndroidUtilities.hideKeyboard(this.e0.d);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new k2.c(this, 4), 200L);
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.X, 0, true, new hi.e2(this, 17), this.resourcesProvider);
        this.Z = k71Var;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.ArticleAICreate);
    }
}
