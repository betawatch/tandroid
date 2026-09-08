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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final TextView c0;
    public final FrameLayout d0;
    public final di.d e0;
    public v51 f0;
    public int g0;
    public final TL_aicompose.aiComposeToneExample[] h0;

    public r(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, 2, f6Var);
        this.g0 = 0;
        AiTonesController tonesController = MessagesController.getInstance(this.currentAccount).getTonesController();
        this.Y = tonesController;
        tonesController.load();
        this.X = aiComposeTone;
        TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = new TL_aicompose.aiComposeToneExample[MessagesController.getInstance(this.currentAccount).config.aicomposeToneExamplesNum.get()];
        this.h0 = aicomposetoneexampleArr;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            aicomposetoneexampleArr[0] = ((TL_aicompose.TL_aiComposeTone) aiComposeTone).example_english;
        }
        ImageView imageView = new ImageView(context);
        this.Z = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.containerView.addView(imageView, w7.x5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new o(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var)));
        frameLayout.addView(frameLayout2, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        x9 x9Var = new x9(context);
        x9Var.setAnimatedEmojiDrawable(new q5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(x9Var, w7.x5.e(64, 64, 17));
        TextView textView = new TextView(context);
        this.b0 = textView;
        textView.setTextColor(getThemedColor(i10));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(aiComposeTone.title);
        TextView textView2 = new TextView(context);
        this.c0 = textView2;
        textView2.setTextColor(getThemedColor(i10));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.AIEditorStyleText));
        this.e.setTitle(aiComposeTone.title);
        int i11 = org.telegram.ui.ActionBar.j6.a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        ll0 ll0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.o1();
        this.d.setOnItemClickListener(new k(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        q qVar = new q(this);
        qVar.m = false;
        qVar.C = false;
        qVar.o(pr.h);
        qVar.n(350L);
        this.d.setItemAnimator(qVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e7 = w7.x5.e(-1, -2, 80);
        int i13 = e7.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e7.leftMargin = i13 + i14;
        e7.rightMargin += i14;
        this.containerView.addView(frameLayout3, e7);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout4, d);
        di.d g10 = org.telegram.messenger.wl.g(24, context, f6Var, true);
        this.e0 = g10;
        g10.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        g10.setOnClickListener(new bi.x(this, aiComposeTone, f6Var, 11));
        frameLayout3.addView(g10, w7.x5.e(-1, 48, 119));
        this.f0.N(false);
    }

    public static void P(r rVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.f6 f6Var) {
        di.d dVar = rVar.e0;
        if (!dVar.W || dVar.N) {
            return;
        }
        if (rVar.U()) {
            rVar.dismiss();
            return;
        }
        dVar.setLoading(true);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        ConnectionsManager.getInstance(rVar.currentAccount).sendRequestTyped(savetone, new org.telegram.messenger.a(), new org.telegram.tgnet.e(rVar, f6Var, aiComposeTone, 2));
    }

    public static void Q(final r rVar) {
        TL_aicompose.AiComposeTone aiComposeTone = rVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            int i10 = rVar.g0 + 1;
            rVar.g0 = i10;
            TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = rVar.h0;
            if (i10 >= aicomposetoneexampleArr.length) {
                rVar.g0 = 0;
            }
            final int i11 = rVar.g0;
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
                            rVar2.h0[i11] = aicomposetoneexample;
                            rVar2.f0.N(true);
                        }
                    }
                });
            }
            rVar.f0.N(true);
        }
    }

    public static void R(r rVar, ArrayList arrayList, v51 v51Var) {
        String str;
        v51Var.E = 1;
        arrayList.add(h51.B(null));
        FrameLayout frameLayout = rVar.a0;
        h51 h51Var = new h51(-4);
        h51Var.c = frameLayout;
        h51Var.z = -1;
        h51Var.e = true;
        arrayList.add(h51Var);
        arrayList.add(h51.B(null));
        arrayList.add(h51.l(rVar.b0));
        arrayList.add(h51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(h51.l(rVar.c0));
        arrayList.add(h51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = rVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = rVar.h0[rVar.g0];
            v51Var.U();
            arrayList.add(z31.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new o(rVar, 1)));
            arrayList.add(d41.a(4, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, null, null, null));
            arrayList.add(z31.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            arrayList.add(d41.a(6, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, null, null, null));
            v51Var.T();
            TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(h51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(TextUtils.isEmpty(publicUsername) ? LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user)) : LocaleController.formatString(R.string.AIEditorCreatedBy, org.telegram.ui.Cells.p6.i("@", publicUsername)));
                arrayList.add(h51.B(AndroidUtilities.replaceSingleLink(sb2.toString(), rVar.getThemedColor(org.telegram.ui.ActionBar.j6.gc), new org.telegram.ui.fh(26, rVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(h51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(r rVar, org.telegram.ui.ActionBar.f6 f6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = rVar.d0;
        rVar.e0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                f0.o0(rVar.currentAccount, new yc(frameLayout, f6Var));
                return;
            } else {
                org.telegram.ui.Cells.p6.q(frameLayout, f6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(rVar.currentAccount).getTonesController().add(aiComposeTone);
        rVar.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            yc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
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
            i90 i90Var = new i90(null, dp, 0, null);
            i90Var.f = AndroidUtilities.dp(6.0f);
            i90Var.h = 0.5f;
            i90Var.n = true;
            spannableStringBuilder.setSpan(i90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.bb
    public final void B(float f7) {
        xa xaVar = this.e;
        org.telegram.ui.ActionBar.j5 titleTextView = xaVar.getTitleTextView();
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
            this.e0.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.loadedAiComposeTones);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        v51 v51Var = new v51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }
}
