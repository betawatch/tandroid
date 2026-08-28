package ih;

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
import gh.oa;
import gh.x9;
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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.w60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p0 extends FrameLayout implements w60 {
    public final TextView A;
    public final TextView B;
    public final eq[] C;
    public final eq[] D;
    public int E;
    public ValueAnimator F;
    public u0 G;
    public final Paint H;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final x9 h;
    public final LinearLayout n;
    public final dh.u r;
    public final dh.u s;
    public CharSequence v;
    public final org.telegram.ui.Components.o9 w;
    public final org.telegram.ui.Components.z8 x;
    public final dh.u y;

    public p0(int i9, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.C = new eq[1];
        this.D = new eq[1];
        this.H = new Paint(1);
        this.c = i9;
        this.d = z10;
        x9 x9Var = new x9(this, context);
        this.h = x9Var;
        x9Var.setOrientation(0);
        addView(x9Var, g7.e6.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.w = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        x9Var.addView(o9Var, g7.e6.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        x9Var.addView(linearLayout, g7.e6.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, g7.e6.n(-2, -2));
        dh.u uVar = new dh.u(context);
        this.r = uVar;
        uVar.setTextColor(-1);
        uVar.setTextSize(1, 14.0f);
        uVar.setGravity(3);
        uVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(uVar, g7.e6.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        dh.u uVar2 = new dh.u(context);
        this.s = uVar2;
        uVar2.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.55f, -1));
        uVar2.setTextSize(1, 12.0f);
        uVar2.setGravity(5);
        linearLayout2.addView(uVar2, g7.e6.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        dh.u uVar3 = new dh.u(context);
        this.y = uVar3;
        uVar3.setTextColor(-1);
        uVar3.setTextSize(1, 14.0f);
        uVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.f6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(uVar3);
        linearLayout.addView(uVar3, g7.e6.n(-2, -2));
        TextView textView = new TextView(context);
        this.A = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        x9Var.addView(textView, g7.e6.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.B = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        x9Var.addView(textView2, g7.e6.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.w60
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.w60
    public final void b(Canvas canvas, float f10) {
        x9 x9Var = this.h;
        if (x9Var.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.f6.l1(f10 * 0.5f, -16777216);
            Paint paint = this.H;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x9Var.getX(), x9Var.getY(), x9Var.getX() + x9Var.getWidth(), x9Var.getY() + x9Var.getHeight());
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
        u0 u0Var = this.G;
        if (u0Var == null || this.e == null) {
            return;
        }
        this.E = u0Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 14));
        this.F.addListener(new ag.e(this, 11));
        this.F.setDuration(350L);
        this.F.setInterpolator(gr.h);
        this.F.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(u0 u0Var) {
        ValueAnimator valueAnimator;
        String str;
        boolean z10;
        int i9;
        CharSequence charSequence;
        this.G = u0Var;
        x9 x9Var = this.h;
        if ((u0Var == null || this.E != u0Var.a) && (valueAnimator = this.F) != null) {
            valueAnimator.cancel();
            this.F = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                x9Var.invalidate();
            }
        }
        long j10 = u0Var.c;
        org.telegram.ui.Components.o9 o9Var = this.w;
        org.telegram.ui.Components.z8 z8Var = this.x;
        int i10 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(u0Var.c));
            z8Var.r(user);
            o9Var.e(user, z8Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-u0Var.c));
            z8Var.q(chat);
            o9Var.e(chat, z8Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = u.b(i10, (int) u0Var.g, 3);
        int b11 = u.b(i10, (int) u0Var.g, 4);
        int b12 = u.b(i10, (int) u0Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z11 = u0Var.b;
        boolean z12 = this.d;
        dh.u uVar = this.y;
        if (!z11 || u0Var.g > 0) {
            if (u0Var.h > 0) {
                spannableStringBuilder.append((CharSequence) ("#" + u0Var.h));
                z10 = z12;
                eq eqVar = new eq(0, new l0(getContext(), u0Var.h));
                eqVar.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) "\u2009");
            } else {
                z10 = z12;
            }
            spannableStringBuilder.append(TextUtils.ellipsize(str, uVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
            if (z10) {
                i9 = 33;
                spannableStringBuilder.setSpan(new n0(), 0, spannableStringBuilder.length(), 33);
            } else {
                i9 = 33;
            }
            spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), i9);
            spannableStringBuilder.append((CharSequence) " ");
        } else {
            z10 = z12;
        }
        int b13 = u.b(i10, (int) u0Var.g, 1);
        int b14 = u.b(i10, (int) u0Var.g, 2);
        TLRPC.TL_textWithEntities tL_textWithEntities = u0Var.f;
        if (tL_textWithEntities != null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, uVar.getPaint());
            this.v = formatTextWithEntities;
            CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
            this.v = superTrim;
            if (superTrim.length() > b13 && !u0Var.b) {
                this.v = this.v.subSequence(0, b13);
            }
            CharSequence charSequence2 = this.v;
            if (charSequence2 instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence2;
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannable.getSpans(0, charSequence2.length(), org.telegram.ui.Components.t5.class);
                Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                if (t5VarArr.length + emojiSpanArr.length <= b14 || u0Var.b) {
                    charSequence = " ";
                } else {
                    ArrayList arrayList = new ArrayList();
                    charSequence = " ";
                    int i11 = 0;
                    while (i11 < t5VarArr.length) {
                        org.telegram.ui.Components.t5[] t5VarArr2 = t5VarArr;
                        int i12 = i11;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(t5VarArr2[i11])), Integer.valueOf(spannable.getSpanEnd(t5VarArr2[i12]))));
                        i11 = i12 + 1;
                        t5VarArr = t5VarArr2;
                    }
                    int i13 = 0;
                    while (i13 < emojiSpanArr.length) {
                        int i14 = i13;
                        arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i13])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i14]))));
                        i13 = i14 + 1;
                    }
                    Collections.sort(arrayList, new a5.e(26));
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
            if (!u0Var.b) {
                this.v = AndroidUtilities.replaceNewLines(this.v);
            }
            spannableStringBuilder.append(this.v);
        } else {
            charSequence = " ";
            this.v = "";
        }
        uVar.setText(Emoji.replaceEmoji(spannableStringBuilder, uVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        this.n.setVisibility((!u0Var.b || u0Var.g > 0) ? 8 : 0);
        long j11 = u0Var.g;
        TextView textView = this.B;
        TextView textView2 = this.A;
        if (j11 > 0) {
            boolean z13 = j11 >= 250;
            this.a = z13;
            x9Var.setWillNotDraw(!z13);
            x9Var.invalidate();
            uVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            int dp = AndroidUtilities.dp(13.0f);
            int i15 = org.telegram.ui.ActionBar.f6.a;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dp);
            this.e = gradientDrawable;
            x9Var.setBackground(gradientDrawable);
            Drawable drawable2 = this.e;
            float f10 = !z10 ? 0.65f : 1.0f;
            this.f = f10;
            drawable2.setAlpha((int) (f10 * 255.0f));
            if (u0Var.e) {
                textView.setVisibility(8);
                textView.setText("");
                textView2.setVisibility(0);
                textView2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.f6.l1(0.25f, b12)));
                textView2.setText(oa.U0(false, j3.r0.n(u0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.C, AndroidUtilities.dp(0.66f), 1.0f));
                eq eqVar2 = this.C[0];
                if (eqVar2 != null) {
                    eqVar2.draw = this.b;
                }
            } else {
                textView.setVisibility(0);
                textView.setText(oa.U0(false, j3.r0.n(u0Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.D, 0.0f, 1.0f));
                textView2.setVisibility(8);
                textView2.setText("");
            }
        } else if (u0Var.b) {
            this.a = false;
            x9Var.setWillNotDraw(true);
            ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(13.0f), -16777216);
            this.e = b02;
            x9Var.setBackground(b02);
            Drawable drawable3 = this.e;
            this.f = 0.5f;
            drawable3.setAlpha((int) 127.5f);
            uVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) DialogObject.getName(i10, u0Var.c));
            spannableStringBuilder2.append(charSequence);
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
            spannableStringBuilder2.setSpan(new m0(), length, spannableStringBuilder2.length(), 33);
            this.r.setText(spannableStringBuilder2);
            this.s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
            textView.setVisibility(8);
            textView2.setVisibility(8);
        } else {
            this.a = false;
            x9Var.setWillNotDraw(true);
            uVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.f6.l1(0.6f, -16777216));
            this.e = null;
            x9Var.setBackground(null);
            textView.setVisibility(8);
            textView2.setVisibility(8);
        }
        x9Var.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        eq eqVar = this.C[0];
        if (eqVar == null || eqVar.draw == z10) {
            return;
        }
        eqVar.draw = z10;
        this.A.invalidate();
    }
}
