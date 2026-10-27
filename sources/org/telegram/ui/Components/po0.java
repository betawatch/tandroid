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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class po0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.e2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int a;
    public final org.telegram.ui.ActionBar.r2 b;
    public final org.telegram.ui.ActionBar.u6 c;
    public final bi.r1 d;
    public final bi.h5 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public ch.b v;
    public fh.e w;
    public final Paint x;
    public final long y;

    public po0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.x = new Paint(1);
        this.a = i10;
        this.b = r2Var;
        this.c = u6Var;
        this.y = j10;
        bh.y0.o(u6Var);
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 21);
        this.d = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        r1Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        r1Var.setLayoutManager(c0Var);
        bi.h5 h5Var = new bi.h5(this, 3);
        this.e = h5Var;
        r1Var.setAdapter(h5Var);
        r1Var.setOverScrollMode(2);
        addView(r1Var, kb1.g(-1.0f, -1));
        r1Var.setOnItemClickListener(new ho0(this, i10, r2Var, 0));
        r1Var.setOnItemLongClickListener(new ag.k0(this, i10, r2Var, u6Var, 4));
        io0 io0Var = new io0();
        io0Var.o(ds.h);
        io0Var.n(320L);
        r1Var.setItemAnimator(io0Var);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.u6 u6Var) {
        CharSequence charSequence;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        boolean z10 = R != null && (R.getFragmentView() instanceof ww0) && ((ww0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        ?? h2Var = z10 ? new org.telegram.ui.ActionBar.h2(context, 0, u6Var) : new AlertDialog$Builder(context, 0, u6Var);
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        bh.x0 d = bh.x0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(d.f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new c6(d.g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        } else {
            charSequence = Emoji.replaceEmoji(d.f, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        org.telegram.ui.ActionBar.e2 e2Var = h2Var.a;
        e2Var.R = append;
        final jo0 jo0Var = new jo0(context, u6Var);
        jo0Var.setOnEditorActionListener(new ko0(jo0Var, i10, reaction, e2VarArr, currentFocus));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        jo0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        jo0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(jo0Var, i11, u6Var);
        org.telegram.ui.ActionBar.f7.m(jo0Var, 34, org.telegram.ui.ActionBar.y6.Xh, u6Var);
        jo0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        jo0Var.setSingleLine(true);
        jo0Var.setFocusable(true);
        jo0Var.setInputType(16384);
        org.telegram.ui.ActionBar.f7.G(jo0Var, org.telegram.ui.ActionBar.y6.k6, org.telegram.ui.ActionBar.y6.l6, org.telegram.ui.ActionBar.y6.p7, u6Var);
        jo0Var.setImeOptions(6);
        jo0Var.setBackgroundDrawable(null);
        jo0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout d10 = org.telegram.messenger.wh.d(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        d10.addView(textView, kb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        d10.addView(jo0Var, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        h2Var.o(d10);
        e2Var.a = AndroidUtilities.dp(292.0f);
        h2Var.k(LocaleController.getString(R.string.Save), new i2.z(jo0Var, i10, reaction, 9));
        h2Var.h(LocaleController.getString(R.string.Cancel), new rd0(12));
        if (z10) {
            H = e2Var;
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new z0(currentFocus, 8));
            final int i12 = 0;
            H.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.go0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            jo0 jo0Var2 = jo0Var;
                            jo0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var2);
                            break;
                        default:
                            jo0 jo0Var3 = jo0Var;
                            jo0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var3);
                            break;
                    }
                }
            });
            H.r(250L);
        } else {
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new z0(jo0Var, 9));
            final int i13 = 1;
            e2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.ui.Components.go0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            jo0 jo0Var2 = jo0Var;
                            jo0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var2);
                            break;
                        default:
                            jo0 jo0Var3 = jo0Var;
                            jo0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var3);
                            break;
                    }
                }
            });
            e2VarArr[0].show();
        }
        e2VarArr[0].j0 = false;
        jo0Var.setSelection(jo0Var.getText().length());
    }

    public final boolean a() {
        return !this.r.isEmpty() || this.s;
    }

    public abstract void b(boolean z10);

    public final void d(ch.b bVar, fh.e eVar) {
        this.v = bVar;
        this.w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            eh.d c10 = bVar.c(linearLayout, null, false);
            c10.v(gh.c.p(this.c));
            c10.y(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.A(AndroidUtilities.dp(5.0f));
            c10.w(AndroidUtilities.dp(4.0f));
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
            AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new di.e(5));
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

    public final void e(bh.x0 x0Var, boolean z10) {
        bi.h5 h5Var = this.e;
        if (x0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            h5Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i10 >= arrayList.size()) {
                return;
            }
            mo0 mo0Var = (mo0) arrayList.get(i10);
            long j10 = x0Var.h;
            bh.x0 x0Var2 = mo0Var.a;
            long j11 = x0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z10) {
                    f(x0Var2);
                }
                h5Var.l();
                this.d.v0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(bh.x0 x0Var);

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
        ofFloat.addUpdateListener(new f80(this, 16));
        this.G.setInterpolator(ds.h);
        this.G.setDuration(320L);
        this.G.addListener(new org.telegram.ui.lo(19, this, z10));
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
        long j10 = this.y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i11);
                bh.x0 d = bh.x0.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    String savedTagName = j10 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    mo0 mo0Var = new mo0();
                    mo0Var.a = d;
                    mo0Var.b = i13;
                    mo0Var.c = savedTagName;
                    mo0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (mo0Var.a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(mo0Var);
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
        bi.h5 h5Var = this.e;
        if (z10) {
            s4.p.c(new lo0(this), true).c(h5Var);
        } else {
            h5Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        this.s = !isPremium;
        if (isPremium) {
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new xa0(this, 25)).start();
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
            linearLayout2.setOnClickListener(new x80(this, 11));
            this.f.setOrientation(0);
            kb1.c(this.f, 0.03f, 1.25f);
            org.telegram.ui.w9 w9Var = new org.telegram.ui.w9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.y6.o6;
            org.telegram.ui.ActionBar.u6 u6Var = this.c;
            org.telegram.ui.ActionBar.f7.V(w9Var, i14, u6Var);
            w9Var.setTextSize(1, 12.0f);
            w9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.y6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            zq zqVar = new zq(0, mutate);
            zqVar.setTranslateY(0.0f);
            zqVar.setTranslateX(0.0f);
            zqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(zqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            w9Var.setText(spannableStringBuilder);
            w9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            org.telegram.ui.ActionBar.f7.V(textView, i14, u6Var);
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            zq zqVar2 = new zq(0, mutate2);
            zqVar2.setScale(0.76f, 0.76f);
            zqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            zqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(zqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f.addView(w9Var, kb1.u(-2, -2, 16));
            this.f.addView(textView, kb1.u(-2, -2, 16));
            this.f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f.setClipToPadding(false);
            addView(this.f, kb1.h(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
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
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.emojiLoaded);
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
        bi.r1 r1Var = this.d;
        r1Var.setPivotX(r1Var.getWidth() / 2.0f);
        r1Var.setPivotY(0.0f);
        r1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        r1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
