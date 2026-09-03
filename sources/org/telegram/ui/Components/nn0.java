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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class nn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.d2 E;
    public float B;
    public float C;
    public ValueAnimator D;
    public final int a;
    public final org.telegram.ui.ActionBar.p2 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public final lh.e1 d;
    public final eg.g e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public ng.a v;
    public qg.d w;
    public final Paint x;
    public final long y;

    public nn0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.x = new Paint(1);
        this.a = i10;
        this.b = p2Var;
        this.c = f6Var;
        this.y = j10;
        mg.r0.o(f6Var);
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 18);
        this.d = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        e1Var.setClipToPadding(false);
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        e1Var.setLayoutManager(i0Var);
        eg.g gVar = new eg.g(this, 3);
        this.e = gVar;
        e1Var.setAdapter(gVar);
        e1Var.setOverScrollMode(2);
        addView(e1Var, k7.b6.c(-1.0f, -1));
        e1Var.setOnItemClickListener(new eg.w1(this, i10, p2Var, 1));
        e1Var.setOnItemLongClickListener(new gg.a0(this, i10, p2Var, f6Var, 5));
        gn0 gn0Var = new gn0();
        gn0Var.o(mr.h);
        gn0Var.n(320L);
        e1Var.setItemAnimator(gn0Var);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z4 = R != null && (R.getFragmentView() instanceof qv0) && ((qv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        ?? g2Var = z4 ? new org.telegram.ui.ActionBar.g2(context, 0, f6Var) : new AlertDialog$Builder(context, 0, f6Var);
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        mg.q0 d = mg.q0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new u5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = Emoji.replaceEmoji(d.f, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        org.telegram.ui.ActionBar.d2 d2Var = g2Var.a;
        d2Var.O = append;
        final hn0 hn0Var = new hn0(context, f6Var);
        hn0Var.setOnEditorActionListener(new in0(hn0Var, i10, reaction, d2VarArr, currentFocus));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        hn0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        hn0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        hn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        hn0Var.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        hn0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        hn0Var.setSingleLine(true);
        hn0Var.setFocusable(true);
        hn0Var.setInputType(16384);
        hn0Var.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p7, f6Var));
        hn0Var.setImeOptions(6);
        hn0Var.setBackgroundDrawable(null);
        hn0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(i11, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f10.addView(textView, k7.b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(hn0Var, k7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        g2Var.n(f10);
        d2Var.a = AndroidUtilities.dp(292.0f);
        g2Var.k(LocaleController.getString(R.string.Save), new e3.d(hn0Var, i10, reaction, 6));
        g2Var.h(LocaleController.getString(R.string.Cancel), new lh0(1));
        if (z4) {
            E = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new b1(currentFocus, 7));
            final int i12 = 0;
            E.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.fn0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            hn0 hn0Var2 = hn0Var;
                            hn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(hn0Var2);
                            break;
                        default:
                            hn0 hn0Var3 = hn0Var;
                            hn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(hn0Var3);
                            break;
                    }
                }
            });
            E.q(250L);
        } else {
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new b1(hn0Var, 8));
            final int i13 = 1;
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.fn0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            hn0 hn0Var2 = hn0Var;
                            hn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(hn0Var2);
                            break;
                        default:
                            hn0 hn0Var3 = hn0Var;
                            hn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(hn0Var3);
                            break;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[0].e0 = false;
        hn0Var.setSelection(hn0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z4);

    public final void d(ng.a aVar, qg.d dVar) {
        this.v = aVar;
        this.w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            pg.b c3 = aVar.c(linearLayout, null, false);
            c3.n(rg.b.o(this.c));
            c3.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c3.t(AndroidUtilities.dp(5.0f));
            c3.o(AndroidUtilities.dp(4.0f));
            linearLayout.setBackground(c3);
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
            AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new nh.e(19));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B < 0.5f) {
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

    public final void e(mg.q0 q0Var, boolean z4) {
        eg.g gVar = this.e;
        if (q0Var == null) {
            this.h = 0L;
            if (z4) {
                f(null);
            }
            gVar.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            kn0 kn0Var = (kn0) arrayList.get(i10);
            long j10 = q0Var.h;
            mg.q0 q0Var2 = kn0Var.a;
            long j11 = q0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z4) {
                    f(q0Var2);
                }
                gVar.l();
                this.d.u0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(mg.q0 q0Var);

    public final void g(boolean z4) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            this.D = null;
            valueAnimator.cancel();
        }
        if (z4) {
            setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, z4 ? 1.0f : 0.0f);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new j70(this, 15));
        this.D.setInterpolator(mr.h);
        this.D.setDuration(320L);
        this.D.addListener(new m00(10, this, z4));
        this.D.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.B);
    }

    public void h(boolean z4) {
        boolean z10;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i11 = 0;
            z10 = false;
            while (i11 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i11);
                mg.q0 d = mg.q0.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    String savedTagName = j10 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    kn0 kn0Var = new kn0();
                    kn0Var.a = d;
                    kn0Var.b = i13;
                    kn0Var.c = savedTagName;
                    kn0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (kn0Var.a.h == this.h) {
                        z10 = true;
                    }
                    arrayList2.add(kn0Var);
                    hashSet.add(Long.valueOf(d.h));
                }
                i11 = i12 + 1;
            }
        } else {
            z10 = false;
        }
        if (!z10 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        eg.g gVar = this.e;
        if (z4) {
            f2.q.c(new jn0(this), true).b(gVar);
        } else {
            gVar.l();
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        this.s = !isPremium;
        if (isPremium) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z4) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new dc0(this, 22)).start();
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
            linearLayout2.setOnClickListener(new a80(this, 13));
            this.f.setOrientation(0);
            k7.d6.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.v9 v9Var = new org.telegram.ui.v9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.j6.o6;
            org.telegram.ui.ActionBar.f6 f6Var = this.c;
            v9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            v9Var.setTextSize(1, 12.0f);
            v9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.j6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            lq lqVar = new lq(0, mutate);
            lqVar.setTranslateY(0.0f);
            lqVar.setTranslateX(0.0f);
            lqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(lqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            v9Var.setText(spannableStringBuilder);
            v9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            lq lqVar2 = new lq(0, mutate2);
            lqVar2.setScale(0.76f, 0.76f);
            lqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            lqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(lqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f.addView(v9Var, k7.b6.q(-2, -2, 16));
            this.f.addView(textView, k7.b6.q(-2, -2, 16));
            this.f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, k7.b6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z4) {
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

    public void setShown(float f10) {
        this.B = f10;
        lh.e1 e1Var = this.d;
        e1Var.setPivotX(e1Var.getWidth() / 2.0f);
        e1Var.setPivotY(0.0f);
        e1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        e1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
