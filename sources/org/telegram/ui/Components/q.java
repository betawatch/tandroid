package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final TextView c0;
    public final FrameLayout d0;
    public final FrameLayout e0;
    public final ei.d f0;
    public b71 g0;
    public int h0;
    public final TL_aicompose.aiComposeToneExample[] i0;
    public int j0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, 2, g6Var);
        this.h0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.i0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.Z = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.SRC_ATOP);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i10)), 1, -1);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.1f, i10);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, M, g6Var);
        this.containerView.addView(imageView, w7.z5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.b6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(100.0f);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, K, O, null, g6Var);
        frameLayout.addView(frameLayout2, w7.z5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        w9 w9Var = new w9(context);
        w9Var.setAnimatedEmojiDrawable(new r5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(w9Var, w7.z5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.b0 = textView;
        org.telegram.messenger.v0.q(textView, i10, g6Var, 1, 20.0f);
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.c0 = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i10, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        this.behindKeyboardColorKey = i12;
        setBackgroundColor(getThemedColor(i12));
        mm0 mm0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.t1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        p pVar = new p(this);
        pVar.m = false;
        pVar.C = false;
        pVar.o(bs.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i12)), getThemedColor(i12), getThemedColor(i12)}));
        FrameLayout.LayoutParams e = w7.z5.e(-1, -2, 80);
        int i14 = e.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        e.leftMargin = i14 + i15;
        e.rightMargin += i15;
        this.containerView.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.z5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i16 = d.leftMargin;
        int i17 = this.backgroundPaddingLeft;
        d.leftMargin = i16 + i17;
        d.rightMargin += i17;
        this.containerView.addView(frameLayout4, d);
        ei.d g10 = org.telegram.messenger.sl.g(24, context, g6Var, true);
        this.f0 = g10;
        g10.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        g10.setOnClickListener(new ai.v0(this, aiComposeTone, g6Var, 14));
        frameLayout3.addView(g10, w7.z5.e(-1, 48, 119));
        this.g0.N(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        ei.d dVar = qVar.f0;
        if (!dVar.c0 || dVar.Q) {
            return;
        }
        if (qVar.U()) {
            qVar.dismiss();
            return;
        }
        dVar.setLoading(true);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new org.telegram.messenger.a(), new ai.s0(qVar, g6Var, aiComposeTone, 4));
    }

    public static void Q(q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            int i10 = qVar.h0 + 1;
            qVar.h0 = i10;
            TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.i0;
            if (i10 >= aicomposetoneexampleArr.length) {
                qVar.h0 = 0;
            }
            int i11 = qVar.h0;
            if (aicomposetoneexampleArr[i11] == null) {
                TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                gettoneexample.num = i11;
                ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new org.telegram.messenger.a(), new o(qVar, i11, 0));
            }
            qVar.g0.N(true);
        }
    }

    public static void R(q qVar, ArrayList arrayList, b71 b71Var) {
        String str;
        b71Var.F = 1;
        arrayList.add(m61.B(null));
        FrameLayout frameLayout = qVar.a0;
        m61 m61Var = new m61(-4);
        m61Var.c = frameLayout;
        m61Var.z = -1;
        m61Var.e = true;
        arrayList.add(m61Var);
        arrayList.add(m61.B(null));
        arrayList.add(m61.l(qVar.b0));
        arrayList.add(m61.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(m61.l(qVar.c0));
        arrayList.add(m61.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.i0[qVar.h0];
            b71Var.U();
            arrayList.add(e51.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            arrayList.add(i51.a(4, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, null, null, null));
            arrayList.add(e51.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            arrayList.add(i51.a(6, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, null, null, null));
            b71Var.T();
            TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(m61.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(TextUtils.isEmpty(publicUsername) ? LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user)) : LocaleController.formatString(R.string.AIEditorCreatedBy, si.o0.h("@", publicUsername)));
                arrayList.add(m61.B(AndroidUtilities.replaceSingleLinkKey(sb2.toString(), org.telegram.ui.ActionBar.k6.gc, qVar.resourcesProvider, new org.telegram.ui.eh(23, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(m61.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.e0;
        qVar.f0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new xc(frameLayout, g6Var));
                return;
            } else {
                org.telegram.ui.Cells.b1.s(frameLayout, g6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            xc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
        }
    }

    public static SpannableStringBuilder V() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int dp = AndroidUtilities.dp((int) (Math.random() * 50.0d));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
            da0 da0Var = new da0(null, dp, 0, null);
            da0Var.f = AndroidUtilities.dp(6.0f);
            da0Var.h = 0.5f;
            da0Var.n = true;
            spannableStringBuilder.setSpan(da0Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.bb
    public final void B(float f7) {
        xa xaVar = this.e;
        org.telegram.ui.ActionBar.n5 titleTextView = xaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
        float translationY = xaVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = xaVar.getHeight() - AndroidUtilities.statusBarHeight;
        this.Z.setTranslationY(((1.0f - f7) * AndroidUtilities.dp(28.0f)) + ((height - r2.getHeight()) / 2.0f) + translationY);
    }

    public final boolean U() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                AiTonesController aiTonesController = this.Y;
                if (i10 >= aiTonesController.tones.size()) {
                    break;
                }
                TL_aicompose.AiComposeTone aiComposeTone2 = aiTonesController.tones.get(i10);
                if ((aiComposeTone2 instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) aiComposeTone2).id == tL_aiComposeTone.id) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.loadedAiComposeTones) {
            this.f0.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            if (themedColor != this.j0) {
                this.j0 = themedColor;
                setBackgroundColor(themedColor);
                this.d0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor}));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.g0 = b71Var;
        b71Var.r = false;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }
}
