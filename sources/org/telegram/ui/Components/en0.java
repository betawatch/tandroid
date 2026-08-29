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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class en0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 D;
    public float A;
    public float B;
    public ValueAnimator C;
    public final int a;
    public final org.telegram.ui.ActionBar.o2 b;
    public final org.telegram.ui.ActionBar.c6 c;
    public final jh.e1 d;
    public final cg.g e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public lg.a v;
    public og.d w;
    public final Paint x;
    public final long y;

    public en0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.x = new Paint(1);
        this.a = i10;
        this.b = o2Var;
        this.c = c6Var;
        this.y = j10;
        kg.r0.o(c6Var);
        jh.e1 e1Var = new jh.e1(this, context, c6Var, 19);
        this.d = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        e1Var.setClipToPadding(false);
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        e1Var.setLayoutManager(j0Var);
        cg.g gVar = new cg.g(this, 3);
        this.e = gVar;
        e1Var.setAdapter(gVar);
        e1Var.setOverScrollMode(2);
        addView(e1Var, i7.f6.c(-1.0f, -1));
        e1Var.setOnItemClickListener(new cg.x1(this, i10, o2Var, 1));
        e1Var.setOnItemLongClickListener(new eg.b0(this, i10, o2Var, c6Var, 5));
        xm0 xm0Var = new xm0();
        xm0Var.o(jr.h);
        xm0Var.n(320L);
        e1Var.setItemAnimator(xm0Var);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof hv0) && ((hv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        ?? f2Var = z10 ? new org.telegram.ui.ActionBar.f2(context, 0, c6Var) : new AlertDialog$Builder(context, 0, c6Var);
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        kg.q0 d = kg.q0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new y5(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = Emoji.replaceEmoji(d.f, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        org.telegram.ui.ActionBar.c2 c2Var = f2Var.a;
        c2Var.N = append;
        final ym0 ym0Var = new ym0(context, c6Var);
        ym0Var.setOnEditorActionListener(new zm0(ym0Var, i10, reaction, c2VarArr, currentFocus));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        ym0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        ym0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        ym0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        ym0Var.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        ym0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        ym0Var.setSingleLine(true);
        ym0Var.setFocusable(true);
        ym0Var.setInputType(16384);
        ym0Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p7, c6Var));
        ym0Var.setImeOptions(6);
        ym0Var.setBackgroundDrawable(null);
        ym0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        g10.addView(textView, i7.f6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        g10.addView(ym0Var, i7.f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        f2Var.n(g10);
        c2Var.a = AndroidUtilities.dp(292.0f);
        f2Var.k(LocaleController.getString(R.string.Save), new e3.d(ym0Var, i10, reaction, 6));
        f2Var.h(LocaleController.getString(R.string.Cancel), new r2(26));
        if (z10) {
            D = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new d1(currentFocus, 7));
            final int i12 = 0;
            D.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.wm0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            ym0 ym0Var2 = ym0Var;
                            ym0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var2);
                            break;
                        default:
                            ym0 ym0Var3 = ym0Var;
                            ym0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var3);
                            break;
                    }
                }
            });
            D.q(250L);
        } else {
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new d1(ym0Var, 8));
            final int i13 = 1;
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.wm0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            ym0 ym0Var2 = ym0Var;
                            ym0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var2);
                            break;
                        default:
                            ym0 ym0Var3 = ym0Var;
                            ym0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var3);
                            break;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[0].d0 = false;
        ym0Var.setSelection(ym0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(lg.a aVar, og.d dVar) {
        this.v = aVar;
        this.w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            ng.d c3 = aVar.c(linearLayout, null, false);
            c3.n(pg.a.n(this.c));
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
            AndroidUtilities.forEachViews((RecyclerView) this.d, (f5.d) new l4.x0(18));
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

    public final void e(kg.q0 q0Var, boolean z10) {
        cg.g gVar = this.e;
        if (q0Var == null) {
            this.h = 0L;
            if (z10) {
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
            bn0 bn0Var = (bn0) arrayList.get(i10);
            long j10 = q0Var.h;
            kg.q0 q0Var2 = bn0Var.a;
            long j11 = q0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z10) {
                    f(q0Var2);
                }
                gVar.l();
                this.d.u0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(kg.q0 q0Var);

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
        ofFloat.addUpdateListener(new d70(this, 15));
        this.C.setInterpolator(jr.h);
        this.C.setDuration(320L);
        this.C.addListener(new z9(18, this, z10));
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
        int i10 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i11);
                kg.q0 d = kg.q0.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    String savedTagName = j10 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    bn0 bn0Var = new bn0();
                    bn0Var.a = d;
                    bn0Var.b = i13;
                    bn0Var.c = savedTagName;
                    bn0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (bn0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(bn0Var);
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
        cg.g gVar = this.e;
        if (z10) {
            f2.q.c(new an0(this), true).b(gVar);
        } else {
            gVar.l();
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        this.s = !isPremium;
        if (isPremium) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new xb0(this, 22)).start();
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
            linearLayout2.setOnClickListener(new u70(this, 13));
            this.f.setOrientation(0);
            i7.h6.b(this.f, 0.03f, 1.25f);
            org.telegram.ui.p9 p9Var = new org.telegram.ui.p9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.g6.o6;
            org.telegram.ui.ActionBar.c6 c6Var = this.c;
            p9Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
            p9Var.setTextSize(1, 12.0f);
            p9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.g6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            iq iqVar = new iq(0, mutate);
            iqVar.setTranslateY(0.0f);
            iqVar.setTranslateX(0.0f);
            iqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(iqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            p9Var.setText(spannableStringBuilder);
            p9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            iq iqVar2 = new iq(0, mutate2);
            iqVar2.setScale(0.76f, 0.76f);
            iqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            iqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(iqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f.addView(p9Var, i7.f6.q(-2, -2, 16));
            this.f.addView(textView, i7.f6.q(-2, -2, 16));
            this.f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, i7.f6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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

    public void setShown(float f9) {
        this.A = f9;
        jh.e1 e1Var = this.d;
        e1Var.setPivotX(e1Var.getWidth() / 2.0f);
        e1Var.setPivotY(0.0f);
        e1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f9));
        e1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f9));
        setAlpha(f9);
        invalidate();
    }
}
