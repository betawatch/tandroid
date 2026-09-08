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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class hn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int a;
    public final org.telegram.ui.ActionBar.n2 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final bi.o0 d;
    public final hg.n0 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public bh.b v;
    public eh.e w;
    public final Paint x;
    public final long y;

    public hn0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.x = new Paint(1);
        this.a = i10;
        this.b = n2Var;
        this.c = f6Var;
        this.y = j3;
        ah.k1.o(f6Var);
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 20);
        this.d = o0Var;
        o0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        o0Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        o0Var.setLayoutManager(c0Var);
        hg.n0 n0Var = new hg.n0(this, 2);
        this.e = n0Var;
        o0Var.setAdapter(n0Var);
        o0Var.setOverScrollMode(2);
        addView(o0Var, w7.x5.c(-1.0f, -1));
        o0Var.setOnItemClickListener(new zm0(this, i10, n2Var, 0));
        o0Var.setOnItemLongClickListener(new org.telegram.ui.da(this, i10, n2Var, f6Var, 3));
        an0 an0Var = new an0();
        an0Var.o(pr.h);
        an0Var.n(320L);
        o0Var.setItemAnimator(an0Var);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof ov0) && ((ov0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        ?? e2Var = z10 ? new org.telegram.ui.ActionBar.e2(context, 0, f6Var) : new AlertDialog$Builder(context, 0, f6Var);
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        ah.j1 d = ah.j1.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new z5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = Emoji.replaceEmoji(d.f, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.a;
        b2Var.R = append;
        final bn0 bn0Var = new bn0(context, f6Var);
        bn0Var.setOnEditorActionListener(new cn0(bn0Var, i10, reaction, b2VarArr, currentFocus));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        bn0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        bn0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        bn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        bn0Var.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        bn0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        bn0Var.setSingleLine(true);
        bn0Var.setFocusable(true);
        bn0Var.setInputType(16384);
        bn0Var.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
        bn0Var.setImeOptions(6);
        bn0Var.setBackgroundDrawable(null);
        bn0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.wl.n(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f7.addView(textView, w7.x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(bn0Var, w7.x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(f7);
        b2Var.a = AndroidUtilities.dp(292.0f);
        e2Var.k(LocaleController.getString(R.string.Save), new hg.c2(bn0Var, i10, reaction, 8));
        e2Var.h(LocaleController.getString(R.string.Cancel), new p2(27));
        if (z10) {
            H = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new c1(currentFocus, 7));
            final int i12 = 0;
            H.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.ym0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            bn0 bn0Var2 = bn0Var;
                            bn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var2);
                            break;
                        default:
                            bn0 bn0Var3 = bn0Var;
                            bn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var3);
                            break;
                    }
                }
            });
            H.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new c1(bn0Var, 8));
            final int i13 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.ym0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            bn0 bn0Var2 = bn0Var;
                            bn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var2);
                            break;
                        default:
                            bn0 bn0Var3 = bn0Var;
                            bn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var3);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[0].h0 = false;
        bn0Var.setSelection(bn0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(bh.b bVar, eh.e eVar) {
        this.v = bVar;
        this.w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            dh.d c10 = bVar.c(linearLayout, null, false);
            c10.n(fh.b.o(this.c));
            c10.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.t(AndroidUtilities.dp(5.0f));
            c10.o(AndroidUtilities.dp(4.0f));
            linearLayout.setBackground(c10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.y) {
                h(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new bi.f(19));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout;
        if (view != this.d || (linearLayout = this.f) == null) {
            return super.drawChild(canvas, view, j3);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f.getAlpha()) * 255.0f), 31);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e(ah.j1 j1Var, boolean z10) {
        hg.n0 n0Var = this.e;
        if (j1Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            n0Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            en0 en0Var = (en0) arrayList.get(i10);
            long j3 = j1Var.h;
            ah.j1 j1Var2 = en0Var.a;
            long j10 = j1Var2.h;
            if (j3 == j10) {
                this.h = j10;
                if (z10) {
                    f(j1Var2);
                }
                n0Var.l();
                this.d.u0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(ah.j1 j1Var);

    public final void g(boolean z10) {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z10 ? 1.0f : 0.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new h70(this, 15));
        this.G.setInterpolator(pr.h);
        this.G.setDuration(320L);
        this.G.addListener(new org.telegram.ui.to(19, this, z10));
        this.G.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.E);
    }

    public void h(boolean z10) {
        boolean z11;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j3 = this.y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j3);
        if (savedReactionTags != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i11);
                ah.j1 d = ah.j1.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    String savedTagName = j3 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    en0 en0Var = new en0();
                    en0Var.a = d;
                    en0Var.b = i13;
                    en0Var.c = savedTagName;
                    en0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (en0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(en0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i11 = i12 + 1;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        hg.n0 n0Var = this.e;
        if (z10) {
            s4.o.c(new dn0(this), true).b(n0Var);
        } else {
            n0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        this.s = !isPremium;
        if (isPremium) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new cc0(this, 22)).start();
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
            linearLayout2.setOnClickListener(new x70(this, 13));
            this.f.setOrientation(0);
            w7.z5.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.s9 s9Var = new org.telegram.ui.s9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.j6.o6;
            org.telegram.ui.ActionBar.f6 f6Var = this.c;
            s9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            s9Var.setTextSize(1, 12.0f);
            s9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.j6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            nq nqVar = new nq(0, mutate);
            nqVar.setTranslateY(0.0f);
            nqVar.setTranslateX(0.0f);
            nqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(nqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            s9Var.setText(spannableStringBuilder);
            s9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            nq nqVar2 = new nq(0, mutate2);
            nqVar2.setScale(0.76f, 0.76f);
            nqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            nqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f.addView(s9Var, w7.x5.q(-2, -2, 16));
            this.f.addView(textView, w7.x5.q(-2, -2, 16));
            this.f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, w7.x5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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
        int i10 = this.a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f7) {
        this.E = f7;
        bi.o0 o0Var = this.d;
        o0Var.setPivotX(o0Var.getWidth() / 2.0f);
        o0Var.setPivotY(0.0f);
        o0Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        o0Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
