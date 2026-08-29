package lh;

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
import jh.ia;
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
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n0 extends FrameLayout implements i70 {
    public final TextView A;
    public final TextView B;
    public final iq[] C;
    public final iq[] D;
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
    public final ag.v h;
    public final LinearLayout n;
    public final gh.s r;
    public final gh.s s;
    public CharSequence v;
    public final t9 w;
    public final org.telegram.ui.Components.e9 x;
    public final gh.s y;

    public n0(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.C = new iq[1];
        this.D = new iq[1];
        this.H = new Paint(1);
        this.c = i10;
        this.d = z10;
        ag.v vVar = new ag.v(this, context);
        this.h = vVar;
        vVar.setOrientation(0);
        addView(vVar, i7.f6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        t9 t9Var = new t9(context);
        this.w = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        vVar.addView(t9Var, i7.f6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        vVar.addView(linearLayout, i7.f6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, i7.f6.n(-2, -2));
        gh.s sVar = new gh.s(context);
        this.r = sVar;
        sVar.setTextColor(-1);
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(3);
        sVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(sVar, i7.f6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        gh.s sVar2 = new gh.s(context);
        this.s = sVar2;
        sVar2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.55f, -1));
        sVar2.setTextSize(1, 12.0f);
        sVar2.setGravity(5);
        linearLayout2.addView(sVar2, i7.f6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        gh.s sVar3 = new gh.s(context);
        this.y = sVar3;
        sVar3.setTextColor(-1);
        sVar3.setTextSize(1, 14.0f);
        sVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(sVar3);
        linearLayout.addView(sVar3, i7.f6.n(-2, -2));
        TextView textView = new TextView(context);
        this.A = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        vVar.addView(textView, i7.f6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.B = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        vVar.addView(textView2, i7.f6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.i70
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.i70
    public final void b(Canvas canvas, float f9) {
        ag.v vVar = this.h;
        if (vVar.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.g6.l1(f9 * 0.5f, -16777216);
            Paint paint = this.H;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(vVar.getX(), vVar.getY(), vVar.getX() + vVar.getWidth(), vVar.getY() + vVar.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
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
        ofFloat.addUpdateListener(new bg.q1(this, 23));
        this.F.addListener(new ag.m0(this, 16));
        this.F.setDuration(350L);
        this.F.setInterpolator(jr.h);
        this.F.start();
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
        ag.v vVar = this.h;
        if ((s0Var == null || this.E != s0Var.a) && (valueAnimator = this.F) != null) {
            valueAnimator.cancel();
            this.F = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                vVar.invalidate();
            }
        }
        long j10 = s0Var.c;
        t9 t9Var = this.w;
        org.telegram.ui.Components.e9 e9Var = this.x;
        int i11 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(s0Var.c));
            e9Var.r(user);
            t9Var.e(user, e9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-s0Var.c));
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = s.b(i11, (int) s0Var.g, 3);
        int b11 = s.b(i11, (int) s0Var.g, 4);
        int b12 = s.b(i11, (int) s0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z11 = s0Var.b;
        boolean z12 = this.d;
        gh.s sVar = this.y;
        if (!z11 || s0Var.g > 0) {
            if (s0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + s0Var.h));
                z10 = z12;
                iq iqVar = new iq(0, new j0(getContext(), s0Var.h));
                iqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(iqVar, 0, spannableStringBuilder.length(), 33);
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
            spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i10);
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
                org.telegram.ui.Components.y5[] y5VarArr = (org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.y5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (y5VarArr.length + emojiSpanArr.length <= b14 || s0Var.b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i12 = 0;
                    while (i12 < y5VarArr.length) {
                        org.telegram.ui.Components.y5[] y5VarArr2 = y5VarArr;
                        int i13 = i12;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(y5VarArr2[i12])), Integer.valueOf(spannable.getSpanEnd(y5VarArr2[i13]))));
                        i12 = i13 + 1;
                        y5VarArr = y5VarArr2;
                    }
                    int i14 = 0;
                    while (i14 < emojiSpanArr.length) {
                        int i15 = i14;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i14])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i15]))));
                        i14 = i15 + 1;
                    }
                    Collections.sort(arrayList, new c5.e(29));
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
            vVar.setWillNotDraw(!z13);
            vVar.invalidate();
            sVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i16 = org.telegram.ui.ActionBar.g6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            vVar.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f9 = !z10 ? 0.65f : 1.0f;
            this.f = f9;
            drawable2.setAlpha((int) (f9 * 255.0f));
            if (s0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.l1(0.25f, b12)));
                textView2.setText(ia.U0(false, j7.l1.m(s0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.C, AndroidUtilities.dp(0.66f), 1.0f));
                iq iqVar2 = this.C[0];
                if (iqVar2 != null) {
                    iqVar2.draw = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(ia.U0(false, j7.l1.m(s0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.D, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (s0Var.b) {
            this.a = false;
            vVar.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = b02;
            vVar.setBackground(b02);
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
            vVar.setWillNotDraw(true);
            sVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.g6.l1(0.6f, -16777216));
            this.e = null;
            vVar.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        vVar.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        iq iqVar = this.C[0];
        if (iqVar == null || iqVar.draw == z10) {
            return;
        }
        iqVar.draw = z10;
        this.A.invalidate();
    }
}
