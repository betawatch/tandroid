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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q extends za implements NotificationCenter.NotificationCenterDelegate {
    public final TL_aicompose.AiComposeTone X;
    public final AiTonesController Y;
    public final ImageView Z;
    public final FrameLayout a0;
    public final TextView b0;
    public final TextView c0;
    public final FrameLayout d0;
    public final ci.d e0;
    public w51 f0;
    public int g0;
    public final TL_aicompose.aiComposeToneExample[] h0;

    public q(Context context, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, 2, e6Var);
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
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        imageView.setColorFilter(getThemedColor(i10));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, getThemedColor(i10)), 1, -1));
        this.containerView.addView(imageView, w7.x5.d(54, 54.0f, 53, 0.0f, 0.0f, 8.0f, 0.0f));
        w7.z5.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new n(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        this.a0 = frameLayout;
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(100.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, e6Var)));
        frameLayout.addView(frameLayout2, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        u9 u9Var = new u9(context);
        u9Var.setAnimatedEmojiDrawable(new o5(4, this.currentAccount, aiComposeTone.emoji_id));
        frameLayout2.addView(u9Var, w7.x5.e(64, 64, 17));
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
        int i11 = org.telegram.ui.ActionBar.i6.a7;
        this.behindKeyboardColorKey = i11;
        setBackgroundColor(getThemedColor(i11));
        ll0 ll0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(66.0f));
        this.d.setClipToPadding(false);
        this.d.p1();
        this.d.setOnItemClickListener(new j(this, 1));
        this.L = false;
        this.K = AndroidUtilities.dp(36.0f);
        this.v = 0.35f;
        this.O = true;
        p pVar = new p(this);
        pVar.m = false;
        pVar.C = false;
        pVar.o(qr.h);
        pVar.n(350L);
        this.d.setItemAnimator(pVar);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        frameLayout3.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11), getThemedColor(i11)}));
        FrameLayout.LayoutParams e = w7.x5.e(-1, -2, 80);
        int i13 = e.leftMargin;
        int i14 = this.backgroundPaddingLeft;
        e.leftMargin = i13 + i14;
        e.rightMargin += i14;
        this.containerView.addView(frameLayout3, e);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.d0 = frameLayout4;
        FrameLayout.LayoutParams d = w7.x5.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i15 = d.leftMargin;
        int i16 = this.backgroundPaddingLeft;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.containerView.addView(frameLayout4, d);
        ci.d g10 = org.telegram.messenger.vl.g(24, context, e6Var, true);
        this.e0 = g10;
        g10.setText(LocaleController.getString(U() ? R.string.AIEditorStyleDone : R.string.AIEditorAddStyle));
        g10.setOnClickListener(new ai.d0(this, aiComposeTone, e6Var, 11));
        frameLayout3.addView(g10, w7.x5.e(-1, 48, 119));
        this.f0.N(false);
    }

    public static void P(q qVar, TL_aicompose.AiComposeTone aiComposeTone, org.telegram.ui.ActionBar.e6 e6Var) {
        ci.d dVar = qVar.e0;
        if (!dVar.W || dVar.N) {
            return;
        }
        if (qVar.U()) {
            qVar.dismiss();
            return;
        }
        dVar.setLoading(true);
        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(savetone, new org.telegram.messenger.a(), new org.telegram.tgnet.e(qVar, e6Var, aiComposeTone, 2));
    }

    public static void Q(final q qVar) {
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            int i10 = qVar.g0 + 1;
            qVar.g0 = i10;
            TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = qVar.h0;
            if (i10 >= aicomposetoneexampleArr.length) {
                qVar.g0 = 0;
            }
            final int i11 = qVar.g0;
            if (aicomposetoneexampleArr[i11] == null) {
                TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                gettoneexample.num = i11;
                ConnectionsManager.getInstance(qVar.currentAccount).sendRequestTyped(gettoneexample, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.Components.o
                    @Override // org.telegram.messenger.Utilities.Callback2
                    public final void run(Object obj, Object obj2) {
                        TL_aicompose.aiComposeToneExample aicomposetoneexample = (TL_aicompose.aiComposeToneExample) obj;
                        q qVar2 = q.this;
                        if (aicomposetoneexample == null) {
                            qVar2.getClass();
                        } else {
                            qVar2.h0[i11] = aicomposetoneexample;
                            qVar2.f0.N(true);
                        }
                    }
                });
            }
            qVar.f0.N(true);
        }
    }

    public static void R(q qVar, ArrayList arrayList, w51 w51Var) {
        String str;
        w51Var.E = 1;
        arrayList.add(i51.B(null));
        FrameLayout frameLayout = qVar.a0;
        i51 i51Var = new i51(-4);
        i51Var.c = frameLayout;
        i51Var.z = -1;
        i51Var.e = true;
        arrayList.add(i51Var);
        arrayList.add(i51.B(null));
        arrayList.add(i51.l(qVar.b0));
        arrayList.add(i51.C(AndroidUtilities.dp(1.0f)));
        arrayList.add(i51.l(qVar.c0));
        arrayList.add(i51.C(AndroidUtilities.dp(24.0f)));
        TL_aicompose.AiComposeTone aiComposeTone = qVar.X;
        if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
            TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
            TL_aicompose.aiComposeToneExample aicomposetoneexample = qVar.h0[qVar.g0];
            w51Var.U();
            arrayList.add(a41.a(3, LocaleController.getString(R.string.AIEditorBefore), null, null, null, false, null, new n(qVar, 1)));
            arrayList.add(e41.a(4, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.from), false, null, null, null));
            arrayList.add(a41.b(5, LocaleController.getString(R.string.AIEditorAfter), null, null, null));
            arrayList.add(e41.a(6, aicomposetoneexample == null ? V() : MessageObject.formatTextWithEntities(aicomposetoneexample.to), false, null, null, null));
            w51Var.T();
            TLRPC.User user = tL_aiComposeTone.author_id != 0 ? MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(tL_aiComposeTone.author_id)) : null;
            String publicUsername = UserObject.getPublicUsername(user);
            if (user == null) {
                int i10 = tL_aiComposeTone.installs_count;
                if (i10 > 0) {
                    arrayList.add(i51.B(LocaleController.formatPluralString("AIEditorUsedBy", i10, new Object[0])));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (tL_aiComposeTone.installs_count > 0) {
                    str = LocaleController.formatPluralString("AIEditorUsedBy", tL_aiComposeTone.installs_count, new Object[0]) + " ";
                } else {
                    str = "";
                }
                sb2.append(str);
                sb2.append(TextUtils.isEmpty(publicUsername) ? LocaleController.formatString(R.string.AIEditorCreatedBy, UserObject.getUserName(user)) : LocaleController.formatString(R.string.AIEditorCreatedBy, org.telegram.ui.Cells.q3.i("@", publicUsername)));
                arrayList.add(i51.B(AndroidUtilities.replaceSingleLink(sb2.toString(), qVar.getThemedColor(org.telegram.ui.ActionBar.i6.gc), new org.telegram.ui.uh(20, qVar, tL_aiComposeTone))));
            }
        }
        arrayList.add(i51.C(AndroidUtilities.dp(32.0f)));
    }

    public static void S(q qVar, org.telegram.ui.ActionBar.e6 e6Var, TL_aicompose.AiComposeTone aiComposeTone, TLRPC.TL_error tL_error) {
        FrameLayout frameLayout = qVar.d0;
        qVar.e0.setLoading(false);
        if (tL_error != null) {
            if ("TONES_SAVED_TOO_MANY".equalsIgnoreCase(tL_error.text)) {
                e0.o0(qVar.currentAccount, new vc(frameLayout, e6Var));
                return;
            } else {
                org.telegram.ui.Cells.q3.r(frameLayout, e6Var, tL_error, false);
                return;
            }
        }
        MessagesController.getInstance(qVar.currentAccount).getTonesController().add(aiComposeTone);
        qVar.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            vc.a0(U).p(aiComposeTone.emoji_id, LocaleController.getString(R.string.AIEditorToneAddedTitle), LocaleController.formatString(R.string.AIEditorToneAddedText, aiComposeTone.title)).j();
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
            h90 h90Var = new h90(null, dp, 0, null);
            h90Var.f = AndroidUtilities.dp(6.0f);
            h90Var.h = 0.5f;
            h90Var.n = true;
            spannableStringBuilder.setSpan(h90Var, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    @Override // org.telegram.ui.Components.za
    public final void A(float f7) {
        va vaVar = this.e;
        org.telegram.ui.ActionBar.j5 titleTextView = vaVar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f7);
        }
        float translationY = vaVar.getTranslationY() + AndroidUtilities.statusBarHeight;
        int height = vaVar.getHeight() - AndroidUtilities.statusBarHeight;
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

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(ll0Var, getContext(), this.currentAccount, 0, true, new d(this, 1), this.resourcesProvider);
        this.f0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        TL_aicompose.AiComposeTone aiComposeTone = this.X;
        return aiComposeTone == null ? "" : aiComposeTone.title;
    }
}
