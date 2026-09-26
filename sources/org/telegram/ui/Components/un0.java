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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class un0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int a;
    public final org.telegram.ui.ActionBar.m2 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public final ai.w0 d;
    public final gg.n0 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public ah.c v;
    public dh.e w;
    public final Paint x;
    public final long y;

    public un0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.x = new Paint(1);
        this.a = i10;
        this.b = m2Var;
        this.c = d6Var;
        this.y = j3;
        zg.p0.o(d6Var);
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 20);
        this.d = w0Var;
        w0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        w0Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        w0Var.setLayoutManager(c0Var);
        gg.n0 n0Var = new gg.n0(this, 2);
        this.e = n0Var;
        w0Var.setAdapter(n0Var);
        w0Var.setOverScrollMode(2);
        addView(w0Var, w7.y5.c(-1.0f, -1));
        w0Var.setOnItemClickListener(new mn0(this, i10, m2Var, 0));
        w0Var.setOnItemLongClickListener(new org.telegram.ui.da(this, i10, m2Var, d6Var, 3));
        nn0 nn0Var = new nn0();
        nn0Var.o(rr.h);
        nn0Var.n(320L);
        w0Var.setItemAnimator(nn0Var);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d6 d6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof aw0) && ((aw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        ?? d2Var = z10 ? new org.telegram.ui.ActionBar.d2(context, 0, d6Var) : new AlertDialog$Builder(context, 0, d6Var);
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        zg.o0 d = zg.o0.d(reaction);
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
        org.telegram.ui.ActionBar.a2 a2Var = d2Var.a;
        a2Var.R = append;
        final on0 on0Var = new on0(context, d6Var);
        on0Var.setOnEditorActionListener(new pn0(on0Var, i10, reaction, a2VarArr, currentFocus));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        on0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        on0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.h6.j5;
        on0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        on0Var.setHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xh, d6Var));
        on0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        on0Var.setSingleLine(true);
        on0Var.setFocusable(true);
        on0Var.setInputType(16384);
        on0Var.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7, d6Var));
        on0Var.setImeOptions(6);
        on0Var.setBackgroundDrawable(null);
        on0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.ok.n(i11, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f7.addView(textView, w7.y5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(on0Var, w7.y5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        d2Var.n(f7);
        a2Var.a = AndroidUtilities.dp(292.0f);
        d2Var.k(LocaleController.getString(R.string.Save), new gg.d2(on0Var, i10, reaction, 9));
        d2Var.h(LocaleController.getString(R.string.Cancel), new fa0(15));
        if (z10) {
            H = a2Var;
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new b1(currentFocus, 7));
            final int i12 = 0;
            H.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.ln0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            on0 on0Var2 = on0Var;
                            on0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(on0Var2);
                            break;
                        default:
                            on0 on0Var3 = on0Var;
                            on0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(on0Var3);
                            break;
                    }
                }
            });
            H.q(250L);
        } else {
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new b1(on0Var, 8));
            final int i13 = 1;
            a2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.ln0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            on0 on0Var2 = on0Var;
                            on0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(on0Var2);
                            break;
                        default:
                            on0 on0Var3 = on0Var;
                            on0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(on0Var3);
                            break;
                    }
                }
            });
            a2VarArr[0].show();
        }
        a2VarArr[0].h0 = false;
        on0Var.setSelection(on0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(ah.c cVar, dh.e eVar) {
        this.v = cVar;
        this.w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            ch.d c10 = cVar.c(linearLayout, null, false);
            c10.o(eh.b.o(this.c));
            c10.r(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.u(AndroidUtilities.dp(5.0f));
            c10.p(AndroidUtilities.dp(4.0f));
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
            AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new ai.i(5));
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

    public final void e(zg.o0 o0Var, boolean z10) {
        gg.n0 n0Var = this.e;
        if (o0Var == null) {
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
            rn0 rn0Var = (rn0) arrayList.get(i10);
            long j3 = o0Var.h;
            zg.o0 o0Var2 = rn0Var.a;
            long j10 = o0Var2.h;
            if (j3 == j10) {
                this.h = j10;
                if (z10) {
                    f(o0Var2);
                }
                n0Var.l();
                this.d.u0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(zg.o0 o0Var);

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
        ofFloat.addUpdateListener(new s70(this, 15));
        this.G.setInterpolator(rr.h);
        this.G.setDuration(320L);
        this.G.addListener(new ca(18, this, z10));
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
                zg.o0 d = zg.o0.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    String savedTagName = j3 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    rn0 rn0Var = new rn0();
                    rn0Var.a = d;
                    rn0Var.b = i13;
                    rn0Var.c = savedTagName;
                    rn0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (rn0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(rn0Var);
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
        gg.n0 n0Var = this.e;
        if (z10) {
            s4.o.c(new qn0(this), true).b(n0Var);
        } else {
            n0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        this.s = !isPremium;
        if (isPremium) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new ic0(this, 23)).start();
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
            linearLayout2.setOnClickListener(new i80(this, 13));
            this.f.setOrientation(0);
            w7.a6.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.s9 s9Var = new org.telegram.ui.s9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.h6.o6;
            org.telegram.ui.ActionBar.d6 d6Var = this.c;
            s9Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
            s9Var.setTextSize(1, 12.0f);
            s9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.h6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            pq pqVar = new pq(0, mutate);
            pqVar.setTranslateY(0.0f);
            pqVar.setTranslateX(0.0f);
            pqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(pqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            s9Var.setText(spannableStringBuilder);
            s9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            pq pqVar2 = new pq(0, mutate2);
            pqVar2.setScale(0.76f, 0.76f);
            pqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            pqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(pqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f.addView(s9Var, w7.y5.q(-2, -2, 16));
            this.f.addView(textView, w7.y5.q(-2, -2, 16));
            this.f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, w7.y5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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
        ai.w0 w0Var = this.d;
        w0Var.setPivotX(w0Var.getWidth() / 2.0f);
        w0Var.setPivotY(0.0f);
        w0Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        w0Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
