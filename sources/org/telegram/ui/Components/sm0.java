package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class sm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 D;
    public float A;
    public float B;
    public ValueAnimator C;
    public final int a;
    public final org.telegram.ui.ActionBar.o2 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final gh.f1 d;
    public final gh.t3 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public ig.a v;
    public lg.d w;
    public final Paint x;
    public final long y;

    public sm0(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.x = new Paint(1);
        this.a = i9;
        this.b = o2Var;
        this.c = b6Var;
        this.y = j10;
        hg.s0.o(b6Var);
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 20);
        this.d = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        f1Var.setClipToPadding(false);
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        f1Var.setLayoutManager(m0Var);
        gh.t3 t3Var = new gh.t3(this, 3);
        this.e = t3Var;
        f1Var.setAdapter(t3Var);
        f1Var.setOverScrollMode(2);
        addView(f1Var, g7.e6.c(-1.0f, -1));
        f1Var.setOnItemClickListener(new km0(this, i9, o2Var, 0));
        f1Var.setOnItemLongClickListener(new bg.d0(this, i9, o2Var, b6Var, 5));
        lm0 lm0Var = new lm0();
        lm0Var.o(gr.h);
        lm0Var.n(320L);
        f1Var.setItemAnimator(lm0Var);
        MediaDataController.getInstance(i9).loadSavedReactions(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i9, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b6 b6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof xu0) && ((xu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        ?? f2Var = z10 ? new org.telegram.ui.ActionBar.f2(context, 0, b6Var) : new AlertDialog$Builder(context, 0, b6Var);
        String savedTagName = MessagesController.getInstance(i9).getSavedTagName(reaction);
        hg.r0 d = hg.r0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new t5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = Emoji.replaceEmoji(d.f, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.N = append;
        final mm0 mm0Var = new mm0(context, b6Var);
        mm0Var.setOnEditorActionListener(new nm0(mm0Var, i9, reaction, c2VarArr, currentFocus));
        MediaDataController.getInstance(i9).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        mm0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        mm0Var.setText(savedTagName);
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        mm0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        mm0Var.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        mm0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        mm0Var.setSingleLine(true);
        mm0Var.setFocusable(true);
        mm0Var.setInputType(16384);
        mm0Var.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var));
        mm0Var.setImeOptions(6);
        mm0Var.setBackgroundDrawable(null);
        mm0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(i10, b6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f10.addView(textView, g7.e6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(mm0Var, g7.e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.n(f10);
        c2Var.a = AndroidUtilities.dp(292.0f);
        f2Var.k(LocaleController.getString(R.string.Save), new c3.e(mm0Var, i9, reaction, 7));
        f2Var.h(LocaleController.getString(R.string.Cancel), new if0(2));
        if (z10) {
            D = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new a1(currentFocus, 7));
            final int i11 = 0;
            D.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jm0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            mm0 mm0Var2 = mm0Var;
                            mm0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var2);
                            break;
                        default:
                            mm0 mm0Var3 = mm0Var;
                            mm0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var3);
                            break;
                    }
                }
            });
            D.q(250L);
        } else {
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new a1(mm0Var, 8));
            final int i12 = 1;
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.jm0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            mm0 mm0Var2 = mm0Var;
                            mm0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var2);
                            break;
                        default:
                            mm0 mm0Var3 = mm0Var;
                            mm0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var3);
                            break;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[0].d0 = false;
        mm0Var.setSelection(mm0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(ig.a aVar, lg.d dVar) {
        this.v = aVar;
        this.w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            kg.d c10 = aVar.c(linearLayout, null, false);
            c10.n(mg.c.n(this.c));
            c10.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.t(AndroidUtilities.dp(5.0f));
            c10.o(AndroidUtilities.dp(4.0f));
            linearLayout.setBackground(c10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.y) {
                h(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new ih.e(18));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view != this.d || (linearLayout = this.f) == null) {
            return super.drawChild(canvas, view, j10);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f.getAlpha()) * 255.0f), 31);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e(hg.r0 r0Var, boolean z10) {
        gh.t3 t3Var = this.e;
        if (r0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            t3Var.l();
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i9 >= arrayList.size()) {
                return;
            }
            pm0 pm0Var = (pm0) arrayList.get(i9);
            long j10 = r0Var.h;
            hg.r0 r0Var2 = pm0Var.a;
            long j11 = r0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z10) {
                    f(r0Var2);
                }
                t3Var.l();
                this.d.u0(i9);
                return;
            }
            i9++;
        }
    }

    public abstract boolean f(hg.r0 r0Var);

    public final void g(boolean z10) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            this.C = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, z10 ? 1.0f : 0.0f);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 15));
        this.C.setInterpolator(gr.h);
        this.C.setDuration(320L);
        this.C.addListener(new u9(18, this, z10));
        this.C.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.A);
    }

    public void h(boolean z10) {
        boolean z11;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i9 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i9);
        long j10 = this.y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i10 = 0;
            z11 = false;
            while (i10 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i10);
                hg.r0 d = hg.r0.d(tL_savedReactionTag.reaction);
                int i11 = i10;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i12 = tL_savedReactionTag.count;
                    String savedTagName = j10 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    pm0 pm0Var = new pm0();
                    pm0Var.a = d;
                    pm0Var.b = i12;
                    pm0Var.c = savedTagName;
                    pm0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (pm0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(pm0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i10 = i11 + 1;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        gh.t3 t3Var = this.e;
        if (z10) {
            f2.s.c(new om0(this), true).b(t3Var);
        } else {
            t3Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i9).isPremium();
        this.s = !isPremium;
        if (isPremium) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new ib0(this, 22)).start();
                    return;
                } else {
                    linearLayout.setAlpha(1.0f);
                    this.f.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (this.f == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f = linearLayout2;
            linearLayout2.setOnClickListener(new h70(this, 13));
            this.f.setOrientation(0);
            g7.g6.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.q9 q9Var = new org.telegram.ui.q9(this, getContext());
            int i13 = org.telegram.ui.ActionBar.f6.o6;
            org.telegram.ui.ActionBar.b6 b6Var = this.c;
            q9Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
            q9Var.setTextSize(1, 12.0f);
            q9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i14 = org.telegram.ui.ActionBar.f6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i14, mode));
            eq eqVar = new eq(0, mutate);
            eqVar.setTranslateY(0.0f);
            eqVar.setTranslateX(0.0f);
            eqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(eqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            q9Var.setText(spannableStringBuilder);
            q9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i14, mode));
            eq eqVar2 = new eq(0, mutate2);
            eqVar2.setScale(0.76f, 0.76f);
            eqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            eqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f.addView(q9Var, g7.e6.q(-2, -2, 16));
            this.f.addView(textView, g7.e6.q(-2, -2, 16));
            this.f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, g7.e6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z10) {
            return;
        }
        this.f.setVisibility(0);
        this.f.setAlpha(0.0f);
        this.f.animate().alpha(1.0f).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.a;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f10) {
        this.A = f10;
        gh.f1 f1Var = this.d;
        f1Var.setPivotX(f1Var.getWidth() / 2.0f);
        f1Var.setPivotY(0.0f);
        f1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        f1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
