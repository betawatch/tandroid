package ai;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v70;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class h1 extends FrameLayout implements v70 {
    public final TextView E;
    public final TextView F;
    public final oq[] G;
    public final oq[] H;
    public int I;
    public ValueAnimator J;
    public m1 K;
    public final Paint L;
    public boolean a;
    public boolean b;
    public final int c;
    public final boolean d;
    public Drawable e;
    public float f;
    public final d1 h;
    public final LinearLayout n;
    public final vh.o r;
    public final vh.o s;
    public CharSequence v;
    public final org.telegram.ui.Components.w9 w;
    public final org.telegram.ui.Components.h9 x;
    public final vh.o y;

    public h1(int i10, Context context, boolean z10) {
        super(context);
        this.a = false;
        this.b = true;
        this.f = 0.5f;
        this.G = new oq[1];
        this.H = new oq[1];
        this.L = new Paint(1);
        this.c = i10;
        this.d = z10;
        d1 d1Var = new d1(this, context);
        this.h = d1Var;
        d1Var.setOrientation(0);
        addView(d1Var, w7.y5.d(-2, -2.0f, 51, 0.0f, 0.5f, 0.0f, 0.5f));
        this.x = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        d1Var.addView(w9Var, w7.y5.p(22, 22, 0.0f, 51, 3, 2, 3, 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        d1Var.addView(linearLayout, w7.y5.p(-2, -2, 1.0f, 51, 4, 3, 7, 3));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout.addView(linearLayout2, w7.y5.n(-2, -2));
        vh.o oVar = new vh.o(context);
        this.r = oVar;
        oVar.setTextColor(-1);
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(3);
        oVar.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(oVar, w7.y5.p(-2, -2, 1.0f, 51, 0, 0, 16, 0));
        vh.o oVar2 = new vh.o(context);
        this.s = oVar2;
        oVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.55f, -1));
        oVar2.setTextSize(1, 12.0f);
        oVar2.setGravity(5);
        linearLayout2.addView(oVar2, w7.y5.p(-2, -2, 0.0f, 53, 0, 0, 0, 0));
        vh.o oVar3 = new vh.o(context);
        this.y = oVar3;
        oVar3.setTextColor(-1);
        oVar3.setTextSize(1, 14.0f);
        oVar3.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
        NotificationCenter.listenEmojiLoading(oVar3);
        linearLayout.addView(oVar3, w7.y5.n(-2, -2));
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
        textView.setVisibility(8);
        d1Var.addView(textView, w7.y5.p(-2, 16, 0.0f, 21, -3, 0, 6, 0));
        TextView textView2 = new TextView(context);
        this.F = textView2;
        textView2.setTextColor(-1);
        textView2.setAlpha(0.65f);
        textView2.setTextSize(1, 11.0f);
        textView2.setVisibility(8);
        d1Var.addView(textView2, w7.y5.p(-2, -2, 0.0f, 85, 0, 3, 10, 0));
    }

    @Override // org.telegram.ui.Components.v70
    public final void a(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // org.telegram.ui.Components.v70
    public final void b(Canvas canvas, float f7) {
        d1 d1Var = this.h;
        if (d1Var.getBackground() == null) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f7 * 0.5f, -16777216);
            Paint paint = this.L;
            paint.setColor(l1);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(d1Var.getX(), d1Var.getY(), d1Var.getX() + d1Var.getWidth(), d1Var.getY() + d1Var.getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), paint);
        }
        draw(canvas);
    }

    public final void c() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                this.h.invalidate();
            }
        }
        m1 m1Var = this.K;
        if (m1Var == null || this.e == null) {
            return;
        }
        this.I = m1Var.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.J = ofFloat;
        ofFloat.addUpdateListener(new a(this, 4));
        this.J.addListener(new b(this, 2));
        this.J.setDuration(350L);
        this.J.setInterpolator(qr.h);
        this.J.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(0.0f);
        setPivotY(getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void set(m1 m1Var) {
        ValueAnimator valueAnimator;
        String str;
        CharSequence charSequence;
        boolean z10;
        int i10;
        int i11;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        CharSequence charSequence2;
        long j3;
        this.K = m1Var;
        d1 d1Var = this.h;
        if ((m1Var == null || this.I != m1Var.a) && (valueAnimator = this.J) != null) {
            valueAnimator.cancel();
            this.J = null;
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setAlpha((int) (this.f * 255.0f));
                d1Var.invalidate();
            }
        }
        long j10 = m1Var.c;
        org.telegram.ui.Components.w9 w9Var = this.w;
        org.telegram.ui.Components.h9 h9Var = this.x;
        int i12 = this.c;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(m1Var.c));
            h9Var.r(user);
            w9Var.e(user, h9Var);
            str = UserObject.getForcedFirstName(user);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-m1Var.c));
            h9Var.q(chat);
            w9Var.e(chat, h9Var);
            str = chat == null ? "" : chat.title;
        }
        int b10 = g0.b(i12, (int) m1Var.g, 3);
        int b11 = g0.b(i12, (int) m1Var.g, 4);
        int b12 = g0.b(i12, (int) m1Var.g, 5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z11 = m1Var.b;
        boolean z12 = this.d;
        vh.o oVar = this.y;
        if (z11) {
            charSequence = "";
            if (m1Var.g <= 0) {
                z10 = z12;
                int b13 = g0.b(i12, (int) m1Var.g, 1);
                int b14 = g0.b(i12, (int) m1Var.g, 2);
                tL_textWithEntities = m1Var.f;
                if (tL_textWithEntities == null) {
                    CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities, false, oVar.getPaint());
                    this.v = formatTextWithEntities;
                    CharSequence superTrim = AndroidUtilities.superTrim(formatTextWithEntities);
                    this.v = superTrim;
                    if (superTrim.length() > b13 && !m1Var.b) {
                        this.v = this.v.subSequence(0, b13);
                    }
                    CharSequence charSequence3 = this.v;
                    if (charSequence3 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequence3;
                        org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) spannable.getSpans(0, charSequence3.length(), org.telegram.ui.Components.z5.class);
                        CharSequence charSequence4 = charSequence;
                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spannable.getSpans(0, this.v.length(), Emoji.EmojiSpan.class);
                        if (z5VarArr.length + emojiSpanArr.length <= b14 || m1Var.b) {
                            charSequence2 = " ";
                        } else {
                            ArrayList arrayList = new ArrayList();
                            charSequence2 = " ";
                            int i13 = 0;
                            while (i13 < z5VarArr.length) {
                                org.telegram.ui.Components.z5[] z5VarArr2 = z5VarArr;
                                int i14 = i13;
                                arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(z5VarArr2[i13])), Integer.valueOf(spannable.getSpanEnd(z5VarArr2[i14]))));
                                i13 = i14 + 1;
                                z5VarArr = z5VarArr2;
                            }
                            int i15 = 0;
                            while (i15 < emojiSpanArr.length) {
                                int i16 = i15;
                                arrayList.add(new Pair(Integer.valueOf(spannable.getSpanStart(emojiSpanArr[i15])), Integer.valueOf(spannable.getSpanEnd(emojiSpanArr[i16]))));
                                i15 = i16 + 1;
                            }
                            Collections.sort(arrayList, new a4.e(5));
                            if (!(this.v instanceof SpannableStringBuilder)) {
                                this.v = new SpannableStringBuilder(this.v);
                            }
                            for (int size = arrayList.size() - 1; size >= b14; size--) {
                                Pair pair = (Pair) arrayList.get(size);
                                ((SpannableStringBuilder) this.v).replace(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), charSequence4);
                            }
                        }
                        charSequence = charSequence4;
                    } else {
                        charSequence2 = " ";
                    }
                    if (!m1Var.b) {
                        this.v = AndroidUtilities.replaceNewLines(this.v);
                    }
                    spannableStringBuilder.append(this.v);
                } else {
                    charSequence2 = " ";
                    this.v = charSequence;
                }
                oVar.setText(Emoji.replaceEmoji(spannableStringBuilder, oVar.getPaint().getFontMetricsInt(), false));
                this.e = null;
                this.n.setVisibility((m1Var.b || m1Var.g > 0) ? 8 : 0);
                j3 = m1Var.g;
                TextView textView = this.F;
                TextView textView2 = this.E;
                if (j3 <= 0) {
                    boolean z13 = j3 >= 250;
                    this.a = z13;
                    d1Var.setWillNotDraw(!z13);
                    d1Var.invalidate();
                    oVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int dp = AndroidUtilities.dp(13.0f);
                    int i17 = org.telegram.ui.ActionBar.j6.a;
                    GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{b10, b11});
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dp);
                    this.e = gradientDrawable;
                    d1Var.setBackground(gradientDrawable);
                    Drawable drawable2 = this.e;
                    float f7 = !z10 ? 0.65f : 1.0f;
                    this.f = f7;
                    drawable2.setAlpha((int) (f7 * 255.0f));
                    if (m1Var.e) {
                        textView.setVisibility(8);
                        textView.setText(charSequence);
                        textView2.setVisibility(0);
                        textView2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.j6.l1(0.25f, b12)));
                        textView2.setText(yh.v7.U0(false, org.telegram.messenger.q.i(m1Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.G, AndroidUtilities.dp(0.66f), 1.0f));
                        oq oqVar = this.G[0];
                        if (oqVar != null) {
                            oqVar.draw = this.b;
                        }
                    } else {
                        textView.setVisibility(0);
                        textView.setText(yh.v7.U0(false, org.telegram.messenger.q.i(m1Var.g, ',', new StringBuilder("⭐️ ")), 0.75f, this.H, 0.0f, 1.0f));
                        textView2.setVisibility(8);
                        textView2.setText(charSequence);
                    }
                } else if (m1Var.b) {
                    this.a = false;
                    d1Var.setWillNotDraw(true);
                    ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(13.0f), -16777216);
                    this.e = b02;
                    d1Var.setBackground(b02);
                    Drawable drawable3 = this.e;
                    this.f = 0.5f;
                    drawable3.setAlpha((int) 127.5f);
                    oVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) DialogObject.getName(i12, m1Var.c));
                    spannableStringBuilder2.append(charSequence2);
                    int length = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LiveStoryBadge));
                    spannableStringBuilder2.setSpan(new e1(), length, spannableStringBuilder2.length(), 33);
                    this.r.setText(spannableStringBuilder2);
                    this.s.setText(LocaleController.getString(R.string.LiveStoryAdminRole));
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                } else {
                    this.a = false;
                    d1Var.setWillNotDraw(true);
                    oVar.setShadowLayer(AndroidUtilities.dp(2.5f), 0.0f, AndroidUtilities.dp(1.5f), org.telegram.ui.ActionBar.j6.l1(0.6f, -16777216));
                    this.e = null;
                    d1Var.setBackground(null);
                    textView.setVisibility(8);
                    textView2.setVisibility(8);
                }
                d1Var.invalidate();
            }
        } else {
            charSequence = "";
        }
        if (m1Var.h > 0) {
            spannableStringBuilder.append((CharSequence) ("#" + m1Var.h));
            z10 = z12;
            oq oqVar2 = new oq(0, new c1(getContext(), m1Var.h));
            oqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableStringBuilder.setSpan(oqVar2, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\u2009");
        } else {
            z10 = z12;
        }
        spannableStringBuilder.append(TextUtils.ellipsize(str, oVar.getPaint(), AndroidUtilities.dp(100.0f), TextUtils.TruncateAt.END));
        if (z10) {
            i10 = 0;
            i11 = 33;
            spannableStringBuilder.setSpan(new f1(), 0, spannableStringBuilder.length(), 33);
        } else {
            i10 = 0;
            i11 = 33;
        }
        spannableStringBuilder.setSpan(new u51(AndroidUtilities.bold()), i10, spannableStringBuilder.length(), i11);
        spannableStringBuilder.append((CharSequence) " ");
        int b132 = g0.b(i12, (int) m1Var.g, 1);
        int b142 = g0.b(i12, (int) m1Var.g, 2);
        tL_textWithEntities = m1Var.f;
        if (tL_textWithEntities == null) {
        }
        oVar.setText(Emoji.replaceEmoji(spannableStringBuilder, oVar.getPaint().getFontMetricsInt(), false));
        this.e = null;
        this.n.setVisibility((m1Var.b || m1Var.g > 0) ? 8 : 0);
        j3 = m1Var.g;
        TextView textView3 = this.F;
        TextView textView22 = this.E;
        if (j3 <= 0) {
        }
        d1Var.invalidate();
    }

    public void setDrawStar(boolean z10) {
        this.b = z10;
        oq oqVar = this.G[0];
        if (oqVar == null || oqVar.draw == z10) {
            return;
        }
        oqVar.draw = z10;
        this.E.invalidate();
    }
}
