package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class r extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone U;
    public final AiTonesController V;
    public final ImageView W;
    public final FrameLayout X;
    public final TextView Y;
    public final TextView Z;
    public final FrameLayout a0;
    public final qh.d b0;
    public x51 c0;
    public int d0;
    public final TL_aicompose.aiComposeToneExample[] e0;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, false, false, 2, g6Var);
        this.d0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.V = tonesController;
        tonesController.load();
        this.U = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.e0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.W = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.containerView.addView(imageView, k7.c6.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        k7.e6.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var)));
        frameLayout.addView(frameLayout2, k7.c6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        p9 p9Var = new p9(context);
        p9Var.setAnimatedEmojiDrawable(new l5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(p9Var, k7.c6.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.Y = textView;
        textView.setTextColor(getThemedColor(i10));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.Z = textView2;
        textView2.setTextColor(getThemedColor(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i11 = org.telegram.ui.ActionBar.k6.a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        tl0 tl0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new k(this, 1));
        this.I = false;
        this.H = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.L = true;
        q qVar = new q(this);
        qVar.m = false;
        qVar.C = false;
        qVar.o(pr.h);
        qVar.n(350L);
        this.d.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e6 = k7.c6.e(-1, -2, 80);
        int i13 = e6.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e6.leftMargin = i13 + i14;
        e6.rightMargin += i14;
        this.containerView.addView(frameLayout3, e6);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.a0 = frameLayout4;
        FrameLayout.LayoutParams d = k7.c6.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout4, d);
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.b0 = p10;
        p10.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        p10.setOnClickListener(new eg.o(this, aiComposeTone, g6Var, 14));
        frameLayout3.addView(p10, k7.c6.e(-1, 48, 119));
        this.c0.N(false);
    }

    public static void P(r rVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.g6 g6Var) {
        qh.d dVar = rVar.b0;
        if (!dVar.T || dVar.K) {
            return;
        }
        if (rVar.U()) {
            rVar.dismiss();
            return;
        }
        dVar.setLoading(true);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(savetone, new org.telegram.messenger.a(), new lh.a0(rVar, g6Var, aiComposeTone, 6));
    }

    public static void Q(final r rVar) {
        TL_aicompose.AiComposeTone aiComposeTone = rVar.U;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            int i10 = rVar.d0 + 1;
            rVar.d0 = i10;
            TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.e0;
            if (i10 >= aicomposetoneexampleArr.length) {
                rVar.d0 = 0;
            }
            final int i11 = rVar.d0;
            if (aicomposetoneexampleArr[i11] == null) {
                TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                gettoneexample.num = i11;
                ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(gettoneexample, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.p
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                        r rVar2 = r.this;
                        if (aicomposetoneexample == null) {
                            rVar2.getClass();
                        } else {
                            rVar2.e0[i11] = aicomposetoneexample;
                            rVar2.c0.N(true);
                        }
                    }
                });
            }
            rVar.c0.N(true);
        }
    }

    public static void R(r rVar, ArrayList arrayList, x51 x51Var) {
        String str;
        x51Var.B = 1;
        arrayList.add(j51.B(null));
        FrameLayout frameLayout = rVar.X;
        j51 j51Var = new j51(-4);
        j51Var.c = frameLayout;
        j51Var.z = -1;
        j51Var.e = true;
        arrayList.add(j51Var);
        arrayList.add(j51.B(null));
        arrayList.add(j51.l(rVar.Y));
        arrayList.add(j51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(j51.l(rVar.Z));
        arrayList.add(j51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = rVar.U;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.e0[rVar.d0];
            x51Var.U();
            arrayList.add(b41.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new o(rVar, 1)));
            arrayList.add(f41.a(4, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, null, null, null));
            arrayList.add(b41.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            arrayList.add(f41.a(6, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, null, null, null));
            x51Var.T();
            TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(j51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(TextUtils.isEmpty(publicUsername) ? LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user)) : LocaleController.formatString(R.string.AIEditorCreatedBy, org.telegram.ui.yh.k("@", publicUsername)));
                arrayList.add(j51.B(AndroidUtilities.replaceSingleLink(sb.toString(), rVar.getThemedColor(org.telegram.ui.ActionBar.k6.gc), new org.telegram.ui.mp(7, rVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(j51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(r rVar, org.telegram.ui.ActionBar.g6 g6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = rVar.a0;
        rVar.b0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                f0.o0(rVar.currentAccount, new qc(frameLayout, g6Var));
                return;
            } else {
                org.telegram.ui.yh.u(frameLayout, g6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(rVar.currentAccount).getTonesController().add(aiComposeTone);
        rVar.dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            qc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
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
            l90 l90Var = new l90(null, dp, 0, null);
            l90Var.f = AndroidUtilities.dp(6.0f);
            l90Var.h = 0.5f;
            l90Var.n = true;
            spannableStringBuilder.setSpan(l90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.sa
    public final void B(float f10) {
        pa paVar = this.e;
        org.telegram.ui.ActionBar.l5 titleTextView = paVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
        float translationY = paVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = paVar.getHeight() - AndroidUtilities.statusBarHeight;
        this.W.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(28.0f)) + ((height - r2.getHeight()) / 2.0f) + translationY);
    }

    public final boolean U() {
        TL_aicompose.AiComposeTone aiComposeTone = this.U;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            int i10 = 0;
            while (true) {
                AiTonesController aiTonesController = this.V;
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
            this.b0.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.c0 = x51Var;
        x51Var.r = false;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        TL_aicompose.AiComposeTone aiComposeTone = this.U;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }
}
