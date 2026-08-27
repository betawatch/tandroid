package jh;

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
import hh.oa;
import hh.w9;
import java.util.ArrayList;
import java.util.Collections;
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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class n0 extends FrameLayout implements a70 {
    public final TextView A;
    public final TextView B;
    public final cq[] C;
    public final cq[] D;
    public int E;
    public ValueAnimator F;
    public s0 G;
    public final Paint H;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final w9 h;
    public final LinearLayout n;
    public final eh.s r;
    public final eh.s s;
    public CharSequence v;
    public final org.telegram.ui.Components.n9 w;
    public final org.telegram.ui.Components.y8 x;
    public final eh.s y;

    public n0(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.C = new cq[1];
        this.D = new cq[1];
        this.H = new Paint(1);
        this.c = i10;
        this.d = z10;
        w9 w9Var = new w9(this, context);
        this.h = w9Var;
        w9Var.setOrientation(0);
        addView(w9Var, h7.z5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.w = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        w9Var.addView(n9Var, h7.z5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        w9Var.addView(linearLayout, h7.z5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, h7.z5.n(-2, -2));
        eh.s sVar = new eh.s(context);
        this.r = sVar;
        sVar.setTextColor(-1);
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(3);
        sVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(sVar, h7.z5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        eh.s sVar2 = new eh.s(context);
        this.s = sVar2;
        sVar2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.55f, -1));
        sVar2.setTextSize(1, 12.0f);
        sVar2.setGravity(5);
        linearLayout2.addView(sVar2, h7.z5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        eh.s sVar3 = new eh.s(context);
        this.y = sVar3;
        sVar3.setTextColor(-1);
        sVar3.setTextSize(1, 14.0f);
        sVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(sVar3);
        linearLayout.addView(sVar3, h7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.A = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        w9Var.addView(textView, h7.z5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.B = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        w9Var.addView(textView2, h7.z5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.a70
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void b() {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        s0 s0Var = this.G;
        if (s0Var == null || this.e == null) {
            return;
        }
        this.E = s0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ag.u(this, 17));
        this.F.addListener(new ag.r1(this, 13));
        this.F.setDuration(350L);
        this.F.setInterpolator(er.h);
        this.F.start();
    }

    @Override // org.telegram.ui.Components.a70
    public final void c(Canvas canvas, float f10) {
        w9 w9Var = this.h;
        if (w9Var.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(f10 * 0.5f, -16777216);
            Paint paint = this.H;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(w9Var.getX(), w9Var.getY(), w9Var.getX() + w9Var.getWidth(), w9Var.getY() + w9Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(s0 s0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i10;
        CharSequence charSequence;
        this.G = s0Var;
        w9 w9Var = this.h;
        if ((s0Var == null || this.E != s0Var.a) && (valueAnimator = this.F) != null) {
            valueAnimator.cancel();
            this.F = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                w9Var.invalidate();
            }
        }
        long j10 = s0Var.c;
        org.telegram.ui.Components.n9 n9Var = this.w;
        org.telegram.ui.Components.y8 y8Var = this.x;
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(s0Var.c));
            y8Var.r(user);
            n9Var.e(user, y8Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-s0Var.c));
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = s.b(i11, (int) s0Var.g, 3);
        int b11 = s.b(i11, (int) s0Var.g, 4);
        int b12 = s.b(i11, (int) s0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z11 = s0Var.b;
        boolean z12 = this.d;
        eh.s sVar = this.y;
        if (!z11 || s0Var.g > 0) {
            if (s0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + s0Var.h));
                z10 = z12;
                cq cqVar = new cq(0, new j0(getContext(), s0Var.h));
                cqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(cqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z12;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, sVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i10 = 33;
                spannableStringBuilder.setSpan(new l0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i10 = 33;
            }
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z12;
        }
        int b13 = s.b(i11, (int) s0Var.g, 1);
        int b14 = s.b(i11, (int) s0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = s0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, sVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !s0Var.b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (charSequence2 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.t5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (t5VarArr.length + emojiSpanArr.length <= b14 || s0Var.b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i12 = 0;
                    while (i12 < t5VarArr.length) {
                        org.telegram.ui.Components.t5[] t5VarArr2 = t5VarArr;
                        int i13 = i12;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(t5VarArr2[i12])), Integer.valueOf(spannable.getSpanEnd(t5VarArr2[i13]))));
                        i12 = i13 + 1;
                        t5VarArr = t5VarArr2;
                    }
                    int i14 = 0;
                    while (i14 < emojiSpanArr.length) {
                        int i15 = i14;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i14])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i15]))));
                        i14 = i15 + 1;
                    }
                    Collections.sort(arrayList, new a5.f(27));
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
            if (!s0Var.b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        } else {
            charSequence = " ";
            this.v = "";
        }
        sVar.setText(Emoji.replaceEmoji(spannableStringBuilder, sVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        this.n.setVisibility((!s0Var.b || s0Var.g > 0) ? 8 : 0);
        long j11 = s0Var.g;
        TextView textView = this.B;
        TextView textView2 = this.A;
        if (j11 > 0) {
            boolean z13 = j11 >= 250;
            this.a = z13;
            w9Var.setWillNotDraw(!z13);
            w9Var.invalidate();
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i16 = org.telegram.ui.ActionBar.g6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            w9Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f10 = !z10 ? 0.65f : 1.0f;
            this.f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (s0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.l1(0.25f, b12)));
                textView2.setText(oa.U0(false, i0.a.m(s0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.C, AndroidUtilities.dp(0.66f), 1.0f));
                cq cqVar2 = this.C[0];
                if (cqVar2 != null) {
                    cqVar2.draw = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(oa.U0(false, i0.a.m(s0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.D, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (s0Var.b) {
            this.a = false;
            w9Var.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = b02;
            w9Var.setBackground(b02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i11, s0Var.c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new k0(), length, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            w9Var.setWillNotDraw(true);
            sVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.l1(0.6f, -16777216));
            this.e = null;
            w9Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        w9Var.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        cq cqVar = this.C[0];
        if (cqVar == null || cqVar.draw == z10) {
            return;
        }
        cqVar.draw = z10;
        this.A.invalidate();
    }
}
