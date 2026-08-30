package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o0 extends FrameLayout implements n70 {
    public final TextView B;
    public final TextView C;
    public final mq[] D;
    public final mq[] E;
    public int F;
    public ValueAnimator G;
    public t0 H;
    public final Paint I;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final cg.u h;
    public final LinearLayout n;
    public final ih.s r;
    public final ih.s s;
    public CharSequence v;
    public final org.telegram.ui.Components.p9 w;
    public final org.telegram.ui.Components.z8 x;
    public final ih.s y;

    public o0(int i10, Context context, boolean z4) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.D = new mq[1];
        this.E = new mq[1];
        this.I = new Paint(1);
        this.c = i10;
        this.d = z4;
        cg.u uVar = new cg.u(this, context);
        this.h = uVar;
        uVar.setOrientation(0);
        addView(uVar, k7.b6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.w = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        uVar.addView(p9Var, k7.b6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        uVar.addView(linearLayout, k7.b6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, k7.b6.n(-2, -2));
        ih.s sVar = new ih.s(context);
        this.r = sVar;
        sVar.setTextColor(-1);
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(3);
        sVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(sVar, k7.b6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        ih.s sVar2 = new ih.s(context);
        this.s = sVar2;
        sVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.55f, -1));
        sVar2.setTextSize(1, 12.0f);
        sVar2.setGravity(5);
        linearLayout2.addView(sVar2, k7.b6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        ih.s sVar3 = new ih.s(context);
        this.y = sVar3;
        sVar3.setTextColor(-1);
        sVar3.setTextSize(1, 14.0f);
        sVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(sVar3);
        linearLayout.addView(sVar3, k7.b6.n(-2, -2));
        TextView textView = new TextView(context);
        this.B = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        uVar.addView(textView, k7.b6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.C = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        uVar.addView(textView2, k7.b6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.n70
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.n70
    public final void b(Canvas canvas, float f10) {
        cg.u uVar = this.h;
        if (uVar.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f10 * 0.5f, -16777216);
            Paint paint = this.I;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(uVar.getX(), uVar.getY(), uVar.getX() + uVar.getWidth(), uVar.getY() + uVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        t0 t0Var = this.H;
        if (t0Var == null || this.e == null) {
            return;
        }
        this.F = t0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new dg.o1(this, 23));
        this.G.addListener(new cg.l0(this, 17));
        this.G.setDuration(350L);
        this.G.setInterpolator(nr.h);
        this.G.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(t0 t0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z4;
        int i10;
        CharSequence charSequence;
        this.H = t0Var;
        cg.u uVar = this.h;
        if ((t0Var == null || this.F != t0Var.a) && (valueAnimator = this.G) != null) {
            valueAnimator.cancel();
            this.G = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                uVar.invalidate();
            }
        }
        long j10 = t0Var.c;
        org.telegram.ui.Components.p9 p9Var = this.w;
        org.telegram.ui.Components.z8 z8Var = this.x;
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(t0Var.c));
            z8Var.r(user);
            p9Var.e(user, z8Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-t0Var.c));
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = t.b(i11, (int) t0Var.g, 3);
        int b11 = t.b(i11, (int) t0Var.g, 4);
        int b12 = t.b(i11, (int) t0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z10 = t0Var.b;
        boolean z11 = this.d;
        ih.s sVar = this.y;
        if (!z10 || t0Var.g > 0) {
            if (t0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + t0Var.h));
                z4 = z11;
                mq mqVar = new mq(0, new k0(getContext(), t0Var.h));
                mqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(mqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z4 = z11;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, sVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z4) {
                i10 = 33;
                spannableStringBuilder.setSpan(new m0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z4 = z11;
        }
        int b13 = t.b(i11, (int) t0Var.g, 1);
        int b14 = t.b(i11, (int) t0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = t0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, sVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !t0Var.b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (charSequence2 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.u5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (u5VarArr.length + emojiSpanArr.length <= b14 || t0Var.b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i12 = 0;
                    while (i12 < u5VarArr.length) {
                        org.telegram.ui.Components.u5[] u5VarArr2 = u5VarArr;
                        int i13 = i12;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(u5VarArr2[i12])), Integer.valueOf(spannable.getSpanEnd(u5VarArr2[i13]))));
                        i12 = i13 + 1;
                        u5VarArr = u5VarArr2;
                    }
                    int i14 = 0;
                    while (i14 < emojiSpanArr.length) {
                        int i15 = i14;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i14])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i15]))));
                        i14 = i15 + 1;
                    }
                    Collections.sort(arrayList, new e5.f(29));
                    if (!(this.v instanceof SpannableStringBuilder)) {
                        this.v = new SpannableStringBuilder(this.v);
                    }
                    for (int size = arrayList.size() - 1; size >= b14; size--) {
                        Pair pair = (Pair) arrayList.get(size);
                        ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), (CharSequence) "");
                    }
                }
            } else {
                charSequence = " ";
            }
            if (!t0Var.b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        } else {
            charSequence = " ";
            this.v = "";
        }
        sVar.setText(Emoji.replaceEmoji(spannableStringBuilder, sVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        this.n.setVisibility((!t0Var.b || t0Var.g > 0) ? 8 : 0);
        long j11 = t0Var.g;
        TextView textView = this.C;
        TextView textView2 = this.B;
        if (j11 > 0) {
            boolean z12 = j11 >= 250;
            this.a = z12;
            uVar.setWillNotDraw(!z12);
            uVar.invalidate();
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i16 = org.telegram.ui.ActionBar.j6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            uVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f10 = !z4 ? 0.65f : 1.0f;
            this.f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (t0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, b12)));
                textView2.setText(ja.U0(false, kh.a2.l(t0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.D, AndroidUtilities.dp(0.66f), 1.0f));
                mq mqVar2 = this.D[0];
                if (mqVar2 != null) {
                    mqVar2.draw = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(ja.U0(false, kh.a2.l(t0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.E, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (t0Var.b) {
            this.a = false;
            uVar.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = b02;
            uVar.setBackground(b02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i11, t0Var.c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new l0(), length, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            uVar.setWillNotDraw(true);
            sVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
            this.e = null;
            uVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        uVar.invalidate();
    }

    public void setDrawStar(boolean z4) {
        this.b = z4;
        mq mqVar = this.D[0];
        if (mqVar == null || mqVar.draw == z4) {
            return;
        }
        mqVar.draw = z4;
        this.B.invalidate();
    }
}
